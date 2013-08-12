/**
 * <copyright>
 * </copyright>
 *
 * $Id: MultisetmmFactoryImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.multisetmm.impl;

import SATEL.APN.multisetmm.*;

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
public class MultisetmmFactoryImpl extends EFactoryImpl implements MultisetmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultisetmmFactory init() {
		try {
			MultisetmmFactory theMultisetmmFactory = (MultisetmmFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL.APN.multisetmm"); 
			if (theMultisetmmFactory != null) {
				return theMultisetmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MultisetmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultisetmmFactoryImpl() {
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
			case MultisetmmPackage.MULTISET: return createMultiset();
			case MultisetmmPackage.NUM_OF_TERMS: return createNumOfTerms();
			case MultisetmmPackage.TERM_REFERENCE: return createTermReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiset createMultiset() {
		MultisetImpl multiset = new MultisetImpl();
		return multiset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumOfTerms createNumOfTerms() {
		NumOfTermsImpl numOfTerms = new NumOfTermsImpl();
		return numOfTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermReference createTermReference() {
		TermReferenceImpl termReference = new TermReferenceImpl();
		return termReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultisetmmPackage getMultisetmmPackage() {
		return (MultisetmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MultisetmmPackage getPackage() {
		return MultisetmmPackage.eINSTANCE;
	}

} //MultisetmmFactoryImpl
