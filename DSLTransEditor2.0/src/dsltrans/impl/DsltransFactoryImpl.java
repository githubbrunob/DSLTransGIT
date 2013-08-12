/**
 * <copyright>
 * </copyright>
 *
 * $Id: DsltransFactoryImpl.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans.impl;

import dsltrans.*;

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
public class DsltransFactoryImpl extends EFactoryImpl implements DsltransFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DsltransFactory init()
  {
    try
    {
      DsltransFactory theDsltransFactory = (DsltransFactory)EPackage.Registry.INSTANCE.getEFactory("http://dsltrans/2.0"); 
      if (theDsltransFactory != null)
      {
        return theDsltransFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DsltransFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DsltransFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DsltransPackage.TRANSFORMATION_MODEL: return createTransformationModel();
      case DsltransPackage.ANY_MATCH_CLASS: return createAnyMatchClass();
      case DsltransPackage.EXISTS_MATCH_CLASS: return createExistsMatchClass();
      case DsltransPackage.NEGATIVE_MATCH_CLASS: return createNegativeMatchClass();
      case DsltransPackage.MATCH_MODEL: return createMatchModel();
      case DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION: return createPositiveIndirectAssociation();
      case DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION: return createNegativeIndirectAssociation();
      case DsltransPackage.POSITIVE_MATCH_ASSOCIATION: return createPositiveMatchAssociation();
      case DsltransPackage.NEGATIVE_MATCH_ASSOCIATION: return createNegativeMatchAssociation();
      case DsltransPackage.APPLY_CLASS: return createApplyClass();
      case DsltransPackage.APPLY_MODEL: return createApplyModel();
      case DsltransPackage.APPLY_ASSOCIATION: return createApplyAssociation();
      case DsltransPackage.MATCH_ATTRIBUTE: return createMatchAttribute();
      case DsltransPackage.APPLY_ATTRIBUTE: return createApplyAttribute();
      case DsltransPackage.FILE_PORT: return createFilePort();
      case DsltransPackage.RULE: return createRule();
      case DsltransPackage.META_MODEL_IDENTIFIER: return createMetaModelIdentifier();
      case DsltransPackage.POSITIVE_BACKWARD_RESTRICTION: return createPositiveBackwardRestriction();
      case DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION: return createNegativeBackwardRestriction();
      case DsltransPackage.IMPORT: return createImport();
      case DsltransPackage.SEQUENTIAL: return createSequential();
      case DsltransPackage.ATOM: return createAtom();
      case DsltransPackage.ATTRIBUTE_REF: return createAttributeRef();
      case DsltransPackage.CLASS_REF: return createClassRef();
      case DsltransPackage.CONCAT: return createConcat();
      case DsltransPackage.TYPE_OF: return createTypeOf();
      case DsltransPackage.WILDCARD: return createWildcard();
      case DsltransPackage.IS_NULL: return createisNull();
      case DsltransPackage.SEQUENCER: return createSequencer();
      case DsltransPackage.ATTRIBUTE_EQUALITY: return createAttributeEquality();
      case DsltransPackage.ATTRIBUTE_INEQUALITY: return createAttributeInequality();
      case DsltransPackage.MATCH_MAY_BE_SAME_RELATION: return createMatchMayBeSameRelation();
      case DsltransPackage.APPLY_MAY_BE_SAME_RELATION: return createApplyMayBeSameRelation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransformationModel createTransformationModel()
  {
    TransformationModelImpl transformationModel = new TransformationModelImpl();
    return transformationModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyMatchClass createAnyMatchClass()
  {
    AnyMatchClassImpl anyMatchClass = new AnyMatchClassImpl();
    return anyMatchClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExistsMatchClass createExistsMatchClass()
  {
    ExistsMatchClassImpl existsMatchClass = new ExistsMatchClassImpl();
    return existsMatchClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegativeMatchClass createNegativeMatchClass()
  {
    NegativeMatchClassImpl negativeMatchClass = new NegativeMatchClassImpl();
    return negativeMatchClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchModel createMatchModel()
  {
    MatchModelImpl matchModel = new MatchModelImpl();
    return matchModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositiveIndirectAssociation createPositiveIndirectAssociation()
  {
    PositiveIndirectAssociationImpl positiveIndirectAssociation = new PositiveIndirectAssociationImpl();
    return positiveIndirectAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegativeIndirectAssociation createNegativeIndirectAssociation()
  {
    NegativeIndirectAssociationImpl negativeIndirectAssociation = new NegativeIndirectAssociationImpl();
    return negativeIndirectAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositiveMatchAssociation createPositiveMatchAssociation()
  {
    PositiveMatchAssociationImpl positiveMatchAssociation = new PositiveMatchAssociationImpl();
    return positiveMatchAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegativeMatchAssociation createNegativeMatchAssociation()
  {
    NegativeMatchAssociationImpl negativeMatchAssociation = new NegativeMatchAssociationImpl();
    return negativeMatchAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyClass createApplyClass()
  {
    ApplyClassImpl applyClass = new ApplyClassImpl();
    return applyClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyModel createApplyModel()
  {
    ApplyModelImpl applyModel = new ApplyModelImpl();
    return applyModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyAssociation createApplyAssociation()
  {
    ApplyAssociationImpl applyAssociation = new ApplyAssociationImpl();
    return applyAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchAttribute createMatchAttribute()
  {
    MatchAttributeImpl matchAttribute = new MatchAttributeImpl();
    return matchAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyAttribute createApplyAttribute()
  {
    ApplyAttributeImpl applyAttribute = new ApplyAttributeImpl();
    return applyAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilePort createFilePort()
  {
    FilePortImpl filePort = new FilePortImpl();
    return filePort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaModelIdentifier createMetaModelIdentifier()
  {
    MetaModelIdentifierImpl metaModelIdentifier = new MetaModelIdentifierImpl();
    return metaModelIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositiveBackwardRestriction createPositiveBackwardRestriction()
  {
    PositiveBackwardRestrictionImpl positiveBackwardRestriction = new PositiveBackwardRestrictionImpl();
    return positiveBackwardRestriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NegativeBackwardRestriction createNegativeBackwardRestriction()
  {
    NegativeBackwardRestrictionImpl negativeBackwardRestriction = new NegativeBackwardRestrictionImpl();
    return negativeBackwardRestriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequential createSequential()
  {
    SequentialImpl sequential = new SequentialImpl();
    return sequential;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeRef createAttributeRef()
  {
    AttributeRefImpl attributeRef = new AttributeRefImpl();
    return attributeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassRef createClassRef()
  {
    ClassRefImpl classRef = new ClassRefImpl();
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concat createConcat()
  {
    ConcatImpl concat = new ConcatImpl();
    return concat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeOf createTypeOf()
  {
    TypeOfImpl typeOf = new TypeOfImpl();
    return typeOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wildcard createWildcard()
  {
    WildcardImpl wildcard = new WildcardImpl();
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public isNull createisNull()
  {
    isNullImpl isNull = new isNullImpl();
    return isNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequencer createSequencer()
  {
    SequencerImpl sequencer = new SequencerImpl();
    return sequencer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeEquality createAttributeEquality()
  {
    AttributeEqualityImpl attributeEquality = new AttributeEqualityImpl();
    return attributeEquality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeInequality createAttributeInequality()
  {
    AttributeInequalityImpl attributeInequality = new AttributeInequalityImpl();
    return attributeInequality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchMayBeSameRelation createMatchMayBeSameRelation()
  {
    MatchMayBeSameRelationImpl matchMayBeSameRelation = new MatchMayBeSameRelationImpl();
    return matchMayBeSameRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyMayBeSameRelation createApplyMayBeSameRelation()
  {
    ApplyMayBeSameRelationImpl applyMayBeSameRelation = new ApplyMayBeSameRelationImpl();
    return applyMayBeSameRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DsltransPackage getDsltransPackage()
  {
    return (DsltransPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DsltransPackage getPackage()
  {
    return DsltransPackage.eINSTANCE;
  }

} //DsltransFactoryImpl
