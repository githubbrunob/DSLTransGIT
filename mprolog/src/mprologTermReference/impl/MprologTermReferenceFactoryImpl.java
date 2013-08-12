/**
 * <copyright>
 * </copyright>
 *
 * $Id: MprologTermReferenceFactoryImpl.java,v 1.1 2011/12/28 01:45:32 bfb Exp $
 */
package mprologTermReference.impl;

import mprologTermReference.*;

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
public class MprologTermReferenceFactoryImpl extends EFactoryImpl implements MprologTermReferenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MprologTermReferenceFactory init() {
		try {
			MprologTermReferenceFactory theMprologTermReferenceFactory = (MprologTermReferenceFactory)EPackage.Registry.INSTANCE.getEFactory("mprologTermReference"); 
			if (theMprologTermReferenceFactory != null) {
				return theMprologTermReferenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MprologTermReferenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MprologTermReferenceFactoryImpl() {
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
			case MprologTermReferencePackage.MODEL: return createModel();
			case MprologTermReferencePackage.CLAUSE: return createClause();
			case MprologTermReferencePackage.HEAD: return createHead();
			case MprologTermReferencePackage.BODY: return createBody();
			case MprologTermReferencePackage.VARIABLE: return createVariable();
			case MprologTermReferencePackage.FUNCTOR: return createFunctor();
			case MprologTermReferencePackage.QUOTED_ATOM: return createQuotedAtom();
			case MprologTermReferencePackage.LIST: return createList();
			case MprologTermReferencePackage.INFIX_EXPRESSION: return createInfixExpression();
			case MprologTermReferencePackage.OPERATOR: return createOperator();
			case MprologTermReferencePackage.FUNCTOR_REFERENCE: return createFunctorReference();
			case MprologTermReferencePackage.VARIABLE_REFERENCE: return createVariableReference();
			case MprologTermReferencePackage.PARENTHESIS: return createParenthesis();
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
	public Clause createClause() {
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Head createHead() {
		HeadImpl head = new HeadImpl();
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functor createFunctor() {
		FunctorImpl functor = new FunctorImpl();
		return functor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuotedAtom createQuotedAtom() {
		QuotedAtomImpl quotedAtom = new QuotedAtomImpl();
		return quotedAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixExpression createInfixExpression() {
		InfixExpressionImpl infixExpression = new InfixExpressionImpl();
		return infixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctorReference createFunctorReference() {
		FunctorReferenceImpl functorReference = new FunctorReferenceImpl();
		return functorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableReference createVariableReference() {
		VariableReferenceImpl variableReference = new VariableReferenceImpl();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parenthesis createParenthesis() {
		ParenthesisImpl parenthesis = new ParenthesisImpl();
		return parenthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MprologTermReferencePackage getMprologTermReferencePackage() {
		return (MprologTermReferencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MprologTermReferencePackage getPackage() {
		return MprologTermReferencePackage.eINSTANCE;
	}

} //MprologTermReferenceFactoryImpl
