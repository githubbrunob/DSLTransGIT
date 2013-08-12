/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.impl;

import Java5.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Java5FactoryImpl extends EFactoryImpl implements Java5Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Java5Factory init() {
		try {
			Java5Factory theJava5Factory = (Java5Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/Java5"); 
			if (theJava5Factory != null) {
				return theJava5Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Java5FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java5FactoryImpl() {
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
			case Java5Package.ANNOTATION: return createAnnotation();
			case Java5Package.ANNOTATION_MEMBER_VALUE_PAIR: return createAnnotationMemberValuePair();
			case Java5Package.ANNOTATION_TYPE_DECLARATION: return createAnnotationTypeDeclaration();
			case Java5Package.ANNOTATION_TYPE_MEMBER_DECLARATION: return createAnnotationTypeMemberDeclaration();
			case Java5Package.ANONYMOUS_CLASS_DECLARATION: return createAnonymousClassDeclaration();
			case Java5Package.ARRAY_ACCESS: return createArrayAccess();
			case Java5Package.ARRAY_CREATION: return createArrayCreation();
			case Java5Package.ARRAY_INITIALIZER: return createArrayInitializer();
			case Java5Package.ARRAY_LENGTH_ACCESS: return createArrayLengthAccess();
			case Java5Package.ARRAY_TYPE: return createArrayType();
			case Java5Package.ASSERT_STATEMENT: return createAssertStatement();
			case Java5Package.ASSIGNMENT: return createAssignment();
			case Java5Package.BLOCK: return createBlock();
			case Java5Package.BOOLEAN_LITERAL: return createBooleanLiteral();
			case Java5Package.BREAK_STATEMENT: return createBreakStatement();
			case Java5Package.CAST_EXPRESSION: return createCastExpression();
			case Java5Package.CATCH_CLAUSE: return createCatchClause();
			case Java5Package.CHARACTER_LITERAL: return createCharacterLiteral();
			case Java5Package.CLASS_DECLARATION: return createClassDeclaration();
			case Java5Package.CLASS_INSTANCE_CREATION: return createClassInstanceCreation();
			case Java5Package.COMPILATION_UNIT: return createCompilationUnit();
			case Java5Package.CONDITIONAL_EXPRESSION: return createConditionalExpression();
			case Java5Package.CONSTRUCTOR_INVOCATION: return createConstructorInvocation();
			case Java5Package.CONTINUE_STATEMENT: return createContinueStatement();
			case Java5Package.DO_STATEMENT: return createDoStatement();
			case Java5Package.EMPTY_STATEMENT: return createEmptyStatement();
			case Java5Package.ENUM_DECLARATION: return createEnumDeclaration();
			case Java5Package.ENUM_CONSTANT_DECLARATION: return createEnumConstantDeclaration();
			case Java5Package.ENHANCED_FOR_STATEMENT: return createEnhancedForStatement();
			case Java5Package.EXPRESSION_STATEMENT: return createExpressionStatement();
			case Java5Package.FIELD_ACCESS: return createFieldAccess();
			case Java5Package.FIELD_DECLARATION: return createFieldDeclaration();
			case Java5Package.FOR_STATEMENT: return createForStatement();
			case Java5Package.IF_STATEMENT: return createIfStatement();
			case Java5Package.IMPORT_DECLARATION: return createImportDeclaration();
			case Java5Package.INFIX_EXPRESSION: return createInfixExpression();
			case Java5Package.INITIALIZER: return createInitializer();
			case Java5Package.INSTANCEOF_EXPRESSION: return createInstanceofExpression();
			case Java5Package.INTERFACE_DECLARATION: return createInterfaceDeclaration();
			case Java5Package.LABELED_STATEMENT: return createLabeledStatement();
			case Java5Package.MEMBER_REF: return createMemberRef();
			case Java5Package.METHOD_DECLARATION: return createMethodDeclaration();
			case Java5Package.METHOD_INVOCATION: return createMethodInvocation();
			case Java5Package.METHOD_REF: return createMethodRef();
			case Java5Package.METHOD_REF_PARAMETER: return createMethodRefParameter();
			case Java5Package.MODEL: return createModel();
			case Java5Package.MODIFIER: return createModifier();
			case Java5Package.NAMED_ELEMENT_REF: return createNamedElementRef();
			case Java5Package.NULL_LITERAL: return createNullLiteral();
			case Java5Package.NUMBER_LITERAL: return createNumberLiteral();
			case Java5Package.ORPHAN_TYPE: return createOrphanType();
			case Java5Package.PACKAGE_DECLARATION: return createPackageDeclaration();
			case Java5Package.PARAMETERIZED_TYPE: return createParameterizedType();
			case Java5Package.PARENTHESIZED_EXPRESSION: return createParenthesizedExpression();
			case Java5Package.POSTFIX_EXPRESSION: return createPostfixExpression();
			case Java5Package.PREFIX_EXPRESSION: return createPrefixExpression();
			case Java5Package.PRIMITIVE_TYPE: return createPrimitiveType();
			case Java5Package.PRIMITIVE_TYPE_BOOLEAN: return createPrimitiveTypeBoolean();
			case Java5Package.PRIMITIVE_TYPE_BYTE: return createPrimitiveTypeByte();
			case Java5Package.PRIMITIVE_TYPE_CHAR: return createPrimitiveTypeChar();
			case Java5Package.PRIMITIVE_TYPE_DOUBLE: return createPrimitiveTypeDouble();
			case Java5Package.PRIMITIVE_TYPE_SHORT: return createPrimitiveTypeShort();
			case Java5Package.PRIMITIVE_TYPE_FLOAT: return createPrimitiveTypeFloat();
			case Java5Package.PRIMITIVE_TYPE_INT: return createPrimitiveTypeInt();
			case Java5Package.PRIMITIVE_TYPE_LONG: return createPrimitiveTypeLong();
			case Java5Package.PRIMITIVE_TYPE_VOID: return createPrimitiveTypeVoid();
			case Java5Package.RETURN_STATEMENT: return createReturnStatement();
			case Java5Package.SINGLE_VARIABLE_DECLARATION: return createSingleVariableDeclaration();
			case Java5Package.STRING_LITERAL: return createStringLiteral();
			case Java5Package.SUPER_CONSTRUCTOR_INVOCATION: return createSuperConstructorInvocation();
			case Java5Package.SUPER_FIELD_ACCESS: return createSuperFieldAccess();
			case Java5Package.SUPER_METHOD_INVOCATION: return createSuperMethodInvocation();
			case Java5Package.SWITCH_CASE: return createSwitchCase();
			case Java5Package.SWITCH_STATEMENT: return createSwitchStatement();
			case Java5Package.SYNCHRONIZED_STATEMENT: return createSynchronizedStatement();
			case Java5Package.TAG_ELEMENT: return createTagElement();
			case Java5Package.TEXT_ELEMENT: return createTextElement();
			case Java5Package.THIS_EXPRESSION: return createThisExpression();
			case Java5Package.THROW_STATEMENT: return createThrowStatement();
			case Java5Package.TYPE_DECLARATION_STATEMENT: return createTypeDeclarationStatement();
			case Java5Package.TYPE_LITERAL: return createTypeLiteral();
			case Java5Package.TYPE_PARAMETER: return createTypeParameter();
			case Java5Package.TRY_STATEMENT: return createTryStatement();
			case Java5Package.UNRESOLVED_ITEM: return createUnresolvedItem();
			case Java5Package.VARIABLE_DECLARATION_EXPRESSION: return createVariableDeclarationExpression();
			case Java5Package.VARIABLE_DECLARATION_FRAGMENT: return createVariableDeclarationFragment();
			case Java5Package.VARIABLE_DECLARATION_STATEMENT: return createVariableDeclarationStatement();
			case Java5Package.WHILE_STATEMENT: return createWhileStatement();
			case Java5Package.WILD_CARD_TYPE: return createWildCardType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Java5Package.INHERITANCE_KIND:
				return createInheritanceKindFromString(eDataType, initialValue);
			case Java5Package.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Java5Package.INHERITANCE_KIND:
				return convertInheritanceKindToString(eDataType, instanceValue);
			case Java5Package.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationMemberValuePair createAnnotationMemberValuePair() {
		AnnotationMemberValuePairImpl annotationMemberValuePair = new AnnotationMemberValuePairImpl();
		return annotationMemberValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTypeDeclaration createAnnotationTypeDeclaration() {
		AnnotationTypeDeclarationImpl annotationTypeDeclaration = new AnnotationTypeDeclarationImpl();
		return annotationTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationTypeMemberDeclaration createAnnotationTypeMemberDeclaration() {
		AnnotationTypeMemberDeclarationImpl annotationTypeMemberDeclaration = new AnnotationTypeMemberDeclarationImpl();
		return annotationTypeMemberDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration createAnonymousClassDeclaration() {
		AnonymousClassDeclarationImpl anonymousClassDeclaration = new AnonymousClassDeclarationImpl();
		return anonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayAccess createArrayAccess() {
		ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
		return arrayAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayCreation createArrayCreation() {
		ArrayCreationImpl arrayCreation = new ArrayCreationImpl();
		return arrayCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer createArrayInitializer() {
		ArrayInitializerImpl arrayInitializer = new ArrayInitializerImpl();
		return arrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayLengthAccess createArrayLengthAccess() {
		ArrayLengthAccessImpl arrayLengthAccess = new ArrayLengthAccessImpl();
		return arrayLengthAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertStatement createAssertStatement() {
		AssertStatementImpl assertStatement = new AssertStatementImpl();
		return assertStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakStatement createBreakStatement() {
		BreakStatementImpl breakStatement = new BreakStatementImpl();
		return breakStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastExpression createCastExpression() {
		CastExpressionImpl castExpression = new CastExpressionImpl();
		return castExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchClause createCatchClause() {
		CatchClauseImpl catchClause = new CatchClauseImpl();
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterLiteral createCharacterLiteral() {
		CharacterLiteralImpl characterLiteral = new CharacterLiteralImpl();
		return characterLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration createClassDeclaration() {
		ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
		return classDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassInstanceCreation createClassInstanceCreation() {
		ClassInstanceCreationImpl classInstanceCreation = new ClassInstanceCreationImpl();
		return classInstanceCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit createCompilationUnit() {
		CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
		return compilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalExpression createConditionalExpression() {
		ConditionalExpressionImpl conditionalExpression = new ConditionalExpressionImpl();
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorInvocation createConstructorInvocation() {
		ConstructorInvocationImpl constructorInvocation = new ConstructorInvocationImpl();
		return constructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinueStatement createContinueStatement() {
		ContinueStatementImpl continueStatement = new ContinueStatementImpl();
		return continueStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoStatement createDoStatement() {
		DoStatementImpl doStatement = new DoStatementImpl();
		return doStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyStatement createEmptyStatement() {
		EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
		return emptyStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDeclaration createEnumDeclaration() {
		EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
		return enumDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConstantDeclaration createEnumConstantDeclaration() {
		EnumConstantDeclarationImpl enumConstantDeclaration = new EnumConstantDeclarationImpl();
		return enumConstantDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnhancedForStatement createEnhancedForStatement() {
		EnhancedForStatementImpl enhancedForStatement = new EnhancedForStatementImpl();
		return enhancedForStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAccess createFieldAccess() {
		FieldAccessImpl fieldAccess = new FieldAccessImpl();
		return fieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldDeclaration createFieldDeclaration() {
		FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
		return fieldDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportDeclaration createImportDeclaration() {
		ImportDeclarationImpl importDeclaration = new ImportDeclarationImpl();
		return importDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixExpression createInfixExpression() {
		InfixExpressionImpl infixExpression = new InfixExpressionImpl();
		return infixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initializer createInitializer() {
		InitializerImpl initializer = new InitializerImpl();
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceofExpression createInstanceofExpression() {
		InstanceofExpressionImpl instanceofExpression = new InstanceofExpressionImpl();
		return instanceofExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDeclaration createInterfaceDeclaration() {
		InterfaceDeclarationImpl interfaceDeclaration = new InterfaceDeclarationImpl();
		return interfaceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledStatement createLabeledStatement() {
		LabeledStatementImpl labeledStatement = new LabeledStatementImpl();
		return labeledStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberRef createMemberRef() {
		MemberRefImpl memberRef = new MemberRefImpl();
		return memberRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeclaration createMethodDeclaration() {
		MethodDeclarationImpl methodDeclaration = new MethodDeclarationImpl();
		return methodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodInvocation createMethodInvocation() {
		MethodInvocationImpl methodInvocation = new MethodInvocationImpl();
		return methodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodRef createMethodRef() {
		MethodRefImpl methodRef = new MethodRefImpl();
		return methodRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodRefParameter createMethodRefParameter() {
		MethodRefParameterImpl methodRefParameter = new MethodRefParameterImpl();
		return methodRefParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifier createModifier() {
		ModifierImpl modifier = new ModifierImpl();
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElementRef createNamedElementRef() {
		NamedElementRefImpl namedElementRef = new NamedElementRefImpl();
		return namedElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrphanType createOrphanType() {
		OrphanTypeImpl orphanType = new OrphanTypeImpl();
		return orphanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageDeclaration createPackageDeclaration() {
		PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
		return packageDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedType createParameterizedType() {
		ParameterizedTypeImpl parameterizedType = new ParameterizedTypeImpl();
		return parameterizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParenthesizedExpression createParenthesizedExpression() {
		ParenthesizedExpressionImpl parenthesizedExpression = new ParenthesizedExpressionImpl();
		return parenthesizedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostfixExpression createPostfixExpression() {
		PostfixExpressionImpl postfixExpression = new PostfixExpressionImpl();
		return postfixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixExpression createPrefixExpression() {
		PrefixExpressionImpl prefixExpression = new PrefixExpressionImpl();
		return prefixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeBoolean createPrimitiveTypeBoolean() {
		PrimitiveTypeBooleanImpl primitiveTypeBoolean = new PrimitiveTypeBooleanImpl();
		return primitiveTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeByte createPrimitiveTypeByte() {
		PrimitiveTypeByteImpl primitiveTypeByte = new PrimitiveTypeByteImpl();
		return primitiveTypeByte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeChar createPrimitiveTypeChar() {
		PrimitiveTypeCharImpl primitiveTypeChar = new PrimitiveTypeCharImpl();
		return primitiveTypeChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeDouble createPrimitiveTypeDouble() {
		PrimitiveTypeDoubleImpl primitiveTypeDouble = new PrimitiveTypeDoubleImpl();
		return primitiveTypeDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeShort createPrimitiveTypeShort() {
		PrimitiveTypeShortImpl primitiveTypeShort = new PrimitiveTypeShortImpl();
		return primitiveTypeShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeFloat createPrimitiveTypeFloat() {
		PrimitiveTypeFloatImpl primitiveTypeFloat = new PrimitiveTypeFloatImpl();
		return primitiveTypeFloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeInt createPrimitiveTypeInt() {
		PrimitiveTypeIntImpl primitiveTypeInt = new PrimitiveTypeIntImpl();
		return primitiveTypeInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeLong createPrimitiveTypeLong() {
		PrimitiveTypeLongImpl primitiveTypeLong = new PrimitiveTypeLongImpl();
		return primitiveTypeLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeVoid createPrimitiveTypeVoid() {
		PrimitiveTypeVoidImpl primitiveTypeVoid = new PrimitiveTypeVoidImpl();
		return primitiveTypeVoid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableDeclaration createSingleVariableDeclaration() {
		SingleVariableDeclarationImpl singleVariableDeclaration = new SingleVariableDeclarationImpl();
		return singleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperConstructorInvocation createSuperConstructorInvocation() {
		SuperConstructorInvocationImpl superConstructorInvocation = new SuperConstructorInvocationImpl();
		return superConstructorInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperFieldAccess createSuperFieldAccess() {
		SuperFieldAccessImpl superFieldAccess = new SuperFieldAccessImpl();
		return superFieldAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperMethodInvocation createSuperMethodInvocation() {
		SuperMethodInvocationImpl superMethodInvocation = new SuperMethodInvocationImpl();
		return superMethodInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchCase createSwitchCase() {
		SwitchCaseImpl switchCase = new SwitchCaseImpl();
		return switchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchStatement createSwitchStatement() {
		SwitchStatementImpl switchStatement = new SwitchStatementImpl();
		return switchStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizedStatement createSynchronizedStatement() {
		SynchronizedStatementImpl synchronizedStatement = new SynchronizedStatementImpl();
		return synchronizedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagElement createTagElement() {
		TagElementImpl tagElement = new TagElementImpl();
		return tagElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextElement createTextElement() {
		TextElementImpl textElement = new TextElementImpl();
		return textElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThisExpression createThisExpression() {
		ThisExpressionImpl thisExpression = new ThisExpressionImpl();
		return thisExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowStatement createThrowStatement() {
		ThrowStatementImpl throwStatement = new ThrowStatementImpl();
		return throwStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclarationStatement createTypeDeclarationStatement() {
		TypeDeclarationStatementImpl typeDeclarationStatement = new TypeDeclarationStatementImpl();
		return typeDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLiteral createTypeLiteral() {
		TypeLiteralImpl typeLiteral = new TypeLiteralImpl();
		return typeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryStatement createTryStatement() {
		TryStatementImpl tryStatement = new TryStatementImpl();
		return tryStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedItem createUnresolvedItem() {
		UnresolvedItemImpl unresolvedItem = new UnresolvedItemImpl();
		return unresolvedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationExpression createVariableDeclarationExpression() {
		VariableDeclarationExpressionImpl variableDeclarationExpression = new VariableDeclarationExpressionImpl();
		return variableDeclarationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationFragment createVariableDeclarationFragment() {
		VariableDeclarationFragmentImpl variableDeclarationFragment = new VariableDeclarationFragmentImpl();
		return variableDeclarationFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationStatement createVariableDeclarationStatement() {
		VariableDeclarationStatementImpl variableDeclarationStatement = new VariableDeclarationStatementImpl();
		return variableDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WildCardType createWildCardType() {
		WildCardTypeImpl wildCardType = new WildCardTypeImpl();
		return wildCardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceKind createInheritanceKindFromString(EDataType eDataType, String initialValue) {
		InheritanceKind result = InheritanceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java5Package getJava5Package() {
		return (Java5Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Java5Package getPackage() {
		return Java5Package.eINSTANCE;
	}

} //Java5FactoryImpl
