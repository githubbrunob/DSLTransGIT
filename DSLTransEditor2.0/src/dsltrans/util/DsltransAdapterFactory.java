/**
 * <copyright>
 * </copyright>
 *
 * $Id: DsltransAdapterFactory.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans.util;

import dsltrans.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dsltrans.DsltransPackage
 * @generated
 */
public class DsltransAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DsltransPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DsltransAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DsltransPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DsltransSwitch<Adapter> modelSwitch =
    new DsltransSwitch<Adapter>()
    {
      @Override
      public Adapter caseTransformationModel(TransformationModel object)
      {
        return createTransformationModelAdapter();
      }
      @Override
      public Adapter caseLayer(Layer object)
      {
        return createLayerAdapter();
      }
      @Override
      public Adapter caseMatchClass(MatchClass object)
      {
        return createMatchClassAdapter();
      }
      @Override
      public Adapter casePositiveMatchClass(PositiveMatchClass object)
      {
        return createPositiveMatchClassAdapter();
      }
      @Override
      public Adapter caseAnyMatchClass(AnyMatchClass object)
      {
        return createAnyMatchClassAdapter();
      }
      @Override
      public Adapter caseExistsMatchClass(ExistsMatchClass object)
      {
        return createExistsMatchClassAdapter();
      }
      @Override
      public Adapter caseNegativeMatchClass(NegativeMatchClass object)
      {
        return createNegativeMatchClassAdapter();
      }
      @Override
      public Adapter caseMatchModel(MatchModel object)
      {
        return createMatchModelAdapter();
      }
      @Override
      public Adapter caseMatchAssociation(MatchAssociation object)
      {
        return createMatchAssociationAdapter();
      }
      @Override
      public Adapter casePositiveIndirectAssociation(PositiveIndirectAssociation object)
      {
        return createPositiveIndirectAssociationAdapter();
      }
      @Override
      public Adapter caseNegativeIndirectAssociation(NegativeIndirectAssociation object)
      {
        return createNegativeIndirectAssociationAdapter();
      }
      @Override
      public Adapter casePositiveMatchAssociation(PositiveMatchAssociation object)
      {
        return createPositiveMatchAssociationAdapter();
      }
      @Override
      public Adapter caseNegativeMatchAssociation(NegativeMatchAssociation object)
      {
        return createNegativeMatchAssociationAdapter();
      }
      @Override
      public Adapter caseApplyClass(ApplyClass object)
      {
        return createApplyClassAdapter();
      }
      @Override
      public Adapter caseApplyModel(ApplyModel object)
      {
        return createApplyModelAdapter();
      }
      @Override
      public Adapter caseApplyAssociation(ApplyAssociation object)
      {
        return createApplyAssociationAdapter();
      }
      @Override
      public Adapter caseAbstractClass(AbstractClass object)
      {
        return createAbstractClassAdapter();
      }
      @Override
      public Adapter caseAssociation(Association object)
      {
        return createAssociationAdapter();
      }
      @Override
      public Adapter caseMatchAttribute(MatchAttribute object)
      {
        return createMatchAttributeAdapter();
      }
      @Override
      public Adapter caseApplyAttribute(ApplyAttribute object)
      {
        return createApplyAttributeAdapter();
      }
      @Override
      public Adapter caseAbstractSource(AbstractSource object)
      {
        return createAbstractSourceAdapter();
      }
      @Override
      public Adapter caseFilePort(FilePort object)
      {
        return createFilePortAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseMetaModelIdentifier(MetaModelIdentifier object)
      {
        return createMetaModelIdentifierAdapter();
      }
      @Override
      public Adapter casePositiveBackwardRestriction(PositiveBackwardRestriction object)
      {
        return createPositiveBackwardRestrictionAdapter();
      }
      @Override
      public Adapter caseNegativeBackwardRestriction(NegativeBackwardRestriction object)
      {
        return createNegativeBackwardRestrictionAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseSequential(Sequential object)
      {
        return createSequentialAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseRef(Ref object)
      {
        return createRefAdapter();
      }
      @Override
      public Adapter caseAttributeRef(AttributeRef object)
      {
        return createAttributeRefAdapter();
      }
      @Override
      public Adapter caseClassRef(ClassRef object)
      {
        return createClassRefAdapter();
      }
      @Override
      public Adapter caseConcat(Concat object)
      {
        return createConcatAdapter();
      }
      @Override
      public Adapter caseTypeOf(TypeOf object)
      {
        return createTypeOfAdapter();
      }
      @Override
      public Adapter caseWildcard(Wildcard object)
      {
        return createWildcardAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseisNull(isNull object)
      {
        return createisNullAdapter();
      }
      @Override
      public Adapter caseMatchAttributeValue(MatchAttributeValue object)
      {
        return createMatchAttributeValueAdapter();
      }
      @Override
      public Adapter caseAbstractTemporalRelation(AbstractTemporalRelation object)
      {
        return createAbstractTemporalRelationAdapter();
      }
      @Override
      public Adapter caseSequencer(Sequencer object)
      {
        return createSequencerAdapter();
      }
      @Override
      public Adapter caseAbstractAttributeRelation(AbstractAttributeRelation object)
      {
        return createAbstractAttributeRelationAdapter();
      }
      @Override
      public Adapter caseAttributeEquality(AttributeEquality object)
      {
        return createAttributeEqualityAdapter();
      }
      @Override
      public Adapter caseAttributeInequality(AttributeInequality object)
      {
        return createAttributeInequalityAdapter();
      }
      @Override
      public Adapter caseMatchMayBeSameRelation(MatchMayBeSameRelation object)
      {
        return createMatchMayBeSameRelationAdapter();
      }
      @Override
      public Adapter caseApplyMayBeSameRelation(ApplyMayBeSameRelation object)
      {
        return createApplyMayBeSameRelationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link dsltrans.TransformationModel <em>Transformation Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.TransformationModel
   * @generated
   */
  public Adapter createTransformationModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Layer
   * @generated
   */
  public Adapter createLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.MatchClass <em>Match Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.MatchClass
   * @generated
   */
  public Adapter createMatchClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.PositiveMatchClass <em>Positive Match Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.PositiveMatchClass
   * @generated
   */
  public Adapter createPositiveMatchClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.AnyMatchClass <em>Any Match Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.AnyMatchClass
   * @generated
   */
  public Adapter createAnyMatchClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.ExistsMatchClass <em>Exists Match Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.ExistsMatchClass
   * @generated
   */
  public Adapter createExistsMatchClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.NegativeMatchClass <em>Negative Match Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.NegativeMatchClass
   * @generated
   */
  public Adapter createNegativeMatchClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.MatchModel <em>Match Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.MatchModel
   * @generated
   */
  public Adapter createMatchModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.MatchAssociation <em>Match Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.MatchAssociation
   * @generated
   */
  public Adapter createMatchAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.PositiveIndirectAssociation <em>Positive Indirect Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.PositiveIndirectAssociation
   * @generated
   */
  public Adapter createPositiveIndirectAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.NegativeIndirectAssociation <em>Negative Indirect Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.NegativeIndirectAssociation
   * @generated
   */
  public Adapter createNegativeIndirectAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.PositiveMatchAssociation <em>Positive Match Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.PositiveMatchAssociation
   * @generated
   */
  public Adapter createPositiveMatchAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.NegativeMatchAssociation <em>Negative Match Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.NegativeMatchAssociation
   * @generated
   */
  public Adapter createNegativeMatchAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.ApplyClass <em>Apply Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.ApplyClass
   * @generated
   */
  public Adapter createApplyClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.ApplyModel <em>Apply Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.ApplyModel
   * @generated
   */
  public Adapter createApplyModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.ApplyAssociation <em>Apply Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.ApplyAssociation
   * @generated
   */
  public Adapter createApplyAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.AbstractClass <em>Abstract Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.AbstractClass
   * @generated
   */
  public Adapter createAbstractClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Association
   * @generated
   */
  public Adapter createAssociationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.MatchAttribute <em>Match Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.MatchAttribute
   * @generated
   */
  public Adapter createMatchAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.ApplyAttribute <em>Apply Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.ApplyAttribute
   * @generated
   */
  public Adapter createApplyAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.AbstractSource <em>Abstract Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.AbstractSource
   * @generated
   */
  public Adapter createAbstractSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.FilePort <em>File Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.FilePort
   * @generated
   */
  public Adapter createFilePortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.MetaModelIdentifier <em>Meta Model Identifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.MetaModelIdentifier
   * @generated
   */
  public Adapter createMetaModelIdentifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.PositiveBackwardRestriction <em>Positive Backward Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.PositiveBackwardRestriction
   * @generated
   */
  public Adapter createPositiveBackwardRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.NegativeBackwardRestriction <em>Negative Backward Restriction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.NegativeBackwardRestriction
   * @generated
   */
  public Adapter createNegativeBackwardRestrictionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Sequential <em>Sequential</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Sequential
   * @generated
   */
  public Adapter createSequentialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Ref <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Ref
   * @generated
   */
  public Adapter createRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.AttributeRef <em>Attribute Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.AttributeRef
   * @generated
   */
  public Adapter createAttributeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.ClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.ClassRef
   * @generated
   */
  public Adapter createClassRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Concat <em>Concat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Concat
   * @generated
   */
  public Adapter createConcatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.TypeOf <em>Type Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.TypeOf
   * @generated
   */
  public Adapter createTypeOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Wildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Wildcard
   * @generated
   */
  public Adapter createWildcardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.isNull <em>is Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.isNull
   * @generated
   */
  public Adapter createisNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.MatchAttributeValue <em>Match Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.MatchAttributeValue
   * @generated
   */
  public Adapter createMatchAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.AbstractTemporalRelation <em>Abstract Temporal Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.AbstractTemporalRelation
   * @generated
   */
  public Adapter createAbstractTemporalRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.Sequencer <em>Sequencer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.Sequencer
   * @generated
   */
  public Adapter createSequencerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.AbstractAttributeRelation <em>Abstract Attribute Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.AbstractAttributeRelation
   * @generated
   */
  public Adapter createAbstractAttributeRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.AttributeEquality <em>Attribute Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.AttributeEquality
   * @generated
   */
  public Adapter createAttributeEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.AttributeInequality <em>Attribute Inequality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.AttributeInequality
   * @generated
   */
  public Adapter createAttributeInequalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.MatchMayBeSameRelation <em>Match May Be Same Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.MatchMayBeSameRelation
   * @generated
   */
  public Adapter createMatchMayBeSameRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link dsltrans.ApplyMayBeSameRelation <em>Apply May Be Same Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see dsltrans.ApplyMayBeSameRelation
   * @generated
   */
  public Adapter createApplyMayBeSameRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DsltransAdapterFactory
