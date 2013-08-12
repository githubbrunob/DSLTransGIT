/**
 * <copyright>
 * </copyright>
 *
 * $Id: SATELFactoryImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.impl;

import SATEL.*;

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
public class SATELFactoryImpl extends EFactoryImpl implements SATELFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SATELFactory init() {
		try {
			SATELFactory theSATELFactory = (SATELFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL"); 
			if (theSATELFactory != null) {
				return theSATELFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SATELFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SATELFactoryImpl() {
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
			case SATELPackage.MODEL: return createModel();
			case SATELPackage.TEST_INTENTION_MODULE: return createTestIntentionModule();
			case SATELPackage.TEST_INTENTION_INTERFACE: return createTestIntentionInterface();
			case SATELPackage.INTENTION_DEC: return createIntentionDec();
			case SATELPackage.TEST_INTENTION_BODY: return createTestIntentionBody();
			case SATELPackage.AXIOM_DECLARATION: return createAxiomDeclaration();
			case SATELPackage.AXIOM: return createAxiom();
			case SATELPackage.INCLUSION: return createInclusion();
			case SATELPackage.CONDITION: return createCondition();
			case SATELPackage.UNIFORMITY_LIST: return createUniformityList();
			case SATELPackage.SUBUNIFORMITY_LIST: return createSubuniformityList();
			case SATELPackage.CONDITION_BODY: return createConditionBody();
			case SATELPackage.NAME_LIST: return createNameList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIntentionModule createTestIntentionModule() {
		TestIntentionModuleImpl testIntentionModule = new TestIntentionModuleImpl();
		return testIntentionModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIntentionInterface createTestIntentionInterface() {
		TestIntentionInterfaceImpl testIntentionInterface = new TestIntentionInterfaceImpl();
		return testIntentionInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionDec createIntentionDec() {
		IntentionDecImpl intentionDec = new IntentionDecImpl();
		return intentionDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestIntentionBody createTestIntentionBody() {
		TestIntentionBodyImpl testIntentionBody = new TestIntentionBodyImpl();
		return testIntentionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxiomDeclaration createAxiomDeclaration() {
		AxiomDeclarationImpl axiomDeclaration = new AxiomDeclarationImpl();
		return axiomDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axiom createAxiom() {
		AxiomImpl axiom = new AxiomImpl();
		return axiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inclusion createInclusion() {
		InclusionImpl inclusion = new InclusionImpl();
		return inclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformityList createUniformityList() {
		UniformityListImpl uniformityList = new UniformityListImpl();
		return uniformityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubuniformityList createSubuniformityList() {
		SubuniformityListImpl subuniformityList = new SubuniformityListImpl();
		return subuniformityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionBody createConditionBody() {
		ConditionBodyImpl conditionBody = new ConditionBodyImpl();
		return conditionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameList createNameList() {
		NameListImpl nameList = new NameListImpl();
		return nameList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SATELPackage getSATELPackage() {
		return (SATELPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SATELPackage getPackage() {
		return SATELPackage.eINSTANCE;
	}

} //SATELFactoryImpl
