/**
 * <copyright>
 * </copyright>
 *
 * $Id: ArithmetictermsFactoryImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.AlgebraicExpressions.arithmeticterms.impl;

import SATEL.AlgebraicExpressions.arithmeticterms.*;

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
public class ArithmetictermsFactoryImpl extends EFactoryImpl implements ArithmetictermsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArithmetictermsFactory init() {
		try {
			ArithmetictermsFactory theArithmetictermsFactory = (ArithmetictermsFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL.AlgebraicExpressions.arithmeticterms"); 
			if (theArithmetictermsFactory != null) {
				return theArithmetictermsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArithmetictermsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetictermsFactoryImpl() {
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
			case ArithmetictermsPackage.INTEGER_VARIABLE: return createIntegerVariable();
			case ArithmetictermsPackage.INTEGER_VALUE: return createIntegerValue();
			case ArithmetictermsPackage.BOP_PLUS: return createBOPPlus();
			case ArithmetictermsPackage.BOP_MINUS: return createBOPMinus();
			case ArithmetictermsPackage.BOP_TIMES: return createBOPTimes();
			case ArithmetictermsPackage.BOP_DIV: return createBOPDiv();
			case ArithmetictermsPackage.NB_EVENTS: return createNBEvents();
			case ArithmetictermsPackage.DEPTH: return createDepth();
			case ArithmetictermsPackage.UOP_MINUS: return createUOPMinus();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable createIntegerVariable() {
		IntegerVariableImpl integerVariable = new IntegerVariableImpl();
		return integerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOPPlus createBOPPlus() {
		BOPPlusImpl bopPlus = new BOPPlusImpl();
		return bopPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOPMinus createBOPMinus() {
		BOPMinusImpl bopMinus = new BOPMinusImpl();
		return bopMinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOPTimes createBOPTimes() {
		BOPTimesImpl bopTimes = new BOPTimesImpl();
		return bopTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOPDiv createBOPDiv() {
		BOPDivImpl bopDiv = new BOPDivImpl();
		return bopDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NBEvents createNBEvents() {
		NBEventsImpl nbEvents = new NBEventsImpl();
		return nbEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Depth createDepth() {
		DepthImpl depth = new DepthImpl();
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UOPMinus createUOPMinus() {
		UOPMinusImpl uopMinus = new UOPMinusImpl();
		return uopMinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmetictermsPackage getArithmetictermsPackage() {
		return (ArithmetictermsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArithmetictermsPackage getPackage() {
		return ArithmetictermsPackage.eINSTANCE;
	}

} //ArithmetictermsFactoryImpl
