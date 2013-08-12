grammar Pl;

options {
	superClass = PlANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package mprolog.resource.pl.mopp;
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
	package mprolog.resource.pl.mopp;
}

@members{
	private mprolog.resource.pl.IPlTokenResolverFactory tokenResolverFactory = new mprolog.resource.pl.mopp.PlTokenResolverFactory();
	
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
	private java.util.List<mprolog.resource.pl.mopp.PlExpectedTerminal> expectedElements = new java.util.ArrayList<mprolog.resource.pl.mopp.PlExpectedTerminal>();
	
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
		postParseCommands.add(new mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource>() {
			public boolean execute(mprolog.resource.pl.IPlTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new mprolog.resource.pl.IPlProblem() {
					public mprolog.resource.pl.PlEProblemSeverity getSeverity() {
						return mprolog.resource.pl.PlEProblemSeverity.ERROR;
					}
					public mprolog.resource.pl.PlEProblemType getType() {
						return mprolog.resource.pl.PlEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<mprolog.resource.pl.IPlQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(mprolog.resource.pl.IPlExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
		if (!this.rememberExpectedElements) {
			return;
		}
		mprolog.resource.pl.mopp.PlExpectedTerminal expectedElement = new mprolog.resource.pl.mopp.PlExpectedTerminal(terminal, followSetID, containmentTrace);
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
		postParseCommands.add(new mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource>() {
			public boolean execute(mprolog.resource.pl.IPlTextResource resource) {
				mprolog.resource.pl.IPlLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource>() {
			public boolean execute(mprolog.resource.pl.IPlTextResource resource) {
				mprolog.resource.pl.IPlLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource>() {
			public boolean execute(mprolog.resource.pl.IPlTextResource resource) {
				mprolog.resource.pl.IPlLocationMap locationMap = resource.getLocationMap();
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
	
	public mprolog.resource.pl.IPlTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new PlParser(new org.antlr.runtime3_3_0.CommonTokenStream(new PlLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new PlParser(new org.antlr.runtime3_3_0.CommonTokenStream(new PlLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			mprolog.resource.pl.mopp.PlPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public PlParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((PlLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((PlLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == mprolog.Model.class) {
				return parse_mprolog_Model();
			}
			if (type.getInstanceClass() == mprolog.Clause.class) {
				return parse_mprolog_Clause();
			}
			if (type.getInstanceClass() == mprolog.Head.class) {
				return parse_mprolog_Head();
			}
			if (type.getInstanceClass() == mprolog.Body.class) {
				return parse_mprolog_Body();
			}
			if (type.getInstanceClass() == mprolog.Variable.class) {
				return parse_mprolog_Variable();
			}
			if (type.getInstanceClass() == mprolog.Parenthesis.class) {
				return parse_mprolog_Parenthesis();
			}
			if (type.getInstanceClass() == mprolog.Functor.class) {
				return parse_mprolog_Functor();
			}
			if (type.getInstanceClass() == mprolog.QuotedAtom.class) {
				return parse_mprolog_QuotedAtom();
			}
			if (type.getInstanceClass() == mprolog.List.class) {
				return parse_mprolog_List();
			}
			if (type.getInstanceClass() == mprolog.InfixExpression.class) {
				return parse_mprolog_InfixExpression();
			}
			if (type.getInstanceClass() == mprolog.Operator.class) {
				return parse_mprolog_Operator();
			}
		}
		throw new mprolog.resource.pl.mopp.PlUnexpectedContentTypeException(typeObject);
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
			typeObject = options.get(mprolog.resource.pl.IPlOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public mprolog.resource.pl.IPlParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource>>();
		mprolog.resource.pl.mopp.PlParseResult parseResult = new mprolog.resource.pl.mopp.PlParseResult();
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
	
	public java.util.List<mprolog.resource.pl.mopp.PlExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, mprolog.resource.pl.IPlTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
		mprolog.resource.pl.IPlParseResult result = parse();
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
			for (mprolog.resource.pl.IPlCommand<mprolog.resource.pl.IPlTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<mprolog.resource.pl.mopp.PlExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<mprolog.resource.pl.mopp.PlExpectedTerminal>();
		java.util.List<mprolog.resource.pl.mopp.PlExpectedTerminal> newFollowSet = new java.util.ArrayList<mprolog.resource.pl.mopp.PlExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			mprolog.resource.pl.mopp.PlExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 53;
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
				for (mprolog.resource.pl.mopp.PlExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (mprolog.resource.pl.mopp.PlExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<mprolog.resource.pl.util.PlPair<mprolog.resource.pl.IPlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (mprolog.resource.pl.util.PlPair<mprolog.resource.pl.IPlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							mprolog.resource.pl.IPlExpectedElement newFollower = newFollowerPair.getLeft();
							mprolog.resource.pl.mopp.PlExpectedTerminal newFollowTerminal = new mprolog.resource.pl.mopp.PlExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
		for (mprolog.resource.pl.mopp.PlExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(mprolog.resource.pl.mopp.PlExpectedTerminal expectedElement, int tokenIndex) {
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
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_mprolog_Model{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_mprolog_Model returns [mprolog.Model element = null]
@init{
}
:
	(
		(
			a0_0 = parse_mprolog_Clause			{
				if (terminateParsing) {
					throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
				}
				if (element == null) {
					element = mprolog.MprologFactory.eINSTANCE.createModel();
					incompleteObjects.push(element);
				}
				if (a0_0 != null) {
					if (a0_0 != null) {
						Object value = a0_0;
						addObjectToList(element, mprolog.MprologPackage.MODEL__OWNED_CLAUSE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_0_0_0_0, a0_0, true);
					copyLocalizationInfos(a0_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
	}
	
;

parse_mprolog_Clause returns [mprolog.Clause element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_mprolog_Head				{
					if (terminateParsing) {
						throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
					}
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createClause();
						incompleteObjects.push(element);
					}
					if (a0_0 != null) {
						if (a0_0 != null) {
							Object value = a0_0;
							element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.CLAUSE__OWNED_HEAD), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_1_0_0_0_0_0_0, a0_0, true);
						copyLocalizationInfos(a0_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 2);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 2);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 3);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 3);
	}
	
	(
		(
			a1 = ':-' {
				if (element == null) {
					element = mprolog.MprologFactory.eINSTANCE.createClause();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_1_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
			}
			
			(
				a2_0 = parse_mprolog_Body				{
					if (terminateParsing) {
						throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
					}
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createClause();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.CLAUSE__OWNED_BODY), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_1_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 5);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 6);
	}
	
	a3 = '.' {
		if (element == null) {
			element = mprolog.MprologFactory.eINSTANCE.createClause();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_1_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 7, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 7, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 7, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 7, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
	}
	
;

parse_mprolog_Head returns [mprolog.Head element = null]
@init{
}
:
	(
		a0_0 = parse_mprolog_Functor		{
			if (terminateParsing) {
				throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
			}
			if (element == null) {
				element = mprolog.MprologFactory.eINSTANCE.createHead();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.HEAD__OWNED_FUNCTOR), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_2_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 8);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 8);
	}
	
;

parse_mprolog_Body returns [mprolog.Body element = null]
@init{
}
:
	(
		a0_0 = parse_mprolog_Term		{
			if (terminateParsing) {
				throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
			}
			if (element == null) {
				element = mprolog.MprologFactory.eINSTANCE.createBody();
				incompleteObjects.push(element);
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					Object value = a0_0;
					element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.BODY__OWNED_TERM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_3_0_0_0, a0_0, true);
				copyLocalizationInfos(a0_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 9);
	}
	
;

parse_mprolog_Variable returns [mprolog.Variable element = null]
@init{
}
:
	(
		a0 = VARIABLE		
		{
			if (terminateParsing) {
				throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
			}
			if (element == null) {
				element = mprolog.MprologFactory.eINSTANCE.createVariable();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				mprolog.resource.pl.IPlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VARIABLE");
				tokenResolver.setOptions(getOptions());
				mprolog.resource.pl.IPlTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(mprolog.MprologPackage.VARIABLE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.VARIABLE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_4_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_9, 10);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 10);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 10);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 10);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 10);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 10);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 10, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
	(
		(
			a1 = ',' {
				if (element == null) {
					element = mprolog.MprologFactory.eINSTANCE.createVariable();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_4_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
			}
			
			(
				a2_0 = parse_mprolog_Term				{
					if (terminateParsing) {
						throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
					}
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createVariable();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.VARIABLE__NEXT_TERM), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_4_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 12);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 12);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 12);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 12);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 12);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 12, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 13);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 13);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 13);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 13);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 13);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 13, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
;

parse_mprolog_Parenthesis returns [mprolog.Parenthesis element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = mprolog.MprologFactory.eINSTANCE.createParenthesis();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
	}
	
	(
		a1_0 = parse_mprolog_Term		{
			if (terminateParsing) {
				throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
			}
			if (element == null) {
				element = mprolog.MprologFactory.eINSTANCE.createParenthesis();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.PARENTHESIS__OWNED_TERM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_5_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 15);
	}
	
	a2 = ')' {
		if (element == null) {
			element = mprolog.MprologFactory.eINSTANCE.createParenthesis();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_15, 16);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 16);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 16);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 16);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 16);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 16);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 16, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
	(
		(
			a3 = ',' {
				if (element == null) {
					element = mprolog.MprologFactory.eINSTANCE.createParenthesis();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_5_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
			}
			
			(
				a4_0 = parse_mprolog_Term				{
					if (terminateParsing) {
						throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
					}
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createParenthesis();
						incompleteObjects.push(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.PARENTHESIS__NEXT_TERM), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_5_0_0_3_0_0_1, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 18);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 18);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 18);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 18);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 18);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 18, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 19);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 19);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 19);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 19);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 19);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 19, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
;

parse_mprolog_Functor returns [mprolog.Functor element = null]
@init{
}
:
	(
		(
			a0 = NUMBER			
			{
				if (terminateParsing) {
					throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
				}
				if (element == null) {
					element = mprolog.MprologFactory.eINSTANCE.createFunctor();
					incompleteObjects.push(element);
				}
				if (a0 != null) {
					mprolog.resource.pl.IPlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NUMBER");
					tokenResolver.setOptions(getOptions());
					mprolog.resource.pl.IPlTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6_0_0_0_0_0_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_16, 20);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 20);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 20);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 20);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 20);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 20);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 20);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 20, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
		}
		
		
		|		(
			a1 = ATOM			
			{
				if (terminateParsing) {
					throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
				}
				if (element == null) {
					element = mprolog.MprologFactory.eINSTANCE.createFunctor();
					incompleteObjects.push(element);
				}
				if (a1 != null) {
					mprolog.resource.pl.IPlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ATOM");
					tokenResolver.setOptions(getOptions());
					mprolog.resource.pl.IPlTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String) resolvedObject;
					if (resolved != null) {
						Object value = resolved;
						element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__TEXT), value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6_0_0_0_0_1_0, resolved, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_17, 21);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_16, 21);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 21);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 21);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 21);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 21);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 21);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 21);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 21, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
		}
		
		(
			(
				a2 = '(' {
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createFunctor();
						incompleteObjects.push(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6_0_0_0_0_1_1_0_0_0, null, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
				}
				
				(
					a3_0 = parse_mprolog_Term					{
						if (terminateParsing) {
							throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
						}
						if (element == null) {
							element = mprolog.MprologFactory.eINSTANCE.createFunctor();
							incompleteObjects.push(element);
						}
						if (a3_0 != null) {
							if (a3_0 != null) {
								Object value = a3_0;
								element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__OWNED_TERM), value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6_0_0_0_0_1_1_0_0_1, a3_0, true);
							copyLocalizationInfos(a3_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 23);
				}
				
				a4 = ')' {
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createFunctor();
						incompleteObjects.push(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6_0_0_0_0_1_1_0_0_2, null, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_16, 24);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 24);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 24);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 24);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 24);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 24);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 24);
					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 24, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
				}
				
			)
			
		)?		{
			// expected elements (follow set)
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_16, 25);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 25);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 25);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 25);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 25);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 25);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 25);
			addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 25, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_16, 26);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 26);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 26);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 26);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 26);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 26);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 26);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 26, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
	(
		(
			a5 = ',' {
				if (element == null) {
					element = mprolog.MprologFactory.eINSTANCE.createFunctor();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
			}
			
			(
				a6_0 = parse_mprolog_Term				{
					if (terminateParsing) {
						throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
					}
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createFunctor();
						incompleteObjects.push(element);
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							Object value = a6_0;
							element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.FUNCTOR__NEXT_TERM), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6_0_0_1_0_0_1, a6_0, true);
						copyLocalizationInfos(a6_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 28);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 28);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 28);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 28);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 28);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 28);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 28, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 29);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 29);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 29);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 29);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 29);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 29);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 29, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
