grammar SOS;

options {
	superClass = SOSANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package SOS.resource.SOS.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
	}
}
@header{
	package SOS.resource.SOS.mopp;
}

@members{
	private SOS.resource.SOS.ISOSTokenResolverFactory tokenResolverFactory = new SOS.resource.SOS.mopp.SOSTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private java.util.List<SOS.resource.SOS.mopp.SOSExpectedTerminal> expectedElements = new java.util.ArrayList<SOS.resource.SOS.mopp.SOSExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource>() {
			public boolean execute(SOS.resource.SOS.ISOSTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new SOS.resource.SOS.ISOSProblem() {
					public SOS.resource.SOS.SOSEProblemSeverity getSeverity() {
						return SOS.resource.SOS.SOSEProblemSeverity.ERROR;
					}
					public SOS.resource.SOS.SOSEProblemType getType() {
						return SOS.resource.SOS.SOSEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<SOS.resource.SOS.ISOSQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(SOS.resource.SOS.ISOSExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
		if (!this.rememberExpectedElements) {
			return;
		}
		SOS.resource.SOS.mopp.SOSExpectedTerminal expectedElement = new SOS.resource.SOS.mopp.SOSExpectedTerminal(terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
			// clear list of expected elements
			this.expectedElements.clear();
		}
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource>() {
			public boolean execute(SOS.resource.SOS.ISOSTextResource resource) {
				SOS.resource.SOS.ISOSLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final org.antlr.runtime3_3_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource>() {
			public boolean execute(SOS.resource.SOS.ISOSTextResource resource) {
				SOS.resource.SOS.ISOSLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(java.util.Collection<SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource>() {
			public boolean execute(SOS.resource.SOS.ISOSTextResource resource) {
				SOS.resource.SOS.ISOSLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public SOS.resource.SOS.ISOSTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new SOSParser(new org.antlr.runtime3_3_0.CommonTokenStream(new SOSLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new SOSParser(new org.antlr.runtime3_3_0.CommonTokenStream(new SOSLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			SOS.resource.SOS.mopp.SOSPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public SOSParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((SOSLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((SOSLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == SOS.Semantics.class) {
				return parse_SOS_Semantics();
			}
			if (type.getInstanceClass() == SOS.Rule.class) {
				return parse_SOS_Rule();
			}
			if (type.getInstanceClass() == SOS.PremisseList.class) {
				return parse_SOS_PremisseList();
			}
			if (type.getInstanceClass() == SOS.AlgebraicConditionList.class) {
				return parse_SOS_AlgebraicConditionList();
			}
			if (type.getInstanceClass() == SOS.Conclusion.class) {
				return parse_SOS_Conclusion();
			}
			if (type.getInstanceClass() == SOS.Transition.class) {
				return parse_SOS_Transition();
			}
			if (type.getInstanceClass() == SOS.TypeJudment.class) {
				return parse_SOS_TypeJudment();
			}
			if (type.getInstanceClass() == SOS.AlgebraicCondition.class) {
				return parse_SOS_AlgebraicCondition();
			}
			if (type.getInstanceClass() == SOS.adtmm.ADT.class) {
				return parse_SOS_adtmm_ADT();
			}
			if (type.getInstanceClass() == SOS.adtmm.Operation.class) {
				return parse_SOS_adtmm_Operation();
			}
			if (type.getInstanceClass() == SOS.adtmm.Variable.class) {
				return parse_SOS_adtmm_Variable();
			}
			if (type.getInstanceClass() == SOS.adtmm.CondEquation.class) {
				return parse_SOS_adtmm_CondEquation();
			}
			if (type.getInstanceClass() == SOS.adtmm.VariableRef.class) {
				return parse_SOS_adtmm_VariableRef();
			}
			if (type.getInstanceClass() == SOS.adtmm.CTerm.class) {
				return parse_SOS_adtmm_CTerm();
			}
			if (type.getInstanceClass() == SOS.adtmm.Equation.class) {
				return parse_SOS_adtmm_Equation();
			}
			if (type.getInstanceClass() == SOS.adtmm.Inequation.class) {
				return parse_SOS_adtmm_Inequation();
			}
			if (type.getInstanceClass() == SOS.adtmm.AtomicSort.class) {
				return parse_SOS_adtmm_AtomicSort();
			}
			if (type.getInstanceClass() == SOS.adtmm.SortDeclaration.class) {
				return parse_SOS_adtmm_SortDeclaration();
			}
			if (type.getInstanceClass() == SOS.set.Set.class) {
				return parse_SOS_set_Set();
			}
			if (type.getInstanceClass() == SOS.set.ModelSet.class) {
				return parse_SOS_set_ModelSet();
			}
			if (type.getInstanceClass() == SOS.set.TransitionSystem.class) {
				return parse_SOS_set_TransitionSystem();
			}
			if (type.getInstanceClass() == SOS.set.SetConstructor.class) {
				return parse_SOS_set_SetConstructor();
			}
			if (type.getInstanceClass() == SOS.set.ForAllIn.class) {
				return parse_SOS_set_ForAllIn();
			}
			if (type.getInstanceClass() == SOS.set.ExistsIn.class) {
				return parse_SOS_set_ExistsIn();
			}
			if (type.getInstanceClass() == SOS.set.Union.class) {
				return parse_SOS_set_Union();
			}
			if (type.getInstanceClass() == SOS.set.Excluding.class) {
				return parse_SOS_set_Excluding();
			}
			if (type.getInstanceClass() == SOS.set.Intersection.class) {
				return parse_SOS_set_Intersection();
			}
			if (type.getInstanceClass() == SOS.set.ModelRelation.class) {
				return parse_SOS_set_ModelRelation();
			}
			if (type.getInstanceClass() == SOS.set.ModelClassAttribute.class) {
				return parse_SOS_set_ModelClassAttribute();
			}
			if (type.getInstanceClass() == SOS.set.ModelSort.class) {
				return parse_SOS_set_ModelSort();
			}
		}
		throw new SOS.resource.SOS.mopp.SOSUnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(org.antlr.runtime3_3_0.IntStream arg0, org.antlr.runtime3_3_0.RecognitionException arg1, int arg2, org.antlr.runtime3_3_0.BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(SOS.resource.SOS.ISOSOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public SOS.resource.SOS.ISOSParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource>>();
		SOS.resource.SOS.mopp.SOSParseResult parseResult = new SOS.resource.SOS.mopp.SOSParseResult();
		try {
			org.eclipse.emf.ecore.EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
			}
		} catch (org.antlr.runtime3_3_0.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime3_3_0.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<SOS.resource.SOS.mopp.SOSExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, SOS.resource.SOS.ISOSTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
		SOS.resource.SOS.ISOSParseResult result = parse();
		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
			org.antlr.runtime3_3_0.Lexer lexer = (org.antlr.runtime3_3_0.Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (SOS.resource.SOS.ISOSCommand<SOS.resource.SOS.ISOSTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<SOS.resource.SOS.mopp.SOSExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<SOS.resource.SOS.mopp.SOSExpectedTerminal>();
		java.util.List<SOS.resource.SOS.mopp.SOSExpectedTerminal> newFollowSet = new java.util.ArrayList<SOS.resource.SOS.mopp.SOSExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			SOS.resource.SOS.mopp.SOSExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 157;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_3_0.CommonToken nextToken = (org.antlr.runtime3_3_0.CommonToken) tokenStream.get(i);
			if (nextToken.getType() < 0) {
				break;
			}
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (SOS.resource.SOS.mopp.SOSExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (SOS.resource.SOS.mopp.SOSExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<SOS.resource.SOS.util.SOSPair<SOS.resource.SOS.ISOSExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (SOS.resource.SOS.util.SOSPair<SOS.resource.SOS.ISOSExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							SOS.resource.SOS.ISOSExpectedElement newFollower = newFollowerPair.getLeft();
							SOS.resource.SOS.mopp.SOSExpectedTerminal newFollowTerminal = new SOS.resource.SOS.mopp.SOSExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (SOS.resource.SOS.mopp.SOSExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(SOS.resource.SOS.mopp.SOSExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			org.antlr.runtime3_3_0.CommonToken tokenAtIndex = (org.antlr.runtime3_3_0.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(org.antlr.runtime3_3_0.IntStream input, int ttype, org.antlr.runtime3_3_0.BitSet follow) throws org.antlr.runtime3_3_0.RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	/**
	 * Translates errors thrown by the parser into human readable messages.
	 */
	public void reportError(final org.antlr.runtime3_3_0.RecognitionException e)  {
		String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
			String expectedTokenName = formatTokenName(mte.expecting);
			String actualTokenName = formatTokenName(e.token.getType());
			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_3_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_3_0.MismatchedTreeNodeException) e;
			String expectedTokenName = formatTokenName(mtne.expecting);
			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
		}
		// the resource may be null if the parser is used for code completion
		final String finalMessage = message;
		if (e.token instanceof org.antlr.runtime3_3_0.CommonToken) {
			final org.antlr.runtime3_3_0.CommonToken ct = (org.antlr.runtime3_3_0.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	/**
	 * Translates errors thrown by the lexer into human readable messages.
	 */
	public void reportLexicalError(final org.antlr.runtime3_3_0.RecognitionException e)  {
		String message = "";
		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
			org.antlr.runtime3_3_0.EarlyExitException eee = (org.antlr.runtime3_3_0.EarlyExitException) e;
			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedRangeException) {
			org.antlr.runtime3_3_0.MismatchedRangeException mre = (org.antlr.runtime3_3_0.MismatchedRangeException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
		}
		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
	}
	
	protected void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			this.incompleteObjects.pop();
		}
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_0, 0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_SOS_Semantics{ element = c0; }
		|  		c1 = parse_SOS_adtmm_ADT{ element = c1; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_SOS_Semantics returns [SOS.Semantics element = null]
@init{
}
:
	a0 = 'Semantics' {
		if (element == null) {
			element = SOS.SOSFactory.eINSTANCE.createSemantics();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 1, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 1, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 1, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			(
				a1_0 = parse_SOS_Rule				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.SOSFactory.eINSTANCE.createSemantics();
						incompleteObjects.push(element);
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							Object value = a1_0;
							addObjectToList(element, SOS.SOSPackage.SEMANTICS__RULES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_0_0_0_1_0_0_0, a1_0, true);
						copyLocalizationInfos(a1_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
			}
			
			
			|			(
				a2_0 = parse_SOS_adtmm_ADT				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.SOSFactory.eINSTANCE.createSemantics();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, SOS.SOSPackage.SEMANTICS__SIGNATURE, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_0_0_0_1_0_1_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
;

parse_SOS_Rule returns [SOS.Rule element = null]
@init{
}
:
	(
		(
			a0 = 'Assuming' {
				if (element == null) {
					element = SOS.SOSFactory.eINSTANCE.createRule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_0_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3);
			}
			
			(
				a1_0 = parse_SOS_PremisseList				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.SOSFactory.eINSTANCE.createRule();
						incompleteObjects.push(element);
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							Object value = a1_0;
							element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.RULE__ASSUMES), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_0_0_0_0_0_0_1, a1_0, true);
						copyLocalizationInfos(a1_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 6);
			}
			
			a2 = 'Then' {
				if (element == null) {
					element = SOS.SOSFactory.eINSTANCE.createRule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_0_0_0_0_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
			}
			
			(
				a3_0 = parse_SOS_Conclusion				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.SOSFactory.eINSTANCE.createRule();
						incompleteObjects.push(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.RULE__CONCLUDES), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_0_0_0_0_0_0_3, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 8);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 9);
			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
		}
		
		
		|		(
			a4 = 'Fact' {
				if (element == null) {
					element = SOS.SOSFactory.eINSTANCE.createRule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_0_0_1_0_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9);
			}
			
			(
				a5_0 = parse_SOS_Conclusion				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.SOSFactory.eINSTANCE.createRule();
						incompleteObjects.push(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.RULE__CONCLUDES), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_0_0_1_0_0_0_1, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 12);
			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 13);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 13, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 13, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 13, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a6 = 'Where' {
				if (element == null) {
					element = SOS.SOSFactory.eINSTANCE.createRule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_17, 14, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
			}
			
			(
				(
					a7_0 = parse_SOS_adtmm_Variable					{
						if (terminateParsing) {
							throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
						}
						if (element == null) {
							element = SOS.SOSFactory.eINSTANCE.createRule();
							incompleteObjects.push(element);
						}
						if (a7_0 != null) {
							if (a7_0 != null) {
								Object value = a7_0;
								addObjectToList(element, SOS.SOSPackage.RULE__OWNED_VARIABLES, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_1_0_0_1, a7_0, true);
							copyLocalizationInfos(a7_0, element);
						}
					}
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_17, 15, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 15, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 15, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 15, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 16, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 16, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 16, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
;

parse_SOS_PremisseList returns [SOS.PremisseList element = null]
@init{
}
:
	(
		a0_0 = parse_SOS_Condition		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.SOSFactory.eINSTANCE.createPremisseList();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.PREMISSE_LIST__HAS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_2_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_18, 17);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 17);
	}
	
	(
		(
			a1 = ',' {
				if (element == null) {
					element = SOS.SOSFactory.eINSTANCE.createPremisseList();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_2_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11);
			}
			
			(
				a2_0 = parse_SOS_PremisseList				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.SOSFactory.eINSTANCE.createPremisseList();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.PREMISSE_LIST__NEXT), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_2_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 19);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 20);
	}
	
;

parse_SOS_AlgebraicConditionList returns [SOS.AlgebraicConditionList element = null]
@init{
}
:
	(
		a0_0 = parse_SOS_AlgebraicCondition		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.SOSFactory.eINSTANCE.createAlgebraicConditionList();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION_LIST__HAS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_3_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 21);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 21);
	}
	
	(
		(
			a1 = ',' {
				if (element == null) {
					element = SOS.SOSFactory.eINSTANCE.createAlgebraicConditionList();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_3_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
			}
			
			(
				a2_0 = parse_SOS_AlgebraicConditionList				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.SOSFactory.eINSTANCE.createAlgebraicConditionList();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.ALGEBRAIC_CONDITION_LIST__NEXT), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_3_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 23);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 24);
	}
	
;

parse_SOS_Conclusion returns [SOS.Conclusion element = null]
@init{
}
:
	(
		a0_0 = parse_SOS_set_FinalCondition		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.SOSFactory.eINSTANCE.createConclusion();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.CONCLUSION__HAS), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_4_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 25, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 25, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 25, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
;

parse_SOS_Transition returns [SOS.Transition element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_SOS_adtmm_Term				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.SOSFactory.eINSTANCE.createTransition();
						incompleteObjects.push(element);
					}
					if (a0_0 != null) {
						if (a0_0 != null) {
							Object value = a0_0;
							element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__ENVIRONMENT), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_0_0_0_0, a0_0, true);
						copyLocalizationInfos(a0_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 26);
			}
			
			a1 = ':' {
				if (element == null) {
					element = SOS.SOSFactory.eINSTANCE.createTransition();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_0_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
	}
	
	(
		a2_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.SOSFactory.eINSTANCE.createTransition();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__PRE_STATE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_1, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_22, 29);
	}
	
	a3 = '->>' {
		if (element == null) {
			element = SOS.SOSFactory.eINSTANCE.createTransition();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
	}
	
	(
		a4_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.SOSFactory.eINSTANCE.createTransition();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__LABEL), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_3, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_23, 31);
	}
	
	a5 = '->>' {
		if (element == null) {
			element = SOS.SOSFactory.eINSTANCE.createTransition();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
	}
	
	(
		a6_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.SOSFactory.eINSTANCE.createTransition();
				incompleteObjects.push(element);
			}
			if (a6_0 != null) {
				if (a6_0 != null) {
					Object value = a6_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TRANSITION__POS_STATE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_5, a6_0, true);
				copyLocalizationInfos(a6_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 33, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 33, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 33, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 33);
	}
	
;

parse_SOS_TypeJudment returns [SOS.TypeJudment element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_SOS_adtmm_Term				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.SOSFactory.eINSTANCE.createTypeJudment();
						incompleteObjects.push(element);
					}
					if (a0_0 != null) {
						if (a0_0 != null) {
							Object value = a0_0;
							element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__ENVIRONMENT), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_6_0_0_0_0_0_0, a0_0, true);
						copyLocalizationInfos(a0_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 34);
			}
			
			a1 = ':' {
				if (element == null) {
					element = SOS.SOSFactory.eINSTANCE.createTypeJudment();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_6_0_0_0_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 35, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 35, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 35, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 35, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 35, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 35, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 35, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 35, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 35, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 35, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 36, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 36, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 36, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 36, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 36, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 36, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 36, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 36, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 36, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 36, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
	}
	
	(
		a2_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.SOSFactory.eINSTANCE.createTypeJudment();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__LEFT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_6_0_0_1, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 37);
	}
	
	a3 = '|-' {
		if (element == null) {
			element = SOS.SOSFactory.eINSTANCE.createTypeJudment();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_6_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
	}
	
	(
		a4_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.SOSFactory.eINSTANCE.createTypeJudment();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.SOSPackage.TYPE_JUDMENT__RIGHT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_6_0_0_3, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 39);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 39);
	}
	
;

parse_SOS_AlgebraicCondition returns [SOS.AlgebraicCondition element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = SOS.SOSFactory.eINSTANCE.createAlgebraicCondition();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 40, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 40, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 40, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 40, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 40, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 40, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 40, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 40, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 40, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 40, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
	}
	
	(
		a1_0 = parse_SOS_adtmm_AbstractEquation		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.SOSFactory.eINSTANCE.createAlgebraicCondition();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					addObjectToList(element, SOS.SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_7_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_35, 41);
	}
	
	a2 = ')' {
		if (element == null) {
			element = SOS.SOSFactory.eINSTANCE.createAlgebraicCondition();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_7_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_18, 42);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 42);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 42);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 42);
	}
	
	
	|	(
		a3_0 = parse_SOS_adtmm_AbstractEquation		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.SOSFactory.eINSTANCE.createAlgebraicCondition();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					addObjectToList(element, SOS.SOSPackage.ALGEBRAIC_CONDITION__OWNED_CONDITIONS, value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_7_0_1_0, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_18, 43);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 43);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 43);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 43);
	}
	
;

parse_SOS_adtmm_ADT returns [SOS.adtmm.ADT element = null]
@init{
}
:
	a0 = 'ADT' {
		if (element == null) {
			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_36, 44);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ADT__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_37, 45);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_38, 45);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 45);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 45);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 45);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 45, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 45, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 45, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a2 = 'Sorts' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_42, 46, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_19);
			}
			
			(
				(
					a3_0 = parse_SOS_adtmm_SortDeclaration					{
						if (terminateParsing) {
							throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
						}
						if (element == null) {
							element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
							incompleteObjects.push(element);
						}
						if (a3_0 != null) {
							if (a3_0 != null) {
								Object value = a3_0;
								addObjectToList(element, SOS.adtmm.AdtmmPackage.ADT__OWNED_SORTS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_2_0_0_1, a3_0, true);
							copyLocalizationInfos(a3_0, element);
						}
					}
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_42, 47, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_19);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_38, 47);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 47);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 47);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 47);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 47, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 47, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 47, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_38, 48);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 48);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 48);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 48);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 48, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 48, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 48, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a4 = 'Generators' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_43, 49, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_20);
			}
			
			(
				(
					a5_0 = parse_SOS_adtmm_Operation					{
						if (terminateParsing) {
							throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
						}
						if (element == null) {
							element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
							incompleteObjects.push(element);
						}
						if (a5_0 != null) {
							if (a5_0 != null) {
								Object value = a5_0;
								addObjectToList(element, SOS.adtmm.AdtmmPackage.ADT__OWNED_GENERATORS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_3_0_0_1, a5_0, true);
							copyLocalizationInfos(a5_0, element);
						}
					}
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_43, 50, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_20);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 50);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 50);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 50);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 50, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 50, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 50, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 51);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 51);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 51);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 51, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 51, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 51, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a6 = 'Operations' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_43, 52, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
			}
			
			(
				(
					a7_0 = parse_SOS_adtmm_Operation					{
						if (terminateParsing) {
							throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
						}
						if (element == null) {
							element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
							incompleteObjects.push(element);
						}
						if (a7_0 != null) {
							if (a7_0 != null) {
								Object value = a7_0;
								addObjectToList(element, SOS.adtmm.AdtmmPackage.ADT__OWNED_OPERATIONS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_4_0_0_1, a7_0, true);
							copyLocalizationInfos(a7_0, element);
						}
					}
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_43, 53, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 53);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 53);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 53, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 53, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 53, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 54);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 54);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 54, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 54, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 54, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a8 = 'Axioms' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_44, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
			}
			
			(
				(
					a9_0 = parse_SOS_adtmm_CondEquation					{
						if (terminateParsing) {
							throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
						}
						if (element == null) {
							element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
							incompleteObjects.push(element);
						}
						if (a9_0 != null) {
							if (a9_0 != null) {
								Object value = a9_0;
								addObjectToList(element, SOS.adtmm.AdtmmPackage.ADT__OWNED_AXIOMS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_5_0_0_1, a9_0, true);
							copyLocalizationInfos(a9_0, element);
						}
					}
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_44, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 56);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 57);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 57, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 57, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 57, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a10 = 'Where' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_17, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
			}
			
			(
				(
					a11_0 = parse_SOS_adtmm_Variable					{
						if (terminateParsing) {
							throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
						}
						if (element == null) {
							element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
							incompleteObjects.push(element);
						}
						if (a11_0 != null) {
							if (a11_0 != null) {
								Object value = a11_0;
								addObjectToList(element, SOS.adtmm.AdtmmPackage.ADT__OWNED_VARIABLES, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_6_0_0_1, a11_0, true);
							copyLocalizationInfos(a11_0, element);
						}
					}
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_17, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 60, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 60, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 60, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
;

parse_SOS_adtmm_Operation returns [SOS.adtmm.Operation element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createOperation();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_9_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_45, 61);
	}
	
	a1 = ':' {
		if (element == null) {
			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_9_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 62, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_47, 62, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_48, 62, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_49, 62);
	}
	
	(
		(
			a2_0 = parse_SOS_adtmm_Sort			{
				if (terminateParsing) {
					throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
				}
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createOperation();
					incompleteObjects.push(element);
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						Object value = a2_0;
						addObjectToList(element, SOS.adtmm.AdtmmPackage.OPERATION__OPERATION_SORTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_9_0_0_2, a2_0, true);
					copyLocalizationInfos(a2_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 63, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_47, 63, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_48, 63, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_49, 63);
	}
	
	a3 = '->' {
		if (element == null) {
			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_9_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 64, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_26);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_47, 64, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_26);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_48, 64, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_26);
	}
	
	(
		a4_0 = parse_SOS_adtmm_Sort		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createOperation();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.OPERATION__RESULT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_9_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 65);
	}
	
	a5 = ';' {
		if (element == null) {
			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createOperation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_9_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_43, 66, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_20);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 66);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 66);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 66);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 66, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 66, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 66, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
;

parse_SOS_adtmm_Variable returns [SOS.adtmm.Variable element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createVariable();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_10_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 67);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 67);
	}
	
	(
		(
			a1 = ':' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createVariable();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_10_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 68, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_47, 68, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_48, 68, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
			}
			
			(
				a2_0 = parse_SOS_adtmm_Sort				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.adtmm.AdtmmFactory.eINSTANCE.createVariable();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE__VARIABLE_SORT), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_10_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 69);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 70);
	}
	
	a3 = ';' {
		if (element == null) {
			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createVariable();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_10_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_17, 71, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 71, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 71, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 71, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
;

parse_SOS_adtmm_CondEquation returns [SOS.adtmm.CondEquation element = null]
@init{
}
:
	(
		(
			a0 = '(' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCondEquation();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 72, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 72, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 72, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 72, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 72, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 72, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 72, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 72, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 72, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 72, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
			}
			
			(
				(
					a1_0 = parse_SOS_adtmm_AbstractEquation					{
						if (terminateParsing) {
							throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
						}
						if (element == null) {
							element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCondEquation();
							incompleteObjects.push(element);
						}
						if (a1_0 != null) {
							if (a1_0 != null) {
								Object value = a1_0;
								addObjectToList(element, SOS.adtmm.AdtmmPackage.COND_EQUATION__OWNED_CONDITIONS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11_0_0_0_0_0_1, a1_0, true);
							copyLocalizationInfos(a1_0, element);
						}
					}
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 73, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 73, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 73, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 73, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 73, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 73, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 73, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 73, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 73, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 73, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 73);
			}
			
			a2 = ')' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCondEquation();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11_0_0_0_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 74);
			}
			
			a3 = '=>' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCondEquation();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11_0_0_0_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
	}
	
	(
		a4_0 = parse_SOS_adtmm_Equation		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCondEquation();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.COND_EQUATION__OWNED_EQUATION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11_0_0_1, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 77);
	}
	
	a5 = ';' {
		if (element == null) {
			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCondEquation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_44, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 78);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
;

parse_SOS_adtmm_VariableRef returns [SOS.adtmm.VariableRef element = null]
@init{
}
:
	a0 = '@' {
		if (element == null) {
			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createVariableRef();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_12_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 79);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createVariableRef();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE_REF__VARIABLE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				SOS.adtmm.Variable proxy = SOS.adtmm.AdtmmFactory.eINSTANCE.createVariable();
				collectHiddenTokens(element);
				registerContextDependentProxy(new SOS.resource.SOS.mopp.SOSContextDependentURIFragmentFactory<SOS.adtmm.VariableRef, SOS.adtmm.Variable>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableRefVariableReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE_REF__VARIABLE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.VARIABLE_REF__VARIABLE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_12_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 80);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 80);
	}
	
