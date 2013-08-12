/**
 * <copyright>
 * </copyright>
 *
 * $Id: VariableDeclarationsPackage.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.VariableDeclarations;

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
 * @see SATEL.VariableDeclarations.VariableDeclarationsFactory
 * @model kind="package"
 * @generated
 */
public interface VariableDeclarationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "VariableDeclarations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "SATEL.VariableDeclarations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "VariableDeclarations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariableDeclarationsPackage eINSTANCE = SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.impl.VariableDeclarationImpl
	 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.impl.VariableDecImpl <em>Variable Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.impl.VariableDecImpl
	 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getVariableDec()
	 * @generated
	 */
	int VARIABLE_DEC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.impl.PrimitiveHMLVarDecImpl <em>Primitive HML Var Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.impl.PrimitiveHMLVarDecImpl
	 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getPrimitiveHMLVarDec()
	 * @generated
	 */
	int PRIMITIVE_HML_VAR_DEC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_HML_VAR_DEC__NAME = VARIABLE_DEC__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_HML_VAR_DEC__TYPE = VARIABLE_DEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive HML Var Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_HML_VAR_DEC_FEATURE_COUNT = VARIABLE_DEC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.impl.PrimitiveStimulationVarDecImpl <em>Primitive Stimulation Var Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.impl.PrimitiveStimulationVarDecImpl
	 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getPrimitiveStimulationVarDec()
	 * @generated
	 */
	int PRIMITIVE_STIMULATION_VAR_DEC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STIMULATION_VAR_DEC__NAME = VARIABLE_DEC__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STIMULATION_VAR_DEC__TYPE = VARIABLE_DEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Stimulation Var Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_STIMULATION_VAR_DEC_FEATURE_COUNT = VARIABLE_DEC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.impl.PrimitiveObservationVarDecImpl <em>Primitive Observation Var Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.impl.PrimitiveObservationVarDecImpl
	 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getPrimitiveObservationVarDec()
	 * @generated
	 */
	int PRIMITIVE_OBSERVATION_VAR_DEC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OBSERVATION_VAR_DEC__NAME = VARIABLE_DEC__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OBSERVATION_VAR_DEC__TYPE = VARIABLE_DEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Observation Var Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OBSERVATION_VAR_DEC_FEATURE_COUNT = VARIABLE_DEC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.impl.PrimitiveIntegerVarDecImpl <em>Primitive Integer Var Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.impl.PrimitiveIntegerVarDecImpl
	 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getPrimitiveIntegerVarDec()
	 * @generated
	 */
	int PRIMITIVE_INTEGER_VAR_DEC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER_VAR_DEC__NAME = VARIABLE_DEC__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER_VAR_DEC__TYPE = VARIABLE_DEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Integer Var Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INTEGER_VAR_DEC_FEATURE_COUNT = VARIABLE_DEC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.impl.PrimitiveBooleanVarDecImpl <em>Primitive Boolean Var Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.impl.PrimitiveBooleanVarDecImpl
	 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getPrimitiveBooleanVarDec()
	 * @generated
	 */
	int PRIMITIVE_BOOLEAN_VAR_DEC = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN_VAR_DEC__NAME = VARIABLE_DEC__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN_VAR_DEC__TYPE = VARIABLE_DEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Boolean Var Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_BOOLEAN_VAR_DEC_FEATURE_COUNT = VARIABLE_DEC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link SATEL.VariableDeclarations.impl.AlgebraicSortVarDecImpl <em>Algebraic Sort Var Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SATEL.VariableDeclarations.impl.AlgebraicSortVarDecImpl
	 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getAlgebraicSortVarDec()
	 * @generated
	 */
	int ALGEBRAIC_SORT_VAR_DEC = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGEBRAIC_SORT_VAR_DEC__NAME = VARIABLE_DEC__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGEBRAIC_SORT_VAR_DEC__TYPE = VARIABLE_DEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Algebraic Sort Var Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGEBRAIC_SORT_VAR_DEC_FEATURE_COUNT = VARIABLE_DEC_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see SATEL.VariableDeclarations.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link SATEL.VariableDeclarations.VariableDeclaration#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see SATEL.VariableDeclarations.VariableDeclaration#getVariable()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Variable();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.VariableDec <em>Variable Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Dec</em>'.
	 * @see SATEL.VariableDeclarations.VariableDec
	 * @generated
	 */
	EClass getVariableDec();

	/**
	 * Returns the meta object for the attribute '{@link SATEL.VariableDeclarations.VariableDec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SATEL.VariableDeclarations.VariableDec#getName()
	 * @see #getVariableDec()
	 * @generated
	 */
	EAttribute getVariableDec_Name();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.PrimitiveHMLVarDec <em>Primitive HML Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive HML Var Dec</em>'.
	 * @see SATEL.VariableDeclarations.PrimitiveHMLVarDec
	 * @generated
	 */
	EClass getPrimitiveHMLVarDec();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.VariableDeclarations.PrimitiveHMLVarDec#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see SATEL.VariableDeclarations.PrimitiveHMLVarDec#getType()
	 * @see #getPrimitiveHMLVarDec()
	 * @generated
	 */
	EReference getPrimitiveHMLVarDec_Type();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.PrimitiveStimulationVarDec <em>Primitive Stimulation Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Stimulation Var Dec</em>'.
	 * @see SATEL.VariableDeclarations.PrimitiveStimulationVarDec
	 * @generated
	 */
	EClass getPrimitiveStimulationVarDec();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.VariableDeclarations.PrimitiveStimulationVarDec#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see SATEL.VariableDeclarations.PrimitiveStimulationVarDec#getType()
	 * @see #getPrimitiveStimulationVarDec()
	 * @generated
	 */
	EReference getPrimitiveStimulationVarDec_Type();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.PrimitiveObservationVarDec <em>Primitive Observation Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Observation Var Dec</em>'.
	 * @see SATEL.VariableDeclarations.PrimitiveObservationVarDec
	 * @generated
	 */
	EClass getPrimitiveObservationVarDec();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.VariableDeclarations.PrimitiveObservationVarDec#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see SATEL.VariableDeclarations.PrimitiveObservationVarDec#getType()
	 * @see #getPrimitiveObservationVarDec()
	 * @generated
	 */
	EReference getPrimitiveObservationVarDec_Type();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.PrimitiveIntegerVarDec <em>Primitive Integer Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Integer Var Dec</em>'.
	 * @see SATEL.VariableDeclarations.PrimitiveIntegerVarDec
	 * @generated
	 */
	EClass getPrimitiveIntegerVarDec();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.VariableDeclarations.PrimitiveIntegerVarDec#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see SATEL.VariableDeclarations.PrimitiveIntegerVarDec#getType()
	 * @see #getPrimitiveIntegerVarDec()
	 * @generated
	 */
	EReference getPrimitiveIntegerVarDec_Type();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.PrimitiveBooleanVarDec <em>Primitive Boolean Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Boolean Var Dec</em>'.
	 * @see SATEL.VariableDeclarations.PrimitiveBooleanVarDec
	 * @generated
	 */
	EClass getPrimitiveBooleanVarDec();

	/**
	 * Returns the meta object for the containment reference '{@link SATEL.VariableDeclarations.PrimitiveBooleanVarDec#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see SATEL.VariableDeclarations.PrimitiveBooleanVarDec#getType()
	 * @see #getPrimitiveBooleanVarDec()
	 * @generated
	 */
	EReference getPrimitiveBooleanVarDec_Type();

	/**
	 * Returns the meta object for class '{@link SATEL.VariableDeclarations.AlgebraicSortVarDec <em>Algebraic Sort Var Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algebraic Sort Var Dec</em>'.
	 * @see SATEL.VariableDeclarations.AlgebraicSortVarDec
	 * @generated
	 */
	EClass getAlgebraicSortVarDec();

	/**
	 * Returns the meta object for the reference '{@link SATEL.VariableDeclarations.AlgebraicSortVarDec#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see SATEL.VariableDeclarations.AlgebraicSortVarDec#getType()
	 * @see #getAlgebraicSortVarDec()
	 * @generated
	 */
	EReference getAlgebraicSortVarDec_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariableDeclarationsFactory getVariableDeclarationsFactory();

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
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.impl.VariableDeclarationImpl
		 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__VARIABLE = eINSTANCE.getVariableDeclaration_Variable();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.impl.VariableDecImpl <em>Variable Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.impl.VariableDecImpl
		 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getVariableDec()
		 * @generated
		 */
		EClass VARIABLE_DEC = eINSTANCE.getVariableDec();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DEC__NAME = eINSTANCE.getVariableDec_Name();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.impl.PrimitiveHMLVarDecImpl <em>Primitive HML Var Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.impl.PrimitiveHMLVarDecImpl
		 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getPrimitiveHMLVarDec()
		 * @generated
		 */
		EClass PRIMITIVE_HML_VAR_DEC = eINSTANCE.getPrimitiveHMLVarDec();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_HML_VAR_DEC__TYPE = eINSTANCE.getPrimitiveHMLVarDec_Type();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.impl.PrimitiveStimulationVarDecImpl <em>Primitive Stimulation Var Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.impl.PrimitiveStimulationVarDecImpl
		 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getPrimitiveStimulationVarDec()
		 * @generated
		 */
		EClass PRIMITIVE_STIMULATION_VAR_DEC = eINSTANCE.getPrimitiveStimulationVarDec();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_STIMULATION_VAR_DEC__TYPE = eINSTANCE.getPrimitiveStimulationVarDec_Type();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.impl.PrimitiveObservationVarDecImpl <em>Primitive Observation Var Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.impl.PrimitiveObservationVarDecImpl
		 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getPrimitiveObservationVarDec()
		 * @generated
		 */
		EClass PRIMITIVE_OBSERVATION_VAR_DEC = eINSTANCE.getPrimitiveObservationVarDec();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_OBSERVATION_VAR_DEC__TYPE = eINSTANCE.getPrimitiveObservationVarDec_Type();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.impl.PrimitiveIntegerVarDecImpl <em>Primitive Integer Var Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.impl.PrimitiveIntegerVarDecImpl
		 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getPrimitiveIntegerVarDec()
		 * @generated
		 */
		EClass PRIMITIVE_INTEGER_VAR_DEC = eINSTANCE.getPrimitiveIntegerVarDec();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_INTEGER_VAR_DEC__TYPE = eINSTANCE.getPrimitiveIntegerVarDec_Type();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.impl.PrimitiveBooleanVarDecImpl <em>Primitive Boolean Var Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.impl.PrimitiveBooleanVarDecImpl
		 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getPrimitiveBooleanVarDec()
		 * @generated
		 */
		EClass PRIMITIVE_BOOLEAN_VAR_DEC = eINSTANCE.getPrimitiveBooleanVarDec();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_BOOLEAN_VAR_DEC__TYPE = eINSTANCE.getPrimitiveBooleanVarDec_Type();

		/**
		 * The meta object literal for the '{@link SATEL.VariableDeclarations.impl.AlgebraicSortVarDecImpl <em>Algebraic Sort Var Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SATEL.VariableDeclarations.impl.AlgebraicSortVarDecImpl
		 * @see SATEL.VariableDeclarations.impl.VariableDeclarationsPackageImpl#getAlgebraicSortVarDec()
		 * @generated
		 */
		EClass ALGEBRAIC_SORT_VAR_DEC = eINSTANCE.getAlgebraicSortVarDec();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGEBRAIC_SORT_VAR_DEC__TYPE = eINSTANCE.getAlgebraicSortVarDec_Type();

	}

} //VariableDeclarationsPackage
