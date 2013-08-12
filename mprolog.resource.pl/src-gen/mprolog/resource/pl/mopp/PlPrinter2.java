/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package mprolog.resource.pl.mopp;

public class PlPrinter2 implements mprolog.resource.pl.IPlTextPrinter {
	
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
	private mprolog.resource.pl.IPlTextResource resource;
	
	private java.util.Map<?, ?> options;
	private java.io.OutputStream outputStream;
	protected java.util.List<PrintToken> tokenOutputStream;
	private mprolog.resource.pl.IPlTokenResolverFactory tokenResolverFactory = new mprolog.resource.pl.mopp.PlTokenResolverFactory();
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
	
	public PlPrinter2(java.io.OutputStream outputStream, mprolog.resource.pl.IPlTextResource resource) {
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
		java.util.List<mprolog.resource.pl.grammar.PlFormattingElement>  formattingElements = new java.util.ArrayList<mprolog.resource.pl.grammar.PlFormattingElement>();
		doPrint(element, formattingElements);
		// print all remaining formatting elements
		java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations = getCopyOfLayoutInformation(element);
		mprolog.resource.pl.mopp.PlLayoutInformation eofLayoutInformation = getLayoutInformation(layoutInformations, null, null, null);
		printFormattingElements(formattingElements, layoutInformations, eofLayoutInformation);
		java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof mprolog.Model) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_0, foundFormattingElements);
			return;
		}
		if (element instanceof mprolog.Clause) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_1, foundFormattingElements);
			return;
		}
		if (element instanceof mprolog.Head) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_2, foundFormattingElements);
			return;
		}
		if (element instanceof mprolog.Body) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_3, foundFormattingElements);
			return;
		}
		if (element instanceof mprolog.Variable) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_4, foundFormattingElements);
			return;
		}
		if (element instanceof mprolog.Parenthesis) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_5, foundFormattingElements);
			return;
		}
		if (element instanceof mprolog.Functor) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6, foundFormattingElements);
			return;
		}
		if (element instanceof mprolog.QuotedAtom) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_7, foundFormattingElements);
			return;
		}
		if (element instanceof mprolog.List) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8, foundFormattingElements);
			return;
		}
		if (element instanceof mprolog.InfixExpression) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9, foundFormattingElements);
			return;
		}
		if (element instanceof mprolog.Operator) {
			printInternal(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_10, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(org.eclipse.emf.ecore.EObject eObject, mprolog.resource.pl.grammar.PlSyntaxElement ruleElement, java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements) {
		java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations = getCopyOfLayoutInformation(eObject);
		mprolog.resource.pl.mopp.PlSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public mprolog.resource.pl.mopp.PlSyntaxElementDecorator getDecoratorTree(mprolog.resource.pl.grammar.PlSyntaxElement syntaxElement) {
		mprolog.resource.pl.grammar.PlSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		mprolog.resource.pl.mopp.PlSyntaxElementDecorator[] childDecorators = new mprolog.resource.pl.mopp.PlSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		mprolog.resource.pl.mopp.PlSyntaxElementDecorator decorator = new mprolog.resource.pl.mopp.PlSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(mprolog.resource.pl.mopp.PlSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject) {
		java.util.Map<String, Integer> printCountingMap = initializePrintCountingMap(eObject);
		java.util.List<mprolog.resource.pl.mopp.PlSyntaxElementDecorator> keywordsToPrint = new java.util.ArrayList<mprolog.resource.pl.mopp.PlSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (mprolog.resource.pl.mopp.PlSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference holded by
	 * eObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(mprolog.resource.pl.mopp.PlSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap, java.util.List<mprolog.resource.pl.mopp.PlSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		mprolog.resource.pl.grammar.PlSyntaxElement syntaxElement = decorator.getDecoratedElement();
		mprolog.resource.pl.grammar.PlCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			java.util.List<mprolog.resource.pl.mopp.PlSyntaxElementDecorator> subKeywordsToPrint = new java.util.ArrayList<mprolog.resource.pl.mopp.PlSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof mprolog.resource.pl.grammar.PlKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof mprolog.resource.pl.grammar.PlTerminal) {
				mprolog.resource.pl.grammar.PlTerminal terminal = (mprolog.resource.pl.grammar.PlTerminal) syntaxElement;
				org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
				if (feature == mprolog.resource.pl.grammar.PlGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				int countLeft = printCountingMap.get(feature.getName());
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					decorator.addIndexToPrint(countLeft);
					printCountingMap.put(feature.getName(), countLeft - 1);
					keepDecorating = true;
				}
			}
			if (syntaxElement instanceof mprolog.resource.pl.grammar.PlChoice) {
				// for choices we do print only the choice which does print at least one feature
				mprolog.resource.pl.mopp.PlSyntaxElementDecorator childToPrint = null;
				for (mprolog.resource.pl.mopp.PlSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
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
				for (mprolog.resource.pl.mopp.PlSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == mprolog.resource.pl.grammar.PlCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == mprolog.resource.pl.grammar.PlCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == mprolog.resource.pl.grammar.PlCardinality.STAR || cardinality == mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == mprolog.resource.pl.grammar.PlCardinality.ONE || cardinality == mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK) {
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
	public boolean doesPrintFeature(mprolog.resource.pl.mopp.PlSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap) {
		mprolog.resource.pl.grammar.PlSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof mprolog.resource.pl.grammar.PlTerminal) {
			mprolog.resource.pl.grammar.PlTerminal terminal = (mprolog.resource.pl.grammar.PlTerminal) syntaxElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			if (feature == mprolog.resource.pl.grammar.PlGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.get(feature.getName());
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (mprolog.resource.pl.mopp.PlSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(mprolog.resource.pl.mopp.PlSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements, java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations) {
		mprolog.resource.pl.grammar.PlSyntaxElement printElement = decorator.getDecoratedElement();
		mprolog.resource.pl.grammar.PlCardinality cardinality = printElement.getCardinality();
		java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> cloned = new java.util.ArrayList<mprolog.resource.pl.grammar.PlFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof mprolog.resource.pl.grammar.PlKeyword) {
					printKeyword(eObject, (mprolog.resource.pl.grammar.PlKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof mprolog.resource.pl.grammar.PlPlaceholder) {
					mprolog.resource.pl.grammar.PlPlaceholder placeholder = (mprolog.resource.pl.grammar.PlPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof mprolog.resource.pl.grammar.PlContainment) {
					mprolog.resource.pl.grammar.PlContainment containment = (mprolog.resource.pl.grammar.PlContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof mprolog.resource.pl.grammar.PlBooleanTerminal) {
					mprolog.resource.pl.grammar.PlBooleanTerminal booleanTerminal = (mprolog.resource.pl.grammar.PlBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof mprolog.resource.pl.grammar.PlEnumerationTerminal) {
					mprolog.resource.pl.grammar.PlEnumerationTerminal enumTerminal = (mprolog.resource.pl.grammar.PlEnumerationTerminal) printElement;
					printEnumerationTerminal(eObject, enumTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof mprolog.resource.pl.grammar.PlWhiteSpace) {
				foundFormattingElements.add((mprolog.resource.pl.grammar.PlWhiteSpace) printElement);
			}
			if (printElement instanceof mprolog.resource.pl.grammar.PlLineBreak) {
				foundFormattingElements.add((mprolog.resource.pl.grammar.PlLineBreak) printElement);
			}
			for (mprolog.resource.pl.mopp.PlSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				mprolog.resource.pl.grammar.PlSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof mprolog.resource.pl.grammar.PlChoice) {
					break;
				}
			}
			if (cardinality == mprolog.resource.pl.grammar.PlCardinality.ONE || cardinality == mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == mprolog.resource.pl.grammar.PlCardinality.STAR || cardinality == mprolog.resource.pl.grammar.PlCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(org.eclipse.emf.ecore.EObject eObject, mprolog.resource.pl.grammar.PlKeyword keyword, java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements, java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations) {
		mprolog.resource.pl.mopp.PlLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + mprolog.resource.pl.util.PlStringUtil.escapeToANTLRKeyword(value) + "'"));
	}
	
	public void printFeature(org.eclipse.emf.ecore.EObject eObject, mprolog.resource.pl.grammar.PlPlaceholder placeholder, int count, java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements, java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
			printAttribute(eObject, (org.eclipse.emf.ecore.EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (org.eclipse.emf.ecore.EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EAttribute attribute, mprolog.resource.pl.grammar.PlPlaceholder placeholder, int count, java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements, java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations) {
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		mprolog.resource.pl.mopp.PlLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			mprolog.resource.pl.IPlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
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
	
	
	public void printBooleanTerminal(org.eclipse.emf.ecore.EObject eObject, mprolog.resource.pl.grammar.PlBooleanTerminal booleanTerminal, int count, java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements, java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = booleanTerminal.getAttribute();
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		mprolog.resource.pl.mopp.PlLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
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
			tokenOutputStream.add(new PrintToken(result, "'" + mprolog.resource.pl.util.PlStringUtil.escapeToANTLRKeyword(result) + "'"));
		}
	}
	
	
	public void printEnumerationTerminal(org.eclipse.emf.ecore.EObject eObject, mprolog.resource.pl.grammar.PlEnumerationTerminal enumTerminal, int count, java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements, java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = enumTerminal.getAttribute();
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		mprolog.resource.pl.mopp.PlLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, enumTerminal, attributeValue, eObject);
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
			tokenOutputStream.add(new PrintToken(result, "'" + mprolog.resource.pl.util.PlStringUtil.escapeToANTLRKeyword(result) + "'"));
		}
	}
	
	
	public void printContainedObject(org.eclipse.emf.ecore.EObject eObject, mprolog.resource.pl.grammar.PlContainment containment, int count, java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements, java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations) {
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
	
	public void printFormattingElements(java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements, java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations, mprolog.resource.pl.mopp.PlLayoutInformation layoutInformation) {
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
			for (mprolog.resource.pl.grammar.PlFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof mprolog.resource.pl.grammar.PlWhiteSpace) {
					int amount = ((mprolog.resource.pl.grammar.PlWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(SPACE_TOKEN);
					}
				}
				if (foundFormattingElement instanceof mprolog.resource.pl.grammar.PlLineBreak) {
					currentTabs = ((mprolog.resource.pl.grammar.PlLineBreak) foundFormattingElement).getTabs();
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
	public void printReference(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EReference reference, mprolog.resource.pl.grammar.PlPlaceholder placeholder, int count, java.util.List<mprolog.resource.pl.grammar.PlFormattingElement> foundFormattingElements, java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations) {
		String tokenName = placeholder.getTokenName();
		Object referencedObject = getValue(eObject, reference, count);
		// first add layout before the reference
		mprolog.resource.pl.mopp.PlLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		// proxy objects must be printed differently
		String deresolvedReference = null;
		if (referencedObject instanceof org.eclipse.emf.ecore.EObject) {
			org.eclipse.emf.ecore.EObject eObjectToDeResolve = (org.eclipse.emf.ecore.EObject) referencedObject;
			if (eObjectToDeResolve.eIsProxy()) {
				deresolvedReference = ((org.eclipse.emf.ecore.InternalEObject) eObjectToDeResolve).eProxyURI().fragment();
				if (deresolvedReference != null && deresolvedReference.startsWith(mprolog.resource.pl.IPlContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX)) {
					deresolvedReference = deresolvedReference.substring(mprolog.resource.pl.IPlContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX.length());
					deresolvedReference = deresolvedReference.substring(deresolvedReference.indexOf("_") + 1);
				}
			}
		}
		if (deresolvedReference == null) {
			// NC-References must always be printed by deresolving the reference. We cannot
			// use the visible token information, because deresolving usually depends on
			// attribute values of the referenced object instead of the object itself.
			@SuppressWarnings("rawtypes")			
			mprolog.resource.pl.IPlReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
			referenceResolver.setOptions(getOptions());
			deresolvedReference = referenceResolver.deResolve((org.eclipse.emf.ecore.EObject) referencedObject, eObject, reference);
		}
		mprolog.resource.pl.IPlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
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
	
	public mprolog.resource.pl.IPlTextResource getResource() {
		return resource;
	}
	
	protected mprolog.resource.pl.mopp.PlReferenceResolverSwitch getReferenceResolverSwitch() {
		return (mprolog.resource.pl.mopp.PlReferenceResolverSwitch) new mprolog.resource.pl.mopp.PlMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		mprolog.resource.pl.IPlTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new mprolog.resource.pl.mopp.PlProblem(errorMessage, mprolog.resource.pl.PlEProblemType.PRINT_PROBLEM, mprolog.resource.pl.PlEProblemSeverity.WARNING), cause);
	}
	
	protected mprolog.resource.pl.mopp.PlLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof mprolog.resource.pl.mopp.PlLayoutInformationAdapter) {
				return (mprolog.resource.pl.mopp.PlLayoutInformationAdapter) adapter;
			}
		}
		mprolog.resource.pl.mopp.PlLayoutInformationAdapter newAdapter = new mprolog.resource.pl.mopp.PlLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private mprolog.resource.pl.mopp.PlLayoutInformation getLayoutInformation(java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations, mprolog.resource.pl.grammar.PlSyntaxElement syntaxElement, Object object, org.eclipse.emf.ecore.EObject container) {
		for (mprolog.resource.pl.mopp.PlLayoutInformation layoutInformation : layoutInformations) {
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
	
	public java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> getCopyOfLayoutInformation(org.eclipse.emf.ecore.EObject eObject) {
		mprolog.resource.pl.mopp.PlLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		java.util.List<mprolog.resource.pl.mopp.PlLayoutInformation> layoutInformations = new java.util.ArrayList<mprolog.resource.pl.mopp.PlLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		return layoutInformations;
	}
	
	private String getHiddenTokenText(mprolog.resource.pl.mopp.PlLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(mprolog.resource.pl.mopp.PlLayoutInformation layoutInformation) {
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
			mprolog.resource.pl.IPlTextScanner scanner = new mprolog.resource.pl.mopp.PlMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			java.util.List<mprolog.resource.pl.IPlTextToken> tempTokens = new java.util.ArrayList<mprolog.resource.pl.IPlTextToken>();
			mprolog.resource.pl.IPlTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				mprolog.resource.pl.IPlTextToken tempToken = tempTokens.get(t);
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