;

parse_SOS_adtmm_CTerm returns [SOS.adtmm.CTerm element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCTerm();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OP), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				SOS.adtmm.Operation proxy = SOS.adtmm.AdtmmFactory.eINSTANCE.createOperation();
				collectHiddenTokens(element);
				registerContextDependentProxy(new SOS.resource.SOS.mopp.SOSContextDependentURIFragmentFactory<SOS.adtmm.CTerm, SOS.adtmm.Operation>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCTermOpReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OP), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__OP), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_59, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 81);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 81);
	}
	
	(
		(
			a1 = '^' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCTerm();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_60, 82);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 82, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 82, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 82, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 82, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 82, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 82, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 82, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 82, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 82, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 82, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
			}
			
			(
				(
					a2 = INTEGER					
					{
						if (terminateParsing) {
							throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
						}
						if (element == null) {
							element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCTerm();
							incompleteObjects.push(element);
						}
						if (a2 != null) {
							SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
							tokenResolver.setOptions(getOptions());
							SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
							tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__ITER), result);
							Object resolvedObject = result.getResolvedToken();
							if (resolvedObject == null) {
								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
							}
							java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
							if (resolved != null) {
								Object value = resolved;
								element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__ITER), value);
								completedElement(value, false);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13_0_0_1_0_0_1_0_0_0, resolved, true);
							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 83);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 83);
				}
				
				
				|				(
					a3_0 = parse_SOS_adtmm_Term					{
						if (terminateParsing) {
							throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
						}
						if (element == null) {
							element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCTerm();
							incompleteObjects.push(element);
						}
						if (a3_0 != null) {
							if (a3_0 != null) {
								Object value = a3_0;
								element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.CTERM__ITER_TERM), value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13_0_0_1_0_0_1_0_1_0, a3_0, true);
							copyLocalizationInfos(a3_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 84);
					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 84);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 85);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 85);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 86);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 86);
	}
	
	(
		(
			a4 = '(' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCTerm();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 87, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 87, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 87, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 87, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 87, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 87, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 87, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 87, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 87, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 87, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
			}
			
			(
				(
					a5_0 = parse_SOS_adtmm_Term					{
						if (terminateParsing) {
							throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
						}
						if (element == null) {
							element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCTerm();
							incompleteObjects.push(element);
						}
						if (a5_0 != null) {
							if (a5_0 != null) {
								Object value = a5_0;
								addObjectToList(element, SOS.adtmm.AdtmmPackage.CTERM__OWNED_TERMS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13_0_0_2_0_0_1, a5_0, true);
							copyLocalizationInfos(a5_0, element);
						}
					}
				)
				
			)+			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 88, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 88, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 88, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 88, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 88, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 88, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 88, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 88, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 88, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 88, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_61, 88);
			}
			
			a6 = ')' {
				if (element == null) {
					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCTerm();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13_0_0_2_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 89);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 89);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 90);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 90);
	}
	
