/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see Java5.Java5Factory
 * @model kind="package"
 * @generated
 */
public interface Java5Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Java5";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/Java5";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Java5";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Java5Package eINSTANCE = Java5.impl.Java5PackageImpl.init();

	/**
	 * The meta object id for the '{@link Java5.impl.ASTNodeImpl <em>AST Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ASTNodeImpl
	 * @see Java5.impl.Java5PackageImpl#getASTNode()
	 * @generated
	 */
	int AST_NODE = 13;

	/**
	 * The number of structural features of the '<em>AST Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link Java5.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.NamedElementImpl
	 * @see Java5.impl.Java5PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__PROXY = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.BodyDeclarationImpl <em>Body Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.BodyDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getBodyDeclaration()
	 * @generated
	 */
	int BODY_DECLARATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION__MODIFIERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Body Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link Java5.impl.AbstractTypeDeclarationImpl <em>Abstract Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.AbstractTypeDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getAbstractTypeDeclaration()
	 * @generated
	 */
	int ABSTRACT_TYPE_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__MODIFIERS = BODY_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__IMPORTS = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__PACKAGE = BODY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES = BODY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link Java5.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ExpressionImpl
	 * @see Java5.impl.Java5PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 32;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.AnnotationImpl
	 * @see Java5.impl.Java5PackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUES = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.AnnotationMemberValuePairImpl <em>Annotation Member Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.AnnotationMemberValuePairImpl
	 * @see Java5.impl.Java5PackageImpl#getAnnotationMemberValuePair()
	 * @generated
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation Member Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MEMBER_VALUE_PAIR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.AnnotationTypeDeclarationImpl <em>Annotation Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.AnnotationTypeDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getAnnotationTypeDeclaration()
	 * @generated
	 */
	int ANNOTATION_TYPE_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__NAME = ABSTRACT_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__PROXY = ABSTRACT_TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = ABSTRACT_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__ANNOTATIONS = ABSTRACT_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ABSTRACT_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__MODIFIERS = ABSTRACT_TYPE_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__QUALIFIED_NAME = ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__BODY_DECLARATIONS = ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__IMPORTS = ABSTRACT_TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__PACKAGE = ABSTRACT_TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION__SUPER_INTERFACES = ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The number of structural features of the '<em>Annotation Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_DECLARATION_FEATURE_COUNT = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.AnnotationTypeMemberDeclarationImpl <em>Annotation Type Member Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.AnnotationTypeMemberDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getAnnotationTypeMemberDeclaration()
	 * @generated
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIERS = BODY_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation Type Member Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_MEMBER_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.AnonymousClassDeclarationImpl <em>Anonymous Class Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.AnonymousClassDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getAnonymousClassDeclaration()
	 * @generated
	 */
	int ANONYMOUS_CLASS_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Instance Creation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Anonymous Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CLASS_DECLARATION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.ArrayAccessImpl <em>Array Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ArrayAccessImpl
	 * @see Java5.impl.Java5PackageImpl#getArrayAccess()
	 * @generated
	 */
	int ARRAY_ACCESS = 6;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS__INDEX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Array Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.ArrayCreationImpl <em>Array Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ArrayCreationImpl
	 * @see Java5.impl.Java5PackageImpl#getArrayCreation()
	 * @generated
	 */
	int ARRAY_CREATION = 7;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__DIMENSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__INITIALIZER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION__TYPE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_CREATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ArrayInitializerImpl
	 * @see Java5.impl.Java5PackageImpl#getArrayInitializer()
	 * @generated
	 */
	int ARRAY_INITIALIZER = 8;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_INITIALIZER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.ArrayLengthAccessImpl <em>Array Length Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ArrayLengthAccessImpl
	 * @see Java5.impl.Java5PackageImpl#getArrayLengthAccess()
	 * @generated
	 */
	int ARRAY_LENGTH_ACCESS = 9;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_ACCESS__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Length Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_LENGTH_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.OrphanTypeImpl <em>Orphan Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.OrphanTypeImpl
	 * @see Java5.impl.Java5PackageImpl#getOrphanType()
	 * @generated
	 */
	int ORPHAN_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORPHAN_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORPHAN_TYPE__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The number of structural features of the '<em>Orphan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORPHAN_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ArrayTypeImpl
	 * @see Java5.impl.Java5PackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__NAME = ORPHAN_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__PROXY = ORPHAN_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DIMENSIONS = ORPHAN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ORIGINAL_NAME = ORPHAN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__ELEMENT_TYPE = ORPHAN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = ORPHAN_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.StatementImpl
	 * @see Java5.impl.Java5PackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 73;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.AssertStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getAssertStatement()
	 * @generated
	 */
	int ASSERT_STATEMENT = 11;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__MESSAGE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assert Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.AssignmentImpl
	 * @see Java5.impl.Java5PackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 12;

	/**
	 * The feature id for the '<em><b>Left Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__LEFT_HAND_SIDE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Hand Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__RIGHT_HAND_SIDE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.BlockImpl
	 * @see Java5.impl.Java5PackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 14;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.BooleanLiteralImpl
	 * @see Java5.impl.Java5PackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.BreakStatementImpl <em>Break Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.BreakStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getBreakStatement()
	 * @generated
	 */
	int BREAK_STATEMENT = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT__LABEL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Break Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.CastExpressionImpl
	 * @see Java5.impl.Java5PackageImpl#getCastExpression()
	 * @generated
	 */
	int CAST_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cast Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.CatchClauseImpl
	 * @see Java5.impl.Java5PackageImpl#getCatchClause()
	 * @generated
	 */
	int CATCH_CLAUSE = 19;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__EXCEPTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Catch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_CLAUSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.CharacterLiteralImpl
	 * @see Java5.impl.Java5PackageImpl#getCharacterLiteral()
	 * @generated
	 */
	int CHARACTER_LITERAL = 20;

	/**
	 * The feature id for the '<em><b>Escaped Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL__ESCAPED_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.TypeDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 85;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__NAME = ABSTRACT_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__PROXY = ABSTRACT_TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION = ABSTRACT_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ANNOTATIONS = ABSTRACT_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ABSTRACT_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__MODIFIERS = ABSTRACT_TYPE_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__QUALIFIED_NAME = ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__BODY_DECLARATIONS = ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__IMPORTS = ABSTRACT_TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__PACKAGE = ABSTRACT_TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__SUPER_INTERFACES = ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__TYPE_PARAMETERS = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ClassDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getClassDeclaration()
	 * @generated
	 */
	int CLASS_DECLARATION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__NAME = TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__PROXY = TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ABSTRACT_TYPE_DECLARATION = TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__MODIFIERS = TYPE_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__QUALIFIED_NAME = TYPE_DECLARATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__BODY_DECLARATIONS = TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__IMPORTS = TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__PACKAGE = TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__SUPER_INTERFACES = TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__TYPE_PARAMETERS = TYPE_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION__SUPER_CLASS = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.ClassInstanceCreationImpl <em>Class Instance Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ClassInstanceCreationImpl
	 * @see Java5.impl.Java5PackageImpl#getClassInstanceCreation()
	 * @generated
	 */
	int CLASS_INSTANCE_CREATION = 22;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__METHOD = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION__TYPE = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Class Instance Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INSTANCE_CREATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link Java5.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.CompilationUnitImpl
	 * @see Java5.impl.Java5PackageImpl#getCompilationUnit()
	 * @generated
	 */
	int COMPILATION_UNIT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__ORIGINAL_FILE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT__TYPES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Compilation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link Java5.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ConditionalExpressionImpl
	 * @see Java5.impl.Java5PackageImpl#getConditionalExpression()
	 * @generated
	 */
	int CONDITIONAL_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION__THEN_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.ConstructorInvocationImpl <em>Constructor Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ConstructorInvocationImpl
	 * @see Java5.impl.Java5PackageImpl#getConstructorInvocation()
	 * @generated
	 */
	int CONSTRUCTOR_INVOCATION = 25;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__ARGUMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION__METHOD = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_INVOCATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ContinueStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getContinueStatement()
	 * @generated
	 */
	int CONTINUE_STATEMENT = 26;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT__LABEL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continue Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.DoStatementImpl <em>Do Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.DoStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getDoStatement()
	 * @generated
	 */
	int DO_STATEMENT = 27;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Do Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.EmptyStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getEmptyStatement()
	 * @generated
	 */
	int EMPTY_STATEMENT = 28;

	/**
	 * The number of structural features of the '<em>Empty Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.EnumDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getEnumDeclaration()
	 * @generated
	 */
	int ENUM_DECLARATION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__NAME = ABSTRACT_TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__PROXY = ABSTRACT_TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ABSTRACT_TYPE_DECLARATION = ABSTRACT_TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ANNOTATIONS = ABSTRACT_TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = ABSTRACT_TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__MODIFIERS = ABSTRACT_TYPE_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__QUALIFIED_NAME = ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__BODY_DECLARATIONS = ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__IMPORTS = ABSTRACT_TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__PACKAGE = ABSTRACT_TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__SUPER_INTERFACES = ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Enum Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION__ENUM_CONSTANTS = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_DECLARATION_FEATURE_COUNT = ABSTRACT_TYPE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.EnumConstantDeclarationImpl <em>Enum Constant Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.EnumConstantDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getEnumConstantDeclaration()
	 * @generated
	 */
	int ENUM_CONSTANT_DECLARATION = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__MODIFIERS = BODY_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION__ARGUMENTS = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Constant Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_CONSTANT_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.EnhancedForStatementImpl <em>Enhanced For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.EnhancedForStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getEnhancedForStatement()
	 * @generated
	 */
	int ENHANCED_FOR_STATEMENT = 31;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT__PARAMETER = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enhanced For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENHANCED_FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ExpressionStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getExpressionStatement()
	 * @generated
	 */
	int EXPRESSION_STATEMENT = 33;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.FieldAccessImpl <em>Field Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.FieldAccessImpl
	 * @see Java5.impl.Java5PackageImpl#getFieldAccess()
	 * @generated
	 */
	int FIELD_ACCESS = 34;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS__FIELD = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.FieldDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getFieldDeclaration()
	 * @generated
	 */
	int FIELD_DECLARATION = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__MODIFIERS = BODY_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__TYPE = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__FRAGMENTS = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ForStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 36;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__UPDATERS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initializers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__INITIALIZERS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link Java5.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.IfStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 37;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__THEN_STATEMENT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__ELSE_STATEMENT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ImportDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getImportDeclaration()
	 * @generated
	 */
	int IMPORT_DECLARATION = 38;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION__STATIC = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION__IMPORTED_ELEMENT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Import Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DECLARATION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.InfixExpressionImpl <em>Infix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.InfixExpressionImpl
	 * @see Java5.impl.Java5PackageImpl#getInfixExpression()
	 * @generated
	 */
	int INFIX_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extended Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION__EXTENDED_OPERANDS = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Infix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFIX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link Java5.impl.InitializerImpl <em>Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.InitializerImpl
	 * @see Java5.impl.Java5PackageImpl#getInitializer()
	 * @generated
	 */
	int INITIALIZER = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__MODIFIERS = BODY_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER__BODY = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZER_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.InstanceofExpressionImpl <em>Instanceof Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.InstanceofExpressionImpl
	 * @see Java5.impl.Java5PackageImpl#getInstanceofExpression()
	 * @generated
	 */
	int INSTANCEOF_EXPRESSION = 41;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instanceof Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCEOF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.InterfaceDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getInterfaceDeclaration()
	 * @generated
	 */
	int INTERFACE_DECLARATION = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__NAME = TYPE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__PROXY = TYPE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ABSTRACT_TYPE_DECLARATION = TYPE_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ANNOTATIONS = TYPE_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = TYPE_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__MODIFIERS = TYPE_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__QUALIFIED_NAME = TYPE_DECLARATION__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Body Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__BODY_DECLARATIONS = TYPE_DECLARATION__BODY_DECLARATIONS;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__IMPORTS = TYPE_DECLARATION__IMPORTS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__PACKAGE = TYPE_DECLARATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Super Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__SUPER_INTERFACES = TYPE_DECLARATION__SUPER_INTERFACES;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION__TYPE_PARAMETERS = TYPE_DECLARATION__TYPE_PARAMETERS;

	/**
	 * The number of structural features of the '<em>Interface Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DECLARATION_FEATURE_COUNT = TYPE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.LabeledStatementImpl <em>Labeled Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.LabeledStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getLabeledStatement()
	 * @generated
	 */
	int LABELED_STATEMENT = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT__BODY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Labeled Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_STATEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.MemberRefImpl <em>Member Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.MemberRefImpl
	 * @see Java5.impl.Java5PackageImpl#getMemberRef()
	 * @generated
	 */
	int MEMBER_REF = 44;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF__MEMBER = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF__QUALIFIER = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.MethodDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getMethodDeclaration()
	 * @generated
	 */
	int METHOD_DECLARATION = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__NAME = BODY_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__PROXY = BODY_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Abstract Type Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__ABSTRACT_TYPE_DECLARATION = BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__ANNOTATIONS = BODY_DECLARATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__MODIFIERS = BODY_DECLARATION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS = BODY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__CONSTRUCTOR = BODY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Varargs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__VARARGS = BODY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__BODY = BODY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thrown Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__THROWN_EXCEPTIONS = BODY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__RETURN_TYPE = BODY_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__TYPE_PARAMETERS = BODY_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Redefined Method Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION = BODY_DECLARATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Redefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__REDEFINITIONS = BODY_DECLARATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION__PARAMETERS = BODY_DECLARATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Method Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DECLARATION_FEATURE_COUNT = BODY_DECLARATION_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link Java5.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.MethodInvocationImpl
	 * @see Java5.impl.Java5PackageImpl#getMethodInvocation()
	 * @generated
	 */
	int METHOD_INVOCATION = 46;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__METHOD = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_INVOCATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.MethodRefImpl <em>Method Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.MethodRefImpl
	 * @see Java5.impl.Java5PackageImpl#getMethodRef()
	 * @generated
	 */
	int METHOD_REF = 47;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__METHOD = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__QUALIFIER = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF__PARAMETERS = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.MethodRefParameterImpl <em>Method Ref Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.MethodRefParameterImpl
	 * @see Java5.impl.Java5PackageImpl#getMethodRefParameter()
	 * @generated
	 */
	int METHOD_REF_PARAMETER = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER__NAME = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Varargs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER__IS_VARARGS = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER__TYPE = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Ref Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_REF_PARAMETER_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ModelImpl
	 * @see Java5.impl.Java5PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNED_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Orphan Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ORPHAN_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Unresolved Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__UNRESOLVED_ITEMS = 3;

	/**
	 * The feature id for the '<em><b>Compilation Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMPILATION_UNITS = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link Java5.impl.ModifierImpl <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ModifierImpl
	 * @see Java5.impl.Java5PackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 50;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VISIBILITY = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__INHERITANCE = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__STATIC = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__TRANSIENT = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VOLATILE = AST_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__NATIVE = AST_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strictfp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__STRICTFP = AST_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__SYNCHRONIZED = AST_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Body Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__BODY_DECLARATION = AST_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Single Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__SINGLE_VARIABLE_DECLARATION = AST_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Variable Declaration Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VARIABLE_DECLARATION_STATEMENT = AST_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Variable Declaration Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VARIABLE_DECLARATION_EXPRESSION = AST_NODE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link Java5.impl.NamedElementRefImpl <em>Named Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.NamedElementRefImpl
	 * @see Java5.impl.Java5PackageImpl#getNamedElementRef()
	 * @generated
	 */
	int NAMED_ELEMENT_REF = 52;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_REF__QUALIFIER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_REF__ELEMENT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Named Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.NullLiteralImpl
	 * @see Java5.impl.Java5PackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 53;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.NumberLiteralImpl
	 * @see Java5.impl.Java5PackageImpl#getNumberLiteral()
	 * @generated
	 */
	int NUMBER_LITERAL = 54;

	/**
	 * The feature id for the '<em><b>Token Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL__TOKEN_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PackageDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getPackageDeclaration()
	 * @generated
	 */
	int PACKAGE_DECLARATION = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__QUALIFIED_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__OWNED_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION__OWNED_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.ParameterizedTypeImpl <em>Parameterized Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ParameterizedTypeImpl
	 * @see Java5.impl.Java5PackageImpl#getParameterizedType()
	 * @generated
	 */
	int PARAMETERIZED_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__NAME = ORPHAN_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__PROXY = ORPHAN_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__TYPE = ORPHAN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE__TYPE_ARGUMENTS = ORPHAN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameterized Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TYPE_FEATURE_COUNT = ORPHAN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ParenthesizedExpressionImpl
	 * @see Java5.impl.Java5PackageImpl#getParenthesizedExpression()
	 * @generated
	 */
	int PARENTHESIZED_EXPRESSION = 58;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parenthesized Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIZED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PostfixExpressionImpl
	 * @see Java5.impl.Java5PackageImpl#getPostfixExpression()
	 * @generated
	 */
	int POSTFIX_EXPRESSION = 59;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.PrefixExpressionImpl <em>Prefix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrefixExpressionImpl
	 * @see Java5.impl.Java5PackageImpl#getPrefixExpression()
	 * @generated
	 */
	int PREFIX_EXPRESSION = 60;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prefix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrimitiveTypeImpl
	 * @see Java5.impl.Java5PackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = ORPHAN_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PROXY = ORPHAN_TYPE__PROXY;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = ORPHAN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.PrimitiveTypeBooleanImpl <em>Primitive Type Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrimitiveTypeBooleanImpl
	 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeBoolean()
	 * @generated
	 */
	int PRIMITIVE_TYPE_BOOLEAN = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The number of structural features of the '<em>Primitive Type Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.PrimitiveTypeByteImpl <em>Primitive Type Byte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrimitiveTypeByteImpl
	 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeByte()
	 * @generated
	 */
	int PRIMITIVE_TYPE_BYTE = 63;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The number of structural features of the '<em>Primitive Type Byte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_BYTE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.PrimitiveTypeCharImpl <em>Primitive Type Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrimitiveTypeCharImpl
	 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeChar()
	 * @generated
	 */
	int PRIMITIVE_TYPE_CHAR = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The number of structural features of the '<em>Primitive Type Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CHAR_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.PrimitiveTypeDoubleImpl <em>Primitive Type Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrimitiveTypeDoubleImpl
	 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeDouble()
	 * @generated
	 */
	int PRIMITIVE_TYPE_DOUBLE = 65;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The number of structural features of the '<em>Primitive Type Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_DOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.PrimitiveTypeShortImpl <em>Primitive Type Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrimitiveTypeShortImpl
	 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeShort()
	 * @generated
	 */
	int PRIMITIVE_TYPE_SHORT = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The number of structural features of the '<em>Primitive Type Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_SHORT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.PrimitiveTypeFloatImpl <em>Primitive Type Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrimitiveTypeFloatImpl
	 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeFloat()
	 * @generated
	 */
	int PRIMITIVE_TYPE_FLOAT = 67;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The number of structural features of the '<em>Primitive Type Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FLOAT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.PrimitiveTypeIntImpl <em>Primitive Type Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrimitiveTypeIntImpl
	 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeInt()
	 * @generated
	 */
	int PRIMITIVE_TYPE_INT = 68;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The number of structural features of the '<em>Primitive Type Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_INT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.PrimitiveTypeLongImpl <em>Primitive Type Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrimitiveTypeLongImpl
	 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeLong()
	 * @generated
	 */
	int PRIMITIVE_TYPE_LONG = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The number of structural features of the '<em>Primitive Type Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_LONG_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.PrimitiveTypeVoidImpl <em>Primitive Type Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.PrimitiveTypeVoidImpl
	 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeVoid()
	 * @generated
	 */
	int PRIMITIVE_TYPE_VOID = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID__NAME = PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID__PROXY = PRIMITIVE_TYPE__PROXY;

	/**
	 * The number of structural features of the '<em>Primitive Type Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_VOID_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ReturnStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 71;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.VariableDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 91;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__INITIALIZER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.SingleVariableDeclarationImpl <em>Single Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.SingleVariableDeclarationImpl
	 * @see Java5.impl.Java5PackageImpl#getSingleVariableDeclaration()
	 * @generated
	 */
	int SINGLE_VARIABLE_DECLARATION = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__NAME = VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__PROXY = VARIABLE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__INITIALIZER = VARIABLE_DECLARATION__INITIALIZER;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__MODIFIERS = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Varargs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__VARARGS = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__TYPE = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Method Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION = VARIABLE_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Catch Clause</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE = VARIABLE_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enhanced For Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT = VARIABLE_DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Single Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VARIABLE_DECLARATION_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link Java5.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.StringLiteralImpl
	 * @see Java5.impl.Java5PackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 74;

	/**
	 * The feature id for the '<em><b>Escaped Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__ESCAPED_VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.SuperConstructorInvocationImpl <em>Super Constructor Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.SuperConstructorInvocationImpl
	 * @see Java5.impl.Java5PackageImpl#getSuperConstructorInvocation()
	 * @generated
	 */
	int SUPER_CONSTRUCTOR_INVOCATION = 75;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION__METHOD = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Super Constructor Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_CONSTRUCTOR_INVOCATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.SuperFieldAccessImpl <em>Super Field Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.SuperFieldAccessImpl
	 * @see Java5.impl.Java5PackageImpl#getSuperFieldAccess()
	 * @generated
	 */
	int SUPER_FIELD_ACCESS = 76;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FIELD_ACCESS__FIELD = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FIELD_ACCESS__QUALIFIER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Super Field Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_FIELD_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.SuperMethodInvocationImpl <em>Super Method Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.SuperMethodInvocationImpl
	 * @see Java5.impl.Java5PackageImpl#getSuperMethodInvocation()
	 * @generated
	 */
	int SUPER_METHOD_INVOCATION = 77;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__METHOD = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION__QUALIFIER = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Super Method Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_METHOD_INVOCATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.SwitchCaseImpl
	 * @see Java5.impl.Java5PackageImpl#getSwitchCase()
	 * @generated
	 */
	int SWITCH_CASE = 78;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__DEFAULT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.SwitchStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getSwitchStatement()
	 * @generated
	 */
	int SWITCH_STATEMENT = 79;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.SynchronizedStatementImpl <em>Synchronized Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.SynchronizedStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getSynchronizedStatement()
	 * @generated
	 */
	int SYNCHRONIZED_STATEMENT = 80;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Synchronized Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.TagElementImpl <em>Tag Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.TagElementImpl
	 * @see Java5.impl.Java5PackageImpl#getTagElement()
	 * @generated
	 */
	int TAG_ELEMENT = 81;

	/**
	 * The feature id for the '<em><b>Tag Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ELEMENT__TAG_NAME = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ELEMENT__FRAGMENTS = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_ELEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.TextElementImpl
	 * @see Java5.impl.Java5PackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 82;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__TEXT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.ThisExpressionImpl <em>This Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ThisExpressionImpl
	 * @see Java5.impl.Java5PackageImpl#getThisExpression()
	 * @generated
	 */
	int THIS_EXPRESSION = 83;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION__QUALIFIER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>This Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.ThrowStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getThrowStatement()
	 * @generated
	 */
	int THROW_STATEMENT = 84;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Throw Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.TypeDeclarationStatementImpl <em>Type Declaration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.TypeDeclarationStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getTypeDeclarationStatement()
	 * @generated
	 */
	int TYPE_DECLARATION_STATEMENT = 86;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT__DECLARATION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.TypeLiteralImpl <em>Type Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.TypeLiteralImpl
	 * @see Java5.impl.Java5PackageImpl#getTypeLiteral()
	 * @generated
	 */
	int TYPE_LITERAL = 87;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.TypeParameterImpl
	 * @see Java5.impl.Java5PackageImpl#getTypeParameter()
	 * @generated
	 */
	int TYPE_PARAMETER = 88;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER__BOUNDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Java5.impl.TryStatementImpl <em>Try Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.TryStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getTryStatement()
	 * @generated
	 */
	int TRY_STATEMENT = 89;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Finally</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__FINALLY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Catch Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT__CATCH_CLAUSES = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Try Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.UnresolvedItemImpl <em>Unresolved Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.UnresolvedItemImpl
	 * @see Java5.impl.Java5PackageImpl#getUnresolvedItem()
	 * @generated
	 */
	int UNRESOLVED_ITEM = 90;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM__PROXY = NAMED_ELEMENT__PROXY;

	/**
	 * The number of structural features of the '<em>Unresolved Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNRESOLVED_ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link Java5.impl.VariableDeclarationExpressionImpl <em>Variable Declaration Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.VariableDeclarationExpressionImpl
	 * @see Java5.impl.Java5PackageImpl#getVariableDeclarationExpression()
	 * @generated
	 */
	int VARIABLE_DECLARATION_EXPRESSION = 92;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION__MODIFIERS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.VariableDeclarationFragmentImpl <em>Variable Declaration Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.VariableDeclarationFragmentImpl
	 * @see Java5.impl.Java5PackageImpl#getVariableDeclarationFragment()
	 * @generated
	 */
	int VARIABLE_DECLARATION_FRAGMENT = 93;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__NAME = VARIABLE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__PROXY = VARIABLE_DECLARATION__PROXY;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__EXTRA_ARRAY_DIMENSIONS = VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__INITIALIZER = VARIABLE_DECLARATION__INITIALIZER;

	/**
	 * The feature id for the '<em><b>Field Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Declaration Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Declaration Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FRAGMENT_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Java5.impl.VariableDeclarationStatementImpl <em>Variable Declaration Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.VariableDeclarationStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getVariableDeclarationStatement()
	 * @generated
	 */
	int VARIABLE_DECLARATION_STATEMENT = 94;

	/**
	 * The feature id for the '<em><b>Extra Array Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__EXTRA_ARRAY_DIMENSIONS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__FRAGMENTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT__MODIFIERS = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Declaration Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link Java5.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.WhileStatementImpl
	 * @see Java5.impl.Java5PackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 95;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.impl.WildCardTypeImpl <em>Wild Card Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.impl.WildCardTypeImpl
	 * @see Java5.impl.Java5PackageImpl#getWildCardType()
	 * @generated
	 */
	int WILD_CARD_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__NAME = ORPHAN_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__PROXY = ORPHAN_TYPE__PROXY;

	/**
	 * The feature id for the '<em><b>Is Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__IS_UPPER_BOUND = ORPHAN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE__BOUND = ORPHAN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wild Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WILD_CARD_TYPE_FEATURE_COUNT = ORPHAN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Java5.InheritanceKind <em>Inheritance Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.InheritanceKind
	 * @see Java5.impl.Java5PackageImpl#getInheritanceKind()
	 * @generated
	 */
	int INHERITANCE_KIND = 97;

	/**
	 * The meta object id for the '{@link Java5.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Java5.VisibilityKind
	 * @see Java5.impl.Java5PackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 98;


	/**
	 * Returns the meta object for class '{@link Java5.AbstractTypeDeclaration <em>Abstract Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type Declaration</em>'.
	 * @see Java5.AbstractTypeDeclaration
	 * @generated
	 */
	EClass getAbstractTypeDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link Java5.AbstractTypeDeclaration#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see Java5.AbstractTypeDeclaration#getQualifiedName()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EAttribute getAbstractTypeDeclaration_QualifiedName();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.AbstractTypeDeclaration#getBodyDeclarations <em>Body Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Declarations</em>'.
	 * @see Java5.AbstractTypeDeclaration#getBodyDeclarations()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_BodyDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.AbstractTypeDeclaration#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see Java5.AbstractTypeDeclaration#getImports()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_Imports();

	/**
	 * Returns the meta object for the container reference '{@link Java5.AbstractTypeDeclaration#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see Java5.AbstractTypeDeclaration#getPackage()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.AbstractTypeDeclaration#getSuperInterfaces <em>Super Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Super Interfaces</em>'.
	 * @see Java5.AbstractTypeDeclaration#getSuperInterfaces()
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 */
	EReference getAbstractTypeDeclaration_SuperInterfaces();

	/**
	 * Returns the meta object for class '{@link Java5.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see Java5.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.Annotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.Annotation#getType()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.Annotation#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see Java5.Annotation#getValues()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Values();

	/**
	 * Returns the meta object for class '{@link Java5.AnnotationMemberValuePair <em>Annotation Member Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Member Value Pair</em>'.
	 * @see Java5.AnnotationMemberValuePair
	 * @generated
	 */
	EClass getAnnotationMemberValuePair();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.AnnotationMemberValuePair#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member</em>'.
	 * @see Java5.AnnotationMemberValuePair#getMember()
	 * @see #getAnnotationMemberValuePair()
	 * @generated
	 */
	EReference getAnnotationMemberValuePair_Member();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.AnnotationMemberValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see Java5.AnnotationMemberValuePair#getValue()
	 * @see #getAnnotationMemberValuePair()
	 * @generated
	 */
	EReference getAnnotationMemberValuePair_Value();

	/**
	 * Returns the meta object for class '{@link Java5.AnnotationTypeDeclaration <em>Annotation Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type Declaration</em>'.
	 * @see Java5.AnnotationTypeDeclaration
	 * @generated
	 */
	EClass getAnnotationTypeDeclaration();

	/**
	 * Returns the meta object for class '{@link Java5.AnnotationTypeMemberDeclaration <em>Annotation Type Member Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type Member Declaration</em>'.
	 * @see Java5.AnnotationTypeMemberDeclaration
	 * @generated
	 */
	EClass getAnnotationTypeMemberDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.AnnotationTypeMemberDeclaration#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see Java5.AnnotationTypeMemberDeclaration#getDefault()
	 * @see #getAnnotationTypeMemberDeclaration()
	 * @generated
	 */
	EReference getAnnotationTypeMemberDeclaration_Default();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.AnnotationTypeMemberDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.AnnotationTypeMemberDeclaration#getType()
	 * @see #getAnnotationTypeMemberDeclaration()
	 * @generated
	 */
	EReference getAnnotationTypeMemberDeclaration_Type();

	/**
	 * Returns the meta object for class '{@link Java5.AnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Class Declaration</em>'.
	 * @see Java5.AnonymousClassDeclaration
	 * @generated
	 */
	EClass getAnonymousClassDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.AnonymousClassDeclaration#getBodyDeclarations <em>Body Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Declarations</em>'.
	 * @see Java5.AnonymousClassDeclaration#getBodyDeclarations()
	 * @see #getAnonymousClassDeclaration()
	 * @generated
	 */
	EReference getAnonymousClassDeclaration_BodyDeclarations();

	/**
	 * Returns the meta object for the container reference '{@link Java5.AnonymousClassDeclaration#getClassInstanceCreation <em>Class Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class Instance Creation</em>'.
	 * @see Java5.AnonymousClassDeclaration#getClassInstanceCreation()
	 * @see #getAnonymousClassDeclaration()
	 * @generated
	 */
	EReference getAnonymousClassDeclaration_ClassInstanceCreation();

	/**
	 * Returns the meta object for class '{@link Java5.ArrayAccess <em>Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Access</em>'.
	 * @see Java5.ArrayAccess
	 * @generated
	 */
	EClass getArrayAccess();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ArrayAccess#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see Java5.ArrayAccess#getArray()
	 * @see #getArrayAccess()
	 * @generated
	 */
	EReference getArrayAccess_Array();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ArrayAccess#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see Java5.ArrayAccess#getIndex()
	 * @see #getArrayAccess()
	 * @generated
	 */
	EReference getArrayAccess_Index();

	/**
	 * Returns the meta object for class '{@link Java5.ArrayCreation <em>Array Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Creation</em>'.
	 * @see Java5.ArrayCreation
	 * @generated
	 */
	EClass getArrayCreation();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.ArrayCreation#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimensions</em>'.
	 * @see Java5.ArrayCreation#getDimensions()
	 * @see #getArrayCreation()
	 * @generated
	 */
	EReference getArrayCreation_Dimensions();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ArrayCreation#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see Java5.ArrayCreation#getInitializer()
	 * @see #getArrayCreation()
	 * @generated
	 */
	EReference getArrayCreation_Initializer();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ArrayCreation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.ArrayCreation#getType()
	 * @see #getArrayCreation()
	 * @generated
	 */
	EReference getArrayCreation_Type();

	/**
	 * Returns the meta object for class '{@link Java5.ArrayInitializer <em>Array Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Initializer</em>'.
	 * @see Java5.ArrayInitializer
	 * @generated
	 */
	EClass getArrayInitializer();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.ArrayInitializer#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see Java5.ArrayInitializer#getExpressions()
	 * @see #getArrayInitializer()
	 * @generated
	 */
	EReference getArrayInitializer_Expressions();

	/**
	 * Returns the meta object for class '{@link Java5.ArrayLengthAccess <em>Array Length Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Length Access</em>'.
	 * @see Java5.ArrayLengthAccess
	 * @generated
	 */
	EClass getArrayLengthAccess();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ArrayLengthAccess#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see Java5.ArrayLengthAccess#getArray()
	 * @see #getArrayLengthAccess()
	 * @generated
	 */
	EReference getArrayLengthAccess_Array();

	/**
	 * Returns the meta object for class '{@link Java5.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see Java5.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the attribute '{@link Java5.ArrayType#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensions</em>'.
	 * @see Java5.ArrayType#getDimensions()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_Dimensions();

	/**
	 * Returns the meta object for the attribute '{@link Java5.ArrayType#getOriginalName <em>Original Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Name</em>'.
	 * @see Java5.ArrayType#getOriginalName()
	 * @see #getArrayType()
	 * @generated
	 */
	EAttribute getArrayType_OriginalName();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ArrayType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Type</em>'.
	 * @see Java5.ArrayType#getElementType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_ElementType();

	/**
	 * Returns the meta object for class '{@link Java5.AssertStatement <em>Assert Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assert Statement</em>'.
	 * @see Java5.AssertStatement
	 * @generated
	 */
	EClass getAssertStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.AssertStatement#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see Java5.AssertStatement#getMessage()
	 * @see #getAssertStatement()
	 * @generated
	 */
	EReference getAssertStatement_Message();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.AssertStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.AssertStatement#getExpression()
	 * @see #getAssertStatement()
	 * @generated
	 */
	EReference getAssertStatement_Expression();

	/**
	 * Returns the meta object for class '{@link Java5.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see Java5.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.Assignment#getLeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Hand Side</em>'.
	 * @see Java5.Assignment#getLeftHandSide()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_LeftHandSide();

	/**
	 * Returns the meta object for the attribute '{@link Java5.Assignment#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see Java5.Assignment#getOperator()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.Assignment#getRightHandSide <em>Right Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hand Side</em>'.
	 * @see Java5.Assignment#getRightHandSide()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_RightHandSide();

	/**
	 * Returns the meta object for class '{@link Java5.ASTNode <em>AST Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AST Node</em>'.
	 * @see Java5.ASTNode
	 * @generated
	 */
	EClass getASTNode();

	/**
	 * Returns the meta object for class '{@link Java5.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see Java5.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see Java5.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for class '{@link Java5.BodyDeclaration <em>Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Declaration</em>'.
	 * @see Java5.BodyDeclaration
	 * @generated
	 */
	EClass getBodyDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link Java5.BodyDeclaration#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Abstract Type Declaration</em>'.
	 * @see Java5.BodyDeclaration#getAbstractTypeDeclaration()
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	EReference getBodyDeclaration_AbstractTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.BodyDeclaration#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see Java5.BodyDeclaration#getAnnotations()
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	EReference getBodyDeclaration_Annotations();

	/**
	 * Returns the meta object for the container reference '{@link Java5.BodyDeclaration#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Anonymous Class Declaration Owner</em>'.
	 * @see Java5.BodyDeclaration#getAnonymousClassDeclarationOwner()
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	EReference getBodyDeclaration_AnonymousClassDeclarationOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.BodyDeclaration#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see Java5.BodyDeclaration#getModifiers()
	 * @see #getBodyDeclaration()
	 * @generated
	 */
	EReference getBodyDeclaration_Modifiers();

	/**
	 * Returns the meta object for class '{@link Java5.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see Java5.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link Java5.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Java5.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link Java5.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break Statement</em>'.
	 * @see Java5.BreakStatement
	 * @generated
	 */
	EClass getBreakStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.BreakStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see Java5.BreakStatement#getLabel()
	 * @see #getBreakStatement()
	 * @generated
	 */
	EReference getBreakStatement_Label();

	/**
	 * Returns the meta object for class '{@link Java5.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Expression</em>'.
	 * @see Java5.CastExpression
	 * @generated
	 */
	EClass getCastExpression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.CastExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.CastExpression#getExpression()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.CastExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.CastExpression#getType()
	 * @see #getCastExpression()
	 * @generated
	 */
	EReference getCastExpression_Type();

	/**
	 * Returns the meta object for class '{@link Java5.CatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Clause</em>'.
	 * @see Java5.CatchClause
	 * @generated
	 */
	EClass getCatchClause();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.CatchClause#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see Java5.CatchClause#getException()
	 * @see #getCatchClause()
	 * @generated
	 */
	EReference getCatchClause_Exception();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.CatchClause#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see Java5.CatchClause#getBody()
	 * @see #getCatchClause()
	 * @generated
	 */
	EReference getCatchClause_Body();

	/**
	 * Returns the meta object for class '{@link Java5.CharacterLiteral <em>Character Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Literal</em>'.
	 * @see Java5.CharacterLiteral
	 * @generated
	 */
	EClass getCharacterLiteral();

	/**
	 * Returns the meta object for the attribute '{@link Java5.CharacterLiteral#getEscapedValue <em>Escaped Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escaped Value</em>'.
	 * @see Java5.CharacterLiteral#getEscapedValue()
	 * @see #getCharacterLiteral()
	 * @generated
	 */
	EAttribute getCharacterLiteral_EscapedValue();

	/**
	 * Returns the meta object for the attribute '{@link Java5.CharacterLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Java5.CharacterLiteral#getValue()
	 * @see #getCharacterLiteral()
	 * @generated
	 */
	EAttribute getCharacterLiteral_Value();

	/**
	 * Returns the meta object for class '{@link Java5.ClassDeclaration <em>Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Declaration</em>'.
	 * @see Java5.ClassDeclaration
	 * @generated
	 */
	EClass getClassDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ClassDeclaration#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Class</em>'.
	 * @see Java5.ClassDeclaration#getSuperClass()
	 * @see #getClassDeclaration()
	 * @generated
	 */
	EReference getClassDeclaration_SuperClass();

	/**
	 * Returns the meta object for class '{@link Java5.ClassInstanceCreation <em>Class Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Instance Creation</em>'.
	 * @see Java5.ClassInstanceCreation
	 * @generated
	 */
	EClass getClassInstanceCreation();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ClassInstanceCreation#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anonymous Class Declaration</em>'.
	 * @see Java5.ClassInstanceCreation#getAnonymousClassDeclaration()
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	EReference getClassInstanceCreation_AnonymousClassDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.ClassInstanceCreation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see Java5.ClassInstanceCreation#getArguments()
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	EReference getClassInstanceCreation_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ClassInstanceCreation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.ClassInstanceCreation#getExpression()
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	EReference getClassInstanceCreation_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ClassInstanceCreation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see Java5.ClassInstanceCreation#getMethod()
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	EReference getClassInstanceCreation_Method();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ClassInstanceCreation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.ClassInstanceCreation#getType()
	 * @see #getClassInstanceCreation()
	 * @generated
	 */
	EReference getClassInstanceCreation_Type();

	/**
	 * Returns the meta object for class '{@link Java5.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Unit</em>'.
	 * @see Java5.CompilationUnit
	 * @generated
	 */
	EClass getCompilationUnit();

	/**
	 * Returns the meta object for the reference list '{@link Java5.CompilationUnit#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see Java5.CompilationUnit#getImports()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Imports();

	/**
	 * Returns the meta object for the attribute '{@link Java5.CompilationUnit#getOriginalFilePath <em>Original File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original File Path</em>'.
	 * @see Java5.CompilationUnit#getOriginalFilePath()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EAttribute getCompilationUnit_OriginalFilePath();

	/**
	 * Returns the meta object for the reference '{@link Java5.CompilationUnit#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see Java5.CompilationUnit#getPackage()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Package();

	/**
	 * Returns the meta object for the reference list '{@link Java5.CompilationUnit#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see Java5.CompilationUnit#getTypes()
	 * @see #getCompilationUnit()
	 * @generated
	 */
	EReference getCompilationUnit_Types();

	/**
	 * Returns the meta object for class '{@link Java5.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Expression</em>'.
	 * @see Java5.ConditionalExpression
	 * @generated
	 */
	EClass getConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ConditionalExpression#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see Java5.ConditionalExpression#getElseExpression()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_ElseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ConditionalExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.ConditionalExpression#getExpression()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ConditionalExpression#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see Java5.ConditionalExpression#getThenExpression()
	 * @see #getConditionalExpression()
	 * @generated
	 */
	EReference getConditionalExpression_ThenExpression();

	/**
	 * Returns the meta object for class '{@link Java5.ConstructorInvocation <em>Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Invocation</em>'.
	 * @see Java5.ConstructorInvocation
	 * @generated
	 */
	EClass getConstructorInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.ConstructorInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see Java5.ConstructorInvocation#getArguments()
	 * @see #getConstructorInvocation()
	 * @generated
	 */
	EReference getConstructorInvocation_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ConstructorInvocation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see Java5.ConstructorInvocation#getMethod()
	 * @see #getConstructorInvocation()
	 * @generated
	 */
	EReference getConstructorInvocation_Method();

	/**
	 * Returns the meta object for class '{@link Java5.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Statement</em>'.
	 * @see Java5.ContinueStatement
	 * @generated
	 */
	EClass getContinueStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ContinueStatement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see Java5.ContinueStatement#getLabel()
	 * @see #getContinueStatement()
	 * @generated
	 */
	EReference getContinueStatement_Label();

	/**
	 * Returns the meta object for class '{@link Java5.DoStatement <em>Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Statement</em>'.
	 * @see Java5.DoStatement
	 * @generated
	 */
	EClass getDoStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.DoStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.DoStatement#getExpression()
	 * @see #getDoStatement()
	 * @generated
	 */
	EReference getDoStatement_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.DoStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see Java5.DoStatement#getBody()
	 * @see #getDoStatement()
	 * @generated
	 */
	EReference getDoStatement_Body();

	/**
	 * Returns the meta object for class '{@link Java5.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Statement</em>'.
	 * @see Java5.EmptyStatement
	 * @generated
	 */
	EClass getEmptyStatement();

	/**
	 * Returns the meta object for class '{@link Java5.EnumDeclaration <em>Enum Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Declaration</em>'.
	 * @see Java5.EnumDeclaration
	 * @generated
	 */
	EClass getEnumDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.EnumDeclaration#getEnumConstants <em>Enum Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Constants</em>'.
	 * @see Java5.EnumDeclaration#getEnumConstants()
	 * @see #getEnumDeclaration()
	 * @generated
	 */
	EReference getEnumDeclaration_EnumConstants();

	/**
	 * Returns the meta object for class '{@link Java5.EnumConstantDeclaration <em>Enum Constant Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Constant Declaration</em>'.
	 * @see Java5.EnumConstantDeclaration
	 * @generated
	 */
	EClass getEnumConstantDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.EnumConstantDeclaration#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anonymous Class Declaration</em>'.
	 * @see Java5.EnumConstantDeclaration#getAnonymousClassDeclaration()
	 * @see #getEnumConstantDeclaration()
	 * @generated
	 */
	EReference getEnumConstantDeclaration_AnonymousClassDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.EnumConstantDeclaration#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see Java5.EnumConstantDeclaration#getArguments()
	 * @see #getEnumConstantDeclaration()
	 * @generated
	 */
	EReference getEnumConstantDeclaration_Arguments();

	/**
	 * Returns the meta object for class '{@link Java5.EnhancedForStatement <em>Enhanced For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enhanced For Statement</em>'.
	 * @see Java5.EnhancedForStatement
	 * @generated
	 */
	EClass getEnhancedForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.EnhancedForStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see Java5.EnhancedForStatement#getBody()
	 * @see #getEnhancedForStatement()
	 * @generated
	 */
	EReference getEnhancedForStatement_Body();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.EnhancedForStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.EnhancedForStatement#getExpression()
	 * @see #getEnhancedForStatement()
	 * @generated
	 */
	EReference getEnhancedForStatement_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.EnhancedForStatement#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see Java5.EnhancedForStatement#getParameter()
	 * @see #getEnhancedForStatement()
	 * @generated
	 */
	EReference getEnhancedForStatement_Parameter();

	/**
	 * Returns the meta object for class '{@link Java5.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see Java5.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link Java5.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Statement</em>'.
	 * @see Java5.ExpressionStatement
	 * @generated
	 */
	EClass getExpressionStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ExpressionStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.ExpressionStatement#getExpression()
	 * @see #getExpressionStatement()
	 * @generated
	 */
	EReference getExpressionStatement_Expression();

	/**
	 * Returns the meta object for class '{@link Java5.FieldAccess <em>Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access</em>'.
	 * @see Java5.FieldAccess
	 * @generated
	 */
	EClass getFieldAccess();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.FieldAccess#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field</em>'.
	 * @see Java5.FieldAccess#getField()
	 * @see #getFieldAccess()
	 * @generated
	 */
	EReference getFieldAccess_Field();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.FieldAccess#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.FieldAccess#getExpression()
	 * @see #getFieldAccess()
	 * @generated
	 */
	EReference getFieldAccess_Expression();

	/**
	 * Returns the meta object for class '{@link Java5.FieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Declaration</em>'.
	 * @see Java5.FieldDeclaration
	 * @generated
	 */
	EClass getFieldDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.FieldDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.FieldDeclaration#getType()
	 * @see #getFieldDeclaration()
	 * @generated
	 */
	EReference getFieldDeclaration_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.FieldDeclaration#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see Java5.FieldDeclaration#getFragments()
	 * @see #getFieldDeclaration()
	 * @generated
	 */
	EReference getFieldDeclaration_Fragments();

	/**
	 * Returns the meta object for class '{@link Java5.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see Java5.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ForStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.ForStatement#getExpression()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.ForStatement#getUpdaters <em>Updaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Updaters</em>'.
	 * @see Java5.ForStatement#getUpdaters()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Updaters();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.ForStatement#getInitializers <em>Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initializers</em>'.
	 * @see Java5.ForStatement#getInitializers()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Initializers();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ForStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see Java5.ForStatement#getBody()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Body();

	/**
	 * Returns the meta object for class '{@link Java5.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see Java5.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.IfStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.IfStatement#getExpression()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.IfStatement#getThenStatement <em>Then Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Statement</em>'.
	 * @see Java5.IfStatement#getThenStatement()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ThenStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.IfStatement#getElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Statement</em>'.
	 * @see Java5.IfStatement#getElseStatement()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_ElseStatement();

	/**
	 * Returns the meta object for class '{@link Java5.ImportDeclaration <em>Import Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Declaration</em>'.
	 * @see Java5.ImportDeclaration
	 * @generated
	 */
	EClass getImportDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link Java5.ImportDeclaration#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see Java5.ImportDeclaration#isStatic()
	 * @see #getImportDeclaration()
	 * @generated
	 */
	EAttribute getImportDeclaration_Static();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ImportDeclaration#getImportedElement <em>Imported Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Element</em>'.
	 * @see Java5.ImportDeclaration#getImportedElement()
	 * @see #getImportDeclaration()
	 * @generated
	 */
	EReference getImportDeclaration_ImportedElement();

	/**
	 * Returns the meta object for class '{@link Java5.InfixExpression <em>Infix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infix Expression</em>'.
	 * @see Java5.InfixExpression
	 * @generated
	 */
	EClass getInfixExpression();

	/**
	 * Returns the meta object for the attribute '{@link Java5.InfixExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see Java5.InfixExpression#getOperator()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EAttribute getInfixExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.InfixExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see Java5.InfixExpression#getRightOperand()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_RightOperand();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.InfixExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see Java5.InfixExpression#getLeftOperand()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.InfixExpression#getExtendedOperands <em>Extended Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Operands</em>'.
	 * @see Java5.InfixExpression#getExtendedOperands()
	 * @see #getInfixExpression()
	 * @generated
	 */
	EReference getInfixExpression_ExtendedOperands();

	/**
	 * Returns the meta object for class '{@link Java5.Initializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initializer</em>'.
	 * @see Java5.Initializer
	 * @generated
	 */
	EClass getInitializer();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.Initializer#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see Java5.Initializer#getBody()
	 * @see #getInitializer()
	 * @generated
	 */
	EReference getInitializer_Body();

	/**
	 * Returns the meta object for class '{@link Java5.InstanceofExpression <em>Instanceof Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instanceof Expression</em>'.
	 * @see Java5.InstanceofExpression
	 * @generated
	 */
	EClass getInstanceofExpression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.InstanceofExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see Java5.InstanceofExpression#getRightOperand()
	 * @see #getInstanceofExpression()
	 * @generated
	 */
	EReference getInstanceofExpression_RightOperand();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.InstanceofExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see Java5.InstanceofExpression#getLeftOperand()
	 * @see #getInstanceofExpression()
	 * @generated
	 */
	EReference getInstanceofExpression_LeftOperand();

	/**
	 * Returns the meta object for class '{@link Java5.InterfaceDeclaration <em>Interface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Declaration</em>'.
	 * @see Java5.InterfaceDeclaration
	 * @generated
	 */
	EClass getInterfaceDeclaration();

	/**
	 * Returns the meta object for class '{@link Java5.LabeledStatement <em>Labeled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Statement</em>'.
	 * @see Java5.LabeledStatement
	 * @generated
	 */
	EClass getLabeledStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.LabeledStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see Java5.LabeledStatement#getBody()
	 * @see #getLabeledStatement()
	 * @generated
	 */
	EReference getLabeledStatement_Body();

	/**
	 * Returns the meta object for class '{@link Java5.MemberRef <em>Member Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Ref</em>'.
	 * @see Java5.MemberRef
	 * @generated
	 */
	EClass getMemberRef();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.MemberRef#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member</em>'.
	 * @see Java5.MemberRef#getMember()
	 * @see #getMemberRef()
	 * @generated
	 */
	EReference getMemberRef_Member();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.MemberRef#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see Java5.MemberRef#getQualifier()
	 * @see #getMemberRef()
	 * @generated
	 */
	EReference getMemberRef_Qualifier();

	/**
	 * Returns the meta object for class '{@link Java5.MethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Declaration</em>'.
	 * @see Java5.MethodDeclaration
	 * @generated
	 */
	EClass getMethodDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link Java5.MethodDeclaration#getExtraArrayDimensions <em>Extra Array Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Array Dimensions</em>'.
	 * @see Java5.MethodDeclaration#getExtraArrayDimensions()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EAttribute getMethodDeclaration_ExtraArrayDimensions();

	/**
	 * Returns the meta object for the attribute '{@link Java5.MethodDeclaration#isConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constructor</em>'.
	 * @see Java5.MethodDeclaration#isConstructor()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EAttribute getMethodDeclaration_Constructor();

	/**
	 * Returns the meta object for the attribute '{@link Java5.MethodDeclaration#isVarargs <em>Varargs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varargs</em>'.
	 * @see Java5.MethodDeclaration#isVarargs()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EAttribute getMethodDeclaration_Varargs();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.MethodDeclaration#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see Java5.MethodDeclaration#getBody()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.MethodDeclaration#getThrownExceptions <em>Thrown Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thrown Exceptions</em>'.
	 * @see Java5.MethodDeclaration#getThrownExceptions()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_ThrownExceptions();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.MethodDeclaration#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see Java5.MethodDeclaration#getReturnType()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.MethodDeclaration#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see Java5.MethodDeclaration#getTypeParameters()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_TypeParameters();

	/**
	 * Returns the meta object for the reference '{@link Java5.MethodDeclaration#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Redefined Method Declaration</em>'.
	 * @see Java5.MethodDeclaration#getRedefinedMethodDeclaration()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_RedefinedMethodDeclaration();

	/**
	 * Returns the meta object for the reference list '{@link Java5.MethodDeclaration#getRedefinitions <em>Redefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefinitions</em>'.
	 * @see Java5.MethodDeclaration#getRedefinitions()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_Redefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.MethodDeclaration#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see Java5.MethodDeclaration#getParameters()
	 * @see #getMethodDeclaration()
	 * @generated
	 */
	EReference getMethodDeclaration_Parameters();

	/**
	 * Returns the meta object for class '{@link Java5.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Invocation</em>'.
	 * @see Java5.MethodInvocation
	 * @generated
	 */
	EClass getMethodInvocation();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.MethodInvocation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see Java5.MethodInvocation#getMethod()
	 * @see #getMethodInvocation()
	 * @generated
	 */
	EReference getMethodInvocation_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.MethodInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see Java5.MethodInvocation#getArguments()
	 * @see #getMethodInvocation()
	 * @generated
	 */
	EReference getMethodInvocation_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.MethodInvocation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.MethodInvocation#getExpression()
	 * @see #getMethodInvocation()
	 * @generated
	 */
	EReference getMethodInvocation_Expression();

	/**
	 * Returns the meta object for class '{@link Java5.MethodRef <em>Method Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Ref</em>'.
	 * @see Java5.MethodRef
	 * @generated
	 */
	EClass getMethodRef();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.MethodRef#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see Java5.MethodRef#getMethod()
	 * @see #getMethodRef()
	 * @generated
	 */
	EReference getMethodRef_Method();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.MethodRef#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see Java5.MethodRef#getQualifier()
	 * @see #getMethodRef()
	 * @generated
	 */
	EReference getMethodRef_Qualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.MethodRef#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see Java5.MethodRef#getParameters()
	 * @see #getMethodRef()
	 * @generated
	 */
	EReference getMethodRef_Parameters();

	/**
	 * Returns the meta object for class '{@link Java5.MethodRefParameter <em>Method Ref Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Ref Parameter</em>'.
	 * @see Java5.MethodRefParameter
	 * @generated
	 */
	EClass getMethodRefParameter();

	/**
	 * Returns the meta object for the attribute '{@link Java5.MethodRefParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Java5.MethodRefParameter#getName()
	 * @see #getMethodRefParameter()
	 * @generated
	 */
	EAttribute getMethodRefParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link Java5.MethodRefParameter#getIsVarargs <em>Is Varargs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Varargs</em>'.
	 * @see Java5.MethodRefParameter#getIsVarargs()
	 * @see #getMethodRefParameter()
	 * @generated
	 */
	EAttribute getMethodRefParameter_IsVarargs();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.MethodRefParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.MethodRefParameter#getType()
	 * @see #getMethodRefParameter()
	 * @generated
	 */
	EReference getMethodRefParameter_Type();

	/**
	 * Returns the meta object for class '{@link Java5.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see Java5.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link Java5.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Java5.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.Model#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Elements</em>'.
	 * @see Java5.Model#getOwnedElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OwnedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.Model#getOrphanTypes <em>Orphan Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orphan Types</em>'.
	 * @see Java5.Model#getOrphanTypes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OrphanTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.Model#getUnresolvedItems <em>Unresolved Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unresolved Items</em>'.
	 * @see Java5.Model#getUnresolvedItems()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_UnresolvedItems();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.Model#getCompilationUnits <em>Compilation Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compilation Units</em>'.
	 * @see Java5.Model#getCompilationUnits()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_CompilationUnits();

	/**
	 * Returns the meta object for class '{@link Java5.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see Java5.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for the attribute '{@link Java5.Modifier#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see Java5.Modifier#getVisibility()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link Java5.Modifier#getInheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inheritance</em>'.
	 * @see Java5.Modifier#getInheritance()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Inheritance();

	/**
	 * Returns the meta object for the attribute '{@link Java5.Modifier#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see Java5.Modifier#isStatic()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Static();

	/**
	 * Returns the meta object for the attribute '{@link Java5.Modifier#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see Java5.Modifier#isTransient()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Transient();

	/**
	 * Returns the meta object for the attribute '{@link Java5.Modifier#isVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see Java5.Modifier#isVolatile()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Volatile();

	/**
	 * Returns the meta object for the attribute '{@link Java5.Modifier#isNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see Java5.Modifier#isNative()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Native();

	/**
	 * Returns the meta object for the attribute '{@link Java5.Modifier#isStrictfp <em>Strictfp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strictfp</em>'.
	 * @see Java5.Modifier#isStrictfp()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Strictfp();

	/**
	 * Returns the meta object for the attribute '{@link Java5.Modifier#isSynchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronized</em>'.
	 * @see Java5.Modifier#isSynchronized()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Synchronized();

	/**
	 * Returns the meta object for the container reference '{@link Java5.Modifier#getBodyDeclaration <em>Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Body Declaration</em>'.
	 * @see Java5.Modifier#getBodyDeclaration()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_BodyDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link Java5.Modifier#getSingleVariableDeclaration <em>Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Single Variable Declaration</em>'.
	 * @see Java5.Modifier#getSingleVariableDeclaration()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_SingleVariableDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link Java5.Modifier#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Declaration Statement</em>'.
	 * @see Java5.Modifier#getVariableDeclarationStatement()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_VariableDeclarationStatement();

	/**
	 * Returns the meta object for the container reference '{@link Java5.Modifier#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Declaration Expression</em>'.
	 * @see Java5.Modifier#getVariableDeclarationExpression()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_VariableDeclarationExpression();

	/**
	 * Returns the meta object for class '{@link Java5.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see Java5.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Java5.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Java5.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link Java5.NamedElement#isProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see Java5.NamedElement#isProxy()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Proxy();

	/**
	 * Returns the meta object for class '{@link Java5.NamedElementRef <em>Named Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element Ref</em>'.
	 * @see Java5.NamedElementRef
	 * @generated
	 */
	EClass getNamedElementRef();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.NamedElementRef#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see Java5.NamedElementRef#getQualifier()
	 * @see #getNamedElementRef()
	 * @generated
	 */
	EReference getNamedElementRef_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link Java5.NamedElementRef#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see Java5.NamedElementRef#getElement()
	 * @see #getNamedElementRef()
	 * @generated
	 */
	EReference getNamedElementRef_Element();

	/**
	 * Returns the meta object for class '{@link Java5.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see Java5.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for class '{@link Java5.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal</em>'.
	 * @see Java5.NumberLiteral
	 * @generated
	 */
	EClass getNumberLiteral();

	/**
	 * Returns the meta object for the attribute '{@link Java5.NumberLiteral#getTokenValue <em>Token Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token Value</em>'.
	 * @see Java5.NumberLiteral#getTokenValue()
	 * @see #getNumberLiteral()
	 * @generated
	 */
	EAttribute getNumberLiteral_TokenValue();

	/**
	 * Returns the meta object for class '{@link Java5.OrphanType <em>Orphan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orphan Type</em>'.
	 * @see Java5.OrphanType
	 * @generated
	 */
	EClass getOrphanType();

	/**
	 * Returns the meta object for class '{@link Java5.PackageDeclaration <em>Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Declaration</em>'.
	 * @see Java5.PackageDeclaration
	 * @generated
	 */
	EClass getPackageDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link Java5.PackageDeclaration#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see Java5.PackageDeclaration#getQualifiedName()
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	EAttribute getPackageDeclaration_QualifiedName();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.PackageDeclaration#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Elements</em>'.
	 * @see Java5.PackageDeclaration#getOwnedElements()
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	EReference getPackageDeclaration_OwnedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.PackageDeclaration#getOwnedPackages <em>Owned Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Packages</em>'.
	 * @see Java5.PackageDeclaration#getOwnedPackages()
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	EReference getPackageDeclaration_OwnedPackages();

	/**
	 * Returns the meta object for class '{@link Java5.ParameterizedType <em>Parameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Type</em>'.
	 * @see Java5.ParameterizedType
	 * @generated
	 */
	EClass getParameterizedType();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ParameterizedType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.ParameterizedType#getType()
	 * @see #getParameterizedType()
	 * @generated
	 */
	EReference getParameterizedType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.ParameterizedType#getTypeArguments <em>Type Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Arguments</em>'.
	 * @see Java5.ParameterizedType#getTypeArguments()
	 * @see #getParameterizedType()
	 * @generated
	 */
	EReference getParameterizedType_TypeArguments();

	/**
	 * Returns the meta object for class '{@link Java5.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesized Expression</em>'.
	 * @see Java5.ParenthesizedExpression
	 * @generated
	 */
	EClass getParenthesizedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ParenthesizedExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.ParenthesizedExpression#getExpression()
	 * @see #getParenthesizedExpression()
	 * @generated
	 */
	EReference getParenthesizedExpression_Expression();

	/**
	 * Returns the meta object for class '{@link Java5.PostfixExpression <em>Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postfix Expression</em>'.
	 * @see Java5.PostfixExpression
	 * @generated
	 */
	EClass getPostfixExpression();

	/**
	 * Returns the meta object for the attribute '{@link Java5.PostfixExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see Java5.PostfixExpression#getOperator()
	 * @see #getPostfixExpression()
	 * @generated
	 */
	EAttribute getPostfixExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.PostfixExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see Java5.PostfixExpression#getOperand()
	 * @see #getPostfixExpression()
	 * @generated
	 */
	EReference getPostfixExpression_Operand();

	/**
	 * Returns the meta object for class '{@link Java5.PrefixExpression <em>Prefix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix Expression</em>'.
	 * @see Java5.PrefixExpression
	 * @generated
	 */
	EClass getPrefixExpression();

	/**
	 * Returns the meta object for the attribute '{@link Java5.PrefixExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see Java5.PrefixExpression#getOperator()
	 * @see #getPrefixExpression()
	 * @generated
	 */
	EAttribute getPrefixExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.PrefixExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see Java5.PrefixExpression#getOperand()
	 * @see #getPrefixExpression()
	 * @generated
	 */
	EReference getPrefixExpression_Operand();

	/**
	 * Returns the meta object for class '{@link Java5.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see Java5.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link Java5.PrimitiveTypeBoolean <em>Primitive Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Boolean</em>'.
	 * @see Java5.PrimitiveTypeBoolean
	 * @generated
	 */
	EClass getPrimitiveTypeBoolean();

	/**
	 * Returns the meta object for class '{@link Java5.PrimitiveTypeByte <em>Primitive Type Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Byte</em>'.
	 * @see Java5.PrimitiveTypeByte
	 * @generated
	 */
	EClass getPrimitiveTypeByte();

	/**
	 * Returns the meta object for class '{@link Java5.PrimitiveTypeChar <em>Primitive Type Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Char</em>'.
	 * @see Java5.PrimitiveTypeChar
	 * @generated
	 */
	EClass getPrimitiveTypeChar();

	/**
	 * Returns the meta object for class '{@link Java5.PrimitiveTypeDouble <em>Primitive Type Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Double</em>'.
	 * @see Java5.PrimitiveTypeDouble
	 * @generated
	 */
	EClass getPrimitiveTypeDouble();

	/**
	 * Returns the meta object for class '{@link Java5.PrimitiveTypeShort <em>Primitive Type Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Short</em>'.
	 * @see Java5.PrimitiveTypeShort
	 * @generated
	 */
	EClass getPrimitiveTypeShort();

	/**
	 * Returns the meta object for class '{@link Java5.PrimitiveTypeFloat <em>Primitive Type Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Float</em>'.
	 * @see Java5.PrimitiveTypeFloat
	 * @generated
	 */
	EClass getPrimitiveTypeFloat();

	/**
	 * Returns the meta object for class '{@link Java5.PrimitiveTypeInt <em>Primitive Type Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Int</em>'.
	 * @see Java5.PrimitiveTypeInt
	 * @generated
	 */
	EClass getPrimitiveTypeInt();

	/**
	 * Returns the meta object for class '{@link Java5.PrimitiveTypeLong <em>Primitive Type Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Long</em>'.
	 * @see Java5.PrimitiveTypeLong
	 * @generated
	 */
	EClass getPrimitiveTypeLong();

	/**
	 * Returns the meta object for class '{@link Java5.PrimitiveTypeVoid <em>Primitive Type Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Void</em>'.
	 * @see Java5.PrimitiveTypeVoid
	 * @generated
	 */
	EClass getPrimitiveTypeVoid();

	/**
	 * Returns the meta object for class '{@link Java5.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see Java5.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ReturnStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.ReturnStatement#getExpression()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_Expression();

	/**
	 * Returns the meta object for class '{@link Java5.SingleVariableDeclaration <em>Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Variable Declaration</em>'.
	 * @see Java5.SingleVariableDeclaration
	 * @generated
	 */
	EClass getSingleVariableDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.SingleVariableDeclaration#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see Java5.SingleVariableDeclaration#getModifiers()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_Modifiers();

	/**
	 * Returns the meta object for the attribute '{@link Java5.SingleVariableDeclaration#isVarargs <em>Varargs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varargs</em>'.
	 * @see Java5.SingleVariableDeclaration#isVarargs()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EAttribute getSingleVariableDeclaration_Varargs();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SingleVariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.SingleVariableDeclaration#getType()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_Type();

	/**
	 * Returns the meta object for the container reference '{@link Java5.SingleVariableDeclaration#getMethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method Declaration</em>'.
	 * @see Java5.SingleVariableDeclaration#getMethodDeclaration()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_MethodDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link Java5.SingleVariableDeclaration#getCatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Catch Clause</em>'.
	 * @see Java5.SingleVariableDeclaration#getCatchClause()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_CatchClause();

	/**
	 * Returns the meta object for the container reference '{@link Java5.SingleVariableDeclaration#getEnhancedForStatement <em>Enhanced For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enhanced For Statement</em>'.
	 * @see Java5.SingleVariableDeclaration#getEnhancedForStatement()
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 */
	EReference getSingleVariableDeclaration_EnhancedForStatement();

	/**
	 * Returns the meta object for class '{@link Java5.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see Java5.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link Java5.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see Java5.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link Java5.StringLiteral#getEscapedValue <em>Escaped Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escaped Value</em>'.
	 * @see Java5.StringLiteral#getEscapedValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_EscapedValue();

	/**
	 * Returns the meta object for the attribute '{@link Java5.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Java5.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link Java5.SuperConstructorInvocation <em>Super Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Constructor Invocation</em>'.
	 * @see Java5.SuperConstructorInvocation
	 * @generated
	 */
	EClass getSuperConstructorInvocation();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SuperConstructorInvocation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.SuperConstructorInvocation#getExpression()
	 * @see #getSuperConstructorInvocation()
	 * @generated
	 */
	EReference getSuperConstructorInvocation_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.SuperConstructorInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see Java5.SuperConstructorInvocation#getArguments()
	 * @see #getSuperConstructorInvocation()
	 * @generated
	 */
	EReference getSuperConstructorInvocation_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SuperConstructorInvocation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see Java5.SuperConstructorInvocation#getMethod()
	 * @see #getSuperConstructorInvocation()
	 * @generated
	 */
	EReference getSuperConstructorInvocation_Method();

	/**
	 * Returns the meta object for class '{@link Java5.SuperFieldAccess <em>Super Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Field Access</em>'.
	 * @see Java5.SuperFieldAccess
	 * @generated
	 */
	EClass getSuperFieldAccess();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SuperFieldAccess#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Field</em>'.
	 * @see Java5.SuperFieldAccess#getField()
	 * @see #getSuperFieldAccess()
	 * @generated
	 */
	EReference getSuperFieldAccess_Field();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SuperFieldAccess#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see Java5.SuperFieldAccess#getQualifier()
	 * @see #getSuperFieldAccess()
	 * @generated
	 */
	EReference getSuperFieldAccess_Qualifier();

	/**
	 * Returns the meta object for class '{@link Java5.SuperMethodInvocation <em>Super Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Method Invocation</em>'.
	 * @see Java5.SuperMethodInvocation
	 * @generated
	 */
	EClass getSuperMethodInvocation();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.SuperMethodInvocation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see Java5.SuperMethodInvocation#getArguments()
	 * @see #getSuperMethodInvocation()
	 * @generated
	 */
	EReference getSuperMethodInvocation_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SuperMethodInvocation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see Java5.SuperMethodInvocation#getMethod()
	 * @see #getSuperMethodInvocation()
	 * @generated
	 */
	EReference getSuperMethodInvocation_Method();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SuperMethodInvocation#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see Java5.SuperMethodInvocation#getQualifier()
	 * @see #getSuperMethodInvocation()
	 * @generated
	 */
	EReference getSuperMethodInvocation_Qualifier();

	/**
	 * Returns the meta object for class '{@link Java5.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case</em>'.
	 * @see Java5.SwitchCase
	 * @generated
	 */
	EClass getSwitchCase();

	/**
	 * Returns the meta object for the attribute '{@link Java5.SwitchCase#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see Java5.SwitchCase#isDefault()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EAttribute getSwitchCase_Default();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SwitchCase#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.SwitchCase#getExpression()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EReference getSwitchCase_Expression();

	/**
	 * Returns the meta object for class '{@link Java5.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Statement</em>'.
	 * @see Java5.SwitchStatement
	 * @generated
	 */
	EClass getSwitchStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SwitchStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.SwitchStatement#getExpression()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.SwitchStatement#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see Java5.SwitchStatement#getStatements()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Statements();

	/**
	 * Returns the meta object for class '{@link Java5.SynchronizedStatement <em>Synchronized Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronized Statement</em>'.
	 * @see Java5.SynchronizedStatement
	 * @generated
	 */
	EClass getSynchronizedStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SynchronizedStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see Java5.SynchronizedStatement#getBody()
	 * @see #getSynchronizedStatement()
	 * @generated
	 */
	EReference getSynchronizedStatement_Body();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.SynchronizedStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.SynchronizedStatement#getExpression()
	 * @see #getSynchronizedStatement()
	 * @generated
	 */
	EReference getSynchronizedStatement_Expression();

	/**
	 * Returns the meta object for class '{@link Java5.TagElement <em>Tag Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Element</em>'.
	 * @see Java5.TagElement
	 * @generated
	 */
	EClass getTagElement();

	/**
	 * Returns the meta object for the attribute '{@link Java5.TagElement#getTagName <em>Tag Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Name</em>'.
	 * @see Java5.TagElement#getTagName()
	 * @see #getTagElement()
	 * @generated
	 */
	EAttribute getTagElement_TagName();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.TagElement#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see Java5.TagElement#getFragments()
	 * @see #getTagElement()
	 * @generated
	 */
	EReference getTagElement_Fragments();

	/**
	 * Returns the meta object for class '{@link Java5.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see Java5.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for the attribute '{@link Java5.TextElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see Java5.TextElement#getText()
	 * @see #getTextElement()
	 * @generated
	 */
	EAttribute getTextElement_Text();

	/**
	 * Returns the meta object for class '{@link Java5.ThisExpression <em>This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This Expression</em>'.
	 * @see Java5.ThisExpression
	 * @generated
	 */
	EClass getThisExpression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ThisExpression#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualifier</em>'.
	 * @see Java5.ThisExpression#getQualifier()
	 * @see #getThisExpression()
	 * @generated
	 */
	EReference getThisExpression_Qualifier();

	/**
	 * Returns the meta object for class '{@link Java5.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Statement</em>'.
	 * @see Java5.ThrowStatement
	 * @generated
	 */
	EClass getThrowStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.ThrowStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.ThrowStatement#getExpression()
	 * @see #getThrowStatement()
	 * @generated
	 */
	EReference getThrowStatement_Expression();

	/**
	 * Returns the meta object for class '{@link Java5.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see Java5.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.TypeDeclaration#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see Java5.TypeDeclaration#getTypeParameters()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_TypeParameters();

	/**
	 * Returns the meta object for class '{@link Java5.TypeDeclarationStatement <em>Type Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration Statement</em>'.
	 * @see Java5.TypeDeclarationStatement
	 * @generated
	 */
	EClass getTypeDeclarationStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.TypeDeclarationStatement#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declaration</em>'.
	 * @see Java5.TypeDeclarationStatement#getDeclaration()
	 * @see #getTypeDeclarationStatement()
	 * @generated
	 */
	EReference getTypeDeclarationStatement_Declaration();

	/**
	 * Returns the meta object for class '{@link Java5.TypeLiteral <em>Type Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Literal</em>'.
	 * @see Java5.TypeLiteral
	 * @generated
	 */
	EClass getTypeLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.TypeLiteral#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.TypeLiteral#getType()
	 * @see #getTypeLiteral()
	 * @generated
	 */
	EReference getTypeLiteral_Type();

	/**
	 * Returns the meta object for class '{@link Java5.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Parameter</em>'.
	 * @see Java5.TypeParameter
	 * @generated
	 */
	EClass getTypeParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.TypeParameter#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounds</em>'.
	 * @see Java5.TypeParameter#getBounds()
	 * @see #getTypeParameter()
	 * @generated
	 */
	EReference getTypeParameter_Bounds();

	/**
	 * Returns the meta object for class '{@link Java5.TryStatement <em>Try Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Statement</em>'.
	 * @see Java5.TryStatement
	 * @generated
	 */
	EClass getTryStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.TryStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see Java5.TryStatement#getBody()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_Body();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.TryStatement#getFinally <em>Finally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finally</em>'.
	 * @see Java5.TryStatement#getFinally()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_Finally();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.TryStatement#getCatchClauses <em>Catch Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch Clauses</em>'.
	 * @see Java5.TryStatement#getCatchClauses()
	 * @see #getTryStatement()
	 * @generated
	 */
	EReference getTryStatement_CatchClauses();

	/**
	 * Returns the meta object for class '{@link Java5.UnresolvedItem <em>Unresolved Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unresolved Item</em>'.
	 * @see Java5.UnresolvedItem
	 * @generated
	 */
	EClass getUnresolvedItem();

	/**
	 * Returns the meta object for class '{@link Java5.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see Java5.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link Java5.VariableDeclaration#getExtraArrayDimensions <em>Extra Array Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Array Dimensions</em>'.
	 * @see Java5.VariableDeclaration#getExtraArrayDimensions()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_ExtraArrayDimensions();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.VariableDeclaration#getInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initializer</em>'.
	 * @see Java5.VariableDeclaration#getInitializer()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Initializer();

	/**
	 * Returns the meta object for class '{@link Java5.VariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Expression</em>'.
	 * @see Java5.VariableDeclarationExpression
	 * @generated
	 */
	EClass getVariableDeclarationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.VariableDeclarationExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.VariableDeclarationExpression#getType()
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	EReference getVariableDeclarationExpression_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.VariableDeclarationExpression#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see Java5.VariableDeclarationExpression#getFragments()
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	EReference getVariableDeclarationExpression_Fragments();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.VariableDeclarationExpression#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see Java5.VariableDeclarationExpression#getModifiers()
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 */
	EReference getVariableDeclarationExpression_Modifiers();

	/**
	 * Returns the meta object for class '{@link Java5.VariableDeclarationFragment <em>Variable Declaration Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Fragment</em>'.
	 * @see Java5.VariableDeclarationFragment
	 * @generated
	 */
	EClass getVariableDeclarationFragment();

	/**
	 * Returns the meta object for the container reference '{@link Java5.VariableDeclarationFragment#getFieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Field Declaration</em>'.
	 * @see Java5.VariableDeclarationFragment#getFieldDeclaration()
	 * @see #getVariableDeclarationFragment()
	 * @generated
	 */
	EReference getVariableDeclarationFragment_FieldDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link Java5.VariableDeclarationFragment#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Declaration Statement</em>'.
	 * @see Java5.VariableDeclarationFragment#getVariableDeclarationStatement()
	 * @see #getVariableDeclarationFragment()
	 * @generated
	 */
	EReference getVariableDeclarationFragment_VariableDeclarationStatement();

	/**
	 * Returns the meta object for the container reference '{@link Java5.VariableDeclarationFragment#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Declaration Expression</em>'.
	 * @see Java5.VariableDeclarationFragment#getVariableDeclarationExpression()
	 * @see #getVariableDeclarationFragment()
	 * @generated
	 */
	EReference getVariableDeclarationFragment_VariableDeclarationExpression();

	/**
	 * Returns the meta object for class '{@link Java5.VariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration Statement</em>'.
	 * @see Java5.VariableDeclarationStatement
	 * @generated
	 */
	EClass getVariableDeclarationStatement();

	/**
	 * Returns the meta object for the attribute '{@link Java5.VariableDeclarationStatement#getExtraArrayDimensions <em>Extra Array Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Array Dimensions</em>'.
	 * @see Java5.VariableDeclarationStatement#getExtraArrayDimensions()
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 */
	EAttribute getVariableDeclarationStatement_ExtraArrayDimensions();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.VariableDeclarationStatement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see Java5.VariableDeclarationStatement#getType()
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 */
	EReference getVariableDeclarationStatement_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.VariableDeclarationStatement#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see Java5.VariableDeclarationStatement#getFragments()
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 */
	EReference getVariableDeclarationStatement_Fragments();

	/**
	 * Returns the meta object for the containment reference list '{@link Java5.VariableDeclarationStatement#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see Java5.VariableDeclarationStatement#getModifiers()
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 */
	EReference getVariableDeclarationStatement_Modifiers();

	/**
	 * Returns the meta object for class '{@link Java5.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see Java5.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.WhileStatement#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see Java5.WhileStatement#getExpression()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.WhileStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see Java5.WhileStatement#getBody()
	 * @see #getWhileStatement()
	 * @generated
	 */
	EReference getWhileStatement_Body();

	/**
	 * Returns the meta object for class '{@link Java5.WildCardType <em>Wild Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wild Card Type</em>'.
	 * @see Java5.WildCardType
	 * @generated
	 */
	EClass getWildCardType();

	/**
	 * Returns the meta object for the attribute '{@link Java5.WildCardType#getIsUpperBound <em>Is Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Upper Bound</em>'.
	 * @see Java5.WildCardType#getIsUpperBound()
	 * @see #getWildCardType()
	 * @generated
	 */
	EAttribute getWildCardType_IsUpperBound();

	/**
	 * Returns the meta object for the containment reference '{@link Java5.WildCardType#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bound</em>'.
	 * @see Java5.WildCardType#getBound()
	 * @see #getWildCardType()
	 * @generated
	 */
	EReference getWildCardType_Bound();

	/**
	 * Returns the meta object for enum '{@link Java5.InheritanceKind <em>Inheritance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inheritance Kind</em>'.
	 * @see Java5.InheritanceKind
	 * @generated
	 */
	EEnum getInheritanceKind();

	/**
	 * Returns the meta object for enum '{@link Java5.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see Java5.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Java5Factory getJava5Factory();

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
		 * The meta object literal for the '{@link Java5.impl.AbstractTypeDeclarationImpl <em>Abstract Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.AbstractTypeDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getAbstractTypeDeclaration()
		 * @generated
		 */
		EClass ABSTRACT_TYPE_DECLARATION = eINSTANCE.getAbstractTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME = eINSTANCE.getAbstractTypeDeclaration_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Body Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS = eINSTANCE.getAbstractTypeDeclaration_BodyDeclarations();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_DECLARATION__IMPORTS = eINSTANCE.getAbstractTypeDeclaration_Imports();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_DECLARATION__PACKAGE = eINSTANCE.getAbstractTypeDeclaration_Package();

		/**
		 * The meta object literal for the '<em><b>Super Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES = eINSTANCE.getAbstractTypeDeclaration_SuperInterfaces();

		/**
		 * The meta object literal for the '{@link Java5.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.AnnotationImpl
		 * @see Java5.impl.Java5PackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__TYPE = eINSTANCE.getAnnotation_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__VALUES = eINSTANCE.getAnnotation_Values();

		/**
		 * The meta object literal for the '{@link Java5.impl.AnnotationMemberValuePairImpl <em>Annotation Member Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.AnnotationMemberValuePairImpl
		 * @see Java5.impl.Java5PackageImpl#getAnnotationMemberValuePair()
		 * @generated
		 */
		EClass ANNOTATION_MEMBER_VALUE_PAIR = eINSTANCE.getAnnotationMemberValuePair();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MEMBER_VALUE_PAIR__MEMBER = eINSTANCE.getAnnotationMemberValuePair_Member();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MEMBER_VALUE_PAIR__VALUE = eINSTANCE.getAnnotationMemberValuePair_Value();

		/**
		 * The meta object literal for the '{@link Java5.impl.AnnotationTypeDeclarationImpl <em>Annotation Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.AnnotationTypeDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getAnnotationTypeDeclaration()
		 * @generated
		 */
		EClass ANNOTATION_TYPE_DECLARATION = eINSTANCE.getAnnotationTypeDeclaration();

		/**
		 * The meta object literal for the '{@link Java5.impl.AnnotationTypeMemberDeclarationImpl <em>Annotation Type Member Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.AnnotationTypeMemberDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getAnnotationTypeMemberDeclaration()
		 * @generated
		 */
		EClass ANNOTATION_TYPE_MEMBER_DECLARATION = eINSTANCE.getAnnotationTypeMemberDeclaration();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT = eINSTANCE.getAnnotationTypeMemberDeclaration_Default();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE = eINSTANCE.getAnnotationTypeMemberDeclaration_Type();

		/**
		 * The meta object literal for the '{@link Java5.impl.AnonymousClassDeclarationImpl <em>Anonymous Class Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.AnonymousClassDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getAnonymousClassDeclaration()
		 * @generated
		 */
		EClass ANONYMOUS_CLASS_DECLARATION = eINSTANCE.getAnonymousClassDeclaration();

		/**
		 * The meta object literal for the '<em><b>Body Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS = eINSTANCE.getAnonymousClassDeclaration_BodyDeclarations();

		/**
		 * The meta object literal for the '<em><b>Class Instance Creation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION = eINSTANCE.getAnonymousClassDeclaration_ClassInstanceCreation();

		/**
		 * The meta object literal for the '{@link Java5.impl.ArrayAccessImpl <em>Array Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ArrayAccessImpl
		 * @see Java5.impl.Java5PackageImpl#getArrayAccess()
		 * @generated
		 */
		EClass ARRAY_ACCESS = eINSTANCE.getArrayAccess();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ACCESS__ARRAY = eINSTANCE.getArrayAccess_Array();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_ACCESS__INDEX = eINSTANCE.getArrayAccess_Index();

		/**
		 * The meta object literal for the '{@link Java5.impl.ArrayCreationImpl <em>Array Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ArrayCreationImpl
		 * @see Java5.impl.Java5PackageImpl#getArrayCreation()
		 * @generated
		 */
		EClass ARRAY_CREATION = eINSTANCE.getArrayCreation();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CREATION__DIMENSIONS = eINSTANCE.getArrayCreation_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CREATION__INITIALIZER = eINSTANCE.getArrayCreation_Initializer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_CREATION__TYPE = eINSTANCE.getArrayCreation_Type();

		/**
		 * The meta object literal for the '{@link Java5.impl.ArrayInitializerImpl <em>Array Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ArrayInitializerImpl
		 * @see Java5.impl.Java5PackageImpl#getArrayInitializer()
		 * @generated
		 */
		EClass ARRAY_INITIALIZER = eINSTANCE.getArrayInitializer();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_INITIALIZER__EXPRESSIONS = eINSTANCE.getArrayInitializer_Expressions();

		/**
		 * The meta object literal for the '{@link Java5.impl.ArrayLengthAccessImpl <em>Array Length Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ArrayLengthAccessImpl
		 * @see Java5.impl.Java5PackageImpl#getArrayLengthAccess()
		 * @generated
		 */
		EClass ARRAY_LENGTH_ACCESS = eINSTANCE.getArrayLengthAccess();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_LENGTH_ACCESS__ARRAY = eINSTANCE.getArrayLengthAccess_Array();

		/**
		 * The meta object literal for the '{@link Java5.impl.ArrayTypeImpl <em>Array Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ArrayTypeImpl
		 * @see Java5.impl.Java5PackageImpl#getArrayType()
		 * @generated
		 */
		EClass ARRAY_TYPE = eINSTANCE.getArrayType();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__DIMENSIONS = eINSTANCE.getArrayType_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Original Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRAY_TYPE__ORIGINAL_NAME = eINSTANCE.getArrayType_OriginalName();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_TYPE__ELEMENT_TYPE = eINSTANCE.getArrayType_ElementType();

		/**
		 * The meta object literal for the '{@link Java5.impl.AssertStatementImpl <em>Assert Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.AssertStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getAssertStatement()
		 * @generated
		 */
		EClass ASSERT_STATEMENT = eINSTANCE.getAssertStatement();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_STATEMENT__MESSAGE = eINSTANCE.getAssertStatement_Message();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_STATEMENT__EXPRESSION = eINSTANCE.getAssertStatement_Expression();

		/**
		 * The meta object literal for the '{@link Java5.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.AssignmentImpl
		 * @see Java5.impl.Java5PackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Left Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__LEFT_HAND_SIDE = eINSTANCE.getAssignment_LeftHandSide();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__OPERATOR = eINSTANCE.getAssignment_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Hand Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__RIGHT_HAND_SIDE = eINSTANCE.getAssignment_RightHandSide();

		/**
		 * The meta object literal for the '{@link Java5.impl.ASTNodeImpl <em>AST Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ASTNodeImpl
		 * @see Java5.impl.Java5PackageImpl#getASTNode()
		 * @generated
		 */
		EClass AST_NODE = eINSTANCE.getASTNode();

		/**
		 * The meta object literal for the '{@link Java5.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.BlockImpl
		 * @see Java5.impl.Java5PackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '{@link Java5.impl.BodyDeclarationImpl <em>Body Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.BodyDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getBodyDeclaration()
		 * @generated
		 */
		EClass BODY_DECLARATION = eINSTANCE.getBodyDeclaration();

		/**
		 * The meta object literal for the '<em><b>Abstract Type Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION = eINSTANCE.getBodyDeclaration_AbstractTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_DECLARATION__ANNOTATIONS = eINSTANCE.getBodyDeclaration_Annotations();

		/**
		 * The meta object literal for the '<em><b>Anonymous Class Declaration Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER = eINSTANCE.getBodyDeclaration_AnonymousClassDeclarationOwner();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY_DECLARATION__MODIFIERS = eINSTANCE.getBodyDeclaration_Modifiers();

		/**
		 * The meta object literal for the '{@link Java5.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.BooleanLiteralImpl
		 * @see Java5.impl.Java5PackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link Java5.impl.BreakStatementImpl <em>Break Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.BreakStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getBreakStatement()
		 * @generated
		 */
		EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BREAK_STATEMENT__LABEL = eINSTANCE.getBreakStatement_Label();

		/**
		 * The meta object literal for the '{@link Java5.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.CastExpressionImpl
		 * @see Java5.impl.Java5PackageImpl#getCastExpression()
		 * @generated
		 */
		EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_EXPRESSION__EXPRESSION = eINSTANCE.getCastExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_EXPRESSION__TYPE = eINSTANCE.getCastExpression_Type();

		/**
		 * The meta object literal for the '{@link Java5.impl.CatchClauseImpl <em>Catch Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.CatchClauseImpl
		 * @see Java5.impl.Java5PackageImpl#getCatchClause()
		 * @generated
		 */
		EClass CATCH_CLAUSE = eINSTANCE.getCatchClause();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_CLAUSE__EXCEPTION = eINSTANCE.getCatchClause_Exception();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_CLAUSE__BODY = eINSTANCE.getCatchClause_Body();

		/**
		 * The meta object literal for the '{@link Java5.impl.CharacterLiteralImpl <em>Character Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.CharacterLiteralImpl
		 * @see Java5.impl.Java5PackageImpl#getCharacterLiteral()
		 * @generated
		 */
		EClass CHARACTER_LITERAL = eINSTANCE.getCharacterLiteral();

		/**
		 * The meta object literal for the '<em><b>Escaped Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_LITERAL__ESCAPED_VALUE = eINSTANCE.getCharacterLiteral_EscapedValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_LITERAL__VALUE = eINSTANCE.getCharacterLiteral_Value();

		/**
		 * The meta object literal for the '{@link Java5.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ClassDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getClassDeclaration()
		 * @generated
		 */
		EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_DECLARATION__SUPER_CLASS = eINSTANCE.getClassDeclaration_SuperClass();

		/**
		 * The meta object literal for the '{@link Java5.impl.ClassInstanceCreationImpl <em>Class Instance Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ClassInstanceCreationImpl
		 * @see Java5.impl.Java5PackageImpl#getClassInstanceCreation()
		 * @generated
		 */
		EClass CLASS_INSTANCE_CREATION = eINSTANCE.getClassInstanceCreation();

		/**
		 * The meta object literal for the '<em><b>Anonymous Class Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION = eINSTANCE.getClassInstanceCreation_AnonymousClassDeclaration();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INSTANCE_CREATION__ARGUMENTS = eINSTANCE.getClassInstanceCreation_Arguments();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INSTANCE_CREATION__EXPRESSION = eINSTANCE.getClassInstanceCreation_Expression();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INSTANCE_CREATION__METHOD = eINSTANCE.getClassInstanceCreation_Method();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_INSTANCE_CREATION__TYPE = eINSTANCE.getClassInstanceCreation_Type();

		/**
		 * The meta object literal for the '{@link Java5.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.CompilationUnitImpl
		 * @see Java5.impl.Java5PackageImpl#getCompilationUnit()
		 * @generated
		 */
		EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__IMPORTS = eINSTANCE.getCompilationUnit_Imports();

		/**
		 * The meta object literal for the '<em><b>Original File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_UNIT__ORIGINAL_FILE_PATH = eINSTANCE.getCompilationUnit_OriginalFilePath();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__PACKAGE = eINSTANCE.getCompilationUnit_Package();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPILATION_UNIT__TYPES = eINSTANCE.getCompilationUnit_Types();

		/**
		 * The meta object literal for the '{@link Java5.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ConditionalExpressionImpl
		 * @see Java5.impl.Java5PackageImpl#getConditionalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_EXPRESSION = eINSTANCE.getConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getConditionalExpression_ElseExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__EXPRESSION = eINSTANCE.getConditionalExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EXPRESSION__THEN_EXPRESSION = eINSTANCE.getConditionalExpression_ThenExpression();

		/**
		 * The meta object literal for the '{@link Java5.impl.ConstructorInvocationImpl <em>Constructor Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ConstructorInvocationImpl
		 * @see Java5.impl.Java5PackageImpl#getConstructorInvocation()
		 * @generated
		 */
		EClass CONSTRUCTOR_INVOCATION = eINSTANCE.getConstructorInvocation();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_INVOCATION__ARGUMENTS = eINSTANCE.getConstructorInvocation_Arguments();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_INVOCATION__METHOD = eINSTANCE.getConstructorInvocation_Method();

		/**
		 * The meta object literal for the '{@link Java5.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ContinueStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getContinueStatement()
		 * @generated
		 */
		EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTINUE_STATEMENT__LABEL = eINSTANCE.getContinueStatement_Label();

		/**
		 * The meta object literal for the '{@link Java5.impl.DoStatementImpl <em>Do Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.DoStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getDoStatement()
		 * @generated
		 */
		EClass DO_STATEMENT = eINSTANCE.getDoStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_STATEMENT__EXPRESSION = eINSTANCE.getDoStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_STATEMENT__BODY = eINSTANCE.getDoStatement_Body();

		/**
		 * The meta object literal for the '{@link Java5.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.EmptyStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getEmptyStatement()
		 * @generated
		 */
		EClass EMPTY_STATEMENT = eINSTANCE.getEmptyStatement();

		/**
		 * The meta object literal for the '{@link Java5.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.EnumDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getEnumDeclaration()
		 * @generated
		 */
		EClass ENUM_DECLARATION = eINSTANCE.getEnumDeclaration();

		/**
		 * The meta object literal for the '<em><b>Enum Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_DECLARATION__ENUM_CONSTANTS = eINSTANCE.getEnumDeclaration_EnumConstants();

		/**
		 * The meta object literal for the '{@link Java5.impl.EnumConstantDeclarationImpl <em>Enum Constant Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.EnumConstantDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getEnumConstantDeclaration()
		 * @generated
		 */
		EClass ENUM_CONSTANT_DECLARATION = eINSTANCE.getEnumConstantDeclaration();

		/**
		 * The meta object literal for the '<em><b>Anonymous Class Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION = eINSTANCE.getEnumConstantDeclaration_AnonymousClassDeclaration();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_CONSTANT_DECLARATION__ARGUMENTS = eINSTANCE.getEnumConstantDeclaration_Arguments();

		/**
		 * The meta object literal for the '{@link Java5.impl.EnhancedForStatementImpl <em>Enhanced For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.EnhancedForStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getEnhancedForStatement()
		 * @generated
		 */
		EClass ENHANCED_FOR_STATEMENT = eINSTANCE.getEnhancedForStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENHANCED_FOR_STATEMENT__BODY = eINSTANCE.getEnhancedForStatement_Body();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENHANCED_FOR_STATEMENT__EXPRESSION = eINSTANCE.getEnhancedForStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENHANCED_FOR_STATEMENT__PARAMETER = eINSTANCE.getEnhancedForStatement_Parameter();

		/**
		 * The meta object literal for the '{@link Java5.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ExpressionImpl
		 * @see Java5.impl.Java5PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link Java5.impl.ExpressionStatementImpl <em>Expression Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ExpressionStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getExpressionStatement()
		 * @generated
		 */
		EClass EXPRESSION_STATEMENT = eINSTANCE.getExpressionStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_STATEMENT__EXPRESSION = eINSTANCE.getExpressionStatement_Expression();

		/**
		 * The meta object literal for the '{@link Java5.impl.FieldAccessImpl <em>Field Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.FieldAccessImpl
		 * @see Java5.impl.Java5PackageImpl#getFieldAccess()
		 * @generated
		 */
		EClass FIELD_ACCESS = eINSTANCE.getFieldAccess();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ACCESS__FIELD = eINSTANCE.getFieldAccess_Field();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ACCESS__EXPRESSION = eINSTANCE.getFieldAccess_Expression();

		/**
		 * The meta object literal for the '{@link Java5.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.FieldDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getFieldDeclaration()
		 * @generated
		 */
		EClass FIELD_DECLARATION = eINSTANCE.getFieldDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DECLARATION__TYPE = eINSTANCE.getFieldDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DECLARATION__FRAGMENTS = eINSTANCE.getFieldDeclaration_Fragments();

		/**
		 * The meta object literal for the '{@link Java5.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ForStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__EXPRESSION = eINSTANCE.getForStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Updaters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__UPDATERS = eINSTANCE.getForStatement_Updaters();

		/**
		 * The meta object literal for the '<em><b>Initializers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__INITIALIZERS = eINSTANCE.getForStatement_Initializers();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__BODY = eINSTANCE.getForStatement_Body();

		/**
		 * The meta object literal for the '{@link Java5.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.IfStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__EXPRESSION = eINSTANCE.getIfStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Then Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__THEN_STATEMENT = eINSTANCE.getIfStatement_ThenStatement();

		/**
		 * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__ELSE_STATEMENT = eINSTANCE.getIfStatement_ElseStatement();

		/**
		 * The meta object literal for the '{@link Java5.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ImportDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getImportDeclaration()
		 * @generated
		 */
		EClass IMPORT_DECLARATION = eINSTANCE.getImportDeclaration();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DECLARATION__STATIC = eINSTANCE.getImportDeclaration_Static();

		/**
		 * The meta object literal for the '<em><b>Imported Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_DECLARATION__IMPORTED_ELEMENT = eINSTANCE.getImportDeclaration_ImportedElement();

		/**
		 * The meta object literal for the '{@link Java5.impl.InfixExpressionImpl <em>Infix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.InfixExpressionImpl
		 * @see Java5.impl.Java5PackageImpl#getInfixExpression()
		 * @generated
		 */
		EClass INFIX_EXPRESSION = eINSTANCE.getInfixExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFIX_EXPRESSION__OPERATOR = eINSTANCE.getInfixExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFIX_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getInfixExpression_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFIX_EXPRESSION__LEFT_OPERAND = eINSTANCE.getInfixExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Extended Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFIX_EXPRESSION__EXTENDED_OPERANDS = eINSTANCE.getInfixExpression_ExtendedOperands();

		/**
		 * The meta object literal for the '{@link Java5.impl.InitializerImpl <em>Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.InitializerImpl
		 * @see Java5.impl.Java5PackageImpl#getInitializer()
		 * @generated
		 */
		EClass INITIALIZER = eINSTANCE.getInitializer();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIALIZER__BODY = eINSTANCE.getInitializer_Body();

		/**
		 * The meta object literal for the '{@link Java5.impl.InstanceofExpressionImpl <em>Instanceof Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.InstanceofExpressionImpl
		 * @see Java5.impl.Java5PackageImpl#getInstanceofExpression()
		 * @generated
		 */
		EClass INSTANCEOF_EXPRESSION = eINSTANCE.getInstanceofExpression();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCEOF_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getInstanceofExpression_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCEOF_EXPRESSION__LEFT_OPERAND = eINSTANCE.getInstanceofExpression_LeftOperand();

		/**
		 * The meta object literal for the '{@link Java5.impl.InterfaceDeclarationImpl <em>Interface Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.InterfaceDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getInterfaceDeclaration()
		 * @generated
		 */
		EClass INTERFACE_DECLARATION = eINSTANCE.getInterfaceDeclaration();

		/**
		 * The meta object literal for the '{@link Java5.impl.LabeledStatementImpl <em>Labeled Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.LabeledStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getLabeledStatement()
		 * @generated
		 */
		EClass LABELED_STATEMENT = eINSTANCE.getLabeledStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABELED_STATEMENT__BODY = eINSTANCE.getLabeledStatement_Body();

		/**
		 * The meta object literal for the '{@link Java5.impl.MemberRefImpl <em>Member Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.MemberRefImpl
		 * @see Java5.impl.Java5PackageImpl#getMemberRef()
		 * @generated
		 */
		EClass MEMBER_REF = eINSTANCE.getMemberRef();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_REF__MEMBER = eINSTANCE.getMemberRef_Member();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_REF__QUALIFIER = eINSTANCE.getMemberRef_Qualifier();

		/**
		 * The meta object literal for the '{@link Java5.impl.MethodDeclarationImpl <em>Method Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.MethodDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getMethodDeclaration()
		 * @generated
		 */
		EClass METHOD_DECLARATION = eINSTANCE.getMethodDeclaration();

		/**
		 * The meta object literal for the '<em><b>Extra Array Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS = eINSTANCE.getMethodDeclaration_ExtraArrayDimensions();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_DECLARATION__CONSTRUCTOR = eINSTANCE.getMethodDeclaration_Constructor();

		/**
		 * The meta object literal for the '<em><b>Varargs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_DECLARATION__VARARGS = eINSTANCE.getMethodDeclaration_Varargs();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION__BODY = eINSTANCE.getMethodDeclaration_Body();

		/**
		 * The meta object literal for the '<em><b>Thrown Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION__THROWN_EXCEPTIONS = eINSTANCE.getMethodDeclaration_ThrownExceptions();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION__RETURN_TYPE = eINSTANCE.getMethodDeclaration_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION__TYPE_PARAMETERS = eINSTANCE.getMethodDeclaration_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Redefined Method Declaration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION = eINSTANCE.getMethodDeclaration_RedefinedMethodDeclaration();

		/**
		 * The meta object literal for the '<em><b>Redefinitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION__REDEFINITIONS = eINSTANCE.getMethodDeclaration_Redefinitions();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DECLARATION__PARAMETERS = eINSTANCE.getMethodDeclaration_Parameters();

		/**
		 * The meta object literal for the '{@link Java5.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.MethodInvocationImpl
		 * @see Java5.impl.Java5PackageImpl#getMethodInvocation()
		 * @generated
		 */
		EClass METHOD_INVOCATION = eINSTANCE.getMethodInvocation();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION__METHOD = eINSTANCE.getMethodInvocation_Method();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION__ARGUMENTS = eINSTANCE.getMethodInvocation_Arguments();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_INVOCATION__EXPRESSION = eINSTANCE.getMethodInvocation_Expression();

		/**
		 * The meta object literal for the '{@link Java5.impl.MethodRefImpl <em>Method Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.MethodRefImpl
		 * @see Java5.impl.Java5PackageImpl#getMethodRef()
		 * @generated
		 */
		EClass METHOD_REF = eINSTANCE.getMethodRef();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_REF__METHOD = eINSTANCE.getMethodRef_Method();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_REF__QUALIFIER = eINSTANCE.getMethodRef_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_REF__PARAMETERS = eINSTANCE.getMethodRef_Parameters();

		/**
		 * The meta object literal for the '{@link Java5.impl.MethodRefParameterImpl <em>Method Ref Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.MethodRefParameterImpl
		 * @see Java5.impl.Java5PackageImpl#getMethodRefParameter()
		 * @generated
		 */
		EClass METHOD_REF_PARAMETER = eINSTANCE.getMethodRefParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_REF_PARAMETER__NAME = eINSTANCE.getMethodRefParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Is Varargs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_REF_PARAMETER__IS_VARARGS = eINSTANCE.getMethodRefParameter_IsVarargs();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_REF_PARAMETER__TYPE = eINSTANCE.getMethodRefParameter_Type();

		/**
		 * The meta object literal for the '{@link Java5.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ModelImpl
		 * @see Java5.impl.Java5PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OWNED_ELEMENTS = eINSTANCE.getModel_OwnedElements();

		/**
		 * The meta object literal for the '<em><b>Orphan Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ORPHAN_TYPES = eINSTANCE.getModel_OrphanTypes();

		/**
		 * The meta object literal for the '<em><b>Unresolved Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__UNRESOLVED_ITEMS = eINSTANCE.getModel_UnresolvedItems();

		/**
		 * The meta object literal for the '<em><b>Compilation Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__COMPILATION_UNITS = eINSTANCE.getModel_CompilationUnits();

		/**
		 * The meta object literal for the '{@link Java5.impl.ModifierImpl <em>Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ModifierImpl
		 * @see Java5.impl.Java5PackageImpl#getModifier()
		 * @generated
		 */
		EClass MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__VISIBILITY = eINSTANCE.getModifier_Visibility();

		/**
		 * The meta object literal for the '<em><b>Inheritance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__INHERITANCE = eINSTANCE.getModifier_Inheritance();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__STATIC = eINSTANCE.getModifier_Static();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__TRANSIENT = eINSTANCE.getModifier_Transient();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__VOLATILE = eINSTANCE.getModifier_Volatile();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__NATIVE = eINSTANCE.getModifier_Native();

		/**
		 * The meta object literal for the '<em><b>Strictfp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__STRICTFP = eINSTANCE.getModifier_Strictfp();

		/**
		 * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__SYNCHRONIZED = eINSTANCE.getModifier_Synchronized();

		/**
		 * The meta object literal for the '<em><b>Body Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__BODY_DECLARATION = eINSTANCE.getModifier_BodyDeclaration();

		/**
		 * The meta object literal for the '<em><b>Single Variable Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__SINGLE_VARIABLE_DECLARATION = eINSTANCE.getModifier_SingleVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__VARIABLE_DECLARATION_STATEMENT = eINSTANCE.getModifier_VariableDeclarationStatement();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration Expression</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__VARIABLE_DECLARATION_EXPRESSION = eINSTANCE.getModifier_VariableDeclarationExpression();

		/**
		 * The meta object literal for the '{@link Java5.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.NamedElementImpl
		 * @see Java5.impl.Java5PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__PROXY = eINSTANCE.getNamedElement_Proxy();

		/**
		 * The meta object literal for the '{@link Java5.impl.NamedElementRefImpl <em>Named Element Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.NamedElementRefImpl
		 * @see Java5.impl.Java5PackageImpl#getNamedElementRef()
		 * @generated
		 */
		EClass NAMED_ELEMENT_REF = eINSTANCE.getNamedElementRef();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT_REF__QUALIFIER = eINSTANCE.getNamedElementRef_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT_REF__ELEMENT = eINSTANCE.getNamedElementRef_Element();

		/**
		 * The meta object literal for the '{@link Java5.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.NullLiteralImpl
		 * @see Java5.impl.Java5PackageImpl#getNullLiteral()
		 * @generated
		 */
		EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

		/**
		 * The meta object literal for the '{@link Java5.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.NumberLiteralImpl
		 * @see Java5.impl.Java5PackageImpl#getNumberLiteral()
		 * @generated
		 */
		EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

		/**
		 * The meta object literal for the '<em><b>Token Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_LITERAL__TOKEN_VALUE = eINSTANCE.getNumberLiteral_TokenValue();

		/**
		 * The meta object literal for the '{@link Java5.impl.OrphanTypeImpl <em>Orphan Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.OrphanTypeImpl
		 * @see Java5.impl.Java5PackageImpl#getOrphanType()
		 * @generated
		 */
		EClass ORPHAN_TYPE = eINSTANCE.getOrphanType();

		/**
		 * The meta object literal for the '{@link Java5.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PackageDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getPackageDeclaration()
		 * @generated
		 */
		EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_DECLARATION__QUALIFIED_NAME = eINSTANCE.getPackageDeclaration_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Owned Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DECLARATION__OWNED_ELEMENTS = eINSTANCE.getPackageDeclaration_OwnedElements();

		/**
		 * The meta object literal for the '<em><b>Owned Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_DECLARATION__OWNED_PACKAGES = eINSTANCE.getPackageDeclaration_OwnedPackages();

		/**
		 * The meta object literal for the '{@link Java5.impl.ParameterizedTypeImpl <em>Parameterized Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ParameterizedTypeImpl
		 * @see Java5.impl.Java5PackageImpl#getParameterizedType()
		 * @generated
		 */
		EClass PARAMETERIZED_TYPE = eINSTANCE.getParameterizedType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_TYPE__TYPE = eINSTANCE.getParameterizedType_Type();

		/**
		 * The meta object literal for the '<em><b>Type Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_TYPE__TYPE_ARGUMENTS = eINSTANCE.getParameterizedType_TypeArguments();

		/**
		 * The meta object literal for the '{@link Java5.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ParenthesizedExpressionImpl
		 * @see Java5.impl.Java5PackageImpl#getParenthesizedExpression()
		 * @generated
		 */
		EClass PARENTHESIZED_EXPRESSION = eINSTANCE.getParenthesizedExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIZED_EXPRESSION__EXPRESSION = eINSTANCE.getParenthesizedExpression_Expression();

		/**
		 * The meta object literal for the '{@link Java5.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PostfixExpressionImpl
		 * @see Java5.impl.Java5PackageImpl#getPostfixExpression()
		 * @generated
		 */
		EClass POSTFIX_EXPRESSION = eINSTANCE.getPostfixExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTFIX_EXPRESSION__OPERATOR = eINSTANCE.getPostfixExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTFIX_EXPRESSION__OPERAND = eINSTANCE.getPostfixExpression_Operand();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrefixExpressionImpl <em>Prefix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrefixExpressionImpl
		 * @see Java5.impl.Java5PackageImpl#getPrefixExpression()
		 * @generated
		 */
		EClass PREFIX_EXPRESSION = eINSTANCE.getPrefixExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREFIX_EXPRESSION__OPERATOR = eINSTANCE.getPrefixExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFIX_EXPRESSION__OPERAND = eINSTANCE.getPrefixExpression_Operand();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrimitiveTypeImpl
		 * @see Java5.impl.Java5PackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrimitiveTypeBooleanImpl <em>Primitive Type Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrimitiveTypeBooleanImpl
		 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeBoolean()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_BOOLEAN = eINSTANCE.getPrimitiveTypeBoolean();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrimitiveTypeByteImpl <em>Primitive Type Byte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrimitiveTypeByteImpl
		 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeByte()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_BYTE = eINSTANCE.getPrimitiveTypeByte();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrimitiveTypeCharImpl <em>Primitive Type Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrimitiveTypeCharImpl
		 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeChar()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_CHAR = eINSTANCE.getPrimitiveTypeChar();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrimitiveTypeDoubleImpl <em>Primitive Type Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrimitiveTypeDoubleImpl
		 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeDouble()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_DOUBLE = eINSTANCE.getPrimitiveTypeDouble();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrimitiveTypeShortImpl <em>Primitive Type Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrimitiveTypeShortImpl
		 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeShort()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_SHORT = eINSTANCE.getPrimitiveTypeShort();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrimitiveTypeFloatImpl <em>Primitive Type Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrimitiveTypeFloatImpl
		 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeFloat()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_FLOAT = eINSTANCE.getPrimitiveTypeFloat();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrimitiveTypeIntImpl <em>Primitive Type Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrimitiveTypeIntImpl
		 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeInt()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_INT = eINSTANCE.getPrimitiveTypeInt();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrimitiveTypeLongImpl <em>Primitive Type Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrimitiveTypeLongImpl
		 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeLong()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_LONG = eINSTANCE.getPrimitiveTypeLong();

		/**
		 * The meta object literal for the '{@link Java5.impl.PrimitiveTypeVoidImpl <em>Primitive Type Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.PrimitiveTypeVoidImpl
		 * @see Java5.impl.Java5PackageImpl#getPrimitiveTypeVoid()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_VOID = eINSTANCE.getPrimitiveTypeVoid();

		/**
		 * The meta object literal for the '{@link Java5.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ReturnStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__EXPRESSION = eINSTANCE.getReturnStatement_Expression();

		/**
		 * The meta object literal for the '{@link Java5.impl.SingleVariableDeclarationImpl <em>Single Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.SingleVariableDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getSingleVariableDeclaration()
		 * @generated
		 */
		EClass SINGLE_VARIABLE_DECLARATION = eINSTANCE.getSingleVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VARIABLE_DECLARATION__MODIFIERS = eINSTANCE.getSingleVariableDeclaration_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Varargs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VARIABLE_DECLARATION__VARARGS = eINSTANCE.getSingleVariableDeclaration_Varargs();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VARIABLE_DECLARATION__TYPE = eINSTANCE.getSingleVariableDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Method Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION = eINSTANCE.getSingleVariableDeclaration_MethodDeclaration();

		/**
		 * The meta object literal for the '<em><b>Catch Clause</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE = eINSTANCE.getSingleVariableDeclaration_CatchClause();

		/**
		 * The meta object literal for the '<em><b>Enhanced For Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT = eINSTANCE.getSingleVariableDeclaration_EnhancedForStatement();

		/**
		 * The meta object literal for the '{@link Java5.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.StatementImpl
		 * @see Java5.impl.Java5PackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link Java5.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.StringLiteralImpl
		 * @see Java5.impl.Java5PackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Escaped Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__ESCAPED_VALUE = eINSTANCE.getStringLiteral_EscapedValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link Java5.impl.SuperConstructorInvocationImpl <em>Super Constructor Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.SuperConstructorInvocationImpl
		 * @see Java5.impl.Java5PackageImpl#getSuperConstructorInvocation()
		 * @generated
		 */
		EClass SUPER_CONSTRUCTOR_INVOCATION = eINSTANCE.getSuperConstructorInvocation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION = eINSTANCE.getSuperConstructorInvocation_Expression();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS = eINSTANCE.getSuperConstructorInvocation_Arguments();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_CONSTRUCTOR_INVOCATION__METHOD = eINSTANCE.getSuperConstructorInvocation_Method();

		/**
		 * The meta object literal for the '{@link Java5.impl.SuperFieldAccessImpl <em>Super Field Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.SuperFieldAccessImpl
		 * @see Java5.impl.Java5PackageImpl#getSuperFieldAccess()
		 * @generated
		 */
		EClass SUPER_FIELD_ACCESS = eINSTANCE.getSuperFieldAccess();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_FIELD_ACCESS__FIELD = eINSTANCE.getSuperFieldAccess_Field();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_FIELD_ACCESS__QUALIFIER = eINSTANCE.getSuperFieldAccess_Qualifier();

		/**
		 * The meta object literal for the '{@link Java5.impl.SuperMethodInvocationImpl <em>Super Method Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.SuperMethodInvocationImpl
		 * @see Java5.impl.Java5PackageImpl#getSuperMethodInvocation()
		 * @generated
		 */
		EClass SUPER_METHOD_INVOCATION = eINSTANCE.getSuperMethodInvocation();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_METHOD_INVOCATION__ARGUMENTS = eINSTANCE.getSuperMethodInvocation_Arguments();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_METHOD_INVOCATION__METHOD = eINSTANCE.getSuperMethodInvocation_Method();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPER_METHOD_INVOCATION__QUALIFIER = eINSTANCE.getSuperMethodInvocation_Qualifier();

		/**
		 * The meta object literal for the '{@link Java5.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.SwitchCaseImpl
		 * @see Java5.impl.Java5PackageImpl#getSwitchCase()
		 * @generated
		 */
		EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_CASE__DEFAULT = eINSTANCE.getSwitchCase_Default();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE__EXPRESSION = eINSTANCE.getSwitchCase_Expression();

		/**
		 * The meta object literal for the '{@link Java5.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.SwitchStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getSwitchStatement()
		 * @generated
		 */
		EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__EXPRESSION = eINSTANCE.getSwitchStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__STATEMENTS = eINSTANCE.getSwitchStatement_Statements();

		/**
		 * The meta object literal for the '{@link Java5.impl.SynchronizedStatementImpl <em>Synchronized Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.SynchronizedStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getSynchronizedStatement()
		 * @generated
		 */
		EClass SYNCHRONIZED_STATEMENT = eINSTANCE.getSynchronizedStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZED_STATEMENT__BODY = eINSTANCE.getSynchronizedStatement_Body();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZED_STATEMENT__EXPRESSION = eINSTANCE.getSynchronizedStatement_Expression();

		/**
		 * The meta object literal for the '{@link Java5.impl.TagElementImpl <em>Tag Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.TagElementImpl
		 * @see Java5.impl.Java5PackageImpl#getTagElement()
		 * @generated
		 */
		EClass TAG_ELEMENT = eINSTANCE.getTagElement();

		/**
		 * The meta object literal for the '<em><b>Tag Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_ELEMENT__TAG_NAME = eINSTANCE.getTagElement_TagName();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_ELEMENT__FRAGMENTS = eINSTANCE.getTagElement_Fragments();

		/**
		 * The meta object literal for the '{@link Java5.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.TextElementImpl
		 * @see Java5.impl.Java5PackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ELEMENT__TEXT = eINSTANCE.getTextElement_Text();

		/**
		 * The meta object literal for the '{@link Java5.impl.ThisExpressionImpl <em>This Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ThisExpressionImpl
		 * @see Java5.impl.Java5PackageImpl#getThisExpression()
		 * @generated
		 */
		EClass THIS_EXPRESSION = eINSTANCE.getThisExpression();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIS_EXPRESSION__QUALIFIER = eINSTANCE.getThisExpression_Qualifier();

		/**
		 * The meta object literal for the '{@link Java5.impl.ThrowStatementImpl <em>Throw Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.ThrowStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getThrowStatement()
		 * @generated
		 */
		EClass THROW_STATEMENT = eINSTANCE.getThrowStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_STATEMENT__EXPRESSION = eINSTANCE.getThrowStatement_Expression();

		/**
		 * The meta object literal for the '{@link Java5.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.TypeDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getTypeDeclaration()
		 * @generated
		 */
		EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION__TYPE_PARAMETERS = eINSTANCE.getTypeDeclaration_TypeParameters();

		/**
		 * The meta object literal for the '{@link Java5.impl.TypeDeclarationStatementImpl <em>Type Declaration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.TypeDeclarationStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getTypeDeclarationStatement()
		 * @generated
		 */
		EClass TYPE_DECLARATION_STATEMENT = eINSTANCE.getTypeDeclarationStatement();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION_STATEMENT__DECLARATION = eINSTANCE.getTypeDeclarationStatement_Declaration();

		/**
		 * The meta object literal for the '{@link Java5.impl.TypeLiteralImpl <em>Type Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.TypeLiteralImpl
		 * @see Java5.impl.Java5PackageImpl#getTypeLiteral()
		 * @generated
		 */
		EClass TYPE_LITERAL = eINSTANCE.getTypeLiteral();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_LITERAL__TYPE = eINSTANCE.getTypeLiteral_Type();

		/**
		 * The meta object literal for the '{@link Java5.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.TypeParameterImpl
		 * @see Java5.impl.Java5PackageImpl#getTypeParameter()
		 * @generated
		 */
		EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_PARAMETER__BOUNDS = eINSTANCE.getTypeParameter_Bounds();

		/**
		 * The meta object literal for the '{@link Java5.impl.TryStatementImpl <em>Try Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.TryStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getTryStatement()
		 * @generated
		 */
		EClass TRY_STATEMENT = eINSTANCE.getTryStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STATEMENT__BODY = eINSTANCE.getTryStatement_Body();

		/**
		 * The meta object literal for the '<em><b>Finally</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STATEMENT__FINALLY = eINSTANCE.getTryStatement_Finally();

		/**
		 * The meta object literal for the '<em><b>Catch Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STATEMENT__CATCH_CLAUSES = eINSTANCE.getTryStatement_CatchClauses();

		/**
		 * The meta object literal for the '{@link Java5.impl.UnresolvedItemImpl <em>Unresolved Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.UnresolvedItemImpl
		 * @see Java5.impl.Java5PackageImpl#getUnresolvedItem()
		 * @generated
		 */
		EClass UNRESOLVED_ITEM = eINSTANCE.getUnresolvedItem();

		/**
		 * The meta object literal for the '{@link Java5.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.VariableDeclarationImpl
		 * @see Java5.impl.Java5PackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Extra Array Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS = eINSTANCE.getVariableDeclaration_ExtraArrayDimensions();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__INITIALIZER = eINSTANCE.getVariableDeclaration_Initializer();

		/**
		 * The meta object literal for the '{@link Java5.impl.VariableDeclarationExpressionImpl <em>Variable Declaration Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.VariableDeclarationExpressionImpl
		 * @see Java5.impl.Java5PackageImpl#getVariableDeclarationExpression()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION_EXPRESSION = eINSTANCE.getVariableDeclarationExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_EXPRESSION__TYPE = eINSTANCE.getVariableDeclarationExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS = eINSTANCE.getVariableDeclarationExpression_Fragments();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_EXPRESSION__MODIFIERS = eINSTANCE.getVariableDeclarationExpression_Modifiers();

		/**
		 * The meta object literal for the '{@link Java5.impl.VariableDeclarationFragmentImpl <em>Variable Declaration Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.VariableDeclarationFragmentImpl
		 * @see Java5.impl.Java5PackageImpl#getVariableDeclarationFragment()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION_FRAGMENT = eINSTANCE.getVariableDeclarationFragment();

		/**
		 * The meta object literal for the '<em><b>Field Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION = eINSTANCE.getVariableDeclarationFragment_FieldDeclaration();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT = eINSTANCE.getVariableDeclarationFragment_VariableDeclarationStatement();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration Expression</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION = eINSTANCE.getVariableDeclarationFragment_VariableDeclarationExpression();

		/**
		 * The meta object literal for the '{@link Java5.impl.VariableDeclarationStatementImpl <em>Variable Declaration Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.VariableDeclarationStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getVariableDeclarationStatement()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION_STATEMENT = eINSTANCE.getVariableDeclarationStatement();

		/**
		 * The meta object literal for the '<em><b>Extra Array Dimensions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION_STATEMENT__EXTRA_ARRAY_DIMENSIONS = eINSTANCE.getVariableDeclarationStatement_ExtraArrayDimensions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_STATEMENT__TYPE = eINSTANCE.getVariableDeclarationStatement_Type();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_STATEMENT__FRAGMENTS = eINSTANCE.getVariableDeclarationStatement_Fragments();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION_STATEMENT__MODIFIERS = eINSTANCE.getVariableDeclarationStatement_Modifiers();

		/**
		 * The meta object literal for the '{@link Java5.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.WhileStatementImpl
		 * @see Java5.impl.Java5PackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__EXPRESSION = eINSTANCE.getWhileStatement_Expression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STATEMENT__BODY = eINSTANCE.getWhileStatement_Body();

		/**
		 * The meta object literal for the '{@link Java5.impl.WildCardTypeImpl <em>Wild Card Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.impl.WildCardTypeImpl
		 * @see Java5.impl.Java5PackageImpl#getWildCardType()
		 * @generated
		 */
		EClass WILD_CARD_TYPE = eINSTANCE.getWildCardType();

		/**
		 * The meta object literal for the '<em><b>Is Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WILD_CARD_TYPE__IS_UPPER_BOUND = eINSTANCE.getWildCardType_IsUpperBound();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WILD_CARD_TYPE__BOUND = eINSTANCE.getWildCardType_Bound();

		/**
		 * The meta object literal for the '{@link Java5.InheritanceKind <em>Inheritance Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.InheritanceKind
		 * @see Java5.impl.Java5PackageImpl#getInheritanceKind()
		 * @generated
		 */
		EEnum INHERITANCE_KIND = eINSTANCE.getInheritanceKind();

		/**
		 * The meta object literal for the '{@link Java5.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Java5.VisibilityKind
		 * @see Java5.impl.Java5PackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

	}

} //Java5Package
