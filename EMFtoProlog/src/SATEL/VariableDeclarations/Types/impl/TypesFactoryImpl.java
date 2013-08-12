/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypesFactoryImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.VariableDeclarations.Types.impl;

import SATEL.VariableDeclarations.Types.*;

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
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init() {
		try {
			TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL.VariableDeclarations.Types"); 
			if (theTypesFactory != null) {
				return theTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactoryImpl() {
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
			case TypesPackage.PRIMITIVE_HML: return createPrimitiveHML();
			case TypesPackage.PRIMITIVE_STIMULATION: return createPrimitiveStimulation();
			case TypesPackage.PRIMITIVE_OBSERVATION: return createPrimitiveObservation();
			case TypesPackage.PRIMITIVE_INTEGER: return createPrimitiveInteger();
			case TypesPackage.PRIMITIVE_BOOLEAN: return createPrimitiveBoolean();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveHML createPrimitiveHML() {
		PrimitiveHMLImpl primitiveHML = new PrimitiveHMLImpl();
		return primitiveHML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveStimulation createPrimitiveStimulation() {
		PrimitiveStimulationImpl primitiveStimulation = new PrimitiveStimulationImpl();
		return primitiveStimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveObservation createPrimitiveObservation() {
		PrimitiveObservationImpl primitiveObservation = new PrimitiveObservationImpl();
		return primitiveObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveInteger createPrimitiveInteger() {
		PrimitiveIntegerImpl primitiveInteger = new PrimitiveIntegerImpl();
		return primitiveInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveBoolean createPrimitiveBoolean() {
		PrimitiveBooleanImpl primitiveBoolean = new PrimitiveBooleanImpl();
		return primitiveBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesPackage getTypesPackage() {
		return (TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesPackage getPackage() {
		return TypesPackage.eINSTANCE;
	}

} //TypesFactoryImpl