;

parse_SOS_adtmm_Equation returns [SOS.adtmm.Equation element = null]
@init{
}
:
	(
		a0_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createEquation();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.EQUATION__OWNED_LEFT_TERM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_14_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 91);
	}
	
	a1 = '=' {
		if (element == null) {
			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createEquation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_14_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 92, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 92, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 92, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 92, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 92, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 92, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 92, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 92, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 92, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 92, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
	}
	
	(
		a2_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createEquation();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.EQUATION__OWNED_RIGHT_TERM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_14_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_35, 93);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 93, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 93, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 93, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 93, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 93, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 93, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 93, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 93, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 93, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 93, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 93);
	}
	
;

parse_SOS_adtmm_Inequation returns [SOS.adtmm.Inequation element = null]
@init{
}
:
	(
		a0_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createInequation();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.INEQUATION__OWNED_LEFT_TERM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_15_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 94);
	}
	
	a1 = '!=' {
		if (element == null) {
			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createInequation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_15_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
	}
	
	(
		a2_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createInequation();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.INEQUATION__OWNED_RIGHT_TERM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_15_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_35, 96);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 96);
	}
	
;

parse_SOS_adtmm_AtomicSort returns [SOS.adtmm.AtomicSort element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createAtomicSort();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ATOMIC_SORT__DECLARATION), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				SOS.adtmm.SortDeclaration proxy = SOS.adtmm.AdtmmFactory.eINSTANCE.createSortDeclaration();
				collectHiddenTokens(element);
				registerContextDependentProxy(new SOS.resource.SOS.mopp.SOSContextDependentURIFragmentFactory<SOS.adtmm.AtomicSort, SOS.adtmm.SortDeclaration>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAtomicSortDeclarationReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ATOMIC_SORT__DECLARATION), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.ATOMIC_SORT__DECLARATION), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_16_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 97, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_47, 97, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_48, 97, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_49, 97);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 97);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_62, 97);
	}
	
