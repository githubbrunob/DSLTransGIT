/**
 * <copyright>
 * </copyright>
 *
 * $Id: ApnmmFactoryImpl.java,v 1.1 2011/09/27 18:59:53 domingues Exp $
 */
package SATEL.APN.apnmm.impl;

import SATEL.APN.apnmm.*;

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
public class ApnmmFactoryImpl extends EFactoryImpl implements ApnmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApnmmFactory init() {
		try {
			ApnmmFactory theApnmmFactory = (ApnmmFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL.APN.apnmm"); 
			if (theApnmmFactory != null) {
				return theApnmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApnmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApnmmFactoryImpl() {
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
			case ApnmmPackage.APN: return createAPN();
			case ApnmmPackage.ARC: return createArc();
			case ApnmmPackage.PLACE: return createPlace();
			case ApnmmPackage.TRANSITION: return createTransition();
			case ApnmmPackage.METHOD: return createMethod();
			case ApnmmPackage.GATE: return createGate();
			case ApnmmPackage.GATE_CALL: return createGateCall();
			case ApnmmPackage.METHOD_CALL: return createMethodCall();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APN createAPN() {
		APNImpl apn = new APNImpl();
		return apn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateCall createGateCall() {
		GateCallImpl gateCall = new GateCallImpl();
		return gateCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall createMethodCall() {
		MethodCallImpl methodCall = new MethodCallImpl();
		return methodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApnmmPackage getApnmmPackage() {
		return (ApnmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApnmmPackage getPackage() {
		return ApnmmPackage.eINSTANCE;
	}

} //ApnmmFactoryImpl
