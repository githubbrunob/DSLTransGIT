grammar Dsltranstext;

options {
	superClass = DsltranstextANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package dsltrans.resource.dsltranstext.mopp;
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
	package dsltrans.resource.dsltranstext.mopp;
}

@members{
	private dsltrans.resource.dsltranstext.IDsltranstextTokenResolverFactory tokenResolverFactory = new dsltrans.resource.dsltranstext.mopp.DsltranstextTokenResolverFactory();
	
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
	private java.util.List<dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal> expectedElements = new java.util.ArrayList<dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal>();
	
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
		postParseCommands.add(new dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource>() {
			public boolean execute(dsltrans.resource.dsltranstext.IDsltranstextTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new dsltrans.resource.dsltranstext.IDsltranstextProblem() {
					public dsltrans.resource.dsltranstext.DsltranstextEProblemSeverity getSeverity() {
						return dsltrans.resource.dsltranstext.DsltranstextEProblemSeverity.ERROR;
					}
					public dsltrans.resource.dsltranstext.DsltranstextEProblemType getType() {
						return dsltrans.resource.dsltranstext.DsltranstextEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(dsltrans.resource.dsltranstext.IDsltranstextExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
		if (!this.rememberExpectedElements) {
			return;
		}
		dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal expectedElement = new dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal(terminal, followSetID, containmentTrace);
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
		postParseCommands.add(new dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource>() {
			public boolean execute(dsltrans.resource.dsltranstext.IDsltranstextTextResource resource) {
				dsltrans.resource.dsltranstext.IDsltranstextLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource>() {
			public boolean execute(dsltrans.resource.dsltranstext.IDsltranstextTextResource resource) {
				dsltrans.resource.dsltranstext.IDsltranstextLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource>() {
			public boolean execute(dsltrans.resource.dsltranstext.IDsltranstextTextResource resource) {
				dsltrans.resource.dsltranstext.IDsltranstextLocationMap locationMap = resource.getLocationMap();
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
	
	public dsltrans.resource.dsltranstext.IDsltranstextTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new DsltranstextParser(new org.antlr.runtime3_3_0.CommonTokenStream(new DsltranstextLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new DsltranstextParser(new org.antlr.runtime3_3_0.CommonTokenStream(new DsltranstextLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			dsltrans.resource.dsltranstext.mopp.DsltranstextPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public DsltranstextParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((DsltranstextLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((DsltranstextLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == dsltrans.TransformationModel.class) {
				return parse_dsltrans_TransformationModel();
			}
			if (type.getInstanceClass() == dsltrans.FilePort.class) {
				return parse_dsltrans_FilePort();
			}
			if (type.getInstanceClass() == dsltrans.MetaModelIdentifier.class) {
				return parse_dsltrans_MetaModelIdentifier();
			}
			if (type.getInstanceClass() == dsltrans.Sequential.class) {
				return parse_dsltrans_Sequential();
			}
			if (type.getInstanceClass() == dsltrans.Rule.class) {
				return parse_dsltrans_Rule();
			}
			if (type.getInstanceClass() == dsltrans.MatchModel.class) {
				return parse_dsltrans_MatchModel();
			}
			if (type.getInstanceClass() == dsltrans.ApplyModel.class) {
				return parse_dsltrans_ApplyModel();
			}
			if (type.getInstanceClass() == dsltrans.AnyMatchClass.class) {
				return parse_dsltrans_AnyMatchClass();
			}
			if (type.getInstanceClass() == dsltrans.ExistsMatchClass.class) {
				return parse_dsltrans_ExistsMatchClass();
			}
			if (type.getInstanceClass() == dsltrans.NegativeMatchClass.class) {
				return parse_dsltrans_NegativeMatchClass();
			}
			if (type.getInstanceClass() == dsltrans.ApplyClass.class) {
				return parse_dsltrans_ApplyClass();
			}
			if (type.getInstanceClass() == dsltrans.PositiveMatchAssociation.class) {
				return parse_dsltrans_PositiveMatchAssociation();
			}
			if (type.getInstanceClass() == dsltrans.NegativeMatchAssociation.class) {
				return parse_dsltrans_NegativeMatchAssociation();
			}
			if (type.getInstanceClass() == dsltrans.PositiveIndirectAssociation.class) {
				return parse_dsltrans_PositiveIndirectAssociation();
			}
			if (type.getInstanceClass() == dsltrans.NegativeIndirectAssociation.class) {
				return parse_dsltrans_NegativeIndirectAssociation();
			}
			if (type.getInstanceClass() == dsltrans.ApplyAssociation.class) {
				return parse_dsltrans_ApplyAssociation();
			}
			if (type.getInstanceClass() == dsltrans.MatchAttribute.class) {
				return parse_dsltrans_MatchAttribute();
			}
			if (type.getInstanceClass() == dsltrans.ApplyAttribute.class) {
				return parse_dsltrans_ApplyAttribute();
			}
			if (type.getInstanceClass() == dsltrans.PositiveBackwardRestriction.class) {
				return parse_dsltrans_PositiveBackwardRestriction();
			}
			if (type.getInstanceClass() == dsltrans.NegativeBackwardRestriction.class) {
				return parse_dsltrans_NegativeBackwardRestriction();
			}
			if (type.getInstanceClass() == dsltrans.Import.class) {
				return parse_dsltrans_Import();
			}
			if (type.getInstanceClass() == dsltrans.Atom.class) {
				return parse_dsltrans_Atom();
			}
			if (type.getInstanceClass() == dsltrans.AttributeRef.class) {
				return parse_dsltrans_AttributeRef();
			}
			if (type.getInstanceClass() == dsltrans.ClassRef.class) {
				return parse_dsltrans_ClassRef();
			}
			if (type.getInstanceClass() == dsltrans.Concat.class) {
				return parse_dsltrans_Concat();
			}
			if (type.getInstanceClass() == dsltrans.TypeOf.class) {
				return parse_dsltrans_TypeOf();
			}
			if (type.getInstanceClass() == dsltrans.Wildcard.class) {
				return parse_dsltrans_Wildcard();
			}
			if (type.getInstanceClass() == dsltrans.isNull.class) {
				return parse_dsltrans_isNull();
			}
			if (type.getInstanceClass() == dsltrans.Sequencer.class) {
				return parse_dsltrans_Sequencer();
			}
			if (type.getInstanceClass() == dsltrans.AttributeEquality.class) {
				return parse_dsltrans_AttributeEquality();
			}
			if (type.getInstanceClass() == dsltrans.AttributeInequality.class) {
				return parse_dsltrans_AttributeInequality();
			}
			if (type.getInstanceClass() == dsltrans.MatchMayBeSameRelation.class) {
				return parse_dsltrans_MatchMayBeSameRelation();
			}
			if (type.getInstanceClass() == dsltrans.ApplyMayBeSameRelation.class) {
				return parse_dsltrans_ApplyMayBeSameRelation();
			}
		}
		throw new dsltrans.resource.dsltranstext.mopp.DsltranstextUnexpectedContentTypeException(typeObject);
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
			typeObject = options.get(dsltrans.resource.dsltranstext.IDsltranstextOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public dsltrans.resource.dsltranstext.IDsltranstextParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource>>();
		dsltrans.resource.dsltranstext.mopp.DsltranstextParseResult parseResult = new dsltrans.resource.dsltranstext.mopp.DsltranstextParseResult();
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
	
	public java.util.List<dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, dsltrans.resource.dsltranstext.IDsltranstextTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
		dsltrans.resource.dsltranstext.IDsltranstextParseResult result = parse();
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
			for (dsltrans.resource.dsltranstext.IDsltranstextCommand<dsltrans.resource.dsltranstext.IDsltranstextTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal>();
		java.util.List<dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal> newFollowSet = new java.util.ArrayList<dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 267;
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
				for (dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<dsltrans.resource.dsltranstext.util.DsltranstextPair<dsltrans.resource.dsltranstext.IDsltranstextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (dsltrans.resource.dsltranstext.util.DsltranstextPair<dsltrans.resource.dsltranstext.IDsltranstextExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							dsltrans.resource.dsltranstext.IDsltranstextExpectedElement newFollower = newFollowerPair.getLeft();
							dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal newFollowTerminal = new dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
		for (dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(dsltrans.resource.dsltranstext.mopp.DsltranstextExpectedTerminal expectedElement, int tokenIndex) {
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
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_0, 0, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_1, 0, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_dsltrans_TransformationModel{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_dsltrans_TransformationModel returns [dsltrans.TransformationModel element = null]
@init{
}
:
	(
		(
			a0_0 = parse_dsltrans_AbstractSource			{
				if (terminateParsing) {
					throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
				}
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createTransformationModel();
					incompleteObjects.push(element);
				}
				if (a0_0 != null) {
					if (a0_0 != null) {
						Object value = a0_0;
						addObjectToList(element, dsltrans.DsltransPackage.TRANSFORMATION_MODEL__SOURCE, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_0_0_0_0, a0_0, true);
					copyLocalizationInfos(a0_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_0, 1, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_1, 1, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
	}
	
;

parse_dsltrans_FilePort returns [dsltrans.FilePort element = null]
@init{
}
:
	a0 = 'File' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_2, 2);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_3, 2);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 2, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a1 = 'id' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_5, 3);
			}
			
			a2 = '=' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_2_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_6, 4);
			}
			
			(
				a3 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
						incompleteObjects.push(element);
					}
					if (a3 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_2_0_0_4, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_3, 5);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 5, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_3, 6);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 6, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a4 = 'uri' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_7, 7);
			}
			
			a5 = '=' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_3_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_8, 8);
			}
			
			(
				a6 = QUOTED_39_39_92				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
						incompleteObjects.push(element);
					}
					if (a6 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__FILE_PATH_URI), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__FILE_PATH_URI), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_3_0_0_4, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 9, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 10, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
	}
	
	(
		a7_0 = parse_dsltrans_MetaModelIdentifier		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
				incompleteObjects.push(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.FILE_PORT__META_MODEL_ID), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_5, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_0, 11, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_1, 11, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
	}
	
;

parse_dsltrans_MetaModelIdentifier returns [dsltrans.MetaModelIdentifier element = null]
@init{
}
:
	a0 = 'metamodel' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_9, 12);
	}
	
	a1 = '(' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_10, 13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_11, 13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_12, 13);
	}
	
	(
		(
			a2 = 'mmname' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_13, 14);
			}
			
			a3 = '=' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_4_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_14, 15);
			}
			
			(
				a4 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
						incompleteObjects.push(element);
					}
					if (a4 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_4_0_0_4, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_11, 16);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_12, 16);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_11, 17);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_12, 17);
	}
	
	(
		(
			a5 = 'uri' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_15, 18);
			}
			
			a6 = '=' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_5_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_16, 19);
			}
			
			(
				a7 = QUOTED_39_39_92				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
						incompleteObjects.push(element);
					}
					if (a7 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_URI), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.META_MODEL_IDENTIFIER__META_MODEL_URI), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_5_0_0_4, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_12, 20);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_12, 21);
	}
	
	a8 = ')' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_0, 22, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_1, 22, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_17, 22, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_2);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_18, 22);
	}
	
