// $ANTLR ${project.version} ${buildNumber}

	package SOS.resource.SOS.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class SOSParser extends SOSANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TEXT", "INTEGER", "QUOTED_34_34", "COMMENT", "FLOAT", "WHITESPACE", "LINEBREAK", "'Semantics'", "'Assuming'", "'Then'", "'Fact'", "'Where'", "','", "':'", "'->>'", "'in'", "'Transition'", "'System'", "'|-'", "'('", "')'", "'ADT'", "'Sorts'", "'Generators'", "'Operations'", "'Axioms'", "'->'", "';'", "'=>'", "'@'", "'^'", "'='", "'!='", "'Set'", "'Model'", "'{'", "'|'", "'}'", "'existsIn'", "'Union'", "'Excluding'", "'Intersect'", "'.'", "'class'"
    };
    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int TEXT=4;
    public static final int INTEGER=5;
    public static final int QUOTED_34_34=6;
    public static final int COMMENT=7;
    public static final int FLOAT=8;
    public static final int WHITESPACE=9;
    public static final int LINEBREAK=10;

    // delegates
    // delegators


        public SOSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SOSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[80+1];
             
             
        }
        

    public String[] getTokenNames() { return SOSParser.tokenNames; }
    public String getGrammarFileName() { return "SOS.g"; }


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
    		int followSetID = 158;
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
    	



    // $ANTLR start "start"
    // SOS.g:547:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_SOS_Semantics | c1= parse_SOS_adtmm_ADT ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        SOS.Semantics c0 = null;

        SOS.adtmm.ADT c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // SOS.g:548:1: ( (c0= parse_SOS_Semantics | c1= parse_SOS_adtmm_ADT ) EOF )
            // SOS.g:549:2: (c0= parse_SOS_Semantics | c1= parse_SOS_adtmm_ADT ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_0, 0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // SOS.g:555:2: (c0= parse_SOS_Semantics | c1= parse_SOS_adtmm_ADT )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==25) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // SOS.g:556:3: c0= parse_SOS_Semantics
                    {
                    pushFollow(FOLLOW_parse_SOS_Semantics_in_start82);
                    c0=parse_SOS_Semantics();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; 
                    }

                    }
                    break;
                case 2 :
                    // SOS.g:557:8: c1= parse_SOS_adtmm_ADT
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_ADT_in_start96);
                    c1=parse_SOS_adtmm_ADT();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; 
                    }

                    }
                    break;

            }

            match(input,EOF,FOLLOW_EOF_in_start103); if (state.failed) return element;
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


    // $ANTLR start "parse_SOS_Semantics"
    // SOS.g:565:1: parse_SOS_Semantics returns [SOS.Semantics element = null] : a0= 'Semantics' ( ( (a1_0= parse_SOS_Rule ) | (a2_0= parse_SOS_adtmm_ADT ) ) )* ;
    public final SOS.Semantics parse_SOS_Semantics() throws RecognitionException {
        SOS.Semantics element =  null;
        int parse_SOS_Semantics_StartIndex = input.index();
        Token a0=null;
        SOS.Rule a1_0 = null;

        SOS.adtmm.ADT a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // SOS.g:568:1: (a0= 'Semantics' ( ( (a1_0= parse_SOS_Rule ) | (a2_0= parse_SOS_adtmm_ADT ) ) )* )
            // SOS.g:569:2: a0= 'Semantics' ( ( (a1_0= parse_SOS_Rule ) | (a2_0= parse_SOS_adtmm_ADT ) ) )*
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_SOS_Semantics129); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.SOSFactory.eINSTANCE.createSemantics();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_0_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 1, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 1, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 1, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }
            // SOS.g:585:2: ( ( (a1_0= parse_SOS_Rule ) | (a2_0= parse_SOS_adtmm_ADT ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==14||LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // SOS.g:586:3: ( (a1_0= parse_SOS_Rule ) | (a2_0= parse_SOS_adtmm_ADT ) )
            	    {
            	    // SOS.g:586:3: ( (a1_0= parse_SOS_Rule ) | (a2_0= parse_SOS_adtmm_ADT ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==12||LA2_0==14) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==25) ) {
            	        alt2=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // SOS.g:587:4: (a1_0= parse_SOS_Rule )
            	            {
            	            // SOS.g:587:4: (a1_0= parse_SOS_Rule )
            	            // SOS.g:588:5: a1_0= parse_SOS_Rule
            	            {
            	            pushFollow(FOLLOW_parse_SOS_Rule_in_parse_SOS_Semantics158);
            	            a1_0=parse_SOS_Rule();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
            	              			
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // SOS.g:616:8: (a2_0= parse_SOS_adtmm_ADT )
            	            {
            	            // SOS.g:616:8: (a2_0= parse_SOS_adtmm_ADT )
            	            // SOS.g:617:5: a2_0= parse_SOS_adtmm_ADT
            	            {
            	            pushFollow(FOLLOW_parse_SOS_adtmm_ADT_in_parse_SOS_Semantics200);
            	            a2_0=parse_SOS_adtmm_ADT();

            	            state._fsp--;
            	            if (state.failed) return element;
            	            if ( state.backtracking==0 ) {

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

            	            }

            	            if ( state.backtracking==0 ) {

            	              				// expected elements (follow set)
            	              				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
            	              				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
            	              			
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 4, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_SOS_Semantics_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_Semantics"


    // $ANTLR start "parse_SOS_Rule"
    // SOS.g:655:1: parse_SOS_Rule returns [SOS.Rule element = null] : ( (a0= 'Assuming' (a1_0= parse_SOS_PremisseList ) a2= 'Then' (a3_0= parse_SOS_Conclusion ) ) | (a4= 'Fact' (a5_0= parse_SOS_Conclusion ) ) ) ( (a6= 'Where' ( (a7_0= parse_SOS_adtmm_Variable ) )+ ) )? ;
    public final SOS.Rule parse_SOS_Rule() throws RecognitionException {
        SOS.Rule element =  null;
        int parse_SOS_Rule_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        SOS.PremisseList a1_0 = null;

        SOS.Conclusion a3_0 = null;

        SOS.Conclusion a5_0 = null;

        SOS.adtmm.Variable a7_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // SOS.g:658:1: ( ( (a0= 'Assuming' (a1_0= parse_SOS_PremisseList ) a2= 'Then' (a3_0= parse_SOS_Conclusion ) ) | (a4= 'Fact' (a5_0= parse_SOS_Conclusion ) ) ) ( (a6= 'Where' ( (a7_0= parse_SOS_adtmm_Variable ) )+ ) )? )
            // SOS.g:659:2: ( (a0= 'Assuming' (a1_0= parse_SOS_PremisseList ) a2= 'Then' (a3_0= parse_SOS_Conclusion ) ) | (a4= 'Fact' (a5_0= parse_SOS_Conclusion ) ) ) ( (a6= 'Where' ( (a7_0= parse_SOS_adtmm_Variable ) )+ ) )?
            {
            // SOS.g:659:2: ( (a0= 'Assuming' (a1_0= parse_SOS_PremisseList ) a2= 'Then' (a3_0= parse_SOS_Conclusion ) ) | (a4= 'Fact' (a5_0= parse_SOS_Conclusion ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // SOS.g:660:3: (a0= 'Assuming' (a1_0= parse_SOS_PremisseList ) a2= 'Then' (a3_0= parse_SOS_Conclusion ) )
                    {
                    // SOS.g:660:3: (a0= 'Assuming' (a1_0= parse_SOS_PremisseList ) a2= 'Then' (a3_0= parse_SOS_Conclusion ) )
                    // SOS.g:661:4: a0= 'Assuming' (a1_0= parse_SOS_PremisseList ) a2= 'Then' (a3_0= parse_SOS_Conclusion )
                    {
                    a0=(Token)match(input,12,FOLLOW_12_in_parse_SOS_Rule265); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.SOSFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_0_0_0_0_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_4);
                      			
                    }
                    // SOS.g:684:4: (a1_0= parse_SOS_PremisseList )
                    // SOS.g:685:5: a1_0= parse_SOS_PremisseList
                    {
                    pushFollow(FOLLOW_parse_SOS_PremisseList_in_parse_SOS_Rule291);
                    a1_0=parse_SOS_PremisseList();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 6);
                      			
                    }
                    a2=(Token)match(input,13,FOLLOW_13_in_parse_SOS_Rule319); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.SOSFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_0_0_0_0_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 7, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      			
                    }
                    // SOS.g:733:4: (a3_0= parse_SOS_Conclusion )
                    // SOS.g:734:5: a3_0= parse_SOS_Conclusion
                    {
                    pushFollow(FOLLOW_parse_SOS_Conclusion_in_parse_SOS_Rule345);
                    a3_0=parse_SOS_Conclusion();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 8);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 8, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 9);
                      			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
                      		
                    }

                    }
                    break;
                case 2 :
                    // SOS.g:772:6: (a4= 'Fact' (a5_0= parse_SOS_Conclusion ) )
                    {
                    // SOS.g:772:6: (a4= 'Fact' (a5_0= parse_SOS_Conclusion ) )
                    // SOS.g:773:4: a4= 'Fact' (a5_0= parse_SOS_Conclusion )
                    {
                    a4=(Token)match(input,14,FOLLOW_14_in_parse_SOS_Rule394); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.SOSFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_0_0_1_0_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 10, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_5, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_6);
                      			
                    }
                    // SOS.g:796:4: (a5_0= parse_SOS_Conclusion )
                    // SOS.g:797:5: a5_0= parse_SOS_Conclusion
                    {
                    pushFollow(FOLLOW_parse_SOS_Conclusion_in_parse_SOS_Rule420);
                    a5_0=parse_SOS_Conclusion();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 11);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 12);
                      			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      			addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
                      		
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 13);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 13, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 13, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 13, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }
            // SOS.g:843:2: ( (a6= 'Where' ( (a7_0= parse_SOS_adtmm_Variable ) )+ ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // SOS.g:844:3: (a6= 'Where' ( (a7_0= parse_SOS_adtmm_Variable ) )+ )
                    {
                    // SOS.g:844:3: (a6= 'Where' ( (a7_0= parse_SOS_adtmm_Variable ) )+ )
                    // SOS.g:845:4: a6= 'Where' ( (a7_0= parse_SOS_adtmm_Variable ) )+
                    {
                    a6=(Token)match(input,15,FOLLOW_15_in_parse_SOS_Rule474); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.SOSFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_1_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 14, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
                      			
                    }
                    // SOS.g:859:4: ( (a7_0= parse_SOS_adtmm_Variable ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==TEXT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // SOS.g:860:5: (a7_0= parse_SOS_adtmm_Variable )
                    	    {
                    	    // SOS.g:860:5: (a7_0= parse_SOS_adtmm_Variable )
                    	    // SOS.g:861:6: a7_0= parse_SOS_adtmm_Variable
                    	    {
                    	    pushFollow(FOLLOW_parse_SOS_adtmm_Variable_in_parse_SOS_Rule507);
                    	    a7_0=parse_SOS_adtmm_Variable();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 15, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 15, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 15, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 15, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 16, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 16, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 16, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_SOS_Rule_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_Rule"


    // $ANTLR start "parse_SOS_PremisseList"
    // SOS.g:901:1: parse_SOS_PremisseList returns [SOS.PremisseList element = null] : (a0_0= parse_SOS_Condition ) ( (a1= ',' (a2_0= parse_SOS_PremisseList ) ) )? ;
    public final SOS.PremisseList parse_SOS_PremisseList() throws RecognitionException {
        SOS.PremisseList element =  null;
        int parse_SOS_PremisseList_StartIndex = input.index();
        Token a1=null;
        SOS.Condition a0_0 = null;

        SOS.PremisseList a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // SOS.g:904:1: ( (a0_0= parse_SOS_Condition ) ( (a1= ',' (a2_0= parse_SOS_PremisseList ) ) )? )
            // SOS.g:905:2: (a0_0= parse_SOS_Condition ) ( (a1= ',' (a2_0= parse_SOS_PremisseList ) ) )?
            {
            // SOS.g:905:2: (a0_0= parse_SOS_Condition )
            // SOS.g:906:3: a0_0= parse_SOS_Condition
            {
            pushFollow(FOLLOW_parse_SOS_Condition_in_parse_SOS_PremisseList579);
            a0_0=parse_SOS_Condition();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_17, 17);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 17);
              	
            }
            // SOS.g:932:2: ( (a1= ',' (a2_0= parse_SOS_PremisseList ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // SOS.g:933:3: (a1= ',' (a2_0= parse_SOS_PremisseList ) )
                    {
                    // SOS.g:933:3: (a1= ',' (a2_0= parse_SOS_PremisseList ) )
                    // SOS.g:934:4: a1= ',' (a2_0= parse_SOS_PremisseList )
                    {
                    a1=(Token)match(input,16,FOLLOW_16_in_parse_SOS_PremisseList606); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.SOSFactory.eINSTANCE.createPremisseList();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_2_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_2, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 18, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_3, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_8);
                      			
                    }
                    // SOS.g:957:4: (a2_0= parse_SOS_PremisseList )
                    // SOS.g:958:5: a2_0= parse_SOS_PremisseList
                    {
                    pushFollow(FOLLOW_parse_SOS_PremisseList_in_parse_SOS_PremisseList632);
                    a2_0=parse_SOS_PremisseList();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 19);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 20);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_SOS_PremisseList_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_PremisseList"


    // $ANTLR start "parse_SOS_AlgebraicConditionList"
    // SOS.g:992:1: parse_SOS_AlgebraicConditionList returns [SOS.AlgebraicConditionList element = null] : (a0_0= parse_SOS_AlgebraicCondition ) ( (a1= ',' (a2_0= parse_SOS_AlgebraicConditionList ) ) )? ;
    public final SOS.AlgebraicConditionList parse_SOS_AlgebraicConditionList() throws RecognitionException {
        SOS.AlgebraicConditionList element =  null;
        int parse_SOS_AlgebraicConditionList_StartIndex = input.index();
        Token a1=null;
        SOS.AlgebraicCondition a0_0 = null;

        SOS.AlgebraicConditionList a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // SOS.g:995:1: ( (a0_0= parse_SOS_AlgebraicCondition ) ( (a1= ',' (a2_0= parse_SOS_AlgebraicConditionList ) ) )? )
            // SOS.g:996:2: (a0_0= parse_SOS_AlgebraicCondition ) ( (a1= ',' (a2_0= parse_SOS_AlgebraicConditionList ) ) )?
            {
            // SOS.g:996:2: (a0_0= parse_SOS_AlgebraicCondition )
            // SOS.g:997:3: a0_0= parse_SOS_AlgebraicCondition
            {
            pushFollow(FOLLOW_parse_SOS_AlgebraicCondition_in_parse_SOS_AlgebraicConditionList692);
            a0_0=parse_SOS_AlgebraicCondition();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_18, 21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 21);
              	
            }
            // SOS.g:1023:2: ( (a1= ',' (a2_0= parse_SOS_AlgebraicConditionList ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // SOS.g:1024:3: (a1= ',' (a2_0= parse_SOS_AlgebraicConditionList ) )
                    {
                    // SOS.g:1024:3: (a1= ',' (a2_0= parse_SOS_AlgebraicConditionList ) )
                    // SOS.g:1025:4: a1= ',' (a2_0= parse_SOS_AlgebraicConditionList )
                    {
                    a1=(Token)match(input,16,FOLLOW_16_in_parse_SOS_AlgebraicConditionList719); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.SOSFactory.eINSTANCE.createAlgebraicConditionList();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_3_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_10);
                      			
                    }
                    // SOS.g:1048:4: (a2_0= parse_SOS_AlgebraicConditionList )
                    // SOS.g:1049:5: a2_0= parse_SOS_AlgebraicConditionList
                    {
                    pushFollow(FOLLOW_parse_SOS_AlgebraicConditionList_in_parse_SOS_AlgebraicConditionList745);
                    a2_0=parse_SOS_AlgebraicConditionList();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 23);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 24);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_SOS_AlgebraicConditionList_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_AlgebraicConditionList"


    // $ANTLR start "parse_SOS_Conclusion"
    // SOS.g:1083:1: parse_SOS_Conclusion returns [SOS.Conclusion element = null] : (a0_0= parse_SOS_Condition ) ;
    public final SOS.Conclusion parse_SOS_Conclusion() throws RecognitionException {
        SOS.Conclusion element =  null;
        int parse_SOS_Conclusion_StartIndex = input.index();
        SOS.Condition a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // SOS.g:1086:1: ( (a0_0= parse_SOS_Condition ) )
            // SOS.g:1087:2: (a0_0= parse_SOS_Condition )
            {
            // SOS.g:1087:2: (a0_0= parse_SOS_Condition )
            // SOS.g:1088:3: a0_0= parse_SOS_Condition
            {
            pushFollow(FOLLOW_parse_SOS_Condition_in_parse_SOS_Conclusion805);
            a0_0=parse_SOS_Condition();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_15, 25);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 25, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 25, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 25, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_SOS_Conclusion_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_Conclusion"


    // $ANTLR start "parse_SOS_Transition"
    // SOS.g:1118:1: parse_SOS_Transition returns [SOS.Transition element = null] : ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )? (a2_0= parse_SOS_adtmm_Term ) a3= '->>' (a4_0= parse_SOS_adtmm_Term ) a5= '->>' (a6_0= parse_SOS_adtmm_Term ) a7= 'in' a8= 'Transition' a9= 'System' ;
    public final SOS.Transition parse_SOS_Transition() throws RecognitionException {
        SOS.Transition element =  null;
        int parse_SOS_Transition_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        Token a5=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        SOS.adtmm.Term a0_0 = null;

        SOS.adtmm.Term a2_0 = null;

        SOS.adtmm.Term a4_0 = null;

        SOS.adtmm.Term a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // SOS.g:1121:1: ( ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )? (a2_0= parse_SOS_adtmm_Term ) a3= '->>' (a4_0= parse_SOS_adtmm_Term ) a5= '->>' (a6_0= parse_SOS_adtmm_Term ) a7= 'in' a8= 'Transition' a9= 'System' )
            // SOS.g:1122:2: ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )? (a2_0= parse_SOS_adtmm_Term ) a3= '->>' (a4_0= parse_SOS_adtmm_Term ) a5= '->>' (a6_0= parse_SOS_adtmm_Term ) a7= 'in' a8= 'Transition' a9= 'System'
            {
            // SOS.g:1122:2: ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // SOS.g:1123:3: ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' )
                    {
                    // SOS.g:1123:3: ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' )
                    // SOS.g:1124:4: (a0_0= parse_SOS_adtmm_Term ) a1= ':'
                    {
                    // SOS.g:1124:4: (a0_0= parse_SOS_adtmm_Term )
                    // SOS.g:1125:5: a0_0= parse_SOS_adtmm_Term
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_Transition853);
                    a0_0=parse_SOS_adtmm_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 26);
                      			
                    }
                    a1=(Token)match(input,17,FOLLOW_17_in_parse_SOS_Transition881); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.SOSFactory.eINSTANCE.createTransition();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_0_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 27, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 28, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_13);
              	
            }
            // SOS.g:1187:2: (a2_0= parse_SOS_adtmm_Term )
            // SOS.g:1188:3: a2_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_Transition918);
            a2_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_21, 29);
              	
            }
            a3=(Token)match(input,18,FOLLOW_18_in_parse_SOS_Transition936); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.SOSFactory.eINSTANCE.createTransition();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 30, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_14);
              	
            }
            // SOS.g:1235:2: (a4_0= parse_SOS_adtmm_Term )
            // SOS.g:1236:3: a4_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_Transition954);
            a4_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_22, 31);
              	
            }
            a5=(Token)match(input,18,FOLLOW_18_in_parse_SOS_Transition972); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.SOSFactory.eINSTANCE.createTransition();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 32, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_15);
              	
            }
            // SOS.g:1283:2: (a6_0= parse_SOS_adtmm_Term )
            // SOS.g:1284:3: a6_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_Transition990);
            a6_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_23, 33);
              	
            }
            a7=(Token)match(input,19,FOLLOW_19_in_parse_SOS_Transition1008); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.SOSFactory.eINSTANCE.createTransition();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a7, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_24, 34);
              	
            }
            a8=(Token)match(input,20,FOLLOW_20_in_parse_SOS_Transition1022); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.SOSFactory.eINSTANCE.createTransition();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_25, 35);
              	
            }
            a9=(Token)match(input,21,FOLLOW_21_in_parse_SOS_Transition1036); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.SOSFactory.eINSTANCE.createTransition();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_5_0_0_8, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_17, 36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 36);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_SOS_Transition_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_Transition"


    // $ANTLR start "parse_SOS_TypeJudment"
    // SOS.g:1354:1: parse_SOS_TypeJudment returns [SOS.TypeJudment element = null] : ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )? (a2_0= parse_SOS_adtmm_Term ) a3= '|-' (a4_0= parse_SOS_adtmm_Term ) ;
    public final SOS.TypeJudment parse_SOS_TypeJudment() throws RecognitionException {
        SOS.TypeJudment element =  null;
        int parse_SOS_TypeJudment_StartIndex = input.index();
        Token a1=null;
        Token a3=null;
        SOS.adtmm.Term a0_0 = null;

        SOS.adtmm.Term a2_0 = null;

        SOS.adtmm.Term a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // SOS.g:1357:1: ( ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )? (a2_0= parse_SOS_adtmm_Term ) a3= '|-' (a4_0= parse_SOS_adtmm_Term ) )
            // SOS.g:1358:2: ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )? (a2_0= parse_SOS_adtmm_Term ) a3= '|-' (a4_0= parse_SOS_adtmm_Term )
            {
            // SOS.g:1358:2: ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // SOS.g:1359:3: ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' )
                    {
                    // SOS.g:1359:3: ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' )
                    // SOS.g:1360:4: (a0_0= parse_SOS_adtmm_Term ) a1= ':'
                    {
                    // SOS.g:1360:4: (a0_0= parse_SOS_adtmm_Term )
                    // SOS.g:1361:5: a0_0= parse_SOS_adtmm_Term
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_TypeJudment1080);
                    a0_0=parse_SOS_adtmm_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 37);
                      			
                    }
                    a1=(Token)match(input,17,FOLLOW_17_in_parse_SOS_TypeJudment1108); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.SOSFactory.eINSTANCE.createTypeJudment();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_6_0_0_0_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 38, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 39, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_16);
              	
            }
            // SOS.g:1423:2: (a2_0= parse_SOS_adtmm_Term )
            // SOS.g:1424:3: a2_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_TypeJudment1145);
            a2_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_27, 40);
              	
            }
            a3=(Token)match(input,22,FOLLOW_22_in_parse_SOS_TypeJudment1163); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.SOSFactory.eINSTANCE.createTypeJudment();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_6_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 41, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 41, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 41, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 41, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 41, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 41, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 41, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 41, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 41, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_17);
              	
            }
            // SOS.g:1471:2: (a4_0= parse_SOS_adtmm_Term )
            // SOS.g:1472:3: a4_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_TypeJudment1181);
            a4_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_17, 42);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 42);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_SOS_TypeJudment_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_TypeJudment"


    // $ANTLR start "parse_SOS_AlgebraicCondition"
    // SOS.g:1500:1: parse_SOS_AlgebraicCondition returns [SOS.AlgebraicCondition element = null] : (a0= '(' (a1_0= parse_SOS_adtmm_AbstractEquation ) a2= ')' | (a3_0= parse_SOS_adtmm_AbstractEquation ) );
    public final SOS.AlgebraicCondition parse_SOS_AlgebraicCondition() throws RecognitionException {
        SOS.AlgebraicCondition element =  null;
        int parse_SOS_AlgebraicCondition_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        SOS.adtmm.AbstractEquation a1_0 = null;

        SOS.adtmm.AbstractEquation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // SOS.g:1503:1: (a0= '(' (a1_0= parse_SOS_adtmm_AbstractEquation ) a2= ')' | (a3_0= parse_SOS_adtmm_AbstractEquation ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==TEXT||LA11_0==19||LA11_0==33||(LA11_0>=38 && LA11_0<=39)||(LA11_0>=42 && LA11_0<=45)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // SOS.g:1504:2: a0= '(' (a1_0= parse_SOS_adtmm_AbstractEquation ) a2= ')'
                    {
                    a0=(Token)match(input,23,FOLLOW_23_in_parse_SOS_AlgebraicCondition1214); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = SOS.SOSFactory.eINSTANCE.createAlgebraicCondition();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_7_0_0_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 43, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 43, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 43, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 43, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 43, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 43, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 43, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 43, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 43, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12);
                      	
                    }
                    // SOS.g:1526:2: (a1_0= parse_SOS_adtmm_AbstractEquation )
                    // SOS.g:1527:3: a1_0= parse_SOS_adtmm_AbstractEquation
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_AbstractEquation_in_parse_SOS_AlgebraicCondition1232);
                    a1_0=parse_SOS_adtmm_AbstractEquation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 44);
                      	
                    }
                    a2=(Token)match(input,24,FOLLOW_24_in_parse_SOS_AlgebraicCondition1250); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = SOS.SOSFactory.eINSTANCE.createAlgebraicCondition();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_7_0_0_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_17, 45);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 45);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_18, 45);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 45);
                      	
                    }

                    }
                    break;
                case 2 :
                    // SOS.g:1570:4: (a3_0= parse_SOS_adtmm_AbstractEquation )
                    {
                    // SOS.g:1570:4: (a3_0= parse_SOS_adtmm_AbstractEquation )
                    // SOS.g:1571:3: a3_0= parse_SOS_adtmm_AbstractEquation
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_AbstractEquation_in_parse_SOS_AlgebraicCondition1272);
                    a3_0=parse_SOS_adtmm_AbstractEquation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_17, 46);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_14, 46);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_18, 46);
                      		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 46);
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 9, parse_SOS_AlgebraicCondition_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_AlgebraicCondition"


    // $ANTLR start "parse_SOS_adtmm_ADT"
    // SOS.g:1601:1: parse_SOS_adtmm_ADT returns [SOS.adtmm.ADT element = null] : a0= 'ADT' (a1= TEXT ) ( (a2= 'Sorts' ( (a3_0= parse_SOS_adtmm_SortDeclaration ) )+ ) )? ( (a4= 'Generators' ( (a5_0= parse_SOS_adtmm_Operation ) )+ ) )? ( (a6= 'Operations' ( (a7_0= parse_SOS_adtmm_Operation ) )+ ) )? ( (a8= 'Axioms' ( (a9_0= parse_SOS_adtmm_CondEquation ) )+ ) )? ( (a10= 'Where' ( (a11_0= parse_SOS_adtmm_Variable ) )+ ) )? ;
    public final SOS.adtmm.ADT parse_SOS_adtmm_ADT() throws RecognitionException {
        SOS.adtmm.ADT element =  null;
        int parse_SOS_adtmm_ADT_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a10=null;
        SOS.adtmm.SortDeclaration a3_0 = null;

        SOS.adtmm.Operation a5_0 = null;

        SOS.adtmm.Operation a7_0 = null;

        SOS.adtmm.CondEquation a9_0 = null;

        SOS.adtmm.Variable a11_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // SOS.g:1604:1: (a0= 'ADT' (a1= TEXT ) ( (a2= 'Sorts' ( (a3_0= parse_SOS_adtmm_SortDeclaration ) )+ ) )? ( (a4= 'Generators' ( (a5_0= parse_SOS_adtmm_Operation ) )+ ) )? ( (a6= 'Operations' ( (a7_0= parse_SOS_adtmm_Operation ) )+ ) )? ( (a8= 'Axioms' ( (a9_0= parse_SOS_adtmm_CondEquation ) )+ ) )? ( (a10= 'Where' ( (a11_0= parse_SOS_adtmm_Variable ) )+ ) )? )
            // SOS.g:1605:2: a0= 'ADT' (a1= TEXT ) ( (a2= 'Sorts' ( (a3_0= parse_SOS_adtmm_SortDeclaration ) )+ ) )? ( (a4= 'Generators' ( (a5_0= parse_SOS_adtmm_Operation ) )+ ) )? ( (a6= 'Operations' ( (a7_0= parse_SOS_adtmm_Operation ) )+ ) )? ( (a8= 'Axioms' ( (a9_0= parse_SOS_adtmm_CondEquation ) )+ ) )? ( (a10= 'Where' ( (a11_0= parse_SOS_adtmm_Variable ) )+ ) )?
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_SOS_adtmm_ADT1305); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_29, 47);
              	
            }
            // SOS.g:1619:2: (a1= TEXT )
            // SOS.g:1620:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_SOS_adtmm_ADT1323); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_30, 48);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 48);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 48);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 48);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 48);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 48, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 48, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 48, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }
            // SOS.g:1662:2: ( (a2= 'Sorts' ( (a3_0= parse_SOS_adtmm_SortDeclaration ) )+ ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // SOS.g:1663:3: (a2= 'Sorts' ( (a3_0= parse_SOS_adtmm_SortDeclaration ) )+ )
                    {
                    // SOS.g:1663:3: (a2= 'Sorts' ( (a3_0= parse_SOS_adtmm_SortDeclaration ) )+ )
                    // SOS.g:1664:4: a2= 'Sorts' ( (a3_0= parse_SOS_adtmm_SortDeclaration ) )+
                    {
                    a2=(Token)match(input,26,FOLLOW_26_in_parse_SOS_adtmm_ADT1353); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_2_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_35, 49, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
                      			
                    }
                    // SOS.g:1678:4: ( (a3_0= parse_SOS_adtmm_SortDeclaration ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==TEXT) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // SOS.g:1679:5: (a3_0= parse_SOS_adtmm_SortDeclaration )
                    	    {
                    	    // SOS.g:1679:5: (a3_0= parse_SOS_adtmm_SortDeclaration )
                    	    // SOS.g:1680:6: a3_0= parse_SOS_adtmm_SortDeclaration
                    	    {
                    	    pushFollow(FOLLOW_parse_SOS_adtmm_SortDeclaration_in_parse_SOS_adtmm_ADT1386);
                    	    a3_0=parse_SOS_adtmm_SortDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_35, 50, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 50);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 50);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 50);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 50);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 50, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 50, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 50, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 51);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 51);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 51);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 51);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 51, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 51, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 51, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }
            // SOS.g:1726:2: ( (a4= 'Generators' ( (a5_0= parse_SOS_adtmm_Operation ) )+ ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // SOS.g:1727:3: (a4= 'Generators' ( (a5_0= parse_SOS_adtmm_Operation ) )+ )
                    {
                    // SOS.g:1727:3: (a4= 'Generators' ( (a5_0= parse_SOS_adtmm_Operation ) )+ )
                    // SOS.g:1728:4: a4= 'Generators' ( (a5_0= parse_SOS_adtmm_Operation ) )+
                    {
                    a4=(Token)match(input,27,FOLLOW_27_in_parse_SOS_adtmm_ADT1448); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_36, 52, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_19);
                      			
                    }
                    // SOS.g:1742:4: ( (a5_0= parse_SOS_adtmm_Operation ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==TEXT) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // SOS.g:1743:5: (a5_0= parse_SOS_adtmm_Operation )
                    	    {
                    	    // SOS.g:1743:5: (a5_0= parse_SOS_adtmm_Operation )
                    	    // SOS.g:1744:6: a5_0= parse_SOS_adtmm_Operation
                    	    {
                    	    pushFollow(FOLLOW_parse_SOS_adtmm_Operation_in_parse_SOS_adtmm_ADT1481);
                    	    a5_0=parse_SOS_adtmm_Operation();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_36, 53, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_19);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 53);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 53);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 53);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 53, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 53, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 53, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 54);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 54);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 54);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 54, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 54, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 54, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }
            // SOS.g:1788:2: ( (a6= 'Operations' ( (a7_0= parse_SOS_adtmm_Operation ) )+ ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // SOS.g:1789:3: (a6= 'Operations' ( (a7_0= parse_SOS_adtmm_Operation ) )+ )
                    {
                    // SOS.g:1789:3: (a6= 'Operations' ( (a7_0= parse_SOS_adtmm_Operation ) )+ )
                    // SOS.g:1790:4: a6= 'Operations' ( (a7_0= parse_SOS_adtmm_Operation ) )+
                    {
                    a6=(Token)match(input,28,FOLLOW_28_in_parse_SOS_adtmm_ADT1543); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_36, 55, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_20);
                      			
                    }
                    // SOS.g:1804:4: ( (a7_0= parse_SOS_adtmm_Operation ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==TEXT) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // SOS.g:1805:5: (a7_0= parse_SOS_adtmm_Operation )
                    	    {
                    	    // SOS.g:1805:5: (a7_0= parse_SOS_adtmm_Operation )
                    	    // SOS.g:1806:6: a7_0= parse_SOS_adtmm_Operation
                    	    {
                    	    pushFollow(FOLLOW_parse_SOS_adtmm_Operation_in_parse_SOS_adtmm_ADT1576);
                    	    a7_0=parse_SOS_adtmm_Operation();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_36, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_20);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 56);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 56);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 56, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 57);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 57);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 57, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 57, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 57, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }
            // SOS.g:1848:2: ( (a8= 'Axioms' ( (a9_0= parse_SOS_adtmm_CondEquation ) )+ ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // SOS.g:1849:3: (a8= 'Axioms' ( (a9_0= parse_SOS_adtmm_CondEquation ) )+ )
                    {
                    // SOS.g:1849:3: (a8= 'Axioms' ( (a9_0= parse_SOS_adtmm_CondEquation ) )+ )
                    // SOS.g:1850:4: a8= 'Axioms' ( (a9_0= parse_SOS_adtmm_CondEquation ) )+
                    {
                    a8=(Token)match(input,29,FOLLOW_29_in_parse_SOS_adtmm_ADT1638); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_5_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_37, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 58, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      			
                    }
                    // SOS.g:1873:4: ( (a9_0= parse_SOS_adtmm_CondEquation ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==TEXT||LA18_0==19||LA18_0==23||LA18_0==33||(LA18_0>=38 && LA18_0<=39)||(LA18_0>=42 && LA18_0<=45)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // SOS.g:1874:5: (a9_0= parse_SOS_adtmm_CondEquation )
                    	    {
                    	    // SOS.g:1874:5: (a9_0= parse_SOS_adtmm_CondEquation )
                    	    // SOS.g:1875:6: a9_0= parse_SOS_adtmm_CondEquation
                    	    {
                    	    pushFollow(FOLLOW_parse_SOS_adtmm_CondEquation_in_parse_SOS_adtmm_ADT1671);
                    	    a9_0=parse_SOS_adtmm_CondEquation();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_37, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 59);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 59, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 60);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 60, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 60, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 60, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }
            // SOS.g:1924:2: ( (a10= 'Where' ( (a11_0= parse_SOS_adtmm_Variable ) )+ ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // SOS.g:1925:3: (a10= 'Where' ( (a11_0= parse_SOS_adtmm_Variable ) )+ )
                    {
                    // SOS.g:1925:3: (a10= 'Where' ( (a11_0= parse_SOS_adtmm_Variable ) )+ )
                    // SOS.g:1926:4: a10= 'Where' ( (a11_0= parse_SOS_adtmm_Variable ) )+
                    {
                    a10=(Token)match(input,15,FOLLOW_15_in_parse_SOS_adtmm_ADT1733); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createADT();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_8_0_0_6_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a10, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 61, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
                      			
                    }
                    // SOS.g:1940:4: ( (a11_0= parse_SOS_adtmm_Variable ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==TEXT) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // SOS.g:1941:5: (a11_0= parse_SOS_adtmm_Variable )
                    	    {
                    	    // SOS.g:1941:5: (a11_0= parse_SOS_adtmm_Variable )
                    	    // SOS.g:1942:6: a11_0= parse_SOS_adtmm_Variable
                    	    {
                    	    pushFollow(FOLLOW_parse_SOS_adtmm_Variable_in_parse_SOS_adtmm_ADT1766);
                    	    a11_0=parse_SOS_adtmm_Variable();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 62, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_23);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 62, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 62, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 62, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 63, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 63, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 63, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_SOS_adtmm_ADT_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_ADT"


    // $ANTLR start "parse_SOS_adtmm_Operation"
    // SOS.g:1982:1: parse_SOS_adtmm_Operation returns [SOS.adtmm.Operation element = null] : (a0= TEXT ) a1= ':' ( (a2_0= parse_SOS_adtmm_Sort ) )* a3= '->' (a4_0= parse_SOS_adtmm_Sort ) a5= ';' ;
    public final SOS.adtmm.Operation parse_SOS_adtmm_Operation() throws RecognitionException {
        SOS.adtmm.Operation element =  null;
        int parse_SOS_adtmm_Operation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        SOS.adtmm.Sort a2_0 = null;

        SOS.adtmm.Sort a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // SOS.g:1985:1: ( (a0= TEXT ) a1= ':' ( (a2_0= parse_SOS_adtmm_Sort ) )* a3= '->' (a4_0= parse_SOS_adtmm_Sort ) a5= ';' )
            // SOS.g:1986:2: (a0= TEXT ) a1= ':' ( (a2_0= parse_SOS_adtmm_Sort ) )* a3= '->' (a4_0= parse_SOS_adtmm_Sort ) a5= ';'
            {
            // SOS.g:1986:2: (a0= TEXT )
            // SOS.g:1987:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_SOS_adtmm_Operation1838); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_38, 64);
              	
            }
            a1=(Token)match(input,17,FOLLOW_17_in_parse_SOS_adtmm_Operation1859); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createOperation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_9_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 65, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 65, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 65, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_42, 65);
              	
            }
            // SOS.g:2039:2: ( (a2_0= parse_SOS_adtmm_Sort ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==TEXT||LA22_0==37||LA22_0==47) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // SOS.g:2040:3: (a2_0= parse_SOS_adtmm_Sort )
            	    {
            	    // SOS.g:2040:3: (a2_0= parse_SOS_adtmm_Sort )
            	    // SOS.g:2041:4: a2_0= parse_SOS_adtmm_Sort
            	    {
            	    pushFollow(FOLLOW_parse_SOS_adtmm_Sort_in_parse_SOS_adtmm_Operation1882);
            	    a2_0=parse_SOS_adtmm_Sort();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 66, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 66, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 66, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_42, 66);
              	
            }
            a3=(Token)match(input,30,FOLLOW_30_in_parse_SOS_adtmm_Operation1908); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createOperation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_9_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 67, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 67, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 67, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_25);
              	
            }
            // SOS.g:2086:2: (a4_0= parse_SOS_adtmm_Sort )
            // SOS.g:2087:3: a4_0= parse_SOS_adtmm_Sort
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Sort_in_parse_SOS_adtmm_Operation1926);
            a4_0=parse_SOS_adtmm_Sort();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_43, 68);
              	
            }
            a5=(Token)match(input,31,FOLLOW_31_in_parse_SOS_adtmm_Operation1944); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createOperation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_9_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_36, 69, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_19);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 69);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 69);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 69);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 69, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 69, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 69, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_SOS_adtmm_Operation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_Operation"


    // $ANTLR start "parse_SOS_adtmm_Variable"
    // SOS.g:2134:1: parse_SOS_adtmm_Variable returns [SOS.adtmm.Variable element = null] : (a0= TEXT ) ( (a1= ':' (a2_0= parse_SOS_adtmm_Sort ) ) )? a3= ';' ;
    public final SOS.adtmm.Variable parse_SOS_adtmm_Variable() throws RecognitionException {
        SOS.adtmm.Variable element =  null;
        int parse_SOS_adtmm_Variable_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        SOS.adtmm.Sort a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // SOS.g:2137:1: ( (a0= TEXT ) ( (a1= ':' (a2_0= parse_SOS_adtmm_Sort ) ) )? a3= ';' )
            // SOS.g:2138:2: (a0= TEXT ) ( (a1= ':' (a2_0= parse_SOS_adtmm_Sort ) ) )? a3= ';'
            {
            // SOS.g:2138:2: (a0= TEXT )
            // SOS.g:2139:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_SOS_adtmm_Variable1977); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_44, 70);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_45, 70);
              	
            }
            // SOS.g:2175:2: ( (a1= ':' (a2_0= parse_SOS_adtmm_Sort ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // SOS.g:2176:3: (a1= ':' (a2_0= parse_SOS_adtmm_Sort ) )
                    {
                    // SOS.g:2176:3: (a1= ':' (a2_0= parse_SOS_adtmm_Sort ) )
                    // SOS.g:2177:4: a1= ':' (a2_0= parse_SOS_adtmm_Sort )
                    {
                    a1=(Token)match(input,17,FOLLOW_17_in_parse_SOS_adtmm_Variable2007); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createVariable();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_10_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 71, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_26);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 71, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_26);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 71, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_26);
                      			
                    }
                    // SOS.g:2193:4: (a2_0= parse_SOS_adtmm_Sort )
                    // SOS.g:2194:5: a2_0= parse_SOS_adtmm_Sort
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_Sort_in_parse_SOS_adtmm_Variable2033);
                    a2_0=parse_SOS_adtmm_Sort();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_45, 72);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_45, 73);
              	
            }
            a3=(Token)match(input,31,FOLLOW_31_in_parse_SOS_adtmm_Variable2074); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createVariable();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_10_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_16, 74, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_7);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 74, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 74, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 74, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_SOS_adtmm_Variable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_Variable"


    // $ANTLR start "parse_SOS_adtmm_CondEquation"
    // SOS.g:2245:1: parse_SOS_adtmm_CondEquation returns [SOS.adtmm.CondEquation element = null] : ( (a0= '(' ( (a1_0= parse_SOS_adtmm_AbstractEquation ) )+ a2= ')' a3= '=>' ) )? (a4_0= parse_SOS_adtmm_Equation ) a5= ';' ;
    public final SOS.adtmm.CondEquation parse_SOS_adtmm_CondEquation() throws RecognitionException {
        SOS.adtmm.CondEquation element =  null;
        int parse_SOS_adtmm_CondEquation_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        SOS.adtmm.AbstractEquation a1_0 = null;

        SOS.adtmm.Equation a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // SOS.g:2248:1: ( ( (a0= '(' ( (a1_0= parse_SOS_adtmm_AbstractEquation ) )+ a2= ')' a3= '=>' ) )? (a4_0= parse_SOS_adtmm_Equation ) a5= ';' )
            // SOS.g:2249:2: ( (a0= '(' ( (a1_0= parse_SOS_adtmm_AbstractEquation ) )+ a2= ')' a3= '=>' ) )? (a4_0= parse_SOS_adtmm_Equation ) a5= ';'
            {
            // SOS.g:2249:2: ( (a0= '(' ( (a1_0= parse_SOS_adtmm_AbstractEquation ) )+ a2= ')' a3= '=>' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // SOS.g:2250:3: (a0= '(' ( (a1_0= parse_SOS_adtmm_AbstractEquation ) )+ a2= ')' a3= '=>' )
                    {
                    // SOS.g:2250:3: (a0= '(' ( (a1_0= parse_SOS_adtmm_AbstractEquation ) )+ a2= ')' a3= '=>' )
                    // SOS.g:2251:4: a0= '(' ( (a1_0= parse_SOS_adtmm_AbstractEquation ) )+ a2= ')' a3= '=>'
                    {
                    a0=(Token)match(input,23,FOLLOW_23_in_parse_SOS_adtmm_CondEquation2112); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCondEquation();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11_0_0_0_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 75, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      			
                    }
                    // SOS.g:2273:4: ( (a1_0= parse_SOS_adtmm_AbstractEquation ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==TEXT||LA24_0==19||LA24_0==33||(LA24_0>=38 && LA24_0<=39)||(LA24_0>=42 && LA24_0<=45)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // SOS.g:2274:5: (a1_0= parse_SOS_adtmm_AbstractEquation )
                    	    {
                    	    // SOS.g:2274:5: (a1_0= parse_SOS_adtmm_AbstractEquation )
                    	    // SOS.g:2275:6: a1_0= parse_SOS_adtmm_AbstractEquation
                    	    {
                    	    pushFollow(FOLLOW_parse_SOS_adtmm_AbstractEquation_in_parse_SOS_adtmm_CondEquation2145);
                    	    a1_0=parse_SOS_adtmm_AbstractEquation();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 76, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 76);
                      			
                    }
                    a2=(Token)match(input,24,FOLLOW_24_in_parse_SOS_adtmm_CondEquation2185); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCondEquation();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11_0_0_0_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_47, 77);
                      			
                    }
                    a3=(Token)match(input,32,FOLLOW_32_in_parse_SOS_adtmm_CondEquation2205); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCondEquation();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11_0_0_0_0_0_3, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 78, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 79, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 79, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 79, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 79, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 79, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 79, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 79, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 79, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 79, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22);
              	
            }
            // SOS.g:2361:2: (a4_0= parse_SOS_adtmm_Equation )
            // SOS.g:2362:3: a4_0= parse_SOS_adtmm_Equation
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Equation_in_parse_SOS_adtmm_CondEquation2242);
            a4_0=parse_SOS_adtmm_Equation();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_48, 80);
              	
            }
            a5=(Token)match(input,31,FOLLOW_31_in_parse_SOS_adtmm_CondEquation2260); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCondEquation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_11_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_37, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_22, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_21);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 81);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 81, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_SOS_adtmm_CondEquation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_CondEquation"


    // $ANTLR start "parse_SOS_adtmm_VariableRef"
    // SOS.g:2416:1: parse_SOS_adtmm_VariableRef returns [SOS.adtmm.VariableRef element = null] : a0= '@' (a1= TEXT ) ;
    public final SOS.adtmm.VariableRef parse_SOS_adtmm_VariableRef() throws RecognitionException {
        SOS.adtmm.VariableRef element =  null;
        int parse_SOS_adtmm_VariableRef_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // SOS.g:2419:1: (a0= '@' (a1= TEXT ) )
            // SOS.g:2420:2: a0= '@' (a1= TEXT )
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_SOS_adtmm_VariableRef2289); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createVariableRef();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_12_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_49, 82);
              	
            }
            // SOS.g:2434:2: (a1= TEXT )
            // SOS.g:2435:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_SOS_adtmm_VariableRef2307); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_59, 83);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_60, 83);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_SOS_adtmm_VariableRef_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_VariableRef"


    // $ANTLR start "parse_SOS_adtmm_CTerm"
    // SOS.g:2489:1: parse_SOS_adtmm_CTerm returns [SOS.adtmm.CTerm element = null] : (a0= TEXT ) ( (a1= '^' ( (a2= INTEGER ) | (a3_0= parse_SOS_adtmm_Term ) ) ) )? ( (a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')' ) )? ;
    public final SOS.adtmm.CTerm parse_SOS_adtmm_CTerm() throws RecognitionException {
        SOS.adtmm.CTerm element =  null;
        int parse_SOS_adtmm_CTerm_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        SOS.adtmm.Term a3_0 = null;

        SOS.adtmm.Term a5_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // SOS.g:2492:1: ( (a0= TEXT ) ( (a1= '^' ( (a2= INTEGER ) | (a3_0= parse_SOS_adtmm_Term ) ) ) )? ( (a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')' ) )? )
            // SOS.g:2493:2: (a0= TEXT ) ( (a1= '^' ( (a2= INTEGER ) | (a3_0= parse_SOS_adtmm_Term ) ) ) )? ( (a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')' ) )?
            {
            // SOS.g:2493:2: (a0= TEXT )
            // SOS.g:2494:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_SOS_adtmm_CTerm2347); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_61, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 84);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 84);
              	
            }
            // SOS.g:2545:2: ( (a1= '^' ( (a2= INTEGER ) | (a3_0= parse_SOS_adtmm_Term ) ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // SOS.g:2546:3: (a1= '^' ( (a2= INTEGER ) | (a3_0= parse_SOS_adtmm_Term ) ) )
                    {
                    // SOS.g:2546:3: (a1= '^' ( (a2= INTEGER ) | (a3_0= parse_SOS_adtmm_Term ) ) )
                    // SOS.g:2547:4: a1= '^' ( (a2= INTEGER ) | (a3_0= parse_SOS_adtmm_Term ) )
                    {
                    a1=(Token)match(input,34,FOLLOW_34_in_parse_SOS_adtmm_CTerm2377); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCTerm();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_62, 85);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 85, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 85, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 85, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 85, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 85, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 85, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 85, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 85, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 85, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_28);
                      			
                    }
                    // SOS.g:2570:4: ( (a2= INTEGER ) | (a3_0= parse_SOS_adtmm_Term ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==INTEGER) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==TEXT||LA26_0==19||LA26_0==33||(LA26_0>=38 && LA26_0<=39)||(LA26_0>=42 && LA26_0<=45)) ) {
                        alt26=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // SOS.g:2571:5: (a2= INTEGER )
                            {
                            // SOS.g:2571:5: (a2= INTEGER )
                            // SOS.g:2572:6: a2= INTEGER
                            {
                            a2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_SOS_adtmm_CTerm2410); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

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

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 86);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 86);
                              				
                            }

                            }
                            break;
                        case 2 :
                            // SOS.g:2619:10: (a3_0= parse_SOS_adtmm_Term )
                            {
                            // SOS.g:2619:10: (a3_0= parse_SOS_adtmm_Term )
                            // SOS.g:2620:6: a3_0= parse_SOS_adtmm_Term
                            {
                            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_CTerm2466);
                            a3_0=parse_SOS_adtmm_Term();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

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

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 87);
                              					addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 87);
                              				
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 88);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 88);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 89);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 89);
              	
            }
            // SOS.g:2691:2: ( (a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred29_SOS()) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // SOS.g:2692:3: (a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')' )
                    {
                    // SOS.g:2692:3: (a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')' )
                    // SOS.g:2693:4: a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')'
                    {
                    a4=(Token)match(input,23,FOLLOW_23_in_parse_SOS_adtmm_CTerm2534); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCTerm();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13_0_0_2_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 90, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 90, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 90, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 90, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 90, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 90, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 90, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 90, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 90, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      			
                    }
                    // SOS.g:2715:4: ( (a5_0= parse_SOS_adtmm_Term ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==TEXT||LA28_0==19||LA28_0==33||(LA28_0>=38 && LA28_0<=39)||(LA28_0>=42 && LA28_0<=45)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // SOS.g:2716:5: (a5_0= parse_SOS_adtmm_Term )
                    	    {
                    	    // SOS.g:2716:5: (a5_0= parse_SOS_adtmm_Term )
                    	    // SOS.g:2717:6: a5_0= parse_SOS_adtmm_Term
                    	    {
                    	    pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_CTerm2567);
                    	    a5_0=parse_SOS_adtmm_Term();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 91, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 91, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 91, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 91, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 91, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 91, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 91, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 91, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 91, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_29);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_63, 91);
                      			
                    }
                    a6=(Token)match(input,24,FOLLOW_24_in_parse_SOS_adtmm_CTerm2607); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = SOS.adtmm.AdtmmFactory.eINSTANCE.createCTerm();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_13_0_0_2_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 92);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 92);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 93);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 93);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_SOS_adtmm_CTerm_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_CTerm"


    // $ANTLR start "parse_SOS_adtmm_Equation"
    // SOS.g:2797:1: parse_SOS_adtmm_Equation returns [SOS.adtmm.Equation element = null] : (a0_0= parse_SOS_adtmm_Term ) a1= '=' (a2_0= parse_SOS_adtmm_Term ) ;
    public final SOS.adtmm.Equation parse_SOS_adtmm_Equation() throws RecognitionException {
        SOS.adtmm.Equation element =  null;
        int parse_SOS_adtmm_Equation_StartIndex = input.index();
        Token a1=null;
        SOS.adtmm.Term a0_0 = null;

        SOS.adtmm.Term a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // SOS.g:2800:1: ( (a0_0= parse_SOS_adtmm_Term ) a1= '=' (a2_0= parse_SOS_adtmm_Term ) )
            // SOS.g:2801:2: (a0_0= parse_SOS_adtmm_Term ) a1= '=' (a2_0= parse_SOS_adtmm_Term )
            {
            // SOS.g:2801:2: (a0_0= parse_SOS_adtmm_Term )
            // SOS.g:2802:3: a0_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_Equation2659);
            a0_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 94);
              	
            }
            a1=(Token)match(input,35,FOLLOW_35_in_parse_SOS_adtmm_Equation2677); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createEquation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_14_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 95, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              	
            }
            // SOS.g:2849:2: (a2_0= parse_SOS_adtmm_Term )
            // SOS.g:2850:3: a2_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_Equation2695);
            a2_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 96);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 96, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 96);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_SOS_adtmm_Equation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_Equation"


    // $ANTLR start "parse_SOS_adtmm_Inequation"
    // SOS.g:2887:1: parse_SOS_adtmm_Inequation returns [SOS.adtmm.Inequation element = null] : (a0_0= parse_SOS_adtmm_Term ) a1= '!=' (a2_0= parse_SOS_adtmm_Term ) ;
    public final SOS.adtmm.Inequation parse_SOS_adtmm_Inequation() throws RecognitionException {
        SOS.adtmm.Inequation element =  null;
        int parse_SOS_adtmm_Inequation_StartIndex = input.index();
        Token a1=null;
        SOS.adtmm.Term a0_0 = null;

        SOS.adtmm.Term a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // SOS.g:2890:1: ( (a0_0= parse_SOS_adtmm_Term ) a1= '!=' (a2_0= parse_SOS_adtmm_Term ) )
            // SOS.g:2891:2: (a0_0= parse_SOS_adtmm_Term ) a1= '!=' (a2_0= parse_SOS_adtmm_Term )
            {
            // SOS.g:2891:2: (a0_0= parse_SOS_adtmm_Term )
            // SOS.g:2892:3: a0_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_Inequation2732);
            a0_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 97);
              	
            }
            a1=(Token)match(input,36,FOLLOW_36_in_parse_SOS_adtmm_Inequation2750); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.adtmm.AdtmmFactory.eINSTANCE.createInequation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_15_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 98, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_30);
              	
            }
            // SOS.g:2939:2: (a2_0= parse_SOS_adtmm_Term )
            // SOS.g:2940:3: a2_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_Inequation2768);
            a2_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_28, 99);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 99, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 99, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 99, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 99, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 99, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 99, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 99, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 99, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 99, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_27);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_46, 99);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_SOS_adtmm_Inequation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_Inequation"


    // $ANTLR start "parse_SOS_adtmm_AtomicSort"
    // SOS.g:2977:1: parse_SOS_adtmm_AtomicSort returns [SOS.adtmm.AtomicSort element = null] : (a0= TEXT ) ;
    public final SOS.adtmm.AtomicSort parse_SOS_adtmm_AtomicSort() throws RecognitionException {
        SOS.adtmm.AtomicSort element =  null;
        int parse_SOS_adtmm_AtomicSort_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // SOS.g:2980:1: ( (a0= TEXT ) )
            // SOS.g:2981:2: (a0= TEXT )
            {
            // SOS.g:2981:2: (a0= TEXT )
            // SOS.g:2982:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_SOS_adtmm_AtomicSort2805); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 100, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 100, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 100, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_42, 100);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_45, 100);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_64, 100);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_SOS_adtmm_AtomicSort_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_AtomicSort"


    // $ANTLR start "parse_SOS_adtmm_SortDeclaration"
    // SOS.g:3028:1: parse_SOS_adtmm_SortDeclaration returns [SOS.adtmm.SortDeclaration element = null] : (a0= TEXT ) ;
    public final SOS.adtmm.SortDeclaration parse_SOS_adtmm_SortDeclaration() throws RecognitionException {
        SOS.adtmm.SortDeclaration element =  null;
        int parse_SOS_adtmm_SortDeclaration_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // SOS.g:3031:1: ( (a0= TEXT ) )
            // SOS.g:3032:2: (a0= TEXT )
            {
            // SOS.g:3032:2: (a0= TEXT )
            // SOS.g:3033:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_SOS_adtmm_SortDeclaration2845); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_35, 101, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_18);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_31, 101);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_32, 101);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_33, 101);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_34, 101);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_2, 101, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_3, 101, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_0);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_1, 101, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_1);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_SOS_adtmm_SortDeclaration_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_SortDeclaration"


    // $ANTLR start "parse_SOS_set_Set"
    // SOS.g:3077:1: parse_SOS_set_Set returns [SOS.set.Set element = null] : a0= 'Set' a1= '(' (a2_0= parse_SOS_adtmm_Sort ) a3= ')' ;
    public final SOS.set.Set parse_SOS_set_Set() throws RecognitionException {
        SOS.set.Set element =  null;
        int parse_SOS_set_Set_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        SOS.adtmm.Sort a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // SOS.g:3080:1: (a0= 'Set' a1= '(' (a2_0= parse_SOS_adtmm_Sort ) a3= ')' )
            // SOS.g:3081:2: a0= 'Set' a1= '(' (a2_0= parse_SOS_adtmm_Sort ) a3= ')'
            {
            a0=(Token)match(input,37,FOLLOW_37_in_parse_SOS_set_Set2881); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createSet();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_18_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_65, 102);
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_SOS_set_Set2895); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createSet();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_18_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 103, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 103, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 103, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_31);
              	
            }
            // SOS.g:3111:2: (a2_0= parse_SOS_adtmm_Sort )
            // SOS.g:3112:3: a2_0= parse_SOS_adtmm_Sort
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Sort_in_parse_SOS_set_Set2913);
            a2_0=parse_SOS_adtmm_Sort();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_64, 104);
              	
            }
            a3=(Token)match(input,24,FOLLOW_24_in_parse_SOS_set_Set2931); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createSet();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_18_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 105, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 105, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 105, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_42, 105);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_45, 105);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_64, 105);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_SOS_set_Set_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_Set"


    // $ANTLR start "parse_SOS_set_ModelSet"
    // SOS.g:3158:1: parse_SOS_set_ModelSet returns [SOS.set.ModelSet element = null] : a0= 'Model' ;
    public final SOS.set.ModelSet parse_SOS_set_ModelSet() throws RecognitionException {
        SOS.set.ModelSet element =  null;
        int parse_SOS_set_ModelSet_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // SOS.g:3161:1: (a0= 'Model' )
            // SOS.g:3162:2: a0= 'Model'
            {
            a0=(Token)match(input,38,FOLLOW_38_in_parse_SOS_set_ModelSet2960); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createModelSet();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_19_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 106);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 106);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_SOS_set_ModelSet_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_ModelSet"


    // $ANTLR start "parse_SOS_set_SetConstructor"
    // SOS.g:3189:1: parse_SOS_set_SetConstructor returns [SOS.set.SetConstructor element = null] : a0= '{' ( ( (a1_0= parse_SOS_adtmm_Term ) ( (a2= '|' (a3_0= parse_SOS_AlgebraicConditionList ) ) )? ) )? a4= '}' ;
    public final SOS.set.SetConstructor parse_SOS_set_SetConstructor() throws RecognitionException {
        SOS.set.SetConstructor element =  null;
        int parse_SOS_set_SetConstructor_StartIndex = input.index();
        Token a0=null;
        Token a2=null;
        Token a4=null;
        SOS.adtmm.Term a1_0 = null;

        SOS.AlgebraicConditionList a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // SOS.g:3192:1: (a0= '{' ( ( (a1_0= parse_SOS_adtmm_Term ) ( (a2= '|' (a3_0= parse_SOS_AlgebraicConditionList ) ) )? ) )? a4= '}' )
            // SOS.g:3193:2: a0= '{' ( ( (a1_0= parse_SOS_adtmm_Term ) ( (a2= '|' (a3_0= parse_SOS_AlgebraicConditionList ) ) )? ) )? a4= '}'
            {
            a0=(Token)match(input,39,FOLLOW_39_in_parse_SOS_set_SetConstructor2989); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createSetConstructor();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_20_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 107, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 107, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 107, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 107, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 107, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 107, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 107, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 107, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 107, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_32);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 107);
              	
            }
            // SOS.g:3216:2: ( ( (a1_0= parse_SOS_adtmm_Term ) ( (a2= '|' (a3_0= parse_SOS_AlgebraicConditionList ) ) )? ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==TEXT||LA31_0==19||LA31_0==33||(LA31_0>=38 && LA31_0<=39)||(LA31_0>=42 && LA31_0<=45)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // SOS.g:3217:3: ( (a1_0= parse_SOS_adtmm_Term ) ( (a2= '|' (a3_0= parse_SOS_AlgebraicConditionList ) ) )? )
                    {
                    // SOS.g:3217:3: ( (a1_0= parse_SOS_adtmm_Term ) ( (a2= '|' (a3_0= parse_SOS_AlgebraicConditionList ) ) )? )
                    // SOS.g:3218:4: (a1_0= parse_SOS_adtmm_Term ) ( (a2= '|' (a3_0= parse_SOS_AlgebraicConditionList ) ) )?
                    {
                    // SOS.g:3218:4: (a1_0= parse_SOS_adtmm_Term )
                    // SOS.g:3219:5: a1_0= parse_SOS_adtmm_Term
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_SetConstructor3018);
                    a1_0=parse_SOS_adtmm_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                      						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_20_0_0_1_0_0_0, a1_0, true);
                      						copyLocalizationInfos(a1_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 108);
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 108);
                      			
                    }
                    // SOS.g:3245:4: ( (a2= '|' (a3_0= parse_SOS_AlgebraicConditionList ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==40) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // SOS.g:3246:5: (a2= '|' (a3_0= parse_SOS_AlgebraicConditionList ) )
                            {
                            // SOS.g:3246:5: (a2= '|' (a3_0= parse_SOS_AlgebraicConditionList ) )
                            // SOS.g:3247:6: a2= '|' (a3_0= parse_SOS_AlgebraicConditionList )
                            {
                            a2=(Token)match(input,40,FOLLOW_40_in_parse_SOS_set_SetConstructor3059); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (element == null) {
                              							element = SOS.set.SetFactory.eINSTANCE.createSetConstructor();
                              							incompleteObjects.push(element);
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_20_0_0_1_0_0_1_0_0_0, null, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_13, 109, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 109, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 109, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 109, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 109, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 109, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 109, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 109, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 109, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 109, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_11, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_12, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_9, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_33);
                              					
                            }
                            // SOS.g:3270:6: (a3_0= parse_SOS_AlgebraicConditionList )
                            // SOS.g:3271:7: a3_0= parse_SOS_AlgebraicConditionList
                            {
                            pushFollow(FOLLOW_parse_SOS_AlgebraicConditionList_in_parse_SOS_set_SetConstructor3093);
                            a3_0=parse_SOS_AlgebraicConditionList();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

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
                              								retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_20_0_0_1_0_0_1_0_0_1, a3_0, true);
                              								copyLocalizationInfos(a3_0, element);
                              							}
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 110);
                              					
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 111);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 112);
              	
            }
            a4=(Token)match(input,41,FOLLOW_41_in_parse_SOS_set_SetConstructor3167); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createSetConstructor();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_20_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 113);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 113);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_SOS_set_SetConstructor_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_SetConstructor"


    // $ANTLR start "parse_SOS_set_ForAllIn"
    // SOS.g:3337:1: parse_SOS_set_ForAllIn returns [SOS.set.ForAllIn element = null] : a0= 'in' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')' ;
    public final SOS.set.ForAllIn parse_SOS_set_ForAllIn() throws RecognitionException {
        SOS.set.ForAllIn element =  null;
        int parse_SOS_set_ForAllIn_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        SOS.adtmm.Term a2_0 = null;

        SOS.adtmm.Term a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // SOS.g:3340:1: (a0= 'in' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')' )
            // SOS.g:3341:2: a0= 'in' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')'
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_SOS_set_ForAllIn3196); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createForAllIn();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_66, 114);
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_SOS_set_ForAllIn3210); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createForAllIn();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 115, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 115, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 115, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 115, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 115, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 115, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 115, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 115, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 115, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              	
            }
            // SOS.g:3377:2: (a2_0= parse_SOS_adtmm_Term )
            // SOS.g:3378:3: a2_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_ForAllIn3228);
            a2_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 116);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_SOS_set_ForAllIn3246); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createForAllIn();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 117, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 117, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 117, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 117, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 117, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 117, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 117, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 117, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 117, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              	
            }
            // SOS.g:3425:2: (a4_0= parse_SOS_adtmm_Term )
            // SOS.g:3426:3: a4_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_ForAllIn3264);
            a4_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_4, a4_0, true);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_67, 118);
              	
            }
            a5=(Token)match(input,24,FOLLOW_24_in_parse_SOS_set_ForAllIn3282); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createForAllIn();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_21_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 119);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 119);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parse_SOS_set_ForAllIn_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_ForAllIn"


    // $ANTLR start "parse_SOS_set_ExistsIn"
    // SOS.g:3478:1: parse_SOS_set_ExistsIn returns [SOS.set.ExistsIn element = null] : a0= 'existsIn' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')' ;
    public final SOS.set.ExistsIn parse_SOS_set_ExistsIn() throws RecognitionException {
        SOS.set.ExistsIn element =  null;
        int parse_SOS_set_ExistsIn_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        SOS.adtmm.Term a2_0 = null;

        SOS.adtmm.Term a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // SOS.g:3481:1: (a0= 'existsIn' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')' )
            // SOS.g:3482:2: a0= 'existsIn' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')'
            {
            a0=(Token)match(input,42,FOLLOW_42_in_parse_SOS_set_ExistsIn3311); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createExistsIn();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_68, 120);
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_SOS_set_ExistsIn3325); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createExistsIn();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 121, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 121, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 121, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 121, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 121, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 121, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 121, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 121, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 121, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_34);
              	
            }
            // SOS.g:3518:2: (a2_0= parse_SOS_adtmm_Term )
            // SOS.g:3519:3: a2_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_ExistsIn3343);
            a2_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 122);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_SOS_set_ExistsIn3361); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createExistsIn();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 123, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 123, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 123, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 123, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 123, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 123, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 123, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 123, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 123, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_35);
              	
            }
            // SOS.g:3566:2: (a4_0= parse_SOS_adtmm_Term )
            // SOS.g:3567:3: a4_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_ExistsIn3379);
            a4_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_4, a4_0, true);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_69, 124);
              	
            }
            a5=(Token)match(input,24,FOLLOW_24_in_parse_SOS_set_ExistsIn3397); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createExistsIn();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_22_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 125);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 125);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, parse_SOS_set_ExistsIn_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_ExistsIn"


    // $ANTLR start "parse_SOS_set_Union"
    // SOS.g:3619:1: parse_SOS_set_Union returns [SOS.set.Union element = null] : a0= 'Union' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')' ;
    public final SOS.set.Union parse_SOS_set_Union() throws RecognitionException {
        SOS.set.Union element =  null;
        int parse_SOS_set_Union_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        SOS.adtmm.Term a2_0 = null;

        SOS.adtmm.Term a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // SOS.g:3622:1: (a0= 'Union' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')' )
            // SOS.g:3623:2: a0= 'Union' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')'
            {
            a0=(Token)match(input,43,FOLLOW_43_in_parse_SOS_set_Union3426); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createUnion();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_70, 126);
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_SOS_set_Union3440); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createUnion();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 127, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 127, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 127, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 127, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 127, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 127, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 127, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 127, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 127, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              	
            }
            // SOS.g:3659:2: (a2_0= parse_SOS_adtmm_Term )
            // SOS.g:3660:3: a2_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Union3458);
            a2_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 128);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_SOS_set_Union3476); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createUnion();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 129, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 129, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 129, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 129, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 129, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 129, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 129, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 129, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 129, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              	
            }
            // SOS.g:3707:2: (a4_0= parse_SOS_adtmm_Term )
            // SOS.g:3708:3: a4_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Union3494);
            a4_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_4, a4_0, true);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_71, 130);
              	
            }
            a5=(Token)match(input,24,FOLLOW_24_in_parse_SOS_set_Union3512); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createUnion();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_23_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 131);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 131);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, parse_SOS_set_Union_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_Union"


    // $ANTLR start "parse_SOS_set_Excluding"
    // SOS.g:3760:1: parse_SOS_set_Excluding returns [SOS.set.Excluding element = null] : a0= 'Excluding' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')' ;
    public final SOS.set.Excluding parse_SOS_set_Excluding() throws RecognitionException {
        SOS.set.Excluding element =  null;
        int parse_SOS_set_Excluding_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        SOS.adtmm.Term a2_0 = null;

        SOS.adtmm.Term a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // SOS.g:3763:1: (a0= 'Excluding' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')' )
            // SOS.g:3764:2: a0= 'Excluding' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')'
            {
            a0=(Token)match(input,44,FOLLOW_44_in_parse_SOS_set_Excluding3541); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createExcluding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_72, 132);
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_SOS_set_Excluding3555); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createExcluding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 133, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 133, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 133, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 133, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 133, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 133, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 133, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 133, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 133, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              	
            }
            // SOS.g:3800:2: (a2_0= parse_SOS_adtmm_Term )
            // SOS.g:3801:3: a2_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Excluding3573);
            a2_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 134);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_SOS_set_Excluding3591); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createExcluding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 135, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 135, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 135, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 135, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 135, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 135, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 135, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 135, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 135, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              	
            }
            // SOS.g:3848:2: (a4_0= parse_SOS_adtmm_Term )
            // SOS.g:3849:3: a4_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Excluding3609);
            a4_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_4, a4_0, true);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_73, 136);
              	
            }
            a5=(Token)match(input,24,FOLLOW_24_in_parse_SOS_set_Excluding3627); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createExcluding();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_24_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 137);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 137);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, parse_SOS_set_Excluding_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_Excluding"


    // $ANTLR start "parse_SOS_set_Intersection"
    // SOS.g:3901:1: parse_SOS_set_Intersection returns [SOS.set.Intersection element = null] : a0= 'Intersect' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')' ;
    public final SOS.set.Intersection parse_SOS_set_Intersection() throws RecognitionException {
        SOS.set.Intersection element =  null;
        int parse_SOS_set_Intersection_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        SOS.adtmm.Term a2_0 = null;

        SOS.adtmm.Term a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // SOS.g:3904:1: (a0= 'Intersect' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')' )
            // SOS.g:3905:2: a0= 'Intersect' a1= '(' (a2_0= parse_SOS_adtmm_Term ) a3= ',' (a4_0= parse_SOS_adtmm_Term ) a5= ')'
            {
            a0=(Token)match(input,45,FOLLOW_45_in_parse_SOS_set_Intersection3656); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createIntersection();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_74, 138);
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_SOS_set_Intersection3670); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createIntersection();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 139, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 139, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 139, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 139, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 139, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 139, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 139, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 139, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 139, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_36);
              	
            }
            // SOS.g:3941:2: (a2_0= parse_SOS_adtmm_Term )
            // SOS.g:3942:3: a2_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Intersection3688);
            a2_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_2, a2_0, true);
              				copyLocalizationInfos(a2_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 140);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_SOS_set_Intersection3706); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createIntersection();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 141, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_5, 141, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_6, 141, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_7, 141, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_8, 141, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_9, 141, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_10, 141, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_11, 141, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_12, 141, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_37);
              	
            }
            // SOS.g:3989:2: (a4_0= parse_SOS_adtmm_Term )
            // SOS.g:3990:3: a4_0= parse_SOS_adtmm_Term
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Intersection3724);
            a4_0=parse_SOS_adtmm_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_4, a4_0, true);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_75, 142);
              	
            }
            a5=(Token)match(input,24,FOLLOW_24_in_parse_SOS_set_Intersection3742); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createIntersection();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_25_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 143);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 143);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, parse_SOS_set_Intersection_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_Intersection"


    // $ANTLR start "parse_SOS_set_ModelRelation"
    // SOS.g:4042:1: parse_SOS_set_ModelRelation returns [SOS.set.ModelRelation element = null] : (a0_0= parse_SOS_adtmm_VariableRef ) a1= '->' (a2= TEXT ) a3= '->' (a4_0= parse_SOS_adtmm_VariableRef ) ;
    public final SOS.set.ModelRelation parse_SOS_set_ModelRelation() throws RecognitionException {
        SOS.set.ModelRelation element =  null;
        int parse_SOS_set_ModelRelation_StartIndex = input.index();
        Token a1=null;
        Token a2=null;
        Token a3=null;
        SOS.adtmm.VariableRef a0_0 = null;

        SOS.adtmm.VariableRef a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // SOS.g:4045:1: ( (a0_0= parse_SOS_adtmm_VariableRef ) a1= '->' (a2= TEXT ) a3= '->' (a4_0= parse_SOS_adtmm_VariableRef ) )
            // SOS.g:4046:2: (a0_0= parse_SOS_adtmm_VariableRef ) a1= '->' (a2= TEXT ) a3= '->' (a4_0= parse_SOS_adtmm_VariableRef )
            {
            // SOS.g:4046:2: (a0_0= parse_SOS_adtmm_VariableRef )
            // SOS.g:4047:3: a0_0= parse_SOS_adtmm_VariableRef
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_VariableRef_in_parse_SOS_set_ModelRelation3775);
            a0_0=parse_SOS_adtmm_VariableRef();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_0, a0_0, true);
              				copyLocalizationInfos(a0_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_59, 144);
              	
            }
            a1=(Token)match(input,30,FOLLOW_30_in_parse_SOS_set_ModelRelation3793); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createModelRelation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_76, 145);
              	
            }
            // SOS.g:4086:2: (a2= TEXT )
            // SOS.g:4087:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_SOS_set_ModelRelation3811); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_77, 146);
              	
            }
            a3=(Token)match(input,30,FOLLOW_30_in_parse_SOS_set_ModelRelation3832); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createModelRelation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_4, 147, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_38);
              	
            }
            // SOS.g:4136:2: (a4_0= parse_SOS_adtmm_VariableRef )
            // SOS.g:4137:3: a4_0= parse_SOS_adtmm_VariableRef
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_VariableRef_in_parse_SOS_set_ModelRelation3850);
            a4_0=parse_SOS_adtmm_VariableRef();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_26_0_0_4, a4_0, true);
              				copyLocalizationInfos(a4_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 148);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 148);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, parse_SOS_set_ModelRelation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_ModelRelation"


    // $ANTLR start "parse_SOS_set_ModelClassAttribute"
    // SOS.g:4175:1: parse_SOS_set_ModelClassAttribute returns [SOS.set.ModelClassAttribute element = null] : (a0_0= parse_SOS_adtmm_VariableRef ) a1= '.' (a2= TEXT ) ;
    public final SOS.set.ModelClassAttribute parse_SOS_set_ModelClassAttribute() throws RecognitionException {
        SOS.set.ModelClassAttribute element =  null;
        int parse_SOS_set_ModelClassAttribute_StartIndex = input.index();
        Token a1=null;
        Token a2=null;
        SOS.adtmm.VariableRef a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // SOS.g:4178:1: ( (a0_0= parse_SOS_adtmm_VariableRef ) a1= '.' (a2= TEXT ) )
            // SOS.g:4179:2: (a0_0= parse_SOS_adtmm_VariableRef ) a1= '.' (a2= TEXT )
            {
            // SOS.g:4179:2: (a0_0= parse_SOS_adtmm_VariableRef )
            // SOS.g:4180:3: a0_0= parse_SOS_adtmm_VariableRef
            {
            pushFollow(FOLLOW_parse_SOS_adtmm_VariableRef_in_parse_SOS_set_ModelClassAttribute3887);
            a0_0=parse_SOS_adtmm_VariableRef();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_27_0_0_0, a0_0, true);
              				copyLocalizationInfos(a0_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_60, 149);
              	
            }
            a1=(Token)match(input,46,FOLLOW_46_in_parse_SOS_set_ModelClassAttribute3905); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createModelClassAttribute();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_27_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_78, 150);
              	
            }
            // SOS.g:4219:2: (a2= TEXT )
            // SOS.g:4220:3: a2= TEXT
            {
            a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_SOS_set_ModelClassAttribute3923); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_27_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_20, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_26, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_50, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_51, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_52, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_53, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_19, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_54, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_55, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_56, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_57, 151);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_58, 151);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, parse_SOS_set_ModelClassAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_ModelClassAttribute"


    // $ANTLR start "parse_SOS_set_ModelSort"
    // SOS.g:4268:1: parse_SOS_set_ModelSort returns [SOS.set.ModelSort element = null] : a0= 'class' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ')' ;
    public final SOS.set.ModelSort parse_SOS_set_ModelSort() throws RecognitionException {
        SOS.set.ModelSort element =  null;
        int parse_SOS_set_ModelSort_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // SOS.g:4271:1: (a0= 'class' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ')' )
            // SOS.g:4272:2: a0= 'class' a1= '(' (a2= QUOTED_34_34 ) a3= ',' (a4= QUOTED_34_34 ) a5= ')'
            {
            a0=(Token)match(input,47,FOLLOW_47_in_parse_SOS_set_ModelSort3959); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createModelSort();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_28_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_79, 152);
              	
            }
            a1=(Token)match(input,23,FOLLOW_23_in_parse_SOS_set_ModelSort3973); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createModelSort();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_28_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_80, 153);
              	
            }
            // SOS.g:4300:2: (a2= QUOTED_34_34 )
            // SOS.g:4301:3: a2= QUOTED_34_34
            {
            a2=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_SOS_set_ModelSort3991); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_28_0_0_2, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_81, 154);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_SOS_set_ModelSort4012); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createModelSort();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_28_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_82, 155);
              	
            }
            // SOS.g:4350:2: (a4= QUOTED_34_34 )
            // SOS.g:4351:3: a4= QUOTED_34_34
            {
            a4=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_SOS_set_ModelSort4030); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
              				retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_28_0_0_4, resolved, true);
              				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_83, 156);
              	
            }
            a5=(Token)match(input,24,FOLLOW_24_in_parse_SOS_set_ModelSort4051); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = SOS.set.SetFactory.eINSTANCE.createModelSort();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, SOS.resource.SOS.grammar.SOSGrammarInformationProvider.SOS_28_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_39, 157, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_40, 157, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_41, 157, SOS.resource.SOS.grammar.SOSFollowSetProvider.FEATURE_24);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_42, 157);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_45, 157);
              		addExpectedElement(SOS.resource.SOS.grammar.SOSFollowSetProvider.TERMINAL_64, 157);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, parse_SOS_set_ModelSort_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_set_ModelSort"


    // $ANTLR start "parse_SOS_Condition"
    // SOS.g:4407:1: parse_SOS_Condition returns [SOS.Condition element = null] : (c0= parse_SOS_Transition | c1= parse_SOS_TypeJudment | c2= parse_SOS_AlgebraicCondition );
    public final SOS.Condition parse_SOS_Condition() throws RecognitionException {
        SOS.Condition element =  null;
        int parse_SOS_Condition_StartIndex = input.index();
        SOS.Transition c0 = null;

        SOS.TypeJudment c1 = null;

        SOS.AlgebraicCondition c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // SOS.g:4408:1: (c0= parse_SOS_Transition | c1= parse_SOS_TypeJudment | c2= parse_SOS_AlgebraicCondition )
            int alt32=3;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // SOS.g:4409:2: c0= parse_SOS_Transition
                    {
                    pushFollow(FOLLOW_parse_SOS_Transition_in_parse_SOS_Condition4076);
                    c0=parse_SOS_Transition();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // SOS.g:4410:4: c1= parse_SOS_TypeJudment
                    {
                    pushFollow(FOLLOW_parse_SOS_TypeJudment_in_parse_SOS_Condition4086);
                    c1=parse_SOS_TypeJudment();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // SOS.g:4411:4: c2= parse_SOS_AlgebraicCondition
                    {
                    pushFollow(FOLLOW_parse_SOS_AlgebraicCondition_in_parse_SOS_Condition4096);
                    c2=parse_SOS_AlgebraicCondition();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 31, parse_SOS_Condition_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_Condition"


    // $ANTLR start "parse_SOS_adtmm_Term"
    // SOS.g:4415:1: parse_SOS_adtmm_Term returns [SOS.adtmm.Term element = null] : (c0= parse_SOS_adtmm_VariableRef | c1= parse_SOS_adtmm_CTerm | c2= parse_SOS_set_ModelSet | c3= parse_SOS_set_SetConstructor | c4= parse_SOS_set_ForAllIn | c5= parse_SOS_set_ExistsIn | c6= parse_SOS_set_Union | c7= parse_SOS_set_Excluding | c8= parse_SOS_set_Intersection | c9= parse_SOS_set_ModelRelation | c10= parse_SOS_set_ModelClassAttribute );
    public final SOS.adtmm.Term parse_SOS_adtmm_Term() throws RecognitionException {
        SOS.adtmm.Term element =  null;
        int parse_SOS_adtmm_Term_StartIndex = input.index();
        SOS.adtmm.VariableRef c0 = null;

        SOS.adtmm.CTerm c1 = null;

        SOS.set.ModelSet c2 = null;

        SOS.set.SetConstructor c3 = null;

        SOS.set.ForAllIn c4 = null;

        SOS.set.ExistsIn c5 = null;

        SOS.set.Union c6 = null;

        SOS.set.Excluding c7 = null;

        SOS.set.Intersection c8 = null;

        SOS.set.ModelRelation c9 = null;

        SOS.set.ModelClassAttribute c10 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }
            // SOS.g:4416:1: (c0= parse_SOS_adtmm_VariableRef | c1= parse_SOS_adtmm_CTerm | c2= parse_SOS_set_ModelSet | c3= parse_SOS_set_SetConstructor | c4= parse_SOS_set_ForAllIn | c5= parse_SOS_set_ExistsIn | c6= parse_SOS_set_Union | c7= parse_SOS_set_Excluding | c8= parse_SOS_set_Intersection | c9= parse_SOS_set_ModelRelation | c10= parse_SOS_set_ModelClassAttribute )
            int alt33=11;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // SOS.g:4417:2: c0= parse_SOS_adtmm_VariableRef
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_VariableRef_in_parse_SOS_adtmm_Term4117);
                    c0=parse_SOS_adtmm_VariableRef();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // SOS.g:4418:4: c1= parse_SOS_adtmm_CTerm
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_CTerm_in_parse_SOS_adtmm_Term4127);
                    c1=parse_SOS_adtmm_CTerm();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // SOS.g:4419:4: c2= parse_SOS_set_ModelSet
                    {
                    pushFollow(FOLLOW_parse_SOS_set_ModelSet_in_parse_SOS_adtmm_Term4137);
                    c2=parse_SOS_set_ModelSet();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // SOS.g:4420:4: c3= parse_SOS_set_SetConstructor
                    {
                    pushFollow(FOLLOW_parse_SOS_set_SetConstructor_in_parse_SOS_adtmm_Term4147);
                    c3=parse_SOS_set_SetConstructor();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // SOS.g:4421:4: c4= parse_SOS_set_ForAllIn
                    {
                    pushFollow(FOLLOW_parse_SOS_set_ForAllIn_in_parse_SOS_adtmm_Term4157);
                    c4=parse_SOS_set_ForAllIn();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // SOS.g:4422:4: c5= parse_SOS_set_ExistsIn
                    {
                    pushFollow(FOLLOW_parse_SOS_set_ExistsIn_in_parse_SOS_adtmm_Term4167);
                    c5=parse_SOS_set_ExistsIn();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // SOS.g:4423:4: c6= parse_SOS_set_Union
                    {
                    pushFollow(FOLLOW_parse_SOS_set_Union_in_parse_SOS_adtmm_Term4177);
                    c6=parse_SOS_set_Union();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 8 :
                    // SOS.g:4424:4: c7= parse_SOS_set_Excluding
                    {
                    pushFollow(FOLLOW_parse_SOS_set_Excluding_in_parse_SOS_adtmm_Term4187);
                    c7=parse_SOS_set_Excluding();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 9 :
                    // SOS.g:4425:4: c8= parse_SOS_set_Intersection
                    {
                    pushFollow(FOLLOW_parse_SOS_set_Intersection_in_parse_SOS_adtmm_Term4197);
                    c8=parse_SOS_set_Intersection();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c8; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 10 :
                    // SOS.g:4426:4: c9= parse_SOS_set_ModelRelation
                    {
                    pushFollow(FOLLOW_parse_SOS_set_ModelRelation_in_parse_SOS_adtmm_Term4207);
                    c9=parse_SOS_set_ModelRelation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c9; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 11 :
                    // SOS.g:4427:4: c10= parse_SOS_set_ModelClassAttribute
                    {
                    pushFollow(FOLLOW_parse_SOS_set_ModelClassAttribute_in_parse_SOS_adtmm_Term4217);
                    c10=parse_SOS_set_ModelClassAttribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c10; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 32, parse_SOS_adtmm_Term_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_Term"


    // $ANTLR start "parse_SOS_adtmm_AbstractEquation"
    // SOS.g:4431:1: parse_SOS_adtmm_AbstractEquation returns [SOS.adtmm.AbstractEquation element = null] : (c0= parse_SOS_adtmm_Equation | c1= parse_SOS_adtmm_Inequation );
    public final SOS.adtmm.AbstractEquation parse_SOS_adtmm_AbstractEquation() throws RecognitionException {
        SOS.adtmm.AbstractEquation element =  null;
        int parse_SOS_adtmm_AbstractEquation_StartIndex = input.index();
        SOS.adtmm.Equation c0 = null;

        SOS.adtmm.Inequation c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }
            // SOS.g:4432:1: (c0= parse_SOS_adtmm_Equation | c1= parse_SOS_adtmm_Inequation )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // SOS.g:4433:2: c0= parse_SOS_adtmm_Equation
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_Equation_in_parse_SOS_adtmm_AbstractEquation4238);
                    c0=parse_SOS_adtmm_Equation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // SOS.g:4434:4: c1= parse_SOS_adtmm_Inequation
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_Inequation_in_parse_SOS_adtmm_AbstractEquation4248);
                    c1=parse_SOS_adtmm_Inequation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 33, parse_SOS_adtmm_AbstractEquation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_AbstractEquation"


    // $ANTLR start "parse_SOS_adtmm_Sort"
    // SOS.g:4438:1: parse_SOS_adtmm_Sort returns [SOS.adtmm.Sort element = null] : (c0= parse_SOS_adtmm_AtomicSort | c1= parse_SOS_set_Set | c2= parse_SOS_set_ModelSort );
    public final SOS.adtmm.Sort parse_SOS_adtmm_Sort() throws RecognitionException {
        SOS.adtmm.Sort element =  null;
        int parse_SOS_adtmm_Sort_StartIndex = input.index();
        SOS.adtmm.AtomicSort c0 = null;

        SOS.set.Set c1 = null;

        SOS.set.ModelSort c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }
            // SOS.g:4439:1: (c0= parse_SOS_adtmm_AtomicSort | c1= parse_SOS_set_Set | c2= parse_SOS_set_ModelSort )
            int alt35=3;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt35=1;
                }
                break;
            case 37:
                {
                alt35=2;
                }
                break;
            case 47:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // SOS.g:4440:2: c0= parse_SOS_adtmm_AtomicSort
                    {
                    pushFollow(FOLLOW_parse_SOS_adtmm_AtomicSort_in_parse_SOS_adtmm_Sort4269);
                    c0=parse_SOS_adtmm_AtomicSort();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // SOS.g:4441:4: c1= parse_SOS_set_Set
                    {
                    pushFollow(FOLLOW_parse_SOS_set_Set_in_parse_SOS_adtmm_Sort4279);
                    c1=parse_SOS_set_Set();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // SOS.g:4442:4: c2= parse_SOS_set_ModelSort
                    {
                    pushFollow(FOLLOW_parse_SOS_set_ModelSort_in_parse_SOS_adtmm_Sort4289);
                    c2=parse_SOS_set_ModelSort();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 34, parse_SOS_adtmm_Sort_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_SOS_adtmm_Sort"

    // $ANTLR start synpred9_SOS
    public final void synpred9_SOS_fragment() throws RecognitionException {   
        Token a1=null;
        SOS.adtmm.Term a0_0 = null;


        // SOS.g:1123:3: ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )
        // SOS.g:1123:3: ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' )
        {
        // SOS.g:1123:3: ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' )
        // SOS.g:1124:4: (a0_0= parse_SOS_adtmm_Term ) a1= ':'
        {
        // SOS.g:1124:4: (a0_0= parse_SOS_adtmm_Term )
        // SOS.g:1125:5: a0_0= parse_SOS_adtmm_Term
        {
        pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_synpred9_SOS853);
        a0_0=parse_SOS_adtmm_Term();

        state._fsp--;
        if (state.failed) return ;

        }

        a1=(Token)match(input,17,FOLLOW_17_in_synpred9_SOS881); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_SOS

    // $ANTLR start synpred10_SOS
    public final void synpred10_SOS_fragment() throws RecognitionException {   
        Token a1=null;
        SOS.adtmm.Term a0_0 = null;


        // SOS.g:1359:3: ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )
        // SOS.g:1359:3: ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' )
        {
        // SOS.g:1359:3: ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' )
        // SOS.g:1360:4: (a0_0= parse_SOS_adtmm_Term ) a1= ':'
        {
        // SOS.g:1360:4: (a0_0= parse_SOS_adtmm_Term )
        // SOS.g:1361:5: a0_0= parse_SOS_adtmm_Term
        {
        pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_synpred10_SOS1080);
        a0_0=parse_SOS_adtmm_Term();

        state._fsp--;
        if (state.failed) return ;

        }

        a1=(Token)match(input,17,FOLLOW_17_in_synpred10_SOS1108); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_SOS

    // $ANTLR start synpred29_SOS
    public final void synpred29_SOS_fragment() throws RecognitionException {   
        Token a4=null;
        Token a6=null;
        SOS.adtmm.Term a5_0 = null;


        // SOS.g:2692:3: ( (a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')' ) )
        // SOS.g:2692:3: (a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')' )
        {
        // SOS.g:2692:3: (a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')' )
        // SOS.g:2693:4: a4= '(' ( (a5_0= parse_SOS_adtmm_Term ) )+ a6= ')'
        {
        a4=(Token)match(input,23,FOLLOW_23_in_synpred29_SOS2534); if (state.failed) return ;
        // SOS.g:2715:4: ( (a5_0= parse_SOS_adtmm_Term ) )+
        int cnt45=0;
        loop45:
        do {
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==TEXT||LA45_0==19||LA45_0==33||(LA45_0>=38 && LA45_0<=39)||(LA45_0>=42 && LA45_0<=45)) ) {
                alt45=1;
            }


            switch (alt45) {
        	case 1 :
        	    // SOS.g:2716:5: (a5_0= parse_SOS_adtmm_Term )
        	    {
        	    // SOS.g:2716:5: (a5_0= parse_SOS_adtmm_Term )
        	    // SOS.g:2717:6: a5_0= parse_SOS_adtmm_Term
        	    {
        	    pushFollow(FOLLOW_parse_SOS_adtmm_Term_in_synpred29_SOS2567);
        	    a5_0=parse_SOS_adtmm_Term();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt45 >= 1 ) break loop45;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(45, input);
                    throw eee;
            }
            cnt45++;
        } while (true);

        a6=(Token)match(input,24,FOLLOW_24_in_synpred29_SOS2607); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_SOS

    // $ANTLR start synpred32_SOS
    public final void synpred32_SOS_fragment() throws RecognitionException {   
        SOS.Transition c0 = null;


        // SOS.g:4409:2: (c0= parse_SOS_Transition )
        // SOS.g:4409:2: c0= parse_SOS_Transition
        {
        pushFollow(FOLLOW_parse_SOS_Transition_in_synpred32_SOS4076);
        c0=parse_SOS_Transition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_SOS

    // $ANTLR start synpred33_SOS
    public final void synpred33_SOS_fragment() throws RecognitionException {   
        SOS.TypeJudment c1 = null;


        // SOS.g:4410:4: (c1= parse_SOS_TypeJudment )
        // SOS.g:4410:4: c1= parse_SOS_TypeJudment
        {
        pushFollow(FOLLOW_parse_SOS_TypeJudment_in_synpred33_SOS4086);
        c1=parse_SOS_TypeJudment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_SOS

    // $ANTLR start synpred44_SOS
    public final void synpred44_SOS_fragment() throws RecognitionException {   
        SOS.adtmm.Equation c0 = null;


        // SOS.g:4433:2: (c0= parse_SOS_adtmm_Equation )
        // SOS.g:4433:2: c0= parse_SOS_adtmm_Equation
        {
        pushFollow(FOLLOW_parse_SOS_adtmm_Equation_in_synpred44_SOS4238);
        c0=parse_SOS_adtmm_Equation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_SOS

    // Delegated rules

    public final boolean synpred10_SOS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_SOS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_SOS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_SOS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_SOS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_SOS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_SOS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_SOS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_SOS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_SOS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_SOS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_SOS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\4\11\0\2\uffff";
    static final String DFA9_maxS =
        "\1\55\11\0\2\uffff";
    static final String DFA9_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\16\uffff\1\5\15\uffff\1\1\4\uffff\1\3\1\4\2\uffff\1\6"+
            "\1\7\1\10\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1122:2: ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\14\uffff";
    static final String DFA10_eofS =
        "\14\uffff";
    static final String DFA10_minS =
        "\1\4\11\0\2\uffff";
    static final String DFA10_maxS =
        "\1\55\11\0\2\uffff";
    static final String DFA10_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\16\uffff\1\5\15\uffff\1\1\4\uffff\1\3\1\4\2\uffff\1\6"+
            "\1\7\1\10\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1358:2: ( ( (a0_0= parse_SOS_adtmm_Term ) a1= ':' ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\15\uffff";
    static final String DFA32_eofS =
        "\15\uffff";
    static final String DFA32_minS =
        "\1\4\11\0\3\uffff";
    static final String DFA32_maxS =
        "\1\55\11\0\3\uffff";
    static final String DFA32_acceptS =
        "\12\uffff\1\3\1\1\1\2";
    static final String DFA32_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\2\16\uffff\1\5\3\uffff\1\12\11\uffff\1\1\4\uffff\1\3\1\4"+
            "\2\uffff\1\6\1\7\1\10\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "4407:1: parse_SOS_Condition returns [SOS.Condition element = null] : (c0= parse_SOS_Transition | c1= parse_SOS_TypeJudment | c2= parse_SOS_AlgebraicCondition );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_SOS()) ) {s = 11;}

                        else if ( (synpred33_SOS()) ) {s = 12;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_SOS()) ) {s = 11;}

                        else if ( (synpred33_SOS()) ) {s = 12;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_SOS()) ) {s = 11;}

                        else if ( (synpred33_SOS()) ) {s = 12;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_SOS()) ) {s = 11;}

                        else if ( (synpred33_SOS()) ) {s = 12;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_SOS()) ) {s = 11;}

                        else if ( (synpred33_SOS()) ) {s = 12;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_SOS()) ) {s = 11;}

                        else if ( (synpred33_SOS()) ) {s = 12;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_SOS()) ) {s = 11;}

                        else if ( (synpred33_SOS()) ) {s = 12;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_SOS()) ) {s = 11;}

                        else if ( (synpred33_SOS()) ) {s = 12;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_SOS()) ) {s = 11;}

                        else if ( (synpred33_SOS()) ) {s = 12;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\16\uffff";
    static final String DFA33_eofS =
        "\12\uffff\1\13\3\uffff";
    static final String DFA33_minS =
        "\2\4\10\uffff\1\4\3\uffff";
    static final String DFA33_maxS =
        "\1\55\1\4\10\uffff\1\56\3\uffff";
    static final String DFA33_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\1\1\12\1\13";
    static final String DFA33_specialS =
        "\16\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\2\16\uffff\1\5\15\uffff\1\1\4\uffff\1\3\1\4\2\uffff\1\6"+
            "\1\7\1\10\1\11",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\7\uffff\10\13\2\uffff\4\13\4\uffff\1\14\1\13\1\uffff"+
            "\1\13\1\uffff\2\13\1\uffff\10\13\1\15",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "4415:1: parse_SOS_adtmm_Term returns [SOS.adtmm.Term element = null] : (c0= parse_SOS_adtmm_VariableRef | c1= parse_SOS_adtmm_CTerm | c2= parse_SOS_set_ModelSet | c3= parse_SOS_set_SetConstructor | c4= parse_SOS_set_ForAllIn | c5= parse_SOS_set_ExistsIn | c6= parse_SOS_set_Union | c7= parse_SOS_set_Excluding | c8= parse_SOS_set_Intersection | c9= parse_SOS_set_ModelRelation | c10= parse_SOS_set_ModelClassAttribute );";
        }
    }
    static final String DFA34_eotS =
        "\14\uffff";
    static final String DFA34_eofS =
        "\14\uffff";
    static final String DFA34_minS =
        "\1\4\11\0\2\uffff";
    static final String DFA34_maxS =
        "\1\55\11\0\2\uffff";
    static final String DFA34_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA34_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\2\16\uffff\1\5\15\uffff\1\1\4\uffff\1\3\1\4\2\uffff\1\6"+
            "\1\7\1\10\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "4431:1: parse_SOS_adtmm_AbstractEquation returns [SOS.adtmm.AbstractEquation element = null] : (c0= parse_SOS_adtmm_Equation | c1= parse_SOS_adtmm_Inequation );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA34_8 = input.LA(1);

                         
                        int index34_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA34_9 = input.LA(1);

                         
                        int index34_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_SOS()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index34_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_parse_SOS_Semantics_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_ADT_in_start96 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_parse_SOS_Semantics129 = new BitSet(new long[]{0x0000000002005002L});
    public static final BitSet FOLLOW_parse_SOS_Rule_in_parse_SOS_Semantics158 = new BitSet(new long[]{0x0000000002005002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_ADT_in_parse_SOS_Semantics200 = new BitSet(new long[]{0x0000000002005002L});
    public static final BitSet FOLLOW_12_in_parse_SOS_Rule265 = new BitSet(new long[]{0x00003CC200880010L});
    public static final BitSet FOLLOW_parse_SOS_PremisseList_in_parse_SOS_Rule291 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_SOS_Rule319 = new BitSet(new long[]{0x00003CC200880010L});
    public static final BitSet FOLLOW_parse_SOS_Conclusion_in_parse_SOS_Rule345 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_14_in_parse_SOS_Rule394 = new BitSet(new long[]{0x00003CC200880010L});
    public static final BitSet FOLLOW_parse_SOS_Conclusion_in_parse_SOS_Rule420 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_parse_SOS_Rule474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Variable_in_parse_SOS_Rule507 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_parse_SOS_Condition_in_parse_SOS_PremisseList579 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_parse_SOS_PremisseList606 = new BitSet(new long[]{0x00003CC200880010L});
    public static final BitSet FOLLOW_parse_SOS_PremisseList_in_parse_SOS_PremisseList632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_AlgebraicCondition_in_parse_SOS_AlgebraicConditionList692 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_parse_SOS_AlgebraicConditionList719 = new BitSet(new long[]{0x00003CC200880010L});
    public static final BitSet FOLLOW_parse_SOS_AlgebraicConditionList_in_parse_SOS_AlgebraicConditionList745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_Condition_in_parse_SOS_Conclusion805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_Transition853 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_SOS_Transition881 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_Transition918 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_SOS_Transition936 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_Transition954 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_SOS_Transition972 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_Transition990 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_SOS_Transition1008 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_SOS_Transition1022 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_SOS_Transition1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_TypeJudment1080 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_SOS_TypeJudment1108 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_TypeJudment1145 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_SOS_TypeJudment1163 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_TypeJudment1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_SOS_AlgebraicCondition1214 = new BitSet(new long[]{0x00003CC200880010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_AbstractEquation_in_parse_SOS_AlgebraicCondition1232 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_SOS_AlgebraicCondition1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_AbstractEquation_in_parse_SOS_AlgebraicCondition1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_SOS_adtmm_ADT1305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_SOS_adtmm_ADT1323 = new BitSet(new long[]{0x000000003C008002L});
    public static final BitSet FOLLOW_26_in_parse_SOS_adtmm_ADT1353 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_SortDeclaration_in_parse_SOS_adtmm_ADT1386 = new BitSet(new long[]{0x0000000038008012L});
    public static final BitSet FOLLOW_27_in_parse_SOS_adtmm_ADT1448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Operation_in_parse_SOS_adtmm_ADT1481 = new BitSet(new long[]{0x0000000030008012L});
    public static final BitSet FOLLOW_28_in_parse_SOS_adtmm_ADT1543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Operation_in_parse_SOS_adtmm_ADT1576 = new BitSet(new long[]{0x0000000020008012L});
    public static final BitSet FOLLOW_29_in_parse_SOS_adtmm_ADT1638 = new BitSet(new long[]{0x00003CC200880010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_CondEquation_in_parse_SOS_adtmm_ADT1671 = new BitSet(new long[]{0x00003CC200888012L});
    public static final BitSet FOLLOW_15_in_parse_SOS_adtmm_ADT1733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Variable_in_parse_SOS_adtmm_ADT1766 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_TEXT_in_parse_SOS_adtmm_Operation1838 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_SOS_adtmm_Operation1859 = new BitSet(new long[]{0x0000802040000010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Sort_in_parse_SOS_adtmm_Operation1882 = new BitSet(new long[]{0x0000802040000010L});
    public static final BitSet FOLLOW_30_in_parse_SOS_adtmm_Operation1908 = new BitSet(new long[]{0x0000802000000010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Sort_in_parse_SOS_adtmm_Operation1926 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_SOS_adtmm_Operation1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_SOS_adtmm_Variable1977 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_17_in_parse_SOS_adtmm_Variable2007 = new BitSet(new long[]{0x0000802000000010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Sort_in_parse_SOS_adtmm_Variable2033 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_SOS_adtmm_Variable2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_SOS_adtmm_CondEquation2112 = new BitSet(new long[]{0x00003CC200880010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_AbstractEquation_in_parse_SOS_adtmm_CondEquation2145 = new BitSet(new long[]{0x00003CC201880010L});
    public static final BitSet FOLLOW_24_in_parse_SOS_adtmm_CondEquation2185 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_SOS_adtmm_CondEquation2205 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Equation_in_parse_SOS_adtmm_CondEquation2242 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_SOS_adtmm_CondEquation2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_SOS_adtmm_VariableRef2289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_SOS_adtmm_VariableRef2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_SOS_adtmm_CTerm2347 = new BitSet(new long[]{0x0000000400800002L});
    public static final BitSet FOLLOW_34_in_parse_SOS_adtmm_CTerm2377 = new BitSet(new long[]{0x00003CC200080030L});
    public static final BitSet FOLLOW_INTEGER_in_parse_SOS_adtmm_CTerm2410 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_CTerm2466 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parse_SOS_adtmm_CTerm2534 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_CTerm2567 = new BitSet(new long[]{0x00003CC201080010L});
    public static final BitSet FOLLOW_24_in_parse_SOS_adtmm_CTerm2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_Equation2659 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_SOS_adtmm_Equation2677 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_Equation2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_Inequation2732 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_SOS_adtmm_Inequation2750 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_adtmm_Inequation2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_SOS_adtmm_AtomicSort2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_SOS_adtmm_SortDeclaration2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_SOS_set_Set2881 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_SOS_set_Set2895 = new BitSet(new long[]{0x0000802000000010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Sort_in_parse_SOS_set_Set2913 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_SOS_set_Set2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_parse_SOS_set_ModelSet2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_parse_SOS_set_SetConstructor2989 = new BitSet(new long[]{0x00003EC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_SetConstructor3018 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_parse_SOS_set_SetConstructor3059 = new BitSet(new long[]{0x00003CC200880010L});
    public static final BitSet FOLLOW_parse_SOS_AlgebraicConditionList_in_parse_SOS_set_SetConstructor3093 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_SOS_set_SetConstructor3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_SOS_set_ForAllIn3196 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_SOS_set_ForAllIn3210 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_ForAllIn3228 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_SOS_set_ForAllIn3246 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_ForAllIn3264 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_SOS_set_ForAllIn3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_SOS_set_ExistsIn3311 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_SOS_set_ExistsIn3325 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_ExistsIn3343 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_SOS_set_ExistsIn3361 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_ExistsIn3379 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_SOS_set_ExistsIn3397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parse_SOS_set_Union3426 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_SOS_set_Union3440 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Union3458 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_SOS_set_Union3476 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Union3494 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_SOS_set_Union3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_parse_SOS_set_Excluding3541 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_SOS_set_Excluding3555 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Excluding3573 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_SOS_set_Excluding3591 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Excluding3609 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_SOS_set_Excluding3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parse_SOS_set_Intersection3656 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_SOS_set_Intersection3670 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Intersection3688 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_SOS_set_Intersection3706 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_parse_SOS_set_Intersection3724 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_SOS_set_Intersection3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_VariableRef_in_parse_SOS_set_ModelRelation3775 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_SOS_set_ModelRelation3793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_SOS_set_ModelRelation3811 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_SOS_set_ModelRelation3832 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_VariableRef_in_parse_SOS_set_ModelRelation3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_VariableRef_in_parse_SOS_set_ModelClassAttribute3887 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_SOS_set_ModelClassAttribute3905 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TEXT_in_parse_SOS_set_ModelClassAttribute3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_parse_SOS_set_ModelSort3959 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_SOS_set_ModelSort3973 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_SOS_set_ModelSort3991 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_SOS_set_ModelSort4012 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_SOS_set_ModelSort4030 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_SOS_set_ModelSort4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_Transition_in_parse_SOS_Condition4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_TypeJudment_in_parse_SOS_Condition4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_AlgebraicCondition_in_parse_SOS_Condition4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_VariableRef_in_parse_SOS_adtmm_Term4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_CTerm_in_parse_SOS_adtmm_Term4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_ModelSet_in_parse_SOS_adtmm_Term4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_SetConstructor_in_parse_SOS_adtmm_Term4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_ForAllIn_in_parse_SOS_adtmm_Term4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_ExistsIn_in_parse_SOS_adtmm_Term4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_Union_in_parse_SOS_adtmm_Term4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_Excluding_in_parse_SOS_adtmm_Term4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_Intersection_in_parse_SOS_adtmm_Term4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_ModelRelation_in_parse_SOS_adtmm_Term4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_ModelClassAttribute_in_parse_SOS_adtmm_Term4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Equation_in_parse_SOS_adtmm_AbstractEquation4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Inequation_in_parse_SOS_adtmm_AbstractEquation4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_AtomicSort_in_parse_SOS_adtmm_Sort4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_Set_in_parse_SOS_adtmm_Sort4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_set_ModelSort_in_parse_SOS_adtmm_Sort4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_synpred9_SOS853 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred9_SOS881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_synpred10_SOS1080 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred10_SOS1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred29_SOS2534 = new BitSet(new long[]{0x00003CC200080010L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Term_in_synpred29_SOS2567 = new BitSet(new long[]{0x00003CC201080010L});
    public static final BitSet FOLLOW_24_in_synpred29_SOS2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_Transition_in_synpred32_SOS4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_TypeJudment_in_synpred33_SOS4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_SOS_adtmm_Equation_in_synpred44_SOS4238 = new BitSet(new long[]{0x0000000000000002L});

}