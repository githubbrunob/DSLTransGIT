/**
 * <copyright>
 * </copyright>
 *
 * $Id: MprologTermReferencePackage.java,v 1.2 2012/02/04 22:47:13 bfb Exp $
 */
package mprologTermReference;

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
 * @see mprologTermReference.MprologTermReferenceFactory
 * @model kind="package"
 * @generated
 */
public interface MprologTermReferencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mprologTermReference";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "mprologTermReference";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mprologTermReference";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MprologTermReferencePackage eINSTANCE = mprologTermReference.impl.MprologTermReferencePackageImpl.init();

	/**
	 * The meta object id for the '{@link mprologTermReference.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.ModelImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getModel()
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
	 * The meta object id for the '{@link mprologTermReference.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.ClauseImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getClause()
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
	 * The meta object id for the '{@link mprologTermReference.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.HeadImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getHead()
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
	 * The meta object id for the '{@link mprologTermReference.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.TermImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getTerm()
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
	 * The meta object id for the '{@link mprologTermReference.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.BodyImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getBody()
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
	 * The meta object id for the '{@link mprologTermReference.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.VariableImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getVariable()
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
	 * The meta object id for the '{@link mprologTermReference.impl.FunctorImpl <em>Functor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.FunctorImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getFunctor()
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
	 * The meta object id for the '{@link mprologTermReference.impl.QuotedAtomImpl <em>Quoted Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.QuotedAtomImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getQuotedAtom()
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
	 * The meta object id for the '{@link mprologTermReference.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.ListImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getList()
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
	 * The meta object id for the '{@link mprologTermReference.impl.InfixExpressionImpl <em>Infix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.InfixExpressionImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getInfixExpression()
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
	 * The meta object id for the '{@link mprologTermReference.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.OperatorImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getOperator()
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
	 * The meta object id for the '{@link mprologTermReference.impl.TermReferenceImpl <em>Term Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.TermReferenceImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getTermReference()
	 * @generated
	 */
	int TERM_REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_REFERENCE__NEXT_TERM = TERM__NEXT_TERM;

	/**
	 * The number of structural features of the '<em>Term Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_REFERENCE_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link mprologTermReference.impl.FunctorReferenceImpl <em>Functor Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.FunctorReferenceImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getFunctorReference()
	 * @generated
	 */
	int FUNCTOR_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_REFERENCE__NEXT_TERM = TERM_REFERENCE__NEXT_TERM;

	/**
	 * The feature id for the '<em><b>Id Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_REFERENCE__ID_REFERENCE = TERM_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_REFERENCE__OWNED_TERM = TERM_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Functor Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTOR_REFERENCE_FEATURE_COUNT = TERM_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link mprologTermReference.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.VariableReferenceImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Next Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__NEXT_TERM = TERM_REFERENCE__NEXT_TERM;

	/**
	 * The feature id for the '<em><b>Id Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__ID_REFERENCE = TERM_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_FEATURE_COUNT = TERM_REFERENCE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link mprologTermReference.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mprologTermReference.impl.ParenthesisImpl
	 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getParenthesis()
	 * @generated
	 */
	int PARENTHESIS = 14;

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
	 * Returns the meta object for class '{@link mprologTermReference.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see mprologTermReference.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link mprologTermReference.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mprologTermReference.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mprologTermReference.Model#getOwnedClause <em>Owned Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Clause</em>'.
	 * @see mprologTermReference.Model#getOwnedClause()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OwnedClause();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see mprologTermReference.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.Clause#getOwnedHead <em>Owned Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Head</em>'.
	 * @see mprologTermReference.Clause#getOwnedHead()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_OwnedHead();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.Clause#getOwnedBody <em>Owned Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Body</em>'.
	 * @see mprologTermReference.Clause#getOwnedBody()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_OwnedBody();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see mprologTermReference.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.Head#getOwnedFunctor <em>Owned Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Functor</em>'.
	 * @see mprologTermReference.Head#getOwnedFunctor()
	 * @see #getHead()
	 * @generated
	 */
	EReference getHead_OwnedFunctor();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see mprologTermReference.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.Term#getNextTerm <em>Next Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Term</em>'.
	 * @see mprologTermReference.Term#getNextTerm()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_NextTerm();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see mprologTermReference.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.Body#getOwnedTerm <em>Owned Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Term</em>'.
	 * @see mprologTermReference.Body#getOwnedTerm()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_OwnedTerm();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see mprologTermReference.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link mprologTermReference.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mprologTermReference.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.Functor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functor</em>'.
	 * @see mprologTermReference.Functor
	 * @generated
	 */
	EClass getFunctor();

	/**
	 * Returns the meta object for the attribute '{@link mprologTermReference.Functor#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see mprologTermReference.Functor#getText()
	 * @see #getFunctor()
	 * @generated
	 */
	EAttribute getFunctor_Text();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.Functor#getOwnedTerm <em>Owned Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Term</em>'.
	 * @see mprologTermReference.Functor#getOwnedTerm()
	 * @see #getFunctor()
	 * @generated
	 */
	EReference getFunctor_OwnedTerm();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.QuotedAtom <em>Quoted Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quoted Atom</em>'.
	 * @see mprologTermReference.QuotedAtom
	 * @generated
	 */
	EClass getQuotedAtom();

	/**
	 * Returns the meta object for the attribute '{@link mprologTermReference.QuotedAtom#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see mprologTermReference.QuotedAtom#getText()
	 * @see #getQuotedAtom()
	 * @generated
	 */
	EAttribute getQuotedAtom_Text();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see mprologTermReference.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.List#getOwnedHeadTerms <em>Owned Head Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Head Terms</em>'.
	 * @see mprologTermReference.List#getOwnedHeadTerms()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_OwnedHeadTerms();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.List#getOwnedTailTerms <em>Owned Tail Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Tail Terms</em>'.
	 * @see mprologTermReference.List#getOwnedTailTerms()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_OwnedTailTerms();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.InfixExpression <em>Infix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infix Expression</em>'.
	 * @see mprologTermReference.InfixExpression
	 * @generated
	 */
	EClass getInfixExpression();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.InfixExpression#getLeftTerm <em>Left Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Term</em>'.
	 * @see mprologTermReference.InfixExpression#getLeftTerm()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_LeftTerm();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.InfixExpression#getRightTerm <em>Right Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Term</em>'.
	 * @see mprologTermReference.InfixExpression#getRightTerm()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_RightTerm();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.InfixExpression#getOwnedOperator <em>Owned Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Operator</em>'.
	 * @see mprologTermReference.InfixExpression#getOwnedOperator()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_OwnedOperator();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see mprologTermReference.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the attribute '{@link mprologTermReference.Operator#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see mprologTermReference.Operator#getSymbol()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Symbol();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.TermReference <em>Term Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Reference</em>'.
	 * @see mprologTermReference.TermReference
	 * @generated
	 */
	EClass getTermReference();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.FunctorReference <em>Functor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functor Reference</em>'.
	 * @see mprologTermReference.FunctorReference
	 * @generated
	 */
	EClass getFunctorReference();

	/**
	 * Returns the meta object for the reference '{@link mprologTermReference.FunctorReference#getIdReference <em>Id Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Reference</em>'.
	 * @see mprologTermReference.FunctorReference#getIdReference()
	 * @see #getFunctorReference()
	 * @generated
	 */
	EReference getFunctorReference_IdReference();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.FunctorReference#getOwnedTerm <em>Owned Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Term</em>'.
	 * @see mprologTermReference.FunctorReference#getOwnedTerm()
	 * @see #getFunctorReference()
	 * @generated
	 */
	EReference getFunctorReference_OwnedTerm();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see mprologTermReference.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for the reference '{@link mprologTermReference.VariableReference#getIdReference <em>Id Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Reference</em>'.
	 * @see mprologTermReference.VariableReference#getIdReference()
	 * @see #getVariableReference()
	 * @generated
	 */
	EReference getVariableReference_IdReference();

	/**
	 * Returns the meta object for class '{@link mprologTermReference.Parenthesis <em>Parenthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesis</em>'.
	 * @see mprologTermReference.Parenthesis
	 * @generated
	 */
	EClass getParenthesis();

	/**
	 * Returns the meta object for the containment reference '{@link mprologTermReference.Parenthesis#getOwnedTerm <em>Owned Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Term</em>'.
	 * @see mprologTermReference.Parenthesis#getOwnedTerm()
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
	MprologTermReferenceFactory getMprologTermReferenceFactory();

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
		 * The meta object literal for the '{@link mprologTermReference.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.ModelImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getModel()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.ClauseImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getClause()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.HeadImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getHead()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.TermImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getTerm()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.BodyImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getBody()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.VariableImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getVariable()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.FunctorImpl <em>Functor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.FunctorImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getFunctor()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.QuotedAtomImpl <em>Quoted Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.QuotedAtomImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getQuotedAtom()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.ListImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getList()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.InfixExpressionImpl <em>Infix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.InfixExpressionImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getInfixExpression()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.OperatorImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getOperator()
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
		 * The meta object literal for the '{@link mprologTermReference.impl.TermReferenceImpl <em>Term Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.TermReferenceImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getTermReference()
		 * @generated
		 */
		EClass TERM_REFERENCE = eINSTANCE.getTermReference();

		/**
		 * The meta object literal for the '{@link mprologTermReference.impl.FunctorReferenceImpl <em>Functor Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.FunctorReferenceImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getFunctorReference()
		 * @generated
		 */
		EClass FUNCTOR_REFERENCE = eINSTANCE.getFunctorReference();

		/**
		 * The meta object literal for the '<em><b>Id Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTOR_REFERENCE__ID_REFERENCE = eINSTANCE.getFunctorReference_IdReference();

		/**
		 * The meta object literal for the '<em><b>Owned Term</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTOR_REFERENCE__OWNED_TERM = eINSTANCE.getFunctorReference_OwnedTerm();

		/**
		 * The meta object literal for the '{@link mprologTermReference.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.VariableReferenceImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getVariableReference()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '<em><b>Id Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REFERENCE__ID_REFERENCE = eINSTANCE.getVariableReference_IdReference();

		/**
		 * The meta object literal for the '{@link mprologTermReference.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mprologTermReference.impl.ParenthesisImpl
		 * @see mprologTermReference.impl.MprologTermReferencePackageImpl#getParenthesis()
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

} //MprologTermReferencePackage