;

parse_dsltrans_Sequential returns [dsltrans.Sequential element = null]
@init{
}
:
	a0 = 'def' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_19, 23);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_20, 23);
	}
	
	(
		(
			(
				a1 = QUOTED_39_39_92				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
						incompleteObjects.push(element);
					}
					if (a1 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_2_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_21, 24);
			}
			
			a2 = ':' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_2_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_20, 25);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_20, 26);
	}
	
	a3 = 'layer' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_22, 27);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_23, 27);
	}
	
	(
		(
			(
				a4 = QUOTED_39_39_92				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
						incompleteObjects.push(element);
					}
					if (a4 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_5_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_23, 28);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_23, 29);
	}
	
	a5 = 'previous' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_24, 30);
	}
	
	a6 = '=' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_25, 31);
	}
	
	(
		(
			a7 = QUOTED_39_39_92			
			{
				if (terminateParsing) {
					throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
				}
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
					incompleteObjects.push(element);
				}
				if (a7 != null) {
					dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
					tokenResolver.setOptions(getOptions());
					dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__PREVIOUS_SOURCE), result);
					Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
					}
					String resolved = (String) resolvedObject;
					dsltrans.AbstractSource proxy = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
					collectHiddenTokens(element);
					registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.Layer, dsltrans.AbstractSource>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getLayerPreviousSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__PREVIOUS_SOURCE), resolved, proxy);
					if (proxy != null) {
						Object value = proxy;
						addObjectToList(element, dsltrans.DsltransPackage.SEQUENTIAL__PREVIOUS_SOURCE, value);
						completedElement(value, false);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_11, proxy, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, proxy);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_25, 32);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_26, 32);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_27, 32);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 32, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a8 = 'group' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_13_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_28, 33);
			}
			
			a9 = '=' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_13_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_29, 34);
			}
			
			(
				a10 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
						incompleteObjects.push(element);
					}
					if (a10 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__GROUP_NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a10).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__GROUP_NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_13_0_0_4, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a10, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_27, 35);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 35, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_27, 36);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 36, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a11 = 'output' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_14_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_30, 37);
			}
			
			a12 = '=' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_14_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_31, 38);
			}
			
			(
				a13 = QUOTED_39_39_92				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
						incompleteObjects.push(element);
					}
					if (a13 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__OUTPUT_FILE_PATH_URI), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__OUTPUT_FILE_PATH_URI), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_14_0_0_4, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 39, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 40, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
	}
	
	(
		a14_0 = parse_dsltrans_MetaModelIdentifier		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
				incompleteObjects.push(element);
			}
			if (a14_0 != null) {
				if (a14_0 != null) {
					Object value = a14_0;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.SEQUENTIAL__META_MODEL_ID), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_15, a14_0, true);
				copyLocalizationInfos(a14_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_17, 41, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_2);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_18, 41);
	}
	
	(
		(
			(
				a15_0 = parse_dsltrans_Rule				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
						incompleteObjects.push(element);
					}
					if (a15_0 != null) {
						if (a15_0 != null) {
							Object value = a15_0;
							addObjectToList(element, dsltrans.DsltransPackage.SEQUENTIAL__HAS_RULE, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_17_0_0_0, a15_0, true);
						copyLocalizationInfos(a15_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_17, 42, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_2);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_18, 42);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_17, 43, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_2);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_18, 43);
	}
	
	a16 = 'end' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_19, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a16, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_32, 44);
	}
	
	a17 = 'def' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_21, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a17, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_0, 45, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_1, 45, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
	}
	
