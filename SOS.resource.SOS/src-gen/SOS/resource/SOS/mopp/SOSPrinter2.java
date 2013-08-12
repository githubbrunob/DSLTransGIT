/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package SOS.resource.SOS.mopp;

public class SOSPrinter2 implements SOS.resource.SOS.ISOSTextPrinter {
	
	protected class PrintToken {
		
		private String text;
		private String tokenName;
		
		public PrintToken(String text, String tokenName) {
			this.text = text;
			this.tokenName = tokenName;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
	}
	
	public final static String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	private final PrintToken SPACE_TOKEN = new PrintToken(" ", null);
	private final PrintToken TAB_TOKEN = new PrintToken("\t", null);
	private final PrintToken NEW_LINE_TOKEN = new PrintToken(NEW_LINE, null);
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private SOS.resource.SOS.ISOSTextResource resource;
	
	private java.util.Map<?, ?> options;
	private java.io.OutputStream outputStream;
	protected java.util.List<PrintToken> tokenOutputStream;
	private SOS.resource.SOS.ISOSTokenResolverFactory tokenResolverFactory = new SOS.resource.SOS.mopp.SOSTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = true;
	private int tokenSpace = 1;
	/**
	 * A flag that indicates whether tokens have already been printed for some object.
	 * The flag is set to false whenever printing of an EObject tree is started. The
	 * status of the flag is used to avoid printing default token space in front of
	 * the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters that were printed before the current line. This
	 * number is used to calculate the relative indentation when printing contained
	 * objects, because all contained objects must start with this indentation
	 * (tabsBeforeCurrentObject + currentTabs).
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indentation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	/**
	 * This flag is used to indicate whether the number of tabs before the current
	 * object has been set for the current object. The flag is needed, because setting
	 * the number of tabs must be performed when the first token of the contained
	 * element is printed.
	 */
	private boolean startedPrintingContainedObject;
	
