 /*******************************************************************************
 * Copyright (c) 2008 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sébastien Minguet (Mia-Software) - initial API and implementation
 *    Frédéric Madiot (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Erwan Breton (Sodifrance) - initial API and implementation
 *******************************************************************************/

package java5totext.input;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java5totext.input.binding.BijectiveMap;
import java5totext.input.binding.Binding;
import java5totext.input.binding.BindingManager;
import java5totext.input.binding.JDTDelegateBindingFactory;

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
import Java5.Java5Factory;
import Java5.LabeledStatement;
import Java5.MemberRef;
import Java5.MethodDeclaration;
import Java5.MethodInvocation;
import Java5.MethodRef;
import Java5.MethodRefParameter;
import Java5.Model;
import Java5.Modifier;
import Java5.NamedElementRef;
import Java5.NullLiteral;
import Java5.NumberLiteral;
import Java5.PackageDeclaration;
import Java5.ParenthesizedExpression;
import Java5.PostfixExpression;
import Java5.PrefixExpression;
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
import Java5.VariableDeclarationExpression;
import Java5.VariableDeclarationFragment;
import Java5.VariableDeclarationStatement;
import Java5.VisibilityKind;
import Java5.WhileStatement;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.IVariableBinding;



/**
 * The main class for populating the Mia model from the JDT model
 * @author Erwan Breton, Fabien Giquel, Sebastien Minguet 
 *
 */
public class JDTVisitor extends ASTVisitor    {

	private static final char DOT_SEPARATOR = '.';
	private final Java5Factory factory;
	private final Model jdtModel;
	private PackageDeclaration currentPackage = null;
	public BindingManager localBindings = null;
	private List<ImportDeclaration> imports = new ArrayList<ImportDeclaration>();
	private final BijectiveMap<org.eclipse.jdt.core.dom.ASTNode, ASTNode> binding = new BijectiveMap<org.eclipse.jdt.core.dom.ASTNode, ASTNode>();
	public String currentJavaFilePath = null;
//	private List<Comment> commentList = new ArrayList<Comment>();
	private  AbstractTypeDeclaration rootTypeOrEnum = null;
	private org.eclipse.jdt.core.dom.CompilationUnit cuNode = null;
//	private int rootRealStartPosition;
//	private int rootRealEndPosition;
	public BindingManager globalBindings = null;
	private String DEFAULT_PKG_ID = "(default package)";
	@SuppressWarnings("unused")
	private long DEBUG_dateStart;
	public long DEBUG_tempsVisite = 0;

	private final void initializeNode(ASTNode element, org.eclipse.jdt.core.dom.ASTNode node) {
	}
	/*
	 * javaFilepath may be null for source loaded in memory.
	 */
	public JDTVisitor(Java5Factory factory, Java5.Model resultModel, BindingManager globalBindings, String javaFilepath, String javaContent) {
		this.factory = factory;
		this.jdtModel = resultModel;
		this.globalBindings = globalBindings; 
		this.currentJavaFilePath = javaFilepath;
	}

	Java5Factory getFactory() {
		return this.factory;
	}
	Model getJdtModel() {
		return this.jdtModel;
	}
	
	BijectiveMap<org.eclipse.jdt.core.dom.ASTNode, ASTNode> getBijectiveMap() {
		return this.binding;
	}
	
	AbstractTypeDeclaration getRootTypeOrEnum() {
		return this.rootTypeOrEnum;
	}

	org.eclipse.jdt.core.dom.CompilationUnit getCuNode() {
		return this.cuNode;
	}
	