;

parse_dsltrans_Rule returns [dsltrans.Rule element = null]
@init{
}
:
	a0 = 'rule' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createRule();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_33, 46);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 46);
	}
	
	(
		(
			(
				a1 = QUOTED_39_39_92				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createRule();
						incompleteObjects.push(element);
					}
					if (a1 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_1_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 47);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 48);
	}
	
	(
		(
			a2 = 'match' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createRule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_35, 49, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_3);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_36, 49, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_3);
			}
			
			(
				a3_0 = parse_dsltrans_MatchModel				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createRule();
						incompleteObjects.push(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, dsltrans.DsltransPackage.RULE__MATCH, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_3_0_0_2, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 50);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 50);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 51);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 51);
	}
	
	(
		a4 = 'apply' {
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createRule();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_5_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_38, 52, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_5);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 52, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_5);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 52, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_5);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 52, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_5);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_42, 52, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_5);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 52);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 52);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 52);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 52);
		}
		
		(
			a5_0 = parse_dsltrans_ApplyModel			{
				if (terminateParsing) {
					throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
				}
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createRule();
					incompleteObjects.push(element);
				}
				if (a5_0 != null) {
					if (a5_0 != null) {
						Object value = a5_0;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.RULE__APPLY), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_5_0_0_2, a5_0, true);
					copyLocalizationInfos(a5_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 53);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 53);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 53);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 53);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 54);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 54);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 54);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 54);
	}
	
	(
		(
			a6 = 'where' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createRule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_7_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_47, 55, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_48, 55, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 55);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 55);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 55);
			}
			
			(
				(
					(
						a7_0 = parse_dsltrans_AbstractAttributeRelation						{
							if (terminateParsing) {
								throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
							}
							if (element == null) {
								element = dsltrans.DsltransFactory.eINSTANCE.createRule();
								incompleteObjects.push(element);
							}
							if (a7_0 != null) {
								if (a7_0 != null) {
									Object value = a7_0;
									addObjectToList(element, dsltrans.DsltransPackage.RULE__ATTRIBUTE_RELATIONS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_7_0_0_1_0_0_1, a7_0, true);
								copyLocalizationInfos(a7_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_47, 56, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_48, 56, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 56);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 56);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 56);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_47, 57, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_48, 57, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 57);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 57);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 57);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 58);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 58);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 58);
	}
	
	(
		(
			a8 = 'restrictions' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createRule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_49, 59, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_50, 59, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 59);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 59);
			}
			
			(
				(
					(
						a9_0 = parse_dsltrans_AbstractTemporalRelation						{
							if (terminateParsing) {
								throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
							}
							if (element == null) {
								element = dsltrans.DsltransFactory.eINSTANCE.createRule();
								incompleteObjects.push(element);
							}
							if (a9_0 != null) {
								if (a9_0 != null) {
									Object value = a9_0;
									addObjectToList(element, dsltrans.DsltransPackage.RULE__BACKWARDS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_9_0_0_2_0_0_0, a9_0, true);
								copyLocalizationInfos(a9_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_49, 60, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_50, 60, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 60);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 60);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_49, 61, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_50, 61, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 61);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 61);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 62);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 62);
	}
	
	(
		(
			a10 = 'import' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createRule();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_51, 63, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_8);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 63);
			}
			
			(
				(
					(
						a11_0 = parse_dsltrans_Import						{
							if (terminateParsing) {
								throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
							}
							if (element == null) {
								element = dsltrans.DsltransFactory.eINSTANCE.createRule();
								incompleteObjects.push(element);
							}
							if (a11_0 != null) {
								if (a11_0 != null) {
									Object value = a11_0;
									addObjectToList(element, dsltrans.DsltransPackage.RULE__IMPORTS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_11_0_0_2_0_0_0, a11_0, true);
								copyLocalizationInfos(a11_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_51, 64, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_8);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 64);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_51, 65, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_8);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 65);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 66);
	}
	
	a12 = 'end' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createRule();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_13, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_52, 67);
	}
	
	a13 = 'rule' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createRule();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_15, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_17, 68, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_2);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_18, 68);
	}
	
;

parse_dsltrans_MatchModel returns [dsltrans.MatchModel element = null]
@init{
}
:
	(
		(
			a0 = 'source' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_0_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_53, 69);
			}
			
			a1 = '=' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_0_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_54, 70);
			}
			
			(
				a2 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
						incompleteObjects.push(element);
					}
					if (a2 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						dsltrans.FilePort proxy = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
						collectHiddenTokens(element);
						registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchModel, dsltrans.FilePort>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchModelExplicitSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MODEL__EXPLICIT_SOURCE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_0_0_0_4, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_36, 71);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_36, 72);
	}
	
	a3 = 'with' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 73, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 73, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 73, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 73, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 73, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 73, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 73, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 73, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 73, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 73);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 73);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 73);
	}
	
	(
		(
			(
				a4_0 = parse_dsltrans_MatchClass				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
						incompleteObjects.push(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							addObjectToList(element, dsltrans.DsltransPackage.MATCH_MODEL__CLASS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_3_0_0_0, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 74, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 74, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 74, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 74, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 74, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 74, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 74, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 74, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 74, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 74);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 74);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 74);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 75, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 75, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 75, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 75, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 75, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 75, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 75, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 75, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 75, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 75);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 75);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 75);
	}
	
	(
		(
			a5 = 'subject' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_5_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_65, 76);
			}
			
			a6 = 'to' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_5_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 77, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 77, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 77, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 77, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 77, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 77);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 77);
			}
			
			(
				(
					(
						a7_0 = parse_dsltrans_MatchAssociation						{
							if (terminateParsing) {
								throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
							}
							if (element == null) {
								element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
								incompleteObjects.push(element);
							}
							if (a7_0 != null) {
								if (a7_0 != null) {
									Object value = a7_0;
									addObjectToList(element, dsltrans.DsltransPackage.MATCH_MODEL__ASSOCIATION, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_5_0_0_3_0_0_1, a7_0, true);
								copyLocalizationInfos(a7_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 78, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 78, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 78, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 78, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 78, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 78);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 78);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 79, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 79, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 79, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 79, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 79, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 79);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 79);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 80);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 80);
	}
	
;

