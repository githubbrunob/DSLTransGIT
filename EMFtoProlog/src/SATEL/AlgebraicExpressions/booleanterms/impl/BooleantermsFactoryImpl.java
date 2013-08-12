/**
 * <copyright>
 * </copyright>
 *
 * $Id: BooleantermsFactoryImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.AlgebraicExpressions.booleanterms.impl;

import SATEL.AlgebraicExpressions.booleanterms.*;

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
public class BooleantermsFactoryImpl extends EFactoryImpl implements BooleantermsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BooleantermsFactory init() {
		try {
			BooleantermsFactory theBooleantermsFactory = (BooleantermsFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL.AlgebraicExpressions.booleanterms"); 
			if (theBooleantermsFactory != null) {
				return theBooleantermsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BooleantermsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleantermsFactoryImpl() {
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
			case BooleantermsPackage.NOT: return createNot();
			case BooleantermsPackage.SEQUENCE: return createSequence();
			case BooleantermsPackage.POSITIVE: return createPositive();
			case BooleantermsPackage.TRACE: return createTrace();
			case BooleantermsPackage.BOOLEAN_VARIABLE: return createBooleanVariable();
			case BooleantermsPackage.BOOLEAN_VALUE: return createBooleanValue();
			case BooleantermsPackage.BOP_AND: return createBOPAnd();
			case BooleantermsPackage.BOP_OR: return createBOPOr();
			case BooleantermsPackage.EQUALS: return createEquals();
			case BooleantermsPackage.NOT_EQUALS: return createNotEquals();
			case BooleantermsPackage.GT: return createGT();
			case BooleantermsPackage.LT: return createLT();
			case BooleantermsPackage.GTE: return createGTE();
			case BooleantermsPackage.LTE: return createLTE();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Positive createPositive() {
		PositiveImpl positive = new PositiveImpl();
		return positive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable createBooleanVariable() {
		BooleanVariableImpl booleanVariable = new BooleanVariableImpl();
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOPAnd createBOPAnd() {
		BOPAndImpl bopAnd = new BOPAndImpl();
		return bopAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOPOr createBOPOr() {
		BOPOrImpl bopOr = new BOPOrImpl();
		return bopOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotEquals createNotEquals() {
		NotEqualsImpl notEquals = new NotEqualsImpl();
		return notEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT createGT() {
		GTImpl gt = new GTImpl();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LT createLT() {
		LTImpl lt = new LTImpl();
		return lt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTE createGTE() {
		GTEImpl gte = new GTEImpl();
		return gte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTE createLTE() {
		LTEImpl lte = new LTEImpl();
		return lte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleantermsPackage getBooleantermsPackage() {
		return (BooleantermsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BooleantermsPackage getPackage() {
		return BooleantermsPackage.eINSTANCE;
	}

} //BooleantermsFactoryImpl
