/**
 * <copyright>
 * </copyright>
 *
 * $Id: MprologTermReferenceAdapterFactory.java,v 1.1 2011/12/28 01:45:32 bfb Exp $
 */
package mprologTermReference.util;

import mprologTermReference.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mprologTermReference.MprologTermReferencePackage
 * @generated
 */
public class MprologTermReferenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MprologTermReferencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MprologTermReferenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MprologTermReferencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MprologTermReferenceSwitch<Adapter> modelSwitch =
		new MprologTermReferenceSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseClause(Clause object) {
				return createClauseAdapter();
			}
			@Override
			public Adapter caseHead(Head object) {
				return createHeadAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseBody(Body object) {
				return createBodyAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseFunctor(Functor object) {
				return createFunctorAdapter();
			}
			@Override
			public Adapter caseQuotedAtom(QuotedAtom object) {
				return createQuotedAtomAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseInfixExpression(InfixExpression object) {
				return createInfixExpressionAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseTermReference(TermReference object) {
				return createTermReferenceAdapter();
			}
			@Override
			public Adapter caseFunctorReference(FunctorReference object) {
				return createFunctorReferenceAdapter();
			}
			@Override
			public Adapter caseVariableReference(VariableReference object) {
				return createVariableReferenceAdapter();
			}
			@Override
			public Adapter caseParenthesis(Parenthesis object) {
				return createParenthesisAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.Clause
	 * @generated
	 */
	public Adapter createClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.Head
	 * @generated
	 */
	public Adapter createHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.Body
	 * @generated
	 */
	public Adapter createBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.Functor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.Functor
	 * @generated
	 */
	public Adapter createFunctorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.QuotedAtom <em>Quoted Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.QuotedAtom
	 * @generated
	 */
	public Adapter createQuotedAtomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.List
	 * @generated
	 */
	public Adapter createListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.InfixExpression <em>Infix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.InfixExpression
	 * @generated
	 */
	public Adapter createInfixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.TermReference <em>Term Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.TermReference
	 * @generated
	 */
	public Adapter createTermReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.FunctorReference <em>Functor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.FunctorReference
	 * @generated
	 */
	public Adapter createFunctorReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.VariableReference
	 * @generated
	 */
	public Adapter createVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mprologTermReference.Parenthesis <em>Parenthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mprologTermReference.Parenthesis
	 * @generated
	 */
	public Adapter createParenthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MprologTermReferenceAdapterFactory