parse_dsltrans_ApplyModel returns [dsltrans.ApplyModel element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_dsltrans_ApplyClass				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createApplyModel();
						incompleteObjects.push(element);
					}
					if (a0_0 != null) {
						if (a0_0 != null) {
							Object value = a0_0;
							addObjectToList(element, dsltrans.DsltransPackage.APPLY_MODEL__CLASS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_6_0_0_0_0_0_0, a0_0, true);
						copyLocalizationInfos(a0_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_38, 81, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 81, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 81, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 81, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_42, 81);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 81);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 81);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 81);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 81);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_38, 82, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 82, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 82, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 82, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_42, 82);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 82);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 82);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 82);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 82);
	}
	
	(
		(
			a1 = 'subject' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createApplyModel();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_6_0_0_1_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_71, 83);
			}
			
			a2 = 'to' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createApplyModel();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_6_0_0_1_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_72, 84, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_73, 84, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 84);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 84);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 84);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 84);
			}
			
			(
				(
					(
						a3_0 = parse_dsltrans_ApplyAssociation						{
							if (terminateParsing) {
								throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
							}
							if (element == null) {
								element = dsltrans.DsltransFactory.eINSTANCE.createApplyModel();
								incompleteObjects.push(element);
							}
							if (a3_0 != null) {
								if (a3_0 != null) {
									Object value = a3_0;
									addObjectToList(element, dsltrans.DsltransPackage.APPLY_MODEL__ASSOCIATION, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_6_0_0_1_0_0_2_0_0_1, a3_0, true);
								copyLocalizationInfos(a3_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_72, 85, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_73, 85, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 85);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 85);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 85);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 85);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_72, 86, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_73, 86, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 86);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 86);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 86);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 86);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 87);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 87);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 87);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 87);
	}
	
;

parse_dsltrans_AnyMatchClass returns [dsltrans.AnyMatchClass element = null]
@init{
}
:
	(
		(
			(
				a0 = DESCCOM				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
						incompleteObjects.push(element);
						// initialize boolean attribute
						{
							Object value = true;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
						}
					}
					if (a0 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DESCCOM");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_0_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 88);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 88);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 89);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 89);
	}
	
	(
		(
			(
				a1 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
						incompleteObjects.push(element);
						// initialize boolean attribute
						{
							Object value = true;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
						}
					}
					if (a1 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ID), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ID), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_2_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_74, 90);
			}
			
			a2 = ':' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 91);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 92);
	}
	
	a3 = 'any' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
			incompleteObjects.push(element);
			// initialize boolean attribute
			{
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_75, 93);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_76, 93);
	}
	
	(
		(
			(
				(
					a4 = 'strict' {
						if (element == null) {
							element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
							incompleteObjects.push(element);
							// initialize boolean attribute
							{
								Object value = true;
								element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
							}
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_5_0_0_0, false, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
						// set value of boolean attribute
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
						completedElement(value, false);
					}
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_76, 94);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_76, 95);
	}
	
	(
		a6 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				incompleteObjects.push(element);
				// initialize boolean attribute
				{
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
				}
			}
			if (a6 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__PACKAGE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__PACKAGE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_7, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_77, 96);
	}
	
	a7 = '::' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
			incompleteObjects.push(element);
			// initialize boolean attribute
			{
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_78, 97);
	}
	
	(
		a8 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				incompleteObjects.push(element);
				// initialize boolean attribute
				{
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
				}
			}
			if (a8 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__CLASS_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__CLASS_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_11, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a8, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_79, 98);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 98, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 98, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 98, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 98, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 98, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 98, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 98, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 98, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 98, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 98);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 98);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 98);
	}
	
	(
		(
			a9 = '(' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_12_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 99, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 99, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 99);
			}
			
			(
				(
					(
						a10_0 = parse_dsltrans_MatchAttribute						{
							if (terminateParsing) {
								throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
							}
							if (element == null) {
								element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
								incompleteObjects.push(element);
								// initialize boolean attribute
								{
									Object value = true;
									element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
								}
							}
							if (a10_0 != null) {
								if (a10_0 != null) {
									Object value = a10_0;
									addObjectToList(element, dsltrans.DsltransPackage.ANY_MATCH_CLASS__ATTRIBUTE, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_12_0_0_1_0_0_1, a10_0, true);
								copyLocalizationInfos(a10_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 100, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 100, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 100);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 101, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 101, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 101);
			}
			
			a11 = ')' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ANY_MATCH_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_7_0_0_12_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 102, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 102, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 102, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 102, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 102, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 102, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 102, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 102, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 102, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 102);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 102);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 102);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 103, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 103, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 103, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 103, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 103, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 103, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 103, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 103, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 103, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 103);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 103);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 103);
	}
	
;

parse_dsltrans_ExistsMatchClass returns [dsltrans.ExistsMatchClass element = null]
@init{
}
:
	(
		(
			(
				a0 = DESCCOM				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
						incompleteObjects.push(element);
						// initialize boolean attribute
						{
							Object value = true;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
						}
					}
					if (a0 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DESCCOM");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_0_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 104);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 104);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 105);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 105);
	}
	
	(
		(
			(
				a1 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
						incompleteObjects.push(element);
						// initialize boolean attribute
						{
							Object value = true;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
						}
					}
					if (a1 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ID), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ID), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_2_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_83, 106);
			}
			
			a2 = ':' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 107);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 108);
	}
	
	a3 = 'existing' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
			incompleteObjects.push(element);
			// initialize boolean attribute
			{
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_84, 109);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_85, 109);
	}
	
	(
		(
			(
				(
					a4 = 'strict' {
						if (element == null) {
							element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
							incompleteObjects.push(element);
							// initialize boolean attribute
							{
								Object value = true;
								element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
							}
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_4_0_0_0, false, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
						// set value of boolean attribute
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
						completedElement(value, false);
					}
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_85, 110);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_85, 111);
	}
	
	(
		a6 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
				incompleteObjects.push(element);
				// initialize boolean attribute
				{
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
				}
			}
			if (a6 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__PACKAGE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__PACKAGE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_6, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_86, 112);
	}
	
	a7 = '::' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
			incompleteObjects.push(element);
			// initialize boolean attribute
			{
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_87, 113);
	}
	
	(
		a8 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
				incompleteObjects.push(element);
				// initialize boolean attribute
				{
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
				}
			}
			if (a8 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__CLASS_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__CLASS_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_10, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a8, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_88, 114);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 114, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 114, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 114, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 114, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 114, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 114, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 114, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 114, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 114, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 114);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 114);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 114);
	}
	
	(
		(
			a9 = '(' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 115, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 115, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 115);
			}
			
			(
				(
					(
						a10_0 = parse_dsltrans_MatchAttribute						{
							if (terminateParsing) {
								throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
							}
							if (element == null) {
								element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
								incompleteObjects.push(element);
								// initialize boolean attribute
								{
									Object value = true;
									element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
								}
							}
							if (a10_0 != null) {
								if (a10_0 != null) {
									Object value = a10_0;
									addObjectToList(element, dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ATTRIBUTE, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_11_0_0_1_0_0_1, a10_0, true);
								copyLocalizationInfos(a10_0, element);
							}
						}
					)
					
				)*				{
					// expected elements (follow set)
					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 116, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 116, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 116);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 117);
			}
			
			a11 = ')' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createExistsMatchClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.EXISTS_MATCH_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_8_0_0_11_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 118, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 118, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 118, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 118, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 118, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 118, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 118, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 118, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 118, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 118);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 118);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 118);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 119, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 119, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 119, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 119, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 119, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 119, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 119, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 119, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 119, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 119);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 119);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 119);
	}
	
;