;

parse_mprolog_QuotedAtom returns [mprolog.QuotedAtom element = null]
@init{
}
:
	(
		a0 = QUOTED_39_39		
		{
			if (terminateParsing) {
				throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
			}
			if (element == null) {
				element = mprolog.MprologFactory.eINSTANCE.createQuotedAtom();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				mprolog.resource.pl.IPlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39");
				tokenResolver.setOptions(getOptions());
				mprolog.resource.pl.IPlTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(mprolog.MprologPackage.QUOTED_ATOM__TEXT), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.QUOTED_ATOM__TEXT), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_7_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_18, 30);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 30);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 30);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 30);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 30);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 30);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 30, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
	(
		(
			a1 = ',' {
				if (element == null) {
					element = mprolog.MprologFactory.eINSTANCE.createQuotedAtom();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_7_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
			}
			
			(
				a2_0 = parse_mprolog_Term				{
					if (terminateParsing) {
						throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
					}
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createQuotedAtom();
						incompleteObjects.push(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.QUOTED_ATOM__NEXT_TERM), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_7_0_0_1_0_0_1, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 32);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 32);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 32);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 32);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 32);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 32, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 33);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 33);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 33);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 33);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 33);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 33, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
;

parse_mprolog_List returns [mprolog.List element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = mprolog.MprologFactory.eINSTANCE.createList();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 34, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_9);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 34, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_9);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 34, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_9);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 34, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_9);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 34, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_9);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 34, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_9);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 34, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_9);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 34);
	}
	
	(
		(
			(
				a1_0 = parse_mprolog_Term				{
					if (terminateParsing) {
						throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
					}
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createList();
						incompleteObjects.push(element);
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							Object value = a1_0;
							element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.LIST__OWNED_HEAD_TERMS), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_1_0_0_0, a1_0, true);
						copyLocalizationInfos(a1_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 35);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 35);
			}
			
			(
				(
					a2 = '|' {
						if (element == null) {
							element = mprolog.MprologFactory.eINSTANCE.createList();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_1_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
					}
					
					(
						a3_0 = parse_mprolog_Term						{
							if (terminateParsing) {
								throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
							}
							if (element == null) {
								element = mprolog.MprologFactory.eINSTANCE.createList();
								incompleteObjects.push(element);
							}
							if (a3_0 != null) {
								if (a3_0 != null) {
									Object value = a3_0;
									element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.LIST__OWNED_TAIL_TERMS), value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_1_0_0_1_0_0_1, a3_0, true);
								copyLocalizationInfos(a3_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 37);
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 38);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 39);
	}
	
	a4 = ']' {
		if (element == null) {
			element = mprolog.MprologFactory.eINSTANCE.createList();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_19, 40);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 40);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 40);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 40);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 40);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 40);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 40, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
	(
		(
			a5 = ',' {
				if (element == null) {
					element = mprolog.MprologFactory.eINSTANCE.createList();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
			}
			
			(
				a6_0 = parse_mprolog_Term				{
					if (terminateParsing) {
						throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
					}
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createList();
						incompleteObjects.push(element);
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							Object value = a6_0;
							element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.LIST__NEXT_TERM), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_3_0_0_1, a6_0, true);
						copyLocalizationInfos(a6_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 42);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 42);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 42);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 42);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 42);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 42, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 43);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 43);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 43);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 43);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 43);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 43, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
