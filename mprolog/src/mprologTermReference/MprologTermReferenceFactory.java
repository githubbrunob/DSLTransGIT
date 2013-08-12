/**
 * <copyright>
 * </copyright>
 *
 * $Id: MprologTermReferenceFactory.java,v 1.1 2011/12/28 01:45:32 bfb Exp $
 */
package mprologTermReference;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mprologTermReference.MprologTermReferencePackage
 * @generated
 */
public interface MprologTermReferenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MprologTermReferenceFactory eINSTANCE = mprologTermReference.impl.MprologTermReferenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clause</em>'.
	 * @generated
	 */
	Clause createClause();

	/**
	 * Returns a new object of class '<em>Head</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Head</em>'.
	 * @generated
	 */
	Head createHead();

	/**
	 * Returns a new object of class '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body</em>'.
	 * @generated
	 */
	Body createBody();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Functor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functor</em>'.
	 * @generated
	 */
	Functor createFunctor();

	/**
	 * Returns a new object of class '<em>Quoted Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quoted Atom</em>'.
	 * @generated
	 */
	QuotedAtom createQuotedAtom();

	/**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
	List createList();

	/**
	 * Returns a new object of class '<em>Infix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infix Expression</em>'.
	 * @generated
	 */
	InfixExpression createInfixExpression();

	/**
	 * Returns a new object of class '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operator</em>'.
	 * @generated
	 */
	Operator createOperator();

	/**
	 * Returns a new object of class '<em>Functor Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functor Reference</em>'.
	 * @generated
	 */
	FunctorReference createFunctorReference();

	/**
	 * Returns a new object of class '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Reference</em>'.
	 * @generated
	 */
	VariableReference createVariableReference();

	/**
	 * Returns a new object of class '<em>Parenthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parenthesis</em>'.
	 * @generated
	 */
	Parenthesis createParenthesis();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MprologTermReferencePackage getMprologTermReferencePackage();

} //MprologTermReferenceFactory