parse_dsltrans_NegativeMatchClass returns [dsltrans.NegativeMatchClass element = null]
@init{
}
:
	(
		(
			(
				a0 = DESCCOM				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
						incompleteObjects.push(element);
						// initialize boolean attribute
						{
							Object value = true;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
						}
					}
					if (a0 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DESCCOM");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_0_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 120);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 120);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 121);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 121);
	}
	
	(
		(
			(
				a1 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
						incompleteObjects.push(element);
						// initialize boolean attribute
						{
							Object value = true;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
						}
					}
					if (a1 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ID), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ID), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_2_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_90, 122);
			}
			
			a2 = ':' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 123);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 124);
	}
	
	a3 = 'not' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
			incompleteObjects.push(element);
			// initialize boolean attribute
			{
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_91, 125);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_92, 125);
	}
	
	(
		(
			(
				(
					a4 = 'strict' {
						if (element == null) {
							element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
							incompleteObjects.push(element);
							// initialize boolean attribute
							{
								Object value = true;
								element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
							}
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_4_0_0_0, false, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
						// set value of boolean attribute
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
						completedElement(value, false);
					}
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_92, 126);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_92, 127);
	}
	
	(
		a6 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
				incompleteObjects.push(element);
				// initialize boolean attribute
				{
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
				}
			}
			if (a6 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__PACKAGE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__PACKAGE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_6, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_93, 128);
	}
	
	a7 = '::' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
			incompleteObjects.push(element);
			// initialize boolean attribute
			{
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_94, 129);
	}
	
	(
		a8 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
				incompleteObjects.push(element);
				// initialize boolean attribute
				{
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
				}
			}
			if (a8 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__CLASS_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a8).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__CLASS_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_10, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a8, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_95, 130);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 130, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 130, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 130, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 130, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 130, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 130, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 130, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 130, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 130, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 130);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 130);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 130);
	}
	
	(
		(
			a9 = '(' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 131, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 131, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 131);
			}
			
			(
				(
					(
						(
							a10_0 = parse_dsltrans_MatchAttribute							{
								if (terminateParsing) {
									throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
								}
								if (element == null) {
									element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
									incompleteObjects.push(element);
									// initialize boolean attribute
									{
										Object value = true;
										element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
									}
								}
								if (a10_0 != null) {
									if (a10_0 != null) {
										Object value = a10_0;
										addObjectToList(element, dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ATTRIBUTE, value);
										completedElement(value, true);
									}
									collectHiddenTokens(element);
									retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_11_0_0_1_0_0_0_0_0_1, a10_0, true);
									copyLocalizationInfos(a10_0, element);
								}
							}
						)
						{
							// expected elements (follow set)
							addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 132, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
							addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 132, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
							addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 132);
						}
						
					)
					
				)*				{
					// expected elements (follow set)
					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 133, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 133, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 133);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 134);
			}
			
			a11 = ')' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_9_0_0_11_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 135, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 135, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 135, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 135, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 135, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 135, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 135, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 135, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 135, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 135);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 135);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 135);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_55, 136, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 136, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 136, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_58, 136, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 136, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 136, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_61, 136, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 136, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 136, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_9);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_64, 136);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 136);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 136);
	}
	
;

parse_dsltrans_ApplyClass returns [dsltrans.ApplyClass element = null]
@init{
}
:
	(
		(
			(
				a0 = DESCCOM				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
						incompleteObjects.push(element);
						// initialize boolean attribute
						{
							Object value = true;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
						}
					}
					if (a0 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DESCCOM");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__DESCRIPTION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__DESCRIPTION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_0_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 137);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 137);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 137);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 138);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 138);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 138);
	}
	
	(
		(
			(
				a1 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
						incompleteObjects.push(element);
						// initialize boolean attribute
						{
							Object value = true;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
						}
					}
					if (a1 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ID), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ID), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_2_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_97, 139);
			}
			
			a2 = ':' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_2_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 140);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 140);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 141);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 141);
	}
	
	(
		(
			(
				(
					a3 = 'strict' {
						if (element == null) {
							element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
							incompleteObjects.push(element);
							// initialize boolean attribute
							{
								Object value = true;
								element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
							}
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_3_0_0_0, false, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
						// set value of boolean attribute
						Object value = false;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
						completedElement(value, false);
					}
				)
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 142);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 143);
	}
	
	(
		a5 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
				incompleteObjects.push(element);
				// initialize boolean attribute
				{
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
				}
			}
			if (a5 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__PACKAGE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__PACKAGE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_98, 144);
	}
	
	a6 = '::' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
			incompleteObjects.push(element);
			// initialize boolean attribute
			{
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
			}
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_99, 145);
	}
	
	(
		a7 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
				incompleteObjects.push(element);
				// initialize boolean attribute
				{
					Object value = true;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
				}
			}
			if (a7 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__CLASS_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__CLASS_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_9, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_100, 146);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_101, 146);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_38, 146, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 146, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 146, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 146, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_42, 146);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 146);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 146);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 146);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 146);
	}
	
	(
		(
			a8 = '(' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 147, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 147, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 147, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 147);
			}
			
			(
				(
					(
						a9_0 = parse_dsltrans_ApplyAttribute						{
							if (terminateParsing) {
								throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
							}
							if (element == null) {
								element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
								incompleteObjects.push(element);
								// initialize boolean attribute
								{
									Object value = true;
									element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
								}
							}
							if (a9_0 != null) {
								if (a9_0 != null) {
									Object value = a9_0;
									addObjectToList(element, dsltrans.DsltransPackage.APPLY_CLASS__ATTRIBUTE, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_10_0_0_1_0_0_1, a9_0, true);
								copyLocalizationInfos(a9_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 148, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 148, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 148, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 148);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 149, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 149, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 149, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 149);
			}
			
			a10 = ')' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_10_0_0_3, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_101, 150);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_38, 150, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 150, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 150, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 150, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_42, 150);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 150);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 150);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 150);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 150);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_101, 151);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_38, 151, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 151, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 151, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 151, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_42, 151);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 151);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 151);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 151);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 151);
	}
	
	(
		(
			a11 = 'in' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_12_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_106, 152);
			}
			
			a12 = 'group' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
					incompleteObjects.push(element);
					// initialize boolean attribute
					{
						Object value = true;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
					}
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_12_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_107, 153);
			}
			
			(
				a13 = QUOTED_39_39_92				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
						incompleteObjects.push(element);
						// initialize boolean attribute
						{
							Object value = true;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__ALLOW_INHERITANCE), value);
						}
					}
					if (a13 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a13.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__GROUP_NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a13).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a13).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a13).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a13).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_CLASS__GROUP_NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_10_0_0_12_0_0_3, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a13, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_38, 154, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 154, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 154, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 154, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_42, 154);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 154);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 154);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 154);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 154);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_38, 155, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 155, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 155, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 155, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_4);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_42, 155);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 155);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 155);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 155);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 155);
	}
	
;

parse_dsltrans_PositiveMatchAssociation returns [dsltrans.PositiveMatchAssociation element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__SOURCE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.MatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchAssociation, dsltrans.MatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__SOURCE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__SOURCE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_108, 156);
	}
	
	a1 = '--' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_109, 157);
	}
	
	a2 = '(' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_110, 158);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
				incompleteObjects.push(element);
			}
			if (a3 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_6, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_111, 159);
	}
	
	a4 = ')' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_112, 160);
	}
	
	a5 = '->' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_113, 161);
	}
	
	(
		a6 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
				incompleteObjects.push(element);
			}
			if (a6 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.MatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchAssociation, dsltrans.MatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_MATCH_ASSOCIATION__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_12, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 162, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 162, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 162, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 162, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 162, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 162);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 162);
	}
	
;

