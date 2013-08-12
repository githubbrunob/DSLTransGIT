// $ANTLR ${project.version} ${buildNumber}

	package mprolog.resource.pl.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class PlParser extends PlANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VARIABLE", "NUMBER", "ATOM", "QUOTED_39_39", "OPERATOR", "COMMENT", "TEXT", "WHITESPACE", "LINEBREAK", "':-'", "'.'", "','", "'('", "')'", "'['", "'|'", "']'"
    };
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int VARIABLE=4;
    public static final int NUMBER=5;
    public static final int ATOM=6;
    public static final int QUOTED_39_39=7;
    public static final int OPERATOR=8;
    public static final int COMMENT=9;
    public static final int TEXT=10;
    public static final int WHITESPACE=11;
    public static final int LINEBREAK=12;

    // delegates
    // delegators


        public PlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[31+1];
             
             
        }
        

    public String[] getTokenNames() { return PlParser.tokenNames; }
    public String getGrammarFileName() { return "Pl.g"; }


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
    	



    // $ANTLR start "start"
    // Pl.g:493:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_mprolog_Model ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        mprolog.Model c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Pl.g:494:1: ( (c0= parse_mprolog_Model ) EOF )
            // Pl.g:495:2: (c0= parse_mprolog_Model ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Pl.g:503:2: (c0= parse_mprolog_Model )
            // Pl.g:504:3: c0= parse_mprolog_Model
            {
            pushFollow(FOLLOW_parse_mprolog_Model_in_start82);
            c0=parse_mprolog_Model();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		retrieveLayoutInformation(element, null, null, false);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "start"


    // $ANTLR start "parse_mprolog_Model"
    // Pl.g:512:1: parse_mprolog_Model returns [mprolog.Model element = null] : ( (a0_0= parse_mprolog_Clause ) )* ;
    public final mprolog.Model parse_mprolog_Model() throws RecognitionException {
        mprolog.Model element =  null;
        int parse_mprolog_Model_StartIndex = input.index();
        mprolog.Clause a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Pl.g:515:1: ( ( (a0_0= parse_mprolog_Clause ) )* )
            // Pl.g:516:2: ( (a0_0= parse_mprolog_Clause ) )*
            {
            // Pl.g:516:2: ( (a0_0= parse_mprolog_Clause ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=NUMBER && LA1_0<=ATOM)||(LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Pl.g:517:3: (a0_0= parse_mprolog_Clause )
            	    {
            	    // Pl.g:517:3: (a0_0= parse_mprolog_Clause )
            	    // Pl.g:518:4: a0_0= parse_mprolog_Clause
            	    {
            	    pushFollow(FOLLOW_parse_mprolog_Clause_in_parse_mprolog_Model124);
            	    a0_0=parse_mprolog_Clause();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_mprolog_Model_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_Model"


    // $ANTLR start "parse_mprolog_Clause"
    // Pl.g:549:1: parse_mprolog_Clause returns [mprolog.Clause element = null] : ( ( (a0_0= parse_mprolog_Head ) ) )? ( (a1= ':-' (a2_0= parse_mprolog_Body ) ) )? a3= '.' ;
    public final mprolog.Clause parse_mprolog_Clause() throws RecognitionException {
        mprolog.Clause element =  null;
        int parse_mprolog_Clause_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        mprolog.Head a0_0 = null;

        mprolog.Body a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Pl.g:552:1: ( ( ( (a0_0= parse_mprolog_Head ) ) )? ( (a1= ':-' (a2_0= parse_mprolog_Body ) ) )? a3= '.' )
            // Pl.g:553:2: ( ( (a0_0= parse_mprolog_Head ) ) )? ( (a1= ':-' (a2_0= parse_mprolog_Body ) ) )? a3= '.'
            {
            // Pl.g:553:2: ( ( (a0_0= parse_mprolog_Head ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=NUMBER && LA2_0<=ATOM)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Pl.g:554:3: ( (a0_0= parse_mprolog_Head ) )
                    {
                    // Pl.g:554:3: ( (a0_0= parse_mprolog_Head ) )
                    // Pl.g:555:4: (a0_0= parse_mprolog_Head )
                    {
                    // Pl.g:555:4: (a0_0= parse_mprolog_Head )
                    // Pl.g:556:5: a0_0= parse_mprolog_Head
                    {
                    pushFollow(FOLLOW_parse_mprolog_Head_in_parse_mprolog_Clause180);
                    a0_0=parse_mprolog_Head();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 2);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 2);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 3);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 3);
              	
            }
            // Pl.g:590:2: ( (a1= ':-' (a2_0= parse_mprolog_Body ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Pl.g:591:3: (a1= ':-' (a2_0= parse_mprolog_Body ) )
                    {
                    // Pl.g:591:3: (a1= ':-' (a2_0= parse_mprolog_Body ) )
                    // Pl.g:592:4: a1= ':-' (a2_0= parse_mprolog_Body )
                    {
                    a1=(Token)match(input,13,FOLLOW_13_in_parse_mprolog_Clause230); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = mprolog.MprologFactory.eINSTANCE.createClause();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_1_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 4, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_3, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_4);
                      			
                    }
                    // Pl.g:612:4: (a2_0= parse_mprolog_Body )
                    // Pl.g:613:5: a2_0= parse_mprolog_Body
                    {
                    pushFollow(FOLLOW_parse_mprolog_Body_in_parse_mprolog_Clause256);
                    a2_0=parse_mprolog_Body();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 5);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 6);
              	
            }
            a3=(Token)match(input,14,FOLLOW_14_in_parse_mprolog_Clause297); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = mprolog.MprologFactory.eINSTANCE.createClause();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_1_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 7, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 7, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_0, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_1, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 7, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 7, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_2);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_mprolog_Clause_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_Clause"


    // $ANTLR start "parse_mprolog_Head"
    // Pl.g:664:1: parse_mprolog_Head returns [mprolog.Head element = null] : (a0_0= parse_mprolog_Functor ) ;
    public final mprolog.Head parse_mprolog_Head() throws RecognitionException {
        mprolog.Head element =  null;
        int parse_mprolog_Head_StartIndex = input.index();
        mprolog.Functor a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Pl.g:667:1: ( (a0_0= parse_mprolog_Functor ) )
            // Pl.g:668:2: (a0_0= parse_mprolog_Functor )
            {
            // Pl.g:668:2: (a0_0= parse_mprolog_Functor )
            // Pl.g:669:3: a0_0= parse_mprolog_Functor
            {
            pushFollow(FOLLOW_parse_mprolog_Functor_in_parse_mprolog_Head330);
            a0_0=parse_mprolog_Functor();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 8);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 8);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_mprolog_Head_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_Head"


    // $ANTLR start "parse_mprolog_Body"
    // Pl.g:697:1: parse_mprolog_Body returns [mprolog.Body element = null] : (a0_0= parse_mprolog_Term ) ;
    public final mprolog.Body parse_mprolog_Body() throws RecognitionException {
        mprolog.Body element =  null;
        int parse_mprolog_Body_StartIndex = input.index();
        mprolog.Term a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Pl.g:700:1: ( (a0_0= parse_mprolog_Term ) )
            // Pl.g:701:2: (a0_0= parse_mprolog_Term )
            {
            // Pl.g:701:2: (a0_0= parse_mprolog_Term )
            // Pl.g:702:3: a0_0= parse_mprolog_Term
            {
            pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_Body367);
            a0_0=parse_mprolog_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 9);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_mprolog_Body_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_Body"


    // $ANTLR start "parse_mprolog_Variable"
    // Pl.g:729:1: parse_mprolog_Variable returns [mprolog.Variable element = null] : (a0= VARIABLE ) ( (a1= ',' (a2_0= parse_mprolog_Term ) ) )? ;
    public final mprolog.Variable parse_mprolog_Variable() throws RecognitionException {
        mprolog.Variable element =  null;
        int parse_mprolog_Variable_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        mprolog.Term a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Pl.g:732:1: ( (a0= VARIABLE ) ( (a1= ',' (a2_0= parse_mprolog_Term ) ) )? )
            // Pl.g:733:2: (a0= VARIABLE ) ( (a1= ',' (a2_0= parse_mprolog_Term ) ) )?
            {
            // Pl.g:733:2: (a0= VARIABLE )
            // Pl.g:734:3: a0= VARIABLE
            {
            a0=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_parse_mprolog_Variable404); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_9, 10);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 10);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 10);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 10);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 10);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 10);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 10, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }
            // Pl.g:775:2: ( (a1= ',' (a2_0= parse_mprolog_Term ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Pl.g:776:3: (a1= ',' (a2_0= parse_mprolog_Term ) )
                    {
                    // Pl.g:776:3: (a1= ',' (a2_0= parse_mprolog_Term ) )
                    // Pl.g:777:4: a1= ',' (a2_0= parse_mprolog_Term )
                    {
                    a1=(Token)match(input,15,FOLLOW_15_in_parse_mprolog_Variable434); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = mprolog.MprologFactory.eINSTANCE.createVariable();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_4_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 11, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      			
                    }
                    // Pl.g:797:4: (a2_0= parse_mprolog_Term )
                    // Pl.g:798:5: a2_0= parse_mprolog_Term
                    {
                    pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_Variable460);
                    a2_0=parse_mprolog_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 12);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 12);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 12);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 12);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 12);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 12, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 13);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 13);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 13);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 13);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 13);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 13, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_mprolog_Variable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_Variable"


    // $ANTLR start "parse_mprolog_Parenthesis"
    // Pl.g:842:1: parse_mprolog_Parenthesis returns [mprolog.Parenthesis element = null] : a0= '(' (a1_0= parse_mprolog_Term ) a2= ')' ( (a3= ',' (a4_0= parse_mprolog_Term ) ) )? ;
    public final mprolog.Parenthesis parse_mprolog_Parenthesis() throws RecognitionException {
        mprolog.Parenthesis element =  null;
        int parse_mprolog_Parenthesis_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        Token a3=null;
        mprolog.Term a1_0 = null;

        mprolog.Term a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Pl.g:845:1: (a0= '(' (a1_0= parse_mprolog_Term ) a2= ')' ( (a3= ',' (a4_0= parse_mprolog_Term ) ) )? )
            // Pl.g:846:2: a0= '(' (a1_0= parse_mprolog_Term ) a2= ')' ( (a3= ',' (a4_0= parse_mprolog_Term ) ) )?
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_mprolog_Parenthesis516); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = mprolog.MprologFactory.eINSTANCE.createParenthesis();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_5_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 14, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_7);
              	
            }
            // Pl.g:866:2: (a1_0= parse_mprolog_Term )
            // Pl.g:867:3: a1_0= parse_mprolog_Term
            {
            pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_Parenthesis534);
            a1_0=parse_mprolog_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 15);
              	
            }
            a2=(Token)match(input,17,FOLLOW_17_in_parse_mprolog_Parenthesis552); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = mprolog.MprologFactory.eINSTANCE.createParenthesis();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_5_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_15, 16);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 16);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 16);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 16);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 16);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 16);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 16, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }
            // Pl.g:912:2: ( (a3= ',' (a4_0= parse_mprolog_Term ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Pl.g:913:3: (a3= ',' (a4_0= parse_mprolog_Term ) )
                    {
                    // Pl.g:913:3: (a3= ',' (a4_0= parse_mprolog_Term ) )
                    // Pl.g:914:4: a3= ',' (a4_0= parse_mprolog_Term )
                    {
                    a3=(Token)match(input,15,FOLLOW_15_in_parse_mprolog_Parenthesis575); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = mprolog.MprologFactory.eINSTANCE.createParenthesis();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_5_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 17, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      			
                    }
                    // Pl.g:934:4: (a4_0= parse_mprolog_Term )
                    // Pl.g:935:5: a4_0= parse_mprolog_Term
                    {
                    pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_Parenthesis601);
                    a4_0=parse_mprolog_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 18);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 18);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 18);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 18);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 18);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 18, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 19);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 19);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 19);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 19);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 19);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 19, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_mprolog_Parenthesis_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_Parenthesis"


    // $ANTLR start "parse_mprolog_Functor"
    // Pl.g:979:1: parse_mprolog_Functor returns [mprolog.Functor element = null] : ( (a0= NUMBER ) | (a1= ATOM ) ( (a2= '(' (a3_0= parse_mprolog_Term ) a4= ')' ) )? ) ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )? ;
    public final mprolog.Functor parse_mprolog_Functor() throws RecognitionException {
        mprolog.Functor element =  null;
        int parse_mprolog_Functor_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a5=null;
        mprolog.Term a3_0 = null;

        mprolog.Term a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Pl.g:982:1: ( ( (a0= NUMBER ) | (a1= ATOM ) ( (a2= '(' (a3_0= parse_mprolog_Term ) a4= ')' ) )? ) ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )? )
            // Pl.g:983:2: ( (a0= NUMBER ) | (a1= ATOM ) ( (a2= '(' (a3_0= parse_mprolog_Term ) a4= ')' ) )? ) ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )?
            {
            // Pl.g:983:2: ( (a0= NUMBER ) | (a1= ATOM ) ( (a2= '(' (a3_0= parse_mprolog_Term ) a4= ')' ) )? )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==NUMBER) ) {
                alt7=1;
            }
            else if ( (LA7_0==ATOM) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Pl.g:984:3: (a0= NUMBER )
                    {
                    // Pl.g:984:3: (a0= NUMBER )
                    // Pl.g:985:4: a0= NUMBER
                    {
                    a0=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_parse_mprolog_Functor666); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 2 :
                    // Pl.g:1028:6: (a1= ATOM ) ( (a2= '(' (a3_0= parse_mprolog_Term ) a4= ')' ) )?
                    {
                    // Pl.g:1028:6: (a1= ATOM )
                    // Pl.g:1029:4: a1= ATOM
                    {
                    a1=(Token)match(input,ATOM,FOLLOW_ATOM_in_parse_mprolog_Functor704); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

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
                    // Pl.g:1072:3: ( (a2= '(' (a3_0= parse_mprolog_Term ) a4= ')' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==16) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Pl.g:1073:4: (a2= '(' (a3_0= parse_mprolog_Term ) a4= ')' )
                            {
                            // Pl.g:1073:4: (a2= '(' (a3_0= parse_mprolog_Term ) a4= ')' )
                            // Pl.g:1074:5: a2= '(' (a3_0= parse_mprolog_Term ) a4= ')'
                            {
                            a2=(Token)match(input,16,FOLLOW_16_in_parse_mprolog_Functor742); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (element == null) {
                              						element = mprolog.MprologFactory.eINSTANCE.createFunctor();
                              						incompleteObjects.push(element);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6_0_0_0_0_1_1_0_0_0, null, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
                              					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
                              					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
                              					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
                              					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
                              					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
                              					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 22, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_8);
                              				
                            }
                            // Pl.g:1094:5: (a3_0= parse_mprolog_Term )
                            // Pl.g:1095:6: a3_0= parse_mprolog_Term
                            {
                            pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_Functor772);
                            a3_0=parse_mprolog_Term();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

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

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 23);
                              				
                            }
                            a4=(Token)match(input,17,FOLLOW_17_in_parse_mprolog_Functor805); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (element == null) {
                              						element = mprolog.MprologFactory.eINSTANCE.createFunctor();
                              						incompleteObjects.push(element);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6_0_0_0_0_1_1_0_0_2, null, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                              				
                            }
                            if ( state.backtracking==0 ) {

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

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

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

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

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
            // Pl.g:1168:2: ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Pl.g:1169:3: (a5= ',' (a6_0= parse_mprolog_Term ) )
                    {
                    // Pl.g:1169:3: (a5= ',' (a6_0= parse_mprolog_Term ) )
                    // Pl.g:1170:4: a5= ',' (a6_0= parse_mprolog_Term )
                    {
                    a5=(Token)match(input,15,FOLLOW_15_in_parse_mprolog_Functor862); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = mprolog.MprologFactory.eINSTANCE.createFunctor();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_6_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 27, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      			
                    }
                    // Pl.g:1190:4: (a6_0= parse_mprolog_Term )
                    // Pl.g:1191:5: a6_0= parse_mprolog_Term
                    {
                    pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_Functor888);
                    a6_0=parse_mprolog_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 28);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 28);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 28);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 28);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 28);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 28);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 28, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_2, 29);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 29);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 29);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 29);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 29);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 29);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 29, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_mprolog_Functor_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_Functor"


    // $ANTLR start "parse_mprolog_QuotedAtom"
    // Pl.g:1237:1: parse_mprolog_QuotedAtom returns [mprolog.QuotedAtom element = null] : (a0= QUOTED_39_39 ) ( (a1= ',' (a2_0= parse_mprolog_Term ) ) )? ;
    public final mprolog.QuotedAtom parse_mprolog_QuotedAtom() throws RecognitionException {
        mprolog.QuotedAtom element =  null;
        int parse_mprolog_QuotedAtom_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        mprolog.Term a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Pl.g:1240:1: ( (a0= QUOTED_39_39 ) ( (a1= ',' (a2_0= parse_mprolog_Term ) ) )? )
            // Pl.g:1241:2: (a0= QUOTED_39_39 ) ( (a1= ',' (a2_0= parse_mprolog_Term ) ) )?
            {
            // Pl.g:1241:2: (a0= QUOTED_39_39 )
            // Pl.g:1242:3: a0= QUOTED_39_39
            {
            a0=(Token)match(input,QUOTED_39_39,FOLLOW_QUOTED_39_39_in_parse_mprolog_QuotedAtom948); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_18, 30);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 30);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 30);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 30);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 30);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 30);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 30, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }
            // Pl.g:1283:2: ( (a1= ',' (a2_0= parse_mprolog_Term ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Pl.g:1284:3: (a1= ',' (a2_0= parse_mprolog_Term ) )
                    {
                    // Pl.g:1284:3: (a1= ',' (a2_0= parse_mprolog_Term ) )
                    // Pl.g:1285:4: a1= ',' (a2_0= parse_mprolog_Term )
                    {
                    a1=(Token)match(input,15,FOLLOW_15_in_parse_mprolog_QuotedAtom978); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = mprolog.MprologFactory.eINSTANCE.createQuotedAtom();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_7_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 31, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      			
                    }
                    // Pl.g:1305:4: (a2_0= parse_mprolog_Term )
                    // Pl.g:1306:5: a2_0= parse_mprolog_Term
                    {
                    pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_QuotedAtom1004);
                    a2_0=parse_mprolog_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 32);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 32);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 32);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 32);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 32);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 32, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 33);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 33);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 33);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 33);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 33);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 33, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_mprolog_QuotedAtom_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_QuotedAtom"


    // $ANTLR start "parse_mprolog_List"
    // Pl.g:1350:1: parse_mprolog_List returns [mprolog.List element = null] : a0= '[' ( ( (a1_0= parse_mprolog_Term ) ( (a2= '|' (a3_0= parse_mprolog_Term ) ) )? ) )? a4= ']' ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )? ;
    public final mprolog.List parse_mprolog_List() throws RecognitionException {
        mprolog.List element =  null;
        int parse_mprolog_List_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        Token a4=null;
        Token a5=null;
        mprolog.Term a1_0 = null;

        mprolog.Term a3_0 = null;

        mprolog.Term a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Pl.g:1353:1: (a0= '[' ( ( (a1_0= parse_mprolog_Term ) ( (a2= '|' (a3_0= parse_mprolog_Term ) ) )? ) )? a4= ']' ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )? )
            // Pl.g:1354:2: a0= '[' ( ( (a1_0= parse_mprolog_Term ) ( (a2= '|' (a3_0= parse_mprolog_Term ) ) )? ) )? a4= ']' ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )?
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_mprolog_List1060); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = mprolog.MprologFactory.eINSTANCE.createList();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Pl.g:1375:2: ( ( (a1_0= parse_mprolog_Term ) ( (a2= '|' (a3_0= parse_mprolog_Term ) ) )? ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=VARIABLE && LA11_0<=QUOTED_39_39)||LA11_0==16||LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Pl.g:1376:3: ( (a1_0= parse_mprolog_Term ) ( (a2= '|' (a3_0= parse_mprolog_Term ) ) )? )
                    {
                    // Pl.g:1376:3: ( (a1_0= parse_mprolog_Term ) ( (a2= '|' (a3_0= parse_mprolog_Term ) ) )? )
                    // Pl.g:1377:4: (a1_0= parse_mprolog_Term ) ( (a2= '|' (a3_0= parse_mprolog_Term ) ) )?
                    {
                    // Pl.g:1377:4: (a1_0= parse_mprolog_Term )
                    // Pl.g:1378:5: a1_0= parse_mprolog_Term
                    {
                    pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_List1089);
                    a1_0=parse_mprolog_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 35);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 35);
                      			
                    }
                    // Pl.g:1404:4: ( (a2= '|' (a3_0= parse_mprolog_Term ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==19) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Pl.g:1405:5: (a2= '|' (a3_0= parse_mprolog_Term ) )
                            {
                            // Pl.g:1405:5: (a2= '|' (a3_0= parse_mprolog_Term ) )
                            // Pl.g:1406:6: a2= '|' (a3_0= parse_mprolog_Term )
                            {
                            a2=(Token)match(input,19,FOLLOW_19_in_parse_mprolog_List1130); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (element == null) {
                              							element = mprolog.MprologFactory.eINSTANCE.createList();
                              							incompleteObjects.push(element);
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_1_0_0_1_0_0_0, null, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
                              						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
                              						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
                              						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
                              						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
                              						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
                              						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 36, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_10);
                              					
                            }
                            // Pl.g:1426:6: (a3_0= parse_mprolog_Term )
                            // Pl.g:1427:7: a3_0= parse_mprolog_Term
                            {
                            pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_List1164);
                            a3_0=parse_mprolog_Term();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

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

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 37);
                              					
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 38);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 39);
              	
            }
            a4=(Token)match(input,20,FOLLOW_20_in_parse_mprolog_List1238); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = mprolog.MprologFactory.eINSTANCE.createList();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_19, 40);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 40);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 40);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 40);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 40);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 40);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 40, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }
            // Pl.g:1486:2: ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Pl.g:1487:3: (a5= ',' (a6_0= parse_mprolog_Term ) )
                    {
                    // Pl.g:1487:3: (a5= ',' (a6_0= parse_mprolog_Term ) )
                    // Pl.g:1488:4: a5= ',' (a6_0= parse_mprolog_Term )
                    {
                    a5=(Token)match(input,15,FOLLOW_15_in_parse_mprolog_List1261); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = mprolog.MprologFactory.eINSTANCE.createList();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_8_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 41, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      			
                    }
                    // Pl.g:1508:4: (a6_0= parse_mprolog_Term )
                    // Pl.g:1509:5: a6_0= parse_mprolog_Term
                    {
                    pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_List1287);
                    a6_0=parse_mprolog_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 42);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 42);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 42);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 42);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 42);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 42, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 43);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 43);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 43);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 43);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 43);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 43, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_mprolog_List_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_List"


    // $ANTLR start "parse_mprolog_InfixExpression"
    // Pl.g:1553:1: parse_mprolog_InfixExpression returns [mprolog.InfixExpression element = null] : a0= '(' (a1_0= parse_mprolog_Term ) (a2_0= parse_mprolog_Operator ) (a3_0= parse_mprolog_Term ) a4= ')' ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )? ;
    public final mprolog.InfixExpression parse_mprolog_InfixExpression() throws RecognitionException {
        mprolog.InfixExpression element =  null;
        int parse_mprolog_InfixExpression_StartIndex = input.index();
        Token a0=null;
        Token a4=null;
        Token a5=null;
        mprolog.Term a1_0 = null;

        mprolog.Operator a2_0 = null;

        mprolog.Term a3_0 = null;

        mprolog.Term a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Pl.g:1556:1: (a0= '(' (a1_0= parse_mprolog_Term ) (a2_0= parse_mprolog_Operator ) (a3_0= parse_mprolog_Term ) a4= ')' ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )? )
            // Pl.g:1557:2: a0= '(' (a1_0= parse_mprolog_Term ) (a2_0= parse_mprolog_Operator ) (a3_0= parse_mprolog_Term ) a4= ')' ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )?
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_mprolog_InfixExpression1343); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = mprolog.MprologFactory.eINSTANCE.createInfixExpression();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 44, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_11);
              	
            }
            // Pl.g:1577:2: (a1_0= parse_mprolog_Term )
            // Pl.g:1578:3: a1_0= parse_mprolog_Term
            {
            pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_InfixExpression1361);
            a1_0=parse_mprolog_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 45, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }
            // Pl.g:1603:2: (a2_0= parse_mprolog_Operator )
            // Pl.g:1604:3: a2_0= parse_mprolog_Operator
            {
            pushFollow(FOLLOW_parse_mprolog_Operator_in_parse_mprolog_InfixExpression1383);
            a2_0=parse_mprolog_Operator();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 46, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              	
            }
            // Pl.g:1635:2: (a3_0= parse_mprolog_Term )
            // Pl.g:1636:3: a3_0= parse_mprolog_Term
            {
            pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_InfixExpression1405);
            a3_0=parse_mprolog_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_20, 47);
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_mprolog_InfixExpression1423); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = mprolog.MprologFactory.eINSTANCE.createInfixExpression();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_21, 48);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 48);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 48);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 48);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 48);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 48);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 48, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }
            // Pl.g:1681:2: ( (a5= ',' (a6_0= parse_mprolog_Term ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Pl.g:1682:3: (a5= ',' (a6_0= parse_mprolog_Term ) )
                    {
                    // Pl.g:1682:3: (a5= ',' (a6_0= parse_mprolog_Term ) )
                    // Pl.g:1683:4: a5= ',' (a6_0= parse_mprolog_Term )
                    {
                    a5=(Token)match(input,15,FOLLOW_15_in_parse_mprolog_InfixExpression1446); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = mprolog.MprologFactory.eINSTANCE.createInfixExpression();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, mprolog.resource.pl.grammar.PlGrammarInformationProvider.PL_9_0_0_5_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 49, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_6);
                      			
                    }
                    // Pl.g:1703:4: (a6_0= parse_mprolog_Term )
                    // Pl.g:1704:5: a6_0= parse_mprolog_Term
                    {
                    pushFollow(FOLLOW_parse_mprolog_Term_in_parse_mprolog_InfixExpression1472);
                    a6_0=parse_mprolog_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 50);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 50);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 50);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 50);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 50);
                      				addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 50, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_3, 51);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_10, 51);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_11, 51);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_12, 51);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_13, 51);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_14, 51, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_5);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_mprolog_InfixExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_InfixExpression"


    // $ANTLR start "parse_mprolog_Operator"
    // Pl.g:1748:1: parse_mprolog_Operator returns [mprolog.Operator element = null] : (a0= OPERATOR ) ;
    public final mprolog.Operator parse_mprolog_Operator() throws RecognitionException {
        mprolog.Operator element =  null;
        int parse_mprolog_Operator_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Pl.g:1751:1: ( (a0= OPERATOR ) )
            // Pl.g:1752:2: (a0= OPERATOR )
            {
            // Pl.g:1752:2: (a0= OPERATOR )
            // Pl.g:1753:3: a0= OPERATOR
            {
            a0=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_parse_mprolog_Operator1532); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_4, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_5, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_0, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_1, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_6, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_7, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              		addExpectedElement(mprolog.resource.pl.grammar.PlFollowSetProvider.TERMINAL_8, 52, mprolog.resource.pl.grammar.PlFollowSetProvider.FEATURE_12);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_mprolog_Operator_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_Operator"


    // $ANTLR start "parse_mprolog_Term"
    // Pl.g:1796:1: parse_mprolog_Term returns [mprolog.Term element = null] : (c0= parse_mprolog_Variable | c1= parse_mprolog_Parenthesis | c2= parse_mprolog_Functor | c3= parse_mprolog_QuotedAtom | c4= parse_mprolog_List | c5= parse_mprolog_InfixExpression );
    public final mprolog.Term parse_mprolog_Term() throws RecognitionException {
        mprolog.Term element =  null;
        int parse_mprolog_Term_StartIndex = input.index();
        mprolog.Variable c0 = null;

        mprolog.Parenthesis c1 = null;

        mprolog.Functor c2 = null;

        mprolog.QuotedAtom c3 = null;

        mprolog.List c4 = null;

        mprolog.InfixExpression c5 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Pl.g:1797:1: (c0= parse_mprolog_Variable | c1= parse_mprolog_Parenthesis | c2= parse_mprolog_Functor | c3= parse_mprolog_QuotedAtom | c4= parse_mprolog_List | c5= parse_mprolog_InfixExpression )
            int alt14=6;
            switch ( input.LA(1) ) {
            case VARIABLE:
                {
                alt14=1;
                }
                break;
            case 16:
                {
                int LA14_2 = input.LA(2);

                if ( (synpred15_Pl()) ) {
                    alt14=2;
                }
                else if ( (true) ) {
                    alt14=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case NUMBER:
            case ATOM:
                {
                alt14=3;
                }
                break;
            case QUOTED_39_39:
                {
                alt14=4;
                }
                break;
            case 18:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // Pl.g:1798:2: c0= parse_mprolog_Variable
                    {
                    pushFollow(FOLLOW_parse_mprolog_Variable_in_parse_mprolog_Term1564);
                    c0=parse_mprolog_Variable();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Pl.g:1799:4: c1= parse_mprolog_Parenthesis
                    {
                    pushFollow(FOLLOW_parse_mprolog_Parenthesis_in_parse_mprolog_Term1574);
                    c1=parse_mprolog_Parenthesis();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Pl.g:1800:4: c2= parse_mprolog_Functor
                    {
                    pushFollow(FOLLOW_parse_mprolog_Functor_in_parse_mprolog_Term1584);
                    c2=parse_mprolog_Functor();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Pl.g:1801:4: c3= parse_mprolog_QuotedAtom
                    {
                    pushFollow(FOLLOW_parse_mprolog_QuotedAtom_in_parse_mprolog_Term1594);
                    c3=parse_mprolog_QuotedAtom();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Pl.g:1802:4: c4= parse_mprolog_List
                    {
                    pushFollow(FOLLOW_parse_mprolog_List_in_parse_mprolog_Term1604);
                    c4=parse_mprolog_List();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Pl.g:1803:4: c5= parse_mprolog_InfixExpression
                    {
                    pushFollow(FOLLOW_parse_mprolog_InfixExpression_in_parse_mprolog_Term1614);
                    c5=parse_mprolog_InfixExpression();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_mprolog_Term_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_mprolog_Term"

    // $ANTLR start synpred15_Pl
    public final void synpred15_Pl_fragment() throws RecognitionException {   
        mprolog.Parenthesis c1 = null;


        // Pl.g:1799:4: (c1= parse_mprolog_Parenthesis )
        // Pl.g:1799:4: c1= parse_mprolog_Parenthesis
        {
        pushFollow(FOLLOW_parse_mprolog_Parenthesis_in_synpred15_Pl1574);
        c1=parse_mprolog_Parenthesis();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Pl

    // Delegated rules

    public final boolean synpred15_Pl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Pl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_mprolog_Model_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mprolog_Clause_in_parse_mprolog_Model124 = new BitSet(new long[]{0x0000000000006062L});
    public static final BitSet FOLLOW_parse_mprolog_Head_in_parse_mprolog_Clause180 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_parse_mprolog_Clause230 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Body_in_parse_mprolog_Clause256 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_mprolog_Clause297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mprolog_Functor_in_parse_mprolog_Head330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_Body367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_parse_mprolog_Variable404 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_parse_mprolog_Variable434 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_Variable460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_mprolog_Parenthesis516 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_Parenthesis534 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_mprolog_Parenthesis552 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_parse_mprolog_Parenthesis575 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_Parenthesis601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_parse_mprolog_Functor666 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ATOM_in_parse_mprolog_Functor704 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_16_in_parse_mprolog_Functor742 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_Functor772 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_mprolog_Functor805 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_parse_mprolog_Functor862 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_Functor888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_39_39_in_parse_mprolog_QuotedAtom948 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_parse_mprolog_QuotedAtom978 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_QuotedAtom1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_mprolog_List1060 = new BitSet(new long[]{0x00000000001500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_List1089 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_parse_mprolog_List1130 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_List1164 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_mprolog_List1238 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_parse_mprolog_List1261 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_List1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_mprolog_InfixExpression1343 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_InfixExpression1361 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_mprolog_Operator_in_parse_mprolog_InfixExpression1383 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_InfixExpression1405 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_mprolog_InfixExpression1423 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_parse_mprolog_InfixExpression1446 = new BitSet(new long[]{0x00000000000500F0L});
    public static final BitSet FOLLOW_parse_mprolog_Term_in_parse_mprolog_InfixExpression1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATOR_in_parse_mprolog_Operator1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mprolog_Variable_in_parse_mprolog_Term1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mprolog_Parenthesis_in_parse_mprolog_Term1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mprolog_Functor_in_parse_mprolog_Term1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mprolog_QuotedAtom_in_parse_mprolog_Term1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mprolog_List_in_parse_mprolog_Term1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mprolog_InfixExpression_in_parse_mprolog_Term1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_mprolog_Parenthesis_in_synpred15_Pl1574 = new BitSet(new long[]{0x0000000000000002L});

}