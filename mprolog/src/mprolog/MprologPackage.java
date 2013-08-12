/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mprolog;

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
 * @see mprolog.MprologFactory
 * @model kind="package"
 * @generated
 */
public interface MprologPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mprolog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mprolog";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mprolog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MprologPackage eINSTANCE = mprolog.impl.MprologPackageImpl.init();

	/**
	 * The meta object id for the '{@link mprolog.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.ModelImpl
	 * @see mprolog.impl.MprologPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_CLAUSE = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mprolog.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.ClauseImpl
	 * @see mprolog.impl.MprologPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>Owned Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__OWNED_HEAD = 0;

	/**
	 * The feature id for the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__OWNED_BODY = 1;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mprolog.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.HeadImpl
	 * @see mprolog.impl.MprologPackageImpl#getHead()
	 * @generated
	 */
	int HEAD = 2;

	/**
	 * The feature id for the '<em><b>Owned Functor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD__OWNED_FUNCTOR = 0;

	/**
	 * The number of structural features of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mprolog.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.TermImpl
	 * @see mprolog.impl.MprologPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 3;

	/**
	 * The feature id for the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NEXT_TERM = 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mprolog.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.BodyImpl
	 * @see mprolog.impl.MprologPackageImpl#getBody()
	 * @generated
	 */
	int BODY = 4;

	/**
	 * The feature id for the '<em><b>Owned Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__OWNED_TERM = 0;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mprolog.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.VariableImpl
	 * @see mprolog.impl.MprologPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NEXT_TERM = TERM__NEXT_TERM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mprolog.impl.FunctorImpl <em>Functor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.FunctorImpl
	 * @see mprolog.impl.MprologPackageImpl#getFunctor()
	 * @generated
	 */
	int FUNCTOR = 6;

	/**
	 * The feature id for the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR__NEXT_TERM = TERM__NEXT_TERM;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR__TEXT = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR__OWNED_TERM = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Functor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mprolog.impl.QuotedAtomImpl <em>Quoted Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.QuotedAtomImpl
	 * @see mprolog.impl.MprologPackageImpl#getQuotedAtom()
	 * @generated
	 */
	int QUOTED_ATOM = 7;

	/**
	 * The feature id for the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTED_ATOM__NEXT_TERM = TERM__NEXT_TERM;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTED_ATOM__TEXT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quoted Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTED_ATOM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link mprolog.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.ListImpl
	 * @see mprolog.impl.MprologPackageImpl#getList()
	 * @generated
	 */
	int LIST = 8;

	/**
	 * The feature id for the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NEXT_TERM = TERM__NEXT_TERM;

	/**
	 * The feature id for the '<em><b>Owned Head Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OWNED_HEAD_TERMS = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Tail Terms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__OWNED_TAIL_TERMS = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mprolog.impl.InfixExpressionImpl <em>Infix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.InfixExpressionImpl
	 * @see mprolog.impl.MprologPackageImpl#getInfixExpression()
	 * @generated
	 */
	int INFIX_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__NEXT_TERM = TERM__NEXT_TERM;

	/**
	 * The feature id for the '<em><b>Left Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__LEFT_TERM = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__RIGHT_TERM = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__OWNED_OPERATOR = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Infix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_FEATURE_COUNT = TERM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mprolog.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.OperatorImpl
	 * @see mprolog.impl.MprologPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 10;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__SYMBOL = 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mprolog.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprolog.impl.ParenthesisImpl
	 * @see mprolog.impl.MprologPackageImpl#getParenthesis()
	 * @generated
	 */
	int PARENTHESIS = 11;

	/**
	 * The feature id for the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS__NEXT_TERM = TERM__NEXT_TERM;

	/**
	 * The feature id for the '<em><b>Owned Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS__OWNED_TERM = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parenthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link mprolog.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see mprolog.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link mprolog.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mprolog.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mprolog.Model#getOwnedClause <em>Owned Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Clause</em>'.
	 * @see mprolog.Model#getOwnedClause()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OwnedClause();

	/**
	 * Returns the meta object for class '{@link mprolog.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see mprolog.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.Clause#getOwnedHead <em>Owned Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Head</em>'.
	 * @see mprolog.Clause#getOwnedHead()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_OwnedHead();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.Clause#getOwnedBody <em>Owned Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Body</em>'.
	 * @see mprolog.Clause#getOwnedBody()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_OwnedBody();

	/**
	 * Returns the meta object for class '{@link mprolog.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see mprolog.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.Head#getOwnedFunctor <em>Owned Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Functor</em>'.
	 * @see mprolog.Head#getOwnedFunctor()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_OwnedFunctor();

	/**
	 * Returns the meta object for class '{@link mprolog.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see mprolog.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.Term#getNextTerm <em>Next Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Term</em>'.
	 * @see mprolog.Term#getNextTerm()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_NextTerm();

	/**
	 * Returns the meta object for class '{@link mprolog.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see mprolog.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.Body#getOwnedTerm <em>Owned Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Term</em>'.
	 * @see mprolog.Body#getOwnedTerm()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_OwnedTerm();

	/**
	 * Returns the meta object for class '{@link mprolog.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see mprolog.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link mprolog.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mprolog.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link mprolog.Functor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functor</em>'.
	 * @see mprolog.Functor
	 * @generated
	 */
	EClass getFunctor();

	/**
	 * Returns the meta object for the attribute '{@link mprolog.Functor#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see mprolog.Functor#getText()
	 * @see #getFunctor()
	 * @generated
	 */
	EAttribute getFunctor_Text();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.Functor#getOwnedTerm <em>Owned Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Term</em>'.
	 * @see mprolog.Functor#getOwnedTerm()
	 * @see #getFunctor()
	 * @generated
	 */
	EReference getFunctor_OwnedTerm();

	/**
	 * Returns the meta object for class '{@link mprolog.QuotedAtom <em>Quoted Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quoted Atom</em>'.
	 * @see mprolog.QuotedAtom
	 * @generated
	 */
	EClass getQuotedAtom();

	/**
	 * Returns the meta object for the attribute '{@link mprolog.QuotedAtom#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see mprolog.QuotedAtom#getText()
	 * @see #getQuotedAtom()
	 * @generated
	 */
	EAttribute getQuotedAtom_Text();

	/**
	 * Returns the meta object for class '{@link mprolog.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see mprolog.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.List#getOwnedHeadTerms <em>Owned Head Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Head Terms</em>'.
	 * @see mprolog.List#getOwnedHeadTerms()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_OwnedHeadTerms();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.List#getOwnedTailTerms <em>Owned Tail Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Tail Terms</em>'.
	 * @see mprolog.List#getOwnedTailTerms()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_OwnedTailTerms();

	/**
	 * Returns the meta object for class '{@link mprolog.InfixExpression <em>Infix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infix Expression</em>'.
	 * @see mprolog.InfixExpression
	 * @generated
	 */
	EClass getInfixExpression();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.InfixExpression#getLeftTerm <em>Left Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Term</em>'.
	 * @see mprolog.InfixExpression#getLeftTerm()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_LeftTerm();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.InfixExpression#getRightTerm <em>Right Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Term</em>'.
	 * @see mprolog.InfixExpression#getRightTerm()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_RightTerm();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.InfixExpression#getOwnedOperator <em>Owned Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Operator</em>'.
	 * @see mprolog.InfixExpression#getOwnedOperator()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_OwnedOperator();

	/**
	 * Returns the meta object for class '{@link mprolog.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see mprolog.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the attribute '{@link mprolog.Operator#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see mprolog.Operator#getSymbol()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Symbol();

	/**
	 * Returns the meta object for class '{@link mprolog.Parenthesis <em>Parenthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesis</em>'.
	 * @see mprolog.Parenthesis
	 * @generated
	 */
	EClass getParenthesis();

	/**
	 * Returns the meta object for the containment reference '{@link mprolog.Parenthesis#getOwnedTerm <em>Owned Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Term</em>'.
	 * @see mprolog.Parenthesis#getOwnedTerm()
	 * @see #getParenthesis()
	 * @generated
	 */
	EReference getParenthesis_OwnedTerm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MprologFactory getMprologFactory();

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
		 * The meta object literal for the '{@link mprolog.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.ModelImpl
		 * @see mprolog.impl.MprologPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OWNED_CLAUSE = eINSTANCE.getModel_OwnedClause();

		/**
		 * The meta object literal for the '{@link mprolog.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.ClauseImpl
		 * @see mprolog.impl.MprologPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Owned Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__OWNED_HEAD = eINSTANCE.getClause_OwnedHead();

		/**
		 * The meta object literal for the '<em><b>Owned Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__OWNED_BODY = eINSTANCE.getClause_OwnedBody();

		/**
		 * The meta object literal for the '{@link mprolog.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.HeadImpl
		 * @see mprolog.impl.MprologPackageImpl#getHead()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHead();

		/**
		 * The meta object literal for the '<em><b>Owned Functor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD__OWNED_FUNCTOR = eINSTANCE.getHead_OwnedFunctor();

		/**
		 * The meta object literal for the '{@link mprolog.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.TermImpl
		 * @see mprolog.impl.MprologPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Next Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__NEXT_TERM = eINSTANCE.getTerm_NextTerm();

		/**
		 * The meta object literal for the '{@link mprolog.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.BodyImpl
		 * @see mprolog.impl.MprologPackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Owned Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__OWNED_TERM = eINSTANCE.getBody_OwnedTerm();

		/**
		 * The meta object literal for the '{@link mprolog.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.VariableImpl
		 * @see mprolog.impl.MprologPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link mprolog.impl.FunctorImpl <em>Functor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.FunctorImpl
		 * @see mprolog.impl.MprologPackageImpl#getFunctor()
		 * @generated
		 */
		EClass FUNCTOR = eINSTANCE.getFunctor();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTOR__TEXT = eINSTANCE.getFunctor_Text();

		/**
		 * The meta object literal for the '<em><b>Owned Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTOR__OWNED_TERM = eINSTANCE.getFunctor_OwnedTerm();

		/**
		 * The meta object literal for the '{@link mprolog.impl.QuotedAtomImpl <em>Quoted Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.QuotedAtomImpl
		 * @see mprolog.impl.MprologPackageImpl#getQuotedAtom()
		 * @generated
		 */
		EClass QUOTED_ATOM = eINSTANCE.getQuotedAtom();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTED_ATOM__TEXT = eINSTANCE.getQuotedAtom_Text();

		/**
		 * The meta object literal for the '{@link mprolog.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.ListImpl
		 * @see mprolog.impl.MprologPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Owned Head Terms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__OWNED_HEAD_TERMS = eINSTANCE.getList_OwnedHeadTerms();

		/**
		 * The meta object literal for the '<em><b>Owned Tail Terms</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__OWNED_TAIL_TERMS = eINSTANCE.getList_OwnedTailTerms();

		/**
		 * The meta object literal for the '{@link mprolog.impl.InfixExpressionImpl <em>Infix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.InfixExpressionImpl
		 * @see mprolog.impl.MprologPackageImpl#getInfixExpression()
		 * @generated
		 */
		EClass INFIX_EXPRESSION = eINSTANCE.getInfixExpression();

		/**
		 * The meta object literal for the '<em><b>Left Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFIX_EXPRESSION__LEFT_TERM = eINSTANCE.getInfixExpression_LeftTerm();

		/**
		 * The meta object literal for the '<em><b>Right Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFIX_EXPRESSION__RIGHT_TERM = eINSTANCE.getInfixExpression_RightTerm();

		/**
		 * The meta object literal for the '<em><b>Owned Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFIX_EXPRESSION__OWNED_OPERATOR = eINSTANCE.getInfixExpression_OwnedOperator();

		/**
		 * The meta object literal for the '{@link mprolog.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.OperatorImpl
		 * @see mprolog.impl.MprologPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__SYMBOL = eINSTANCE.getOperator_Symbol();

		/**
		 * The meta object literal for the '{@link mprolog.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprolog.impl.ParenthesisImpl
		 * @see mprolog.impl.MprologPackageImpl#getParenthesis()
		 * @generated
		 */
		EClass PARENTHESIS = eINSTANCE.getParenthesis();

		/**
		 * The meta object literal for the '<em><b>Owned Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIS__OWNED_TERM = eINSTANCE.getParenthesis_OwnedTerm();

	}

} //MprologPackage
