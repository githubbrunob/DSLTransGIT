/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Java5.util;

import Java5.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Java5.Java5Package
 * @generated
 */
public class Java5AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Java5Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java5AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Java5Package.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected Java5Switch<Adapter> modelSwitch =
		new Java5Switch<Adapter>() {
			@Override
			public Adapter caseAbstractTypeDeclaration(AbstractTypeDeclaration object) {
				return createAbstractTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotationMemberValuePair(AnnotationMemberValuePair object) {
				return createAnnotationMemberValuePairAdapter();
			}
			@Override
			public Adapter caseAnnotationTypeDeclaration(AnnotationTypeDeclaration object) {
				return createAnnotationTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseAnnotationTypeMemberDeclaration(AnnotationTypeMemberDeclaration object) {
				return createAnnotationTypeMemberDeclarationAdapter();
			}
			@Override
			public Adapter caseAnonymousClassDeclaration(AnonymousClassDeclaration object) {
				return createAnonymousClassDeclarationAdapter();
			}
			@Override
			public Adapter caseArrayAccess(ArrayAccess object) {
				return createArrayAccessAdapter();
			}
			@Override
			public Adapter caseArrayCreation(ArrayCreation object) {
				return createArrayCreationAdapter();
			}
			@Override
			public Adapter caseArrayInitializer(ArrayInitializer object) {
				return createArrayInitializerAdapter();
			}
			@Override
			public Adapter caseArrayLengthAccess(ArrayLengthAccess object) {
				return createArrayLengthAccessAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseAssertStatement(AssertStatement object) {
				return createAssertStatementAdapter();
			}
			@Override
			public Adapter caseAssignment(Assignment object) {
				return createAssignmentAdapter();
			}
			@Override
			public Adapter caseASTNode(ASTNode object) {
				return createASTNodeAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseBodyDeclaration(BodyDeclaration object) {
				return createBodyDeclarationAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral(BooleanLiteral object) {
				return createBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseBreakStatement(BreakStatement object) {
				return createBreakStatementAdapter();
			}
			@Override
			public Adapter caseCastExpression(CastExpression object) {
				return createCastExpressionAdapter();
			}
			@Override
			public Adapter caseCatchClause(CatchClause object) {
				return createCatchClauseAdapter();
			}
			@Override
			public Adapter caseCharacterLiteral(CharacterLiteral object) {
				return createCharacterLiteralAdapter();
			}
			@Override
			public Adapter caseClassDeclaration(ClassDeclaration object) {
				return createClassDeclarationAdapter();
			}
			@Override
			public Adapter caseClassInstanceCreation(ClassInstanceCreation object) {
				return createClassInstanceCreationAdapter();
			}
			@Override
			public Adapter caseCompilationUnit(CompilationUnit object) {
				return createCompilationUnitAdapter();
			}
			@Override
			public Adapter caseConditionalExpression(ConditionalExpression object) {
				return createConditionalExpressionAdapter();
			}
			@Override
			public Adapter caseConstructorInvocation(ConstructorInvocation object) {
				return createConstructorInvocationAdapter();
			}
			@Override
			public Adapter caseContinueStatement(ContinueStatement object) {
				return createContinueStatementAdapter();
			}
			@Override
			public Adapter caseDoStatement(DoStatement object) {
				return createDoStatementAdapter();
			}
			@Override
			public Adapter caseEmptyStatement(EmptyStatement object) {
				return createEmptyStatementAdapter();
			}
			@Override
			public Adapter caseEnumDeclaration(EnumDeclaration object) {
				return createEnumDeclarationAdapter();
			}
			@Override
			public Adapter caseEnumConstantDeclaration(EnumConstantDeclaration object) {
				return createEnumConstantDeclarationAdapter();
			}
			@Override
			public Adapter caseEnhancedForStatement(EnhancedForStatement object) {
				return createEnhancedForStatementAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionStatement(ExpressionStatement object) {
				return createExpressionStatementAdapter();
			}
			@Override
			public Adapter caseFieldAccess(FieldAccess object) {
				return createFieldAccessAdapter();
			}
			@Override
			public Adapter caseFieldDeclaration(FieldDeclaration object) {
				return createFieldDeclarationAdapter();
			}
			@Override
			public Adapter caseForStatement(ForStatement object) {
				return createForStatementAdapter();
			}
			@Override
			public Adapter caseIfStatement(IfStatement object) {
				return createIfStatementAdapter();
			}
			@Override
			public Adapter caseImportDeclaration(ImportDeclaration object) {
				return createImportDeclarationAdapter();
			}
			@Override
			public Adapter caseInfixExpression(InfixExpression object) {
				return createInfixExpressionAdapter();
			}
			@Override
			public Adapter caseInitializer(Initializer object) {
				return createInitializerAdapter();
			}
			@Override
			public Adapter caseInstanceofExpression(InstanceofExpression object) {
				return createInstanceofExpressionAdapter();
			}
			@Override
			public Adapter caseInterfaceDeclaration(InterfaceDeclaration object) {
				return createInterfaceDeclarationAdapter();
			}
			@Override
			public Adapter caseLabeledStatement(LabeledStatement object) {
				return createLabeledStatementAdapter();
			}
			@Override
			public Adapter caseMemberRef(MemberRef object) {
				return createMemberRefAdapter();
			}
			@Override
			public Adapter caseMethodDeclaration(MethodDeclaration object) {
				return createMethodDeclarationAdapter();
			}
			@Override
			public Adapter caseMethodInvocation(MethodInvocation object) {
				return createMethodInvocationAdapter();
			}
			@Override
			public Adapter caseMethodRef(MethodRef object) {
				return createMethodRefAdapter();
			}
			@Override
			public Adapter caseMethodRefParameter(MethodRefParameter object) {
				return createMethodRefParameterAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseModifier(Modifier object) {
				return createModifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamedElementRef(NamedElementRef object) {
				return createNamedElementRefAdapter();
			}
			@Override
			public Adapter caseNullLiteral(NullLiteral object) {
				return createNullLiteralAdapter();
			}
			@Override
			public Adapter caseNumberLiteral(NumberLiteral object) {
				return createNumberLiteralAdapter();
			}
			@Override
			public Adapter caseOrphanType(OrphanType object) {
				return createOrphanTypeAdapter();
			}
			@Override
			public Adapter casePackageDeclaration(PackageDeclaration object) {
				return createPackageDeclarationAdapter();
			}
			@Override
			public Adapter caseParameterizedType(ParameterizedType object) {
				return createParameterizedTypeAdapter();
			}
			@Override
			public Adapter caseParenthesizedExpression(ParenthesizedExpression object) {
				return createParenthesizedExpressionAdapter();
			}
			@Override
			public Adapter casePostfixExpression(PostfixExpression object) {
				return createPostfixExpressionAdapter();
			}
			@Override
			public Adapter casePrefixExpression(PrefixExpression object) {
				return createPrefixExpressionAdapter();
			}
			@Override
			public Adapter casePrimitiveType(PrimitiveType object) {
				return createPrimitiveTypeAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeBoolean(PrimitiveTypeBoolean object) {
				return createPrimitiveTypeBooleanAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeByte(PrimitiveTypeByte object) {
				return createPrimitiveTypeByteAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeChar(PrimitiveTypeChar object) {
				return createPrimitiveTypeCharAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeDouble(PrimitiveTypeDouble object) {
				return createPrimitiveTypeDoubleAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeShort(PrimitiveTypeShort object) {
				return createPrimitiveTypeShortAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeFloat(PrimitiveTypeFloat object) {
				return createPrimitiveTypeFloatAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeInt(PrimitiveTypeInt object) {
				return createPrimitiveTypeIntAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeLong(PrimitiveTypeLong object) {
				return createPrimitiveTypeLongAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeVoid(PrimitiveTypeVoid object) {
				return createPrimitiveTypeVoidAdapter();
			}
			@Override
			public Adapter caseReturnStatement(ReturnStatement object) {
				return createReturnStatementAdapter();
			}
			@Override
			public Adapter caseSingleVariableDeclaration(SingleVariableDeclaration object) {
				return createSingleVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseStringLiteral(StringLiteral object) {
				return createStringLiteralAdapter();
			}
			@Override
			public Adapter caseSuperConstructorInvocation(SuperConstructorInvocation object) {
				return createSuperConstructorInvocationAdapter();
			}
			@Override
			public Adapter caseSuperFieldAccess(SuperFieldAccess object) {
				return createSuperFieldAccessAdapter();
			}
			@Override
			public Adapter caseSuperMethodInvocation(SuperMethodInvocation object) {
				return createSuperMethodInvocationAdapter();
			}
			@Override
			public Adapter caseSwitchCase(SwitchCase object) {
				return createSwitchCaseAdapter();
			}
			@Override
			public Adapter caseSwitchStatement(SwitchStatement object) {
				return createSwitchStatementAdapter();
			}
			@Override
			public Adapter caseSynchronizedStatement(SynchronizedStatement object) {
				return createSynchronizedStatementAdapter();
			}
			@Override
			public Adapter caseTagElement(TagElement object) {
				return createTagElementAdapter();
			}
			@Override
			public Adapter caseTextElement(TextElement object) {
				return createTextElementAdapter();
			}
			@Override
			public Adapter caseThisExpression(ThisExpression object) {
				return createThisExpressionAdapter();
			}
			@Override
			public Adapter caseThrowStatement(ThrowStatement object) {
				return createThrowStatementAdapter();
			}
			@Override
			public Adapter caseTypeDeclaration(TypeDeclaration object) {
				return createTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseTypeDeclarationStatement(TypeDeclarationStatement object) {
				return createTypeDeclarationStatementAdapter();
			}
			@Override
			public Adapter caseTypeLiteral(TypeLiteral object) {
				return createTypeLiteralAdapter();
			}
			@Override
			public Adapter caseTypeParameter(TypeParameter object) {
				return createTypeParameterAdapter();
			}
			@Override
			public Adapter caseTryStatement(TryStatement object) {
				return createTryStatementAdapter();
			}
			@Override
			public Adapter caseUnresolvedItem(UnresolvedItem object) {
				return createUnresolvedItemAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationExpression(VariableDeclarationExpression object) {
				return createVariableDeclarationExpressionAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationFragment(VariableDeclarationFragment object) {
				return createVariableDeclarationFragmentAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationStatement(VariableDeclarationStatement object) {
				return createVariableDeclarationStatementAdapter();
			}
			@Override
			public Adapter caseWhileStatement(WhileStatement object) {
				return createWhileStatementAdapter();
			}
			@Override
			public Adapter caseWildCardType(WildCardType object) {
				return createWildCardTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Java5.AbstractTypeDeclaration <em>Abstract Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.AbstractTypeDeclaration
	 * @generated
	 */
	public Adapter createAbstractTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.AnnotationMemberValuePair <em>Annotation Member Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.AnnotationMemberValuePair
	 * @generated
	 */
	public Adapter createAnnotationMemberValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.AnnotationTypeDeclaration <em>Annotation Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.AnnotationTypeDeclaration
	 * @generated
	 */
	public Adapter createAnnotationTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.AnnotationTypeMemberDeclaration <em>Annotation Type Member Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.AnnotationTypeMemberDeclaration
	 * @generated
	 */
	public Adapter createAnnotationTypeMemberDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.AnonymousClassDeclaration <em>Anonymous Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.AnonymousClassDeclaration
	 * @generated
	 */
	public Adapter createAnonymousClassDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ArrayAccess <em>Array Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ArrayAccess
	 * @generated
	 */
	public Adapter createArrayAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ArrayCreation <em>Array Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ArrayCreation
	 * @generated
	 */
	public Adapter createArrayCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ArrayInitializer <em>Array Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ArrayInitializer
	 * @generated
	 */
	public Adapter createArrayInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ArrayLengthAccess <em>Array Length Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ArrayLengthAccess
	 * @generated
	 */
	public Adapter createArrayLengthAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.AssertStatement <em>Assert Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.AssertStatement
	 * @generated
	 */
	public Adapter createAssertStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.Assignment
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ASTNode <em>AST Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ASTNode
	 * @generated
	 */
	public Adapter createASTNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.BodyDeclaration <em>Body Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.BodyDeclaration
	 * @generated
	 */
	public Adapter createBodyDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.BreakStatement <em>Break Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.BreakStatement
	 * @generated
	 */
	public Adapter createBreakStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.CastExpression <em>Cast Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.CastExpression
	 * @generated
	 */
	public Adapter createCastExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.CatchClause <em>Catch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.CatchClause
	 * @generated
	 */
	public Adapter createCatchClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.CharacterLiteral <em>Character Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.CharacterLiteral
	 * @generated
	 */
	public Adapter createCharacterLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ClassDeclaration <em>Class Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ClassDeclaration
	 * @generated
	 */
	public Adapter createClassDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ClassInstanceCreation <em>Class Instance Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ClassInstanceCreation
	 * @generated
	 */
	public Adapter createClassInstanceCreationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.CompilationUnit
	 * @generated
	 */
	public Adapter createCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ConditionalExpression
	 * @generated
	 */
	public Adapter createConditionalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ConstructorInvocation <em>Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ConstructorInvocation
	 * @generated
	 */
	public Adapter createConstructorInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ContinueStatement <em>Continue Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ContinueStatement
	 * @generated
	 */
	public Adapter createContinueStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.DoStatement <em>Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.DoStatement
	 * @generated
	 */
	public Adapter createDoStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.EmptyStatement <em>Empty Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.EmptyStatement
	 * @generated
	 */
	public Adapter createEmptyStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.EnumDeclaration <em>Enum Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.EnumDeclaration
	 * @generated
	 */
	public Adapter createEnumDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.EnumConstantDeclaration <em>Enum Constant Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.EnumConstantDeclaration
	 * @generated
	 */
	public Adapter createEnumConstantDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.EnhancedForStatement <em>Enhanced For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.EnhancedForStatement
	 * @generated
	 */
	public Adapter createEnhancedForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ExpressionStatement <em>Expression Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ExpressionStatement
	 * @generated
	 */
	public Adapter createExpressionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.FieldAccess <em>Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.FieldAccess
	 * @generated
	 */
	public Adapter createFieldAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.FieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.FieldDeclaration
	 * @generated
	 */
	public Adapter createFieldDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ForStatement
	 * @generated
	 */
	public Adapter createForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ImportDeclaration <em>Import Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ImportDeclaration
	 * @generated
	 */
	public Adapter createImportDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.InfixExpression <em>Infix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.InfixExpression
	 * @generated
	 */
	public Adapter createInfixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.Initializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.Initializer
	 * @generated
	 */
	public Adapter createInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.InstanceofExpression <em>Instanceof Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.InstanceofExpression
	 * @generated
	 */
	public Adapter createInstanceofExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.InterfaceDeclaration <em>Interface Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.InterfaceDeclaration
	 * @generated
	 */
	public Adapter createInterfaceDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.LabeledStatement <em>Labeled Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.LabeledStatement
	 * @generated
	 */
	public Adapter createLabeledStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.MemberRef <em>Member Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.MemberRef
	 * @generated
	 */
	public Adapter createMemberRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.MethodDeclaration <em>Method Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.MethodDeclaration
	 * @generated
	 */
	public Adapter createMethodDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.MethodInvocation <em>Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.MethodInvocation
	 * @generated
	 */
	public Adapter createMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.MethodRef <em>Method Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.MethodRef
	 * @generated
	 */
	public Adapter createMethodRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.MethodRefParameter <em>Method Ref Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.MethodRefParameter
	 * @generated
	 */
	public Adapter createMethodRefParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.Modifier
	 * @generated
	 */
	public Adapter createModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.NamedElementRef <em>Named Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.NamedElementRef
	 * @generated
	 */
	public Adapter createNamedElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.NullLiteral
	 * @generated
	 */
	public Adapter createNullLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.NumberLiteral
	 * @generated
	 */
	public Adapter createNumberLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.OrphanType <em>Orphan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.OrphanType
	 * @generated
	 */
	public Adapter createOrphanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PackageDeclaration <em>Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PackageDeclaration
	 * @generated
	 */
	public Adapter createPackageDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ParameterizedType <em>Parameterized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ParameterizedType
	 * @generated
	 */
	public Adapter createParameterizedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ParenthesizedExpression
	 * @generated
	 */
	public Adapter createParenthesizedExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PostfixExpression <em>Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PostfixExpression
	 * @generated
	 */
	public Adapter createPostfixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrefixExpression <em>Prefix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrefixExpression
	 * @generated
	 */
	public Adapter createPrefixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrimitiveType
	 * @generated
	 */
	public Adapter createPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrimitiveTypeBoolean <em>Primitive Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrimitiveTypeBoolean
	 * @generated
	 */
	public Adapter createPrimitiveTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrimitiveTypeByte <em>Primitive Type Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrimitiveTypeByte
	 * @generated
	 */
	public Adapter createPrimitiveTypeByteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrimitiveTypeChar <em>Primitive Type Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrimitiveTypeChar
	 * @generated
	 */
	public Adapter createPrimitiveTypeCharAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrimitiveTypeDouble <em>Primitive Type Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrimitiveTypeDouble
	 * @generated
	 */
	public Adapter createPrimitiveTypeDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrimitiveTypeShort <em>Primitive Type Short</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrimitiveTypeShort
	 * @generated
	 */
	public Adapter createPrimitiveTypeShortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrimitiveTypeFloat <em>Primitive Type Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrimitiveTypeFloat
	 * @generated
	 */
	public Adapter createPrimitiveTypeFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrimitiveTypeInt <em>Primitive Type Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrimitiveTypeInt
	 * @generated
	 */
	public Adapter createPrimitiveTypeIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrimitiveTypeLong <em>Primitive Type Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrimitiveTypeLong
	 * @generated
	 */
	public Adapter createPrimitiveTypeLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.PrimitiveTypeVoid <em>Primitive Type Void</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.PrimitiveTypeVoid
	 * @generated
	 */
	public Adapter createPrimitiveTypeVoidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ReturnStatement
	 * @generated
	 */
	public Adapter createReturnStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.SingleVariableDeclaration <em>Single Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.SingleVariableDeclaration
	 * @generated
	 */
	public Adapter createSingleVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.SuperConstructorInvocation <em>Super Constructor Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.SuperConstructorInvocation
	 * @generated
	 */
	public Adapter createSuperConstructorInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.SuperFieldAccess <em>Super Field Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.SuperFieldAccess
	 * @generated
	 */
	public Adapter createSuperFieldAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.SuperMethodInvocation <em>Super Method Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.SuperMethodInvocation
	 * @generated
	 */
	public Adapter createSuperMethodInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.SwitchCase
	 * @generated
	 */
	public Adapter createSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.SwitchStatement
	 * @generated
	 */
	public Adapter createSwitchStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.SynchronizedStatement <em>Synchronized Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.SynchronizedStatement
	 * @generated
	 */
	public Adapter createSynchronizedStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.TagElement <em>Tag Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.TagElement
	 * @generated
	 */
	public Adapter createTagElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.TextElement
	 * @generated
	 */
	public Adapter createTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ThisExpression <em>This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ThisExpression
	 * @generated
	 */
	public Adapter createThisExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.ThrowStatement <em>Throw Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.ThrowStatement
	 * @generated
	 */
	public Adapter createThrowStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.TypeDeclaration
	 * @generated
	 */
	public Adapter createTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.TypeDeclarationStatement <em>Type Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.TypeDeclarationStatement
	 * @generated
	 */
	public Adapter createTypeDeclarationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.TypeLiteral <em>Type Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.TypeLiteral
	 * @generated
	 */
	public Adapter createTypeLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.TypeParameter <em>Type Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.TypeParameter
	 * @generated
	 */
	public Adapter createTypeParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.TryStatement <em>Try Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.TryStatement
	 * @generated
	 */
	public Adapter createTryStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.UnresolvedItem <em>Unresolved Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.UnresolvedItem
	 * @generated
	 */
	public Adapter createUnresolvedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.VariableDeclarationExpression <em>Variable Declaration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.VariableDeclarationExpression
	 * @generated
	 */
	public Adapter createVariableDeclarationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.VariableDeclarationFragment <em>Variable Declaration Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.VariableDeclarationFragment
	 * @generated
	 */
	public Adapter createVariableDeclarationFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.VariableDeclarationStatement <em>Variable Declaration Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.VariableDeclarationStatement
	 * @generated
	 */
	public Adapter createVariableDeclarationStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Java5.WildCardType <em>Wild Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Java5.WildCardType
	 * @generated
	 */
	public Adapter createWildCardTypeAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Java5AdapterFactory