;

parse_SOS_adtmm_SortDeclaration returns [SOS.adtmm.SortDeclaration element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.adtmm.AdtmmFactory.eINSTANCE.createSortDeclaration();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.SORT_DECLARATION__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(SOS.adtmm.AdtmmPackage.SORT_DECLARATION__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_17_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_42, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_19);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_38, 98);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 98);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 98);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 98);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
	}
	
;

parse_SOS_set_Set returns [SOS.set.Set element = null]
@init{
}
:
	a0 = 'Set' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createSet();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_18_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_63, 99);
	}
	
	a1 = '(' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createSet();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_18_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 100, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_47, 100, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_48, 100, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
	}
	
	(
		a2_0 = parse_SOS_adtmm_Sort		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createSet();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.SET__SORT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_18_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_62, 101);
	}
	
	a3 = ')' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createSet();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_18_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 102, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_47, 102, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_48, 102, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_49, 102);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 102);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_62, 102);
	}
	
;

parse_SOS_set_ModelSet returns [SOS.set.ModelSet element = null]
@init{
}
:
	a0 = 'Model' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createModelSet();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_19_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 103);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 103);
	}
	
;

parse_SOS_set_TransitionSystem returns [SOS.set.TransitionSystem element = null]
@init{
}
:
	a0 = 'Transition' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createTransitionSystem();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_20_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_64, 104);
	}
	
	a1 = 'System' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createTransitionSystem();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_20_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 105);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 105);
	}
	
