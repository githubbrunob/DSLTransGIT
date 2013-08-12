/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SOS.adtmm.impl;

import SOS.adtmm.*;

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
public class AdtmmFactoryImpl extends EFactoryImpl implements AdtmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdtmmFactory init() {
		try {
			AdtmmFactory theAdtmmFactory = (AdtmmFactory)EPackage.Registry.INSTANCE.getEFactory("SOS.adtmm"); 
			if (theAdtmmFactory != null) {
				return theAdtmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdtmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdtmmFactoryImpl() {
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
			case AdtmmPackage.ADT: return createADT();
			case AdtmmPackage.OPERATION: return createOperation();
			case AdtmmPackage.VARIABLE: return createVariable();
			case AdtmmPackage.COND_EQUATION: return createCondEquation();
			case AdtmmPackage.VARIABLE_REF: return createVariableRef();
			case AdtmmPackage.CTERM: return createCTerm();
			case AdtmmPackage.EQUATION: return createEquation();
			case AdtmmPackage.INEQUATION: return createInequation();
			case AdtmmPackage.ATOMIC_SORT: return createAtomicSort();
			case AdtmmPackage.SORT_DECLARATION: return createSortDeclaration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADT createADT() {
		ADTImpl adt = new ADTImpl();
		return adt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CondEquation createCondEquation() {
		CondEquationImpl condEquation = new CondEquationImpl();
		return condEquation;
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
	public CTerm createCTerm() {
		CTermImpl cTerm = new CTermImpl();
		return cTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equation createEquation() {
		EquationImpl equation = new EquationImpl();
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inequation createInequation() {
		InequationImpl inequation = new InequationImpl();
		return inequation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicSort createAtomicSort() {
		AtomicSortImpl atomicSort = new AtomicSortImpl();
		return atomicSort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDeclaration createSortDeclaration() {
		SortDeclarationImpl sortDeclaration = new SortDeclarationImpl();
		return sortDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdtmmPackage getAdtmmPackage() {
		return (AdtmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdtmmPackage getPackage() {
		return AdtmmPackage.eINSTANCE;
	}

} //AdtmmFactoryImpl