parse_dsltrans_NegativeMatchAssociation returns [dsltrans.NegativeMatchAssociation element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__SOURCE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.MatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchAssociation, dsltrans.MatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__SOURCE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__SOURCE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_114, 163);
	}
	
	a1 = '!-' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_115, 164);
	}
	
	a2 = '(' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_116, 165);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
				incompleteObjects.push(element);
			}
			if (a3 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__ASSOCIATION_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_6, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_117, 166);
	}
	
	a4 = ')' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_118, 167);
	}
	
	a5 = '->' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_119, 168);
	}
	
	(
		a6 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
				incompleteObjects.push(element);
			}
			if (a6 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.MatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchAssociation, dsltrans.MatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_MATCH_ASSOCIATION__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_12, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 169, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 169, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 169, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 169, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 169, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 169);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 169);
	}
	
;

parse_dsltrans_PositiveIndirectAssociation returns [dsltrans.PositiveIndirectAssociation element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__SOURCE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.MatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchAssociation, dsltrans.MatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__SOURCE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__SOURCE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_120, 170);
	}
	
	a1 = '~~' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_121, 171);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_122, 171);
	}
	
	(
		(
			a2 = '(' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_123, 172);
			}
			
			(
				a3 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
						incompleteObjects.push(element);
					}
					if (a3 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_124, 173);
			}
			
			a4 = ')' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_4_0_0_4, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_122, 174);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_122, 175);
	}
	
	a5 = '~>' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_125, 176);
	}
	
	(
		a6 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
				incompleteObjects.push(element);
			}
			if (a6 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.MatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchAssociation, dsltrans.MatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_INDIRECT_ASSOCIATION__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_8, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 177, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 177, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 177, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 177, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 177, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 177);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 177);
	}
	
;

parse_dsltrans_NegativeIndirectAssociation returns [dsltrans.NegativeIndirectAssociation element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__SOURCE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.MatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchAssociation, dsltrans.MatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__SOURCE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__SOURCE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_126, 178);
	}
	
	a1 = '!~' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_127, 179);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_128, 179);
	}
	
	(
		(
			a2 = '(' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_129, 180);
			}
			
			(
				a3 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
						incompleteObjects.push(element);
					}
					if (a3 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__ASSOCIATION_NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_130, 181);
			}
			
			a4 = ')' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_4_0_0_4, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_128, 182);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_128, 183);
	}
	
	a5 = '~>' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_131, 184);
	}
	
	(
		a6 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
				incompleteObjects.push(element);
			}
			if (a6 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.MatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchAssociation, dsltrans.MatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_INDIRECT_ASSOCIATION__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_8, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 185, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 185, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 185, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 185, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 185, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 185);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 185);
	}
	
;

parse_dsltrans_ApplyAssociation returns [dsltrans.ApplyAssociation element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__SOURCE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.ApplyClass proxy = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.ApplyAssociation, dsltrans.ApplyClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyAssociationSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__SOURCE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__SOURCE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_132, 186);
	}
	
	a1 = '--' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_133, 187);
	}
	
	a2 = '(' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_134, 188);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
				incompleteObjects.push(element);
			}
			if (a3 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__ASSOCIATION_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__ASSOCIATION_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_5, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_135, 189);
	}
	
	a4 = ')' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_136, 190);
	}
	
	a5 = '->' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_137, 191);
	}
	
	(
		a6 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
				incompleteObjects.push(element);
			}
			if (a6 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a6).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.ApplyClass proxy = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.ApplyAssociation, dsltrans.ApplyClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyAssociationTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ASSOCIATION__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_11, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a6, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_72, 192, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_73, 192, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 192);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 192);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 192);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 192);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_dsltrans_ApplyMayBeSameRelation{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_dsltrans_MatchAttribute returns [dsltrans.MatchAttribute element = null]
@init{
}
:
	(
		(
			(
				a0 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
						incompleteObjects.push(element);
					}
					if (a0 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ID), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ID), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_16_0_0_0_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_138, 193);
			}
			
			a1 = ':' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_16_0_0_0_0_0_2, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 194);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 195);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_16_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_139, 196);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 196, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 196, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 196);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 196);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 196);
	}
	
	(
		(
			a3 = '=' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_16_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_140, 197, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_14);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_141, 197, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_14);
			}
			
			(
				a4_0 = parse_dsltrans_MatchAttributeValue				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
						incompleteObjects.push(element);
					}
					if (a4_0 != null) {
						if (a4_0 != null) {
							Object value = a4_0;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_ATTRIBUTE__ATTRIBUTE_VALUE), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_16_0_0_2_0_0_1, a4_0, true);
						copyLocalizationInfos(a4_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 198, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 198, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 198);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 198);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 198);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 199, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 199, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 199);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 199);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 199);
	}
	
;

parse_dsltrans_ApplyAttribute returns [dsltrans.ApplyAttribute element = null]
@init{
}
:
	(
		(
			(
				(
					a0 = IDENTIFIER					
					{
						if (terminateParsing) {
							throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
						}
						if (element == null) {
							element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
							incompleteObjects.push(element);
						}
						if (a0 != null) {
							dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
							tokenResolver.setOptions(getOptions());
							dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
							tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ID), result);
							Object resolvedObject = result.getResolvedToken();
							if (resolvedObject == null) {
								addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
							}
							java.lang.String resolved = (java.lang.String) resolvedObject;
							if (resolved != null) {
								Object value = resolved;
								element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ID), value);
								completedElement(value, false);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_0_0_0_0_0_0_0_0, resolved, true);
							copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_142, 200);
				}
				
				a1 = ':' {
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
						incompleteObjects.push(element);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_0_0_0_0_0_0_0_2, null, true);
					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
				}
				{
					// expected elements (follow set)
					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 201);
				}
				
			)
			
		)?		{
			// expected elements (follow set)
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 202);
		}
		
		(
			(
				a2 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
					}
					if (element == null) {
						element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
						incompleteObjects.push(element);
					}
					if (a2 != null) {
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ATTRIBUTE_NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ATTRIBUTE_NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_0_0_0_0_1_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_143, 203);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 203, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 203, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 203, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 203);
			}
			
			(
				(
					a3 = '=' {
						if (element == null) {
							element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_0_0_0_0_1_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_140, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_144, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_145, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_146, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_147, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_148, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_149, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
					}
					
					(
						a4_0 = parse_dsltrans_Term						{
							if (terminateParsing) {
								throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
							}
							if (element == null) {
								element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
								incompleteObjects.push(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ATTRIBUTE_VALUE), value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_0_0_0_0_1_0_0_1_0_0_2, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 205, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 205, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 205, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 205);
					}
					
				)
				
			)?			{
				// expected elements (follow set)
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 206, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 206, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 206, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 206);
			}
			
		)
		{
			// expected elements (follow set)
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 207, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 207, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 207, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 207);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 208, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 208, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 208, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 208);
	}
	
	
	|	(
		a5 = 'self' {
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_1_0_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_150, 209);
		}
		
		a6 = '=' {
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_1_0_0_0_2, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_140, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_144, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_145, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_146, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_147, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_148, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_149, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
		}
		
		(
			a7_0 = parse_dsltrans_Term			{
				if (terminateParsing) {
					throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
				}
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
					incompleteObjects.push(element);
				}
				if (a7_0 != null) {
					if (a7_0 != null) {
						Object value = a7_0;
						element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_ATTRIBUTE__ATTRIBUTE_VALUE), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_1_0_0_0_4, a7_0, true);
					copyLocalizationInfos(a7_0, element);
				}
			}
		)
		{
			// expected elements (follow set)
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 211, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 211, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 211, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 211);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 212, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 212, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 212, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 212);
	}
	