;

parse_SOS_set_SetConstructor returns [SOS.set.SetConstructor element = null]
@init{
}
:
	a0 = '{' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createSetConstructor();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 106, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 106, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 106, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 106, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 106, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 106, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 106, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 106, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 106, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 106, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 106);
	}
	
	(
		(
			(
				a1_0 = parse_SOS_adtmm_Term				{
					if (terminateParsing) {
						throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
					}
					if (element == null) {
						element = SOS.set.SetFactory.eINSTANCE.createSetConstructor();
						incompleteObjects.push(element);
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							Object value = a1_0;
							element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.SET_CONSTRUCTOR__MEMBER), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_1_0_0_0, a1_0, true);
						copyLocalizationInfos(a1_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 107);
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 107);
			}
			
			(
				(
					a2 = '|' {
						if (element == null) {
							element = SOS.set.SetFactory.eINSTANCE.createSetConstructor();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_1_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 108, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
					}
					
					(
						a3_0 = parse_SOS_AlgebraicConditionList						{
							if (terminateParsing) {
								throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
							}
							if (element == null) {
								element = SOS.set.SetFactory.eINSTANCE.createSetConstructor();
								incompleteObjects.push(element);
							}
							if (a3_0 != null) {
								if (a3_0 != null) {
									Object value = a3_0;
									element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.SET_CONSTRUCTOR__SUCH_THAT), value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_1_0_0_1_0_0_1, a3_0, true);
								copyLocalizationInfos(a3_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 109);
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 110);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 111);
	}
	
	a4 = '}' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createSetConstructor();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 112);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 112);
	}
	
