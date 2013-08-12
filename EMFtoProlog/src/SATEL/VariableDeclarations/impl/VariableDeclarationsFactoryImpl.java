/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableDeclarationsFactoryImpl.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.VariableDeclarations.impl;

import SATEL.VariableDeclarations.*;

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
public class VariableDeclarationsFactoryImpl extends EFactoryImpl implements VariableDeclarationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VariableDeclarationsFactory init() {
		try {
			VariableDeclarationsFactory theVariableDeclarationsFactory = (VariableDeclarationsFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL.VariableDeclarations"); 
			if (theVariableDeclarationsFactory != null) {
				return theVariableDeclarationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VariableDeclarationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationsFactoryImpl() {
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
			case VariableDeclarationsPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case VariableDeclarationsPackage.PRIMITIVE_HML_VAR_DEC: return createPrimitiveHMLVarDec();
			case VariableDeclarationsPackage.PRIMITIVE_STIMULATION_VAR_DEC: return createPrimitiveStimulationVarDec();
			case VariableDeclarationsPackage.PRIMITIVE_OBSERVATION_VAR_DEC: return createPrimitiveObservationVarDec();
			case VariableDeclarationsPackage.PRIMITIVE_INTEGER_VAR_DEC: return createPrimitiveIntegerVarDec();
			case VariableDeclarationsPackage.PRIMITIVE_BOOLEAN_VAR_DEC: return createPrimitiveBooleanVarDec();
			case VariableDeclarationsPackage.ALGEBRAIC_SORT_VAR_DEC: return createAlgebraicSortVarDec();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveHMLVarDec createPrimitiveHMLVarDec() {
		PrimitiveHMLVarDecImpl primitiveHMLVarDec = new PrimitiveHMLVarDecImpl();
		return primitiveHMLVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveStimulationVarDec createPrimitiveStimulationVarDec() {
		PrimitiveStimulationVarDecImpl primitiveStimulationVarDec = new PrimitiveStimulationVarDecImpl();
		return primitiveStimulationVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveObservationVarDec createPrimitiveObservationVarDec() {
		PrimitiveObservationVarDecImpl primitiveObservationVarDec = new PrimitiveObservationVarDecImpl();
		return primitiveObservationVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveIntegerVarDec createPrimitiveIntegerVarDec() {
		PrimitiveIntegerVarDecImpl primitiveIntegerVarDec = new PrimitiveIntegerVarDecImpl();
		return primitiveIntegerVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveBooleanVarDec createPrimitiveBooleanVarDec() {
		PrimitiveBooleanVarDecImpl primitiveBooleanVarDec = new PrimitiveBooleanVarDecImpl();
		return primitiveBooleanVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgebraicSortVarDec createAlgebraicSortVarDec() {
		AlgebraicSortVarDecImpl algebraicSortVarDec = new AlgebraicSortVarDecImpl();
		return algebraicSortVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationsPackage getVariableDeclarationsPackage() {
		return (VariableDeclarationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VariableDeclarationsPackage getPackage() {
		return VariableDeclarationsPackage.eINSTANCE;
	}

} //VariableDeclarationsFactoryImpl
