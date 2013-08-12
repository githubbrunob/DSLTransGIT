/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mprolog.impl;

import mprolog.*;

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
public class MprologFactoryImpl extends EFactoryImpl implements MprologFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MprologFactory init() {
		try {
			MprologFactory theMprologFactory = (MprologFactory)EPackage.Registry.INSTANCE.getEFactory("mprolog"); 
			if (theMprologFactory != null) {
				return theMprologFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MprologFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MprologFactoryImpl() {
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
			case MprologPackage.MODEL: return createModel();
			case MprologPackage.CLAUSE: return createClause();
			case MprologPackage.HEAD: return createHead();
			case MprologPackage.BODY: return createBody();
			case MprologPackage.VARIABLE: return createVariable();
			case MprologPackage.FUNCTOR: return createFunctor();
			case MprologPackage.QUOTED_ATOM: return createQuotedAtom();
			case MprologPackage.LIST: return createList();
			case MprologPackage.INFIX_EXPRESSION: return createInfixExpression();
			case MprologPackage.OPERATOR: return createOperator();
			case MprologPackage.PARENTHESIS: return createParenthesis();
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
	public Parenthesis createParenthesis() {
		ParenthesisImpl parenthesis = new ParenthesisImpl();
		return parenthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MprologPackage getMprologPackage() {
		return (MprologPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MprologPackage getPackage() {
		return MprologPackage.eINSTANCE;
	}

} //MprologFactoryImpl
