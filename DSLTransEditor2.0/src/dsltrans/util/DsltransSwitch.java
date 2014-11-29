/**
 */
package dsltrans.util;

import dsltrans.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dsltrans.DsltransPackage
 * @generated
 */
public class DsltransSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DsltransPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsltransSwitch() {
		if (modelPackage == null) {
			modelPackage = DsltransPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DsltransPackage.TRANSFORMATION_MODEL: {
				TransformationModel transformationModel = (TransformationModel)theEObject;
				T result = caseTransformationModel(transformationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = caseAbstractSource(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.MATCH_CLASS: {
				MatchClass matchClass = (MatchClass)theEObject;
				T result = caseMatchClass(matchClass);
				if (result == null) result = caseAbstractClass(matchClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.POSITIVE_MATCH_CLASS: {
				PositiveMatchClass positiveMatchClass = (PositiveMatchClass)theEObject;
				T result = casePositiveMatchClass(positiveMatchClass);
				if (result == null) result = caseMatchClass(positiveMatchClass);
				if (result == null) result = caseAbstractClass(positiveMatchClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ANY_MATCH_CLASS: {
				AnyMatchClass anyMatchClass = (AnyMatchClass)theEObject;
				T result = caseAnyMatchClass(anyMatchClass);
				if (result == null) result = casePositiveMatchClass(anyMatchClass);
				if (result == null) result = caseMatchClass(anyMatchClass);
				if (result == null) result = caseAbstractClass(anyMatchClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.EXISTS_MATCH_CLASS: {
				ExistsMatchClass existsMatchClass = (ExistsMatchClass)theEObject;
				T result = caseExistsMatchClass(existsMatchClass);
				if (result == null) result = casePositiveMatchClass(existsMatchClass);
				if (result == null) result = caseMatchClass(existsMatchClass);
				if (result == null) result = caseAbstractClass(existsMatchClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.NEGATIVE_MATCH_CLASS: {
				NegativeMatchClass negativeMatchClass = (NegativeMatchClass)theEObject;
				T result = caseNegativeMatchClass(negativeMatchClass);
				if (result == null) result = caseMatchClass(negativeMatchClass);
				if (result == null) result = caseAbstractClass(negativeMatchClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.MATCH_MODEL: {
				MatchModel matchModel = (MatchModel)theEObject;
				T result = caseMatchModel(matchModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.MATCH_ASSOCIATION: {
				MatchAssociation matchAssociation = (MatchAssociation)theEObject;
				T result = caseMatchAssociation(matchAssociation);
				if (result == null) result = caseAssociation(matchAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION: {
				PositiveIndirectAssociation positiveIndirectAssociation = (PositiveIndirectAssociation)theEObject;
				T result = casePositiveIndirectAssociation(positiveIndirectAssociation);
				if (result == null) result = caseMatchAssociation(positiveIndirectAssociation);
				if (result == null) result = caseAssociation(positiveIndirectAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION: {
				NegativeIndirectAssociation negativeIndirectAssociation = (NegativeIndirectAssociation)theEObject;
				T result = caseNegativeIndirectAssociation(negativeIndirectAssociation);
				if (result == null) result = caseMatchAssociation(negativeIndirectAssociation);
				if (result == null) result = caseAssociation(negativeIndirectAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.POSITIVE_MATCH_ASSOCIATION: {
				PositiveMatchAssociation positiveMatchAssociation = (PositiveMatchAssociation)theEObject;
				T result = casePositiveMatchAssociation(positiveMatchAssociation);
				if (result == null) result = caseMatchAssociation(positiveMatchAssociation);
				if (result == null) result = caseAssociation(positiveMatchAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.NEGATIVE_MATCH_ASSOCIATION: {
				NegativeMatchAssociation negativeMatchAssociation = (NegativeMatchAssociation)theEObject;
				T result = caseNegativeMatchAssociation(negativeMatchAssociation);
				if (result == null) result = caseMatchAssociation(negativeMatchAssociation);
				if (result == null) result = caseAssociation(negativeMatchAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.APPLY_CLASS: {
				ApplyClass applyClass = (ApplyClass)theEObject;
				T result = caseApplyClass(applyClass);
				if (result == null) result = caseAbstractClass(applyClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.APPLY_MODEL: {
				ApplyModel applyModel = (ApplyModel)theEObject;
				T result = caseApplyModel(applyModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.APPLY_ASSOCIATION: {
				ApplyAssociation applyAssociation = (ApplyAssociation)theEObject;
				T result = caseApplyAssociation(applyAssociation);
				if (result == null) result = caseAssociation(applyAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ABSTRACT_CLASS: {
				AbstractClass abstractClass = (AbstractClass)theEObject;
				T result = caseAbstractClass(abstractClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.MATCH_ATTRIBUTE: {
				MatchAttribute matchAttribute = (MatchAttribute)theEObject;
				T result = caseMatchAttribute(matchAttribute);
				if (result == null) result = caseAttribute(matchAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.APPLY_ATTRIBUTE: {
				ApplyAttribute applyAttribute = (ApplyAttribute)theEObject;
				T result = caseApplyAttribute(applyAttribute);
				if (result == null) result = caseAttribute(applyAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ABSTRACT_SOURCE: {
				AbstractSource abstractSource = (AbstractSource)theEObject;
				T result = caseAbstractSource(abstractSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.FILE_PORT: {
				FilePort filePort = (FilePort)theEObject;
				T result = caseFilePort(filePort);
				if (result == null) result = caseAbstractSource(filePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.META_MODEL_IDENTIFIER: {
				MetaModelIdentifier metaModelIdentifier = (MetaModelIdentifier)theEObject;
				T result = caseMetaModelIdentifier(metaModelIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.POSITIVE_BACKWARD_RESTRICTION: {
				PositiveBackwardRestriction positiveBackwardRestriction = (PositiveBackwardRestriction)theEObject;
				T result = casePositiveBackwardRestriction(positiveBackwardRestriction);
				if (result == null) result = caseAbstractTemporalRelation(positiveBackwardRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION: {
				NegativeBackwardRestriction negativeBackwardRestriction = (NegativeBackwardRestriction)theEObject;
				T result = caseNegativeBackwardRestriction(negativeBackwardRestriction);
				if (result == null) result = caseAbstractTemporalRelation(negativeBackwardRestriction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.SEQUENTIAL: {
				Sequential sequential = (Sequential)theEObject;
				T result = caseSequential(sequential);
				if (result == null) result = caseLayer(sequential);
				if (result == null) result = caseAbstractSource(sequential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = caseTerm(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ATOM: {
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = caseTerm(atom);
				if (result == null) result = caseMatchAttributeValue(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.REF: {
				Ref ref = (Ref)theEObject;
				T result = caseRef(ref);
				if (result == null) result = caseTerm(ref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ATTRIBUTE_REF: {
				AttributeRef attributeRef = (AttributeRef)theEObject;
				T result = caseAttributeRef(attributeRef);
				if (result == null) result = caseRef(attributeRef);
				if (result == null) result = caseTerm(attributeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.CLASS_REF: {
				ClassRef classRef = (ClassRef)theEObject;
				T result = caseClassRef(classRef);
				if (result == null) result = caseRef(classRef);
				if (result == null) result = caseTerm(classRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.CONCAT: {
				Concat concat = (Concat)theEObject;
				T result = caseConcat(concat);
				if (result == null) result = caseOperator(concat);
				if (result == null) result = caseTerm(concat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.TYPE_OF: {
				TypeOf typeOf = (TypeOf)theEObject;
				T result = caseTypeOf(typeOf);
				if (result == null) result = caseOperator(typeOf);
				if (result == null) result = caseAttributeRef(typeOf);
				if (result == null) result = caseRef(typeOf);
				if (result == null) result = caseTerm(typeOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.WILDCARD: {
				Wildcard wildcard = (Wildcard)theEObject;
				T result = caseWildcard(wildcard);
				if (result == null) result = caseTerm(wildcard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.IS_NULL: {
				isNull isNull = (isNull)theEObject;
				T result = caseisNull(isNull);
				if (result == null) result = caseMatchAttributeValue(isNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.MATCH_ATTRIBUTE_VALUE: {
				MatchAttributeValue matchAttributeValue = (MatchAttributeValue)theEObject;
				T result = caseMatchAttributeValue(matchAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ABSTRACT_TEMPORAL_RELATION: {
				AbstractTemporalRelation abstractTemporalRelation = (AbstractTemporalRelation)theEObject;
				T result = caseAbstractTemporalRelation(abstractTemporalRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.SEQUENCER: {
				Sequencer sequencer = (Sequencer)theEObject;
				T result = caseSequencer(sequencer);
				if (result == null) result = caseTerm(sequencer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ABSTRACT_ATTRIBUTE_RELATION: {
				AbstractAttributeRelation abstractAttributeRelation = (AbstractAttributeRelation)theEObject;
				T result = caseAbstractAttributeRelation(abstractAttributeRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ATTRIBUTE_EQUALITY: {
				AttributeEquality attributeEquality = (AttributeEquality)theEObject;
				T result = caseAttributeEquality(attributeEquality);
				if (result == null) result = caseAbstractAttributeRelation(attributeEquality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.ATTRIBUTE_INEQUALITY: {
				AttributeInequality attributeInequality = (AttributeInequality)theEObject;
				T result = caseAttributeInequality(attributeInequality);
				if (result == null) result = caseAbstractAttributeRelation(attributeInequality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.MATCH_MAY_BE_SAME_RELATION: {
				MatchMayBeSameRelation matchMayBeSameRelation = (MatchMayBeSameRelation)theEObject;
				T result = caseMatchMayBeSameRelation(matchMayBeSameRelation);
				if (result == null) result = caseMatchAssociation(matchMayBeSameRelation);
				if (result == null) result = caseAssociation(matchMayBeSameRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DsltransPackage.APPLY_MAY_BE_SAME_RELATION: {
				ApplyMayBeSameRelation applyMayBeSameRelation = (ApplyMayBeSameRelation)theEObject;
				T result = caseApplyMayBeSameRelation(applyMayBeSameRelation);
				if (result == null) result = caseApplyAssociation(applyMayBeSameRelation);
				if (result == null) result = caseAssociation(applyMayBeSameRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationModel(TransformationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchClass(MatchClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Match Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Match Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveMatchClass(PositiveMatchClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Match Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Match Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyMatchClass(AnyMatchClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exists Match Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exists Match Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistsMatchClass(ExistsMatchClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Match Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Match Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeMatchClass(NegativeMatchClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchModel(MatchModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchAssociation(MatchAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Indirect Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Indirect Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveIndirectAssociation(PositiveIndirectAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Indirect Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Indirect Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeIndirectAssociation(NegativeIndirectAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Match Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Match Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveMatchAssociation(PositiveMatchAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Match Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Match Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeMatchAssociation(NegativeMatchAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyClass(ApplyClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyModel(ApplyModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyAssociation(ApplyAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractClass(AbstractClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchAttribute(MatchAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyAttribute(ApplyAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSource(AbstractSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilePort(FilePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Model Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Model Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaModelIdentifier(MetaModelIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Backward Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Backward Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveBackwardRestriction(PositiveBackwardRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Backward Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Backward Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeBackwardRestriction(NegativeBackwardRestriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequential(Sequential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRef(Ref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeRef(AttributeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassRef(ClassRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcat(Concat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOf(TypeOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wildcard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wildcard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildcard(Wildcard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>is Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>is Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseisNull(isNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchAttributeValue(MatchAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Temporal Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Temporal Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTemporalRelation(AbstractTemporalRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequencer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequencer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequencer(Sequencer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Attribute Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Attribute Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAttributeRelation(AbstractAttributeRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeEquality(AttributeEquality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Inequality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Inequality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeInequality(AttributeInequality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match May Be Same Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match May Be Same Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchMayBeSameRelation(MatchMayBeSameRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apply May Be Same Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apply May Be Same Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplyMayBeSameRelation(ApplyMayBeSameRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DsltransSwitch
