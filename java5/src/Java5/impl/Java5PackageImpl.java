/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.ASTNode;
import Java5.AbstractTypeDeclaration;
import Java5.Annotation;
import Java5.AnnotationMemberValuePair;
import Java5.AnnotationTypeDeclaration;
import Java5.AnnotationTypeMemberDeclaration;
import Java5.AnonymousClassDeclaration;
import Java5.ArrayAccess;
import Java5.ArrayCreation;
import Java5.ArrayInitializer;
import Java5.ArrayLengthAccess;
import Java5.ArrayType;
import Java5.AssertStatement;
import Java5.Assignment;
import Java5.Block;
import Java5.BodyDeclaration;
import Java5.BooleanLiteral;
import Java5.BreakStatement;
import Java5.CastExpression;
import Java5.CatchClause;
import Java5.CharacterLiteral;
import Java5.ClassDeclaration;
import Java5.ClassInstanceCreation;
import Java5.CompilationUnit;
import Java5.ConditionalExpression;
import Java5.ConstructorInvocation;
import Java5.ContinueStatement;
import Java5.DoStatement;
import Java5.EmptyStatement;
import Java5.EnhancedForStatement;
import Java5.EnumConstantDeclaration;
import Java5.EnumDeclaration;
import Java5.Expression;
import Java5.ExpressionStatement;
import Java5.FieldAccess;
import Java5.FieldDeclaration;
import Java5.ForStatement;
import Java5.IfStatement;
import Java5.ImportDeclaration;
import Java5.InfixExpression;
import Java5.InheritanceKind;
import Java5.Initializer;
import Java5.InstanceofExpression;
import Java5.InterfaceDeclaration;
import Java5.Java5Factory;
import Java5.Java5Package;
import Java5.LabeledStatement;
import Java5.MemberRef;
import Java5.MethodDeclaration;
import Java5.MethodInvocation;
import Java5.MethodRef;
import Java5.MethodRefParameter;
import Java5.Model;
import Java5.Modifier;
import Java5.NamedElement;
import Java5.NamedElementRef;
import Java5.NullLiteral;
import Java5.NumberLiteral;
import Java5.OrphanType;
import Java5.PackageDeclaration;
import Java5.ParameterizedType;
import Java5.ParenthesizedExpression;
import Java5.PostfixExpression;
import Java5.PrefixExpression;
import Java5.PrimitiveType;
import Java5.PrimitiveTypeBoolean;
import Java5.PrimitiveTypeByte;
import Java5.PrimitiveTypeChar;
import Java5.PrimitiveTypeDouble;
import Java5.PrimitiveTypeFloat;
import Java5.PrimitiveTypeInt;
import Java5.PrimitiveTypeLong;
import Java5.PrimitiveTypeShort;
import Java5.PrimitiveTypeVoid;
import Java5.ReturnStatement;
import Java5.SingleVariableDeclaration;
import Java5.Statement;
import Java5.StringLiteral;
import Java5.SuperConstructorInvocation;
import Java5.SuperFieldAccess;
import Java5.SuperMethodInvocation;
import Java5.SwitchCase;
import Java5.SwitchStatement;
import Java5.SynchronizedStatement;
import Java5.TagElement;
import Java5.TextElement;
import Java5.ThisExpression;
import Java5.ThrowStatement;
import Java5.TryStatement;
import Java5.TypeDeclaration;
import Java5.TypeDeclarationStatement;
import Java5.TypeLiteral;
import Java5.TypeParameter;
import Java5.UnresolvedItem;
import Java5.VariableDeclaration;
import Java5.VariableDeclarationExpression;
import Java5.VariableDeclarationFragment;
import Java5.VariableDeclarationStatement;
import Java5.VisibilityKind;
import Java5.WhileStatement;
import Java5.WildCardType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Java5PackageImpl extends EPackageImpl implements Java5Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeMemberDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayLengthAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInstanceCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumConstantDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enhancedForStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infixExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceofExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodRefParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orphanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parenthesizedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postfixExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeByteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeShortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeFloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeVoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superConstructorInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superFieldAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superMethodInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizedStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thisExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wildCardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inheritanceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

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
	 * @see Java5.Java5Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Java5PackageImpl() {
		super(eNS_URI, Java5Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Java5Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Java5Package init() {
		if (isInited) return (Java5Package)EPackage.Registry.INSTANCE.getEPackage(Java5Package.eNS_URI);

		// Obtain or create and register package
		Java5PackageImpl theJava5Package = (Java5PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Java5PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Java5PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJava5Package.createPackageContents();

		// Initialize created meta-data
		theJava5Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJava5Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Java5Package.eNS_URI, theJava5Package);
		return theJava5Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTypeDeclaration() {
		return abstractTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTypeDeclaration_QualifiedName() {
		return (EAttribute)abstractTypeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTypeDeclaration_BodyDeclarations() {
		return (EReference)abstractTypeDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTypeDeclaration_Imports() {
		return (EReference)abstractTypeDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTypeDeclaration_Package() {
		return (EReference)abstractTypeDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractTypeDeclaration_SuperInterfaces() {
		return (EReference)abstractTypeDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Type() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_Values() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationMemberValuePair() {
		return annotationMemberValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationMemberValuePair_Member() {
		return (EReference)annotationMemberValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationMemberValuePair_Value() {
		return (EReference)annotationMemberValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationTypeDeclaration() {
		return annotationTypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationTypeMemberDeclaration() {
		return annotationTypeMemberDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationTypeMemberDeclaration_Default() {
		return (EReference)annotationTypeMemberDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationTypeMemberDeclaration_Type() {
		return (EReference)annotationTypeMemberDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymousClassDeclaration() {
		return anonymousClassDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnonymousClassDeclaration_BodyDeclarations() {
		return (EReference)anonymousClassDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnonymousClassDeclaration_ClassInstanceCreation() {
		return (EReference)anonymousClassDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayAccess() {
		return arrayAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayAccess_Array() {
		return (EReference)arrayAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayAccess_Index() {
		return (EReference)arrayAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayCreation() {
		return arrayCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayCreation_Dimensions() {
		return (EReference)arrayCreationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayCreation_Initializer() {
		return (EReference)arrayCreationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayCreation_Type() {
		return (EReference)arrayCreationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayInitializer() {
		return arrayInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayInitializer_Expressions() {
		return (EReference)arrayInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayLengthAccess() {
		return arrayLengthAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayLengthAccess_Array() {
		return (EReference)arrayLengthAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayType() {
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayType_Dimensions() {
		return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayType_OriginalName() {
		return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayType_ElementType() {
		return (EReference)arrayTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertStatement() {
		return assertStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertStatement_Message() {
		return (EReference)assertStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertStatement_Expression() {
		return (EReference)assertStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_LeftHandSide() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignment_Operator() {
		return (EAttribute)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_RightHandSide() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASTNode() {
		return astNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Statements() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyDeclaration() {
		return bodyDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyDeclaration_AbstractTypeDeclaration() {
		return (EReference)bodyDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyDeclaration_Annotations() {
		return (EReference)bodyDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyDeclaration_AnonymousClassDeclarationOwner() {
		return (EReference)bodyDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyDeclaration_Modifiers() {
		return (EReference)bodyDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteral() {
		return booleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteral_Value() {
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakStatement() {
		return breakStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBreakStatement_Label() {
		return (EReference)breakStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCastExpression() {
		return castExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastExpression_Expression() {
		return (EReference)castExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastExpression_Type() {
		return (EReference)castExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchClause() {
		return catchClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchClause_Exception() {
		return (EReference)catchClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchClause_Body() {
		return (EReference)catchClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterLiteral() {
		return characterLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterLiteral_EscapedValue() {
		return (EAttribute)characterLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterLiteral_Value() {
		return (EAttribute)characterLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDeclaration() {
		return classDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_SuperClass() {
		return (EReference)classDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassInstanceCreation() {
		return classInstanceCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassInstanceCreation_AnonymousClassDeclaration() {
		return (EReference)classInstanceCreationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassInstanceCreation_Arguments() {
		return (EReference)classInstanceCreationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassInstanceCreation_Expression() {
		return (EReference)classInstanceCreationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassInstanceCreation_Method() {
		return (EReference)classInstanceCreationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassInstanceCreation_Type() {
		return (EReference)classInstanceCreationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationUnit() {
		return compilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_Imports() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationUnit_OriginalFilePath() {
		return (EAttribute)compilationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_Package() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompilationUnit_Types() {
		return (EReference)compilationUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalExpression() {
		return conditionalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_ElseExpression() {
		return (EReference)conditionalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_Expression() {
		return (EReference)conditionalExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalExpression_ThenExpression() {
		return (EReference)conditionalExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorInvocation() {
		return constructorInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorInvocation_Arguments() {
		return (EReference)constructorInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorInvocation_Method() {
		return (EReference)constructorInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinueStatement() {
		return continueStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContinueStatement_Label() {
		return (EReference)continueStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoStatement() {
		return doStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoStatement_Expression() {
		return (EReference)doStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoStatement_Body() {
		return (EReference)doStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyStatement() {
		return emptyStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumDeclaration() {
		return enumDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumDeclaration_EnumConstants() {
		return (EReference)enumDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumConstantDeclaration() {
		return enumConstantDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumConstantDeclaration_AnonymousClassDeclaration() {
		return (EReference)enumConstantDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumConstantDeclaration_Arguments() {
		return (EReference)enumConstantDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnhancedForStatement() {
		return enhancedForStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnhancedForStatement_Body() {
		return (EReference)enhancedForStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnhancedForStatement_Expression() {
		return (EReference)enhancedForStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnhancedForStatement_Parameter() {
		return (EReference)enhancedForStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionStatement() {
		return expressionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionStatement_Expression() {
		return (EReference)expressionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldAccess() {
		return fieldAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldAccess_Field() {
		return (EReference)fieldAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldAccess_Expression() {
		return (EReference)fieldAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDeclaration() {
		return fieldDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldDeclaration_Type() {
		return (EReference)fieldDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldDeclaration_Fragments() {
		return (EReference)fieldDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForStatement() {
		return forStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Expression() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Updaters() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Initializers() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Body() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Expression() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ThenStatement() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_ElseStatement() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportDeclaration() {
		return importDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportDeclaration_Static() {
		return (EAttribute)importDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportDeclaration_ImportedElement() {
		return (EReference)importDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfixExpression() {
		return infixExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfixExpression_Operator() {
		return (EAttribute)infixExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfixExpression_RightOperand() {
		return (EReference)infixExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfixExpression_LeftOperand() {
		return (EReference)infixExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfixExpression_ExtendedOperands() {
		return (EReference)infixExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializer() {
		return initializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitializer_Body() {
		return (EReference)initializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceofExpression() {
		return instanceofExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceofExpression_RightOperand() {
		return (EReference)instanceofExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceofExpression_LeftOperand() {
		return (EReference)instanceofExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDeclaration() {
		return interfaceDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledStatement() {
		return labeledStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabeledStatement_Body() {
		return (EReference)labeledStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberRef() {
		return memberRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberRef_Member() {
		return (EReference)memberRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberRef_Qualifier() {
		return (EReference)memberRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodDeclaration() {
		return methodDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodDeclaration_ExtraArrayDimensions() {
		return (EAttribute)methodDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodDeclaration_Constructor() {
		return (EAttribute)methodDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodDeclaration_Varargs() {
		return (EAttribute)methodDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclaration_Body() {
		return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclaration_ThrownExceptions() {
		return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclaration_ReturnType() {
		return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclaration_TypeParameters() {
		return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclaration_RedefinedMethodDeclaration() {
		return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclaration_Redefinitions() {
		return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodDeclaration_Parameters() {
		return (EReference)methodDeclarationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodInvocation() {
		return methodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodInvocation_Method() {
		return (EReference)methodInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodInvocation_Arguments() {
		return (EReference)methodInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodInvocation_Expression() {
		return (EReference)methodInvocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodRef() {
		return methodRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodRef_Method() {
		return (EReference)methodRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodRef_Qualifier() {
		return (EReference)methodRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodRef_Parameters() {
		return (EReference)methodRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodRefParameter() {
		return methodRefParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodRefParameter_Name() {
		return (EAttribute)methodRefParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodRefParameter_IsVarargs() {
		return (EAttribute)methodRefParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodRefParameter_Type() {
		return (EReference)methodRefParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_OwnedElements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_OrphanTypes() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_UnresolvedItems() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_CompilationUnits() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifier() {
		return modifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Visibility() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Inheritance() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Static() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Transient() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Volatile() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Native() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Strictfp() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifier_Synchronized() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifier_BodyDeclaration() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifier_SingleVariableDeclaration() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifier_VariableDeclarationStatement() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifier_VariableDeclarationExpression() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Proxy() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElementRef() {
		return namedElementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElementRef_Qualifier() {
		return (EReference)namedElementRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElementRef_Element() {
		return (EReference)namedElementRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullLiteral() {
		return nullLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberLiteral() {
		return numberLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberLiteral_TokenValue() {
		return (EAttribute)numberLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrphanType() {
		return orphanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageDeclaration() {
		return packageDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageDeclaration_QualifiedName() {
		return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDeclaration_OwnedElements() {
		return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageDeclaration_OwnedPackages() {
		return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterizedType() {
		return parameterizedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedType_Type() {
		return (EReference)parameterizedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedType_TypeArguments() {
		return (EReference)parameterizedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParenthesizedExpression() {
		return parenthesizedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParenthesizedExpression_Expression() {
		return (EReference)parenthesizedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostfixExpression() {
		return postfixExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostfixExpression_Operator() {
		return (EAttribute)postfixExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostfixExpression_Operand() {
		return (EReference)postfixExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefixExpression() {
		return prefixExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrefixExpression_Operator() {
		return (EAttribute)prefixExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefixExpression_Operand() {
		return (EReference)prefixExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeBoolean() {
		return primitiveTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeByte() {
		return primitiveTypeByteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeChar() {
		return primitiveTypeCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeDouble() {
		return primitiveTypeDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeShort() {
		return primitiveTypeShortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeFloat() {
		return primitiveTypeFloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeInt() {
		return primitiveTypeIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeLong() {
		return primitiveTypeLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeVoid() {
		return primitiveTypeVoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnStatement() {
		return returnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnStatement_Expression() {
		return (EReference)returnStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleVariableDeclaration() {
		return singleVariableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVariableDeclaration_Modifiers() {
		return (EReference)singleVariableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleVariableDeclaration_Varargs() {
		return (EAttribute)singleVariableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVariableDeclaration_Type() {
		return (EReference)singleVariableDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVariableDeclaration_MethodDeclaration() {
		return (EReference)singleVariableDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVariableDeclaration_CatchClause() {
		return (EReference)singleVariableDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleVariableDeclaration_EnhancedForStatement() {
		return (EReference)singleVariableDeclarationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteral() {
		return stringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_EscapedValue() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteral_Value() {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperConstructorInvocation() {
		return superConstructorInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperConstructorInvocation_Expression() {
		return (EReference)superConstructorInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperConstructorInvocation_Arguments() {
		return (EReference)superConstructorInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperConstructorInvocation_Method() {
		return (EReference)superConstructorInvocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperFieldAccess() {
		return superFieldAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperFieldAccess_Field() {
		return (EReference)superFieldAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperFieldAccess_Qualifier() {
		return (EReference)superFieldAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuperMethodInvocation() {
		return superMethodInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperMethodInvocation_Arguments() {
		return (EReference)superMethodInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperMethodInvocation_Method() {
		return (EReference)superMethodInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSuperMethodInvocation_Qualifier() {
		return (EReference)superMethodInvocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchCase() {
		return switchCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchCase_Default() {
		return (EAttribute)switchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchCase_Expression() {
		return (EReference)switchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchStatement() {
		return switchStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchStatement_Expression() {
		return (EReference)switchStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchStatement_Statements() {
		return (EReference)switchStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizedStatement() {
		return synchronizedStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizedStatement_Body() {
		return (EReference)synchronizedStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizedStatement_Expression() {
		return (EReference)synchronizedStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagElement() {
		return tagElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagElement_TagName() {
		return (EAttribute)tagElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagElement_Fragments() {
		return (EReference)tagElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextElement() {
		return textElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextElement_Text() {
		return (EAttribute)textElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThisExpression() {
		return thisExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThisExpression_Qualifier() {
		return (EReference)thisExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowStatement() {
		return throwStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowStatement_Expression() {
		return (EReference)throwStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclaration() {
		return typeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_TypeParameters() {
		return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclarationStatement() {
		return typeDeclarationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclarationStatement_Declaration() {
		return (EReference)typeDeclarationStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeLiteral() {
		return typeLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeLiteral_Type() {
		return (EReference)typeLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeParameter() {
		return typeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeParameter_Bounds() {
		return (EReference)typeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTryStatement() {
		return tryStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryStatement_Body() {
		return (EReference)tryStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryStatement_Finally() {
		return (EReference)tryStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryStatement_CatchClauses() {
		return (EReference)tryStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnresolvedItem() {
		return unresolvedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_ExtraArrayDimensions() {
		return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclaration_Initializer() {
		return (EReference)variableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclarationExpression() {
		return variableDeclarationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationExpression_Type() {
		return (EReference)variableDeclarationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationExpression_Fragments() {
		return (EReference)variableDeclarationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationExpression_Modifiers() {
		return (EReference)variableDeclarationExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclarationFragment() {
		return variableDeclarationFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationFragment_FieldDeclaration() {
		return (EReference)variableDeclarationFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationFragment_VariableDeclarationStatement() {
		return (EReference)variableDeclarationFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationFragment_VariableDeclarationExpression() {
		return (EReference)variableDeclarationFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclarationStatement() {
		return variableDeclarationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclarationStatement_ExtraArrayDimensions() {
		return (EAttribute)variableDeclarationStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationStatement_Type() {
		return (EReference)variableDeclarationStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationStatement_Fragments() {
		return (EReference)variableDeclarationStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDeclarationStatement_Modifiers() {
		return (EReference)variableDeclarationStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileStatement() {
		return whileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileStatement_Expression() {
		return (EReference)whileStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileStatement_Body() {
		return (EReference)whileStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWildCardType() {
		return wildCardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWildCardType_IsUpperBound() {
		return (EAttribute)wildCardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWildCardType_Bound() {
		return (EReference)wildCardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInheritanceKind() {
		return inheritanceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java5Factory getJava5Factory() {
		return (Java5Factory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractTypeDeclarationEClass = createEClass(ABSTRACT_TYPE_DECLARATION);
		createEAttribute(abstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__QUALIFIED_NAME);
		createEReference(abstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__BODY_DECLARATIONS);
		createEReference(abstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__IMPORTS);
		createEReference(abstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__PACKAGE);
		createEReference(abstractTypeDeclarationEClass, ABSTRACT_TYPE_DECLARATION__SUPER_INTERFACES);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__TYPE);
		createEReference(annotationEClass, ANNOTATION__VALUES);

		annotationMemberValuePairEClass = createEClass(ANNOTATION_MEMBER_VALUE_PAIR);
		createEReference(annotationMemberValuePairEClass, ANNOTATION_MEMBER_VALUE_PAIR__MEMBER);
		createEReference(annotationMemberValuePairEClass, ANNOTATION_MEMBER_VALUE_PAIR__VALUE);

		annotationTypeDeclarationEClass = createEClass(ANNOTATION_TYPE_DECLARATION);

		annotationTypeMemberDeclarationEClass = createEClass(ANNOTATION_TYPE_MEMBER_DECLARATION);
		createEReference(annotationTypeMemberDeclarationEClass, ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT);
		createEReference(annotationTypeMemberDeclarationEClass, ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE);

		anonymousClassDeclarationEClass = createEClass(ANONYMOUS_CLASS_DECLARATION);
		createEReference(anonymousClassDeclarationEClass, ANONYMOUS_CLASS_DECLARATION__BODY_DECLARATIONS);
		createEReference(anonymousClassDeclarationEClass, ANONYMOUS_CLASS_DECLARATION__CLASS_INSTANCE_CREATION);

		arrayAccessEClass = createEClass(ARRAY_ACCESS);
		createEReference(arrayAccessEClass, ARRAY_ACCESS__ARRAY);
		createEReference(arrayAccessEClass, ARRAY_ACCESS__INDEX);

		arrayCreationEClass = createEClass(ARRAY_CREATION);
		createEReference(arrayCreationEClass, ARRAY_CREATION__DIMENSIONS);
		createEReference(arrayCreationEClass, ARRAY_CREATION__INITIALIZER);
		createEReference(arrayCreationEClass, ARRAY_CREATION__TYPE);

		arrayInitializerEClass = createEClass(ARRAY_INITIALIZER);
		createEReference(arrayInitializerEClass, ARRAY_INITIALIZER__EXPRESSIONS);

		arrayLengthAccessEClass = createEClass(ARRAY_LENGTH_ACCESS);
		createEReference(arrayLengthAccessEClass, ARRAY_LENGTH_ACCESS__ARRAY);

		arrayTypeEClass = createEClass(ARRAY_TYPE);
		createEAttribute(arrayTypeEClass, ARRAY_TYPE__DIMENSIONS);
		createEAttribute(arrayTypeEClass, ARRAY_TYPE__ORIGINAL_NAME);
		createEReference(arrayTypeEClass, ARRAY_TYPE__ELEMENT_TYPE);

		assertStatementEClass = createEClass(ASSERT_STATEMENT);
		createEReference(assertStatementEClass, ASSERT_STATEMENT__MESSAGE);
		createEReference(assertStatementEClass, ASSERT_STATEMENT__EXPRESSION);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__LEFT_HAND_SIDE);
		createEAttribute(assignmentEClass, ASSIGNMENT__OPERATOR);
		createEReference(assignmentEClass, ASSIGNMENT__RIGHT_HAND_SIDE);

		astNodeEClass = createEClass(AST_NODE);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__STATEMENTS);

		bodyDeclarationEClass = createEClass(BODY_DECLARATION);
		createEReference(bodyDeclarationEClass, BODY_DECLARATION__ABSTRACT_TYPE_DECLARATION);
		createEReference(bodyDeclarationEClass, BODY_DECLARATION__ANNOTATIONS);
		createEReference(bodyDeclarationEClass, BODY_DECLARATION__ANONYMOUS_CLASS_DECLARATION_OWNER);
		createEReference(bodyDeclarationEClass, BODY_DECLARATION__MODIFIERS);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

		breakStatementEClass = createEClass(BREAK_STATEMENT);
		createEReference(breakStatementEClass, BREAK_STATEMENT__LABEL);

		castExpressionEClass = createEClass(CAST_EXPRESSION);
		createEReference(castExpressionEClass, CAST_EXPRESSION__EXPRESSION);
		createEReference(castExpressionEClass, CAST_EXPRESSION__TYPE);

		catchClauseEClass = createEClass(CATCH_CLAUSE);
		createEReference(catchClauseEClass, CATCH_CLAUSE__EXCEPTION);
		createEReference(catchClauseEClass, CATCH_CLAUSE__BODY);

		characterLiteralEClass = createEClass(CHARACTER_LITERAL);
		createEAttribute(characterLiteralEClass, CHARACTER_LITERAL__ESCAPED_VALUE);
		createEAttribute(characterLiteralEClass, CHARACTER_LITERAL__VALUE);

		classDeclarationEClass = createEClass(CLASS_DECLARATION);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__SUPER_CLASS);

		classInstanceCreationEClass = createEClass(CLASS_INSTANCE_CREATION);
		createEReference(classInstanceCreationEClass, CLASS_INSTANCE_CREATION__ANONYMOUS_CLASS_DECLARATION);
		createEReference(classInstanceCreationEClass, CLASS_INSTANCE_CREATION__ARGUMENTS);
		createEReference(classInstanceCreationEClass, CLASS_INSTANCE_CREATION__EXPRESSION);
		createEReference(classInstanceCreationEClass, CLASS_INSTANCE_CREATION__METHOD);
		createEReference(classInstanceCreationEClass, CLASS_INSTANCE_CREATION__TYPE);

		compilationUnitEClass = createEClass(COMPILATION_UNIT);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__IMPORTS);
		createEAttribute(compilationUnitEClass, COMPILATION_UNIT__ORIGINAL_FILE_PATH);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__PACKAGE);
		createEReference(compilationUnitEClass, COMPILATION_UNIT__TYPES);

		conditionalExpressionEClass = createEClass(CONDITIONAL_EXPRESSION);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__ELSE_EXPRESSION);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__EXPRESSION);
		createEReference(conditionalExpressionEClass, CONDITIONAL_EXPRESSION__THEN_EXPRESSION);

		constructorInvocationEClass = createEClass(CONSTRUCTOR_INVOCATION);
		createEReference(constructorInvocationEClass, CONSTRUCTOR_INVOCATION__ARGUMENTS);
		createEReference(constructorInvocationEClass, CONSTRUCTOR_INVOCATION__METHOD);

		continueStatementEClass = createEClass(CONTINUE_STATEMENT);
		createEReference(continueStatementEClass, CONTINUE_STATEMENT__LABEL);

		doStatementEClass = createEClass(DO_STATEMENT);
		createEReference(doStatementEClass, DO_STATEMENT__EXPRESSION);
		createEReference(doStatementEClass, DO_STATEMENT__BODY);

		emptyStatementEClass = createEClass(EMPTY_STATEMENT);

		enumDeclarationEClass = createEClass(ENUM_DECLARATION);
		createEReference(enumDeclarationEClass, ENUM_DECLARATION__ENUM_CONSTANTS);

		enumConstantDeclarationEClass = createEClass(ENUM_CONSTANT_DECLARATION);
		createEReference(enumConstantDeclarationEClass, ENUM_CONSTANT_DECLARATION__ANONYMOUS_CLASS_DECLARATION);
		createEReference(enumConstantDeclarationEClass, ENUM_CONSTANT_DECLARATION__ARGUMENTS);

		enhancedForStatementEClass = createEClass(ENHANCED_FOR_STATEMENT);
		createEReference(enhancedForStatementEClass, ENHANCED_FOR_STATEMENT__BODY);
		createEReference(enhancedForStatementEClass, ENHANCED_FOR_STATEMENT__EXPRESSION);
		createEReference(enhancedForStatementEClass, ENHANCED_FOR_STATEMENT__PARAMETER);

		expressionEClass = createEClass(EXPRESSION);

		expressionStatementEClass = createEClass(EXPRESSION_STATEMENT);
		createEReference(expressionStatementEClass, EXPRESSION_STATEMENT__EXPRESSION);

		fieldAccessEClass = createEClass(FIELD_ACCESS);
		createEReference(fieldAccessEClass, FIELD_ACCESS__FIELD);
		createEReference(fieldAccessEClass, FIELD_ACCESS__EXPRESSION);

		fieldDeclarationEClass = createEClass(FIELD_DECLARATION);
		createEReference(fieldDeclarationEClass, FIELD_DECLARATION__TYPE);
		createEReference(fieldDeclarationEClass, FIELD_DECLARATION__FRAGMENTS);

		forStatementEClass = createEClass(FOR_STATEMENT);
		createEReference(forStatementEClass, FOR_STATEMENT__EXPRESSION);
		createEReference(forStatementEClass, FOR_STATEMENT__UPDATERS);
		createEReference(forStatementEClass, FOR_STATEMENT__INITIALIZERS);
		createEReference(forStatementEClass, FOR_STATEMENT__BODY);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__EXPRESSION);
		createEReference(ifStatementEClass, IF_STATEMENT__THEN_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__ELSE_STATEMENT);

		importDeclarationEClass = createEClass(IMPORT_DECLARATION);
		createEAttribute(importDeclarationEClass, IMPORT_DECLARATION__STATIC);
		createEReference(importDeclarationEClass, IMPORT_DECLARATION__IMPORTED_ELEMENT);

		infixExpressionEClass = createEClass(INFIX_EXPRESSION);
		createEAttribute(infixExpressionEClass, INFIX_EXPRESSION__OPERATOR);
		createEReference(infixExpressionEClass, INFIX_EXPRESSION__RIGHT_OPERAND);
		createEReference(infixExpressionEClass, INFIX_EXPRESSION__LEFT_OPERAND);
		createEReference(infixExpressionEClass, INFIX_EXPRESSION__EXTENDED_OPERANDS);

		initializerEClass = createEClass(INITIALIZER);
		createEReference(initializerEClass, INITIALIZER__BODY);

		instanceofExpressionEClass = createEClass(INSTANCEOF_EXPRESSION);
		createEReference(instanceofExpressionEClass, INSTANCEOF_EXPRESSION__RIGHT_OPERAND);
		createEReference(instanceofExpressionEClass, INSTANCEOF_EXPRESSION__LEFT_OPERAND);

		interfaceDeclarationEClass = createEClass(INTERFACE_DECLARATION);

		labeledStatementEClass = createEClass(LABELED_STATEMENT);
		createEReference(labeledStatementEClass, LABELED_STATEMENT__BODY);

		memberRefEClass = createEClass(MEMBER_REF);
		createEReference(memberRefEClass, MEMBER_REF__MEMBER);
		createEReference(memberRefEClass, MEMBER_REF__QUALIFIER);

		methodDeclarationEClass = createEClass(METHOD_DECLARATION);
		createEAttribute(methodDeclarationEClass, METHOD_DECLARATION__EXTRA_ARRAY_DIMENSIONS);
		createEAttribute(methodDeclarationEClass, METHOD_DECLARATION__CONSTRUCTOR);
		createEAttribute(methodDeclarationEClass, METHOD_DECLARATION__VARARGS);
		createEReference(methodDeclarationEClass, METHOD_DECLARATION__BODY);
		createEReference(methodDeclarationEClass, METHOD_DECLARATION__THROWN_EXCEPTIONS);
		createEReference(methodDeclarationEClass, METHOD_DECLARATION__RETURN_TYPE);
		createEReference(methodDeclarationEClass, METHOD_DECLARATION__TYPE_PARAMETERS);
		createEReference(methodDeclarationEClass, METHOD_DECLARATION__REDEFINED_METHOD_DECLARATION);
		createEReference(methodDeclarationEClass, METHOD_DECLARATION__REDEFINITIONS);
		createEReference(methodDeclarationEClass, METHOD_DECLARATION__PARAMETERS);

		methodInvocationEClass = createEClass(METHOD_INVOCATION);
		createEReference(methodInvocationEClass, METHOD_INVOCATION__METHOD);
		createEReference(methodInvocationEClass, METHOD_INVOCATION__ARGUMENTS);
		createEReference(methodInvocationEClass, METHOD_INVOCATION__EXPRESSION);

		methodRefEClass = createEClass(METHOD_REF);
		createEReference(methodRefEClass, METHOD_REF__METHOD);
		createEReference(methodRefEClass, METHOD_REF__QUALIFIER);
		createEReference(methodRefEClass, METHOD_REF__PARAMETERS);

		methodRefParameterEClass = createEClass(METHOD_REF_PARAMETER);
		createEAttribute(methodRefParameterEClass, METHOD_REF_PARAMETER__NAME);
		createEAttribute(methodRefParameterEClass, METHOD_REF_PARAMETER__IS_VARARGS);
		createEReference(methodRefParameterEClass, METHOD_REF_PARAMETER__TYPE);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__NAME);
		createEReference(modelEClass, MODEL__OWNED_ELEMENTS);
		createEReference(modelEClass, MODEL__ORPHAN_TYPES);
		createEReference(modelEClass, MODEL__UNRESOLVED_ITEMS);
		createEReference(modelEClass, MODEL__COMPILATION_UNITS);

		modifierEClass = createEClass(MODIFIER);
		createEAttribute(modifierEClass, MODIFIER__VISIBILITY);
		createEAttribute(modifierEClass, MODIFIER__INHERITANCE);
		createEAttribute(modifierEClass, MODIFIER__STATIC);
		createEAttribute(modifierEClass, MODIFIER__TRANSIENT);
		createEAttribute(modifierEClass, MODIFIER__VOLATILE);
		createEAttribute(modifierEClass, MODIFIER__NATIVE);
		createEAttribute(modifierEClass, MODIFIER__STRICTFP);
		createEAttribute(modifierEClass, MODIFIER__SYNCHRONIZED);
		createEReference(modifierEClass, MODIFIER__BODY_DECLARATION);
		createEReference(modifierEClass, MODIFIER__SINGLE_VARIABLE_DECLARATION);
		createEReference(modifierEClass, MODIFIER__VARIABLE_DECLARATION_STATEMENT);
		createEReference(modifierEClass, MODIFIER__VARIABLE_DECLARATION_EXPRESSION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__PROXY);

		namedElementRefEClass = createEClass(NAMED_ELEMENT_REF);
		createEReference(namedElementRefEClass, NAMED_ELEMENT_REF__QUALIFIER);
		createEReference(namedElementRefEClass, NAMED_ELEMENT_REF__ELEMENT);

		nullLiteralEClass = createEClass(NULL_LITERAL);

		numberLiteralEClass = createEClass(NUMBER_LITERAL);
		createEAttribute(numberLiteralEClass, NUMBER_LITERAL__TOKEN_VALUE);

		orphanTypeEClass = createEClass(ORPHAN_TYPE);

		packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
		createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__QUALIFIED_NAME);
		createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__OWNED_ELEMENTS);
		createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__OWNED_PACKAGES);

		parameterizedTypeEClass = createEClass(PARAMETERIZED_TYPE);
		createEReference(parameterizedTypeEClass, PARAMETERIZED_TYPE__TYPE);
		createEReference(parameterizedTypeEClass, PARAMETERIZED_TYPE__TYPE_ARGUMENTS);

		parenthesizedExpressionEClass = createEClass(PARENTHESIZED_EXPRESSION);
		createEReference(parenthesizedExpressionEClass, PARENTHESIZED_EXPRESSION__EXPRESSION);

		postfixExpressionEClass = createEClass(POSTFIX_EXPRESSION);
		createEAttribute(postfixExpressionEClass, POSTFIX_EXPRESSION__OPERATOR);
		createEReference(postfixExpressionEClass, POSTFIX_EXPRESSION__OPERAND);

		prefixExpressionEClass = createEClass(PREFIX_EXPRESSION);
		createEAttribute(prefixExpressionEClass, PREFIX_EXPRESSION__OPERATOR);
		createEReference(prefixExpressionEClass, PREFIX_EXPRESSION__OPERAND);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		primitiveTypeBooleanEClass = createEClass(PRIMITIVE_TYPE_BOOLEAN);

		primitiveTypeByteEClass = createEClass(PRIMITIVE_TYPE_BYTE);

		primitiveTypeCharEClass = createEClass(PRIMITIVE_TYPE_CHAR);

		primitiveTypeDoubleEClass = createEClass(PRIMITIVE_TYPE_DOUBLE);

		primitiveTypeShortEClass = createEClass(PRIMITIVE_TYPE_SHORT);

		primitiveTypeFloatEClass = createEClass(PRIMITIVE_TYPE_FLOAT);

		primitiveTypeIntEClass = createEClass(PRIMITIVE_TYPE_INT);

		primitiveTypeLongEClass = createEClass(PRIMITIVE_TYPE_LONG);

		primitiveTypeVoidEClass = createEClass(PRIMITIVE_TYPE_VOID);

		returnStatementEClass = createEClass(RETURN_STATEMENT);
		createEReference(returnStatementEClass, RETURN_STATEMENT__EXPRESSION);

		singleVariableDeclarationEClass = createEClass(SINGLE_VARIABLE_DECLARATION);
		createEReference(singleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__MODIFIERS);
		createEAttribute(singleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__VARARGS);
		createEReference(singleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__TYPE);
		createEReference(singleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION);
		createEReference(singleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__CATCH_CLAUSE);
		createEReference(singleVariableDeclarationEClass, SINGLE_VARIABLE_DECLARATION__ENHANCED_FOR_STATEMENT);

		statementEClass = createEClass(STATEMENT);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__ESCAPED_VALUE);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

		superConstructorInvocationEClass = createEClass(SUPER_CONSTRUCTOR_INVOCATION);
		createEReference(superConstructorInvocationEClass, SUPER_CONSTRUCTOR_INVOCATION__EXPRESSION);
		createEReference(superConstructorInvocationEClass, SUPER_CONSTRUCTOR_INVOCATION__ARGUMENTS);
		createEReference(superConstructorInvocationEClass, SUPER_CONSTRUCTOR_INVOCATION__METHOD);

		superFieldAccessEClass = createEClass(SUPER_FIELD_ACCESS);
		createEReference(superFieldAccessEClass, SUPER_FIELD_ACCESS__FIELD);
		createEReference(superFieldAccessEClass, SUPER_FIELD_ACCESS__QUALIFIER);

		superMethodInvocationEClass = createEClass(SUPER_METHOD_INVOCATION);
		createEReference(superMethodInvocationEClass, SUPER_METHOD_INVOCATION__ARGUMENTS);
		createEReference(superMethodInvocationEClass, SUPER_METHOD_INVOCATION__METHOD);
		createEReference(superMethodInvocationEClass, SUPER_METHOD_INVOCATION__QUALIFIER);

		switchCaseEClass = createEClass(SWITCH_CASE);
		createEAttribute(switchCaseEClass, SWITCH_CASE__DEFAULT);
		createEReference(switchCaseEClass, SWITCH_CASE__EXPRESSION);

		switchStatementEClass = createEClass(SWITCH_STATEMENT);
		createEReference(switchStatementEClass, SWITCH_STATEMENT__EXPRESSION);
		createEReference(switchStatementEClass, SWITCH_STATEMENT__STATEMENTS);

		synchronizedStatementEClass = createEClass(SYNCHRONIZED_STATEMENT);
		createEReference(synchronizedStatementEClass, SYNCHRONIZED_STATEMENT__BODY);
		createEReference(synchronizedStatementEClass, SYNCHRONIZED_STATEMENT__EXPRESSION);

		tagElementEClass = createEClass(TAG_ELEMENT);
		createEAttribute(tagElementEClass, TAG_ELEMENT__TAG_NAME);
		createEReference(tagElementEClass, TAG_ELEMENT__FRAGMENTS);

		textElementEClass = createEClass(TEXT_ELEMENT);
		createEAttribute(textElementEClass, TEXT_ELEMENT__TEXT);

		thisExpressionEClass = createEClass(THIS_EXPRESSION);
		createEReference(thisExpressionEClass, THIS_EXPRESSION__QUALIFIER);

		throwStatementEClass = createEClass(THROW_STATEMENT);
		createEReference(throwStatementEClass, THROW_STATEMENT__EXPRESSION);

		typeDeclarationEClass = createEClass(TYPE_DECLARATION);
		createEReference(typeDeclarationEClass, TYPE_DECLARATION__TYPE_PARAMETERS);

		typeDeclarationStatementEClass = createEClass(TYPE_DECLARATION_STATEMENT);
		createEReference(typeDeclarationStatementEClass, TYPE_DECLARATION_STATEMENT__DECLARATION);

		typeLiteralEClass = createEClass(TYPE_LITERAL);
		createEReference(typeLiteralEClass, TYPE_LITERAL__TYPE);

		typeParameterEClass = createEClass(TYPE_PARAMETER);
		createEReference(typeParameterEClass, TYPE_PARAMETER__BOUNDS);

		tryStatementEClass = createEClass(TRY_STATEMENT);
		createEReference(tryStatementEClass, TRY_STATEMENT__BODY);
		createEReference(tryStatementEClass, TRY_STATEMENT__FINALLY);
		createEReference(tryStatementEClass, TRY_STATEMENT__CATCH_CLAUSES);

		unresolvedItemEClass = createEClass(UNRESOLVED_ITEM);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__EXTRA_ARRAY_DIMENSIONS);
		createEReference(variableDeclarationEClass, VARIABLE_DECLARATION__INITIALIZER);

		variableDeclarationExpressionEClass = createEClass(VARIABLE_DECLARATION_EXPRESSION);
		createEReference(variableDeclarationExpressionEClass, VARIABLE_DECLARATION_EXPRESSION__TYPE);
		createEReference(variableDeclarationExpressionEClass, VARIABLE_DECLARATION_EXPRESSION__FRAGMENTS);
		createEReference(variableDeclarationExpressionEClass, VARIABLE_DECLARATION_EXPRESSION__MODIFIERS);

		variableDeclarationFragmentEClass = createEClass(VARIABLE_DECLARATION_FRAGMENT);
		createEReference(variableDeclarationFragmentEClass, VARIABLE_DECLARATION_FRAGMENT__FIELD_DECLARATION);
		createEReference(variableDeclarationFragmentEClass, VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_STATEMENT);
		createEReference(variableDeclarationFragmentEClass, VARIABLE_DECLARATION_FRAGMENT__VARIABLE_DECLARATION_EXPRESSION);

		variableDeclarationStatementEClass = createEClass(VARIABLE_DECLARATION_STATEMENT);
		createEAttribute(variableDeclarationStatementEClass, VARIABLE_DECLARATION_STATEMENT__EXTRA_ARRAY_DIMENSIONS);
		createEReference(variableDeclarationStatementEClass, VARIABLE_DECLARATION_STATEMENT__TYPE);
		createEReference(variableDeclarationStatementEClass, VARIABLE_DECLARATION_STATEMENT__FRAGMENTS);
		createEReference(variableDeclarationStatementEClass, VARIABLE_DECLARATION_STATEMENT__MODIFIERS);

		whileStatementEClass = createEClass(WHILE_STATEMENT);
		createEReference(whileStatementEClass, WHILE_STATEMENT__EXPRESSION);
		createEReference(whileStatementEClass, WHILE_STATEMENT__BODY);

		wildCardTypeEClass = createEClass(WILD_CARD_TYPE);
		createEAttribute(wildCardTypeEClass, WILD_CARD_TYPE__IS_UPPER_BOUND);
		createEReference(wildCardTypeEClass, WILD_CARD_TYPE__BOUND);

		// Create enums
		inheritanceKindEEnum = createEEnum(INHERITANCE_KIND);
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractTypeDeclarationEClass.getESuperTypes().add(this.getBodyDeclaration());
		annotationEClass.getESuperTypes().add(this.getExpression());
		annotationMemberValuePairEClass.getESuperTypes().add(this.getNamedElement());
		annotationTypeDeclarationEClass.getESuperTypes().add(this.getAbstractTypeDeclaration());
		annotationTypeMemberDeclarationEClass.getESuperTypes().add(this.getBodyDeclaration());
		anonymousClassDeclarationEClass.getESuperTypes().add(this.getASTNode());
		arrayAccessEClass.getESuperTypes().add(this.getExpression());
		arrayCreationEClass.getESuperTypes().add(this.getExpression());
		arrayInitializerEClass.getESuperTypes().add(this.getExpression());
		arrayLengthAccessEClass.getESuperTypes().add(this.getExpression());
		arrayTypeEClass.getESuperTypes().add(this.getOrphanType());
		assertStatementEClass.getESuperTypes().add(this.getStatement());
		assignmentEClass.getESuperTypes().add(this.getExpression());
		blockEClass.getESuperTypes().add(this.getStatement());
		bodyDeclarationEClass.getESuperTypes().add(this.getNamedElement());
		booleanLiteralEClass.getESuperTypes().add(this.getExpression());
		breakStatementEClass.getESuperTypes().add(this.getStatement());
		castExpressionEClass.getESuperTypes().add(this.getExpression());
		catchClauseEClass.getESuperTypes().add(this.getStatement());
		characterLiteralEClass.getESuperTypes().add(this.getExpression());
		classDeclarationEClass.getESuperTypes().add(this.getTypeDeclaration());
		classInstanceCreationEClass.getESuperTypes().add(this.getExpression());
		compilationUnitEClass.getESuperTypes().add(this.getNamedElement());
		conditionalExpressionEClass.getESuperTypes().add(this.getExpression());
		constructorInvocationEClass.getESuperTypes().add(this.getStatement());
		continueStatementEClass.getESuperTypes().add(this.getStatement());
		doStatementEClass.getESuperTypes().add(this.getStatement());
		emptyStatementEClass.getESuperTypes().add(this.getStatement());
		enumDeclarationEClass.getESuperTypes().add(this.getAbstractTypeDeclaration());
		enumConstantDeclarationEClass.getESuperTypes().add(this.getBodyDeclaration());
		enhancedForStatementEClass.getESuperTypes().add(this.getStatement());
		expressionEClass.getESuperTypes().add(this.getASTNode());
		expressionStatementEClass.getESuperTypes().add(this.getStatement());
		fieldAccessEClass.getESuperTypes().add(this.getExpression());
		fieldDeclarationEClass.getESuperTypes().add(this.getBodyDeclaration());
		forStatementEClass.getESuperTypes().add(this.getStatement());
		ifStatementEClass.getESuperTypes().add(this.getStatement());
		importDeclarationEClass.getESuperTypes().add(this.getASTNode());
		infixExpressionEClass.getESuperTypes().add(this.getExpression());
		initializerEClass.getESuperTypes().add(this.getBodyDeclaration());
		instanceofExpressionEClass.getESuperTypes().add(this.getExpression());
		interfaceDeclarationEClass.getESuperTypes().add(this.getTypeDeclaration());
		labeledStatementEClass.getESuperTypes().add(this.getNamedElement());
		labeledStatementEClass.getESuperTypes().add(this.getStatement());
		memberRefEClass.getESuperTypes().add(this.getASTNode());
		methodDeclarationEClass.getESuperTypes().add(this.getBodyDeclaration());
		methodInvocationEClass.getESuperTypes().add(this.getExpression());
		methodRefEClass.getESuperTypes().add(this.getASTNode());
		methodRefParameterEClass.getESuperTypes().add(this.getASTNode());
		modifierEClass.getESuperTypes().add(this.getASTNode());
		namedElementEClass.getESuperTypes().add(this.getASTNode());
		namedElementRefEClass.getESuperTypes().add(this.getExpression());
		nullLiteralEClass.getESuperTypes().add(this.getExpression());
		numberLiteralEClass.getESuperTypes().add(this.getExpression());
		orphanTypeEClass.getESuperTypes().add(this.getNamedElement());
		packageDeclarationEClass.getESuperTypes().add(this.getNamedElement());
		parameterizedTypeEClass.getESuperTypes().add(this.getOrphanType());
		parenthesizedExpressionEClass.getESuperTypes().add(this.getExpression());
		postfixExpressionEClass.getESuperTypes().add(this.getExpression());
		prefixExpressionEClass.getESuperTypes().add(this.getExpression());
		primitiveTypeEClass.getESuperTypes().add(this.getOrphanType());
		primitiveTypeBooleanEClass.getESuperTypes().add(this.getPrimitiveType());
		primitiveTypeByteEClass.getESuperTypes().add(this.getPrimitiveType());
		primitiveTypeCharEClass.getESuperTypes().add(this.getPrimitiveType());
		primitiveTypeDoubleEClass.getESuperTypes().add(this.getPrimitiveType());
		primitiveTypeShortEClass.getESuperTypes().add(this.getPrimitiveType());
		primitiveTypeFloatEClass.getESuperTypes().add(this.getPrimitiveType());
		primitiveTypeIntEClass.getESuperTypes().add(this.getPrimitiveType());
		primitiveTypeLongEClass.getESuperTypes().add(this.getPrimitiveType());
		primitiveTypeVoidEClass.getESuperTypes().add(this.getPrimitiveType());
		returnStatementEClass.getESuperTypes().add(this.getStatement());
		singleVariableDeclarationEClass.getESuperTypes().add(this.getVariableDeclaration());
		statementEClass.getESuperTypes().add(this.getASTNode());
		stringLiteralEClass.getESuperTypes().add(this.getExpression());
		superConstructorInvocationEClass.getESuperTypes().add(this.getStatement());
		superFieldAccessEClass.getESuperTypes().add(this.getExpression());
		superMethodInvocationEClass.getESuperTypes().add(this.getExpression());
		switchCaseEClass.getESuperTypes().add(this.getStatement());
		switchStatementEClass.getESuperTypes().add(this.getStatement());
		synchronizedStatementEClass.getESuperTypes().add(this.getStatement());
		tagElementEClass.getESuperTypes().add(this.getASTNode());
		textElementEClass.getESuperTypes().add(this.getASTNode());
		thisExpressionEClass.getESuperTypes().add(this.getExpression());
		throwStatementEClass.getESuperTypes().add(this.getStatement());
		typeDeclarationEClass.getESuperTypes().add(this.getAbstractTypeDeclaration());
		typeDeclarationStatementEClass.getESuperTypes().add(this.getStatement());
		typeLiteralEClass.getESuperTypes().add(this.getExpression());
		typeParameterEClass.getESuperTypes().add(this.getNamedElement());
		tryStatementEClass.getESuperTypes().add(this.getStatement());
		unresolvedItemEClass.getESuperTypes().add(this.getNamedElement());
		variableDeclarationEClass.getESuperTypes().add(this.getNamedElement());
		variableDeclarationExpressionEClass.getESuperTypes().add(this.getExpression());
		variableDeclarationFragmentEClass.getESuperTypes().add(this.getVariableDeclaration());
		variableDeclarationStatementEClass.getESuperTypes().add(this.getStatement());
		whileStatementEClass.getESuperTypes().add(this.getStatement());
		wildCardTypeEClass.getESuperTypes().add(this.getOrphanType());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractTypeDeclarationEClass, AbstractTypeDeclaration.class, "AbstractTypeDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTypeDeclaration_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, AbstractTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeDeclaration_BodyDeclarations(), this.getBodyDeclaration(), this.getBodyDeclaration_AbstractTypeDeclaration(), "bodyDeclarations", null, 0, -1, AbstractTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeDeclaration_Imports(), this.getImportDeclaration(), null, "imports", null, 0, -1, AbstractTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeDeclaration_Package(), this.getPackageDeclaration(), this.getPackageDeclaration_OwnedElements(), "package", null, 0, 1, AbstractTypeDeclaration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractTypeDeclaration_SuperInterfaces(), this.getNamedElementRef(), null, "superInterfaces", null, 0, -1, AbstractTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Values(), this.getAnnotationMemberValuePair(), null, "values", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationMemberValuePairEClass, AnnotationMemberValuePair.class, "AnnotationMemberValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationMemberValuePair_Member(), this.getNamedElementRef(), null, "member", null, 1, 1, AnnotationMemberValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationMemberValuePair_Value(), this.getExpression(), null, "value", null, 1, 1, AnnotationMemberValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationTypeDeclarationEClass, AnnotationTypeDeclaration.class, "AnnotationTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationTypeMemberDeclarationEClass, AnnotationTypeMemberDeclaration.class, "AnnotationTypeMemberDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationTypeMemberDeclaration_Default(), this.getExpression(), null, "default", null, 0, 1, AnnotationTypeMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationTypeMemberDeclaration_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, AnnotationTypeMemberDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anonymousClassDeclarationEClass, AnonymousClassDeclaration.class, "AnonymousClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnonymousClassDeclaration_BodyDeclarations(), this.getBodyDeclaration(), this.getBodyDeclaration_AnonymousClassDeclarationOwner(), "bodyDeclarations", null, 0, -1, AnonymousClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnonymousClassDeclaration_ClassInstanceCreation(), this.getClassInstanceCreation(), this.getClassInstanceCreation_AnonymousClassDeclaration(), "classInstanceCreation", null, 0, 1, AnonymousClassDeclaration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayAccessEClass, ArrayAccess.class, "ArrayAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayAccess_Array(), this.getExpression(), null, "array", null, 1, 1, ArrayAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayAccess_Index(), this.getExpression(), null, "index", null, 1, 1, ArrayAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayCreationEClass, ArrayCreation.class, "ArrayCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayCreation_Dimensions(), this.getExpression(), null, "dimensions", null, 0, -1, ArrayCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayCreation_Initializer(), this.getArrayInitializer(), null, "initializer", null, 0, 1, ArrayCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayCreation_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, ArrayCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayInitializerEClass, ArrayInitializer.class, "ArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayInitializer_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayLengthAccessEClass, ArrayLengthAccess.class, "ArrayLengthAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayLengthAccess_Array(), this.getExpression(), null, "array", null, 1, 1, ArrayLengthAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayType_Dimensions(), ecorePackage.getEInt(), "dimensions", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArrayType_OriginalName(), ecorePackage.getEString(), "originalName", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getArrayType_ElementType(), this.getNamedElementRef(), null, "elementType", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertStatementEClass, AssertStatement.class, "AssertStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertStatement_Message(), this.getExpression(), null, "message", null, 0, 1, AssertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1, AssertStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_LeftHandSide(), this.getExpression(), null, "leftHandSide", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignment_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_RightHandSide(), this.getExpression(), null, "rightHandSide", null, 1, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(astNodeEClass, ASTNode.class, "ASTNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyDeclarationEClass, BodyDeclaration.class, "BodyDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyDeclaration_AbstractTypeDeclaration(), this.getAbstractTypeDeclaration(), this.getAbstractTypeDeclaration_BodyDeclarations(), "abstractTypeDeclaration", null, 0, 1, BodyDeclaration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBodyDeclaration_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, BodyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBodyDeclaration_AnonymousClassDeclarationOwner(), this.getAnonymousClassDeclaration(), this.getAnonymousClassDeclaration_BodyDeclarations(), "anonymousClassDeclarationOwner", null, 0, 1, BodyDeclaration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBodyDeclaration_Modifiers(), this.getModifier(), this.getModifier_BodyDeclaration(), "modifiers", null, 0, -1, BodyDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakStatementEClass, BreakStatement.class, "BreakStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBreakStatement_Label(), this.getNamedElementRef(), null, "label", null, 0, 1, BreakStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(castExpressionEClass, CastExpression.class, "CastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCastExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCastExpression_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catchClauseEClass, CatchClause.class, "CatchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatchClause_Exception(), this.getSingleVariableDeclaration(), this.getSingleVariableDeclaration_CatchClause(), "exception", null, 1, 1, CatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatchClause_Body(), this.getBlock(), null, "body", null, 1, 1, CatchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterLiteralEClass, CharacterLiteral.class, "CharacterLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterLiteral_EscapedValue(), ecorePackage.getEString(), "escapedValue", null, 0, 1, CharacterLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterLiteral_Value(), ecorePackage.getEChar(), "value", null, 0, 1, CharacterLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDeclaration_SuperClass(), this.getNamedElementRef(), null, "superClass", null, 0, 1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classInstanceCreationEClass, ClassInstanceCreation.class, "ClassInstanceCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassInstanceCreation_AnonymousClassDeclaration(), this.getAnonymousClassDeclaration(), this.getAnonymousClassDeclaration_ClassInstanceCreation(), "anonymousClassDeclaration", null, 0, 1, ClassInstanceCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassInstanceCreation_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, ClassInstanceCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassInstanceCreation_Expression(), this.getExpression(), null, "expression", null, 0, 1, ClassInstanceCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassInstanceCreation_Method(), this.getNamedElementRef(), null, "method", null, 1, 1, ClassInstanceCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassInstanceCreation_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, ClassInstanceCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompilationUnit_Imports(), this.getImportDeclaration(), null, "imports", null, 0, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompilationUnit_OriginalFilePath(), ecorePackage.getEString(), "originalFilePath", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompilationUnit_Package(), this.getPackageDeclaration(), null, "package", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompilationUnit_Types(), this.getAbstractTypeDeclaration(), null, "types", null, 0, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalExpressionEClass, ConditionalExpression.class, "ConditionalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalExpression_ElseExpression(), this.getExpression(), null, "elseExpression", null, 1, 1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalExpression_ThenExpression(), this.getExpression(), null, "thenExpression", null, 1, 1, ConditionalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorInvocationEClass, ConstructorInvocation.class, "ConstructorInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstructorInvocation_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, ConstructorInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorInvocation_Method(), this.getNamedElementRef(), null, "method", null, 1, 1, ConstructorInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continueStatementEClass, ContinueStatement.class, "ContinueStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContinueStatement_Label(), this.getNamedElementRef(), null, "label", null, 0, 1, ContinueStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doStatementEClass, DoStatement.class, "DoStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1, DoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoStatement_Body(), this.getStatement(), null, "body", null, 1, 1, DoStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyStatementEClass, EmptyStatement.class, "EmptyStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumDeclarationEClass, EnumDeclaration.class, "EnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumDeclaration_EnumConstants(), this.getEnumConstantDeclaration(), null, "enumConstants", null, 0, -1, EnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumConstantDeclarationEClass, EnumConstantDeclaration.class, "EnumConstantDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumConstantDeclaration_AnonymousClassDeclaration(), this.getAnonymousClassDeclaration(), null, "anonymousClassDeclaration", null, 0, 1, EnumConstantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumConstantDeclaration_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, EnumConstantDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enhancedForStatementEClass, EnhancedForStatement.class, "EnhancedForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnhancedForStatement_Body(), this.getStatement(), null, "body", null, 1, 1, EnhancedForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnhancedForStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1, EnhancedForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnhancedForStatement_Parameter(), this.getSingleVariableDeclaration(), this.getSingleVariableDeclaration_EnhancedForStatement(), "parameter", null, 1, 1, EnhancedForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionStatementEClass, ExpressionStatement.class, "ExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1, ExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldAccessEClass, FieldAccess.class, "FieldAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldAccess_Field(), this.getNamedElementRef(), null, "field", null, 1, 1, FieldAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldAccess_Expression(), this.getExpression(), null, "expression", null, 1, 1, FieldAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldDeclarationEClass, FieldDeclaration.class, "FieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldDeclaration_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, FieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldDeclaration_Fragments(), this.getVariableDeclarationFragment(), this.getVariableDeclarationFragment_FieldDeclaration(), "fragments", null, 0, -1, FieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForStatement_Updaters(), this.getExpression(), null, "updaters", null, 0, -1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForStatement_Initializers(), this.getExpression(), null, "initializers", null, 0, -1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForStatement_Body(), this.getStatement(), null, "body", null, 1, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ThenStatement(), this.getStatement(), null, "thenStatement", null, 1, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_ElseStatement(), this.getStatement(), null, "elseStatement", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importDeclarationEClass, ImportDeclaration.class, "ImportDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportDeclaration_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, ImportDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportDeclaration_ImportedElement(), this.getNamedElementRef(), null, "importedElement", null, 1, 1, ImportDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infixExpressionEClass, InfixExpression.class, "InfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfixExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, InfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfixExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 1, 1, InfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfixExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 1, 1, InfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfixExpression_ExtendedOperands(), this.getExpression(), null, "extendedOperands", null, 0, -1, InfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initializerEClass, Initializer.class, "Initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitializer_Body(), this.getBlock(), null, "body", null, 1, 1, Initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceofExpressionEClass, InstanceofExpression.class, "InstanceofExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceofExpression_RightOperand(), this.getNamedElementRef(), null, "rightOperand", null, 1, 1, InstanceofExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceofExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 1, 1, InstanceofExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDeclarationEClass, InterfaceDeclaration.class, "InterfaceDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labeledStatementEClass, LabeledStatement.class, "LabeledStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabeledStatement_Body(), this.getStatement(), null, "body", null, 1, 1, LabeledStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberRefEClass, MemberRef.class, "MemberRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberRef_Member(), this.getNamedElementRef(), null, "member", null, 1, 1, MemberRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemberRef_Qualifier(), this.getNamedElementRef(), null, "qualifier", null, 0, 1, MemberRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodDeclarationEClass, MethodDeclaration.class, "MethodDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodDeclaration_ExtraArrayDimensions(), ecorePackage.getEInt(), "extraArrayDimensions", null, 0, 1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeclaration_Constructor(), ecorePackage.getEBoolean(), "constructor", null, 0, 1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodDeclaration_Varargs(), ecorePackage.getEBoolean(), "varargs", null, 0, 1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodDeclaration_Body(), this.getBlock(), null, "body", null, 0, 1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodDeclaration_ThrownExceptions(), this.getNamedElementRef(), null, "thrownExceptions", null, 0, -1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodDeclaration_ReturnType(), this.getNamedElementRef(), null, "returnType", null, 1, 1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodDeclaration_TypeParameters(), this.getTypeParameter(), null, "typeParameters", null, 0, -1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodDeclaration_RedefinedMethodDeclaration(), this.getMethodDeclaration(), this.getMethodDeclaration_Redefinitions(), "redefinedMethodDeclaration", null, 0, 1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodDeclaration_Redefinitions(), this.getMethodDeclaration(), this.getMethodDeclaration_RedefinedMethodDeclaration(), "redefinitions", null, 0, -1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodDeclaration_Parameters(), this.getSingleVariableDeclaration(), this.getSingleVariableDeclaration_MethodDeclaration(), "parameters", null, 0, -1, MethodDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodInvocationEClass, MethodInvocation.class, "MethodInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodInvocation_Method(), this.getNamedElementRef(), null, "method", null, 1, 1, MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodInvocation_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodInvocation_Expression(), this.getExpression(), null, "expression", null, 0, 1, MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodRefEClass, MethodRef.class, "MethodRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethodRef_Method(), this.getNamedElementRef(), null, "method", null, 1, 1, MethodRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodRef_Qualifier(), this.getNamedElementRef(), null, "qualifier", null, 0, 1, MethodRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodRef_Parameters(), this.getMethodRefParameter(), null, "parameters", null, 0, -1, MethodRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodRefParameterEClass, MethodRefParameter.class, "MethodRefParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodRefParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodRefParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodRefParameter_IsVarargs(), ecorePackage.getEBooleanObject(), "isVarargs", null, 0, 1, MethodRefParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodRefParameter_Type(), this.getNamedElementRef(), null, "type", null, 0, 1, MethodRefParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_OwnedElements(), this.getPackageDeclaration(), null, "ownedElements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_OrphanTypes(), this.getOrphanType(), null, "orphanTypes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_UnresolvedItems(), this.getUnresolvedItem(), null, "unresolvedItems", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_CompilationUnits(), this.getCompilationUnit(), null, "compilationUnits", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifierEClass, Modifier.class, "Modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifier_Visibility(), ecorePackage.getEString(), "visibility", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Inheritance(), ecorePackage.getEString(), "inheritance", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Static(), ecorePackage.getEBoolean(), "static", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Volatile(), ecorePackage.getEBoolean(), "volatile", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Native(), ecorePackage.getEBoolean(), "native", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Strictfp(), ecorePackage.getEBoolean(), "strictfp", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Synchronized(), ecorePackage.getEBoolean(), "synchronized", null, 0, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifier_BodyDeclaration(), this.getBodyDeclaration(), this.getBodyDeclaration_Modifiers(), "BodyDeclaration", null, 0, 1, Modifier.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifier_SingleVariableDeclaration(), this.getSingleVariableDeclaration(), this.getSingleVariableDeclaration_Modifiers(), "SingleVariableDeclaration", null, 0, 1, Modifier.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifier_VariableDeclarationStatement(), this.getVariableDeclarationStatement(), this.getVariableDeclarationStatement_Modifiers(), "VariableDeclarationStatement", null, 0, 1, Modifier.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifier_VariableDeclarationExpression(), this.getVariableDeclarationExpression(), this.getVariableDeclarationExpression_Modifiers(), "VariableDeclarationExpression", null, 0, 1, Modifier.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Proxy(), ecorePackage.getEBoolean(), "proxy", "false", 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementRefEClass, NamedElementRef.class, "NamedElementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedElementRef_Qualifier(), this.getNamedElementRef(), null, "qualifier", null, 0, 1, NamedElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElementRef_Element(), this.getNamedElement(), null, "element", null, 0, 1, NamedElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberLiteral_TokenValue(), ecorePackage.getEString(), "tokenValue", null, 0, 1, NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orphanTypeEClass, OrphanType.class, "OrphanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageDeclaration_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPackageDeclaration_OwnedElements(), this.getAbstractTypeDeclaration(), this.getAbstractTypeDeclaration_Package(), "ownedElements", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageDeclaration_OwnedPackages(), this.getPackageDeclaration(), null, "ownedPackages", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterizedTypeEClass, ParameterizedType.class, "ParameterizedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedType_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterizedType_TypeArguments(), this.getNamedElementRef(), null, "typeArguments", null, 0, -1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parenthesizedExpressionEClass, ParenthesizedExpression.class, "ParenthesizedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParenthesizedExpression_Expression(), this.getExpression(), null, "expression", null, 1, 1, ParenthesizedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postfixExpressionEClass, PostfixExpression.class, "PostfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostfixExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, PostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPostfixExpression_Operand(), this.getExpression(), null, "operand", null, 1, 1, PostfixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prefixExpressionEClass, PrefixExpression.class, "PrefixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrefixExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, PrefixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrefixExpression_Operand(), this.getExpression(), null, "operand", null, 1, 1, PrefixExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeBooleanEClass, PrimitiveTypeBoolean.class, "PrimitiveTypeBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeByteEClass, PrimitiveTypeByte.class, "PrimitiveTypeByte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeCharEClass, PrimitiveTypeChar.class, "PrimitiveTypeChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeDoubleEClass, PrimitiveTypeDouble.class, "PrimitiveTypeDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeShortEClass, PrimitiveTypeShort.class, "PrimitiveTypeShort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeFloatEClass, PrimitiveTypeFloat.class, "PrimitiveTypeFloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeIntEClass, PrimitiveTypeInt.class, "PrimitiveTypeInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeLongEClass, PrimitiveTypeLong.class, "PrimitiveTypeLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeVoidEClass, PrimitiveTypeVoid.class, "PrimitiveTypeVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleVariableDeclarationEClass, SingleVariableDeclaration.class, "SingleVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleVariableDeclaration_Modifiers(), this.getModifier(), this.getModifier_SingleVariableDeclaration(), "modifiers", null, 0, -1, SingleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleVariableDeclaration_Varargs(), ecorePackage.getEBoolean(), "varargs", null, 0, 1, SingleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleVariableDeclaration_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, SingleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleVariableDeclaration_MethodDeclaration(), this.getMethodDeclaration(), this.getMethodDeclaration_Parameters(), "methodDeclaration", null, 0, 1, SingleVariableDeclaration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleVariableDeclaration_CatchClause(), this.getCatchClause(), this.getCatchClause_Exception(), "catchClause", null, 0, 1, SingleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleVariableDeclaration_EnhancedForStatement(), this.getEnhancedForStatement(), this.getEnhancedForStatement_Parameter(), "enhancedForStatement", null, 0, 1, SingleVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_EscapedValue(), ecorePackage.getEString(), "escapedValue", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superConstructorInvocationEClass, SuperConstructorInvocation.class, "SuperConstructorInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperConstructorInvocation_Expression(), this.getExpression(), null, "expression", null, 0, 1, SuperConstructorInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperConstructorInvocation_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, SuperConstructorInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperConstructorInvocation_Method(), this.getNamedElementRef(), null, "method", null, 1, 1, SuperConstructorInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superFieldAccessEClass, SuperFieldAccess.class, "SuperFieldAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperFieldAccess_Field(), this.getNamedElementRef(), null, "field", null, 1, 1, SuperFieldAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperFieldAccess_Qualifier(), this.getNamedElementRef(), null, "qualifier", null, 0, 1, SuperFieldAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(superMethodInvocationEClass, SuperMethodInvocation.class, "SuperMethodInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuperMethodInvocation_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, SuperMethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperMethodInvocation_Method(), this.getNamedElementRef(), null, "method", null, 1, 1, SuperMethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuperMethodInvocation_Qualifier(), this.getNamedElementRef(), null, "qualifier", null, 0, 1, SuperMethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchCaseEClass, SwitchCase.class, "SwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchCase_Default(), ecorePackage.getEBoolean(), "default", null, 0, 1, SwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchCase_Expression(), this.getExpression(), null, "expression", null, 0, 1, SwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchStatementEClass, SwitchStatement.class, "SwitchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchStatement_Statements(), this.getStatement(), null, "statements", null, 0, -1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchronizedStatementEClass, SynchronizedStatement.class, "SynchronizedStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSynchronizedStatement_Body(), this.getBlock(), null, "body", null, 1, 1, SynchronizedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchronizedStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1, SynchronizedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagElementEClass, TagElement.class, "TagElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagElement_TagName(), ecorePackage.getEString(), "tagName", null, 0, 1, TagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagElement_Fragments(), this.getASTNode(), null, "fragments", null, 0, -1, TagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textElementEClass, TextElement.class, "TextElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextElement_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thisExpressionEClass, ThisExpression.class, "ThisExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThisExpression_Qualifier(), this.getNamedElementRef(), null, "qualifier", null, 0, 1, ThisExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throwStatementEClass, ThrowStatement.class, "ThrowStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThrowStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1, ThrowStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDeclaration_TypeParameters(), this.getTypeParameter(), null, "typeParameters", null, 0, -1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDeclarationStatementEClass, TypeDeclarationStatement.class, "TypeDeclarationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDeclarationStatement_Declaration(), this.getAbstractTypeDeclaration(), null, "declaration", null, 1, 1, TypeDeclarationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeLiteralEClass, TypeLiteral.class, "TypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeLiteral_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, TypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeParameterEClass, TypeParameter.class, "TypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeParameter_Bounds(), this.getNamedElementRef(), null, "bounds", null, 0, -1, TypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tryStatementEClass, TryStatement.class, "TryStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTryStatement_Body(), this.getBlock(), null, "body", null, 1, 1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTryStatement_Finally(), this.getBlock(), null, "finally", null, 0, 1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTryStatement_CatchClauses(), this.getCatchClause(), null, "catchClauses", null, 0, -1, TryStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unresolvedItemEClass, UnresolvedItem.class, "UnresolvedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableDeclaration_ExtraArrayDimensions(), ecorePackage.getEInt(), "extraArrayDimensions", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclaration_Initializer(), this.getExpression(), null, "initializer", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationExpressionEClass, VariableDeclarationExpression.class, "VariableDeclarationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDeclarationExpression_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, VariableDeclarationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclarationExpression_Fragments(), this.getVariableDeclarationFragment(), this.getVariableDeclarationFragment_VariableDeclarationExpression(), "fragments", null, 0, -1, VariableDeclarationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclarationExpression_Modifiers(), this.getModifier(), this.getModifier_VariableDeclarationExpression(), "modifiers", null, 0, -1, VariableDeclarationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationFragmentEClass, VariableDeclarationFragment.class, "VariableDeclarationFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDeclarationFragment_FieldDeclaration(), this.getFieldDeclaration(), this.getFieldDeclaration_Fragments(), "fieldDeclaration", null, 0, 1, VariableDeclarationFragment.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclarationFragment_VariableDeclarationStatement(), this.getVariableDeclarationStatement(), this.getVariableDeclarationStatement_Fragments(), "variableDeclarationStatement", null, 0, 1, VariableDeclarationFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclarationFragment_VariableDeclarationExpression(), this.getVariableDeclarationExpression(), this.getVariableDeclarationExpression_Fragments(), "variableDeclarationExpression", null, 0, 1, VariableDeclarationFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationStatementEClass, VariableDeclarationStatement.class, "VariableDeclarationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableDeclarationStatement_ExtraArrayDimensions(), ecorePackage.getEInt(), "extraArrayDimensions", null, 0, 1, VariableDeclarationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclarationStatement_Type(), this.getNamedElementRef(), null, "type", null, 1, 1, VariableDeclarationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclarationStatement_Fragments(), this.getVariableDeclarationFragment(), this.getVariableDeclarationFragment_VariableDeclarationStatement(), "fragments", null, 0, -1, VariableDeclarationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDeclarationStatement_Modifiers(), this.getModifier(), this.getModifier_VariableDeclarationStatement(), "modifiers", null, 0, -1, VariableDeclarationStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileStatement_Expression(), this.getExpression(), null, "expression", null, 1, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileStatement_Body(), this.getStatement(), null, "body", null, 1, 1, WhileStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wildCardTypeEClass, WildCardType.class, "WildCardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWildCardType_IsUpperBound(), ecorePackage.getEBooleanObject(), "isUpperBound", null, 0, 1, WildCardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWildCardType_Bound(), this.getNamedElementRef(), null, "bound", null, 0, 1, WildCardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(inheritanceKindEEnum, InheritanceKind.class, "InheritanceKind");
		addEEnumLiteral(inheritanceKindEEnum, InheritanceKind.ABSTRACT);
		addEEnumLiteral(inheritanceKindEEnum, InheritanceKind.FINAL);

		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.NONE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);

		// Create resource
		createResource(eNS_URI);
	}

} //Java5PackageImpl
