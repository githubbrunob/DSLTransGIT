/**
 * <copyright>
 * </copyright>
 *
 * $Id: HMLFormulaFactoryImpl.java,v 1.1 2011/09/27 18:59:51 domingues Exp $
 */
package SATEL.HMLFormula.impl;

import SATEL.HMLFormula.*;

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
public class HMLFormulaFactoryImpl extends EFactoryImpl implements HMLFormulaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HMLFormulaFactory init() {
		try {
			HMLFormulaFactory theHMLFormulaFactory = (HMLFormulaFactory)EPackage.Registry.INSTANCE.getEFactory("SATEL.HMLFormula"); 
			if (theHMLFormulaFactory != null) {
				return theHMLFormulaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HMLFormulaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLFormulaFactoryImpl() {
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
			case HMLFormulaPackage.HML_TERM: return createHMLTerm();
			case HMLFormulaPackage.HML_FORMULA_HML_FORMULA_CONTENT: return createHMLFormulaHMLFormulaContent();
			case HMLFormulaPackage.HML_FORMULA_PRIMITIVE_HML_VAR_DEC: return createHMLFormulaPrimitiveHMLVarDec();
			case HMLFormulaPackage.HML_NEXT: return createHMLNext();
			case HMLFormulaPackage.HML_NOT: return createHMLNot();
			case HMLFormulaPackage.HML_AND: return createHMLAnd();
			case HMLFormulaPackage.HML_TOP: return createHMLTop();
			case HMLFormulaPackage.HML_EVENT: return createHMLEvent();
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_INPUT_TERM: return createSynchronizationEventInputTerm();
			case HMLFormulaPackage.SYNCHRONIZATION_EVENT_OUTPUT_TERM: return createSynchronizationEventOutputTerm();
			case HMLFormulaPackage.WPRIMITIVE_OBSERVATION_VAR_DEC: return createWPrimitiveObservationVarDec();
			case HMLFormulaPackage.WPRIMITIVE_STIMULATION_VAR_DEC: return createWPrimitiveStimulationVarDec();
			case HMLFormulaPackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLTerm createHMLTerm() {
		HMLTermImpl hmlTerm = new HMLTermImpl();
		return hmlTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLFormulaHMLFormulaContent createHMLFormulaHMLFormulaContent() {
		HMLFormulaHMLFormulaContentImpl hmlFormulaHMLFormulaContent = new HMLFormulaHMLFormulaContentImpl();
		return hmlFormulaHMLFormulaContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLFormulaPrimitiveHMLVarDec createHMLFormulaPrimitiveHMLVarDec() {
		HMLFormulaPrimitiveHMLVarDecImpl hmlFormulaPrimitiveHMLVarDec = new HMLFormulaPrimitiveHMLVarDecImpl();
		return hmlFormulaPrimitiveHMLVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLNext createHMLNext() {
		HMLNextImpl hmlNext = new HMLNextImpl();
		return hmlNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLNot createHMLNot() {
		HMLNotImpl hmlNot = new HMLNotImpl();
		return hmlNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLAnd createHMLAnd() {
		HMLAndImpl hmlAnd = new HMLAndImpl();
		return hmlAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLTop createHMLTop() {
		HMLTopImpl hmlTop = new HMLTopImpl();
		return hmlTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLEvent createHMLEvent() {
		HMLEventImpl hmlEvent = new HMLEventImpl();
		return hmlEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationEventInputTerm createSynchronizationEventInputTerm() {
		SynchronizationEventInputTermImpl synchronizationEventInputTerm = new SynchronizationEventInputTermImpl();
		return synchronizationEventInputTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationEventOutputTerm createSynchronizationEventOutputTerm() {
		SynchronizationEventOutputTermImpl synchronizationEventOutputTerm = new SynchronizationEventOutputTermImpl();
		return synchronizationEventOutputTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WPrimitiveObservationVarDec createWPrimitiveObservationVarDec() {
		WPrimitiveObservationVarDecImpl wPrimitiveObservationVarDec = new WPrimitiveObservationVarDecImpl();
		return wPrimitiveObservationVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WPrimitiveStimulationVarDec createWPrimitiveStimulationVarDec() {
		WPrimitiveStimulationVarDecImpl wPrimitiveStimulationVarDec = new WPrimitiveStimulationVarDecImpl();
		return wPrimitiveStimulationVarDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMLFormulaPackage getHMLFormulaPackage() {
		return (HMLFormulaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HMLFormulaPackage getPackage() {
		return HMLFormulaPackage.eINSTANCE;
	}

} //HMLFormulaFactoryImpl