	private void setRootTypeOrEnum(AbstractTypeDeclaration root) {
		this.rootTypeOrEnum = root;
	}

//	public int getRootRealStartPosition() {
//		return this.rootRealStartPosition;
//	}

//	private void setRootRealStartPosition(int rootTypeOrEnumStartPosition) {
//		this.rootRealStartPosition = rootTypeOrEnumStartPosition;
//	}

//	public int getRootRealEndPosition() {
//		return this.rootRealEndPosition;
//	}

//	private void setRootRealEndPosition(int rootAlternativeEndPosition) {
//		this.rootRealEndPosition = rootAlternativeEndPosition;
//	}

//
//
//	public void preVisit(org.eclipse.jdt.core.dom.ASTNode node) {
//		DEBUG_dateStart = System.currentTimeMillis();
//		System.out.println("Visiting " + node.getClass().getName() + " : " + node.toString() + " ...");
//	}
//
//	public void postVisit(org.eclipse.jdt.core.dom.ASTNode node) {
//		long temps = System.currentTimeMillis() - DEBUG_dateStart;
//		if (temps > 0) {
//			DEBUG_tempsVisite += temps;
//			System.out.println("Visited " + node.getClass().getName() + " in " + (temps) + " ms");
//		}
//	}


	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.AnnotationTypeDeclaration node) {
		AnnotationTypeDeclaration element= this.factory.createAnnotationTypeDeclaration();
		this.binding.put(node, element);
		return true;
	}
	@Override
	public void endVisit(org.eclipse.jdt.core.dom.AnnotationTypeDeclaration node) {
		AnnotationTypeDeclaration element= (AnnotationTypeDeclaration) this.binding.get(node);
		this.initializeNode(element, node);
		
		endVisitATD(node, element);
		endVisitBD(node, element);
		JDTVisitorUtils.manageBindingDeclaration(element, node.getName(), this);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration node) {
		AnnotationTypeMemberDeclaration element= this.factory.createAnnotationTypeMemberDeclaration();
		this.binding.put(node, element);
		return true;
	}
	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration node) {
		AnnotationTypeMemberDeclaration element= (AnnotationTypeMemberDeclaration) this.binding.get(node);
		this.initializeNode(element, node);
		element.setName(node.getName().getIdentifier());
		endVisitBD(node, element);
		if (this.binding.get(node.getType()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getType()));
		if (this.binding.get(node.getDefault()) != null)
			element.setDefault((Expression)this.binding.get(node.getDefault()));
		JDTVisitorUtils.manageBindingDeclaration(element, node.getName(), this);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.AnonymousClassDeclaration node) {
		AnonymousClassDeclaration element= this.factory.createAnonymousClassDeclaration();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.AnonymousClassDeclaration node) {
		AnonymousClassDeclaration element= (AnonymousClassDeclaration)this.binding.get(node);
		this.initializeNode(element, node);
		
		for (Iterator<?> i=node.bodyDeclarations().iterator()  ;i.hasNext();){
			BodyDeclaration itElement= (BodyDeclaration) this.binding.get(i.next());
			if (itElement != null)
				element.getBodyDeclarations().add(itElement);
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ArrayAccess node) {
		ArrayAccess element= this.factory.createArrayAccess();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ArrayAccess node) {
		ArrayAccess element= (ArrayAccess)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getArray()) != null)
			element.setArray((Expression)this.binding.get(node.getArray()));
		if (this.binding.get(node.getIndex()) != null)
			element.setIndex((Expression)this.binding.get(node.getIndex()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ArrayCreation node) {
		ArrayCreation element= this.factory.createArrayCreation();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ArrayCreation node) {
		ArrayCreation element= (ArrayCreation)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getType()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getType()));
		for (Iterator<?> i=node.dimensions().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getDimensions().add(itElement);
		}
		if (this.binding.get(node.getInitializer()) != null)
			element.setInitializer((ArrayInitializer)this.binding.get(node.getInitializer()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ArrayInitializer node) {
		ArrayInitializer element= this.factory.createArrayInitializer();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ArrayInitializer node) {
		ArrayInitializer element= (ArrayInitializer)this.binding.get(node);
		this.initializeNode(element, node);
		
		for (Iterator<?> i=node.expressions().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getExpressions().add(itElement);
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ArrayType node) {
		// for XXX[][], jdt manages an ArrayType which points to another ArrayType
		// In Mia we want only one single ArrayType with the dimension 2
		if (!(node.getParent() instanceof org.eclipse.jdt.core.dom.ArrayType)) {
			NamedElementRef element= this.factory.createNamedElementRef();
			this.binding.put(node, element);
		}
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ArrayType node) {
		if (!(node.getParent() instanceof org.eclipse.jdt.core.dom.ArrayType)) {
			NamedElementRef arrayRef= (NamedElementRef)this.binding.get(node);
			this.initializeNode(arrayRef, node);
			JDTVisitorUtils.manageBindingRef(arrayRef, node, this);
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.AssertStatement node) {
		AssertStatement element= this.factory.createAssertStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.AssertStatement node) {
		AssertStatement element= (AssertStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getMessage()) != null)
			element.setMessage((Expression)this.binding.get(node.getMessage()));
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.Assignment node) {
		Assignment element= this.factory.createAssignment();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.Assignment node) {
		Assignment element= (Assignment)this.binding.get(node);
		this.initializeNode(element, node);
		element.setOperator(node.getOperator().toString());

		if (this.binding.get(node.getLeftHandSide()) != null)
			element.setLeftHandSide((Expression)this.binding.get(node.getLeftHandSide()));
		if (this.binding.get(node.getRightHandSide()) != null)
			element.setRightHandSide((Expression)this.binding.get(node.getRightHandSide()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.Block node) {
		Block element= this.factory.createBlock();
		this.binding.put(node, element);	
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.Block node) {
		Block element= (Block)this.binding.get(node);
		this.initializeNode(element, node);
		
		for (Iterator<?> i=node.statements().iterator()  ;i.hasNext();){
			Statement itElement= (Statement) this.binding.get(i.next());
			if (itElement != null)
				element.getStatements().add(itElement);
		}
	}

	@Override
	public boolean visit(org.eclipse.jdt.core.dom.BlockComment node) {
		// Never called with JLS3/J2SE5 (https://bugs.eclipse.org/bugs/show_bug.cgi?format=multiple&id=84528)
		// LineComment and BlockComment are managed on CompilationUnit
		// @see org.eclipse.jdt.core.dom.CompilationUnit#getCommentList()
		System.out.println("Visit block comment : " + node);
		
		return true;
	}

	@Override
	public void endVisit(org.eclipse.jdt.core.dom.BlockComment node) {
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.BooleanLiteral node) {
		BooleanLiteral element= this.factory.createBooleanLiteral();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.BooleanLiteral node) {
		BooleanLiteral element= (BooleanLiteral)this.binding.get(node);
		this.initializeNode(element, node);
		element.setValue(node.booleanValue());
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.BreakStatement node) {
		BreakStatement element= this.factory.createBreakStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.BreakStatement node) {
		BreakStatement element= (BreakStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getLabel()) != null)
			element.setLabel((NamedElementRef)this.binding.get(node.getLabel()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.CastExpression node) {
		CastExpression element= this.factory.createCastExpression();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.CastExpression node) {
		CastExpression element= (CastExpression)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getType()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getType()));
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.CatchClause node) {
		CatchClause element= this.factory.createCatchClause();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.CatchClause node) {
		CatchClause element= (CatchClause)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getException()) != null)
			element.setException((SingleVariableDeclaration)this.binding.get(node.getException()));
		if (this.binding.get(node.getBody()) != null)
			element.setBody((Block)this.binding.get(node.getBody()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.CharacterLiteral node) {
		CharacterLiteral element= this.factory.createCharacterLiteral();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.CharacterLiteral node) {
		CharacterLiteral element= (CharacterLiteral)this.binding.get(node);
		this.initializeNode(element, node);
		element.setEscapedValue(node.getEscapedValue());
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ClassInstanceCreation node) {
		ClassInstanceCreation element= this.factory.createClassInstanceCreation();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ClassInstanceCreation node) {
		ClassInstanceCreation element= (ClassInstanceCreation)this.binding.get(node);
		this.initializeNode(element, node);
		
		MethodDeclaration anonymousConstructor = null;
		
		if (this.binding.get(node.getAnonymousClassDeclaration()) != null){
			AnonymousClassDeclaration anoDecl = (AnonymousClassDeclaration)this.binding.get(node.getAnonymousClassDeclaration());
			element.setAnonymousClassDeclaration(anoDecl);			
			anonymousConstructor = this.factory.createMethodDeclaration();
			anonymousConstructor.setProxy(true);
			anonymousConstructor.setName("");	
			anoDecl.getBodyDeclarations().add(anonymousConstructor);
		}
		
		if (this.binding.get(node.getType()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getType()));
		for (Iterator<?> i=node.arguments().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getArguments().add(itElement);
		}

		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));

		NamedElementRef constructorRef= this.factory.createNamedElementRef();
		element.setMethod(constructorRef);
		
		//if it is an anonymous class declaration we directly use the anonymous constructor
		if (anonymousConstructor != null){
			constructorRef.setElement(anonymousConstructor);
		}
		
		else JDTVisitorUtils.manageBindingRef(constructorRef, node, this);
		
		/*original code for this method
		ClassInstanceCreation element= (ClassInstanceCreation)binding.get(node);
		if (binding.get(node.getAnonymousClassDeclaration()) != null)
			element.setAnonymousClassDeclaration((AnonymousClassDeclaration)binding.get(node.getAnonymousClassDeclaration()));
		if (binding.get(node.getType()) != null)
			element.setType((NamedElementRef)binding.get(node.getType()));
		for (Iterator i=node.arguments().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getArguments().add(itElement);
		}

		if (binding.get(node.getExpression()) != null)
			element.setExpression((Expression)binding.get(node.getExpression()));

		NamedElementRef constructorRef= this.factory.createNamedElementRef();
		element.setMethod(constructorRef);
		JDTVisitorUtils.manageBindingRef(constructorRef, node, this);
		 */
	}

	@Override
	public boolean visit(org.eclipse.jdt.core.dom.CompilationUnit node) {
		this.cuNode = node;
		
		CompilationUnit element= this.factory.createCompilationUnit();
		this.binding.put(node, element);
		
		/*
		 * to parse comment in visitor == is not available !
		 */
//		for (Object comment : node.getCommentList()) {
//			((org.eclipse.jdt.core.dom.Comment) comment).accept(this);
//		}
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.CompilationUnit node) {
		CompilationUnit element = (CompilationUnit) this.binding.get(node);
		this.jdtModel.getCompilationUnits().add(element);
		this.initializeNode(element, node);
		
		if (node.getTypeRoot() != null) {
			element.setName(node.getTypeRoot().getElementName());
			element.setOriginalFilePath(node.getTypeRoot().getPath().toString());
		} else {
			element.setProxy(true);
		}
		
		PackageDeclaration packageDeclaration = (PackageDeclaration) this.binding.get(node.getPackage());
		element.setPackage(packageDeclaration);
		
		for (Object importNode : node.imports()) {
			ImportDeclaration importDeclaration = (ImportDeclaration) this.binding.get(importNode);
			element.getImports().add(importDeclaration);
		}
		
		for (Object typeNode : node.types()) {
			AbstractTypeDeclaration typeDeclaration = (AbstractTypeDeclaration) this.binding.get(typeNode);
			element.getTypes().add(typeDeclaration);
		}
		
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ConditionalExpression node) {
		ConditionalExpression element= this.factory.createConditionalExpression();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ConditionalExpression node) {
		ConditionalExpression element= (ConditionalExpression)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getElseExpression()) != null)
			element.setElseExpression((Expression)this.binding.get(node.getElseExpression()));
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
		if (this.binding.get(node.getThenExpression()) != null)
			element.setThenExpression((Expression)this.binding.get(node.getThenExpression()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ConstructorInvocation node) {
		ConstructorInvocation element= this.factory.createConstructorInvocation();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ConstructorInvocation node) {
		ConstructorInvocation element= (ConstructorInvocation)this.binding.get(node);
		this.initializeNode(element, node);
		

		for (Iterator<?> i=node.arguments().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getArguments().add(itElement);
		}
		NamedElementRef constructorRef= this.factory.createNamedElementRef();
		element.setMethod(constructorRef);
		JDTVisitorUtils.manageBindingRef(constructorRef, node, this);

	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ContinueStatement node) {
		ContinueStatement element= this.factory.createContinueStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ContinueStatement node) {
		ContinueStatement element= (ContinueStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getLabel()) != null)
			element.setLabel((NamedElementRef)this.binding.get(node.getLabel()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.DoStatement node) {
		DoStatement element= this.factory.createDoStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.DoStatement node) {
		DoStatement element= (DoStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
		if (this.binding.get(node.getBody()) != null)
			element.setBody((Statement)this.binding.get(node.getBody()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.EmptyStatement node) {
		EmptyStatement element= this.factory.createEmptyStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.EmptyStatement node) {
		EmptyStatement element= (EmptyStatement)this.binding.get(node);
		this.initializeNode(element, node);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.EnumConstantDeclaration node) {
		EnumConstantDeclaration element= this.factory.createEnumConstantDeclaration();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.EnhancedForStatement node) {
		EnhancedForStatement element= this.factory.createEnhancedForStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.EnhancedForStatement node) {
		EnhancedForStatement element= (EnhancedForStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
		if (this.binding.get(node.getBody()) != null)
			element.setBody((Statement)this.binding.get(node.getBody()));
		if (this.binding.get(node.getParameter()) != null)
			element.setParameter((SingleVariableDeclaration)this.binding.get(node.getParameter()));
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.EnumConstantDeclaration node) {
		EnumConstantDeclaration element= (EnumConstantDeclaration)this.binding.get(node);
		this.initializeNode(element, node);
		
		element.setName(node.getName().getIdentifier());
		if (this.binding.get(node.getAnonymousClassDeclaration()) != null)
			element.setAnonymousClassDeclaration((AnonymousClassDeclaration)this.binding.get(node.getAnonymousClassDeclaration()));
		for (Iterator<?> i=node.arguments().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getArguments().add(itElement);
		}


		endVisitBD(node, element);
		JDTVisitorUtils.manageBindingDeclaration(element, node.getName(), this);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.EnumDeclaration node) {
		EnumDeclaration element= this.factory.createEnumDeclaration();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.EnumDeclaration node) {
		EnumDeclaration element= (EnumDeclaration)this.binding.get(node);
		this.initializeNode(element, node);
		for (int i=0  ;i<node.enumConstants().size();i++){
			element.getEnumConstants().add((EnumConstantDeclaration)this.binding.get(node.enumConstants().get(i)));
		}
		for (Iterator<?> i=node.superInterfaceTypes().iterator()  ;i.hasNext();){
			NamedElementRef itElement= (NamedElementRef) this.binding.get(i.next());
			if (itElement != null)
				element.getSuperInterfaces().add(itElement);
		}
		endVisitATD(node, element);
		endVisitBD(node, element);

		JDTVisitorUtils.manageBindingDeclaration(element, node.getName(), this);
	}



	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ExpressionStatement node) {
		ExpressionStatement element= this.factory.createExpressionStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ExpressionStatement node) {
		ExpressionStatement element= (ExpressionStatement)this.binding.get(node);
		this.initializeNode(element, node);
		

		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.FieldAccess node) {
		FieldAccess element= this.factory.createFieldAccess();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.FieldAccess node) {
		FieldAccess element= (FieldAccess)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getName()) != null)
			element.setField((NamedElementRef)this.binding.get(node.getName()));
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.FieldDeclaration node) {
		FieldDeclaration element= this.factory.createFieldDeclaration();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.FieldDeclaration node) {
		FieldDeclaration element= (FieldDeclaration)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getType()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getType()));
		for (Iterator<?> i=node.fragments().iterator()  ;i.hasNext();){
			VariableDeclarationFragment itElement= (VariableDeclarationFragment) this.binding.get(i.next());
			if (itElement != null)
				element.getFragments().add(itElement);
		}
		endVisitBD(node, element);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ForStatement node) {
		ForStatement element= this.factory.createForStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ForStatement node) {
		ForStatement element= (ForStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
		for (Iterator<?> i=node.updaters().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getUpdaters().add(itElement);
		}
		for (Iterator<?> i=node.initializers().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getInitializers().add(itElement);
		}
		if (this.binding.get(node.getBody()) != null)
			element.setBody((Statement)this.binding.get(node.getBody()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.IfStatement node) {
		IfStatement element= this.factory.createIfStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.IfStatement node) {
		IfStatement element= (IfStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
		if (this.binding.get(node.getThenStatement()) != null)
			element.setThenStatement((Statement)this.binding.get(node.getThenStatement()));
		if (this.binding.get(node.getElseStatement()) != null)
			element.setElseStatement((Statement)this.binding.get(node.getElseStatement()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ImportDeclaration node) {
		ImportDeclaration element= this.factory.createImportDeclaration();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ImportDeclaration node) {
		ImportDeclaration element= (ImportDeclaration)this.binding.get(node);
		this.initializeNode(element, node);
		element.setStatic(new Boolean(node.isStatic()));

		if (this.binding.get(node.getName()) != null)
			element.setImportedElement((NamedElementRef)this.binding.get(node.getName()));
		this.imports.add(element);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.InfixExpression node) {
		InfixExpression element= this.factory.createInfixExpression();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.InfixExpression node) {
		InfixExpression element= (InfixExpression)this.binding.get(node);
		this.initializeNode(element, node);
		element.setOperator(node.getOperator().toString());

		if (this.binding.get(node.getRightOperand()) != null)
			element.setRightOperand((Expression)this.binding.get(node.getRightOperand()));
		if (this.binding.get(node.getLeftOperand()) != null)
			element.setLeftOperand((Expression)this.binding.get(node.getLeftOperand()));
		for (Iterator<?> i=node.extendedOperands().iterator()  ;i.hasNext();){
			Expression extendedOperand= (Expression)this.binding.get(i.next());
			if (extendedOperand != null) {
				element.getExtendedOperands().add(extendedOperand);
			}
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.Initializer node) {
		Initializer element= this.factory.createInitializer();
		this.binding.put(node, element);

		// localBindings may have been initialized if method is declared in anonymous class declared in a method body
		if (this.localBindings == null)
			this.localBindings = new BindingManager(this.factory);

		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.Initializer node) {
		Initializer element= (Initializer)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getBody()) != null)
			element.setBody((Block)this.binding.get(node.getBody()));
		endVisitBD(node, element);

		this.localBindings.resolveBindings();
		// localBindings should be kept if initializer is declared in anonymous class declared in a method body
		if (!(node.getParent() instanceof org.eclipse.jdt.core.dom.AnonymousClassDeclaration
				|| node.getParent().getParent() instanceof org.eclipse.jdt.core.dom.TypeDeclarationStatement))
			this.localBindings = null;
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.InstanceofExpression node) {
		InstanceofExpression element= this.factory.createInstanceofExpression();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.InstanceofExpression node) {
		InstanceofExpression element= (InstanceofExpression)this.binding.get(node);
		this.initializeNode(element, node);
		if (this.binding.get(node.getRightOperand()) != null)
			element.setRightOperand((NamedElementRef)this.binding.get(node.getRightOperand()));
		if (this.binding.get(node.getLeftOperand()) != null)
			element.setLeftOperand((Expression)this.binding.get(node.getLeftOperand()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.LabeledStatement node) {
		LabeledStatement element= this.factory.createLabeledStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.LabeledStatement node) {
		LabeledStatement element= (LabeledStatement)this.binding.get(node);
		this.initializeNode(element, node);
		element.setName(node.getLabel().getIdentifier());
		if (this.binding.get(node.getBody()) != null)
			element.setBody((Statement)this.binding.get(node.getBody()));
		JDTVisitorUtils.manageBindingDeclaration(element, node.getLabel(), this);
	}

	@Override
	public boolean visit(org.eclipse.jdt.core.dom.LineComment node) {
		// Never called with JLS3/J2SE5 (https://bugs.eclipse.org/bugs/show_bug.cgi?format=multiple&id=84528)
		// LineComment and BlockComment are managed on CompilationUnit
		// @see org.eclipse.jdt.core.dom.CompilationUnit#getCommentList()
		return true;
	}

	@Override
	public void endVisit(org.eclipse.jdt.core.dom.LineComment node) {
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.MemberRef node) {
		MemberRef element= this.factory.createMemberRef();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.MemberRef node) {
		MemberRef element= (MemberRef)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getName()) != null)
			element.setMember((NamedElementRef)this.binding.get(node.getName()));
		if (this.binding.get(node.getQualifier()) != null)
			element.setQualifier((NamedElementRef)this.binding.get(node.getQualifier()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.MarkerAnnotation node) {
		Annotation element= this.factory.createAnnotation();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.MarkerAnnotation node) {
		Annotation element= (Annotation)this.binding.get(node);
		this.initializeNode(element, node);
		if (this.binding.get(node.getTypeName()) != null) {
			element.setType((NamedElementRef)this.binding.get(node.getTypeName()));
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.MemberValuePair node) {
		AnnotationMemberValuePair element= this.factory.createAnnotationMemberValuePair();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.MemberValuePair node) {
		AnnotationMemberValuePair element= (AnnotationMemberValuePair)this.binding.get(node);
		this.initializeNode(element, node);
		element.setName(node.getName().getIdentifier());
		
		if (this.binding.get(node.getValue()) != null) {
			element.setValue((Expression)this.binding.get(node.getValue()));
		}
		// TODO vérifier l'utilité de cette résolution ...
		if (this.binding.get(node.getName()) != null) {
			element.setMember((NamedElementRef)this.binding.get(node.getName()));
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.MethodDeclaration node) {
		MethodDeclaration element= this.factory.createMethodDeclaration();
		this.binding.put(node, element);
		// localBindings may have been initialized if method is declared in anonymous class declared in a method body
		if (this.localBindings == null)
			this.localBindings = new BindingManager(this.factory);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.MethodDeclaration node) {
		MethodDeclaration element= (MethodDeclaration)this.binding.get(node);
		this.initializeNode(element, node);
		element.setExtraArrayDimensions(node.getExtraDimensions());
		element.setConstructor(node.isConstructor());
		element.setVarargs(false);

		for (Iterator<?> i=node.parameters().iterator()  ;i.hasNext();){
			SingleVariableDeclaration itElement= (SingleVariableDeclaration) this.binding.get(i.next());
			if (itElement != null)
				element.getParameters().add(itElement);
		}
		if (this.binding.get(node.getBody()) != null)
			element.setBody((Block)this.binding.get(node.getBody()));
		for (Iterator<?> i=node.thrownExceptions().iterator()  ;i.hasNext();){
			NamedElementRef itElement= (NamedElementRef) this.binding.get(i.next());
			if (itElement != null)
				element.getThrownExceptions().add(itElement);
		}
		element.setName(node.getName().getIdentifier());
		if (this.binding.get(node.getReturnType2()) != null)
			element.setReturnType((NamedElementRef)this.binding.get(node.getReturnType2()));
		for (Iterator<?> i=node.typeParameters().iterator()  ;i.hasNext();) {
			TypeParameter itElement= (TypeParameter) this.binding.get(i.next());
			if (itElement != null)
				element.getTypeParameters().add(itElement);
		}
		endVisitBD(node, element);

		this.localBindings.resolveBindings();
		// localBindings should be kept if method is declared in anonymous class declared in a method body
		if (!(node.getParent() instanceof org.eclipse.jdt.core.dom.AnonymousClassDeclaration 
				|| node.getParent().getParent() instanceof org.eclipse.jdt.core.dom.TypeDeclarationStatement))
			this.localBindings = null;
		JDTVisitorUtils.manageBindingDeclaration(element, node.getName(), this);		
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.MethodRef node) {
		MethodRef element= this.factory.createMethodRef();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.MethodRef node) {
		MethodRef element= (MethodRef) this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getName()) != null)
			element.setMethod((NamedElementRef)this.binding.get(node.getName()));
		if (this.binding.get(node.getQualifier()) != null)
			element.setQualifier((NamedElementRef)this.binding.get(node.getQualifier()));
		for (Iterator<?> i=node.parameters().iterator()  ;i.hasNext();) {
			MethodRefParameter itElement= (MethodRefParameter) this.binding.get(i.next());
			if (itElement != null)
				element.getParameters().add(itElement);
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.MethodRefParameter node) {
		MethodRefParameter element= this.factory.createMethodRefParameter();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.MethodRefParameter node) {
		MethodRefParameter element= (MethodRefParameter) this.binding.get(node);
		this.initializeNode(element, node);
		if (node.getName() != null)
			element.setName(node.getName().getIdentifier());
		element.setIsVarargs(node.isVarargs());
		if (this.binding.get(node.getType()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getType()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.MethodInvocation node) {
		MethodInvocation element= this.factory.createMethodInvocation();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.MethodInvocation node) {
		MethodInvocation element= (MethodInvocation)this.binding.get(node);
		this.initializeNode(element, node);
		

		if (this.binding.get(node.getName()) != null)
			element.setMethod((NamedElementRef)this.binding.get(node.getName()));
		for (Iterator<?> i=node.arguments().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getArguments().add(itElement);
		}
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.NormalAnnotation node) {
		Annotation element= this.factory.createAnnotation();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.NormalAnnotation node) {
		Annotation element= (Annotation)this.binding.get(node);
		this.initializeNode(element, node);
		if (this.binding.get(node.getTypeName()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getTypeName()));
		for (Iterator<?> i=node.values().iterator()  ;i.hasNext();){
			AnnotationMemberValuePair itElement= (AnnotationMemberValuePair) this.binding.get(i.next());
			if (itElement != null)
				element.getValues().add(itElement);
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.NullLiteral node) {
		NullLiteral element= this.factory.createNullLiteral();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.NullLiteral node) {
		NullLiteral element= (NullLiteral)this.binding.get(node);
		this.initializeNode(element, node);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.NumberLiteral node) {
		NumberLiteral element= this.factory.createNumberLiteral();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.NumberLiteral node) {
		NumberLiteral element= (NumberLiteral)this.binding.get(node);
		this.initializeNode(element, node);
		element.setTokenValue(node.getToken());
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.PackageDeclaration node) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForName(node.getName());
		PackageDeclaration element = null; 
		if (!this.globalBindings.containsTarget(id.toString())) {
			element = createPackageHierarchy(node);
		}
		else {
			element = (PackageDeclaration)this.globalBindings.getTarget(id.toString());
		}
		this.currentPackage = element;
		this.binding.put(node, element);
		return false;
	}

	// create iterately a hierarchy of packages
	private   PackageDeclaration createPackageHierarchy(org.eclipse.jdt.core.dom.PackageDeclaration node) {
		PackageDeclaration result= this.factory.createPackageDeclaration();
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForName(node.getName());
		String currentPackageName = id.getName();
//		String currentDirectoryName = this.currentJavaFilePath.substring(0, this.currentJavaFilePath.lastIndexOf(java.io.File.separator));
		PackageDeclaration currentPackage = result;
		int lastDotIndex = currentPackageName.lastIndexOf(DOT_SEPARATOR);
//		int lastSeparatorIndex = currentDirectoryName.lastIndexOf(java.io.File.separator);

		if (lastDotIndex == -1) {
			this.jdtModel.getOwnedElements().add(result);
			currentPackage.setName(currentPackageName);
			currentPackage.setQualifiedName(currentPackageName);
		}
		else
			// iterate on parents packages to create them if needed
		{
			currentPackage.setName(currentPackageName.substring(lastDotIndex+1));
			while (lastDotIndex > 0) {
				// add qualified name for curent Package
				currentPackage.setQualifiedName(currentPackageName);
				currentPackageName = currentPackageName.substring(0, lastDotIndex);
//				if (lastSeparatorIndex > 0)
//					currentDirectoryName = currentDirectoryName.substring(0, lastSeparatorIndex);
//				else
//					currentDirectoryName = "";
				PackageDeclaration aParentPackage = null;
				if (!this.globalBindings.containsTarget(currentPackageName)) {
					aParentPackage = this.factory.createPackageDeclaration();

					this.globalBindings.addTarget(currentPackageName, aParentPackage);
					lastDotIndex = currentPackageName.lastIndexOf('.');
					if (lastDotIndex < 0) { // top level package 

						this.jdtModel.getOwnedElements().add(aParentPackage);
						aParentPackage.setName(currentPackageName);
					}
					else
						aParentPackage.setName(currentPackageName.substring(lastDotIndex+1));
					aParentPackage.getOwnedPackages().add(currentPackage);
				}
				else {
					aParentPackage = (PackageDeclaration) this.globalBindings.getTarget(currentPackageName);//(PackageDeclaration)binding.get(node);

					aParentPackage.getOwnedPackages().add(currentPackage);
					break;    // if this package is registered, parents packages also are
				}
				currentPackage = aParentPackage;
			}
		}
		return result;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.PackageDeclaration node) {
		Binding id = JDTDelegateBindingFactory.getInstance().getBindingForName(node.getName());
		if (!this.globalBindings.containsTarget(id.toString())) {
			PackageDeclaration element= (PackageDeclaration)this.binding.get(node);
			this.initializeNode(element, node);
			
			JDTVisitorUtils.manageBindingDeclaration(element, node.getName(), this);
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ParameterizedType node) {
		NamedElementRef element= this.factory.createNamedElementRef();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ParameterizedType node) {
		NamedElementRef element= (NamedElementRef)this.binding.get(node);
		this.initializeNode(element, node);
		/*
		 * Link to real type used would be done in JDTDelegateBindingFactory
		 */
		JDTVisitorUtils.manageBindingRef(element, node, this);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ParenthesizedExpression node) {
		ParenthesizedExpression element= this.factory.createParenthesizedExpression();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ParenthesizedExpression node) {
		ParenthesizedExpression element= (ParenthesizedExpression)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.PostfixExpression node) {
		PostfixExpression element= this.factory.createPostfixExpression();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.PostfixExpression node) {
		PostfixExpression element= (PostfixExpression)this.binding.get(node);
		this.initializeNode(element, node);
		element.setOperator(node.getOperator().toString());

		if (this.binding.get(node.getOperand()) != null)
			element.setOperand((Expression)this.binding.get(node.getOperand()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.PrefixExpression node) {
		PrefixExpression element= this.factory.createPrefixExpression();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.PrefixExpression node) {
		PrefixExpression element= (PrefixExpression)this.binding.get(node);
		this.initializeNode(element, node);
		element.setOperator(node.getOperator().toString());

		if (this.binding.get(node.getOperand()) != null)
			element.setOperand((Expression)this.binding.get(node.getOperand()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.PrimitiveType node) {
		NamedElementRef element= this.factory.createNamedElementRef();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.PrimitiveType node) {
		NamedElementRef element= (NamedElementRef)this.binding.get(node);
		this.initializeNode(element, node);
		JDTVisitorUtils.manageBindingRef(element, node, this);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.QualifiedName node) {
		if (isArrayLengthAccess(node)) {
			ArrayLengthAccess element= this.factory.createArrayLengthAccess();
			this.binding.put(node, element);
			return true;
		}
		else {
			NamedElementRef element= this.factory.createNamedElementRef();
			this.binding.put(node, element);
			return true;
		}
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.QualifiedName node) {
		ASTNode element= this.binding.get(node);
		this.initializeNode(element, node);
		if (isArrayLengthAccess(node)) {
			((ArrayLengthAccess)element).setArray((Expression)this.binding.get(node.getQualifier()));
		}
		else {
			((NamedElementRef)element).setQualifier((NamedElementRef)this.binding.get(node.getQualifier()));
			JDTVisitorUtils.manageBindingRef((NamedElementRef)element, node.getName(), this);
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ReturnStatement node) {
		ReturnStatement element= this.factory.createReturnStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ReturnStatement node) {
		ReturnStatement element= (ReturnStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
	}

	private boolean isArrayLengthAccess(org.eclipse.jdt.core.dom.QualifiedName node) {
		return this.isArrayLengthAccess(node.getName());
	}

	private boolean isArrayLengthAccess(org.eclipse.jdt.core.dom.SimpleName node) {
		boolean result = false;
		if (node.getIdentifier().equals("length")) {
			IBinding nodeBinding = node.resolveBinding();
			if (nodeBinding instanceof IVariableBinding) {
				result = ((((IVariableBinding)nodeBinding).getDeclaringClass()==null)
						&& (((IVariableBinding)nodeBinding).getDeclaringMethod()==null));
			}
		}
		return result;
	}

	private boolean isQualifierChildAsName(org.eclipse.jdt.core.dom.SimpleName node) {
		boolean result = false;
		if (node.getParent() instanceof org.eclipse.jdt.core.dom.QualifiedName) {
			result = (((org.eclipse.jdt.core.dom.QualifiedName) node.getParent()).getName() == node);
		}
		return result;
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.SimpleName node) {
		if (this.isQualifierChildAsName(node)) {
			return true;
		}
		else
//			UTIL ?	if (node.isDeclaration()) {
//			binding.put(node, node.getIdentifier());
//			}
//			else {
			if (!node.isDeclaration()) {
				NamedElementRef element= this.factory.createNamedElementRef();
				this.binding.put(node, element);
			}
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.SimpleName node) {
		if (this.isQualifierChildAsName(node)) {
			return;
		}
		else if (!node.isDeclaration()) {
			NamedElementRef element= (NamedElementRef)this.binding.get(node);
			this.initializeNode(element, node);
			JDTVisitorUtils.manageBindingRef(element, node, this);
		}
	}

	@Override
	public boolean visit(org.eclipse.jdt.core.dom.SimpleType node) {
		return true;
	}

	@Override
	public void endVisit(org.eclipse.jdt.core.dom.SimpleType node) {
		this.binding.put(node, this.binding.get(node.getName()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.SingleMemberAnnotation node) {
		Annotation element= this.factory.createAnnotation();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.SingleMemberAnnotation node) {
		@SuppressWarnings("unused")
		final String DEFAULT_SINGLE_ANNOTATION_MEMBER_NAME = "value";
		Annotation element= (Annotation)this.binding.get(node);
		this.initializeNode(element, node);
		if (this.binding.get(node.getTypeName()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getTypeName()));
		if (this.binding.get(node.getValue()) != null) {
			AnnotationMemberValuePair uniqueMember= this.factory.createAnnotationMemberValuePair();
			uniqueMember.setValue((Expression) this.binding.get(node.getValue()));
			// No member can be retrieved for a SingleMemberAnnotation

			element.getValues().add(uniqueMember);
		}

	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.SingleVariableDeclaration node) {
		SingleVariableDeclaration element = this.factory.createSingleVariableDeclaration();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.SingleVariableDeclaration node) {
		SingleVariableDeclaration element= (SingleVariableDeclaration)this.binding.get(node);
		this.initializeNode(element, node);
		element.setExtraArrayDimensions(node.getExtraDimensions());
		element.setVarargs(node.isVarargs());

		if (this.binding.get(node.getInitializer()) != null) {
			element.setInitializer((Expression)this.binding.get(node.getInitializer()));
		}
		if (this.binding.get(node.getType()) != null) {
			element.setType((NamedElementRef)this.binding.get(node.getType()));
		}
		element.setName(node.getName().getIdentifier());
		// visibility modifiers
		for (Object modifierNode : node.modifiers()) {
			if ((((IExtendedModifier) modifierNode).isModifier()) 
					&& (this.binding.get(modifierNode) != null)) {
				element.getModifiers().add((Modifier) this.binding.get(modifierNode));
			}
		}
		JDTVisitorUtils.manageBindingDeclaration(element, node.getName(), this);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.StringLiteral node) {
		StringLiteral element= this.factory.createStringLiteral();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.StringLiteral node) {
		StringLiteral element= (StringLiteral)this.binding.get(node);
		this.initializeNode(element, node);
		element.setValue(node.getLiteralValue());
		element.setEscapedValue(node.getEscapedValue());
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.SuperConstructorInvocation node) {
		SuperConstructorInvocation element= this.factory.createSuperConstructorInvocation();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.SuperConstructorInvocation node) {
		SuperConstructorInvocation element= (SuperConstructorInvocation)this.binding.get(node);
		this.initializeNode(element, node);
		

		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
		for (Iterator<?> i=node.arguments().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getArguments().add(itElement);
		}
		NamedElementRef constructorRef= this.factory.createNamedElementRef();
		element.setMethod(constructorRef);
		JDTVisitorUtils.manageBindingRef(constructorRef, node, this);

	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.SuperFieldAccess node) {
		SuperFieldAccess element= this.factory.createSuperFieldAccess();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.SuperFieldAccess node) {
		SuperFieldAccess element= (SuperFieldAccess)this.binding.get(node);
		this.initializeNode(element, node);
		

		if (this.binding.get(node.getName()) != null)
			element.setField((NamedElementRef)this.binding.get(node.getName()));
		if (this.binding.get(node.getQualifier()) != null)
			element.setQualifier((NamedElementRef)this.binding.get(node.getQualifier()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.SuperMethodInvocation node) {
		SuperMethodInvocation element= this.factory.createSuperMethodInvocation();
		this.binding.put(node, element);

		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.SuperMethodInvocation node) {
		SuperMethodInvocation element= (SuperMethodInvocation)this.binding.get(node);
		this.initializeNode(element, node);
		
		for (Iterator<?> i=node.arguments().iterator()  ;i.hasNext();){
			Expression itElement= (Expression) this.binding.get(i.next());
			if (itElement != null)
				element.getArguments().add(itElement);
		}
		if (this.binding.get(node.getName()) != null)
			element.setMethod((NamedElementRef)this.binding.get(node.getName()));
		if (this.binding.get(node.getQualifier()) != null)
			element.setQualifier((NamedElementRef)this.binding.get(node.getQualifier()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.SwitchCase node) {
		SwitchCase element= this.factory.createSwitchCase();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.SwitchCase node) {
		SwitchCase element= (SwitchCase)this.binding.get(node);
		this.initializeNode(element, node);
		element.setDefault(node.isDefault());

		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.SwitchStatement node) {
		SwitchStatement element= this.factory.createSwitchStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.SwitchStatement node) {
		SwitchStatement element= (SwitchStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
		for (Iterator<?> i=node.statements().iterator()  ;i.hasNext();){
			Statement itElement= (Statement) this.binding.get(i.next());
			if (itElement != null)
				element.getStatements().add(itElement);
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.SynchronizedStatement node) {
		SynchronizedStatement element= this.factory.createSynchronizedStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.SynchronizedStatement node) {
		SynchronizedStatement element= (SynchronizedStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getBody()) != null)
			element.setBody((Block)this.binding.get(node.getBody()));
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.TagElement node) {
		TagElement element= this.factory.createTagElement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.TagElement node) {
		TagElement element= (TagElement)this.binding.get(node);
		this.initializeNode(element, node);
		
		for (Iterator<?> i=node.fragments().iterator()  ;i.hasNext();){
			ASTNode itElement= this.binding.get(i.next());
			if (itElement != null)
				element.getFragments().add(itElement);
		}
		element.setTagName(node.getTagName());
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.TextElement node) {
		TextElement element= this.factory.createTextElement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.TextElement node) {
		TextElement element= (TextElement)this.binding.get(node);
		this.initializeNode(element, node);
		
		element.setText(node.getText());
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ThisExpression node) {
		ThisExpression element= this.factory.createThisExpression();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ThisExpression node) {
		ThisExpression element= (ThisExpression)this.binding.get(node);
		this.initializeNode(element, node);
		

		if (this.binding.get(node.getQualifier()) != null)
			element.setQualifier((NamedElementRef)this.binding.get(node.getQualifier()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.ThrowStatement node) {
		ThrowStatement element= this.factory.createThrowStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.ThrowStatement node) {
		ThrowStatement element= (ThrowStatement)this.binding.get(node);
		this.initializeNode(element, node);
		

		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.TryStatement node) {
		TryStatement element= this.factory.createTryStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.TryStatement node) {
		TryStatement element= (TryStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getBody()) != null)
			element.setBody((Block)this.binding.get(node.getBody()));
		if (this.binding.get(node.getFinally()) != null)
			element.setFinally((Block)this.binding.get(node.getFinally()));
		for (Iterator<?> i=node.catchClauses().iterator()  ;i.hasNext();){
			CatchClause itElement= (CatchClause) this.binding.get(i.next());
			if (itElement != null)
				element.getCatchClauses().add(itElement);
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.TypeDeclaration node) {
		TypeDeclaration element = null;
		if (node.isInterface()) {
			element = this.factory.createInterfaceDeclaration();
		} else{
			element = this.factory.createClassDeclaration();
		}
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.TypeDeclaration node) {
		TypeDeclaration element= (TypeDeclaration)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (!node.isInterface() && this.binding.get(node.getSuperclassType()) != null)
			((ClassDeclaration) element).setSuperClass((NamedElementRef)this.binding.get(node.getSuperclassType()));
		for (Iterator<?> i=node.superInterfaceTypes().iterator()  ;i.hasNext();){
			NamedElementRef itElement= (NamedElementRef) this.binding.get(i.next());
			if (itElement != null)
				element.getSuperInterfaces().add(itElement);
		}
		for (Iterator<?> i=node.typeParameters().iterator()  ;i.hasNext();) {
			TypeParameter itElement= (TypeParameter) this.binding.get(i.next());
			if (itElement != null) {
				element.getTypeParameters().add(itElement);
			}
		}

		endVisitATD(node, element);
		endVisitBD(node, element);
		JDTVisitorUtils.manageBindingDeclaration(element, node.getName(), this);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.TypeDeclarationStatement node) {
		TypeDeclarationStatement element= this.factory.createTypeDeclarationStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.TypeDeclarationStatement node) {
		TypeDeclarationStatement element= (TypeDeclarationStatement)this.binding.get(node);
		this.initializeNode(element, node);
		if (this.binding.get(node.getDeclaration()) != null)
			element.setDeclaration((AbstractTypeDeclaration)this.binding.get(node.getDeclaration()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.TypeLiteral node) {
		TypeLiteral element= this.factory.createTypeLiteral();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.TypeLiteral node) {
		TypeLiteral element= (TypeLiteral)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getType()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getType()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.TypeParameter node) {
		TypeParameter element= this.factory.createTypeParameter();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.TypeParameter node) {
		TypeParameter element= (TypeParameter)this.binding.get(node);
		this.initializeNode(element, node);
		element.setName(node.getName().getIdentifier());
		for (Iterator<?> i=node.typeBounds().iterator()  ;i.hasNext();){
			NamedElementRef itElement= (NamedElementRef) this.binding.get(i.next());
			if (itElement != null)
				element.getBounds().add(itElement);
		}
		JDTVisitorUtils.manageBindingDeclaration(element, node.getName(), this);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.VariableDeclarationExpression node) {
		VariableDeclarationExpression element= this.factory.createVariableDeclarationExpression();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.VariableDeclarationExpression node) {
		VariableDeclarationExpression element= (VariableDeclarationExpression)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getType()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getType()));
		for (Iterator<?> i=node.fragments().iterator()  ;i.hasNext();){
			VariableDeclarationFragment itElement= (VariableDeclarationFragment) this.binding.get(i.next());
			if (itElement != null)
				element.getFragments().add(itElement);
		}
		// visibility modifiers
		for (Object modifierNode : node.modifiers()) {
			if ((((IExtendedModifier) modifierNode).isModifier()) 
					&& (this.binding.get(modifierNode) != null)) {
				element.getModifiers().add((Modifier) this.binding.get(modifierNode));
			}
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.VariableDeclarationFragment node) {
		VariableDeclarationFragment element = this.factory.createVariableDeclarationFragment();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.VariableDeclarationFragment node) {
		VariableDeclarationFragment element= (VariableDeclarationFragment)this.binding.get(node);
		this.initializeNode(element, node);
		element.setExtraArrayDimensions(node.getExtraDimensions());
		element.setName(node.getName().getIdentifier());

		if (this.binding.get(node.getInitializer()) != null) {
			element.setInitializer((Expression)this.binding.get(node.getInitializer()));
		}
		
		JDTVisitorUtils.manageBindingDeclaration(element, node.getName(), this);
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.VariableDeclarationStatement node) {
		VariableDeclarationStatement element= this.factory.createVariableDeclarationStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.VariableDeclarationStatement node) {
		VariableDeclarationStatement element= (VariableDeclarationStatement)this.binding.get(node);
		this.initializeNode(element, node);
		// visibility modifiers
		for (Object modifierNode : node.modifiers()) {
			if ((((IExtendedModifier) modifierNode).isModifier()) 
					&& (this.binding.get(modifierNode) != null)) {
				element.getModifiers().add((Modifier) this.binding.get(modifierNode));
			}
		}
		if (this.binding.get(node.getType()) != null)
			element.setType((NamedElementRef)this.binding.get(node.getType()));

		for (Iterator<?> i=node.fragments().iterator()  ;i.hasNext();){
			VariableDeclarationFragment itElement= (VariableDeclarationFragment) this.binding.get(i.next());
			if (itElement != null)
				element.getFragments().add(itElement);
		}
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.WhileStatement node) {
		WhileStatement element= this.factory.createWhileStatement();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.WhileStatement node) {
		WhileStatement element= (WhileStatement)this.binding.get(node);
		this.initializeNode(element, node);
		
		if (this.binding.get(node.getExpression()) != null)
			element.setExpression((Expression)this.binding.get(node.getExpression()));
		if (this.binding.get(node.getBody()) != null)
			element.setBody((Statement)this.binding.get(node.getBody()));
	}

	@Override
	public  boolean visit(org.eclipse.jdt.core.dom.WildcardType node) {
		NamedElementRef element= this.factory.createNamedElementRef();
		this.binding.put(node, element);
		return true;
	}

	@Override
	public  void endVisit(org.eclipse.jdt.core.dom.WildcardType node) {
		NamedElementRef element= (NamedElementRef)this.binding.get(node);
		this.initializeNode(element, node);
		JDTVisitorUtils.manageBindingRef(element, node, this);
	}

	private   void endVisitATD(org.eclipse.jdt.core.dom.AbstractTypeDeclaration node, AbstractTypeDeclaration element) {
		element.setName(node.getName().getIdentifier());
		for (Iterator<?> i=node.bodyDeclarations().iterator()  ;i.hasNext();){
			BodyDeclaration itElement= (BodyDeclaration) this.binding.get(i.next());
			if (itElement != null)
				element.getBodyDeclarations().add(itElement);
		}

		// process for package direct types
		if (node.isPackageMemberTypeDeclaration()) {
			String mainClassName = this.currentJavaFilePath.substring(this.currentJavaFilePath.lastIndexOf(java.io.File.separator)+1);
			mainClassName = mainClassName.substring(0, mainClassName.length() - ".java".length());
			//	process for main type of the .java file
			if (mainClassName.equalsIgnoreCase(node.getName().getIdentifier()))		{
				// memorize this AST node as the main
				setRootTypeOrEnum(element);
				for (Iterator<ImportDeclaration> i=this.imports.iterator();i.hasNext();) {
					ImportDeclaration importDecl= i.next();
					element.getImports().add(importDecl);
				}
			}

			if (this.currentPackage == null) { // Type without package 
				this.currentPackage = (PackageDeclaration) this.globalBindings.getTarget(this.DEFAULT_PKG_ID);
				if (this.currentPackage == null) {
					this.currentPackage = this.factory.createPackageDeclaration();
					this.currentPackage.setName(this.DEFAULT_PKG_ID);
					if (this.currentJavaFilePath != null)
					this.globalBindings.addTarget(this.DEFAULT_PKG_ID, this.currentPackage);
				}
			}
			this.currentPackage.getOwnedElements().add(element);
			// calculate qualified name
			String qualifiedName = this.currentPackage.getQualifiedName() + "." + element.getName();
			element.setQualifiedName(qualifiedName);
			
		}
	}

	private  void endVisitBD(org.eclipse.jdt.core.dom.BodyDeclaration node, BodyDeclaration element) {
		// visibility modifiers
		for (Object modifierNode : node.modifiers()) {
			if ((((IExtendedModifier) modifierNode).isModifier()) 
					&& (this.binding.get(modifierNode) != null)) {
				element.getModifiers().add((Modifier) this.binding.get(modifierNode));
			}
		}
		// annotation modifiers
		for (Iterator<?> anIt = node.modifiers().iterator()  ; anIt.hasNext();) {
			org.eclipse.jdt.core.dom.IExtendedModifier aModifier = (org.eclipse.jdt.core.dom.IExtendedModifier) anIt.next();
			if (aModifier.isAnnotation()) {
				Annotation annotation= (Annotation) this.binding.get(aModifier);
				if (annotation != null)
					element.getAnnotations().add(annotation);
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.core.dom.ASTVisitor#visit(org.eclipse.jdt.core.dom.Modifier)
	 */
	@Override
	public boolean visit(org.eclipse.jdt.core.dom.Modifier node) {
		Modifier element = this.getFactory().createModifier();
		this.binding.put(node, element);
		return true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.core.dom.ASTVisitor#endVisit(org.eclipse.jdt.core.dom.Modifier)
	 */
	@Override
	public void endVisit(org.eclipse.jdt.core.dom.Modifier node) {
		Modifier element = (Modifier) this.binding.get(node);
		
		element.setStatic(node.isStatic());
		element.setNative(node.isNative());
		element.setStrictfp(node.isStrictfp());
		element.setSynchronized(node.isSynchronized());
		element.setTransient(node.isTransient());
		element.setVolatile(node.isVolatile());
		
		if (node.isPrivate()) {
			element.setVisibility(VisibilityKind.PRIVATE.toString());
		} else if (node.isProtected()) {
			element.setVisibility(VisibilityKind.PROTECTED.toString());
		} else if (node.isPublic()) {
			element.setVisibility(VisibilityKind.PUBLIC.toString());
		}
		
		if (node.isAbstract()) {
			element.setInheritance(InheritanceKind.ABSTRACT.toString());
		} else if (node.isFinal()) {
			element.setInheritance(InheritanceKind.FINAL.toString());
		}	
		
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jdt.core.dom.ASTVisitor#visit(org.eclipse.jdt.core.dom.QualifiedType)
	 */
	@Override
	public boolean visit(org.eclipse.jdt.core.dom.QualifiedType node) {
		return super.visit(node);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.core.dom.ASTVisitor#endVisit(org.eclipse.jdt.core.dom.QualifiedType)
	 */
	@Override
	public void endVisit(org.eclipse.jdt.core.dom.QualifiedType node) {
		super.endVisit(node);
	}

}
