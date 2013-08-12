/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypesPackage.java,v 1.1 2011/09/27 18:59:52 domingues Exp $
 */
package SATEL.VariableDeclarations.Types;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see SATEL.VariableDeclarations.Types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.VariableDeclarations.Types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = SATEL.VariableDeclarations.Types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.Types.impl.VarDecTypeImpl <em>Var Dec Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.Types.impl.VarDecTypeImpl
	 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getVarDecType()
	 * @generated
	 */
	int VAR_DEC_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Var Dec Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DEC_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.Types.impl.PrimitiveHMLImpl <em>Primitive HML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.Types.impl.PrimitiveHMLImpl
	 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getPrimitiveHML()
	 * @generated
	 */
	int PRIMITIVE_HML = 1;

	/**
	 * The number of structural features of the '<em>Primitive HML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_HML_FEATURE_COUNT = VAR_DEC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.Types.impl.PrimitiveStimulationImpl <em>Primitive Stimulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.Types.impl.PrimitiveStimulationImpl
	 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getPrimitiveStimulation()
	 * @generated
	 */
	int PRIMITIVE_STIMULATION = 2;

	/**
	 * The number of structural features of the '<em>Primitive Stimulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STIMULATION_FEATURE_COUNT = VAR_DEC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.Types.impl.PrimitiveObservationImpl <em>Primitive Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.Types.impl.PrimitiveObservationImpl
	 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getPrimitiveObservation()
	 * @generated
	 */
	int PRIMITIVE_OBSERVATION = 3;

	/**
	 * The number of structural features of the '<em>Primitive Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OBSERVATION_FEATURE_COUNT = VAR_DEC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.Types.impl.PrimitiveIntegerImpl <em>Primitive Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.Types.impl.PrimitiveIntegerImpl
	 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getPrimitiveInteger()
	 * @generated
	 */
	int PRIMITIVE_INTEGER = 4;

	/**
	 * The number of structural features of the '<em>Primitive Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER_FEATURE_COUNT = VAR_DEC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.Types.impl.PrimitiveBooleanImpl <em>Primitive Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.Types.impl.PrimitiveBooleanImpl
	 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getPrimitiveBoolean()
	 * @generated
	 */
	int PRIMITIVE_BOOLEAN = 5;

	/**
	 * The number of structural features of the '<em>Primitive Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN_FEATURE_COUNT = VAR_DEC_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.Types.VarDecType <em>Var Dec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Dec Type</em>'.
	 * @see SATEL.VariableDeclarations.Types.VarDecType
	 * @generated
	 */
	EClass getVarDecType();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.Types.PrimitiveHML <em>Primitive HML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive HML</em>'.
	 * @see SATEL.VariableDeclarations.Types.PrimitiveHML
	 * @generated
	 */
	EClass getPrimitiveHML();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.Types.PrimitiveStimulation <em>Primitive Stimulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Stimulation</em>'.
	 * @see SATEL.VariableDeclarations.Types.PrimitiveStimulation
	 * @generated
	 */
	EClass getPrimitiveStimulation();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.Types.PrimitiveObservation <em>Primitive Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Observation</em>'.
	 * @see SATEL.VariableDeclarations.Types.PrimitiveObservation
	 * @generated
	 */
	EClass getPrimitiveObservation();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.Types.PrimitiveInteger <em>Primitive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Integer</em>'.
	 * @see SATEL.VariableDeclarations.Types.PrimitiveInteger
	 * @generated
	 */
	EClass getPrimitiveInteger();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.Types.PrimitiveBoolean <em>Primitive Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Boolean</em>'.
	 * @see SATEL.VariableDeclarations.Types.PrimitiveBoolean
	 * @generated
	 */
	EClass getPrimitiveBoolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.Types.impl.VarDecTypeImpl <em>Var Dec Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.Types.impl.VarDecTypeImpl
		 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getVarDecType()
		 * @generated
		 */
		EClass VAR_DEC_TYPE = eINSTANCE.getVarDecType();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.Types.impl.PrimitiveHMLImpl <em>Primitive HML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.Types.impl.PrimitiveHMLImpl
		 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getPrimitiveHML()
		 * @generated
		 */
		EClass PRIMITIVE_HML = eINSTANCE.getPrimitiveHML();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.Types.impl.PrimitiveStimulationImpl <em>Primitive Stimulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.Types.impl.PrimitiveStimulationImpl
		 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getPrimitiveStimulation()
		 * @generated
		 */
		EClass PRIMITIVE_STIMULATION = eINSTANCE.getPrimitiveStimulation();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.Types.impl.PrimitiveObservationImpl <em>Primitive Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.Types.impl.PrimitiveObservationImpl
		 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getPrimitiveObservation()
		 * @generated
		 */
		EClass PRIMITIVE_OBSERVATION = eINSTANCE.getPrimitiveObservation();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.Types.impl.PrimitiveIntegerImpl <em>Primitive Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.Types.impl.PrimitiveIntegerImpl
		 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getPrimitiveInteger()
		 * @generated
		 */
		EClass PRIMITIVE_INTEGER = eINSTANCE.getPrimitiveInteger();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.Types.impl.PrimitiveBooleanImpl <em>Primitive Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.Types.impl.PrimitiveBooleanImpl
		 * @see SATEL.VariableDeclarations.Types.impl.TypesPackageImpl#getPrimitiveBoolean()
		 * @generated
		 */
		EClass PRIMITIVE_BOOLEAN = eINSTANCE.getPrimitiveBoolean();

	}

} //TypesPackage
