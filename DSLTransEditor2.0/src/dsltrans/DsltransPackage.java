/**
 * <copyright>
 * </copyright>
 *
 * $Id: DsltransPackage.java,v 1.2 2012/01/18 23:38:18 claudiogomes Exp $
 */
package dsltrans;

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
 * @see dsltrans.DsltransFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface DsltransPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dsltrans";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://dsltrans/2.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dsltrans";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DsltransPackage eINSTANCE = dsltrans.impl.DsltransPackageImpl.init();

  /**
   * The meta object id for the '{@link dsltrans.impl.TransformationModelImpl <em>Transformation Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.TransformationModelImpl
   * @see dsltrans.impl.DsltransPackageImpl#getTransformationModel()
   * @generated
   */
  int TRANSFORMATION_MODEL = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_MODEL__SOURCE = 0;

  /**
   * The number of structural features of the '<em>Transformation Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.AbstractSourceImpl <em>Abstract Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AbstractSourceImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAbstractSource()
   * @generated
   */
  int ABSTRACT_SOURCE = 20;

  /**
   * The feature id for the '<em><b>Meta Model Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SOURCE__META_MODEL_ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SOURCE__NAME = 1;

  /**
   * The number of structural features of the '<em>Abstract Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SOURCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dsltrans.impl.LayerImpl <em>Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.LayerImpl
   * @see dsltrans.impl.DsltransPackageImpl#getLayer()
   * @generated
   */
  int LAYER = 1;

  /**
   * The feature id for the '<em><b>Meta Model Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__META_MODEL_ID = ABSTRACT_SOURCE__META_MODEL_ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__NAME = ABSTRACT_SOURCE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__DESCRIPTION = ABSTRACT_SOURCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Previous Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__PREVIOUS_SOURCE = ABSTRACT_SOURCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Output File Path URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__OUTPUT_FILE_PATH_URI = ABSTRACT_SOURCE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Has Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__HAS_RULE = ABSTRACT_SOURCE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Group Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__GROUP_NAME = ABSTRACT_SOURCE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_FEATURE_COUNT = ABSTRACT_SOURCE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link dsltrans.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AbstractClassImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAbstractClass()
   * @generated
   */
  int ABSTRACT_CLASS = 16;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CLASS__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CLASS__PACKAGE_NAME = 1;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CLASS__CLASS_NAME = 2;

  /**
   * The feature id for the '<em><b>Allow Inheritance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CLASS__ALLOW_INHERITANCE = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CLASS__ID = 4;

  /**
   * The number of structural features of the '<em>Abstract Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CLASS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link dsltrans.impl.MatchClassImpl <em>Match Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.MatchClassImpl
   * @see dsltrans.impl.DsltransPackageImpl#getMatchClass()
   * @generated
   */
  int MATCH_CLASS = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_CLASS__DESCRIPTION = ABSTRACT_CLASS__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_CLASS__PACKAGE_NAME = ABSTRACT_CLASS__PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_CLASS__CLASS_NAME = ABSTRACT_CLASS__CLASS_NAME;

  /**
   * The feature id for the '<em><b>Allow Inheritance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_CLASS__ALLOW_INHERITANCE = ABSTRACT_CLASS__ALLOW_INHERITANCE;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_CLASS__ID = ABSTRACT_CLASS__ID;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_CLASS__ATTRIBUTE = ABSTRACT_CLASS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Match Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_CLASS_FEATURE_COUNT = ABSTRACT_CLASS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.PositiveMatchClassImpl <em>Positive Match Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.PositiveMatchClassImpl
   * @see dsltrans.impl.DsltransPackageImpl#getPositiveMatchClass()
   * @generated
   */
  int POSITIVE_MATCH_CLASS = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_CLASS__DESCRIPTION = MATCH_CLASS__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_CLASS__PACKAGE_NAME = MATCH_CLASS__PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_CLASS__CLASS_NAME = MATCH_CLASS__CLASS_NAME;

  /**
   * The feature id for the '<em><b>Allow Inheritance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_CLASS__ALLOW_INHERITANCE = MATCH_CLASS__ALLOW_INHERITANCE;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_CLASS__ID = MATCH_CLASS__ID;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_CLASS__ATTRIBUTE = MATCH_CLASS__ATTRIBUTE;

  /**
   * The number of structural features of the '<em>Positive Match Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_CLASS_FEATURE_COUNT = MATCH_CLASS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.AnyMatchClassImpl <em>Any Match Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AnyMatchClassImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAnyMatchClass()
   * @generated
   */
  int ANY_MATCH_CLASS = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_MATCH_CLASS__DESCRIPTION = POSITIVE_MATCH_CLASS__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_MATCH_CLASS__PACKAGE_NAME = POSITIVE_MATCH_CLASS__PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_MATCH_CLASS__CLASS_NAME = POSITIVE_MATCH_CLASS__CLASS_NAME;

  /**
   * The feature id for the '<em><b>Allow Inheritance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_MATCH_CLASS__ALLOW_INHERITANCE = POSITIVE_MATCH_CLASS__ALLOW_INHERITANCE;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_MATCH_CLASS__ID = POSITIVE_MATCH_CLASS__ID;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_MATCH_CLASS__ATTRIBUTE = POSITIVE_MATCH_CLASS__ATTRIBUTE;

  /**
   * The number of structural features of the '<em>Any Match Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_MATCH_CLASS_FEATURE_COUNT = POSITIVE_MATCH_CLASS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.ExistsMatchClassImpl <em>Exists Match Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.ExistsMatchClassImpl
   * @see dsltrans.impl.DsltransPackageImpl#getExistsMatchClass()
   * @generated
   */
  int EXISTS_MATCH_CLASS = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_MATCH_CLASS__DESCRIPTION = POSITIVE_MATCH_CLASS__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_MATCH_CLASS__PACKAGE_NAME = POSITIVE_MATCH_CLASS__PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_MATCH_CLASS__CLASS_NAME = POSITIVE_MATCH_CLASS__CLASS_NAME;

  /**
   * The feature id for the '<em><b>Allow Inheritance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_MATCH_CLASS__ALLOW_INHERITANCE = POSITIVE_MATCH_CLASS__ALLOW_INHERITANCE;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_MATCH_CLASS__ID = POSITIVE_MATCH_CLASS__ID;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_MATCH_CLASS__ATTRIBUTE = POSITIVE_MATCH_CLASS__ATTRIBUTE;

  /**
   * The number of structural features of the '<em>Exists Match Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXISTS_MATCH_CLASS_FEATURE_COUNT = POSITIVE_MATCH_CLASS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.NegativeMatchClassImpl <em>Negative Match Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.NegativeMatchClassImpl
   * @see dsltrans.impl.DsltransPackageImpl#getNegativeMatchClass()
   * @generated
   */
  int NEGATIVE_MATCH_CLASS = 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_CLASS__DESCRIPTION = MATCH_CLASS__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_CLASS__PACKAGE_NAME = MATCH_CLASS__PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_CLASS__CLASS_NAME = MATCH_CLASS__CLASS_NAME;

  /**
   * The feature id for the '<em><b>Allow Inheritance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE = MATCH_CLASS__ALLOW_INHERITANCE;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_CLASS__ID = MATCH_CLASS__ID;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_CLASS__ATTRIBUTE = MATCH_CLASS__ATTRIBUTE;

  /**
   * The number of structural features of the '<em>Negative Match Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_CLASS_FEATURE_COUNT = MATCH_CLASS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.MatchModelImpl <em>Match Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.MatchModelImpl
   * @see dsltrans.impl.DsltransPackageImpl#getMatchModel()
   * @generated
   */
  int MATCH_MODEL = 7;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_MODEL__CLASS = 0;

  /**
   * The feature id for the '<em><b>Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_MODEL__ASSOCIATION = 1;

  /**
   * The feature id for the '<em><b>Explicit Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_MODEL__EXPLICIT_SOURCE = 2;

  /**
   * The number of structural features of the '<em>Match Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dsltrans.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AssociationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 17;

  /**
   * The feature id for the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__ASSOCIATION_NAME = 0;

  /**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.MatchAssociationImpl <em>Match Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.MatchAssociationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getMatchAssociation()
   * @generated
   */
  int MATCH_ASSOCIATION = 8;

  /**
   * The feature id for the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ASSOCIATION__ASSOCIATION_NAME = ASSOCIATION__ASSOCIATION_NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ASSOCIATION__SOURCE = ASSOCIATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ASSOCIATION__TARGET = ASSOCIATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Match Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dsltrans.impl.PositiveIndirectAssociationImpl <em>Positive Indirect Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.PositiveIndirectAssociationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getPositiveIndirectAssociation()
   * @generated
   */
  int POSITIVE_INDIRECT_ASSOCIATION = 9;

  /**
   * The feature id for the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME = MATCH_ASSOCIATION__ASSOCIATION_NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_INDIRECT_ASSOCIATION__SOURCE = MATCH_ASSOCIATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_INDIRECT_ASSOCIATION__TARGET = MATCH_ASSOCIATION__TARGET;

  /**
   * The number of structural features of the '<em>Positive Indirect Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_INDIRECT_ASSOCIATION_FEATURE_COUNT = MATCH_ASSOCIATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.NegativeIndirectAssociationImpl <em>Negative Indirect Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.NegativeIndirectAssociationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getNegativeIndirectAssociation()
   * @generated
   */
  int NEGATIVE_INDIRECT_ASSOCIATION = 10;

  /**
   * The feature id for the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME = MATCH_ASSOCIATION__ASSOCIATION_NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_INDIRECT_ASSOCIATION__SOURCE = MATCH_ASSOCIATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_INDIRECT_ASSOCIATION__TARGET = MATCH_ASSOCIATION__TARGET;

  /**
   * The number of structural features of the '<em>Negative Indirect Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_INDIRECT_ASSOCIATION_FEATURE_COUNT = MATCH_ASSOCIATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.PositiveMatchAssociationImpl <em>Positive Match Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.PositiveMatchAssociationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getPositiveMatchAssociation()
   * @generated
   */
  int POSITIVE_MATCH_ASSOCIATION = 11;

  /**
   * The feature id for the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME = MATCH_ASSOCIATION__ASSOCIATION_NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_ASSOCIATION__SOURCE = MATCH_ASSOCIATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_ASSOCIATION__TARGET = MATCH_ASSOCIATION__TARGET;

  /**
   * The number of structural features of the '<em>Positive Match Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_MATCH_ASSOCIATION_FEATURE_COUNT = MATCH_ASSOCIATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.NegativeMatchAssociationImpl <em>Negative Match Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.NegativeMatchAssociationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getNegativeMatchAssociation()
   * @generated
   */
  int NEGATIVE_MATCH_ASSOCIATION = 12;

  /**
   * The feature id for the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME = MATCH_ASSOCIATION__ASSOCIATION_NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_ASSOCIATION__SOURCE = MATCH_ASSOCIATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_ASSOCIATION__TARGET = MATCH_ASSOCIATION__TARGET;

  /**
   * The number of structural features of the '<em>Negative Match Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_MATCH_ASSOCIATION_FEATURE_COUNT = MATCH_ASSOCIATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.ApplyClassImpl <em>Apply Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.ApplyClassImpl
   * @see dsltrans.impl.DsltransPackageImpl#getApplyClass()
   * @generated
   */
  int APPLY_CLASS = 13;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_CLASS__DESCRIPTION = ABSTRACT_CLASS__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_CLASS__PACKAGE_NAME = ABSTRACT_CLASS__PACKAGE_NAME;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_CLASS__CLASS_NAME = ABSTRACT_CLASS__CLASS_NAME;

  /**
   * The feature id for the '<em><b>Allow Inheritance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_CLASS__ALLOW_INHERITANCE = ABSTRACT_CLASS__ALLOW_INHERITANCE;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_CLASS__ID = ABSTRACT_CLASS__ID;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_CLASS__ATTRIBUTE = ABSTRACT_CLASS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Group Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_CLASS__GROUP_NAME = ABSTRACT_CLASS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Apply Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_CLASS_FEATURE_COUNT = ABSTRACT_CLASS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dsltrans.impl.ApplyModelImpl <em>Apply Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.ApplyModelImpl
   * @see dsltrans.impl.DsltransPackageImpl#getApplyModel()
   * @generated
   */
  int APPLY_MODEL = 14;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_MODEL__CLASS = 0;

  /**
   * The feature id for the '<em><b>Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_MODEL__ASSOCIATION = 1;

  /**
   * The number of structural features of the '<em>Apply Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dsltrans.impl.ApplyAssociationImpl <em>Apply Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.ApplyAssociationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getApplyAssociation()
   * @generated
   */
  int APPLY_ASSOCIATION = 15;

  /**
   * The feature id for the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_ASSOCIATION__ASSOCIATION_NAME = ASSOCIATION__ASSOCIATION_NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_ASSOCIATION__SOURCE = ASSOCIATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_ASSOCIATION__TARGET = ASSOCIATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Apply Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_ASSOCIATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dsltrans.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AttributeImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 37;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE_NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ID = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link dsltrans.impl.MatchAttributeImpl <em>Match Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.MatchAttributeImpl
   * @see dsltrans.impl.DsltransPackageImpl#getMatchAttribute()
   * @generated
   */
  int MATCH_ATTRIBUTE = 18;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ATTRIBUTE__ATTRIBUTE_NAME = ATTRIBUTE__ATTRIBUTE_NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ATTRIBUTE__DESCRIPTION = ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ATTRIBUTE__ID = ATTRIBUTE__ID;

  /**
   * The feature id for the '<em><b>Attribute Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ATTRIBUTE__ATTRIBUTE_VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Match Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.ApplyAttributeImpl <em>Apply Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.ApplyAttributeImpl
   * @see dsltrans.impl.DsltransPackageImpl#getApplyAttribute()
   * @generated
   */
  int APPLY_ATTRIBUTE = 19;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_ATTRIBUTE__ATTRIBUTE_NAME = ATTRIBUTE__ATTRIBUTE_NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_ATTRIBUTE__DESCRIPTION = ATTRIBUTE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_ATTRIBUTE__ID = ATTRIBUTE__ID;

  /**
   * The feature id for the '<em><b>Attribute Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_ATTRIBUTE__ATTRIBUTE_VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Apply Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.FilePortImpl <em>File Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.FilePortImpl
   * @see dsltrans.impl.DsltransPackageImpl#getFilePort()
   * @generated
   */
  int FILE_PORT = 21;

  /**
   * The feature id for the '<em><b>Meta Model Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_PORT__META_MODEL_ID = ABSTRACT_SOURCE__META_MODEL_ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_PORT__NAME = ABSTRACT_SOURCE__NAME;

  /**
   * The feature id for the '<em><b>File Path URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_PORT__FILE_PATH_URI = ABSTRACT_SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>File Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_PORT_FEATURE_COUNT = ABSTRACT_SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.RuleImpl
   * @see dsltrans.impl.DsltransPackageImpl#getRule()
   * @generated
   */
  int RULE = 22;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Match</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__MATCH = 1;

  /**
   * The feature id for the '<em><b>Apply</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__APPLY = 2;

  /**
   * The feature id for the '<em><b>Backwards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__BACKWARDS = 3;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__IMPORTS = 4;

  /**
   * The feature id for the '<em><b>Attribute Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__ATTRIBUTE_RELATIONS = 5;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link dsltrans.impl.MetaModelIdentifierImpl <em>Meta Model Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.MetaModelIdentifierImpl
   * @see dsltrans.impl.DsltransPackageImpl#getMetaModelIdentifier()
   * @generated
   */
  int META_MODEL_IDENTIFIER = 23;

  /**
   * The feature id for the '<em><b>Meta Model URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODEL_IDENTIFIER__META_MODEL_URI = 0;

  /**
   * The feature id for the '<em><b>Meta Model Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODEL_IDENTIFIER__META_MODEL_NAME = 1;

  /**
   * The number of structural features of the '<em>Meta Model Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_MODEL_IDENTIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dsltrans.impl.AbstractTemporalRelationImpl <em>Abstract Temporal Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AbstractTemporalRelationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAbstractTemporalRelation()
   * @generated
   */
  int ABSTRACT_TEMPORAL_RELATION = 40;

  /**
   * The feature id for the '<em><b>Target Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS = 0;

  /**
   * The feature id for the '<em><b>Source Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS = 1;

  /**
   * The number of structural features of the '<em>Abstract Temporal Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TEMPORAL_RELATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dsltrans.impl.PositiveBackwardRestrictionImpl <em>Positive Backward Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.PositiveBackwardRestrictionImpl
   * @see dsltrans.impl.DsltransPackageImpl#getPositiveBackwardRestriction()
   * @generated
   */
  int POSITIVE_BACKWARD_RESTRICTION = 24;

  /**
   * The feature id for the '<em><b>Target Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_BACKWARD_RESTRICTION__TARGET_CLASS = ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS;

  /**
   * The feature id for the '<em><b>Source Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_BACKWARD_RESTRICTION__SOURCE_CLASS = ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS;

  /**
   * The number of structural features of the '<em>Positive Backward Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIVE_BACKWARD_RESTRICTION_FEATURE_COUNT = ABSTRACT_TEMPORAL_RELATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.NegativeBackwardRestrictionImpl <em>Negative Backward Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.NegativeBackwardRestrictionImpl
   * @see dsltrans.impl.DsltransPackageImpl#getNegativeBackwardRestriction()
   * @generated
   */
  int NEGATIVE_BACKWARD_RESTRICTION = 25;

  /**
   * The feature id for the '<em><b>Target Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_BACKWARD_RESTRICTION__TARGET_CLASS = ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS;

  /**
   * The feature id for the '<em><b>Source Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_BACKWARD_RESTRICTION__SOURCE_CLASS = ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS;

  /**
   * The number of structural features of the '<em>Negative Backward Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_BACKWARD_RESTRICTION_FEATURE_COUNT = ABSTRACT_TEMPORAL_RELATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.ImportImpl
   * @see dsltrans.impl.DsltransPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 26;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__TARGET = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__SOURCE = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dsltrans.impl.SequentialImpl <em>Sequential</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.SequentialImpl
   * @see dsltrans.impl.DsltransPackageImpl#getSequential()
   * @generated
   */
  int SEQUENTIAL = 27;

  /**
   * The feature id for the '<em><b>Meta Model Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL__META_MODEL_ID = LAYER__META_MODEL_ID;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL__NAME = LAYER__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL__DESCRIPTION = LAYER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Previous Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL__PREVIOUS_SOURCE = LAYER__PREVIOUS_SOURCE;

  /**
   * The feature id for the '<em><b>Output File Path URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL__OUTPUT_FILE_PATH_URI = LAYER__OUTPUT_FILE_PATH_URI;

  /**
   * The feature id for the '<em><b>Has Rule</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL__HAS_RULE = LAYER__HAS_RULE;

  /**
   * The feature id for the '<em><b>Group Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL__GROUP_NAME = LAYER__GROUP_NAME;

  /**
   * The number of structural features of the '<em>Sequential</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL_FEATURE_COUNT = LAYER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.TermImpl
   * @see dsltrans.impl.DsltransPackageImpl#getTerm()
   * @generated
   */
  int TERM = 28;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.OperatorImpl
   * @see dsltrans.impl.DsltransPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 29;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AtomImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__VALUE = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.RefImpl <em>Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.RefImpl
   * @see dsltrans.impl.DsltransPackageImpl#getRef()
   * @generated
   */
  int REF = 31;

  /**
   * The number of structural features of the '<em>Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.AttributeRefImpl <em>Attribute Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AttributeRefImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAttributeRef()
   * @generated
   */
  int ATTRIBUTE_REF = 32;

  /**
   * The feature id for the '<em><b>Attribute Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REF__ATTRIBUTE_REF = REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.ClassRefImpl <em>Class Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.ClassRefImpl
   * @see dsltrans.impl.DsltransPackageImpl#getClassRef()
   * @generated
   */
  int CLASS_REF = 33;

  /**
   * The feature id for the '<em><b>Class Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_REF__CLASS_REF = REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_REF_FEATURE_COUNT = REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.ConcatImpl <em>Concat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.ConcatImpl
   * @see dsltrans.impl.DsltransPackageImpl#getConcat()
   * @generated
   */
  int CONCAT = 34;

  /**
   * The feature id for the '<em><b>Left Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT__LEFT_TERM = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT__RIGHT_TERM = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Concat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCAT_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dsltrans.impl.TypeOfImpl <em>Type Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.TypeOfImpl
   * @see dsltrans.impl.DsltransPackageImpl#getTypeOf()
   * @generated
   */
  int TYPE_OF = 35;

  /**
   * The feature id for the '<em><b>Attribute Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OF__ATTRIBUTE_REF = OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OF_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.WildcardImpl <em>Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.WildcardImpl
   * @see dsltrans.impl.DsltransPackageImpl#getWildcard()
   * @generated
   */
  int WILDCARD = 36;

  /**
   * The number of structural features of the '<em>Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.MatchAttributeValueImpl <em>Match Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.MatchAttributeValueImpl
   * @see dsltrans.impl.DsltransPackageImpl#getMatchAttributeValue()
   * @generated
   */
  int MATCH_ATTRIBUTE_VALUE = 39;

  /**
   * The number of structural features of the '<em>Match Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_ATTRIBUTE_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.isNullImpl <em>is Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.isNullImpl
   * @see dsltrans.impl.DsltransPackageImpl#getisNull()
   * @generated
   */
  int IS_NULL = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_NULL__VALUE = MATCH_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>is Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IS_NULL_FEATURE_COUNT = MATCH_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dsltrans.impl.SequencerImpl <em>Sequencer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.SequencerImpl
   * @see dsltrans.impl.DsltransPackageImpl#getSequencer()
   * @generated
   */
  int SEQUENCER = 41;

  /**
   * The number of structural features of the '<em>Sequencer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCER_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.AbstractAttributeRelationImpl <em>Abstract Attribute Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AbstractAttributeRelationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAbstractAttributeRelation()
   * @generated
   */
  int ABSTRACT_ATTRIBUTE_RELATION = 42;

  /**
   * The feature id for the '<em><b>Source Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ATTRIBUTE_RELATION__SOURCE_ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Target Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ATTRIBUTE_RELATION__TARGET_ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Abstract Attribute Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ATTRIBUTE_RELATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dsltrans.impl.AttributeEqualityImpl <em>Attribute Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AttributeEqualityImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAttributeEquality()
   * @generated
   */
  int ATTRIBUTE_EQUALITY = 43;

  /**
   * The feature id for the '<em><b>Source Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_EQUALITY__SOURCE_ATTRIBUTE = ABSTRACT_ATTRIBUTE_RELATION__SOURCE_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Target Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_EQUALITY__TARGET_ATTRIBUTE = ABSTRACT_ATTRIBUTE_RELATION__TARGET_ATTRIBUTE;

  /**
   * The number of structural features of the '<em>Attribute Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_EQUALITY_FEATURE_COUNT = ABSTRACT_ATTRIBUTE_RELATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.AttributeInequalityImpl <em>Attribute Inequality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.AttributeInequalityImpl
   * @see dsltrans.impl.DsltransPackageImpl#getAttributeInequality()
   * @generated
   */
  int ATTRIBUTE_INEQUALITY = 44;

  /**
   * The feature id for the '<em><b>Source Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_INEQUALITY__SOURCE_ATTRIBUTE = ABSTRACT_ATTRIBUTE_RELATION__SOURCE_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Target Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_INEQUALITY__TARGET_ATTRIBUTE = ABSTRACT_ATTRIBUTE_RELATION__TARGET_ATTRIBUTE;

  /**
   * The number of structural features of the '<em>Attribute Inequality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_INEQUALITY_FEATURE_COUNT = ABSTRACT_ATTRIBUTE_RELATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.MatchMayBeSameRelationImpl <em>Match May Be Same Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.MatchMayBeSameRelationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getMatchMayBeSameRelation()
   * @generated
   */
  int MATCH_MAY_BE_SAME_RELATION = 45;

  /**
   * The feature id for the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_MAY_BE_SAME_RELATION__ASSOCIATION_NAME = MATCH_ASSOCIATION__ASSOCIATION_NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_MAY_BE_SAME_RELATION__SOURCE = MATCH_ASSOCIATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_MAY_BE_SAME_RELATION__TARGET = MATCH_ASSOCIATION__TARGET;

  /**
   * The number of structural features of the '<em>Match May Be Same Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATCH_MAY_BE_SAME_RELATION_FEATURE_COUNT = MATCH_ASSOCIATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link dsltrans.impl.ApplyMayBeSameRelationImpl <em>Apply May Be Same Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dsltrans.impl.ApplyMayBeSameRelationImpl
   * @see dsltrans.impl.DsltransPackageImpl#getApplyMayBeSameRelation()
   * @generated
   */
  int APPLY_MAY_BE_SAME_RELATION = 46;

  /**
   * The feature id for the '<em><b>Association Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_MAY_BE_SAME_RELATION__ASSOCIATION_NAME = APPLY_ASSOCIATION__ASSOCIATION_NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_MAY_BE_SAME_RELATION__SOURCE = APPLY_ASSOCIATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_MAY_BE_SAME_RELATION__TARGET = APPLY_ASSOCIATION__TARGET;

  /**
   * The number of structural features of the '<em>Apply May Be Same Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_MAY_BE_SAME_RELATION_FEATURE_COUNT = APPLY_ASSOCIATION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link dsltrans.TransformationModel <em>Transformation Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation Model</em>'.
   * @see dsltrans.TransformationModel
   * @generated
   */
  EClass getTransformationModel();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.TransformationModel#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Source</em>'.
   * @see dsltrans.TransformationModel#getSource()
   * @see #getTransformationModel()
   * @generated
   */
  EReference getTransformationModel_Source();

  /**
   * Returns the meta object for class '{@link dsltrans.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layer</em>'.
   * @see dsltrans.Layer
   * @generated
   */
  EClass getLayer();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.Layer#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see dsltrans.Layer#getDescription()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_Description();

  /**
   * Returns the meta object for the reference list '{@link dsltrans.Layer#getPreviousSource <em>Previous Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Previous Source</em>'.
   * @see dsltrans.Layer#getPreviousSource()
   * @see #getLayer()
   * @generated
   */
  EReference getLayer_PreviousSource();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.Layer#getOutputFilePathURI <em>Output File Path URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Output File Path URI</em>'.
   * @see dsltrans.Layer#getOutputFilePathURI()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_OutputFilePathURI();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.Layer#getHasRule <em>Has Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Has Rule</em>'.
   * @see dsltrans.Layer#getHasRule()
   * @see #getLayer()
   * @generated
   */
  EReference getLayer_HasRule();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.Layer#getGroupName <em>Group Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Name</em>'.
   * @see dsltrans.Layer#getGroupName()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_GroupName();

  /**
   * Returns the meta object for class '{@link dsltrans.MatchClass <em>Match Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Class</em>'.
   * @see dsltrans.MatchClass
   * @generated
   */
  EClass getMatchClass();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.MatchClass#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see dsltrans.MatchClass#getAttribute()
   * @see #getMatchClass()
   * @generated
   */
  EReference getMatchClass_Attribute();

  /**
   * Returns the meta object for class '{@link dsltrans.PositiveMatchClass <em>Positive Match Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Positive Match Class</em>'.
   * @see dsltrans.PositiveMatchClass
   * @generated
   */
  EClass getPositiveMatchClass();

  /**
   * Returns the meta object for class '{@link dsltrans.AnyMatchClass <em>Any Match Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any Match Class</em>'.
   * @see dsltrans.AnyMatchClass
   * @generated
   */
  EClass getAnyMatchClass();

  /**
   * Returns the meta object for class '{@link dsltrans.ExistsMatchClass <em>Exists Match Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exists Match Class</em>'.
   * @see dsltrans.ExistsMatchClass
   * @generated
   */
  EClass getExistsMatchClass();

  /**
   * Returns the meta object for class '{@link dsltrans.NegativeMatchClass <em>Negative Match Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Match Class</em>'.
   * @see dsltrans.NegativeMatchClass
   * @generated
   */
  EClass getNegativeMatchClass();

  /**
   * Returns the meta object for class '{@link dsltrans.MatchModel <em>Match Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Model</em>'.
   * @see dsltrans.MatchModel
   * @generated
   */
  EClass getMatchModel();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.MatchModel#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see dsltrans.MatchModel#getClass_()
   * @see #getMatchModel()
   * @generated
   */
  EReference getMatchModel_Class();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.MatchModel#getAssociation <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Association</em>'.
   * @see dsltrans.MatchModel#getAssociation()
   * @see #getMatchModel()
   * @generated
   */
  EReference getMatchModel_Association();

  /**
   * Returns the meta object for the reference '{@link dsltrans.MatchModel#getExplicitSource <em>Explicit Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Explicit Source</em>'.
   * @see dsltrans.MatchModel#getExplicitSource()
   * @see #getMatchModel()
   * @generated
   */
  EReference getMatchModel_ExplicitSource();

  /**
   * Returns the meta object for class '{@link dsltrans.MatchAssociation <em>Match Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Association</em>'.
   * @see dsltrans.MatchAssociation
   * @generated
   */
  EClass getMatchAssociation();

  /**
   * Returns the meta object for the reference '{@link dsltrans.MatchAssociation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see dsltrans.MatchAssociation#getSource()
   * @see #getMatchAssociation()
   * @generated
   */
  EReference getMatchAssociation_Source();

  /**
   * Returns the meta object for the reference '{@link dsltrans.MatchAssociation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see dsltrans.MatchAssociation#getTarget()
   * @see #getMatchAssociation()
   * @generated
   */
  EReference getMatchAssociation_Target();

  /**
   * Returns the meta object for class '{@link dsltrans.PositiveIndirectAssociation <em>Positive Indirect Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Positive Indirect Association</em>'.
   * @see dsltrans.PositiveIndirectAssociation
   * @generated
   */
  EClass getPositiveIndirectAssociation();

  /**
   * Returns the meta object for class '{@link dsltrans.NegativeIndirectAssociation <em>Negative Indirect Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Indirect Association</em>'.
   * @see dsltrans.NegativeIndirectAssociation
   * @generated
   */
  EClass getNegativeIndirectAssociation();

  /**
   * Returns the meta object for class '{@link dsltrans.PositiveMatchAssociation <em>Positive Match Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Positive Match Association</em>'.
   * @see dsltrans.PositiveMatchAssociation
   * @generated
   */
  EClass getPositiveMatchAssociation();

  /**
   * Returns the meta object for class '{@link dsltrans.NegativeMatchAssociation <em>Negative Match Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Match Association</em>'.
   * @see dsltrans.NegativeMatchAssociation
   * @generated
   */
  EClass getNegativeMatchAssociation();

  /**
   * Returns the meta object for class '{@link dsltrans.ApplyClass <em>Apply Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply Class</em>'.
   * @see dsltrans.ApplyClass
   * @generated
   */
  EClass getApplyClass();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.ApplyClass#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see dsltrans.ApplyClass#getAttribute()
   * @see #getApplyClass()
   * @generated
   */
  EReference getApplyClass_Attribute();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.ApplyClass#getGroupName <em>Group Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Name</em>'.
   * @see dsltrans.ApplyClass#getGroupName()
   * @see #getApplyClass()
   * @generated
   */
  EAttribute getApplyClass_GroupName();

  /**
   * Returns the meta object for class '{@link dsltrans.ApplyModel <em>Apply Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply Model</em>'.
   * @see dsltrans.ApplyModel
   * @generated
   */
  EClass getApplyModel();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.ApplyModel#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see dsltrans.ApplyModel#getClass_()
   * @see #getApplyModel()
   * @generated
   */
  EReference getApplyModel_Class();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.ApplyModel#getAssociation <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Association</em>'.
   * @see dsltrans.ApplyModel#getAssociation()
   * @see #getApplyModel()
   * @generated
   */
  EReference getApplyModel_Association();

  /**
   * Returns the meta object for class '{@link dsltrans.ApplyAssociation <em>Apply Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply Association</em>'.
   * @see dsltrans.ApplyAssociation
   * @generated
   */
  EClass getApplyAssociation();

  /**
   * Returns the meta object for the reference '{@link dsltrans.ApplyAssociation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see dsltrans.ApplyAssociation#getSource()
   * @see #getApplyAssociation()
   * @generated
   */
  EReference getApplyAssociation_Source();

  /**
   * Returns the meta object for the reference '{@link dsltrans.ApplyAssociation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see dsltrans.ApplyAssociation#getTarget()
   * @see #getApplyAssociation()
   * @generated
   */
  EReference getApplyAssociation_Target();

  /**
   * Returns the meta object for class '{@link dsltrans.AbstractClass <em>Abstract Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Class</em>'.
   * @see dsltrans.AbstractClass
   * @generated
   */
  EClass getAbstractClass();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.AbstractClass#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see dsltrans.AbstractClass#getDescription()
   * @see #getAbstractClass()
   * @generated
   */
  EAttribute getAbstractClass_Description();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.AbstractClass#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see dsltrans.AbstractClass#getPackageName()
   * @see #getAbstractClass()
   * @generated
   */
  EAttribute getAbstractClass_PackageName();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.AbstractClass#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see dsltrans.AbstractClass#getClassName()
   * @see #getAbstractClass()
   * @generated
   */
  EAttribute getAbstractClass_ClassName();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.AbstractClass#isAllowInheritance <em>Allow Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allow Inheritance</em>'.
   * @see dsltrans.AbstractClass#isAllowInheritance()
   * @see #getAbstractClass()
   * @generated
   */
  EAttribute getAbstractClass_AllowInheritance();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.AbstractClass#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see dsltrans.AbstractClass#getId()
   * @see #getAbstractClass()
   * @generated
   */
  EAttribute getAbstractClass_Id();

  /**
   * Returns the meta object for class '{@link dsltrans.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see dsltrans.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.Association#getAssociationName <em>Association Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Association Name</em>'.
   * @see dsltrans.Association#getAssociationName()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_AssociationName();

  /**
   * Returns the meta object for class '{@link dsltrans.MatchAttribute <em>Match Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Attribute</em>'.
   * @see dsltrans.MatchAttribute
   * @generated
   */
  EClass getMatchAttribute();

  /**
   * Returns the meta object for the containment reference '{@link dsltrans.MatchAttribute#getAttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Value</em>'.
   * @see dsltrans.MatchAttribute#getAttributeValue()
   * @see #getMatchAttribute()
   * @generated
   */
  EReference getMatchAttribute_AttributeValue();

  /**
   * Returns the meta object for class '{@link dsltrans.ApplyAttribute <em>Apply Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply Attribute</em>'.
   * @see dsltrans.ApplyAttribute
   * @generated
   */
  EClass getApplyAttribute();

  /**
   * Returns the meta object for the containment reference '{@link dsltrans.ApplyAttribute#getAttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Value</em>'.
   * @see dsltrans.ApplyAttribute#getAttributeValue()
   * @see #getApplyAttribute()
   * @generated
   */
  EReference getApplyAttribute_AttributeValue();

  /**
   * Returns the meta object for class '{@link dsltrans.AbstractSource <em>Abstract Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Source</em>'.
   * @see dsltrans.AbstractSource
   * @generated
   */
  EClass getAbstractSource();

  /**
   * Returns the meta object for the containment reference '{@link dsltrans.AbstractSource#getMetaModelId <em>Meta Model Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Model Id</em>'.
   * @see dsltrans.AbstractSource#getMetaModelId()
   * @see #getAbstractSource()
   * @generated
   */
  EReference getAbstractSource_MetaModelId();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.AbstractSource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dsltrans.AbstractSource#getName()
   * @see #getAbstractSource()
   * @generated
   */
  EAttribute getAbstractSource_Name();

  /**
   * Returns the meta object for class '{@link dsltrans.FilePort <em>File Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Port</em>'.
   * @see dsltrans.FilePort
   * @generated
   */
  EClass getFilePort();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.FilePort#getFilePathURI <em>File Path URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Path URI</em>'.
   * @see dsltrans.FilePort#getFilePathURI()
   * @see #getFilePort()
   * @generated
   */
  EAttribute getFilePort_FilePathURI();

  /**
   * Returns the meta object for class '{@link dsltrans.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see dsltrans.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.Rule#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see dsltrans.Rule#getDescription()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Description();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.Rule#getMatch <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Match</em>'.
   * @see dsltrans.Rule#getMatch()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Match();

  /**
   * Returns the meta object for the containment reference '{@link dsltrans.Rule#getApply <em>Apply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Apply</em>'.
   * @see dsltrans.Rule#getApply()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Apply();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.Rule#getBackwards <em>Backwards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Backwards</em>'.
   * @see dsltrans.Rule#getBackwards()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Backwards();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.Rule#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see dsltrans.Rule#getImports()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link dsltrans.Rule#getAttributeRelations <em>Attribute Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Relations</em>'.
   * @see dsltrans.Rule#getAttributeRelations()
   * @see #getRule()
   * @generated
   */
  EReference getRule_AttributeRelations();

  /**
   * Returns the meta object for class '{@link dsltrans.MetaModelIdentifier <em>Meta Model Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Model Identifier</em>'.
   * @see dsltrans.MetaModelIdentifier
   * @generated
   */
  EClass getMetaModelIdentifier();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.MetaModelIdentifier#getMetaModelURI <em>Meta Model URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta Model URI</em>'.
   * @see dsltrans.MetaModelIdentifier#getMetaModelURI()
   * @see #getMetaModelIdentifier()
   * @generated
   */
  EAttribute getMetaModelIdentifier_MetaModelURI();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.MetaModelIdentifier#getMetaModelName <em>Meta Model Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta Model Name</em>'.
   * @see dsltrans.MetaModelIdentifier#getMetaModelName()
   * @see #getMetaModelIdentifier()
   * @generated
   */
  EAttribute getMetaModelIdentifier_MetaModelName();

  /**
   * Returns the meta object for class '{@link dsltrans.PositiveBackwardRestriction <em>Positive Backward Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Positive Backward Restriction</em>'.
   * @see dsltrans.PositiveBackwardRestriction
   * @generated
   */
  EClass getPositiveBackwardRestriction();

  /**
   * Returns the meta object for class '{@link dsltrans.NegativeBackwardRestriction <em>Negative Backward Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Backward Restriction</em>'.
   * @see dsltrans.NegativeBackwardRestriction
   * @generated
   */
  EClass getNegativeBackwardRestriction();

  /**
   * Returns the meta object for class '{@link dsltrans.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see dsltrans.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the reference '{@link dsltrans.Import#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see dsltrans.Import#getTarget()
   * @see #getImport()
   * @generated
   */
  EReference getImport_Target();

  /**
   * Returns the meta object for the reference '{@link dsltrans.Import#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see dsltrans.Import#getSource()
   * @see #getImport()
   * @generated
   */
  EReference getImport_Source();

  /**
   * Returns the meta object for class '{@link dsltrans.Sequential <em>Sequential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequential</em>'.
   * @see dsltrans.Sequential
   * @generated
   */
  EClass getSequential();

  /**
   * Returns the meta object for class '{@link dsltrans.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see dsltrans.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link dsltrans.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see dsltrans.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for class '{@link dsltrans.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see dsltrans.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.Atom#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dsltrans.Atom#getValue()
   * @see #getAtom()
   * @generated
   */
  EAttribute getAtom_Value();

  /**
   * Returns the meta object for class '{@link dsltrans.Ref <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref</em>'.
   * @see dsltrans.Ref
   * @generated
   */
  EClass getRef();

  /**
   * Returns the meta object for class '{@link dsltrans.AttributeRef <em>Attribute Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Ref</em>'.
   * @see dsltrans.AttributeRef
   * @generated
   */
  EClass getAttributeRef();

  /**
   * Returns the meta object for the reference '{@link dsltrans.AttributeRef#getAttributeRef <em>Attribute Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute Ref</em>'.
   * @see dsltrans.AttributeRef#getAttributeRef()
   * @see #getAttributeRef()
   * @generated
   */
  EReference getAttributeRef_AttributeRef();

  /**
   * Returns the meta object for class '{@link dsltrans.ClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Ref</em>'.
   * @see dsltrans.ClassRef
   * @generated
   */
  EClass getClassRef();

  /**
   * Returns the meta object for the reference '{@link dsltrans.ClassRef#getClassRef <em>Class Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Class Ref</em>'.
   * @see dsltrans.ClassRef#getClassRef()
   * @see #getClassRef()
   * @generated
   */
  EReference getClassRef_ClassRef();

  /**
   * Returns the meta object for class '{@link dsltrans.Concat <em>Concat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concat</em>'.
   * @see dsltrans.Concat
   * @generated
   */
  EClass getConcat();

  /**
   * Returns the meta object for the containment reference '{@link dsltrans.Concat#getLeftTerm <em>Left Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Term</em>'.
   * @see dsltrans.Concat#getLeftTerm()
   * @see #getConcat()
   * @generated
   */
  EReference getConcat_LeftTerm();

  /**
   * Returns the meta object for the containment reference '{@link dsltrans.Concat#getRightTerm <em>Right Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Term</em>'.
   * @see dsltrans.Concat#getRightTerm()
   * @see #getConcat()
   * @generated
   */
  EReference getConcat_RightTerm();

  /**
   * Returns the meta object for class '{@link dsltrans.TypeOf <em>Type Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Of</em>'.
   * @see dsltrans.TypeOf
   * @generated
   */
  EClass getTypeOf();

  /**
   * Returns the meta object for class '{@link dsltrans.Wildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard</em>'.
   * @see dsltrans.Wildcard
   * @generated
   */
  EClass getWildcard();

  /**
   * Returns the meta object for class '{@link dsltrans.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see dsltrans.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.Attribute#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see dsltrans.Attribute#getAttributeName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AttributeName();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.Attribute#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see dsltrans.Attribute#getDescription()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Description();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.Attribute#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see dsltrans.Attribute#getId()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Id();

  /**
   * Returns the meta object for class '{@link dsltrans.isNull <em>is Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>is Null</em>'.
   * @see dsltrans.isNull
   * @generated
   */
  EClass getisNull();

  /**
   * Returns the meta object for the attribute '{@link dsltrans.isNull#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dsltrans.isNull#isValue()
   * @see #getisNull()
   * @generated
   */
  EAttribute getisNull_Value();

  /**
   * Returns the meta object for class '{@link dsltrans.MatchAttributeValue <em>Match Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match Attribute Value</em>'.
   * @see dsltrans.MatchAttributeValue
   * @generated
   */
  EClass getMatchAttributeValue();

  /**
   * Returns the meta object for class '{@link dsltrans.AbstractTemporalRelation <em>Abstract Temporal Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Temporal Relation</em>'.
   * @see dsltrans.AbstractTemporalRelation
   * @generated
   */
  EClass getAbstractTemporalRelation();

  /**
   * Returns the meta object for the reference '{@link dsltrans.AbstractTemporalRelation#getTargetClass <em>Target Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Class</em>'.
   * @see dsltrans.AbstractTemporalRelation#getTargetClass()
   * @see #getAbstractTemporalRelation()
   * @generated
   */
  EReference getAbstractTemporalRelation_TargetClass();

  /**
   * Returns the meta object for the reference '{@link dsltrans.AbstractTemporalRelation#getSourceClass <em>Source Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Class</em>'.
   * @see dsltrans.AbstractTemporalRelation#getSourceClass()
   * @see #getAbstractTemporalRelation()
   * @generated
   */
  EReference getAbstractTemporalRelation_SourceClass();

  /**
   * Returns the meta object for class '{@link dsltrans.Sequencer <em>Sequencer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequencer</em>'.
   * @see dsltrans.Sequencer
   * @generated
   */
  EClass getSequencer();

  /**
   * Returns the meta object for class '{@link dsltrans.AbstractAttributeRelation <em>Abstract Attribute Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Attribute Relation</em>'.
   * @see dsltrans.AbstractAttributeRelation
   * @generated
   */
  EClass getAbstractAttributeRelation();

  /**
   * Returns the meta object for the reference '{@link dsltrans.AbstractAttributeRelation#getSourceAttribute <em>Source Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Attribute</em>'.
   * @see dsltrans.AbstractAttributeRelation#getSourceAttribute()
   * @see #getAbstractAttributeRelation()
   * @generated
   */
  EReference getAbstractAttributeRelation_SourceAttribute();

  /**
   * Returns the meta object for the reference '{@link dsltrans.AbstractAttributeRelation#getTargetAttribute <em>Target Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Attribute</em>'.
   * @see dsltrans.AbstractAttributeRelation#getTargetAttribute()
   * @see #getAbstractAttributeRelation()
   * @generated
   */
  EReference getAbstractAttributeRelation_TargetAttribute();

  /**
   * Returns the meta object for class '{@link dsltrans.AttributeEquality <em>Attribute Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Equality</em>'.
   * @see dsltrans.AttributeEquality
   * @generated
   */
  EClass getAttributeEquality();

  /**
   * Returns the meta object for class '{@link dsltrans.AttributeInequality <em>Attribute Inequality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Inequality</em>'.
   * @see dsltrans.AttributeInequality
   * @generated
   */
  EClass getAttributeInequality();

  /**
   * Returns the meta object for class '{@link dsltrans.MatchMayBeSameRelation <em>Match May Be Same Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Match May Be Same Relation</em>'.
   * @see dsltrans.MatchMayBeSameRelation
   * @generated
   */
  EClass getMatchMayBeSameRelation();

  /**
   * Returns the meta object for class '{@link dsltrans.ApplyMayBeSameRelation <em>Apply May Be Same Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply May Be Same Relation</em>'.
   * @see dsltrans.ApplyMayBeSameRelation
   * @generated
   */
  EClass getApplyMayBeSameRelation();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DsltransFactory getDsltransFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dsltrans.impl.TransformationModelImpl <em>Transformation Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.TransformationModelImpl
     * @see dsltrans.impl.DsltransPackageImpl#getTransformationModel()
     * @generated
     */
    EClass TRANSFORMATION_MODEL = eINSTANCE.getTransformationModel();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION_MODEL__SOURCE = eINSTANCE.getTransformationModel_Source();

    /**
     * The meta object literal for the '{@link dsltrans.impl.LayerImpl <em>Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.LayerImpl
     * @see dsltrans.impl.DsltransPackageImpl#getLayer()
     * @generated
     */
    EClass LAYER = eINSTANCE.getLayer();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__DESCRIPTION = eINSTANCE.getLayer_Description();

    /**
     * The meta object literal for the '<em><b>Previous Source</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYER__PREVIOUS_SOURCE = eINSTANCE.getLayer_PreviousSource();

    /**
     * The meta object literal for the '<em><b>Output File Path URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__OUTPUT_FILE_PATH_URI = eINSTANCE.getLayer_OutputFilePathURI();

    /**
     * The meta object literal for the '<em><b>Has Rule</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYER__HAS_RULE = eINSTANCE.getLayer_HasRule();

    /**
     * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__GROUP_NAME = eINSTANCE.getLayer_GroupName();

    /**
     * The meta object literal for the '{@link dsltrans.impl.MatchClassImpl <em>Match Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.MatchClassImpl
     * @see dsltrans.impl.DsltransPackageImpl#getMatchClass()
     * @generated
     */
    EClass MATCH_CLASS = eINSTANCE.getMatchClass();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_CLASS__ATTRIBUTE = eINSTANCE.getMatchClass_Attribute();

    /**
     * The meta object literal for the '{@link dsltrans.impl.PositiveMatchClassImpl <em>Positive Match Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.PositiveMatchClassImpl
     * @see dsltrans.impl.DsltransPackageImpl#getPositiveMatchClass()
     * @generated
     */
    EClass POSITIVE_MATCH_CLASS = eINSTANCE.getPositiveMatchClass();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AnyMatchClassImpl <em>Any Match Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AnyMatchClassImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAnyMatchClass()
     * @generated
     */
    EClass ANY_MATCH_CLASS = eINSTANCE.getAnyMatchClass();

    /**
     * The meta object literal for the '{@link dsltrans.impl.ExistsMatchClassImpl <em>Exists Match Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.ExistsMatchClassImpl
     * @see dsltrans.impl.DsltransPackageImpl#getExistsMatchClass()
     * @generated
     */
    EClass EXISTS_MATCH_CLASS = eINSTANCE.getExistsMatchClass();

    /**
     * The meta object literal for the '{@link dsltrans.impl.NegativeMatchClassImpl <em>Negative Match Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.NegativeMatchClassImpl
     * @see dsltrans.impl.DsltransPackageImpl#getNegativeMatchClass()
     * @generated
     */
    EClass NEGATIVE_MATCH_CLASS = eINSTANCE.getNegativeMatchClass();

    /**
     * The meta object literal for the '{@link dsltrans.impl.MatchModelImpl <em>Match Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.MatchModelImpl
     * @see dsltrans.impl.DsltransPackageImpl#getMatchModel()
     * @generated
     */
    EClass MATCH_MODEL = eINSTANCE.getMatchModel();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_MODEL__CLASS = eINSTANCE.getMatchModel_Class();

    /**
     * The meta object literal for the '<em><b>Association</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_MODEL__ASSOCIATION = eINSTANCE.getMatchModel_Association();

    /**
     * The meta object literal for the '<em><b>Explicit Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_MODEL__EXPLICIT_SOURCE = eINSTANCE.getMatchModel_ExplicitSource();

    /**
     * The meta object literal for the '{@link dsltrans.impl.MatchAssociationImpl <em>Match Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.MatchAssociationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getMatchAssociation()
     * @generated
     */
    EClass MATCH_ASSOCIATION = eINSTANCE.getMatchAssociation();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_ASSOCIATION__SOURCE = eINSTANCE.getMatchAssociation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_ASSOCIATION__TARGET = eINSTANCE.getMatchAssociation_Target();

    /**
     * The meta object literal for the '{@link dsltrans.impl.PositiveIndirectAssociationImpl <em>Positive Indirect Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.PositiveIndirectAssociationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getPositiveIndirectAssociation()
     * @generated
     */
    EClass POSITIVE_INDIRECT_ASSOCIATION = eINSTANCE.getPositiveIndirectAssociation();

    /**
     * The meta object literal for the '{@link dsltrans.impl.NegativeIndirectAssociationImpl <em>Negative Indirect Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.NegativeIndirectAssociationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getNegativeIndirectAssociation()
     * @generated
     */
    EClass NEGATIVE_INDIRECT_ASSOCIATION = eINSTANCE.getNegativeIndirectAssociation();

    /**
     * The meta object literal for the '{@link dsltrans.impl.PositiveMatchAssociationImpl <em>Positive Match Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.PositiveMatchAssociationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getPositiveMatchAssociation()
     * @generated
     */
    EClass POSITIVE_MATCH_ASSOCIATION = eINSTANCE.getPositiveMatchAssociation();

    /**
     * The meta object literal for the '{@link dsltrans.impl.NegativeMatchAssociationImpl <em>Negative Match Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.NegativeMatchAssociationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getNegativeMatchAssociation()
     * @generated
     */
    EClass NEGATIVE_MATCH_ASSOCIATION = eINSTANCE.getNegativeMatchAssociation();

    /**
     * The meta object literal for the '{@link dsltrans.impl.ApplyClassImpl <em>Apply Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.ApplyClassImpl
     * @see dsltrans.impl.DsltransPackageImpl#getApplyClass()
     * @generated
     */
    EClass APPLY_CLASS = eINSTANCE.getApplyClass();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY_CLASS__ATTRIBUTE = eINSTANCE.getApplyClass_Attribute();

    /**
     * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLY_CLASS__GROUP_NAME = eINSTANCE.getApplyClass_GroupName();

    /**
     * The meta object literal for the '{@link dsltrans.impl.ApplyModelImpl <em>Apply Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.ApplyModelImpl
     * @see dsltrans.impl.DsltransPackageImpl#getApplyModel()
     * @generated
     */
    EClass APPLY_MODEL = eINSTANCE.getApplyModel();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY_MODEL__CLASS = eINSTANCE.getApplyModel_Class();

    /**
     * The meta object literal for the '<em><b>Association</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY_MODEL__ASSOCIATION = eINSTANCE.getApplyModel_Association();

    /**
     * The meta object literal for the '{@link dsltrans.impl.ApplyAssociationImpl <em>Apply Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.ApplyAssociationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getApplyAssociation()
     * @generated
     */
    EClass APPLY_ASSOCIATION = eINSTANCE.getApplyAssociation();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY_ASSOCIATION__SOURCE = eINSTANCE.getApplyAssociation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY_ASSOCIATION__TARGET = eINSTANCE.getApplyAssociation_Target();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AbstractClassImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAbstractClass()
     * @generated
     */
    EClass ABSTRACT_CLASS = eINSTANCE.getAbstractClass();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_CLASS__DESCRIPTION = eINSTANCE.getAbstractClass_Description();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_CLASS__PACKAGE_NAME = eINSTANCE.getAbstractClass_PackageName();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_CLASS__CLASS_NAME = eINSTANCE.getAbstractClass_ClassName();

    /**
     * The meta object literal for the '<em><b>Allow Inheritance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_CLASS__ALLOW_INHERITANCE = eINSTANCE.getAbstractClass_AllowInheritance();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_CLASS__ID = eINSTANCE.getAbstractClass_Id();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AssociationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '<em><b>Association Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__ASSOCIATION_NAME = eINSTANCE.getAssociation_AssociationName();

    /**
     * The meta object literal for the '{@link dsltrans.impl.MatchAttributeImpl <em>Match Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.MatchAttributeImpl
     * @see dsltrans.impl.DsltransPackageImpl#getMatchAttribute()
     * @generated
     */
    EClass MATCH_ATTRIBUTE = eINSTANCE.getMatchAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATCH_ATTRIBUTE__ATTRIBUTE_VALUE = eINSTANCE.getMatchAttribute_AttributeValue();

    /**
     * The meta object literal for the '{@link dsltrans.impl.ApplyAttributeImpl <em>Apply Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.ApplyAttributeImpl
     * @see dsltrans.impl.DsltransPackageImpl#getApplyAttribute()
     * @generated
     */
    EClass APPLY_ATTRIBUTE = eINSTANCE.getApplyAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY_ATTRIBUTE__ATTRIBUTE_VALUE = eINSTANCE.getApplyAttribute_AttributeValue();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AbstractSourceImpl <em>Abstract Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AbstractSourceImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAbstractSource()
     * @generated
     */
    EClass ABSTRACT_SOURCE = eINSTANCE.getAbstractSource();

    /**
     * The meta object literal for the '<em><b>Meta Model Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SOURCE__META_MODEL_ID = eINSTANCE.getAbstractSource_MetaModelId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_SOURCE__NAME = eINSTANCE.getAbstractSource_Name();

    /**
     * The meta object literal for the '{@link dsltrans.impl.FilePortImpl <em>File Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.FilePortImpl
     * @see dsltrans.impl.DsltransPackageImpl#getFilePort()
     * @generated
     */
    EClass FILE_PORT = eINSTANCE.getFilePort();

    /**
     * The meta object literal for the '<em><b>File Path URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_PORT__FILE_PATH_URI = eINSTANCE.getFilePort_FilePathURI();

    /**
     * The meta object literal for the '{@link dsltrans.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.RuleImpl
     * @see dsltrans.impl.DsltransPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__DESCRIPTION = eINSTANCE.getRule_Description();

    /**
     * The meta object literal for the '<em><b>Match</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__MATCH = eINSTANCE.getRule_Match();

    /**
     * The meta object literal for the '<em><b>Apply</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__APPLY = eINSTANCE.getRule_Apply();

    /**
     * The meta object literal for the '<em><b>Backwards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__BACKWARDS = eINSTANCE.getRule_Backwards();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__IMPORTS = eINSTANCE.getRule_Imports();

    /**
     * The meta object literal for the '<em><b>Attribute Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__ATTRIBUTE_RELATIONS = eINSTANCE.getRule_AttributeRelations();

    /**
     * The meta object literal for the '{@link dsltrans.impl.MetaModelIdentifierImpl <em>Meta Model Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.MetaModelIdentifierImpl
     * @see dsltrans.impl.DsltransPackageImpl#getMetaModelIdentifier()
     * @generated
     */
    EClass META_MODEL_IDENTIFIER = eINSTANCE.getMetaModelIdentifier();

    /**
     * The meta object literal for the '<em><b>Meta Model URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_MODEL_IDENTIFIER__META_MODEL_URI = eINSTANCE.getMetaModelIdentifier_MetaModelURI();

    /**
     * The meta object literal for the '<em><b>Meta Model Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_MODEL_IDENTIFIER__META_MODEL_NAME = eINSTANCE.getMetaModelIdentifier_MetaModelName();

    /**
     * The meta object literal for the '{@link dsltrans.impl.PositiveBackwardRestrictionImpl <em>Positive Backward Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.PositiveBackwardRestrictionImpl
     * @see dsltrans.impl.DsltransPackageImpl#getPositiveBackwardRestriction()
     * @generated
     */
    EClass POSITIVE_BACKWARD_RESTRICTION = eINSTANCE.getPositiveBackwardRestriction();

    /**
     * The meta object literal for the '{@link dsltrans.impl.NegativeBackwardRestrictionImpl <em>Negative Backward Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.NegativeBackwardRestrictionImpl
     * @see dsltrans.impl.DsltransPackageImpl#getNegativeBackwardRestriction()
     * @generated
     */
    EClass NEGATIVE_BACKWARD_RESTRICTION = eINSTANCE.getNegativeBackwardRestriction();

    /**
     * The meta object literal for the '{@link dsltrans.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.ImportImpl
     * @see dsltrans.impl.DsltransPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__TARGET = eINSTANCE.getImport_Target();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__SOURCE = eINSTANCE.getImport_Source();

    /**
     * The meta object literal for the '{@link dsltrans.impl.SequentialImpl <em>Sequential</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.SequentialImpl
     * @see dsltrans.impl.DsltransPackageImpl#getSequential()
     * @generated
     */
    EClass SEQUENTIAL = eINSTANCE.getSequential();

    /**
     * The meta object literal for the '{@link dsltrans.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.TermImpl
     * @see dsltrans.impl.DsltransPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link dsltrans.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.OperatorImpl
     * @see dsltrans.impl.DsltransPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AtomImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOM__VALUE = eINSTANCE.getAtom_Value();

    /**
     * The meta object literal for the '{@link dsltrans.impl.RefImpl <em>Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.RefImpl
     * @see dsltrans.impl.DsltransPackageImpl#getRef()
     * @generated
     */
    EClass REF = eINSTANCE.getRef();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AttributeRefImpl <em>Attribute Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AttributeRefImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAttributeRef()
     * @generated
     */
    EClass ATTRIBUTE_REF = eINSTANCE.getAttributeRef();

    /**
     * The meta object literal for the '<em><b>Attribute Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_REF__ATTRIBUTE_REF = eINSTANCE.getAttributeRef_AttributeRef();

    /**
     * The meta object literal for the '{@link dsltrans.impl.ClassRefImpl <em>Class Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.ClassRefImpl
     * @see dsltrans.impl.DsltransPackageImpl#getClassRef()
     * @generated
     */
    EClass CLASS_REF = eINSTANCE.getClassRef();

    /**
     * The meta object literal for the '<em><b>Class Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_REF__CLASS_REF = eINSTANCE.getClassRef_ClassRef();

    /**
     * The meta object literal for the '{@link dsltrans.impl.ConcatImpl <em>Concat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.ConcatImpl
     * @see dsltrans.impl.DsltransPackageImpl#getConcat()
     * @generated
     */
    EClass CONCAT = eINSTANCE.getConcat();

    /**
     * The meta object literal for the '<em><b>Left Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCAT__LEFT_TERM = eINSTANCE.getConcat_LeftTerm();

    /**
     * The meta object literal for the '<em><b>Right Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCAT__RIGHT_TERM = eINSTANCE.getConcat_RightTerm();

    /**
     * The meta object literal for the '{@link dsltrans.impl.TypeOfImpl <em>Type Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.TypeOfImpl
     * @see dsltrans.impl.DsltransPackageImpl#getTypeOf()
     * @generated
     */
    EClass TYPE_OF = eINSTANCE.getTypeOf();

    /**
     * The meta object literal for the '{@link dsltrans.impl.WildcardImpl <em>Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.WildcardImpl
     * @see dsltrans.impl.DsltransPackageImpl#getWildcard()
     * @generated
     */
    EClass WILDCARD = eINSTANCE.getWildcard();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AttributeImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getAttribute_AttributeName();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ID = eINSTANCE.getAttribute_Id();

    /**
     * The meta object literal for the '{@link dsltrans.impl.isNullImpl <em>is Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.isNullImpl
     * @see dsltrans.impl.DsltransPackageImpl#getisNull()
     * @generated
     */
    EClass IS_NULL = eINSTANCE.getisNull();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IS_NULL__VALUE = eINSTANCE.getisNull_Value();

    /**
     * The meta object literal for the '{@link dsltrans.impl.MatchAttributeValueImpl <em>Match Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.MatchAttributeValueImpl
     * @see dsltrans.impl.DsltransPackageImpl#getMatchAttributeValue()
     * @generated
     */
    EClass MATCH_ATTRIBUTE_VALUE = eINSTANCE.getMatchAttributeValue();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AbstractTemporalRelationImpl <em>Abstract Temporal Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AbstractTemporalRelationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAbstractTemporalRelation()
     * @generated
     */
    EClass ABSTRACT_TEMPORAL_RELATION = eINSTANCE.getAbstractTemporalRelation();

    /**
     * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_TEMPORAL_RELATION__TARGET_CLASS = eINSTANCE.getAbstractTemporalRelation_TargetClass();

    /**
     * The meta object literal for the '<em><b>Source Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_TEMPORAL_RELATION__SOURCE_CLASS = eINSTANCE.getAbstractTemporalRelation_SourceClass();

    /**
     * The meta object literal for the '{@link dsltrans.impl.SequencerImpl <em>Sequencer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.SequencerImpl
     * @see dsltrans.impl.DsltransPackageImpl#getSequencer()
     * @generated
     */
    EClass SEQUENCER = eINSTANCE.getSequencer();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AbstractAttributeRelationImpl <em>Abstract Attribute Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AbstractAttributeRelationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAbstractAttributeRelation()
     * @generated
     */
    EClass ABSTRACT_ATTRIBUTE_RELATION = eINSTANCE.getAbstractAttributeRelation();

    /**
     * The meta object literal for the '<em><b>Source Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ATTRIBUTE_RELATION__SOURCE_ATTRIBUTE = eINSTANCE.getAbstractAttributeRelation_SourceAttribute();

    /**
     * The meta object literal for the '<em><b>Target Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_ATTRIBUTE_RELATION__TARGET_ATTRIBUTE = eINSTANCE.getAbstractAttributeRelation_TargetAttribute();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AttributeEqualityImpl <em>Attribute Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AttributeEqualityImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAttributeEquality()
     * @generated
     */
    EClass ATTRIBUTE_EQUALITY = eINSTANCE.getAttributeEquality();

    /**
     * The meta object literal for the '{@link dsltrans.impl.AttributeInequalityImpl <em>Attribute Inequality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.AttributeInequalityImpl
     * @see dsltrans.impl.DsltransPackageImpl#getAttributeInequality()
     * @generated
     */
    EClass ATTRIBUTE_INEQUALITY = eINSTANCE.getAttributeInequality();

    /**
     * The meta object literal for the '{@link dsltrans.impl.MatchMayBeSameRelationImpl <em>Match May Be Same Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.MatchMayBeSameRelationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getMatchMayBeSameRelation()
     * @generated
     */
    EClass MATCH_MAY_BE_SAME_RELATION = eINSTANCE.getMatchMayBeSameRelation();

    /**
     * The meta object literal for the '{@link dsltrans.impl.ApplyMayBeSameRelationImpl <em>Apply May Be Same Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dsltrans.impl.ApplyMayBeSameRelationImpl
     * @see dsltrans.impl.DsltransPackageImpl#getApplyMayBeSameRelation()
     * @generated
     */
    EClass APPLY_MAY_BE_SAME_RELATION = eINSTANCE.getApplyMayBeSameRelation();

  }

} //DsltransPackage