;

parse_mprolog_InfixExpression returns [mprolog.InfixExpression element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = mprolog.MprologFactory.eINSTANCE.createInfixExpression();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
	}
	
	(
		a1_0 = parse_mprolog_Term		{
			if (terminateParsing) {
				throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
			}
			if (element == null) {
				element = mprolog.MprologFactory.eINSTANCE.createInfixExpression();
				incompleteObjects.push(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__LEFT_TERM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 45, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
	(
		a2_0 = parse_mprolog_Operator		{
			if (terminateParsing) {
				throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
			}
			if (element == null) {
				element = mprolog.MprologFactory.eINSTANCE.createInfixExpression();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__OWNED_OPERATOR), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
	}
	
	(
		a3_0 = parse_mprolog_Term		{
			if (terminateParsing) {
				throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
			}
			if (element == null) {
				element = mprolog.MprologFactory.eINSTANCE.createInfixExpression();
				incompleteObjects.push(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__RIGHT_TERM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_20, 47);
	}
	
	a4 = ')' {
		if (element == null) {
			element = mprolog.MprologFactory.eINSTANCE.createInfixExpression();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_21, 48);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 48);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 48);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 48);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 48);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 48);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 48, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
	(
		(
			a5 = ',' {
				if (element == null) {
					element = mprolog.MprologFactory.eINSTANCE.createInfixExpression();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
			}
			
			(
				a6_0 = parse_mprolog_Term				{
					if (terminateParsing) {
						throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
					}
					if (element == null) {
						element = mprolog.MprologFactory.eINSTANCE.createInfixExpression();
						incompleteObjects.push(element);
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							Object value = a6_0;
							element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.INFIX_EXPRESSION__NEXT_TERM), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9_0_0_5_0_0_1, a6_0, true);
						copyLocalizationInfos(a6_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 50);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 50);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 50);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 50);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 50);
				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 50, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 51);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 51);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 51);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 51);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 51);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 51, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
	}
	
