/**
 * <copyright>
 * </copyright>
 *
 * $Id: DsltransFactory.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dsltrans.DsltransPackage
 * @generated
 */
public interface DsltransFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DsltransFactory eINSTANCE = dsltrans.impl.DsltransFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Transformation Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation Model</em>'.
   * @generated
   */
  TransformationModel createTransformationModel();

  /**
   * Returns a new object of class '<em>Any Match Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Match Class</em>'.
   * @generated
   */
  AnyMatchClass createAnyMatchClass();

  /**
   * Returns a new object of class '<em>Exists Match Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exists Match Class</em>'.
   * @generated
   */
  ExistsMatchClass createExistsMatchClass();

  /**
   * Returns a new object of class '<em>Negative Match Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Match Class</em>'.
   * @generated
   */
  NegativeMatchClass createNegativeMatchClass();

  /**
   * Returns a new object of class '<em>Match Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Match Model</em>'.
   * @generated
   */
  MatchModel createMatchModel();

  /**
   * Returns a new object of class '<em>Positive Indirect Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Positive Indirect Association</em>'.
   * @generated
   */
  PositiveIndirectAssociation createPositiveIndirectAssociation();

  /**
   * Returns a new object of class '<em>Negative Indirect Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Indirect Association</em>'.
   * @generated
   */
  NegativeIndirectAssociation createNegativeIndirectAssociation();

  /**
   * Returns a new object of class '<em>Positive Match Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Positive Match Association</em>'.
   * @generated
   */
  PositiveMatchAssociation createPositiveMatchAssociation();

  /**
   * Returns a new object of class '<em>Negative Match Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Match Association</em>'.
   * @generated
   */
  NegativeMatchAssociation createNegativeMatchAssociation();

  /**
   * Returns a new object of class '<em>Apply Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Apply Class</em>'.
   * @generated
   */
  ApplyClass createApplyClass();

  /**
   * Returns a new object of class '<em>Apply Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Apply Model</em>'.
   * @generated
   */
  ApplyModel createApplyModel();

  /**
   * Returns a new object of class '<em>Apply Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Apply Association</em>'.
   * @generated
   */
  ApplyAssociation createApplyAssociation();

  /**
   * Returns a new object of class '<em>Match Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Match Attribute</em>'.
   * @generated
   */
  MatchAttribute createMatchAttribute();

  /**
   * Returns a new object of class '<em>Apply Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Apply Attribute</em>'.
   * @generated
   */
  ApplyAttribute createApplyAttribute();

  /**
   * Returns a new object of class '<em>File Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Port</em>'.
   * @generated
   */
  FilePort createFilePort();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Meta Model Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Model Identifier</em>'.
   * @generated
   */
  MetaModelIdentifier createMetaModelIdentifier();

  /**
   * Returns a new object of class '<em>Positive Backward Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Positive Backward Restriction</em>'.
   * @generated
   */
  PositiveBackwardRestriction createPositiveBackwardRestriction();

  /**
   * Returns a new object of class '<em>Negative Backward Restriction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Negative Backward Restriction</em>'.
   * @generated
   */
  NegativeBackwardRestriction createNegativeBackwardRestriction();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Sequential</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequential</em>'.
   * @generated
   */
  Sequential createSequential();

  /**
   * Returns a new object of class '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom</em>'.
   * @generated
   */
  Atom createAtom();

  /**
   * Returns a new object of class '<em>Attribute Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Ref</em>'.
   * @generated
   */
  AttributeRef createAttributeRef();

  /**
   * Returns a new object of class '<em>Class Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Ref</em>'.
   * @generated
   */
  ClassRef createClassRef();

  /**
   * Returns a new object of class '<em>Concat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concat</em>'.
   * @generated
   */
  Concat createConcat();

  /**
   * Returns a new object of class '<em>Type Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Of</em>'.
   * @generated
   */
  TypeOf createTypeOf();

  /**
   * Returns a new object of class '<em>Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard</em>'.
   * @generated
   */
  Wildcard createWildcard();

  /**
   * Returns a new object of class '<em>is Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>is Null</em>'.
   * @generated
   */
  isNull createisNull();

  /**
   * Returns a new object of class '<em>Sequencer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequencer</em>'.
   * @generated
   */
  Sequencer createSequencer();

  /**
   * Returns a new object of class '<em>Attribute Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Equality</em>'.
   * @generated
   */
  AttributeEquality createAttributeEquality();

  /**
   * Returns a new object of class '<em>Attribute Inequality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Inequality</em>'.
   * @generated
   */
  AttributeInequality createAttributeInequality();

  /**
   * Returns a new object of class '<em>Match May Be Same Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Match May Be Same Relation</em>'.
   * @generated
   */
  MatchMayBeSameRelation createMatchMayBeSameRelation();

  /**
   * Returns a new object of class '<em>Apply May Be Same Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Apply May Be Same Relation</em>'.
   * @generated
   */
  ApplyMayBeSameRelation createApplyMayBeSameRelation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DsltransPackage getDsltransPackage();

} //DsltransFactory