;

parse_dsltrans_PositiveBackwardRestriction returns [dsltrans.PositiveBackwardRestriction element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createPositiveBackwardRestriction();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__TARGET_CLASS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.ApplyClass proxy = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.AbstractTemporalRelation, dsltrans.ApplyClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractTemporalRelationTargetClassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__TARGET_CLASS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__TARGET_CLASS), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_18_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_151, 213);
	}
	
	a1 = 'derived' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveBackwardRestriction();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_18_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_152, 214);
	}
	
	a2 = 'from' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveBackwardRestriction();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_18_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_153, 215);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createPositiveBackwardRestriction();
				incompleteObjects.push(element);
			}
			if (a3 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__SOURCE_CLASS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.PositiveMatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.AbstractTemporalRelation, dsltrans.PositiveMatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractTemporalRelationSourceClassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__SOURCE_CLASS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.POSITIVE_BACKWARD_RESTRICTION__SOURCE_CLASS), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_18_0_0_6, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_49, 216, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_50, 216, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 216);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 216);
	}
	
;

parse_dsltrans_NegativeBackwardRestriction returns [dsltrans.NegativeBackwardRestriction element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createNegativeBackwardRestriction();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__TARGET_CLASS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.ApplyClass proxy = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.AbstractTemporalRelation, dsltrans.ApplyClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractTemporalRelationTargetClassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__TARGET_CLASS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__TARGET_CLASS), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_19_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_154, 217);
	}
	
	a1 = 'not' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeBackwardRestriction();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_19_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_155, 218);
	}
	
	a2 = 'derived' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeBackwardRestriction();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_19_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_156, 219);
	}
	
	a3 = 'from' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeBackwardRestriction();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_19_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_157, 220);
	}
	
	(
		a4 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createNegativeBackwardRestriction();
				incompleteObjects.push(element);
			}
			if (a4 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__SOURCE_CLASS), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a4).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.PositiveMatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.AbstractTemporalRelation, dsltrans.PositiveMatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractTemporalRelationSourceClassReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__SOURCE_CLASS), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.NEGATIVE_BACKWARD_RESTRICTION__SOURCE_CLASS), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_19_0_0_7, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_49, 221, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_50, 221, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 221);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 221);
	}
	
;

parse_dsltrans_Import returns [dsltrans.Import element = null]
@init{
}
:
	a0 = '(' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_158, 222);
	}
	
	a1 = 'target' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_159, 223);
	}
	
	a2 = '=' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_160, 224);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createImport();
				incompleteObjects.push(element);
			}
			if (a3 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.ApplyClass proxy = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.Import, dsltrans.ApplyClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_5, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_161, 225);
	}
	
	a4 = ',' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_162, 226);
	}
	
	a5 = 'source' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_163, 227);
	}
	
	a6 = '=' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_164, 228);
	}
	
	(
		a7 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createImport();
				incompleteObjects.push(element);
			}
			if (a7 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__SOURCE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.PositiveMatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.Import, dsltrans.PositiveMatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__SOURCE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IMPORT__SOURCE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_13, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_165, 229);
	}
	
	a8 = ')' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_14, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_51, 230, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_8);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 230);
	}
	
;

parse_dsltrans_Atom returns [dsltrans.Atom element = null]
@init{
}
:
	(
		a0 = QUOTED_39_39_92		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createAtom();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATOM__VALUE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATOM__VALUE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_21_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 231, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 231, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 231);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 231);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 231);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 231, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 231, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 231, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 231);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 231);
	}
	
;

parse_dsltrans_AttributeRef returns [dsltrans.AttributeRef element = null]
@init{
}
:
	a0 = 'sameAs' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createAttributeRef();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_22_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_167, 232);
	}
	
	a1 = '(' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createAttributeRef();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_22_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_168, 233);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createAttributeRef();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_REF__ATTRIBUTE_REF), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.Attribute proxy = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.AttributeRef, dsltrans.Attribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAttributeRefAttributeRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_REF__ATTRIBUTE_REF), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_REF__ATTRIBUTE_REF), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_22_0_0_3, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_169, 234);
	}
	
	a3 = ')' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createAttributeRef();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_22_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 235, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 235, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 235, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 235);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 235);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_dsltrans_TypeOf{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_dsltrans_ClassRef returns [dsltrans.ClassRef element = null]
@init{
}
:
	a0 = 'sameAs' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createClassRef();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_23_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_170, 236);
	}
	
	a1 = '(' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createClassRef();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_23_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_171, 237);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createClassRef();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CLASS_REF__CLASS_REF), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.AbstractClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.ClassRef, dsltrans.AbstractClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getClassRefClassRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CLASS_REF__CLASS_REF), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CLASS_REF__CLASS_REF), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_23_0_0_3, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_172, 238);
	}
	
	a3 = ')' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createClassRef();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_23_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 239, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 239, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 239, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 239);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 239);
	}
	
;

parse_dsltrans_Concat returns [dsltrans.Concat element = null]
@init{
}
:
	a0 = 'concat' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createConcat();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_24_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_173, 240);
	}
	
	a1 = '(' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createConcat();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_24_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_140, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_144, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_145, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_146, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_147, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_148, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_149, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
	}
	
	(
		a2_0 = parse_dsltrans_Term		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createConcat();
				incompleteObjects.push(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CONCAT__LEFT_TERM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_24_0_0_3, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 242);
	}
	
	a3 = 'with' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createConcat();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_24_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_140, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_144, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_145, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_146, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_147, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_148, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_149, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
	}
	
	(
		a4_0 = parse_dsltrans_Term		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createConcat();
				incompleteObjects.push(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.CONCAT__RIGHT_TERM), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_24_0_0_5, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_174, 244);
	}
	
	a5 = ')' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createConcat();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_24_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 245, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 245, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 245, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 245);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 245);
	}
	
;

parse_dsltrans_TypeOf returns [dsltrans.TypeOf element = null]
@init{
}
:
	a0 = 'typeOf' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createTypeOf();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_25_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_175, 246);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createTypeOf();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.TYPE_OF__ATTRIBUTE_REF), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.Attribute proxy = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.AttributeRef, dsltrans.Attribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAttributeRefAttributeRefReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.TYPE_OF__ATTRIBUTE_REF), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.TYPE_OF__ATTRIBUTE_REF), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_25_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 247, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 247, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 247, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 247);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 247);
	}
	
;

parse_dsltrans_Wildcard returns [dsltrans.Wildcard element = null]
@init{
}
:
	a0 = 'WILDCARD' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createWildcard();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_26_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 248, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 248, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 248, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 248);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 248);
	}
	
;

