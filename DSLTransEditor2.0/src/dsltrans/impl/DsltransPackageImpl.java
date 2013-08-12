/**
 * <copyright>
 * </copyright>
 *
 * $Id: DsltransPackageImpl.java,v 1.3 2012/02/04 21:18:33 claudiogomes Exp $
 */
package dsltrans.impl;

import dsltrans.AbstractAttributeRelation;
import dsltrans.AbstractClass;
import dsltrans.AbstractSource;
import dsltrans.AbstractTemporalRelation;
import dsltrans.AnyMatchClass;
import dsltrans.ApplyAssociation;
import dsltrans.ApplyAttribute;
import dsltrans.ApplyClass;
import dsltrans.ApplyMayBeSameRelation;
import dsltrans.ApplyModel;
import dsltrans.Association;
import dsltrans.Atom;
import dsltrans.Attribute;
import dsltrans.AttributeEquality;
import dsltrans.AttributeInequality;
import dsltrans.AttributeRef;
import dsltrans.ClassRef;
import dsltrans.Concat;
import dsltrans.DsltransFactory;
import dsltrans.DsltransPackage;
import dsltrans.ExistsMatchClass;
import dsltrans.FilePort;
import dsltrans.Import;
import dsltrans.Layer;
import dsltrans.MatchAssociation;
import dsltrans.MatchAttribute;
import dsltrans.MatchAttributeValue;
import dsltrans.MatchClass;
import dsltrans.MatchMayBeSameRelation;
import dsltrans.MatchModel;
import dsltrans.MetaModelIdentifier;
import dsltrans.NegativeBackwardRestriction;
import dsltrans.NegativeIndirectAssociation;
import dsltrans.NegativeMatchAssociation;
import dsltrans.NegativeMatchClass;
import dsltrans.Operator;
import dsltrans.PositiveBackwardRestriction;
import dsltrans.PositiveIndirectAssociation;
import dsltrans.PositiveMatchAssociation;
import dsltrans.PositiveMatchClass;
import dsltrans.Ref;
import dsltrans.Rule;
import dsltrans.Sequencer;
import dsltrans.Sequential;
import dsltrans.Term;
import dsltrans.TransformationModel;
import dsltrans.TypeOf;
import dsltrans.Wildcard;
import dsltrans.isNull;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsltransPackageImpl extends EPackageImpl implements DsltransPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transformationModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positiveMatchClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyMatchClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass existsMatchClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeMatchClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positiveIndirectAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeIndirectAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positiveMatchAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeMatchAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applyClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applyModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applyAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass associationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applyAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filePortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaModelIdentifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positiveBackwardRestrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeBackwardRestrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequentialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isNullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchAttributeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractTemporalRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequencerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractAttributeRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEqualityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeInequalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchMayBeSameRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applyMayBeSameRelationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see dsltrans.DsltransPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DsltransPackageImpl()
  {
    super(eNS_URI, DsltransFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DsltransPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DsltransPackage init()
  {
    if (isInited) return (DsltransPackage)EPackage.Registry.INSTANCE.getEPackage(DsltransPackage.eNS_URI);

    // Obtain or create and register package
    DsltransPackageImpl theDsltransPackage = (DsltransPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DsltransPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DsltransPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDsltransPackage.createPackageContents();

    // Initialize created meta-data
    theDsltransPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDsltransPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DsltransPackage.eNS_URI, theDsltransPackage);
    return theDsltransPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransformationModel()
  {
    return transformationModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransformationModel_Source()
  {
    return (EReference)transformationModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayer()
  {
    return layerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayer_Description()
  {
    return (EAttribute)layerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayer_PreviousSource()
  {
    return (EReference)layerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayer_OutputFilePathURI()
  {
    return (EAttribute)layerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLayer_HasRule()
  {
    return (EReference)layerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLayer_GroupName()
  {
    return (EAttribute)layerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchClass()
  {
    return matchClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchClass_Attribute()
  {
    return (EReference)matchClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositiveMatchClass()
  {
    return positiveMatchClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyMatchClass()
  {
    return anyMatchClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExistsMatchClass()
  {
    return existsMatchClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegativeMatchClass()
  {
    return negativeMatchClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchModel()
  {
    return matchModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchModel_Class()
  {
    return (EReference)matchModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchModel_Association()
  {
    return (EReference)matchModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchModel_ExplicitSource()
  {
    return (EReference)matchModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchAssociation()
  {
    return matchAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchAssociation_Source()
  {
    return (EReference)matchAssociationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchAssociation_Target()
  {
    return (EReference)matchAssociationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositiveIndirectAssociation()
  {
    return positiveIndirectAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegativeIndirectAssociation()
  {
    return negativeIndirectAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositiveMatchAssociation()
  {
    return positiveMatchAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegativeMatchAssociation()
  {
    return negativeMatchAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplyClass()
  {
    return applyClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplyClass_Attribute()
  {
    return (EReference)applyClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplyClass_GroupName()
  {
    return (EAttribute)applyClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplyModel()
  {
    return applyModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplyModel_Class()
  {
    return (EReference)applyModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplyModel_Association()
  {
    return (EReference)applyModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplyAssociation()
  {
    return applyAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplyAssociation_Source()
  {
    return (EReference)applyAssociationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplyAssociation_Target()
  {
    return (EReference)applyAssociationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractClass()
  {
    return abstractClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractClass_Description()
  {
    return (EAttribute)abstractClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractClass_PackageName()
  {
    return (EAttribute)abstractClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractClass_ClassName()
  {
    return (EAttribute)abstractClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractClass_AllowInheritance()
  {
    return (EAttribute)abstractClassEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractClass_Id()
  {
    return (EAttribute)abstractClassEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssociation()
  {
    return associationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociation_AssociationName()
  {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchAttribute()
  {
    return matchAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatchAttribute_AttributeValue()
  {
    return (EReference)matchAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplyAttribute()
  {
    return applyAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplyAttribute_AttributeValue()
  {
    return (EReference)applyAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractSource()
  {
    return abstractSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractSource_MetaModelId()
  {
    return (EReference)abstractSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractSource_Name()
  {
    return (EAttribute)abstractSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilePort()
  {
    return filePortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilePort_FilePathURI()
  {
    return (EAttribute)filePortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Description()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Match()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Apply()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Backwards()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Imports()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_AttributeRelations()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaModelIdentifier()
  {
    return metaModelIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaModelIdentifier_MetaModelURI()
  {
    return (EAttribute)metaModelIdentifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaModelIdentifier_MetaModelName()
  {
    return (EAttribute)metaModelIdentifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositiveBackwardRestriction()
  {
    return positiveBackwardRestrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegativeBackwardRestriction()
  {
    return negativeBackwardRestrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImport_Target()
  {
    return (EReference)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImport_Source()
  {
    return (EReference)importEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequential()
  {
    return sequentialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtom()
  {
    return atomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtom_Value()
  {
    return (EAttribute)atomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef()
  {
    return refEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeRef()
  {
    return attributeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeRef_AttributeRef()
  {
    return (EReference)attributeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassRef()
  {
    return classRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassRef_ClassRef()
  {
    return (EReference)classRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcat()
  {
    return concatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcat_LeftTerm()
  {
    return (EReference)concatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcat_RightTerm()
  {
    return (EReference)concatEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeOf()
  {
    return typeOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcard()
  {
    return wildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_AttributeName()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Description()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Id()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getisNull()
  {
    return isNullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getisNull_Value()
  {
    return (EAttribute)isNullEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchAttributeValue()
  {
    return matchAttributeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractTemporalRelation()
  {
    return abstractTemporalRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractTemporalRelation_TargetClass()
  {
    return (EReference)abstractTemporalRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractTemporalRelation_SourceClass()
  {
    return (EReference)abstractTemporalRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequencer()
  {
    return sequencerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractAttributeRelation()
  {
    return abstractAttributeRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractAttributeRelation_SourceAttribute()
  {
    return (EReference)abstractAttributeRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractAttributeRelation_TargetAttribute()
  {
    return (EReference)abstractAttributeRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeEquality()
  {
    return attributeEqualityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeInequality()
  {
    return attributeInequalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatchMayBeSameRelation()
  {
    return matchMayBeSameRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplyMayBeSameRelation()
  {
    return applyMayBeSameRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DsltransFactory getDsltransFactory()
  {
    return (DsltransFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    transformationModelEClass = createEClass(TRANSFORMATION_MODEL);
    createEReference(transformationModelEClass, TRANSFORMATION_MODEL__SOURCE);

    layerEClass = createEClass(LAYER);
    createEAttribute(layerEClass, LAYER__DESCRIPTION);
    createEReference(layerEClass, LAYER__PREVIOUS_SOURCE);
    createEAttribute(layerEClass, LAYER__OUTPUT_FILE_PATH_URI);
    createEReference(layerEClass, LAYER__HAS_RULE);
    createEAttribute(layerEClass, LAYER__GROUP_NAME);

    matchClassEClass = createEClass(MATCH_CLASS);
    createEReference(matchClassEClass, MATCH_CLASS__ATTRIBUTE);

    positiveMatchClassEClass = createEClass(POSITIVE_MATCH_CLASS);

    anyMatchClassEClass = createEClass(ANY_MATCH_CLASS);

    existsMatchClassEClass = createEClass(EXISTS_MATCH_CLASS);

    negativeMatchClassEClass = createEClass(NEGATIVE_MATCH_CLASS);

    matchModelEClass = createEClass(MATCH_MODEL);
    createEReference(matchModelEClass, MATCH_MODEL__CLASS);
    createEReference(matchModelEClass, MATCH_MODEL__ASSOCIATION);
    createEReference(matchModelEClass, MATCH_MODEL__EXPLICIT_SOURCE);

    matchAssociationEClass = createEClass(MATCH_ASSOCIATION);
    createEReference(matchAssociationEClass, MATCH_ASSOCIATION__SOURCE);
    createEReference(matchAssociationEClass, MATCH_ASSOCIATION__TARGET);

    positiveIndirectAssociationEClass = createEClass(POSITIVE_INDIRECT_ASSOCIATION);

    negativeIndirectAssociationEClass = createEClass(NEGATIVE_INDIRECT_ASSOCIATION);

    positiveMatchAssociationEClass = createEClass(POSITIVE_MATCH_ASSOCIATION);

    negativeMatchAssociationEClass = createEClass(NEGATIVE_MATCH_ASSOCIATION);

    applyClassEClass = createEClass(APPLY_CLASS);
    createEReference(applyClassEClass, APPLY_CLASS__ATTRIBUTE);
    createEAttribute(applyClassEClass, APPLY_CLASS__GROUP_NAME);

    applyModelEClass = createEClass(APPLY_MODEL);
    createEReference(applyModelEClass, APPLY_MODEL__CLASS);
    createEReference(applyModelEClass, APPLY_MODEL__ASSOCIATION);

    applyAssociationEClass = createEClass(APPLY_ASSOCIATION);
    createEReference(applyAssociationEClass, APPLY_ASSOCIATION__SOURCE);
    createEReference(applyAssociationEClass, APPLY_ASSOCIATION__TARGET);

    abstractClassEClass = createEClass(ABSTRACT_CLASS);
    createEAttribute(abstractClassEClass, ABSTRACT_CLASS__DESCRIPTION);
    createEAttribute(abstractClassEClass, ABSTRACT_CLASS__PACKAGE_NAME);
    createEAttribute(abstractClassEClass, ABSTRACT_CLASS__CLASS_NAME);
    createEAttribute(abstractClassEClass, ABSTRACT_CLASS__ALLOW_INHERITANCE);
    createEAttribute(abstractClassEClass, ABSTRACT_CLASS__ID);

    associationEClass = createEClass(ASSOCIATION);
    createEAttribute(associationEClass, ASSOCIATION__ASSOCIATION_NAME);

    matchAttributeEClass = createEClass(MATCH_ATTRIBUTE);
    createEReference(matchAttributeEClass, MATCH_ATTRIBUTE__ATTRIBUTE_VALUE);

    applyAttributeEClass = createEClass(APPLY_ATTRIBUTE);
    createEReference(applyAttributeEClass, APPLY_ATTRIBUTE__ATTRIBUTE_VALUE);

    abstractSourceEClass = createEClass(ABSTRACT_SOURCE);
    createEReference(abstractSourceEClass, ABSTRACT_SOURCE__META_MODEL_ID);
    createEAttribute(abstractSourceEClass, ABSTRACT_SOURCE__NAME);

    filePortEClass = createEClass(FILE_PORT);
    createEAttribute(filePortEClass, FILE_PORT__FILE_PATH_URI);

    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__DESCRIPTION);
    createEReference(ruleEClass, RULE__MATCH);
    createEReference(ruleEClass, RULE__APPLY);
    createEReference(ruleEClass, RULE__BACKWARDS);
    createEReference(ruleEClass, RULE__IMPORTS);
    createEReference(ruleEClass, RULE__ATTRIBUTE_RELATIONS);

    metaModelIdentifierEClass = createEClass(META_MODEL_IDENTIFIER);
    createEAttribute(metaModelIdentifierEClass, META_MODEL_IDENTIFIER__META_MODEL_URI);
    createEAttribute(metaModelIdentifierEClass, META_MODEL_IDENTIFIER__META_MODEL_NAME);

    positiveBackwardRestrictionEClass = createEClass(POSITIVE_BACKWARD_RESTRICTION);

    negativeBackwardRestrictionEClass = createEClass(NEGATIVE_BACKWARD_RESTRICTION);

    importEClass = createEClass(IMPORT);
    createEReference(importEClass, IMPORT__TARGET);
    createEReference(importEClass, IMPORT__SOURCE);

    sequentialEClass = createEClass(SEQUENTIAL);

    termEClass = createEClass(TERM);

    operatorEClass = createEClass(OPERATOR);

    atomEClass = createEClass(ATOM);
    createEAttribute(atomEClass, ATOM__VALUE);

    refEClass = createEClass(REF);

    attributeRefEClass = createEClass(ATTRIBUTE_REF);
    createEReference(attributeRefEClass, ATTRIBUTE_REF__ATTRIBUTE_REF);

    classRefEClass = createEClass(CLASS_REF);
    createEReference(classRefEClass, CLASS_REF__CLASS_REF);

    concatEClass = createEClass(CONCAT);
    createEReference(concatEClass, CONCAT__LEFT_TERM);
    createEReference(concatEClass, CONCAT__RIGHT_TERM);

    typeOfEClass = createEClass(TYPE_OF);

    wildcardEClass = createEClass(WILDCARD);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__DESCRIPTION);
    createEAttribute(attributeEClass, ATTRIBUTE__ID);

    isNullEClass = createEClass(IS_NULL);
    createEAttribute(isNullEClass, IS_NULL__VALUE);

    matchAttributeValueEClass = createEClass(MATCH_ATTRIBUTE_VALUE);

    abstractTemporalRelationEClass = createEClass(ABSTRACT_TEMPORAL_RELATION);
    createEReference(abstractTemporalRelationEClass, ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS);
    createEReference(abstractTemporalRelationEClass, ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS);

    sequencerEClass = createEClass(SEQUENCER);

    abstractAttributeRelationEClass = createEClass(ABSTRACT_ATTRIBUTE_RELATION);
    createEReference(abstractAttributeRelationEClass, ABSTRACT_ATTRIBUTE_RELATION__SOURCE_ATTRIBUTE);
    createEReference(abstractAttributeRelationEClass, ABSTRACT_ATTRIBUTE_RELATION__TARGET_ATTRIBUTE);

    attributeEqualityEClass = createEClass(ATTRIBUTE_EQUALITY);

    attributeInequalityEClass = createEClass(ATTRIBUTE_INEQUALITY);

    matchMayBeSameRelationEClass = createEClass(MATCH_MAY_BE_SAME_RELATION);

    applyMayBeSameRelationEClass = createEClass(APPLY_MAY_BE_SAME_RELATION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    layerEClass.getESuperTypes().add(this.getAbstractSource());
    matchClassEClass.getESuperTypes().add(this.getAbstractClass());
    positiveMatchClassEClass.getESuperTypes().add(this.getMatchClass());
    anyMatchClassEClass.getESuperTypes().add(this.getPositiveMatchClass());
    existsMatchClassEClass.getESuperTypes().add(this.getPositiveMatchClass());
    negativeMatchClassEClass.getESuperTypes().add(this.getMatchClass());
    matchAssociationEClass.getESuperTypes().add(this.getAssociation());
    positiveIndirectAssociationEClass.getESuperTypes().add(this.getMatchAssociation());
    negativeIndirectAssociationEClass.getESuperTypes().add(this.getMatchAssociation());
    positiveMatchAssociationEClass.getESuperTypes().add(this.getMatchAssociation());
    negativeMatchAssociationEClass.getESuperTypes().add(this.getMatchAssociation());
    applyClassEClass.getESuperTypes().add(this.getAbstractClass());
    applyAssociationEClass.getESuperTypes().add(this.getAssociation());
    matchAttributeEClass.getESuperTypes().add(this.getAttribute());
    applyAttributeEClass.getESuperTypes().add(this.getAttribute());
    filePortEClass.getESuperTypes().add(this.getAbstractSource());
    positiveBackwardRestrictionEClass.getESuperTypes().add(this.getAbstractTemporalRelation());
    negativeBackwardRestrictionEClass.getESuperTypes().add(this.getAbstractTemporalRelation());
    sequentialEClass.getESuperTypes().add(this.getLayer());
    operatorEClass.getESuperTypes().add(this.getTerm());
    atomEClass.getESuperTypes().add(this.getTerm());
    atomEClass.getESuperTypes().add(this.getMatchAttributeValue());
    refEClass.getESuperTypes().add(this.getTerm());
    attributeRefEClass.getESuperTypes().add(this.getRef());
    classRefEClass.getESuperTypes().add(this.getRef());
    concatEClass.getESuperTypes().add(this.getOperator());
    typeOfEClass.getESuperTypes().add(this.getOperator());
    typeOfEClass.getESuperTypes().add(this.getAttributeRef());
    wildcardEClass.getESuperTypes().add(this.getTerm());
    isNullEClass.getESuperTypes().add(this.getMatchAttributeValue());
    sequencerEClass.getESuperTypes().add(this.getTerm());
    attributeEqualityEClass.getESuperTypes().add(this.getAbstractAttributeRelation());
    attributeInequalityEClass.getESuperTypes().add(this.getAbstractAttributeRelation());
    matchMayBeSameRelationEClass.getESuperTypes().add(this.getMatchAssociation());
    applyMayBeSameRelationEClass.getESuperTypes().add(this.getApplyAssociation());

    // Initialize classes and features; add operations and parameters
    initEClass(transformationModelEClass, TransformationModel.class, "TransformationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransformationModel_Source(), this.getAbstractSource(), null, "source", null, 0, -1, TransformationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(layerEClass, Layer.class, "Layer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLayer_Description(), ecorePackage.getEString(), "description", "Layer", 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayer_PreviousSource(), this.getAbstractSource(), null, "previousSource", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLayer_OutputFilePathURI(), ecorePackage.getEString(), "outputFilePathURI", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLayer_HasRule(), this.getRule(), null, "hasRule", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLayer_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchClassEClass, MatchClass.class, "MatchClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatchClass_Attribute(), this.getMatchAttribute(), null, "attribute", null, 0, -1, MatchClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(positiveMatchClassEClass, PositiveMatchClass.class, "PositiveMatchClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anyMatchClassEClass, AnyMatchClass.class, "AnyMatchClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(existsMatchClassEClass, ExistsMatchClass.class, "ExistsMatchClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negativeMatchClassEClass, NegativeMatchClass.class, "NegativeMatchClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(matchModelEClass, MatchModel.class, "MatchModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatchModel_Class(), this.getMatchClass(), null, "class", null, 0, -1, MatchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatchModel_Association(), this.getMatchAssociation(), null, "association", null, 0, -1, MatchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatchModel_ExplicitSource(), this.getFilePort(), null, "explicitSource", null, 0, 1, MatchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchAssociationEClass, MatchAssociation.class, "MatchAssociation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatchAssociation_Source(), this.getMatchClass(), null, "source", null, 1, 1, MatchAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatchAssociation_Target(), this.getMatchClass(), null, "target", null, 1, 1, MatchAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(positiveIndirectAssociationEClass, PositiveIndirectAssociation.class, "PositiveIndirectAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negativeIndirectAssociationEClass, NegativeIndirectAssociation.class, "NegativeIndirectAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(positiveMatchAssociationEClass, PositiveMatchAssociation.class, "PositiveMatchAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negativeMatchAssociationEClass, NegativeMatchAssociation.class, "NegativeMatchAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(applyClassEClass, ApplyClass.class, "ApplyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplyClass_Attribute(), this.getApplyAttribute(), null, "attribute", null, 0, -1, ApplyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplyClass_GroupName(), ecorePackage.getEString(), "groupName", null, 0, 1, ApplyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applyModelEClass, ApplyModel.class, "ApplyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplyModel_Class(), this.getApplyClass(), null, "class", null, 0, -1, ApplyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplyModel_Association(), this.getApplyAssociation(), null, "association", null, 0, -1, ApplyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applyAssociationEClass, ApplyAssociation.class, "ApplyAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplyAssociation_Source(), this.getApplyClass(), null, "source", null, 1, 1, ApplyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplyAssociation_Target(), this.getApplyClass(), null, "target", null, 1, 1, ApplyAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractClassEClass, AbstractClass.class, "AbstractClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, AbstractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractClass_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, AbstractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractClass_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, AbstractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractClass_AllowInheritance(), ecorePackage.getEBoolean(), "allowInheritance", "true", 0, 1, AbstractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractClass_Id(), ecorePackage.getEString(), "id", null, 0, 1, AbstractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(associationEClass, Association.class, "Association", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssociation_AssociationName(), ecorePackage.getEString(), "associationName", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchAttributeEClass, MatchAttribute.class, "MatchAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatchAttribute_AttributeValue(), this.getMatchAttributeValue(), null, "attributeValue", null, 0, 1, MatchAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applyAttributeEClass, ApplyAttribute.class, "ApplyAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplyAttribute_AttributeValue(), this.getTerm(), null, "attributeValue", null, 0, 1, ApplyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractSourceEClass, AbstractSource.class, "AbstractSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractSource_MetaModelId(), this.getMetaModelIdentifier(), null, "metaModelId", null, 1, 1, AbstractSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractSource_Name(), ecorePackage.getEString(), "name", "", 0, 1, AbstractSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filePortEClass, FilePort.class, "FilePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFilePort_FilePathURI(), ecorePackage.getEString(), "filePathURI", null, 0, 1, FilePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Description(), ecorePackage.getEString(), "description", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Match(), this.getMatchModel(), null, "match", null, 1, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Apply(), this.getApplyModel(), null, "apply", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Backwards(), this.getAbstractTemporalRelation(), null, "backwards", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Imports(), this.getImport(), null, "imports", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_AttributeRelations(), this.getAbstractAttributeRelation(), null, "attributeRelations", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaModelIdentifierEClass, MetaModelIdentifier.class, "MetaModelIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaModelIdentifier_MetaModelURI(), ecorePackage.getEString(), "metaModelURI", null, 0, 1, MetaModelIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaModelIdentifier_MetaModelName(), ecorePackage.getEString(), "metaModelName", null, 0, 1, MetaModelIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(positiveBackwardRestrictionEClass, PositiveBackwardRestriction.class, "PositiveBackwardRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(negativeBackwardRestrictionEClass, NegativeBackwardRestriction.class, "NegativeBackwardRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImport_Target(), this.getApplyClass(), null, "target", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImport_Source(), this.getPositiveMatchClass(), null, "source", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequentialEClass, Sequential.class, "Sequential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtom_Value(), ecorePackage.getEString(), "value", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refEClass, Ref.class, "Ref", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeRefEClass, AttributeRef.class, "AttributeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeRef_AttributeRef(), this.getAttribute(), null, "attributeRef", null, 1, 1, AttributeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classRefEClass, ClassRef.class, "ClassRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassRef_ClassRef(), this.getAbstractClass(), null, "classRef", null, 1, 1, ClassRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concatEClass, Concat.class, "Concat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConcat_LeftTerm(), this.getTerm(), null, "leftTerm", null, 1, 1, Concat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcat_RightTerm(), this.getTerm(), null, "rightTerm", null, 1, 1, Concat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeOfEClass, TypeOf.class, "TypeOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardEClass, Wildcard.class, "Wildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Description(), ecorePackage.getEString(), "description", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Id(), ecorePackage.getEString(), "id", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isNullEClass, isNull.class, "isNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getisNull_Value(), ecorePackage.getEBoolean(), "value", "true", 0, 1, isNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchAttributeValueEClass, MatchAttributeValue.class, "MatchAttributeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractTemporalRelationEClass, AbstractTemporalRelation.class, "AbstractTemporalRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractTemporalRelation_TargetClass(), this.getApplyClass(), null, "targetClass", null, 1, 1, AbstractTemporalRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractTemporalRelation_SourceClass(), this.getPositiveMatchClass(), null, "sourceClass", null, 1, 1, AbstractTemporalRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequencerEClass, Sequencer.class, "Sequencer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractAttributeRelationEClass, AbstractAttributeRelation.class, "AbstractAttributeRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractAttributeRelation_SourceAttribute(), this.getAttribute(), null, "sourceAttribute", null, 0, 1, AbstractAttributeRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractAttributeRelation_TargetAttribute(), this.getAttribute(), null, "targetAttribute", null, 0, 1, AbstractAttributeRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEqualityEClass, AttributeEquality.class, "AttributeEquality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeInequalityEClass, AttributeInequality.class, "AttributeInequality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(matchMayBeSameRelationEClass, MatchMayBeSameRelation.class, "MatchMayBeSameRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(applyMayBeSameRelationEClass, ApplyMayBeSameRelation.class, "ApplyMayBeSameRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.link
    createGmf_3Annotations();
    // gmf.compartment
    createGmf_4Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																																																												
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (transformationModelEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																																																											
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (layerEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });				
    addAnnotation
      (matchClassEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (positiveMatchClassEClass, 
       source, 
       new String[] 
       {
       "border.color", "204,255,153"
       });		
    addAnnotation
      (anyMatchClassEClass, 
       source, 
       new String[] 
       {
       "tool.description", "Match any class."
       });		
    addAnnotation
      (existsMatchClassEClass, 
       source, 
       new String[] 
       {
       "tool.description", "Match at most one class."
       });		
    addAnnotation
      (negativeMatchClassEClass, 
       source, 
       new String[] 
       {
       "border.color", "255,61,100",
       "tool.description", "Exclude class from pattern."
       });		
    addAnnotation
      (matchModelEClass, 
       source, 
       new String[] 
       {
       "foo", "bar",
       "tool.description", "Match pattern. Place inside Rule.",
       "label.readOnly", "true"
       });									
    addAnnotation
      (applyClassEClass, 
       source, 
       new String[] 
       {
       "foo", "bar",
       "tool.description", "Generates a class in the apply pattern."
       });			
    addAnnotation
      (applyModelEClass, 
       source, 
       new String[] 
       {
       "color", "255,255,163",
       "tool.description", "Apply pattern. Place inside Rule.",
       "label.readOnly", "true"
       });				
    addAnnotation
      (abstractClassEClass, 
       source, 
       new String[] 
       {
       "label", "className"
       });			
    addAnnotation
      (matchAttributeEClass, 
       source, 
       new String[] 
       {
       "label", "attributeName",
       "tool.description", "Match an attribute."
       });			
    addAnnotation
      (applyAttributeEClass, 
       source, 
       new String[] 
       {
       "label", "attributeName",
       "tool.description", "Create attribute in the apply pattern."
       });			
    addAnnotation
      (abstractSourceEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (filePortEClass, 
       source, 
       new String[] 
       {
       "label", "filePathURI",
       "tool.small.bundle", "Transformer",
       "tool.description", "Specify input model."
       });		
    addAnnotation
      (ruleEClass, 
       source, 
       new String[] 
       {
       "label", "description",
       "tool.description", "Create Rule. Place inside Layer."
       });				
    addAnnotation
      (metaModelIdentifierEClass, 
       source, 
       new String[] 
       {
       "label", "metaModelName",
       "tool.description", "Describe a metamodel."
       });					
    addAnnotation
      (sequentialEClass, 
       source, 
       new String[] 
       {
       "label", "description",
       "color", "153,204,255",
       "tool.name", "Layer",
       "tool.description", "Create a new Layer."
       });		
    addAnnotation
      (termEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (atomEClass, 
       source, 
       new String[] 
       {
       "label", "value",
       "label.icon", "false",
       "tool.description", "Create a literal."
       });		
    addAnnotation
      (attributeRefEClass, 
       source, 
       new String[] 
       {
       "tool.description", "Copy attribute value."
       });			
    addAnnotation
      (classRefEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (concatEClass, 
       source, 
       new String[] 
       {
       "tool.description", "Concatenate expressions."
       });				
    addAnnotation
      (typeOfEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (wildcardEClass, 
       source, 
       new String[] 
       {
       "tool.description", "Match any literal."
       });		
    addAnnotation
      (attributeEClass, 
       source, 
       new String[] 
       {
       "label", "attributeName"
       });		
    addAnnotation
      (isNullEClass, 
       source, 
       new String[] 
       {
       "label", "value",
       "label.icon", "false"
       });			
    addAnnotation
      (sequencerEClass, 
       source, 
       new String[] 
       {
       "label", "Sequencer",
       "label.readOnly", "true",
       "tool.description", "Create a sequential number generator."
       });					
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.link";					
    addAnnotation
      (getLayer_PreviousSource(), 
       source, 
       new String[] 
       {
       "source.decoration", "arrow",
       "width", "2",
       "tool.description", "Controls the flow of the transformation. Connects Layers/FilePorts."
       });											
    addAnnotation
      (getMatchModel_ExplicitSource(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (matchAssociationEClass, 
       source, 
       new String[] 
       {
       "source", "source",
       "target", "target",
       "target.decoration", "arrow",
       "width", "2"
       });		
    addAnnotation
      (positiveIndirectAssociationEClass, 
       source, 
       new String[] 
       {
       "label", "",
       "style", "dash",
       "color", "204,255,153",
       "width", "2",
       "tool.description", "Existing association across several containments."
       });		
    addAnnotation
      (negativeIndirectAssociationEClass, 
       source, 
       new String[] 
       {
       "style", "dash",
       "color", "255,61,100",
       "width", "2",
       "tool.description", "Existing association across several containments."
       });		
    addAnnotation
      (positiveMatchAssociationEClass, 
       source, 
       new String[] 
       {
       "tool.description", "Existing direct association."
       });		
    addAnnotation
      (negativeMatchAssociationEClass, 
       source, 
       new String[] 
       {
       "color", "255,61,100",
       "width", "2",
       "tool.description", "Non-existing direct association."
       });						
    addAnnotation
      (applyAssociationEClass, 
       source, 
       new String[] 
       {
       "label", "associationName",
       "source", "source",
       "target", "target",
       "target.decoration", "arrow",
       "tool.description", "Create direct association in the apply pattern."
       });			
    addAnnotation
      (associationEClass, 
       source, 
       new String[] 
       {
       "label", "associationName",
       "width", "2"
       });													
    addAnnotation
      (positiveBackwardRestrictionEClass, 
       source, 
       new String[] 
       {
       "foo", "bar",
       "tool.description", "Create a generator-generated restriction."
       });		
    addAnnotation
      (negativeBackwardRestrictionEClass, 
       source, 
       new String[] 
       {
       "color", "255,61,100",
       "tool.description", "Avoid a generator-generated situation."
       });		
    addAnnotation
      (importEClass, 
       source, 
       new String[] 
       {
       "target", "target",
       "source", "source",
       "target.decoration", "arrow",
       "color", "85,64,45",
       "width", "2",
       "tool.description", "Copy full model elements."
       });						
    addAnnotation
      (getAttributeRef_AttributeRef(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "width", "2",
       "tool.description", "Specify source attribute."
       });			
    addAnnotation
      (getClassRef_ClassRef(), 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "width", "2"
       });									
    addAnnotation
      (abstractTemporalRelationEClass, 
       source, 
       new String[] 
       {
       "target", "targetClass",
       "source", "sourceClass",
       "style", "dot",
       "width", "2"
       });			
    addAnnotation
      (abstractAttributeRelationEClass, 
       source, 
       new String[] 
       {
       "target", "targetAttribute",
       "target.decoration", "none",
       "source", "sourceAttribute",
       "source.decoration", "none",
       "style", "solid",
       "width", "2"
       });		
    addAnnotation
      (attributeEqualityEClass, 
       source, 
       new String[] 
       {
       "label", "=",
       "color", "145,147,255",
       "tool.description", "Create an equality constrain between attributes."
       });		
    addAnnotation
      (attributeInequalityEClass, 
       source, 
       new String[] 
       {
       "color", "255,61,100",
       "label", "!=",
       "tool.description", "Create an inequality constrain between attributes"
       });		
    addAnnotation
      (matchMayBeSameRelationEClass, 
       source, 
       new String[] 
       {
       "label", "",
       "target.decoration", "none",
       "source.decoration", "none",
       "style", "dash",
       "color", "181,215,255",
       "width", "2",
       "tool.description", "Match classes can have same binding."
       });		
    addAnnotation
      (applyMayBeSameRelationEClass, 
       source, 
       new String[] 
       {
       "label", "",
       "target.decoration", "none",
       "source.decoration", "none",
       "style", "dash",
       "color", "181,215,255",
       "width", "2",
       "tool.description", "Apply classes can have same binding."
       });
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.compartment";						
    addAnnotation
      (getLayer_HasRule(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (getMatchClass_Attribute(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });							
    addAnnotation
      (getMatchModel_Class(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });									
    addAnnotation
      (getApplyClass_Attribute(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (getApplyModel_Class(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });						
    addAnnotation
      (getMatchAttribute_AttributeValue(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (getApplyAttribute_AttributeValue(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });			
    addAnnotation
      (getAbstractSource_MetaModelId(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });				
    addAnnotation
      (getRule_Match(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getRule_Apply(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });														
    addAnnotation
      (getConcat_LeftTerm(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getConcat_RightTerm(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });											
  }

} //DsltransPackageImpl