;

parse_mprolog_Operator returns [mprolog.Operator element = null]
@init{
}
:
	(
		a0 = OPERATOR		
		{
			if (terminateParsing) {
				throw new mprolog.resource.pl.mopp.PlTerminateParsingException();
			}
			if (element == null) {
				element = mprolog.MprologFactory.eINSTANCE.createOperator();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				mprolog.resource.pl.IPlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("OPERATOR");
				tokenResolver.setOptions(getOptions());
				mprolog.resource.pl.IPlTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(mprolog.MprologPackage.OPERATOR__SYMBOL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(mprolog.MprologPackage.OPERATOR__SYMBOL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_10_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
	}
	
;

parse_mprolog_Term returns [mprolog.Term element = null]
:
	c0 = parse_mprolog_Variable{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_mprolog_Parenthesis{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_mprolog_Functor{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_mprolog_QuotedAtom{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_mprolog_List{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_mprolog_InfixExpression{ element = c5; /* this is a subclass or primitive expression choice */ }
	
;

COMMENT:
	('%'(~('\n'|'\r'|'\uffff'))*)
	{ _channel = 99; }
;
VARIABLE:
	(('A'..'Z' |  '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_')*)
;
ATOM:
	(( 'a'..'z' )('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_')*)
;
NUMBER:
	(('0'..'9'))
;
OPERATOR:
	(('='('='|'..')? | '/' | '>' | '<' | '\\='('=')? ) )
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
	{ _channel = 99; }
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
QUOTED_39_39:
	(('\'')(~('\''))*('\''))
;