parse_dsltrans_isNull returns [dsltrans.isNull element = null]
@init{
}
:
	a0 = 'isNull' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createisNull();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_27_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_176, 249);
	}
	
	a1 = '=' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createisNull();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_27_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_177, 250);
	}
	
	(
		(
			a2 = 'true' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createisNull();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_27_0_0_3, true, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IS_NULL__VALUE), value);
				completedElement(value, false);
			}
			|			a3 = 'false' {
				if (element == null) {
					element = dsltrans.DsltransFactory.eINSTANCE.createisNull();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_27_0_0_3, false, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
				// set value of boolean attribute
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.IS_NULL__VALUE), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 251, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 251, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 251);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 251);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 251);
	}
	
;

parse_dsltrans_Sequencer returns [dsltrans.Sequencer element = null]
@init{
}
:
	a0 = 'Sequence.nextValue' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createSequencer();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_28_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 252, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 252, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 252, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 252);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 252);
	}
	
;

parse_dsltrans_AttributeEquality returns [dsltrans.AttributeEquality element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createAttributeEquality();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__SOURCE_ATTRIBUTE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.Attribute proxy = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.AbstractAttributeRelation, dsltrans.Attribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractAttributeRelationSourceAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__SOURCE_ATTRIBUTE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__SOURCE_ATTRIBUTE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_29_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_178, 253);
	}
	
	a1 = '=' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createAttributeEquality();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_29_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_179, 254);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createAttributeEquality();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__TARGET_ATTRIBUTE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.Attribute proxy = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.AbstractAttributeRelation, dsltrans.Attribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractAttributeRelationTargetAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__TARGET_ATTRIBUTE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_EQUALITY__TARGET_ATTRIBUTE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_29_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_47, 255, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_48, 255, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 255);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 255);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 255);
	}
	
;

parse_dsltrans_AttributeInequality returns [dsltrans.AttributeInequality element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createAttributeInequality();
				incompleteObjects.push(element);
			}
			if (a0 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__SOURCE_ATTRIBUTE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.Attribute proxy = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.AbstractAttributeRelation, dsltrans.Attribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractAttributeRelationSourceAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__SOURCE_ATTRIBUTE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__SOURCE_ATTRIBUTE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_30_0_0_0, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_180, 256);
	}
	
	a1 = '<>' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createAttributeInequality();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_30_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_181, 257);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createAttributeInequality();
				incompleteObjects.push(element);
			}
			if (a2 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__TARGET_ATTRIBUTE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.Attribute proxy = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.AbstractAttributeRelation, dsltrans.Attribute>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAbstractAttributeRelationTargetAttributeReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__TARGET_ATTRIBUTE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.ATTRIBUTE_INEQUALITY__TARGET_ATTRIBUTE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_30_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_47, 258, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_48, 258, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 258);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 258);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 258);
	}
	
;

parse_dsltrans_MatchMayBeSameRelation returns [dsltrans.MatchMayBeSameRelation element = null]
@init{
}
:
	a0 = 'allow' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createMatchMayBeSameRelation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_31_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_182, 259);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createMatchMayBeSameRelation();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__SOURCE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.MatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchAssociation, dsltrans.MatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__SOURCE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__SOURCE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_31_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_183, 260);
	}
	
	a2 = '=' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createMatchMayBeSameRelation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_31_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_184, 261);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createMatchMayBeSameRelation();
				incompleteObjects.push(element);
			}
			if (a3 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.MatchClass proxy = dsltrans.DsltransFactory.eINSTANCE.createAnyMatchClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.MatchAssociation, dsltrans.MatchClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getMatchAssociationTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.MATCH_MAY_BE_SAME_RELATION__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_31_0_0_3, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 262, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 262, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 262, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 262, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 262, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 262);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 262);
	}
	
;

parse_dsltrans_ApplyMayBeSameRelation returns [dsltrans.ApplyMayBeSameRelation element = null]
@init{
}
:
	a0 = 'allow' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createApplyMayBeSameRelation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_32_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_185, 263);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createApplyMayBeSameRelation();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__SOURCE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.ApplyClass proxy = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.ApplyAssociation, dsltrans.ApplyClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyAssociationSourceReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__SOURCE), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__SOURCE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_32_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_186, 264);
	}
	
	a2 = '=' {
		if (element == null) {
			element = dsltrans.DsltransFactory.eINSTANCE.createApplyMayBeSameRelation();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_32_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_187, 265);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new dsltrans.resource.dsltranstext.mopp.DsltranstextTerminateParsingException();
			}
			if (element == null) {
				element = dsltrans.DsltransFactory.eINSTANCE.createApplyMayBeSameRelation();
				incompleteObjects.push(element);
			}
			if (a3 != null) {
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				dsltrans.resource.dsltranstext.IDsltranstextTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				dsltrans.ApplyClass proxy = dsltrans.DsltransFactory.eINSTANCE.createApplyClass();
				collectHiddenTokens(element);
				registerContextDependentProxy(new dsltrans.resource.dsltranstext.mopp.DsltranstextContextDependentURIFragmentFactory<dsltrans.ApplyAssociation, dsltrans.ApplyClass>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyAssociationTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(dsltrans.DsltransPackage.APPLY_MAY_BE_SAME_RELATION__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_32_0_0_3, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_72, 266, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_73, 266, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 266);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 266);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 266);
		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 266);
	}
	
;

parse_dsltrans_AbstractSource returns [dsltrans.AbstractSource element = null]
:
	c0 = parse_dsltrans_FilePort{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_dsltrans_Sequential{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_dsltrans_AbstractAttributeRelation returns [dsltrans.AbstractAttributeRelation element = null]
:
	c0 = parse_dsltrans_AttributeEquality{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_dsltrans_AttributeInequality{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_dsltrans_AbstractTemporalRelation returns [dsltrans.AbstractTemporalRelation element = null]
:
	c0 = parse_dsltrans_PositiveBackwardRestriction{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_dsltrans_NegativeBackwardRestriction{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_dsltrans_MatchClass returns [dsltrans.MatchClass element = null]
:
	c0 = parse_dsltrans_AnyMatchClass{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_dsltrans_ExistsMatchClass{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_dsltrans_NegativeMatchClass{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

parse_dsltrans_MatchAssociation returns [dsltrans.MatchAssociation element = null]
:
	c0 = parse_dsltrans_PositiveMatchAssociation{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_dsltrans_NegativeMatchAssociation{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_dsltrans_PositiveIndirectAssociation{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_dsltrans_NegativeIndirectAssociation{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_dsltrans_MatchMayBeSameRelation{ element = c4; /* this is a subclass or primitive expression choice */ }
	
;

parse_dsltrans_MatchAttributeValue returns [dsltrans.MatchAttributeValue element = null]
:
	c0 = parse_dsltrans_Atom{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_dsltrans_isNull{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_dsltrans_Term returns [dsltrans.Term element = null]
:
	c0 = parse_dsltrans_Atom{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_dsltrans_AttributeRef{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_dsltrans_ClassRef{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_dsltrans_Concat{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_dsltrans_TypeOf{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_dsltrans_Wildcard{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_dsltrans_Sequencer{ element = c6; /* this is a subclass or primitive expression choice */ }
	
;

WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
IDENTIFIER:
	(('A'..'Z' | 'a'..'z' | '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_' | '.')*)
;
DESCCOM:
	('/*'.*'*/')
;
QUOTED_39_39_92:
	(('\'')(('\\''\'')|('\\''\\')|~('\''|'\\'))*('\''))
;

