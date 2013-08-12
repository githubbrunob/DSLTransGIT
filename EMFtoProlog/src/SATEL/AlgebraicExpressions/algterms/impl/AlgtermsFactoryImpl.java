/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlgtermsFactoryImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.algterms.impl;

import SATEL.AlgebraicExpressions.algterms.*;

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
public class AlgtermsFactoryImpl extends EFactoryImpl implements AlgtermsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlgtermsFactory init() {
		try {
			AlgtermsFactory theAlgtermsFactory = (AlgtermsFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL.AlgebraicExpressions.algterms"); 
			if (theAlgtermsFactory != null) {
				return theAlgtermsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlgtermsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgtermsFactoryImpl() {
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
			case AlgtermsPackage.VARIABLE_REF: return createVariableRef();
			case AlgtermsPackage.COMPOSITE_TERM: return createCompositeTerm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRef createVariableRef() {
		VariableRefImpl variableRef = new VariableRefImpl();
		return variableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeTerm createCompositeTerm() {
		CompositeTermImpl compositeTerm = new CompositeTermImpl();
		return compositeTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgtermsPackage getAlgtermsPackage() {
		return (AlgtermsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AlgtermsPackage getPackage() {
		return AlgtermsPackage.eINSTANCE;
	}

} //AlgtermsFactoryImpl