;

parse_SOS_set_ForAllIn returns [SOS.set.ForAllIn element = null]
@init{
}
:
	a0 = 'in' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createForAllIn();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_65, 113);
	}
	
	a1 = '(' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createForAllIn();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 114, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 114, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 114, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 114, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 114, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 114, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 114, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 114, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 114, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 114, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
	}
	
	(
		a2_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createForAllIn();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.FOR_ALL_IN__LEFT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 115);
	}
	
	a3 = ',' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createForAllIn();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 116, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 116, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 116, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 116, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 116, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 116, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 116, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 116, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 116, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 116, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
	}
	
	(
		a4_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createForAllIn();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.FOR_ALL_IN__RIGHT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_66, 117);
	}
	
	a5 = ')' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createForAllIn();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 118);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 118);
	}
	
;

parse_SOS_set_ExistsIn returns [SOS.set.ExistsIn element = null]
@init{
}
:
	a0 = 'existsIn' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createExistsIn();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_67, 119);
	}
	
	a1 = '(' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createExistsIn();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 120, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 120, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 120, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 120, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 120, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 120, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 120, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 120, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 120, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 120, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
	}
	
	(
		a2_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createExistsIn();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXISTS_IN__LEFT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 121);
	}
	
	a3 = ',' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createExistsIn();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 122, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 122, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 122, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 122, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 122, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 122, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 122, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 122, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 122, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 122, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
	}
	
	(
		a4_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createExistsIn();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXISTS_IN__RIGHT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_68, 123);
	}
	
	a5 = ')' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createExistsIn();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 124);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 124);
	}
	
