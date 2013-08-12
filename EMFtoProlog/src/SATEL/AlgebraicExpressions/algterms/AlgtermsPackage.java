/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgtermsPackage.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.algterms;

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
 * @see SATEL.AlgebraicExpressions.algterms.AlgtermsFactory
 * @model kind="package"
 * @generated
 */
public interface AlgtermsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algterms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.AlgebraicExpressions.algterms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "algterms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgtermsPackage eINSTANCE = SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.algterms.impl.AlgebraicTermImpl <em>Algebraic Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.algterms.impl.AlgebraicTermImpl
	 * @see SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl#getAlgebraicTerm()
	 * @generated
	 */
	int ALGEBRAIC_TERM = 0;

	/**
	 * The number of structural features of the '<em>Algebraic Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGEBRAIC_TERM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.algterms.impl.VariableRefImpl <em>Variable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.algterms.impl.VariableRefImpl
	 * @see SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl#getVariableRef()
	 * @generated
	 */
	int VARIABLE_REF = 1;

	/**
	 * The feature id for the '<em><b>Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF__VAR = ALGEBRAIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REF_FEATURE_COUNT = ALGEBRAIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.algterms.impl.AbstractCompositeTermImpl <em>Abstract Composite Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.algterms.impl.AbstractCompositeTermImpl
	 * @see SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl#getAbstractCompositeTerm()
	 * @generated
	 */
	int ABSTRACT_COMPOSITE_TERM = 2;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_TERM__TERMS = ALGEBRAIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_TERM__OP = ALGEBRAIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_TERM__ITER = ALGEBRAIC_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Composite Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_TERM_FEATURE_COUNT = ALGEBRAIC_TERM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SATEL.AlgebraicExpressions.algterms.impl.CompositeTermImpl <em>Composite Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.AlgebraicExpressions.algterms.impl.CompositeTermImpl
	 * @see SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl#getCompositeTerm()
	 * @generated
	 */
	int COMPOSITE_TERM = 3;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TERM__TERMS = ABSTRACT_COMPOSITE_TERM__TERMS;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TERM__OP = ABSTRACT_COMPOSITE_TERM__OP;

	/**
	 * The feature id for the '<em><b>Iter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TERM__ITER = ABSTRACT_COMPOSITE_TERM__ITER;

	/**
	 * The number of structural features of the '<em>Composite Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TERM_FEATURE_COUNT = ABSTRACT_COMPOSITE_TERM_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.algterms.AlgebraicTerm <em>Algebraic Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algebraic Term</em>'.
	 * @see SATEL.AlgebraicExpressions.algterms.AlgebraicTerm
	 * @generated
	 */
	EClass getAlgebraicTerm();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.algterms.VariableRef <em>Variable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Ref</em>'.
	 * @see SATEL.AlgebraicExpressions.algterms.VariableRef
	 * @generated
	 */
	EClass getVariableRef();

	/**
	 * Returns the meta object for the reference '{@link SATEL.AlgebraicExpressions.algterms.VariableRef#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Var</em>'.
	 * @see SATEL.AlgebraicExpressions.algterms.VariableRef#getVar()
	 * @see #getVariableRef()
	 * @generated
	 */
	EReference getVariableRef_Var();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm <em>Abstract Composite Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Composite Term</em>'.
	 * @see SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm
	 * @generated
	 */
	EClass getAbstractCompositeTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getTerms()
	 * @see #getAbstractCompositeTerm()
	 * @generated
	 */
	EReference getAbstractCompositeTerm_Terms();

	/**
	 * Returns the meta object for the reference '{@link SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getOp()
	 * @see #getAbstractCompositeTerm()
	 * @generated
	 */
	EReference getAbstractCompositeTerm_Op();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getIter <em>Iter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iter</em>'.
	 * @see SATEL.AlgebraicExpressions.algterms.AbstractCompositeTerm#getIter()
	 * @see #getAbstractCompositeTerm()
	 * @generated
	 */
	EAttribute getAbstractCompositeTerm_Iter();

	/**
	 * Returns the meta object for class '{@link SATEL.AlgebraicExpressions.algterms.CompositeTerm <em>Composite Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Term</em>'.
	 * @see SATEL.AlgebraicExpressions.algterms.CompositeTerm
	 * @generated
	 */
	EClass getCompositeTerm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgtermsFactory getAlgtermsFactory();

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
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.algterms.impl.AlgebraicTermImpl <em>Algebraic Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.algterms.impl.AlgebraicTermImpl
		 * @see SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl#getAlgebraicTerm()
		 * @generated
		 */
		EClass ALGEBRAIC_TERM = eINSTANCE.getAlgebraicTerm();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.algterms.impl.VariableRefImpl <em>Variable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.algterms.impl.VariableRefImpl
		 * @see SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl#getVariableRef()
		 * @generated
		 */
		EClass VARIABLE_REF = eINSTANCE.getVariableRef();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REF__VAR = eINSTANCE.getVariableRef_Var();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.algterms.impl.AbstractCompositeTermImpl <em>Abstract Composite Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.algterms.impl.AbstractCompositeTermImpl
		 * @see SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl#getAbstractCompositeTerm()
		 * @generated
		 */
		EClass ABSTRACT_COMPOSITE_TERM = eINSTANCE.getAbstractCompositeTerm();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPOSITE_TERM__TERMS = eINSTANCE.getAbstractCompositeTerm_Terms();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPOSITE_TERM__OP = eINSTANCE.getAbstractCompositeTerm_Op();

		/**
		 * The meta object literal for the '<em><b>Iter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPOSITE_TERM__ITER = eINSTANCE.getAbstractCompositeTerm_Iter();

		/**
		 * The meta object literal for the '{@link SATEL.AlgebraicExpressions.algterms.impl.CompositeTermImpl <em>Composite Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.AlgebraicExpressions.algterms.impl.CompositeTermImpl
		 * @see SATEL.AlgebraicExpressions.algterms.impl.AlgtermsPackageImpl#getCompositeTerm()
		 * @generated
		 */
		EClass COMPOSITE_TERM = eINSTANCE.getCompositeTerm();

	}

} //AlgtermsPackage
