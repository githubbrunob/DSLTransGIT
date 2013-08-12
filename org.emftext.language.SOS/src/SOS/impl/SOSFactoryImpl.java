/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.impl;

import SOS.*;

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
public class SOSFactoryImpl extends EFactoryImpl implements SOSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SOSFactory init() {
		try {
			SOSFactory theSOSFactory = (SOSFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftext.org/language/SOS"); 
			if (theSOSFactory != null) {
				return theSOSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SOSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOSFactoryImpl() {
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
			case SOSPackage.SEMANTICS: return createSemantics();
			case SOSPackage.RULE: return createRule();
			case SOSPackage.PREMISSE_LIST: return createPremisseList();
			case SOSPackage.CONCLUSION: return createConclusion();
			case SOSPackage.TRANSITION: return createTransition();
			case SOSPackage.TYPE_JUDMENT: return createTypeJudment();
			case SOSPackage.ALGEBRAIC_CONDITION: return createAlgebraicCondition();
			case SOSPackage.ALGEBRAIC_CONDITION_LIST: return createAlgebraicConditionList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semantics createSemantics() {
		SemanticsImpl semantics = new SemanticsImpl();
		return semantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PremisseList createPremisseList() {
		PremisseListImpl premisseList = new PremisseListImpl();
		return premisseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conclusion createConclusion() {
		ConclusionImpl conclusion = new ConclusionImpl();
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeJudment createTypeJudment() {
		TypeJudmentImpl typeJudment = new TypeJudmentImpl();
		return typeJudment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicCondition createAlgebraicCondition() {
		AlgebraicConditionImpl algebraicCondition = new AlgebraicConditionImpl();
		return algebraicCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicConditionList createAlgebraicConditionList() {
		AlgebraicConditionListImpl algebraicConditionList = new AlgebraicConditionListImpl();
		return algebraicConditionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOSPackage getSOSPackage() {
		return (SOSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SOSPackage getPackage() {
		return SOSPackage.eINSTANCE;
	}

} //SOSFactoryImpl