	public SOSPrinter2(java.io.OutputStream outputStream, SOS.resource.SOS.ISOSTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		tokenOutputStream = new java.util.ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		startedPrintingContainedObject = false;
		java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement>  formattingElements = new java.util.ArrayList<SOS.resource.SOS.grammar.SOSFormattingElement>();
		doPrint(element, formattingElements);
		// print all remaining formatting elements
		java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations = getCopyOfLayoutInformation(element);
		SOS.resource.SOS.mopp.SOSLayoutInformation eofLayoutInformation = getLayoutInformation(layoutInformations, null, null, null);
		printFormattingElements(formattingElements, layoutInformations, eofLayoutInformation);
		java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof SOS.Semantics) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_0, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.Rule) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.PremisseList) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_2, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.AlgebraicConditionList) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_3, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.Conclusion) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_4, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.Transition) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.TypeJudment) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_6, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.AlgebraicCondition) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_7, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.adtmm.ADT) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.adtmm.Operation) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_9, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.adtmm.Variable) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_10, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.adtmm.CondEquation) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.adtmm.VariableRef) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_12, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.adtmm.CTerm) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.adtmm.Equation) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_14, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.adtmm.Inequation) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_15, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.adtmm.AtomicSort) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_16, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.adtmm.SortDeclaration) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_17, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.Set) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_18, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.ModelSet) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_19, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.SetConstructor) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_20, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.ForAllIn) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.ExistsIn) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.Union) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.Excluding) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.Intersection) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.ModelRelation) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.ModelClassAttribute) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_27, foundFormattingElements);
			return;
		}
		if (element instanceof SOS.set.ModelSort) {
			printInternal(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_28, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(org.eclipse.emf.ecore.EObject eObject, SOS.resource.SOS.grammar.SOSSyntaxElement ruleElement, java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements) {
		java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations = getCopyOfLayoutInformation(eObject);
		SOS.resource.SOS.mopp.SOSSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public SOS.resource.SOS.mopp.SOSSyntaxElementDecorator getDecoratorTree(SOS.resource.SOS.grammar.SOSSyntaxElement syntaxElement) {
		SOS.resource.SOS.grammar.SOSSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		SOS.resource.SOS.mopp.SOSSyntaxElementDecorator[] childDecorators = new SOS.resource.SOS.mopp.SOSSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		SOS.resource.SOS.mopp.SOSSyntaxElementDecorator decorator = new SOS.resource.SOS.mopp.SOSSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(SOS.resource.SOS.mopp.SOSSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject) {
		java.util.Map<String, Integer> printCountingMap = initializePrintCountingMap(eObject);
		java.util.List<SOS.resource.SOS.mopp.SOSSyntaxElementDecorator> keywordsToPrint = new java.util.ArrayList<SOS.resource.SOS.mopp.SOSSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (SOS.resource.SOS.mopp.SOSSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference holded by
	 * eObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(SOS.resource.SOS.mopp.SOSSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap, java.util.List<SOS.resource.SOS.mopp.SOSSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		SOS.resource.SOS.grammar.SOSSyntaxElement syntaxElement = decorator.getDecoratedElement();
		SOS.resource.SOS.grammar.SOSCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			java.util.List<SOS.resource.SOS.mopp.SOSSyntaxElementDecorator> subKeywordsToPrint = new java.util.ArrayList<SOS.resource.SOS.mopp.SOSSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof SOS.resource.SOS.grammar.SOSKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof SOS.resource.SOS.grammar.SOSTerminal) {
				SOS.resource.SOS.grammar.SOSTerminal terminal = (SOS.resource.SOS.grammar.SOSTerminal) syntaxElement;
				org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
				if (feature == SOS.resource.SOS.grammar.SOSGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				int countLeft = printCountingMap.get(feature.getName());
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					decorator.addIndexToPrint(countLeft);
					printCountingMap.put(feature.getName(), countLeft - 1);
					keepDecorating = true;
				}
			}
			if (syntaxElement instanceof SOS.resource.SOS.grammar.SOSChoice) {
				// for choices we do print only the choice which does print at least one feature
				SOS.resource.SOS.mopp.SOSSyntaxElementDecorator childToPrint = null;
				for (SOS.resource.SOS.mopp.SOSSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (SOS.resource.SOS.mopp.SOSSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == SOS.resource.SOS.grammar.SOSCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == SOS.resource.SOS.grammar.SOSCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == SOS.resource.SOS.grammar.SOSCardinality.STAR || cardinality == SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == SOS.resource.SOS.grammar.SOSCardinality.ONE || cardinality == SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference holded by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(SOS.resource.SOS.mopp.SOSSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap) {
		SOS.resource.SOS.grammar.SOSSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof SOS.resource.SOS.grammar.SOSTerminal) {
			SOS.resource.SOS.grammar.SOSTerminal terminal = (SOS.resource.SOS.grammar.SOSTerminal) syntaxElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			if (feature == SOS.resource.SOS.grammar.SOSGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.get(feature.getName());
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (SOS.resource.SOS.mopp.SOSSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(SOS.resource.SOS.mopp.SOSSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements, java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations) {
		SOS.resource.SOS.grammar.SOSSyntaxElement printElement = decorator.getDecoratedElement();
		SOS.resource.SOS.grammar.SOSCardinality cardinality = printElement.getCardinality();
		java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> cloned = new java.util.ArrayList<SOS.resource.SOS.grammar.SOSFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof SOS.resource.SOS.grammar.SOSKeyword) {
					printKeyword(eObject, (SOS.resource.SOS.grammar.SOSKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof SOS.resource.SOS.grammar.SOSPlaceholder) {
					SOS.resource.SOS.grammar.SOSPlaceholder placeholder = (SOS.resource.SOS.grammar.SOSPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof SOS.resource.SOS.grammar.SOSContainment) {
					SOS.resource.SOS.grammar.SOSContainment containment = (SOS.resource.SOS.grammar.SOSContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof SOS.resource.SOS.grammar.SOSBooleanTerminal) {
					SOS.resource.SOS.grammar.SOSBooleanTerminal booleanTerminal = (SOS.resource.SOS.grammar.SOSBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof SOS.resource.SOS.grammar.SOSEnumerationTerminal) {
					SOS.resource.SOS.grammar.SOSEnumerationTerminal enumTerminal = (SOS.resource.SOS.grammar.SOSEnumerationTerminal) printElement;
					printEnumerationTerminal(eObject, enumTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof SOS.resource.SOS.grammar.SOSWhiteSpace) {
				foundFormattingElements.add((SOS.resource.SOS.grammar.SOSWhiteSpace) printElement);
			}
			if (printElement instanceof SOS.resource.SOS.grammar.SOSLineBreak) {
				foundFormattingElements.add((SOS.resource.SOS.grammar.SOSLineBreak) printElement);
			}
			for (SOS.resource.SOS.mopp.SOSSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				SOS.resource.SOS.grammar.SOSSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof SOS.resource.SOS.grammar.SOSChoice) {
					break;
				}
			}
			if (cardinality == SOS.resource.SOS.grammar.SOSCardinality.ONE || cardinality == SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == SOS.resource.SOS.grammar.SOSCardinality.STAR || cardinality == SOS.resource.SOS.grammar.SOSCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(org.eclipse.emf.ecore.EObject eObject, SOS.resource.SOS.grammar.SOSKeyword keyword, java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements, java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations) {
		SOS.resource.SOS.mopp.SOSLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + SOS.resource.SOS.util.SOSStringUtil.escapeToANTLRKeyword(value) + "'"));
	}
	
	public void printFeature(org.eclipse.emf.ecore.EObject eObject, SOS.resource.SOS.grammar.SOSPlaceholder placeholder, int count, java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements, java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
			printAttribute(eObject, (org.eclipse.emf.ecore.EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (org.eclipse.emf.ecore.EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EAttribute attribute, SOS.resource.SOS.grammar.SOSPlaceholder placeholder, int count, java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements, java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations) {
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		SOS.resource.SOS.mopp.SOSLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName()));
		}
	}
	
	
	public void printBooleanTerminal(org.eclipse.emf.ecore.EObject eObject, SOS.resource.SOS.grammar.SOSBooleanTerminal booleanTerminal, int count, java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements, java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = booleanTerminal.getAttribute();
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		SOS.resource.SOS.mopp.SOSLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the boolean attribute is converted to its textual
			// representation using the literals of the boolean terminal
			if (Boolean.TRUE.equals(attributeValue)) {
				result = booleanTerminal.getTrueLiteral();
			} else {
				result = booleanTerminal.getFalseLiteral();
			}
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + SOS.resource.SOS.util.SOSStringUtil.escapeToANTLRKeyword(result) + "'"));
		}
	}
	
	
	public void printEnumerationTerminal(org.eclipse.emf.ecore.EObject eObject, SOS.resource.SOS.grammar.SOSEnumerationTerminal enumTerminal, int count, java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements, java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = enumTerminal.getAttribute();
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		SOS.resource.SOS.mopp.SOSLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, enumTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the enumeration attribute is converted to its textual
			// representation using the literals of the enumeration terminal
			assert attributeValue instanceof org.eclipse.emf.common.util.Enumerator;
			result = enumTerminal.getText(((org.eclipse.emf.common.util.Enumerator) attributeValue).getName());
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + SOS.resource.SOS.util.SOSStringUtil.escapeToANTLRKeyword(result) + "'"));
		}
	}
	
	
	public void printContainedObject(org.eclipse.emf.ecore.EObject eObject, SOS.resource.SOS.grammar.SOSContainment containment, int count, java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements, java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature reference = containment.getFeature();
		Object o = getValue(eObject, reference, count);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		startedPrintingContainedObject = false;
		currentTabs = 0;
		doPrint((org.eclipse.emf.ecore.EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements, java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations, SOS.resource.SOS.mopp.SOSLayoutInformation layoutInformation) {
		String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			if (layoutInformations != null) {
				layoutInformations.remove(layoutInformation);
			}
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			setTabsBeforeCurrentObject(0);
			return;
		}
		int printedTabs = 0;
		if (foundFormattingElements.size() > 0) {
			for (SOS.resource.SOS.grammar.SOSFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof SOS.resource.SOS.grammar.SOSWhiteSpace) {
					int amount = ((SOS.resource.SOS.grammar.SOSWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(SPACE_TOKEN);
					}
				}
				if (foundFormattingElement instanceof SOS.resource.SOS.grammar.SOSLineBreak) {
					currentTabs = ((SOS.resource.SOS.grammar.SOSLineBreak) foundFormattingElement).getTabs();
					printedTabs += currentTabs;
					tokenOutputStream.add(NEW_LINE_TOKEN);
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(TAB_TOKEN);
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		setTabsBeforeCurrentObject(printedTabs);
	}
	
	private void setTabsBeforeCurrentObject(int tabs) {
		if (startedPrintingContainedObject) {
			return;
		}
		tabsBeforeCurrentObject = tabsBeforeCurrentObject + tabs;
		startedPrintingContainedObject = true;
	}
	
	private Object getValue(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EStructuralFeature feature, int count) {
		// get value of feature
		Object o = eObject.eGet(feature);
		if (o instanceof java.util.List<?>) {
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			o = list.get(index);
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")	
	public void printReference(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EReference reference, SOS.resource.SOS.grammar.SOSPlaceholder placeholder, int count, java.util.List<SOS.resource.SOS.grammar.SOSFormattingElement> foundFormattingElements, java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations) {
		String tokenName = placeholder.getTokenName();
		Object referencedObject = getValue(eObject, reference, count);
		// first add layout before the reference
		SOS.resource.SOS.mopp.SOSLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		// proxy objects must be printed differently
		String deresolvedReference = null;
		if (referencedObject instanceof org.eclipse.emf.ecore.EObject) {
			org.eclipse.emf.ecore.EObject eObjectToDeResolve = (org.eclipse.emf.ecore.EObject) referencedObject;
			if (eObjectToDeResolve.eIsProxy()) {
				deresolvedReference = ((org.eclipse.emf.ecore.InternalEObject) eObjectToDeResolve).eProxyURI().fragment();
				if (deresolvedReference != null && deresolvedReference.startsWith(SOS.resource.SOS.ISOSContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX)) {
					deresolvedReference = deresolvedReference.substring(SOS.resource.SOS.ISOSContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX.length());
					deresolvedReference = deresolvedReference.substring(deresolvedReference.indexOf("_") + 1);
				}
			}
		}
		if (deresolvedReference == null) {
			// NC-References must always be printed by deresolving the reference. We cannot
			// use the visible token information, because deresolving usually depends on
			// attribute values of the referenced object instead of the object itself.
			@SuppressWarnings("rawtypes")			
			SOS.resource.SOS.ISOSReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
			referenceResolver.setOptions(getOptions());
			deresolvedReference = referenceResolver.deResolve((org.eclipse.emf.ecore.EObject) referencedObject, eObject, reference);
		}
		SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName));
	}
	
	public java.util.Map<String, Integer> initializePrintCountingMap(org.eclipse.emf.ecore.EObject eObject) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>();
		java.util.List<org.eclipse.emf.ecore.EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (org.eclipse.emf.ecore.EStructuralFeature feature : features) {
			int count = 0;
			Object featureValue = eObject.eGet(feature);
			if (featureValue != null) {
				if (featureValue instanceof java.util.List<?>) {
					count = ((java.util.List<?>) featureValue).size();
				} else {
					count = 1;
				}
			}
			printCountingMap.put(feature.getName(), count);
		}
		return printCountingMap;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public SOS.resource.SOS.ISOSTextResource getResource() {
		return resource;
	}
	
	protected SOS.resource.SOS.mopp.SOSReferenceResolverSwitch getReferenceResolverSwitch() {
		return (SOS.resource.SOS.mopp.SOSReferenceResolverSwitch) new SOS.resource.SOS.mopp.SOSMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		SOS.resource.SOS.ISOSTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new SOS.resource.SOS.mopp.SOSProblem(errorMessage, SOS.resource.SOS.SOSEProblemType.PRINT_PROBLEM, SOS.resource.SOS.SOSEProblemSeverity.WARNING), cause);
	}
	
	protected SOS.resource.SOS.mopp.SOSLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof SOS.resource.SOS.mopp.SOSLayoutInformationAdapter) {
				return (SOS.resource.SOS.mopp.SOSLayoutInformationAdapter) adapter;
			}
		}
		SOS.resource.SOS.mopp.SOSLayoutInformationAdapter newAdapter = new SOS.resource.SOS.mopp.SOSLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private SOS.resource.SOS.mopp.SOSLayoutInformation getLayoutInformation(java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations, SOS.resource.SOS.grammar.SOSSyntaxElement syntaxElement, Object object, org.eclipse.emf.ecore.EObject container) {
		for (SOS.resource.SOS.mopp.SOSLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				} else if (object == layoutInformation.getObject(container)) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	public java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> getCopyOfLayoutInformation(org.eclipse.emf.ecore.EObject eObject) {
		SOS.resource.SOS.mopp.SOSLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		java.util.List<SOS.resource.SOS.mopp.SOSLayoutInformation> layoutInformations = new java.util.ArrayList<SOS.resource.SOS.mopp.SOSLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		return layoutInformations;
	}
	
	private String getHiddenTokenText(SOS.resource.SOS.mopp.SOSLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(SOS.resource.SOS.mopp.SOSLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(java.io.PrintWriter writer) throws java.io.IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer.
	 * 
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * 
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 */
	public void printSmart(java.io.PrintWriter writer) throws java.io.IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				writer.write(currentBlock.toString());
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			SOS.resource.SOS.ISOSTextScanner scanner = new SOS.resource.SOS.mopp.SOSMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			java.util.List<SOS.resource.SOS.ISOSTextToken> tempTokens = new java.util.ArrayList<SOS.resource.SOS.ISOSTextToken>();
			SOS.resource.SOS.ISOSTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				SOS.resource.SOS.ISOSTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				writer.write(validBlock);
				// print separating whitespace
				writer.write(" ");
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
}