;

parse_SOS_set_Union returns [SOS.set.Union element = null]
@init{
}
:
	a0 = 'Union' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createUnion();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_69, 125);
	}
	
	a1 = '(' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createUnion();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 126, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 126, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 126, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 126, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 126, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 126, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 126, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 126, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 126, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 126, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
	}
	
	(
		a2_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createUnion();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.UNION__LEFT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 127);
	}
	
	a3 = ',' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createUnion();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 128, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 128, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 128, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 128, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 128, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 128, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 128, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 128, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 128, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 128, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
	}
	
	(
		a4_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createUnion();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.UNION__RIGHT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_70, 129);
	}
	
	a5 = ')' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createUnion();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 130);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 130);
	}
	
;

parse_SOS_set_Excluding returns [SOS.set.Excluding element = null]
@init{
}
:
	a0 = 'Excluding' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createExcluding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_71, 131);
	}
	
	a1 = '(' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createExcluding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 132, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 132, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 132, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 132, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 132, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 132, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 132, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 132, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 132, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 132, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
	}
	
	(
		a2_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createExcluding();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXCLUDING__LEFT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 133);
	}
	
	a3 = ',' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createExcluding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 134, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 134, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 134, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 134, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 134, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 134, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 134, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 134, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 134, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 134, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
	}
	
	(
		a4_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createExcluding();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.EXCLUDING__RIGHT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_72, 135);
	}
	
	a5 = ')' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createExcluding();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 136);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 136);
	}
	
