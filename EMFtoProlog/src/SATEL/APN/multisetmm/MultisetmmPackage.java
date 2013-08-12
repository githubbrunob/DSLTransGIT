/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultisetmmPackage.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.APN.multisetmm;

import SATEL.APN.environmentmm.EnvironmentmmPackage;

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
 * @see SATEL.APN.multisetmm.MultisetmmFactory
 * @model kind="package"
 * @generated
 */
public interface MultisetmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "multisetmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.APN.multisetmm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "multisetmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MultisetmmPackage eINSTANCE = SATEL.APN.multisetmm.impl.MultisetmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.APN.multisetmm.impl.MultisetImpl <em>Multiset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.multisetmm.impl.MultisetImpl
	 * @see SATEL.APN.multisetmm.impl.MultisetmmPackageImpl#getMultiset()
	 * @generated
	 */
	int MULTISET = 0;

	/**
	 * The feature id for the '<em><b>Ms Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET__MS_SORT = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Num Of Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET__OWNED_NUM_OF_TERMS = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET__OWNED_VARIABLES = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multiset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTISET_FEATURE_COUNT = EnvironmentmmPackage.ENVIRONMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link SATEL.APN.multisetmm.impl.NumOfTermsImpl <em>Num Of Terms</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.multisetmm.impl.NumOfTermsImpl
	 * @see SATEL.APN.multisetmm.impl.MultisetmmPackageImpl#getNumOfTerms()
	 * @generated
	 */
	int NUM_OF_TERMS = 1;

	/**
	 * The feature id for the '<em><b>Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_OF_TERMS__CARD = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_OF_TERMS__OWNED_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Num Of Terms</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_OF_TERMS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link SATEL.APN.multisetmm.impl.MSElementImpl <em>MS Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.multisetmm.impl.MSElementImpl
	 * @see SATEL.APN.multisetmm.impl.MultisetmmPackageImpl#getMSElement()
	 * @generated
	 */
	int MS_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>MS Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.APN.multisetmm.impl.TermReferenceImpl <em>Term Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.APN.multisetmm.impl.TermReferenceImpl
	 * @see SATEL.APN.multisetmm.impl.MultisetmmPackageImpl#getTermReference()
	 * @generated
	 */
	int TERM_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Term Referenced</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_REFERENCE__TERM_REFERENCED = MS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_REFERENCE_FEATURE_COUNT = MS_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link SATEL.APN.multisetmm.Multiset <em>Multiset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiset</em>'.
	 * @see SATEL.APN.multisetmm.Multiset
	 * @generated
	 */
	EClass getMultiset();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.multisetmm.Multiset#getMsSort <em>Ms Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ms Sort</em>'.
	 * @see SATEL.APN.multisetmm.Multiset#getMsSort()
	 * @see #getMultiset()
	 * @generated
	 */
	EReference getMultiset_MsSort();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.multisetmm.Multiset#getOwnedNumOfTerms <em>Owned Num Of Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Num Of Terms</em>'.
	 * @see SATEL.APN.multisetmm.Multiset#getOwnedNumOfTerms()
	 * @see #getMultiset()
	 * @generated
	 */
	EReference getMultiset_OwnedNumOfTerms();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.APN.multisetmm.Multiset#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
	 * @see SATEL.APN.multisetmm.Multiset#getOwnedVariables()
	 * @see #getMultiset()
	 * @generated
	 */
	EReference getMultiset_OwnedVariables();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.multisetmm.NumOfTerms <em>Num Of Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num Of Terms</em>'.
	 * @see SATEL.APN.multisetmm.NumOfTerms
	 * @generated
	 */
	EClass getNumOfTerms();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.APN.multisetmm.NumOfTerms#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card</em>'.
	 * @see SATEL.APN.multisetmm.NumOfTerms#getCard()
	 * @see #getNumOfTerms()
	 * @generated
	 */
	EAttribute getNumOfTerms_Card();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.multisetmm.NumOfTerms#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Element</em>'.
	 * @see SATEL.APN.multisetmm.NumOfTerms#getOwnedElement()
	 * @see #getNumOfTerms()
	 * @generated
	 */
	EReference getNumOfTerms_OwnedElement();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.multisetmm.MSElement <em>MS Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MS Element</em>'.
	 * @see SATEL.APN.multisetmm.MSElement
	 * @generated
	 */
	EClass getMSElement();

	/**
	 * Returns the meta object for class '{@link SATEL.APN.multisetmm.TermReference <em>Term Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Reference</em>'.
	 * @see SATEL.APN.multisetmm.TermReference
	 * @generated
	 */
	EClass getTermReference();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.APN.multisetmm.TermReference#getTermReferenced <em>Term Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term Referenced</em>'.
	 * @see SATEL.APN.multisetmm.TermReference#getTermReferenced()
	 * @see #getTermReference()
	 * @generated
	 */
	EReference getTermReference_TermReferenced();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MultisetmmFactory getMultisetmmFactory();

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
		 * The meta object literal for the '{@link SATEL.APN.multisetmm.impl.MultisetImpl <em>Multiset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.multisetmm.impl.MultisetImpl
		 * @see SATEL.APN.multisetmm.impl.MultisetmmPackageImpl#getMultiset()
		 * @generated
		 */
		EClass MULTISET = eINSTANCE.getMultiset();

		/**
		 * The meta object literal for the '<em><b>Ms Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTISET__MS_SORT = eINSTANCE.getMultiset_MsSort();

		/**
		 * The meta object literal for the '<em><b>Owned Num Of Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTISET__OWNED_NUM_OF_TERMS = eINSTANCE.getMultiset_OwnedNumOfTerms();

		/**
		 * The meta object literal for the '<em><b>Owned Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTISET__OWNED_VARIABLES = eINSTANCE.getMultiset_OwnedVariables();

		/**
		 * The meta object literal for the '{@link SATEL.APN.multisetmm.impl.NumOfTermsImpl <em>Num Of Terms</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.multisetmm.impl.NumOfTermsImpl
		 * @see SATEL.APN.multisetmm.impl.MultisetmmPackageImpl#getNumOfTerms()
		 * @generated
		 */
		EClass NUM_OF_TERMS = eINSTANCE.getNumOfTerms();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM_OF_TERMS__CARD = eINSTANCE.getNumOfTerms_Card();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUM_OF_TERMS__OWNED_ELEMENT = eINSTANCE.getNumOfTerms_OwnedElement();

		/**
		 * The meta object literal for the '{@link SATEL.APN.multisetmm.impl.MSElementImpl <em>MS Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.multisetmm.impl.MSElementImpl
		 * @see SATEL.APN.multisetmm.impl.MultisetmmPackageImpl#getMSElement()
		 * @generated
		 */
		EClass MS_ELEMENT = eINSTANCE.getMSElement();

		/**
		 * The meta object literal for the '{@link SATEL.APN.multisetmm.impl.TermReferenceImpl <em>Term Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.APN.multisetmm.impl.TermReferenceImpl
		 * @see SATEL.APN.multisetmm.impl.MultisetmmPackageImpl#getTermReference()
		 * @generated
		 */
		EClass TERM_REFERENCE = eINSTANCE.getTermReference();

		/**
		 * The meta object literal for the '<em><b>Term Referenced</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_REFERENCE__TERM_REFERENCED = eINSTANCE.getTermReference_TermReferenced();

	}

} //MultisetmmPackage
