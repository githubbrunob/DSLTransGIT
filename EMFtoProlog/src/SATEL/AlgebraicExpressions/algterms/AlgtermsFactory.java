/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgtermsFactory.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.algterms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SATEL.AlgebraicExpressions.algterms.AlgtermsPackage
 * @generated
 */
public interface AlgtermsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgtermsFactory eINSTANCE = SATEL.AlgebraicExpressions.algterms.impl.AlgtermsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Variable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Ref</em>'.
	 * @generated
	 */
	VariableRef createVariableRef();

	/**
	 * Returns a new object of class '<em>Composite Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Term</em>'.
	 * @generated
	 */
	CompositeTerm createCompositeTerm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AlgtermsPackage getAlgtermsPackage();

} //AlgtermsFactory