;

parse_SOS_set_Intersection returns [SOS.set.Intersection element = null]
@init{
}
:
	a0 = 'Intersect' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createIntersection();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_73, 137);
	}
	
	a1 = '(' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createIntersection();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 138, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 138, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 138, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 138, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 138, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 138, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 138, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 138, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 138, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 138, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
	}
	
	(
		a2_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createIntersection();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.INTERSECTION__LEFT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 139);
	}
	
	a3 = ',' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createIntersection();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 140, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 140, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 140, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 140, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 140, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 140, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 140, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 140, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 140, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 140, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
	}
	
	(
		a4_0 = parse_SOS_adtmm_Term		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createIntersection();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.INTERSECTION__RIGHT_HAND_SIDE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_74, 141);
	}
	
	a5 = ')' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createIntersection();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 142);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 142);
	}
	
;

parse_SOS_set_ModelRelation returns [SOS.set.ModelRelation element = null]
@init{
}
:
	(
		a0_0 = parse_SOS_adtmm_VariableRef		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createModelRelation();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__SOURCE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_27_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 143);
	}
	
	a1 = '->' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createModelRelation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_27_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_75, 144);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createModelRelation();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__REFERENCE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__REFERENCE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_27_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_76, 145);
	}
	
	a3 = '->' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createModelRelation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_27_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 146, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_39);
	}
	
	(
		a4_0 = parse_SOS_adtmm_VariableRef		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createModelRelation();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_RELATION__TARGET), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_27_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 147);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 147);
	}
	
;

parse_SOS_set_ModelClassAttribute returns [SOS.set.ModelClassAttribute element = null]
@init{
}
:
	(
		a0_0 = parse_SOS_adtmm_VariableRef		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createModelClassAttribute();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_CLASS_ATTRIBUTE__SELECTOR), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_28_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 148);
	}
	
	a1 = '.' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createModelClassAttribute();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_28_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_77, 149);
	}
	
	(
		a2 = TEXT		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createModelClassAttribute();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_CLASS_ATTRIBUTE__ATTRIBUTE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_CLASS_ATTRIBUTE__ATTRIBUTE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_28_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 150);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 150);
	}
	
;

parse_SOS_set_ModelSort returns [SOS.set.ModelSort element = null]
@init{
}
:
	a0 = 'class' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createModelSort();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_29_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_78, 151);
	}
	
	a1 = '(' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createModelSort();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_29_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_79, 152);
	}
	
	(
		a2 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createModelSort();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__PACKAGE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__PACKAGE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_29_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_80, 153);
	}
	
	a3 = ',' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createModelSort();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_29_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_81, 154);
	}
	
	(
		a4 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new SOS.resource.SOS.mopp.SOSTerminateParsingException();
			}
			if (element == null) {
				element = SOS.set.SetFactory.eINSTANCE.createModelSort();
				incompleteObjects.push(element);
			}
			if (a4 != null) {
				SOS.resource.SOS.ISOSTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				SOS.resource.SOS.ISOSTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__CLASS_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(SOS.set.SetPackage.MODEL_SORT__CLASS_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_29_0_0_4, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_82, 155);
	}
	
	a5 = ')' {
		if (element == null) {
			element = SOS.set.SetFactory.eINSTANCE.createModelSort();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_29_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 156, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_47, 156, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_48, 156, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_49, 156);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 156);
		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_62, 156);
	}
	
;

parse_SOS_Condition returns [SOS.Condition element = null]
:
	c0 = parse_SOS_AlgebraicCondition{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_SOS_set_FinalCondition returns [SOS.set.FinalCondition element = null]
:
	c0 = parse_SOS_Transition{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_SOS_TypeJudment{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_SOS_adtmm_Term returns [SOS.adtmm.Term element = null]
:
	c0 = parse_SOS_Transition{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_SOS_TypeJudment{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_SOS_adtmm_VariableRef{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_SOS_adtmm_CTerm{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_SOS_set_ModelSet{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_SOS_set_TransitionSystem{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_SOS_set_SetConstructor{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_SOS_set_ForAllIn{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_SOS_set_ExistsIn{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_SOS_set_Union{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_SOS_set_Excluding{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_SOS_set_Intersection{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_SOS_set_ModelRelation{ element = c12; /* this is a subclass or primitive expression choice */ }
	|	c13 = parse_SOS_set_ModelClassAttribute{ element = c13; /* this is a subclass or primitive expression choice */ }
	
;

parse_SOS_adtmm_AbstractEquation returns [SOS.adtmm.AbstractEquation element = null]
:
	c0 = parse_SOS_adtmm_Equation{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_SOS_adtmm_Inequation{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_SOS_adtmm_Sort returns [SOS.adtmm.Sort element = null]
:
	c0 = parse_SOS_adtmm_AtomicSort{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_SOS_set_Set{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_SOS_set_ModelSort{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

COMMENT:
	('//'(~('\n'|'\r'|'\uffff'))*)
	{ _channel = 99; }
;
INTEGER:
	(('-')?('1'..'9')('0'..'9')*|'0')
;
FLOAT:
	(('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ )
	{ _channel = 99; }
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

