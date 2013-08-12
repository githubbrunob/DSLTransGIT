// $ANTLR ${project.version} ${buildNumber}

	package dsltrans.resource.dsltranstext.mopp;


import org.antlr.runtime3_3_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class DsltranstextParser extends DsltranstextANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENTIFIER", "QUOTED_39_39_92", "DESCCOM", "WHITESPACE", "LINEBREAK", "'File'", "'id'", "'='", "'uri'", "'metamodel'", "'('", "'mmname'", "')'", "'def'", "':'", "'layer'", "'previous'", "'group'", "'output'", "'end'", "'rule'", "'match'", "'apply'", "'where'", "'restrictions'", "'import'", "'source'", "'with'", "'subject'", "'to'", "'any'", "'strict'", "'::'", "'existing'", "'not'", "'in'", "'--'", "'->'", "'!-'", "'~~'", "'~>'", "'!~'", "'self'", "'derived'", "'from'", "'target'", "','", "'sameAs'", "'concat'", "'typeOf'", "'WILDCARD'", "'isNull'", "'true'", "'false'", "'Sequence.nextValue'", "'<>'", "'allow'"
    };
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int IDENTIFIER=4;
    public static final int QUOTED_39_39_92=5;
    public static final int DESCCOM=6;
    public static final int WHITESPACE=7;
    public static final int LINEBREAK=8;

    // delegates
    // delegators


        public DsltranstextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DsltranstextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[114+1];
             
             
        }
        

    public String[] getTokenNames() { return DsltranstextParser.tokenNames; }
    public String getGrammarFileName() { return "Dsltranstext.g"; }


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
    	



    // $ANTLR start "start"
    // Dsltranstext.g:559:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_dsltrans_TransformationModel ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        dsltrans.TransformationModel c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Dsltranstext.g:560:1: ( (c0= parse_dsltrans_TransformationModel ) EOF )
            // Dsltranstext.g:561:2: (c0= parse_dsltrans_TransformationModel ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_0, 0, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_1, 0, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
              		expectedElementsIndexOfLastCompleteElement = 0;
              	
            }
            // Dsltranstext.g:567:2: (c0= parse_dsltrans_TransformationModel )
            // Dsltranstext.g:568:3: c0= parse_dsltrans_TransformationModel
            {
            pushFollow(FOLLOW_parse_dsltrans_TransformationModel_in_start82);
            c0=parse_dsltrans_TransformationModel();

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


    // $ANTLR start "parse_dsltrans_TransformationModel"
    // Dsltranstext.g:576:1: parse_dsltrans_TransformationModel returns [dsltrans.TransformationModel element = null] : ( (a0_0= parse_dsltrans_AbstractSource ) )* ;
    public final dsltrans.TransformationModel parse_dsltrans_TransformationModel() throws RecognitionException {
        dsltrans.TransformationModel element =  null;
        int parse_dsltrans_TransformationModel_StartIndex = input.index();
        dsltrans.AbstractSource a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Dsltranstext.g:579:1: ( ( (a0_0= parse_dsltrans_AbstractSource ) )* )
            // Dsltranstext.g:580:2: ( (a0_0= parse_dsltrans_AbstractSource ) )*
            {
            // Dsltranstext.g:580:2: ( (a0_0= parse_dsltrans_AbstractSource ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Dsltranstext.g:581:3: (a0_0= parse_dsltrans_AbstractSource )
            	    {
            	    // Dsltranstext.g:581:3: (a0_0= parse_dsltrans_AbstractSource )
            	    // Dsltranstext.g:582:4: a0_0= parse_dsltrans_AbstractSource
            	    {
            	    pushFollow(FOLLOW_parse_dsltrans_AbstractSource_in_parse_dsltrans_TransformationModel124);
            	    a0_0=parse_dsltrans_AbstractSource();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_0, 1, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_1, 1, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_dsltrans_TransformationModel_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_TransformationModel"


    // $ANTLR start "parse_dsltrans_FilePort"
    // Dsltranstext.g:611:1: parse_dsltrans_FilePort returns [dsltrans.FilePort element = null] : a0= 'File' ( (a1= 'id' a2= '=' (a3= IDENTIFIER ) ) )? ( (a4= 'uri' a5= '=' (a6= QUOTED_39_39_92 ) ) )? (a7_0= parse_dsltrans_MetaModelIdentifier ) ;
    public final dsltrans.FilePort parse_dsltrans_FilePort() throws RecognitionException {
        dsltrans.FilePort element =  null;
        int parse_dsltrans_FilePort_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        dsltrans.MetaModelIdentifier a7_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Dsltranstext.g:614:1: (a0= 'File' ( (a1= 'id' a2= '=' (a3= IDENTIFIER ) ) )? ( (a4= 'uri' a5= '=' (a6= QUOTED_39_39_92 ) ) )? (a7_0= parse_dsltrans_MetaModelIdentifier ) )
            // Dsltranstext.g:615:2: a0= 'File' ( (a1= 'id' a2= '=' (a3= IDENTIFIER ) ) )? ( (a4= 'uri' a5= '=' (a6= QUOTED_39_39_92 ) ) )? (a7_0= parse_dsltrans_MetaModelIdentifier )
            {
            a0=(Token)match(input,9,FOLLOW_9_in_parse_dsltrans_FilePort165); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_2, 2);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_3, 2);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 2, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
              	
            }
            // Dsltranstext.g:631:2: ( (a1= 'id' a2= '=' (a3= IDENTIFIER ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Dsltranstext.g:632:3: (a1= 'id' a2= '=' (a3= IDENTIFIER ) )
                    {
                    // Dsltranstext.g:632:3: (a1= 'id' a2= '=' (a3= IDENTIFIER ) )
                    // Dsltranstext.g:633:4: a1= 'id' a2= '=' (a3= IDENTIFIER )
                    {
                    a1=(Token)match(input,10,FOLLOW_10_in_parse_dsltrans_FilePort188); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_2_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_5, 3);
                      			
                    }
                    a2=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_FilePort208); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_2_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_6, 4);
                      			
                    }
                    // Dsltranstext.g:661:4: (a3= IDENTIFIER )
                    // Dsltranstext.g:662:5: a3= IDENTIFIER
                    {
                    a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_FilePort234); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_3, 5);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 5, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_3, 6);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 6, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
              	
            }
            // Dsltranstext.g:706:2: ( (a4= 'uri' a5= '=' (a6= QUOTED_39_39_92 ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Dsltranstext.g:707:3: (a4= 'uri' a5= '=' (a6= QUOTED_39_39_92 ) )
                    {
                    // Dsltranstext.g:707:3: (a4= 'uri' a5= '=' (a6= QUOTED_39_39_92 ) )
                    // Dsltranstext.g:708:4: a4= 'uri' a5= '=' (a6= QUOTED_39_39_92 )
                    {
                    a4=(Token)match(input,12,FOLLOW_12_in_parse_dsltrans_FilePort289); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_3_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_7, 7);
                      			
                    }
                    a5=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_FilePort309); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createFilePort();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_1_0_0_3_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_8, 8);
                      			
                    }
                    // Dsltranstext.g:736:4: (a6= QUOTED_39_39_92 )
                    // Dsltranstext.g:737:5: a6= QUOTED_39_39_92
                    {
                    a6=(Token)match(input,QUOTED_39_39_92,FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_FilePort335); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 9, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 10, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
              	
            }
            // Dsltranstext.g:779:2: (a7_0= parse_dsltrans_MetaModelIdentifier )
            // Dsltranstext.g:780:3: a7_0= parse_dsltrans_MetaModelIdentifier
            {
            pushFollow(FOLLOW_parse_dsltrans_MetaModelIdentifier_in_parse_dsltrans_FilePort385);
            a7_0=parse_dsltrans_MetaModelIdentifier();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_0, 11, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_1, 11, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_dsltrans_FilePort_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_FilePort"


    // $ANTLR start "parse_dsltrans_MetaModelIdentifier"
    // Dsltranstext.g:808:1: parse_dsltrans_MetaModelIdentifier returns [dsltrans.MetaModelIdentifier element = null] : a0= 'metamodel' a1= '(' ( (a2= 'mmname' a3= '=' (a4= IDENTIFIER ) ) )? ( (a5= 'uri' a6= '=' (a7= QUOTED_39_39_92 ) ) )? a8= ')' ;
    public final dsltrans.MetaModelIdentifier parse_dsltrans_MetaModelIdentifier() throws RecognitionException {
        dsltrans.MetaModelIdentifier element =  null;
        int parse_dsltrans_MetaModelIdentifier_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Dsltranstext.g:811:1: (a0= 'metamodel' a1= '(' ( (a2= 'mmname' a3= '=' (a4= IDENTIFIER ) ) )? ( (a5= 'uri' a6= '=' (a7= QUOTED_39_39_92 ) ) )? a8= ')' )
            // Dsltranstext.g:812:2: a0= 'metamodel' a1= '(' ( (a2= 'mmname' a3= '=' (a4= IDENTIFIER ) ) )? ( (a5= 'uri' a6= '=' (a7= QUOTED_39_39_92 ) ) )? a8= ')'
            {
            a0=(Token)match(input,13,FOLLOW_13_in_parse_dsltrans_MetaModelIdentifier418); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_9, 12);
              	
            }
            a1=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_MetaModelIdentifier432); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_10, 13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_11, 13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_12, 13);
              	
            }
            // Dsltranstext.g:842:2: ( (a2= 'mmname' a3= '=' (a4= IDENTIFIER ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Dsltranstext.g:843:3: (a2= 'mmname' a3= '=' (a4= IDENTIFIER ) )
                    {
                    // Dsltranstext.g:843:3: (a2= 'mmname' a3= '=' (a4= IDENTIFIER ) )
                    // Dsltranstext.g:844:4: a2= 'mmname' a3= '=' (a4= IDENTIFIER )
                    {
                    a2=(Token)match(input,15,FOLLOW_15_in_parse_dsltrans_MetaModelIdentifier455); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_13, 14);
                      			
                    }
                    a3=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_MetaModelIdentifier475); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_4_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_14, 15);
                      			
                    }
                    // Dsltranstext.g:872:4: (a4= IDENTIFIER )
                    // Dsltranstext.g:873:5: a4= IDENTIFIER
                    {
                    a4=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_MetaModelIdentifier501); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_11, 16);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_12, 16);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_11, 17);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_12, 17);
              	
            }
            // Dsltranstext.g:917:2: ( (a5= 'uri' a6= '=' (a7= QUOTED_39_39_92 ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Dsltranstext.g:918:3: (a5= 'uri' a6= '=' (a7= QUOTED_39_39_92 ) )
                    {
                    // Dsltranstext.g:918:3: (a5= 'uri' a6= '=' (a7= QUOTED_39_39_92 ) )
                    // Dsltranstext.g:919:4: a5= 'uri' a6= '=' (a7= QUOTED_39_39_92 )
                    {
                    a5=(Token)match(input,12,FOLLOW_12_in_parse_dsltrans_MetaModelIdentifier556); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_5_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_15, 18);
                      			
                    }
                    a6=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_MetaModelIdentifier576); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_5_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_16, 19);
                      			
                    }
                    // Dsltranstext.g:947:4: (a7= QUOTED_39_39_92 )
                    // Dsltranstext.g:948:5: a7= QUOTED_39_39_92
                    {
                    a7=(Token)match(input,QUOTED_39_39_92,FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_MetaModelIdentifier602); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_12, 20);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_12, 21);
              	
            }
            a8=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_MetaModelIdentifier648); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createMetaModelIdentifier();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_2_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_0, 22, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_1, 22, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_17, 22, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_2);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_18, 22);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_dsltrans_MetaModelIdentifier_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_MetaModelIdentifier"


    // $ANTLR start "parse_dsltrans_Sequential"
    // Dsltranstext.g:1009:1: parse_dsltrans_Sequential returns [dsltrans.Sequential element = null] : a0= 'def' ( ( (a1= QUOTED_39_39_92 ) a2= ':' ) )? a3= 'layer' ( ( (a4= QUOTED_39_39_92 ) ) )? a5= 'previous' a6= '=' ( (a7= QUOTED_39_39_92 ) )+ ( (a8= 'group' a9= '=' (a10= IDENTIFIER ) ) )? ( (a11= 'output' a12= '=' (a13= QUOTED_39_39_92 ) ) )? (a14_0= parse_dsltrans_MetaModelIdentifier ) ( ( (a15_0= parse_dsltrans_Rule ) ) )* a16= 'end' a17= 'def' ;
    public final dsltrans.Sequential parse_dsltrans_Sequential() throws RecognitionException {
        dsltrans.Sequential element =  null;
        int parse_dsltrans_Sequential_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a16=null;
        Token a17=null;
        dsltrans.MetaModelIdentifier a14_0 = null;

        dsltrans.Rule a15_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Dsltranstext.g:1012:1: (a0= 'def' ( ( (a1= QUOTED_39_39_92 ) a2= ':' ) )? a3= 'layer' ( ( (a4= QUOTED_39_39_92 ) ) )? a5= 'previous' a6= '=' ( (a7= QUOTED_39_39_92 ) )+ ( (a8= 'group' a9= '=' (a10= IDENTIFIER ) ) )? ( (a11= 'output' a12= '=' (a13= QUOTED_39_39_92 ) ) )? (a14_0= parse_dsltrans_MetaModelIdentifier ) ( ( (a15_0= parse_dsltrans_Rule ) ) )* a16= 'end' a17= 'def' )
            // Dsltranstext.g:1013:2: a0= 'def' ( ( (a1= QUOTED_39_39_92 ) a2= ':' ) )? a3= 'layer' ( ( (a4= QUOTED_39_39_92 ) ) )? a5= 'previous' a6= '=' ( (a7= QUOTED_39_39_92 ) )+ ( (a8= 'group' a9= '=' (a10= IDENTIFIER ) ) )? ( (a11= 'output' a12= '=' (a13= QUOTED_39_39_92 ) ) )? (a14_0= parse_dsltrans_MetaModelIdentifier ) ( ( (a15_0= parse_dsltrans_Rule ) ) )* a16= 'end' a17= 'def'
            {
            a0=(Token)match(input,17,FOLLOW_17_in_parse_dsltrans_Sequential677); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_19, 23);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_20, 23);
              	
            }
            // Dsltranstext.g:1028:2: ( ( (a1= QUOTED_39_39_92 ) a2= ':' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==QUOTED_39_39_92) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Dsltranstext.g:1029:3: ( (a1= QUOTED_39_39_92 ) a2= ':' )
                    {
                    // Dsltranstext.g:1029:3: ( (a1= QUOTED_39_39_92 ) a2= ':' )
                    // Dsltranstext.g:1030:4: (a1= QUOTED_39_39_92 ) a2= ':'
                    {
                    // Dsltranstext.g:1030:4: (a1= QUOTED_39_39_92 )
                    // Dsltranstext.g:1031:5: a1= QUOTED_39_39_92
                    {
                    a1=(Token)match(input,QUOTED_39_39_92,FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Sequential706); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_21, 24);
                      			
                    }
                    a2=(Token)match(input,18,FOLLOW_18_in_parse_dsltrans_Sequential739); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_2_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_20, 25);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_20, 26);
              	
            }
            a3=(Token)match(input,19,FOLLOW_19_in_parse_dsltrans_Sequential772); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_3, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_22, 27);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_23, 27);
              	
            }
            // Dsltranstext.g:1102:2: ( ( (a4= QUOTED_39_39_92 ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==QUOTED_39_39_92) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Dsltranstext.g:1103:3: ( (a4= QUOTED_39_39_92 ) )
                    {
                    // Dsltranstext.g:1103:3: ( (a4= QUOTED_39_39_92 ) )
                    // Dsltranstext.g:1104:4: (a4= QUOTED_39_39_92 )
                    {
                    // Dsltranstext.g:1104:4: (a4= QUOTED_39_39_92 )
                    // Dsltranstext.g:1105:5: a4= QUOTED_39_39_92
                    {
                    a4=(Token)match(input,QUOTED_39_39_92,FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Sequential801); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_23, 28);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_23, 29);
              	
            }
            a5=(Token)match(input,20,FOLLOW_20_in_parse_dsltrans_Sequential847); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_24, 30);
              	
            }
            a6=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_Sequential861); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_9, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_25, 31);
              	
            }
            // Dsltranstext.g:1175:2: ( (a7= QUOTED_39_39_92 ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==QUOTED_39_39_92) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Dsltranstext.g:1176:3: (a7= QUOTED_39_39_92 )
            	    {
            	    // Dsltranstext.g:1176:3: (a7= QUOTED_39_39_92 )
            	    // Dsltranstext.g:1177:4: a7= QUOTED_39_39_92
            	    {
            	    a7=(Token)match(input,QUOTED_39_39_92,FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Sequential884); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_25, 32);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_26, 32);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_27, 32);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 32, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
              	
            }
            // Dsltranstext.g:1220:2: ( (a8= 'group' a9= '=' (a10= IDENTIFIER ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Dsltranstext.g:1221:3: (a8= 'group' a9= '=' (a10= IDENTIFIER ) )
                    {
                    // Dsltranstext.g:1221:3: (a8= 'group' a9= '=' (a10= IDENTIFIER ) )
                    // Dsltranstext.g:1222:4: a8= 'group' a9= '=' (a10= IDENTIFIER )
                    {
                    a8=(Token)match(input,21,FOLLOW_21_in_parse_dsltrans_Sequential923); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_13_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_28, 33);
                      			
                    }
                    a9=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_Sequential943); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_13_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_29, 34);
                      			
                    }
                    // Dsltranstext.g:1250:4: (a10= IDENTIFIER )
                    // Dsltranstext.g:1251:5: a10= IDENTIFIER
                    {
                    a10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_Sequential969); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_27, 35);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 35, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_27, 36);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 36, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
              	
            }
            // Dsltranstext.g:1295:2: ( (a11= 'output' a12= '=' (a13= QUOTED_39_39_92 ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Dsltranstext.g:1296:3: (a11= 'output' a12= '=' (a13= QUOTED_39_39_92 ) )
                    {
                    // Dsltranstext.g:1296:3: (a11= 'output' a12= '=' (a13= QUOTED_39_39_92 ) )
                    // Dsltranstext.g:1297:4: a11= 'output' a12= '=' (a13= QUOTED_39_39_92 )
                    {
                    a11=(Token)match(input,22,FOLLOW_22_in_parse_dsltrans_Sequential1024); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_14_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a11, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_30, 37);
                      			
                    }
                    a12=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_Sequential1044); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_14_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a12, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_31, 38);
                      			
                    }
                    // Dsltranstext.g:1325:4: (a13= QUOTED_39_39_92 )
                    // Dsltranstext.g:1326:5: a13= QUOTED_39_39_92
                    {
                    a13=(Token)match(input,QUOTED_39_39_92,FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Sequential1070); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 39, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_4, 40, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_1);
              	
            }
            // Dsltranstext.g:1368:2: (a14_0= parse_dsltrans_MetaModelIdentifier )
            // Dsltranstext.g:1369:3: a14_0= parse_dsltrans_MetaModelIdentifier
            {
            pushFollow(FOLLOW_parse_dsltrans_MetaModelIdentifier_in_parse_dsltrans_Sequential1120);
            a14_0=parse_dsltrans_MetaModelIdentifier();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_17, 41, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_2);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_18, 41);
              	
            }
            // Dsltranstext.g:1395:2: ( ( (a15_0= parse_dsltrans_Rule ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Dsltranstext.g:1396:3: ( (a15_0= parse_dsltrans_Rule ) )
            	    {
            	    // Dsltranstext.g:1396:3: ( (a15_0= parse_dsltrans_Rule ) )
            	    // Dsltranstext.g:1397:4: (a15_0= parse_dsltrans_Rule )
            	    {
            	    // Dsltranstext.g:1397:4: (a15_0= parse_dsltrans_Rule )
            	    // Dsltranstext.g:1398:5: a15_0= parse_dsltrans_Rule
            	    {
            	    pushFollow(FOLLOW_parse_dsltrans_Rule_in_parse_dsltrans_Sequential1153);
            	    a15_0=parse_dsltrans_Rule();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_17, 42, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_2);
            	      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_18, 42);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_17, 43, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_2);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_18, 43);
              	
            }
            a16=(Token)match(input,23,FOLLOW_23_in_parse_dsltrans_Sequential1194); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_19, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a16, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_32, 44);
              	
            }
            a17=(Token)match(input,17,FOLLOW_17_in_parse_dsltrans_Sequential1208); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createSequential();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_3_0_0_21, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a17, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_0, 45, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_1, 45, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_0);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_dsltrans_Sequential_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_Sequential"


    // $ANTLR start "parse_dsltrans_Rule"
    // Dsltranstext.g:1463:1: parse_dsltrans_Rule returns [dsltrans.Rule element = null] : a0= 'rule' ( ( (a1= QUOTED_39_39_92 ) ) )? ( (a2= 'match' (a3_0= parse_dsltrans_MatchModel ) ) )+ (a4= 'apply' (a5_0= parse_dsltrans_ApplyModel ) ) ( (a6= 'where' ( ( (a7_0= parse_dsltrans_AbstractAttributeRelation ) ) )* ) )? ( (a8= 'restrictions' ( ( (a9_0= parse_dsltrans_AbstractTemporalRelation ) ) )* ) )? ( (a10= 'import' ( ( (a11_0= parse_dsltrans_Import ) ) )* ) )? a12= 'end' a13= 'rule' ;
    public final dsltrans.Rule parse_dsltrans_Rule() throws RecognitionException {
        dsltrans.Rule element =  null;
        int parse_dsltrans_Rule_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a10=null;
        Token a12=null;
        Token a13=null;
        dsltrans.MatchModel a3_0 = null;

        dsltrans.ApplyModel a5_0 = null;

        dsltrans.AbstractAttributeRelation a7_0 = null;

        dsltrans.AbstractTemporalRelation a9_0 = null;

        dsltrans.Import a11_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Dsltranstext.g:1466:1: (a0= 'rule' ( ( (a1= QUOTED_39_39_92 ) ) )? ( (a2= 'match' (a3_0= parse_dsltrans_MatchModel ) ) )+ (a4= 'apply' (a5_0= parse_dsltrans_ApplyModel ) ) ( (a6= 'where' ( ( (a7_0= parse_dsltrans_AbstractAttributeRelation ) ) )* ) )? ( (a8= 'restrictions' ( ( (a9_0= parse_dsltrans_AbstractTemporalRelation ) ) )* ) )? ( (a10= 'import' ( ( (a11_0= parse_dsltrans_Import ) ) )* ) )? a12= 'end' a13= 'rule' )
            // Dsltranstext.g:1467:2: a0= 'rule' ( ( (a1= QUOTED_39_39_92 ) ) )? ( (a2= 'match' (a3_0= parse_dsltrans_MatchModel ) ) )+ (a4= 'apply' (a5_0= parse_dsltrans_ApplyModel ) ) ( (a6= 'where' ( ( (a7_0= parse_dsltrans_AbstractAttributeRelation ) ) )* ) )? ( (a8= 'restrictions' ( ( (a9_0= parse_dsltrans_AbstractTemporalRelation ) ) )* ) )? ( (a10= 'import' ( ( (a11_0= parse_dsltrans_Import ) ) )* ) )? a12= 'end' a13= 'rule'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_dsltrans_Rule1237); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createRule();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_33, 46);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 46);
              	
            }
            // Dsltranstext.g:1482:2: ( ( (a1= QUOTED_39_39_92 ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==QUOTED_39_39_92) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Dsltranstext.g:1483:3: ( (a1= QUOTED_39_39_92 ) )
                    {
                    // Dsltranstext.g:1483:3: ( (a1= QUOTED_39_39_92 ) )
                    // Dsltranstext.g:1484:4: (a1= QUOTED_39_39_92 )
                    {
                    // Dsltranstext.g:1484:4: (a1= QUOTED_39_39_92 )
                    // Dsltranstext.g:1485:5: a1= QUOTED_39_39_92
                    {
                    a1=(Token)match(input,QUOTED_39_39_92,FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Rule1266); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 47);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 48);
              	
            }
            // Dsltranstext.g:1527:2: ( (a2= 'match' (a3_0= parse_dsltrans_MatchModel ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Dsltranstext.g:1528:3: (a2= 'match' (a3_0= parse_dsltrans_MatchModel ) )
            	    {
            	    // Dsltranstext.g:1528:3: (a2= 'match' (a3_0= parse_dsltrans_MatchModel ) )
            	    // Dsltranstext.g:1529:4: a2= 'match' (a3_0= parse_dsltrans_MatchModel )
            	    {
            	    a2=(Token)match(input,25,FOLLOW_25_in_parse_dsltrans_Rule1321); if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

            	      				if (element == null) {
            	      					element = dsltrans.DsltransFactory.eINSTANCE.createRule();
            	      					incompleteObjects.push(element);
            	      				}
            	      				collectHiddenTokens(element);
            	      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_3_0_0_0, null, true);
            	      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_35, 49, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_3);
            	      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_36, 49, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_3);
            	      			
            	    }
            	    // Dsltranstext.g:1544:4: (a3_0= parse_dsltrans_MatchModel )
            	    // Dsltranstext.g:1545:5: a3_0= parse_dsltrans_MatchModel
            	    {
            	    pushFollow(FOLLOW_parse_dsltrans_MatchModel_in_parse_dsltrans_Rule1347);
            	    a3_0=parse_dsltrans_MatchModel();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }

            	    if ( state.backtracking==0 ) {

            	      				// expected elements (follow set)
            	      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 50);
            	      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 50);
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 51);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 51);
              	
            }
            // Dsltranstext.g:1579:2: (a4= 'apply' (a5_0= parse_dsltrans_ApplyModel ) )
            // Dsltranstext.g:1580:3: a4= 'apply' (a5_0= parse_dsltrans_ApplyModel )
            {
            a4=(Token)match(input,26,FOLLOW_26_in_parse_dsltrans_Rule1392); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (element == null) {
              				element = dsltrans.DsltransFactory.eINSTANCE.createRule();
              				incompleteObjects.push(element);
              			}
              			collectHiddenTokens(element);
              			retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_5_0_0_0, null, true);
              			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              		
            }
            if ( state.backtracking==0 ) {

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
            // Dsltranstext.g:1602:3: (a5_0= parse_dsltrans_ApplyModel )
            // Dsltranstext.g:1603:4: a5_0= parse_dsltrans_ApplyModel
            {
            pushFollow(FOLLOW_parse_dsltrans_ApplyModel_in_parse_dsltrans_Rule1414);
            a5_0=parse_dsltrans_ApplyModel();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              			// expected elements (follow set)
              			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 53);
              			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 53);
              			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 53);
              			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 53);
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 54);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 54);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 54);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 54);
              	
            }
            // Dsltranstext.g:1640:2: ( (a6= 'where' ( ( (a7_0= parse_dsltrans_AbstractAttributeRelation ) ) )* ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Dsltranstext.g:1641:3: (a6= 'where' ( ( (a7_0= parse_dsltrans_AbstractAttributeRelation ) ) )* )
                    {
                    // Dsltranstext.g:1641:3: (a6= 'where' ( ( (a7_0= parse_dsltrans_AbstractAttributeRelation ) ) )* )
                    // Dsltranstext.g:1642:4: a6= 'where' ( ( (a7_0= parse_dsltrans_AbstractAttributeRelation ) ) )*
                    {
                    a6=(Token)match(input,27,FOLLOW_27_in_parse_dsltrans_Rule1453); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_7_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_47, 55, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_48, 55, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 55);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 55);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 55);
                      			
                    }
                    // Dsltranstext.g:1660:4: ( ( (a7_0= parse_dsltrans_AbstractAttributeRelation ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==IDENTIFIER) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Dsltranstext.g:1661:5: ( (a7_0= parse_dsltrans_AbstractAttributeRelation ) )
                    	    {
                    	    // Dsltranstext.g:1661:5: ( (a7_0= parse_dsltrans_AbstractAttributeRelation ) )
                    	    // Dsltranstext.g:1662:6: (a7_0= parse_dsltrans_AbstractAttributeRelation )
                    	    {
                    	    // Dsltranstext.g:1662:6: (a7_0= parse_dsltrans_AbstractAttributeRelation )
                    	    // Dsltranstext.g:1663:7: a7_0= parse_dsltrans_AbstractAttributeRelation
                    	    {
                    	    pushFollow(FOLLOW_parse_dsltrans_AbstractAttributeRelation_in_parse_dsltrans_Rule1494);
                    	    a7_0=parse_dsltrans_AbstractAttributeRelation();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_47, 56, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_48, 56, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 56);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 56);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 56);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_47, 57, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_48, 57, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 57);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 57);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 57);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 58);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 58);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 58);
              	
            }
            // Dsltranstext.g:1712:2: ( (a8= 'restrictions' ( ( (a9_0= parse_dsltrans_AbstractTemporalRelation ) ) )* ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Dsltranstext.g:1713:3: (a8= 'restrictions' ( ( (a9_0= parse_dsltrans_AbstractTemporalRelation ) ) )* )
                    {
                    // Dsltranstext.g:1713:3: (a8= 'restrictions' ( ( (a9_0= parse_dsltrans_AbstractTemporalRelation ) ) )* )
                    // Dsltranstext.g:1714:4: a8= 'restrictions' ( ( (a9_0= parse_dsltrans_AbstractTemporalRelation ) ) )*
                    {
                    a8=(Token)match(input,28,FOLLOW_28_in_parse_dsltrans_Rule1577); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_9_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_49, 59, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_50, 59, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 59);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 59);
                      			
                    }
                    // Dsltranstext.g:1731:4: ( ( (a9_0= parse_dsltrans_AbstractTemporalRelation ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==IDENTIFIER) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Dsltranstext.g:1732:5: ( (a9_0= parse_dsltrans_AbstractTemporalRelation ) )
                    	    {
                    	    // Dsltranstext.g:1732:5: ( (a9_0= parse_dsltrans_AbstractTemporalRelation ) )
                    	    // Dsltranstext.g:1733:6: (a9_0= parse_dsltrans_AbstractTemporalRelation )
                    	    {
                    	    // Dsltranstext.g:1733:6: (a9_0= parse_dsltrans_AbstractTemporalRelation )
                    	    // Dsltranstext.g:1734:7: a9_0= parse_dsltrans_AbstractTemporalRelation
                    	    {
                    	    pushFollow(FOLLOW_parse_dsltrans_AbstractTemporalRelation_in_parse_dsltrans_Rule1618);
                    	    a9_0=parse_dsltrans_AbstractTemporalRelation();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_49, 60, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_50, 60, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 60);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 60);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_49, 61, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_50, 61, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 61);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 61);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 62);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 62);
              	
            }
            // Dsltranstext.g:1780:2: ( (a10= 'import' ( ( (a11_0= parse_dsltrans_Import ) ) )* ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Dsltranstext.g:1781:3: (a10= 'import' ( ( (a11_0= parse_dsltrans_Import ) ) )* )
                    {
                    // Dsltranstext.g:1781:3: (a10= 'import' ( ( (a11_0= parse_dsltrans_Import ) ) )* )
                    // Dsltranstext.g:1782:4: a10= 'import' ( ( (a11_0= parse_dsltrans_Import ) ) )*
                    {
                    a10=(Token)match(input,29,FOLLOW_29_in_parse_dsltrans_Rule1701); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createRule();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_11_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a10, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_51, 63, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_8);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 63);
                      			
                    }
                    // Dsltranstext.g:1797:4: ( ( (a11_0= parse_dsltrans_Import ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Dsltranstext.g:1798:5: ( (a11_0= parse_dsltrans_Import ) )
                    	    {
                    	    // Dsltranstext.g:1798:5: ( (a11_0= parse_dsltrans_Import ) )
                    	    // Dsltranstext.g:1799:6: (a11_0= parse_dsltrans_Import )
                    	    {
                    	    // Dsltranstext.g:1799:6: (a11_0= parse_dsltrans_Import )
                    	    // Dsltranstext.g:1800:7: a11_0= parse_dsltrans_Import
                    	    {
                    	    pushFollow(FOLLOW_parse_dsltrans_Import_in_parse_dsltrans_Rule1742);
                    	    a11_0=parse_dsltrans_Import();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_51, 64, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_8);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 64);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_51, 65, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_8);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 65);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 66);
              	
            }
            a12=(Token)match(input,23,FOLLOW_23_in_parse_dsltrans_Rule1816); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createRule();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_13, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a12, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_52, 67);
              	
            }
            a13=(Token)match(input,24,FOLLOW_24_in_parse_dsltrans_Rule1830); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createRule();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_4_0_0_15, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a13, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_17, 68, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_2);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_18, 68);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_dsltrans_Rule_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_Rule"


    // $ANTLR start "parse_dsltrans_MatchModel"
    // Dsltranstext.g:1872:1: parse_dsltrans_MatchModel returns [dsltrans.MatchModel element = null] : ( (a0= 'source' a1= '=' (a2= IDENTIFIER ) ) )? a3= 'with' ( ( (a4_0= parse_dsltrans_MatchClass ) ) )* ( (a5= 'subject' a6= 'to' ( ( (a7_0= parse_dsltrans_MatchAssociation ) ) )* ) )? ;
    public final dsltrans.MatchModel parse_dsltrans_MatchModel() throws RecognitionException {
        dsltrans.MatchModel element =  null;
        int parse_dsltrans_MatchModel_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        Token a6=null;
        dsltrans.MatchClass a4_0 = null;

        dsltrans.MatchAssociation a7_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Dsltranstext.g:1875:1: ( ( (a0= 'source' a1= '=' (a2= IDENTIFIER ) ) )? a3= 'with' ( ( (a4_0= parse_dsltrans_MatchClass ) ) )* ( (a5= 'subject' a6= 'to' ( ( (a7_0= parse_dsltrans_MatchAssociation ) ) )* ) )? )
            // Dsltranstext.g:1876:2: ( (a0= 'source' a1= '=' (a2= IDENTIFIER ) ) )? a3= 'with' ( ( (a4_0= parse_dsltrans_MatchClass ) ) )* ( (a5= 'subject' a6= 'to' ( ( (a7_0= parse_dsltrans_MatchAssociation ) ) )* ) )?
            {
            // Dsltranstext.g:1876:2: ( (a0= 'source' a1= '=' (a2= IDENTIFIER ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Dsltranstext.g:1877:3: (a0= 'source' a1= '=' (a2= IDENTIFIER ) )
                    {
                    // Dsltranstext.g:1877:3: (a0= 'source' a1= '=' (a2= IDENTIFIER ) )
                    // Dsltranstext.g:1878:4: a0= 'source' a1= '=' (a2= IDENTIFIER )
                    {
                    a0=(Token)match(input,30,FOLLOW_30_in_parse_dsltrans_MatchModel1868); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_0_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_53, 69);
                      			
                    }
                    a1=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_MatchModel1888); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_0_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_54, 70);
                      			
                    }
                    // Dsltranstext.g:1906:4: (a2= IDENTIFIER )
                    // Dsltranstext.g:1907:5: a2= IDENTIFIER
                    {
                    a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_MatchModel1914); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_36, 71);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_36, 72);
              	
            }
            a3=(Token)match(input,31,FOLLOW_31_in_parse_dsltrans_MatchModel1960); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

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
            // Dsltranstext.g:1978:2: ( ( (a4_0= parse_dsltrans_MatchClass ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==IDENTIFIER||LA21_0==DESCCOM||LA21_0==34||(LA21_0>=37 && LA21_0<=38)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Dsltranstext.g:1979:3: ( (a4_0= parse_dsltrans_MatchClass ) )
            	    {
            	    // Dsltranstext.g:1979:3: ( (a4_0= parse_dsltrans_MatchClass ) )
            	    // Dsltranstext.g:1980:4: (a4_0= parse_dsltrans_MatchClass )
            	    {
            	    // Dsltranstext.g:1980:4: (a4_0= parse_dsltrans_MatchClass )
            	    // Dsltranstext.g:1981:5: a4_0= parse_dsltrans_MatchClass
            	    {
            	    pushFollow(FOLLOW_parse_dsltrans_MatchClass_in_parse_dsltrans_MatchModel1989);
            	    a4_0=parse_dsltrans_MatchClass();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }

            	    if ( state.backtracking==0 ) {

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

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {

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
            // Dsltranstext.g:2035:2: ( (a5= 'subject' a6= 'to' ( ( (a7_0= parse_dsltrans_MatchAssociation ) ) )* ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Dsltranstext.g:2036:3: (a5= 'subject' a6= 'to' ( ( (a7_0= parse_dsltrans_MatchAssociation ) ) )* )
                    {
                    // Dsltranstext.g:2036:3: (a5= 'subject' a6= 'to' ( ( (a7_0= parse_dsltrans_MatchAssociation ) ) )* )
                    // Dsltranstext.g:2037:4: a5= 'subject' a6= 'to' ( ( (a7_0= parse_dsltrans_MatchAssociation ) ) )*
                    {
                    a5=(Token)match(input,32,FOLLOW_32_in_parse_dsltrans_MatchModel2039); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_5_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_65, 76);
                      			
                    }
                    a6=(Token)match(input,33,FOLLOW_33_in_parse_dsltrans_MatchModel2059); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createMatchModel();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_5_0_0_5_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 77, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 77, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 77, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 77, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 77, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 77);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 77);
                      			
                    }
                    // Dsltranstext.g:2071:4: ( ( (a7_0= parse_dsltrans_MatchAssociation ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==IDENTIFIER||LA22_0==60) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Dsltranstext.g:2072:5: ( (a7_0= parse_dsltrans_MatchAssociation ) )
                    	    {
                    	    // Dsltranstext.g:2072:5: ( (a7_0= parse_dsltrans_MatchAssociation ) )
                    	    // Dsltranstext.g:2073:6: (a7_0= parse_dsltrans_MatchAssociation )
                    	    {
                    	    // Dsltranstext.g:2073:6: (a7_0= parse_dsltrans_MatchAssociation )
                    	    // Dsltranstext.g:2074:7: a7_0= parse_dsltrans_MatchAssociation
                    	    {
                    	    pushFollow(FOLLOW_parse_dsltrans_MatchAssociation_in_parse_dsltrans_MatchModel2100);
                    	    a7_0=parse_dsltrans_MatchAssociation();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 78, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 78, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 78, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 78, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 78, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 78);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 78);
                    	      					
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
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 79, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 79, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 79, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 79, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 79, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 79);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 79);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 80);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 80);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_dsltrans_MatchModel_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_MatchModel"


    // $ANTLR start "parse_dsltrans_ApplyModel"
    // Dsltranstext.g:2128:1: parse_dsltrans_ApplyModel returns [dsltrans.ApplyModel element = null] : ( ( (a0_0= parse_dsltrans_ApplyClass ) ) )* ( (a1= 'subject' a2= 'to' ( ( (a3_0= parse_dsltrans_ApplyAssociation ) ) )* ) )? ;
    public final dsltrans.ApplyModel parse_dsltrans_ApplyModel() throws RecognitionException {
        dsltrans.ApplyModel element =  null;
        int parse_dsltrans_ApplyModel_StartIndex = input.index();
        Token a1=null;
        Token a2=null;
        dsltrans.ApplyClass a0_0 = null;

        dsltrans.ApplyAssociation a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Dsltranstext.g:2131:1: ( ( ( (a0_0= parse_dsltrans_ApplyClass ) ) )* ( (a1= 'subject' a2= 'to' ( ( (a3_0= parse_dsltrans_ApplyAssociation ) ) )* ) )? )
            // Dsltranstext.g:2132:2: ( ( (a0_0= parse_dsltrans_ApplyClass ) ) )* ( (a1= 'subject' a2= 'to' ( ( (a3_0= parse_dsltrans_ApplyAssociation ) ) )* ) )?
            {
            // Dsltranstext.g:2132:2: ( ( (a0_0= parse_dsltrans_ApplyClass ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==IDENTIFIER||LA24_0==DESCCOM||LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Dsltranstext.g:2133:3: ( (a0_0= parse_dsltrans_ApplyClass ) )
            	    {
            	    // Dsltranstext.g:2133:3: ( (a0_0= parse_dsltrans_ApplyClass ) )
            	    // Dsltranstext.g:2134:4: (a0_0= parse_dsltrans_ApplyClass )
            	    {
            	    // Dsltranstext.g:2134:4: (a0_0= parse_dsltrans_ApplyClass )
            	    // Dsltranstext.g:2135:5: a0_0= parse_dsltrans_ApplyClass
            	    {
            	    pushFollow(FOLLOW_parse_dsltrans_ApplyClass_in_parse_dsltrans_ApplyModel2204);
            	    a0_0=parse_dsltrans_ApplyClass();

            	    state._fsp--;
            	    if (state.failed) return element;
            	    if ( state.backtracking==0 ) {

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

            	    }

            	    if ( state.backtracking==0 ) {

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

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {

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
            // Dsltranstext.g:2183:2: ( (a1= 'subject' a2= 'to' ( ( (a3_0= parse_dsltrans_ApplyAssociation ) ) )* ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Dsltranstext.g:2184:3: (a1= 'subject' a2= 'to' ( ( (a3_0= parse_dsltrans_ApplyAssociation ) ) )* )
                    {
                    // Dsltranstext.g:2184:3: (a1= 'subject' a2= 'to' ( ( (a3_0= parse_dsltrans_ApplyAssociation ) ) )* )
                    // Dsltranstext.g:2185:4: a1= 'subject' a2= 'to' ( ( (a3_0= parse_dsltrans_ApplyAssociation ) ) )*
                    {
                    a1=(Token)match(input,32,FOLLOW_32_in_parse_dsltrans_ApplyModel2254); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createApplyModel();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_6_0_0_1_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_71, 83);
                      			
                    }
                    a2=(Token)match(input,33,FOLLOW_33_in_parse_dsltrans_ApplyModel2274); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createApplyModel();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_6_0_0_1_0_0_1, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_72, 84, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_73, 84, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 84);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 84);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 84);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 84);
                      			
                    }
                    // Dsltranstext.g:2218:4: ( ( (a3_0= parse_dsltrans_ApplyAssociation ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==IDENTIFIER||LA25_0==60) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // Dsltranstext.g:2219:5: ( (a3_0= parse_dsltrans_ApplyAssociation ) )
                    	    {
                    	    // Dsltranstext.g:2219:5: ( (a3_0= parse_dsltrans_ApplyAssociation ) )
                    	    // Dsltranstext.g:2220:6: (a3_0= parse_dsltrans_ApplyAssociation )
                    	    {
                    	    // Dsltranstext.g:2220:6: (a3_0= parse_dsltrans_ApplyAssociation )
                    	    // Dsltranstext.g:2221:7: a3_0= parse_dsltrans_ApplyAssociation
                    	    {
                    	    pushFollow(FOLLOW_parse_dsltrans_ApplyAssociation_in_parse_dsltrans_ApplyModel2315);
                    	    a3_0=parse_dsltrans_ApplyAssociation();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_72, 85, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_73, 85, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 85);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 85);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 85);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 85);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_72, 86, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_73, 86, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 86);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 86);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 86);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 86);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 87);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 87);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 87);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 87);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_dsltrans_ApplyModel_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_ApplyModel"


    // $ANTLR start "parse_dsltrans_AnyMatchClass"
    // Dsltranstext.g:2275:1: parse_dsltrans_AnyMatchClass returns [dsltrans.AnyMatchClass element = null] : ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? a3= 'any' ( ( ( (a4= 'strict' ) ) ) )? (a6= IDENTIFIER ) a7= '::' (a8= IDENTIFIER ) ( (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* a11= ')' ) )? ;
    public final dsltrans.AnyMatchClass parse_dsltrans_AnyMatchClass() throws RecognitionException {
        dsltrans.AnyMatchClass element =  null;
        int parse_dsltrans_AnyMatchClass_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a11=null;
        dsltrans.MatchAttribute a10_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Dsltranstext.g:2278:1: ( ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? a3= 'any' ( ( ( (a4= 'strict' ) ) ) )? (a6= IDENTIFIER ) a7= '::' (a8= IDENTIFIER ) ( (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* a11= ')' ) )? )
            // Dsltranstext.g:2279:2: ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? a3= 'any' ( ( ( (a4= 'strict' ) ) ) )? (a6= IDENTIFIER ) a7= '::' (a8= IDENTIFIER ) ( (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* a11= ')' ) )?
            {
            // Dsltranstext.g:2279:2: ( ( (a0= DESCCOM ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==DESCCOM) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Dsltranstext.g:2280:3: ( (a0= DESCCOM ) )
                    {
                    // Dsltranstext.g:2280:3: ( (a0= DESCCOM ) )
                    // Dsltranstext.g:2281:4: (a0= DESCCOM )
                    {
                    // Dsltranstext.g:2281:4: (a0= DESCCOM )
                    // Dsltranstext.g:2282:5: a0= DESCCOM
                    {
                    a0=(Token)match(input,DESCCOM,FOLLOW_DESCCOM_in_parse_dsltrans_AnyMatchClass2419); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 88);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 88);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_56, 89);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 89);
              	
            }
            // Dsltranstext.g:2331:2: ( ( (a1= IDENTIFIER ) a2= ':' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IDENTIFIER) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Dsltranstext.g:2332:3: ( (a1= IDENTIFIER ) a2= ':' )
                    {
                    // Dsltranstext.g:2332:3: ( (a1= IDENTIFIER ) a2= ':' )
                    // Dsltranstext.g:2333:4: (a1= IDENTIFIER ) a2= ':'
                    {
                    // Dsltranstext.g:2333:4: (a1= IDENTIFIER )
                    // Dsltranstext.g:2334:5: a1= IDENTIFIER
                    {
                    a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_AnyMatchClass2480); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_74, 90);
                      			
                    }
                    a2=(Token)match(input,18,FOLLOW_18_in_parse_dsltrans_AnyMatchClass2513); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 91);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_57, 92);
              	
            }
            a3=(Token)match(input,34,FOLLOW_34_in_parse_dsltrans_AnyMatchClass2546); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_75, 93);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_76, 93);
              	
            }
            // Dsltranstext.g:2420:2: ( ( ( (a4= 'strict' ) ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Dsltranstext.g:2421:3: ( ( (a4= 'strict' ) ) )
                    {
                    // Dsltranstext.g:2421:3: ( ( (a4= 'strict' ) ) )
                    // Dsltranstext.g:2422:4: ( (a4= 'strict' ) )
                    {
                    // Dsltranstext.g:2422:4: ( (a4= 'strict' ) )
                    // Dsltranstext.g:2423:5: (a4= 'strict' )
                    {
                    // Dsltranstext.g:2423:5: (a4= 'strict' )
                    // Dsltranstext.g:2424:6: a4= 'strict'
                    {
                    a4=(Token)match(input,35,FOLLOW_35_in_parse_dsltrans_AnyMatchClass2582); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_76, 94);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_76, 95);
              	
            }
            // Dsltranstext.g:2456:2: (a6= IDENTIFIER )
            // Dsltranstext.g:2457:3: a6= IDENTIFIER
            {
            a6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_AnyMatchClass2630); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_77, 96);
              	
            }
            a7=(Token)match(input,36,FOLLOW_36_in_parse_dsltrans_AnyMatchClass2651); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_78, 97);
              	
            }
            // Dsltranstext.g:2516:2: (a8= IDENTIFIER )
            // Dsltranstext.g:2517:3: a8= IDENTIFIER
            {
            a8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_AnyMatchClass2669); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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
            // Dsltranstext.g:2569:2: ( (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* a11= ')' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Dsltranstext.g:2570:3: (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* a11= ')' )
                    {
                    // Dsltranstext.g:2570:3: (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* a11= ')' )
                    // Dsltranstext.g:2571:4: a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* a11= ')'
                    {
                    a9=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_AnyMatchClass2699); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 99, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 99, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 99);
                      			
                    }
                    // Dsltranstext.g:2592:4: ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==IDENTIFIER) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Dsltranstext.g:2593:5: ( (a10_0= parse_dsltrans_MatchAttribute ) )
                    	    {
                    	    // Dsltranstext.g:2593:5: ( (a10_0= parse_dsltrans_MatchAttribute ) )
                    	    // Dsltranstext.g:2594:6: (a10_0= parse_dsltrans_MatchAttribute )
                    	    {
                    	    // Dsltranstext.g:2594:6: (a10_0= parse_dsltrans_MatchAttribute )
                    	    // Dsltranstext.g:2595:7: a10_0= parse_dsltrans_MatchAttribute
                    	    {
                    	    pushFollow(FOLLOW_parse_dsltrans_MatchAttribute_in_parse_dsltrans_AnyMatchClass2740);
                    	    a10_0=parse_dsltrans_MatchAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 100, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 100, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 100);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 101, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 101, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 101);
                      			
                    }
                    a11=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_AnyMatchClass2801); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_dsltrans_AnyMatchClass_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_AnyMatchClass"


    // $ANTLR start "parse_dsltrans_ExistsMatchClass"
    // Dsltranstext.g:2686:1: parse_dsltrans_ExistsMatchClass returns [dsltrans.ExistsMatchClass element = null] : ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? a3= 'existing' ( ( ( (a4= 'strict' ) ) ) )? (a6= IDENTIFIER ) a7= '::' (a8= IDENTIFIER ) ( (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) )* ) a11= ')' ) )? ;
    public final dsltrans.ExistsMatchClass parse_dsltrans_ExistsMatchClass() throws RecognitionException {
        dsltrans.ExistsMatchClass element =  null;
        int parse_dsltrans_ExistsMatchClass_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a11=null;
        dsltrans.MatchAttribute a10_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Dsltranstext.g:2689:1: ( ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? a3= 'existing' ( ( ( (a4= 'strict' ) ) ) )? (a6= IDENTIFIER ) a7= '::' (a8= IDENTIFIER ) ( (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) )* ) a11= ')' ) )? )
            // Dsltranstext.g:2690:2: ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? a3= 'existing' ( ( ( (a4= 'strict' ) ) ) )? (a6= IDENTIFIER ) a7= '::' (a8= IDENTIFIER ) ( (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) )* ) a11= ')' ) )?
            {
            // Dsltranstext.g:2690:2: ( ( (a0= DESCCOM ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==DESCCOM) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Dsltranstext.g:2691:3: ( (a0= DESCCOM ) )
                    {
                    // Dsltranstext.g:2691:3: ( (a0= DESCCOM ) )
                    // Dsltranstext.g:2692:4: (a0= DESCCOM )
                    {
                    // Dsltranstext.g:2692:4: (a0= DESCCOM )
                    // Dsltranstext.g:2693:5: a0= DESCCOM
                    {
                    a0=(Token)match(input,DESCCOM,FOLLOW_DESCCOM_in_parse_dsltrans_ExistsMatchClass2864); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 104);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 104);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_59, 105);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 105);
              	
            }
            // Dsltranstext.g:2742:2: ( ( (a1= IDENTIFIER ) a2= ':' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENTIFIER) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Dsltranstext.g:2743:3: ( (a1= IDENTIFIER ) a2= ':' )
                    {
                    // Dsltranstext.g:2743:3: ( (a1= IDENTIFIER ) a2= ':' )
                    // Dsltranstext.g:2744:4: (a1= IDENTIFIER ) a2= ':'
                    {
                    // Dsltranstext.g:2744:4: (a1= IDENTIFIER )
                    // Dsltranstext.g:2745:5: a1= IDENTIFIER
                    {
                    a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ExistsMatchClass2925); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_83, 106);
                      			
                    }
                    a2=(Token)match(input,18,FOLLOW_18_in_parse_dsltrans_ExistsMatchClass2958); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 107);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_60, 108);
              	
            }
            a3=(Token)match(input,37,FOLLOW_37_in_parse_dsltrans_ExistsMatchClass2991); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_84, 109);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_85, 109);
              	
            }
            // Dsltranstext.g:2831:2: ( ( ( (a4= 'strict' ) ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Dsltranstext.g:2832:3: ( ( (a4= 'strict' ) ) )
                    {
                    // Dsltranstext.g:2832:3: ( ( (a4= 'strict' ) ) )
                    // Dsltranstext.g:2833:4: ( (a4= 'strict' ) )
                    {
                    // Dsltranstext.g:2833:4: ( (a4= 'strict' ) )
                    // Dsltranstext.g:2834:5: (a4= 'strict' )
                    {
                    // Dsltranstext.g:2834:5: (a4= 'strict' )
                    // Dsltranstext.g:2835:6: a4= 'strict'
                    {
                    a4=(Token)match(input,35,FOLLOW_35_in_parse_dsltrans_ExistsMatchClass3027); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_85, 110);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_85, 111);
              	
            }
            // Dsltranstext.g:2867:2: (a6= IDENTIFIER )
            // Dsltranstext.g:2868:3: a6= IDENTIFIER
            {
            a6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ExistsMatchClass3075); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_86, 112);
              	
            }
            a7=(Token)match(input,36,FOLLOW_36_in_parse_dsltrans_ExistsMatchClass3096); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_87, 113);
              	
            }
            // Dsltranstext.g:2927:2: (a8= IDENTIFIER )
            // Dsltranstext.g:2928:3: a8= IDENTIFIER
            {
            a8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ExistsMatchClass3114); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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
            // Dsltranstext.g:2980:2: ( (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) )* ) a11= ')' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // Dsltranstext.g:2981:3: (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) )* ) a11= ')' )
                    {
                    // Dsltranstext.g:2981:3: (a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) )* ) a11= ')' )
                    // Dsltranstext.g:2982:4: a9= '(' ( ( (a10_0= parse_dsltrans_MatchAttribute ) )* ) a11= ')'
                    {
                    a9=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_ExistsMatchClass3144); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 115, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 115, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 115);
                      			
                    }
                    // Dsltranstext.g:3003:4: ( ( (a10_0= parse_dsltrans_MatchAttribute ) )* )
                    // Dsltranstext.g:3004:5: ( (a10_0= parse_dsltrans_MatchAttribute ) )*
                    {
                    // Dsltranstext.g:3004:5: ( (a10_0= parse_dsltrans_MatchAttribute ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==IDENTIFIER) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // Dsltranstext.g:3005:6: (a10_0= parse_dsltrans_MatchAttribute )
                    	    {
                    	    // Dsltranstext.g:3005:6: (a10_0= parse_dsltrans_MatchAttribute )
                    	    // Dsltranstext.g:3006:7: a10_0= parse_dsltrans_MatchAttribute
                    	    {
                    	    pushFollow(FOLLOW_parse_dsltrans_MatchAttribute_in_parse_dsltrans_ExistsMatchClass3185);
                    	    a10_0=parse_dsltrans_MatchAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 116, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 116, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 116);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 117);
                      			
                    }
                    a11=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_ExistsMatchClass3245); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_dsltrans_ExistsMatchClass_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_ExistsMatchClass"


    // $ANTLR start "parse_dsltrans_NegativeMatchClass"
    // Dsltranstext.g:3095:1: parse_dsltrans_NegativeMatchClass returns [dsltrans.NegativeMatchClass element = null] : ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? a3= 'not' ( ( ( (a4= 'strict' ) ) ) )? (a6= IDENTIFIER ) a7= '::' (a8= IDENTIFIER ) ( (a9= '(' ( ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* ) a11= ')' ) )? ;
    public final dsltrans.NegativeMatchClass parse_dsltrans_NegativeMatchClass() throws RecognitionException {
        dsltrans.NegativeMatchClass element =  null;
        int parse_dsltrans_NegativeMatchClass_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a11=null;
        dsltrans.MatchAttribute a10_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Dsltranstext.g:3098:1: ( ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? a3= 'not' ( ( ( (a4= 'strict' ) ) ) )? (a6= IDENTIFIER ) a7= '::' (a8= IDENTIFIER ) ( (a9= '(' ( ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* ) a11= ')' ) )? )
            // Dsltranstext.g:3099:2: ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? a3= 'not' ( ( ( (a4= 'strict' ) ) ) )? (a6= IDENTIFIER ) a7= '::' (a8= IDENTIFIER ) ( (a9= '(' ( ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* ) a11= ')' ) )?
            {
            // Dsltranstext.g:3099:2: ( ( (a0= DESCCOM ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==DESCCOM) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Dsltranstext.g:3100:3: ( (a0= DESCCOM ) )
                    {
                    // Dsltranstext.g:3100:3: ( (a0= DESCCOM ) )
                    // Dsltranstext.g:3101:4: (a0= DESCCOM )
                    {
                    // Dsltranstext.g:3101:4: (a0= DESCCOM )
                    // Dsltranstext.g:3102:5: a0= DESCCOM
                    {
                    a0=(Token)match(input,DESCCOM,FOLLOW_DESCCOM_in_parse_dsltrans_NegativeMatchClass3308); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 120);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 120);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_62, 121);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 121);
              	
            }
            // Dsltranstext.g:3151:2: ( ( (a1= IDENTIFIER ) a2= ':' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==IDENTIFIER) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // Dsltranstext.g:3152:3: ( (a1= IDENTIFIER ) a2= ':' )
                    {
                    // Dsltranstext.g:3152:3: ( (a1= IDENTIFIER ) a2= ':' )
                    // Dsltranstext.g:3153:4: (a1= IDENTIFIER ) a2= ':'
                    {
                    // Dsltranstext.g:3153:4: (a1= IDENTIFIER )
                    // Dsltranstext.g:3154:5: a1= IDENTIFIER
                    {
                    a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchClass3369); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_90, 122);
                      			
                    }
                    a2=(Token)match(input,18,FOLLOW_18_in_parse_dsltrans_NegativeMatchClass3402); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 123);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_63, 124);
              	
            }
            a3=(Token)match(input,38,FOLLOW_38_in_parse_dsltrans_NegativeMatchClass3435); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_91, 125);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_92, 125);
              	
            }
            // Dsltranstext.g:3240:2: ( ( ( (a4= 'strict' ) ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // Dsltranstext.g:3241:3: ( ( (a4= 'strict' ) ) )
                    {
                    // Dsltranstext.g:3241:3: ( ( (a4= 'strict' ) ) )
                    // Dsltranstext.g:3242:4: ( (a4= 'strict' ) )
                    {
                    // Dsltranstext.g:3242:4: ( (a4= 'strict' ) )
                    // Dsltranstext.g:3243:5: (a4= 'strict' )
                    {
                    // Dsltranstext.g:3243:5: (a4= 'strict' )
                    // Dsltranstext.g:3244:6: a4= 'strict'
                    {
                    a4=(Token)match(input,35,FOLLOW_35_in_parse_dsltrans_NegativeMatchClass3471); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_92, 126);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_92, 127);
              	
            }
            // Dsltranstext.g:3276:2: (a6= IDENTIFIER )
            // Dsltranstext.g:3277:3: a6= IDENTIFIER
            {
            a6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchClass3519); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_93, 128);
              	
            }
            a7=(Token)match(input,36,FOLLOW_36_in_parse_dsltrans_NegativeMatchClass3540); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_94, 129);
              	
            }
            // Dsltranstext.g:3336:2: (a8= IDENTIFIER )
            // Dsltranstext.g:3337:3: a8= IDENTIFIER
            {
            a8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchClass3558); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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
            // Dsltranstext.g:3389:2: ( (a9= '(' ( ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* ) a11= ')' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Dsltranstext.g:3390:3: (a9= '(' ( ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* ) a11= ')' )
                    {
                    // Dsltranstext.g:3390:3: (a9= '(' ( ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* ) a11= ')' )
                    // Dsltranstext.g:3391:4: a9= '(' ( ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* ) a11= ')'
                    {
                    a9=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_NegativeMatchClass3588); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 131, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 131, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 131);
                      			
                    }
                    // Dsltranstext.g:3412:4: ( ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )* )
                    // Dsltranstext.g:3413:5: ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )*
                    {
                    // Dsltranstext.g:3413:5: ( ( (a10_0= parse_dsltrans_MatchAttribute ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==IDENTIFIER) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // Dsltranstext.g:3414:6: ( (a10_0= parse_dsltrans_MatchAttribute ) )
                    	    {
                    	    // Dsltranstext.g:3414:6: ( (a10_0= parse_dsltrans_MatchAttribute ) )
                    	    // Dsltranstext.g:3415:7: (a10_0= parse_dsltrans_MatchAttribute )
                    	    {
                    	    // Dsltranstext.g:3415:7: (a10_0= parse_dsltrans_MatchAttribute )
                    	    // Dsltranstext.g:3416:8: a10_0= parse_dsltrans_MatchAttribute
                    	    {
                    	    pushFollow(FOLLOW_parse_dsltrans_MatchAttribute_in_parse_dsltrans_NegativeMatchClass3638);
                    	    a10_0=parse_dsltrans_MatchAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      							// expected elements (follow set)
                    	      							addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 132, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                    	      							addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 132, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                    	      							addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 132);
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      					// expected elements (follow set)
                      					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 133, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 133, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 133);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 134);
                      			
                    }
                    a11=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_NegativeMatchClass3722); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_dsltrans_NegativeMatchClass_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_NegativeMatchClass"


    // $ANTLR start "parse_dsltrans_ApplyClass"
    // Dsltranstext.g:3513:1: parse_dsltrans_ApplyClass returns [dsltrans.ApplyClass element = null] : ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? ( ( ( (a3= 'strict' ) ) ) )? (a5= IDENTIFIER ) a6= '::' (a7= IDENTIFIER ) ( (a8= '(' ( ( (a9_0= parse_dsltrans_ApplyAttribute ) ) )* a10= ')' ) )? ( (a11= 'in' a12= 'group' (a13= QUOTED_39_39_92 ) ) )? ;
    public final dsltrans.ApplyClass parse_dsltrans_ApplyClass() throws RecognitionException {
        dsltrans.ApplyClass element =  null;
        int parse_dsltrans_ApplyClass_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        dsltrans.ApplyAttribute a9_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Dsltranstext.g:3516:1: ( ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? ( ( ( (a3= 'strict' ) ) ) )? (a5= IDENTIFIER ) a6= '::' (a7= IDENTIFIER ) ( (a8= '(' ( ( (a9_0= parse_dsltrans_ApplyAttribute ) ) )* a10= ')' ) )? ( (a11= 'in' a12= 'group' (a13= QUOTED_39_39_92 ) ) )? )
            // Dsltranstext.g:3517:2: ( ( (a0= DESCCOM ) ) )? ( ( (a1= IDENTIFIER ) a2= ':' ) )? ( ( ( (a3= 'strict' ) ) ) )? (a5= IDENTIFIER ) a6= '::' (a7= IDENTIFIER ) ( (a8= '(' ( ( (a9_0= parse_dsltrans_ApplyAttribute ) ) )* a10= ')' ) )? ( (a11= 'in' a12= 'group' (a13= QUOTED_39_39_92 ) ) )?
            {
            // Dsltranstext.g:3517:2: ( ( (a0= DESCCOM ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==DESCCOM) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Dsltranstext.g:3518:3: ( (a0= DESCCOM ) )
                    {
                    // Dsltranstext.g:3518:3: ( (a0= DESCCOM ) )
                    // Dsltranstext.g:3519:4: (a0= DESCCOM )
                    {
                    // Dsltranstext.g:3519:4: (a0= DESCCOM )
                    // Dsltranstext.g:3520:5: a0= DESCCOM
                    {
                    a0=(Token)match(input,DESCCOM,FOLLOW_DESCCOM_in_parse_dsltrans_ApplyClass3785); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 137);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 137);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 137);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_39, 138);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 138);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 138);
              	
            }
            // Dsltranstext.g:3571:2: ( ( (a1= IDENTIFIER ) a2= ':' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==IDENTIFIER) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==18) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // Dsltranstext.g:3572:3: ( (a1= IDENTIFIER ) a2= ':' )
                    {
                    // Dsltranstext.g:3572:3: ( (a1= IDENTIFIER ) a2= ':' )
                    // Dsltranstext.g:3573:4: (a1= IDENTIFIER ) a2= ':'
                    {
                    // Dsltranstext.g:3573:4: (a1= IDENTIFIER )
                    // Dsltranstext.g:3574:5: a1= IDENTIFIER
                    {
                    a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyClass3846); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_97, 139);
                      			
                    }
                    a2=(Token)match(input,18,FOLLOW_18_in_parse_dsltrans_ApplyClass3879); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 140);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 140);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_40, 141);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 141);
              	
            }
            // Dsltranstext.g:3642:2: ( ( ( (a3= 'strict' ) ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==35) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Dsltranstext.g:3643:3: ( ( (a3= 'strict' ) ) )
                    {
                    // Dsltranstext.g:3643:3: ( ( (a3= 'strict' ) ) )
                    // Dsltranstext.g:3644:4: ( (a3= 'strict' ) )
                    {
                    // Dsltranstext.g:3644:4: ( (a3= 'strict' ) )
                    // Dsltranstext.g:3645:5: (a3= 'strict' )
                    {
                    // Dsltranstext.g:3645:5: (a3= 'strict' )
                    // Dsltranstext.g:3646:6: a3= 'strict'
                    {
                    a3=(Token)match(input,35,FOLLOW_35_in_parse_dsltrans_ApplyClass3934); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 142);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_41, 143);
              	
            }
            // Dsltranstext.g:3678:2: (a5= IDENTIFIER )
            // Dsltranstext.g:3679:3: a5= IDENTIFIER
            {
            a5=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyClass3982); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_98, 144);
              	
            }
            a6=(Token)match(input,36,FOLLOW_36_in_parse_dsltrans_ApplyClass4003); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_99, 145);
              	
            }
            // Dsltranstext.g:3738:2: (a7= IDENTIFIER )
            // Dsltranstext.g:3739:3: a7= IDENTIFIER
            {
            a7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyClass4021); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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
            // Dsltranstext.g:3789:2: ( (a8= '(' ( ( (a9_0= parse_dsltrans_ApplyAttribute ) ) )* a10= ')' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==14) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Dsltranstext.g:3790:3: (a8= '(' ( ( (a9_0= parse_dsltrans_ApplyAttribute ) ) )* a10= ')' )
                    {
                    // Dsltranstext.g:3790:3: (a8= '(' ( ( (a9_0= parse_dsltrans_ApplyAttribute ) ) )* a10= ')' )
                    // Dsltranstext.g:3791:4: a8= '(' ( ( (a9_0= parse_dsltrans_ApplyAttribute ) ) )* a10= ')'
                    {
                    a8=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_ApplyClass4051); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 147, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 147, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 147, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 147);
                      			
                    }
                    // Dsltranstext.g:3813:4: ( ( (a9_0= parse_dsltrans_ApplyAttribute ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==IDENTIFIER||LA45_0==46) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // Dsltranstext.g:3814:5: ( (a9_0= parse_dsltrans_ApplyAttribute ) )
                    	    {
                    	    // Dsltranstext.g:3814:5: ( (a9_0= parse_dsltrans_ApplyAttribute ) )
                    	    // Dsltranstext.g:3815:6: (a9_0= parse_dsltrans_ApplyAttribute )
                    	    {
                    	    // Dsltranstext.g:3815:6: (a9_0= parse_dsltrans_ApplyAttribute )
                    	    // Dsltranstext.g:3816:7: a9_0= parse_dsltrans_ApplyAttribute
                    	    {
                    	    pushFollow(FOLLOW_parse_dsltrans_ApplyAttribute_in_parse_dsltrans_ApplyClass4092);
                    	    a9_0=parse_dsltrans_ApplyAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

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

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 148, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 148, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 148, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                    	      						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 148);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 149, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 149, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 149, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 149);
                      			
                    }
                    a10=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_ApplyClass4153); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

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
            // Dsltranstext.g:3903:2: ( (a11= 'in' a12= 'group' (a13= QUOTED_39_39_92 ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==39) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Dsltranstext.g:3904:3: (a11= 'in' a12= 'group' (a13= QUOTED_39_39_92 ) )
                    {
                    // Dsltranstext.g:3904:3: (a11= 'in' a12= 'group' (a13= QUOTED_39_39_92 ) )
                    // Dsltranstext.g:3905:4: a11= 'in' a12= 'group' (a13= QUOTED_39_39_92 )
                    {
                    a11=(Token)match(input,39,FOLLOW_39_in_parse_dsltrans_ApplyClass4195); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_106, 152);
                      			
                    }
                    a12=(Token)match(input,21,FOLLOW_21_in_parse_dsltrans_ApplyClass4215); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_107, 153);
                      			
                    }
                    // Dsltranstext.g:3943:4: (a13= QUOTED_39_39_92 )
                    // Dsltranstext.g:3944:5: a13= QUOTED_39_39_92
                    {
                    a13=(Token)match(input,QUOTED_39_39_92,FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_ApplyClass4241); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

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

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_dsltrans_ApplyClass_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_ApplyClass"


    // $ANTLR start "parse_dsltrans_PositiveMatchAssociation"
    // Dsltranstext.g:4009:1: parse_dsltrans_PositiveMatchAssociation returns [dsltrans.PositiveMatchAssociation element = null] : (a0= IDENTIFIER ) a1= '--' a2= '(' (a3= IDENTIFIER ) a4= ')' a5= '->' (a6= IDENTIFIER ) ;
    public final dsltrans.PositiveMatchAssociation parse_dsltrans_PositiveMatchAssociation() throws RecognitionException {
        dsltrans.PositiveMatchAssociation element =  null;
        int parse_dsltrans_PositiveMatchAssociation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // Dsltranstext.g:4012:1: ( (a0= IDENTIFIER ) a1= '--' a2= '(' (a3= IDENTIFIER ) a4= ')' a5= '->' (a6= IDENTIFIER ) )
            // Dsltranstext.g:4013:2: (a0= IDENTIFIER ) a1= '--' a2= '(' (a3= IDENTIFIER ) a4= ')' a5= '->' (a6= IDENTIFIER )
            {
            // Dsltranstext.g:4013:2: (a0= IDENTIFIER )
            // Dsltranstext.g:4014:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveMatchAssociation4306); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_108, 156);
              	
            }
            a1=(Token)match(input,40,FOLLOW_40_in_parse_dsltrans_PositiveMatchAssociation4327); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_109, 157);
              	
            }
            a2=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_PositiveMatchAssociation4341); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_110, 158);
              	
            }
            // Dsltranstext.g:4081:2: (a3= IDENTIFIER )
            // Dsltranstext.g:4082:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveMatchAssociation4359); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_111, 159);
              	
            }
            a4=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_PositiveMatchAssociation4380); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_8, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_112, 160);
              	
            }
            a5=(Token)match(input,41,FOLLOW_41_in_parse_dsltrans_PositiveMatchAssociation4394); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveMatchAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_11_0_0_10, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_113, 161);
              	
            }
            // Dsltranstext.g:4145:2: (a6= IDENTIFIER )
            // Dsltranstext.g:4146:3: a6= IDENTIFIER
            {
            a6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveMatchAssociation4412); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 162, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 162, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 162, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 162, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 162, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 162);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 162);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_dsltrans_PositiveMatchAssociation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_PositiveMatchAssociation"


    // $ANTLR start "parse_dsltrans_NegativeMatchAssociation"
    // Dsltranstext.g:4193:1: parse_dsltrans_NegativeMatchAssociation returns [dsltrans.NegativeMatchAssociation element = null] : (a0= IDENTIFIER ) a1= '!-' a2= '(' (a3= IDENTIFIER ) a4= ')' a5= '->' (a6= IDENTIFIER ) ;
    public final dsltrans.NegativeMatchAssociation parse_dsltrans_NegativeMatchAssociation() throws RecognitionException {
        dsltrans.NegativeMatchAssociation element =  null;
        int parse_dsltrans_NegativeMatchAssociation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // Dsltranstext.g:4196:1: ( (a0= IDENTIFIER ) a1= '!-' a2= '(' (a3= IDENTIFIER ) a4= ')' a5= '->' (a6= IDENTIFIER ) )
            // Dsltranstext.g:4197:2: (a0= IDENTIFIER ) a1= '!-' a2= '(' (a3= IDENTIFIER ) a4= ')' a5= '->' (a6= IDENTIFIER )
            {
            // Dsltranstext.g:4197:2: (a0= IDENTIFIER )
            // Dsltranstext.g:4198:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchAssociation4452); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_114, 163);
              	
            }
            a1=(Token)match(input,42,FOLLOW_42_in_parse_dsltrans_NegativeMatchAssociation4473); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_115, 164);
              	
            }
            a2=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_NegativeMatchAssociation4487); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_116, 165);
              	
            }
            // Dsltranstext.g:4265:2: (a3= IDENTIFIER )
            // Dsltranstext.g:4266:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchAssociation4505); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_117, 166);
              	
            }
            a4=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_NegativeMatchAssociation4526); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_8, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_118, 167);
              	
            }
            a5=(Token)match(input,41,FOLLOW_41_in_parse_dsltrans_NegativeMatchAssociation4540); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeMatchAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_12_0_0_10, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_119, 168);
              	
            }
            // Dsltranstext.g:4329:2: (a6= IDENTIFIER )
            // Dsltranstext.g:4330:3: a6= IDENTIFIER
            {
            a6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchAssociation4558); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 169, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 169, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 169, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 169, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 169, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 169);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 169);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_dsltrans_NegativeMatchAssociation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_NegativeMatchAssociation"


    // $ANTLR start "parse_dsltrans_PositiveIndirectAssociation"
    // Dsltranstext.g:4377:1: parse_dsltrans_PositiveIndirectAssociation returns [dsltrans.PositiveIndirectAssociation element = null] : (a0= IDENTIFIER ) a1= '~~' ( (a2= '(' (a3= IDENTIFIER ) a4= ')' ) )? a5= '~>' (a6= IDENTIFIER ) ;
    public final dsltrans.PositiveIndirectAssociation parse_dsltrans_PositiveIndirectAssociation() throws RecognitionException {
        dsltrans.PositiveIndirectAssociation element =  null;
        int parse_dsltrans_PositiveIndirectAssociation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // Dsltranstext.g:4380:1: ( (a0= IDENTIFIER ) a1= '~~' ( (a2= '(' (a3= IDENTIFIER ) a4= ')' ) )? a5= '~>' (a6= IDENTIFIER ) )
            // Dsltranstext.g:4381:2: (a0= IDENTIFIER ) a1= '~~' ( (a2= '(' (a3= IDENTIFIER ) a4= ')' ) )? a5= '~>' (a6= IDENTIFIER )
            {
            // Dsltranstext.g:4381:2: (a0= IDENTIFIER )
            // Dsltranstext.g:4382:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveIndirectAssociation4598); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_120, 170);
              	
            }
            a1=(Token)match(input,43,FOLLOW_43_in_parse_dsltrans_PositiveIndirectAssociation4619); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_121, 171);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_122, 171);
              	
            }
            // Dsltranstext.g:4436:2: ( (a2= '(' (a3= IDENTIFIER ) a4= ')' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==14) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Dsltranstext.g:4437:3: (a2= '(' (a3= IDENTIFIER ) a4= ')' )
                    {
                    // Dsltranstext.g:4437:3: (a2= '(' (a3= IDENTIFIER ) a4= ')' )
                    // Dsltranstext.g:4438:4: a2= '(' (a3= IDENTIFIER ) a4= ')'
                    {
                    a2=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_PositiveIndirectAssociation4642); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_123, 172);
                      			
                    }
                    // Dsltranstext.g:4452:4: (a3= IDENTIFIER )
                    // Dsltranstext.g:4453:5: a3= IDENTIFIER
                    {
                    a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveIndirectAssociation4668); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_124, 173);
                      			
                    }
                    a4=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_PositiveIndirectAssociation4701); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_4_0_0_4, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_122, 174);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_122, 175);
              	
            }
            a5=(Token)match(input,44,FOLLOW_44_in_parse_dsltrans_PositiveIndirectAssociation4734); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveIndirectAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_13_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_125, 176);
              	
            }
            // Dsltranstext.g:4523:2: (a6= IDENTIFIER )
            // Dsltranstext.g:4524:3: a6= IDENTIFIER
            {
            a6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveIndirectAssociation4752); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 177, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 177, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 177, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 177, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 177, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 177);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 177);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_dsltrans_PositiveIndirectAssociation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_PositiveIndirectAssociation"


    // $ANTLR start "parse_dsltrans_NegativeIndirectAssociation"
    // Dsltranstext.g:4571:1: parse_dsltrans_NegativeIndirectAssociation returns [dsltrans.NegativeIndirectAssociation element = null] : (a0= IDENTIFIER ) a1= '!~' ( (a2= '(' (a3= IDENTIFIER ) a4= ')' ) )? a5= '~>' (a6= IDENTIFIER ) ;
    public final dsltrans.NegativeIndirectAssociation parse_dsltrans_NegativeIndirectAssociation() throws RecognitionException {
        dsltrans.NegativeIndirectAssociation element =  null;
        int parse_dsltrans_NegativeIndirectAssociation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // Dsltranstext.g:4574:1: ( (a0= IDENTIFIER ) a1= '!~' ( (a2= '(' (a3= IDENTIFIER ) a4= ')' ) )? a5= '~>' (a6= IDENTIFIER ) )
            // Dsltranstext.g:4575:2: (a0= IDENTIFIER ) a1= '!~' ( (a2= '(' (a3= IDENTIFIER ) a4= ')' ) )? a5= '~>' (a6= IDENTIFIER )
            {
            // Dsltranstext.g:4575:2: (a0= IDENTIFIER )
            // Dsltranstext.g:4576:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeIndirectAssociation4792); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_126, 178);
              	
            }
            a1=(Token)match(input,45,FOLLOW_45_in_parse_dsltrans_NegativeIndirectAssociation4813); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_127, 179);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_128, 179);
              	
            }
            // Dsltranstext.g:4630:2: ( (a2= '(' (a3= IDENTIFIER ) a4= ')' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==14) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Dsltranstext.g:4631:3: (a2= '(' (a3= IDENTIFIER ) a4= ')' )
                    {
                    // Dsltranstext.g:4631:3: (a2= '(' (a3= IDENTIFIER ) a4= ')' )
                    // Dsltranstext.g:4632:4: a2= '(' (a3= IDENTIFIER ) a4= ')'
                    {
                    a2=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_NegativeIndirectAssociation4836); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_4_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_129, 180);
                      			
                    }
                    // Dsltranstext.g:4646:4: (a3= IDENTIFIER )
                    // Dsltranstext.g:4647:5: a3= IDENTIFIER
                    {
                    a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeIndirectAssociation4862); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_130, 181);
                      			
                    }
                    a4=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_NegativeIndirectAssociation4895); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_4_0_0_4, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_128, 182);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_128, 183);
              	
            }
            a5=(Token)match(input,44,FOLLOW_44_in_parse_dsltrans_NegativeIndirectAssociation4928); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeIndirectAssociation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_14_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_131, 184);
              	
            }
            // Dsltranstext.g:4717:2: (a6= IDENTIFIER )
            // Dsltranstext.g:4718:3: a6= IDENTIFIER
            {
            a6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeIndirectAssociation4946); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 185, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 185, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 185, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 185, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 185, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 185);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 185);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_dsltrans_NegativeIndirectAssociation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_NegativeIndirectAssociation"


    // $ANTLR start "parse_dsltrans_ApplyAssociation"
    // Dsltranstext.g:4765:1: parse_dsltrans_ApplyAssociation returns [dsltrans.ApplyAssociation element = null] : ( (a0= IDENTIFIER ) a1= '--' a2= '(' (a3= IDENTIFIER ) a4= ')' a5= '->' (a6= IDENTIFIER ) | c0= parse_dsltrans_ApplyMayBeSameRelation );
    public final dsltrans.ApplyAssociation parse_dsltrans_ApplyAssociation() throws RecognitionException {
        dsltrans.ApplyAssociation element =  null;
        int parse_dsltrans_ApplyAssociation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        dsltrans.ApplyMayBeSameRelation c0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // Dsltranstext.g:4768:1: ( (a0= IDENTIFIER ) a1= '--' a2= '(' (a3= IDENTIFIER ) a4= ')' a5= '->' (a6= IDENTIFIER ) | c0= parse_dsltrans_ApplyMayBeSameRelation )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==IDENTIFIER) ) {
                alt50=1;
            }
            else if ( (LA50_0==60) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // Dsltranstext.g:4769:2: (a0= IDENTIFIER ) a1= '--' a2= '(' (a3= IDENTIFIER ) a4= ')' a5= '->' (a6= IDENTIFIER )
                    {
                    // Dsltranstext.g:4769:2: (a0= IDENTIFIER )
                    // Dsltranstext.g:4770:3: a0= IDENTIFIER
                    {
                    a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyAssociation4986); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_132, 186);
                      	
                    }
                    a1=(Token)match(input,40,FOLLOW_40_in_parse_dsltrans_ApplyAssociation5007); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_1, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_133, 187);
                      	
                    }
                    a2=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_ApplyAssociation5021); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_3, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_134, 188);
                      	
                    }
                    // Dsltranstext.g:4837:2: (a3= IDENTIFIER )
                    // Dsltranstext.g:4838:3: a3= IDENTIFIER
                    {
                    a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyAssociation5039); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_135, 189);
                      	
                    }
                    a4=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_ApplyAssociation5060); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_7, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_136, 190);
                      	
                    }
                    a5=(Token)match(input,41,FOLLOW_41_in_parse_dsltrans_ApplyAssociation5074); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = dsltrans.DsltransFactory.eINSTANCE.createApplyAssociation();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_15_0_0_9, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_137, 191);
                      	
                    }
                    // Dsltranstext.g:4901:2: (a6= IDENTIFIER )
                    // Dsltranstext.g:4902:3: a6= IDENTIFIER
                    {
                    a6=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyAssociation5092); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_72, 192, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_73, 192, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 192);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 192);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 192);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 192);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:4948:2: c0= parse_dsltrans_ApplyMayBeSameRelation
                    {
                    pushFollow(FOLLOW_parse_dsltrans_ApplyMayBeSameRelation_in_parse_dsltrans_ApplyAssociation5118);
                    c0=parse_dsltrans_ApplyMayBeSameRelation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 17, parse_dsltrans_ApplyAssociation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_ApplyAssociation"


    // $ANTLR start "parse_dsltrans_MatchAttribute"
    // Dsltranstext.g:4952:1: parse_dsltrans_MatchAttribute returns [dsltrans.MatchAttribute element = null] : ( ( (a0= IDENTIFIER ) a1= ':' ) )? (a2= IDENTIFIER ) ( (a3= '=' (a4_0= parse_dsltrans_MatchAttributeValue ) ) )? ;
    public final dsltrans.MatchAttribute parse_dsltrans_MatchAttribute() throws RecognitionException {
        dsltrans.MatchAttribute element =  null;
        int parse_dsltrans_MatchAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        dsltrans.MatchAttributeValue a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // Dsltranstext.g:4955:1: ( ( ( (a0= IDENTIFIER ) a1= ':' ) )? (a2= IDENTIFIER ) ( (a3= '=' (a4_0= parse_dsltrans_MatchAttributeValue ) ) )? )
            // Dsltranstext.g:4956:2: ( ( (a0= IDENTIFIER ) a1= ':' ) )? (a2= IDENTIFIER ) ( (a3= '=' (a4_0= parse_dsltrans_MatchAttributeValue ) ) )?
            {
            // Dsltranstext.g:4956:2: ( ( (a0= IDENTIFIER ) a1= ':' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==IDENTIFIER) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==18) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // Dsltranstext.g:4957:3: ( (a0= IDENTIFIER ) a1= ':' )
                    {
                    // Dsltranstext.g:4957:3: ( (a0= IDENTIFIER ) a1= ':' )
                    // Dsltranstext.g:4958:4: (a0= IDENTIFIER ) a1= ':'
                    {
                    // Dsltranstext.g:4958:4: (a0= IDENTIFIER )
                    // Dsltranstext.g:4959:5: a0= IDENTIFIER
                    {
                    a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_MatchAttribute5158); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_138, 193);
                      			
                    }
                    a1=(Token)match(input,18,FOLLOW_18_in_parse_dsltrans_MatchAttribute5191); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_16_0_0_0_0_0_2, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 194);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 195);
              	
            }
            // Dsltranstext.g:5015:2: (a2= IDENTIFIER )
            // Dsltranstext.g:5016:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_MatchAttribute5228); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_139, 196);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 196, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 196, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 196);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 196);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 196);
              	
            }
            // Dsltranstext.g:5056:2: ( (a3= '=' (a4_0= parse_dsltrans_MatchAttributeValue ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==11) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Dsltranstext.g:5057:3: (a3= '=' (a4_0= parse_dsltrans_MatchAttributeValue ) )
                    {
                    // Dsltranstext.g:5057:3: (a3= '=' (a4_0= parse_dsltrans_MatchAttributeValue ) )
                    // Dsltranstext.g:5058:4: a3= '=' (a4_0= parse_dsltrans_MatchAttributeValue )
                    {
                    a3=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_MatchAttribute5258); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = dsltrans.DsltransFactory.eINSTANCE.createMatchAttribute();
                      					incompleteObjects.push(element);
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_16_0_0_2_0_0_0, null, true);
                      				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_140, 197, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_14);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_141, 197, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_14);
                      			
                    }
                    // Dsltranstext.g:5073:4: (a4_0= parse_dsltrans_MatchAttributeValue )
                    // Dsltranstext.g:5074:5: a4_0= parse_dsltrans_MatchAttributeValue
                    {
                    pushFollow(FOLLOW_parse_dsltrans_MatchAttributeValue_in_parse_dsltrans_MatchAttribute5284);
                    a4_0=parse_dsltrans_MatchAttributeValue();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 198, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 198, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 198);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 198);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 198);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 199, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 199, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 199);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 199);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 199);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_dsltrans_MatchAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_MatchAttribute"


    // $ANTLR start "parse_dsltrans_ApplyAttribute"
    // Dsltranstext.g:5116:1: parse_dsltrans_ApplyAttribute returns [dsltrans.ApplyAttribute element = null] : ( ( ( ( (a0= IDENTIFIER ) a1= ':' ) )? ( (a2= IDENTIFIER ) ( (a3= '=' (a4_0= parse_dsltrans_Term ) ) )? ) ) | (a5= 'self' a6= '=' (a7_0= parse_dsltrans_Term ) ) );
    public final dsltrans.ApplyAttribute parse_dsltrans_ApplyAttribute() throws RecognitionException {
        dsltrans.ApplyAttribute element =  null;
        int parse_dsltrans_ApplyAttribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        Token a6=null;
        dsltrans.Term a4_0 = null;

        dsltrans.Term a7_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // Dsltranstext.g:5119:1: ( ( ( ( (a0= IDENTIFIER ) a1= ':' ) )? ( (a2= IDENTIFIER ) ( (a3= '=' (a4_0= parse_dsltrans_Term ) ) )? ) ) | (a5= 'self' a6= '=' (a7_0= parse_dsltrans_Term ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IDENTIFIER) ) {
                alt55=1;
            }
            else if ( (LA55_0==46) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // Dsltranstext.g:5120:2: ( ( ( (a0= IDENTIFIER ) a1= ':' ) )? ( (a2= IDENTIFIER ) ( (a3= '=' (a4_0= parse_dsltrans_Term ) ) )? ) )
                    {
                    // Dsltranstext.g:5120:2: ( ( ( (a0= IDENTIFIER ) a1= ':' ) )? ( (a2= IDENTIFIER ) ( (a3= '=' (a4_0= parse_dsltrans_Term ) ) )? ) )
                    // Dsltranstext.g:5121:3: ( ( (a0= IDENTIFIER ) a1= ':' ) )? ( (a2= IDENTIFIER ) ( (a3= '=' (a4_0= parse_dsltrans_Term ) ) )? )
                    {
                    // Dsltranstext.g:5121:3: ( ( (a0= IDENTIFIER ) a1= ':' ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==IDENTIFIER) ) {
                        int LA53_1 = input.LA(2);

                        if ( (LA53_1==18) ) {
                            alt53=1;
                        }
                    }
                    switch (alt53) {
                        case 1 :
                            // Dsltranstext.g:5122:4: ( (a0= IDENTIFIER ) a1= ':' )
                            {
                            // Dsltranstext.g:5122:4: ( (a0= IDENTIFIER ) a1= ':' )
                            // Dsltranstext.g:5123:5: (a0= IDENTIFIER ) a1= ':'
                            {
                            // Dsltranstext.g:5123:5: (a0= IDENTIFIER )
                            // Dsltranstext.g:5124:6: a0= IDENTIFIER
                            {
                            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyAttribute5362); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

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

                            }

                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_142, 200);
                              				
                            }
                            a1=(Token)match(input,18,FOLLOW_18_in_parse_dsltrans_ApplyAttribute5401); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (element == null) {
                              						element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
                              						incompleteObjects.push(element);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_0_0_0_0_0_0_0_2, null, true);
                              					copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					// expected elements (follow set)
                              					addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 201);
                              				
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 202);
                      		
                    }
                    // Dsltranstext.g:5180:3: ( (a2= IDENTIFIER ) ( (a3= '=' (a4_0= parse_dsltrans_Term ) ) )? )
                    // Dsltranstext.g:5181:4: (a2= IDENTIFIER ) ( (a3= '=' (a4_0= parse_dsltrans_Term ) ) )?
                    {
                    // Dsltranstext.g:5181:4: (a2= IDENTIFIER )
                    // Dsltranstext.g:5182:5: a2= IDENTIFIER
                    {
                    a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyAttribute5453); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_143, 203);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 203, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 203, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 203, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 203);
                      			
                    }
                    // Dsltranstext.g:5221:4: ( (a3= '=' (a4_0= parse_dsltrans_Term ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==11) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // Dsltranstext.g:5222:5: (a3= '=' (a4_0= parse_dsltrans_Term ) )
                            {
                            // Dsltranstext.g:5222:5: (a3= '=' (a4_0= parse_dsltrans_Term ) )
                            // Dsltranstext.g:5223:6: a3= '=' (a4_0= parse_dsltrans_Term )
                            {
                            a3=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_ApplyAttribute5499); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              						if (element == null) {
                              							element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
                              							incompleteObjects.push(element);
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_0_0_0_0_1_0_0_1_0_0_0, null, true);
                              						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_140, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_144, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_145, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_146, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_147, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_148, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_149, 204, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                              					
                            }
                            // Dsltranstext.g:5243:6: (a4_0= parse_dsltrans_Term )
                            // Dsltranstext.g:5244:7: a4_0= parse_dsltrans_Term
                            {
                            pushFollow(FOLLOW_parse_dsltrans_Term_in_parse_dsltrans_ApplyAttribute5533);
                            a4_0=parse_dsltrans_Term();

                            state._fsp--;
                            if (state.failed) return element;
                            if ( state.backtracking==0 ) {

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

                            }

                            if ( state.backtracking==0 ) {

                              						// expected elements (follow set)
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 205, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 205, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 205, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                              						addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 205);
                              					
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 206, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 206, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 206, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      				addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 206);
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 207, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 207, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 207, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 207);
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 208, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 208, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 208, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 208);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:5301:4: (a5= 'self' a6= '=' (a7_0= parse_dsltrans_Term ) )
                    {
                    // Dsltranstext.g:5301:4: (a5= 'self' a6= '=' (a7_0= parse_dsltrans_Term ) )
                    // Dsltranstext.g:5302:3: a5= 'self' a6= '=' (a7_0= parse_dsltrans_Term )
                    {
                    a5=(Token)match(input,46,FOLLOW_46_in_parse_dsltrans_ApplyAttribute5619); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
                      				incompleteObjects.push(element);
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_1_0_0_0_0, null, true);
                      			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_150, 209);
                      		
                    }
                    a6=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_ApplyAttribute5636); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = dsltrans.DsltransFactory.eINSTANCE.createApplyAttribute();
                      				incompleteObjects.push(element);
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_17_0_1_0_0_0_2, null, true);
                      			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_140, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_144, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_145, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_146, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_147, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_148, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_149, 210, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_15);
                      		
                    }
                    // Dsltranstext.g:5336:3: (a7_0= parse_dsltrans_Term )
                    // Dsltranstext.g:5337:4: a7_0= parse_dsltrans_Term
                    {
                    pushFollow(FOLLOW_parse_dsltrans_Term_in_parse_dsltrans_ApplyAttribute5658);
                    a7_0=parse_dsltrans_Term();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 211, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 211, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 211, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      			addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 211);
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 212, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 212, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 212, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 212);
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 19, parse_dsltrans_ApplyAttribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_ApplyAttribute"


    // $ANTLR start "parse_dsltrans_PositiveBackwardRestriction"
    // Dsltranstext.g:5376:1: parse_dsltrans_PositiveBackwardRestriction returns [dsltrans.PositiveBackwardRestriction element = null] : (a0= IDENTIFIER ) a1= 'derived' a2= 'from' (a3= IDENTIFIER ) ;
    public final dsltrans.PositiveBackwardRestriction parse_dsltrans_PositiveBackwardRestriction() throws RecognitionException {
        dsltrans.PositiveBackwardRestriction element =  null;
        int parse_dsltrans_PositiveBackwardRestriction_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // Dsltranstext.g:5379:1: ( (a0= IDENTIFIER ) a1= 'derived' a2= 'from' (a3= IDENTIFIER ) )
            // Dsltranstext.g:5380:2: (a0= IDENTIFIER ) a1= 'derived' a2= 'from' (a3= IDENTIFIER )
            {
            // Dsltranstext.g:5380:2: (a0= IDENTIFIER )
            // Dsltranstext.g:5381:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveBackwardRestriction5707); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_151, 213);
              	
            }
            a1=(Token)match(input,47,FOLLOW_47_in_parse_dsltrans_PositiveBackwardRestriction5728); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveBackwardRestriction();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_18_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_152, 214);
              	
            }
            a2=(Token)match(input,48,FOLLOW_48_in_parse_dsltrans_PositiveBackwardRestriction5742); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createPositiveBackwardRestriction();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_18_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_153, 215);
              	
            }
            // Dsltranstext.g:5448:2: (a3= IDENTIFIER )
            // Dsltranstext.g:5449:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveBackwardRestriction5760); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_49, 216, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_50, 216, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 216);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 216);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_dsltrans_PositiveBackwardRestriction_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_PositiveBackwardRestriction"


    // $ANTLR start "parse_dsltrans_NegativeBackwardRestriction"
    // Dsltranstext.g:5493:1: parse_dsltrans_NegativeBackwardRestriction returns [dsltrans.NegativeBackwardRestriction element = null] : (a0= IDENTIFIER ) a1= 'not' a2= 'derived' a3= 'from' (a4= IDENTIFIER ) ;
    public final dsltrans.NegativeBackwardRestriction parse_dsltrans_NegativeBackwardRestriction() throws RecognitionException {
        dsltrans.NegativeBackwardRestriction element =  null;
        int parse_dsltrans_NegativeBackwardRestriction_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // Dsltranstext.g:5496:1: ( (a0= IDENTIFIER ) a1= 'not' a2= 'derived' a3= 'from' (a4= IDENTIFIER ) )
            // Dsltranstext.g:5497:2: (a0= IDENTIFIER ) a1= 'not' a2= 'derived' a3= 'from' (a4= IDENTIFIER )
            {
            // Dsltranstext.g:5497:2: (a0= IDENTIFIER )
            // Dsltranstext.g:5498:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeBackwardRestriction5800); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_154, 217);
              	
            }
            a1=(Token)match(input,38,FOLLOW_38_in_parse_dsltrans_NegativeBackwardRestriction5821); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeBackwardRestriction();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_19_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_155, 218);
              	
            }
            a2=(Token)match(input,47,FOLLOW_47_in_parse_dsltrans_NegativeBackwardRestriction5835); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeBackwardRestriction();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_19_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_156, 219);
              	
            }
            a3=(Token)match(input,48,FOLLOW_48_in_parse_dsltrans_NegativeBackwardRestriction5849); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createNegativeBackwardRestriction();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_19_0_0_5, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_157, 220);
              	
            }
            // Dsltranstext.g:5579:2: (a4= IDENTIFIER )
            // Dsltranstext.g:5580:3: a4= IDENTIFIER
            {
            a4=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeBackwardRestriction5867); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_49, 221, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_50, 221, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_7);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 221);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 221);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_dsltrans_NegativeBackwardRestriction_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_NegativeBackwardRestriction"


    // $ANTLR start "parse_dsltrans_Import"
    // Dsltranstext.g:5624:1: parse_dsltrans_Import returns [dsltrans.Import element = null] : a0= '(' a1= 'target' a2= '=' (a3= IDENTIFIER ) a4= ',' a5= 'source' a6= '=' (a7= IDENTIFIER ) a8= ')' ;
    public final dsltrans.Import parse_dsltrans_Import() throws RecognitionException {
        dsltrans.Import element =  null;
        int parse_dsltrans_Import_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // Dsltranstext.g:5627:1: (a0= '(' a1= 'target' a2= '=' (a3= IDENTIFIER ) a4= ',' a5= 'source' a6= '=' (a7= IDENTIFIER ) a8= ')' )
            // Dsltranstext.g:5628:2: a0= '(' a1= 'target' a2= '=' (a3= IDENTIFIER ) a4= ',' a5= 'source' a6= '=' (a7= IDENTIFIER ) a8= ')'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_Import5903); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_158, 222);
              	
            }
            a1=(Token)match(input,49,FOLLOW_49_in_parse_dsltrans_Import5917); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_159, 223);
              	
            }
            a2=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_Import5931); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_160, 224);
              	
            }
            // Dsltranstext.g:5670:2: (a3= IDENTIFIER )
            // Dsltranstext.g:5671:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_Import5949); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_161, 225);
              	
            }
            a4=(Token)match(input,50,FOLLOW_50_in_parse_dsltrans_Import5970); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_7, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_162, 226);
              	
            }
            a5=(Token)match(input,30,FOLLOW_30_in_parse_dsltrans_Import5984); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_9, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_163, 227);
              	
            }
            a6=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_Import5998); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_11, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_164, 228);
              	
            }
            // Dsltranstext.g:5752:2: (a7= IDENTIFIER )
            // Dsltranstext.g:5753:3: a7= IDENTIFIER
            {
            a7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_Import6016); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_165, 229);
              	
            }
            a8=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_Import6037); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createImport();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_20_0_0_14, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a8, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_51, 230, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_8);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 230);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_dsltrans_Import_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_Import"


    // $ANTLR start "parse_dsltrans_Atom"
    // Dsltranstext.g:5809:1: parse_dsltrans_Atom returns [dsltrans.Atom element = null] : (a0= QUOTED_39_39_92 ) ;
    public final dsltrans.Atom parse_dsltrans_Atom() throws RecognitionException {
        dsltrans.Atom element =  null;
        int parse_dsltrans_Atom_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // Dsltranstext.g:5812:1: ( (a0= QUOTED_39_39_92 ) )
            // Dsltranstext.g:5813:2: (a0= QUOTED_39_39_92 )
            {
            // Dsltranstext.g:5813:2: (a0= QUOTED_39_39_92 )
            // Dsltranstext.g:5814:3: a0= QUOTED_39_39_92
            {
            a0=(Token)match(input,QUOTED_39_39_92,FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Atom6070); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parse_dsltrans_Atom_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_Atom"


    // $ANTLR start "parse_dsltrans_AttributeRef"
    // Dsltranstext.g:5860:1: parse_dsltrans_AttributeRef returns [dsltrans.AttributeRef element = null] : (a0= 'sameAs' a1= '(' (a2= IDENTIFIER ) a3= ')' | c0= parse_dsltrans_TypeOf );
    public final dsltrans.AttributeRef parse_dsltrans_AttributeRef() throws RecognitionException {
        dsltrans.AttributeRef element =  null;
        int parse_dsltrans_AttributeRef_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        dsltrans.TypeOf c0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // Dsltranstext.g:5863:1: (a0= 'sameAs' a1= '(' (a2= IDENTIFIER ) a3= ')' | c0= parse_dsltrans_TypeOf )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==51) ) {
                alt56=1;
            }
            else if ( (LA56_0==53) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // Dsltranstext.g:5864:2: a0= 'sameAs' a1= '(' (a2= IDENTIFIER ) a3= ')'
                    {
                    a0=(Token)match(input,51,FOLLOW_51_in_parse_dsltrans_AttributeRef6106); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = dsltrans.DsltransFactory.eINSTANCE.createAttributeRef();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_22_0_0_0, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_167, 232);
                      	
                    }
                    a1=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_AttributeRef6120); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = dsltrans.DsltransFactory.eINSTANCE.createAttributeRef();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_22_0_0_2, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_168, 233);
                      	
                    }
                    // Dsltranstext.g:5892:2: (a2= IDENTIFIER )
                    // Dsltranstext.g:5893:3: a2= IDENTIFIER
                    {
                    a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_AttributeRef6138); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_169, 234);
                      	
                    }
                    a3=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_AttributeRef6159); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      		if (element == null) {
                      			element = dsltrans.DsltransFactory.eINSTANCE.createAttributeRef();
                      			incompleteObjects.push(element);
                      		}
                      		collectHiddenTokens(element);
                      		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_22_0_0_4, null, true);
                      		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
                      	
                    }
                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 235, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 235, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 235, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 235);
                      		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 235);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:5952:2: c0= parse_dsltrans_TypeOf
                    {
                    pushFollow(FOLLOW_parse_dsltrans_TypeOf_in_parse_dsltrans_AttributeRef6178);
                    c0=parse_dsltrans_TypeOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 24, parse_dsltrans_AttributeRef_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_AttributeRef"


    // $ANTLR start "parse_dsltrans_ClassRef"
    // Dsltranstext.g:5956:1: parse_dsltrans_ClassRef returns [dsltrans.ClassRef element = null] : a0= 'sameAs' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final dsltrans.ClassRef parse_dsltrans_ClassRef() throws RecognitionException {
        dsltrans.ClassRef element =  null;
        int parse_dsltrans_ClassRef_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // Dsltranstext.g:5959:1: (a0= 'sameAs' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Dsltranstext.g:5960:2: a0= 'sameAs' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,51,FOLLOW_51_in_parse_dsltrans_ClassRef6203); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createClassRef();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_23_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_170, 236);
              	
            }
            a1=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_ClassRef6217); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createClassRef();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_23_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_171, 237);
              	
            }
            // Dsltranstext.g:5988:2: (a2= IDENTIFIER )
            // Dsltranstext.g:5989:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ClassRef6235); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_172, 238);
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_ClassRef6256); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createClassRef();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_23_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 239, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 239, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 239, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 239);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 239);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, parse_dsltrans_ClassRef_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_ClassRef"


    // $ANTLR start "parse_dsltrans_Concat"
    // Dsltranstext.g:6048:1: parse_dsltrans_Concat returns [dsltrans.Concat element = null] : a0= 'concat' a1= '(' (a2_0= parse_dsltrans_Term ) a3= 'with' (a4_0= parse_dsltrans_Term ) a5= ')' ;
    public final dsltrans.Concat parse_dsltrans_Concat() throws RecognitionException {
        dsltrans.Concat element =  null;
        int parse_dsltrans_Concat_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        Token a5=null;
        dsltrans.Term a2_0 = null;

        dsltrans.Term a4_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // Dsltranstext.g:6051:1: (a0= 'concat' a1= '(' (a2_0= parse_dsltrans_Term ) a3= 'with' (a4_0= parse_dsltrans_Term ) a5= ')' )
            // Dsltranstext.g:6052:2: a0= 'concat' a1= '(' (a2_0= parse_dsltrans_Term ) a3= 'with' (a4_0= parse_dsltrans_Term ) a5= ')'
            {
            a0=(Token)match(input,52,FOLLOW_52_in_parse_dsltrans_Concat6285); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createConcat();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_24_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_173, 240);
              	
            }
            a1=(Token)match(input,14,FOLLOW_14_in_parse_dsltrans_Concat6299); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createConcat();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_24_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_140, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_144, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_145, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_146, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_147, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_148, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_149, 241, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_16);
              	
            }
            // Dsltranstext.g:6086:2: (a2_0= parse_dsltrans_Term )
            // Dsltranstext.g:6087:3: a2_0= parse_dsltrans_Term
            {
            pushFollow(FOLLOW_parse_dsltrans_Term_in_parse_dsltrans_Concat6317);
            a2_0=parse_dsltrans_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 242);
              	
            }
            a3=(Token)match(input,31,FOLLOW_31_in_parse_dsltrans_Concat6335); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createConcat();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_24_0_0_4, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_140, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_144, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_145, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_146, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_147, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_148, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_149, 243, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_17);
              	
            }
            // Dsltranstext.g:6132:2: (a4_0= parse_dsltrans_Term )
            // Dsltranstext.g:6133:3: a4_0= parse_dsltrans_Term
            {
            pushFollow(FOLLOW_parse_dsltrans_Term_in_parse_dsltrans_Concat6353);
            a4_0=parse_dsltrans_Term();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_174, 244);
              	
            }
            a5=(Token)match(input,16,FOLLOW_16_in_parse_dsltrans_Concat6371); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createConcat();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_24_0_0_6, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 245, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 245, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 245, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 245);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 245);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, parse_dsltrans_Concat_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_Concat"


    // $ANTLR start "parse_dsltrans_TypeOf"
    // Dsltranstext.g:6178:1: parse_dsltrans_TypeOf returns [dsltrans.TypeOf element = null] : a0= 'typeOf' (a1= IDENTIFIER ) ;
    public final dsltrans.TypeOf parse_dsltrans_TypeOf() throws RecognitionException {
        dsltrans.TypeOf element =  null;
        int parse_dsltrans_TypeOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // Dsltranstext.g:6181:1: (a0= 'typeOf' (a1= IDENTIFIER ) )
            // Dsltranstext.g:6182:2: a0= 'typeOf' (a1= IDENTIFIER )
            {
            a0=(Token)match(input,53,FOLLOW_53_in_parse_dsltrans_TypeOf6400); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createTypeOf();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_25_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_175, 246);
              	
            }
            // Dsltranstext.g:6196:2: (a1= IDENTIFIER )
            // Dsltranstext.g:6197:3: a1= IDENTIFIER
            {
            a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_TypeOf6418); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 247, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 247, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 247, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 247);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 247);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, parse_dsltrans_TypeOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_TypeOf"


    // $ANTLR start "parse_dsltrans_Wildcard"
    // Dsltranstext.g:6242:1: parse_dsltrans_Wildcard returns [dsltrans.Wildcard element = null] : a0= 'WILDCARD' ;
    public final dsltrans.Wildcard parse_dsltrans_Wildcard() throws RecognitionException {
        dsltrans.Wildcard element =  null;
        int parse_dsltrans_Wildcard_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // Dsltranstext.g:6245:1: (a0= 'WILDCARD' )
            // Dsltranstext.g:6246:2: a0= 'WILDCARD'
            {
            a0=(Token)match(input,54,FOLLOW_54_in_parse_dsltrans_Wildcard6454); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createWildcard();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_26_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 248, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 248, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 248, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 248);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 248);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, parse_dsltrans_Wildcard_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_Wildcard"


    // $ANTLR start "parse_dsltrans_isNull"
    // Dsltranstext.g:6266:1: parse_dsltrans_isNull returns [dsltrans.isNull element = null] : a0= 'isNull' a1= '=' ( (a2= 'true' | a3= 'false' ) ) ;
    public final dsltrans.isNull parse_dsltrans_isNull() throws RecognitionException {
        dsltrans.isNull element =  null;
        int parse_dsltrans_isNull_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // Dsltranstext.g:6269:1: (a0= 'isNull' a1= '=' ( (a2= 'true' | a3= 'false' ) ) )
            // Dsltranstext.g:6270:2: a0= 'isNull' a1= '=' ( (a2= 'true' | a3= 'false' ) )
            {
            a0=(Token)match(input,55,FOLLOW_55_in_parse_dsltrans_isNull6483); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createisNull();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_27_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_176, 249);
              	
            }
            a1=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_isNull6497); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createisNull();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_27_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_177, 250);
              	
            }
            // Dsltranstext.g:6298:2: ( (a2= 'true' | a3= 'false' ) )
            // Dsltranstext.g:6299:3: (a2= 'true' | a3= 'false' )
            {
            // Dsltranstext.g:6299:3: (a2= 'true' | a3= 'false' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==56) ) {
                alt57=1;
            }
            else if ( (LA57_0==57) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // Dsltranstext.g:6300:4: a2= 'true'
                    {
                    a2=(Token)match(input,56,FOLLOW_56_in_parse_dsltrans_isNull6520); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:6313:8: a3= 'false'
                    {
                    a3=(Token)match(input,57,FOLLOW_57_in_parse_dsltrans_isNull6535); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_80, 251, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_81, 251, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_12);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_82, 251);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_89, 251);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_96, 251);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, parse_dsltrans_isNull_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_isNull"


    // $ANTLR start "parse_dsltrans_Sequencer"
    // Dsltranstext.g:6339:1: parse_dsltrans_Sequencer returns [dsltrans.Sequencer element = null] : a0= 'Sequence.nextValue' ;
    public final dsltrans.Sequencer parse_dsltrans_Sequencer() throws RecognitionException {
        dsltrans.Sequencer element =  null;
        int parse_dsltrans_Sequencer_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // Dsltranstext.g:6342:1: (a0= 'Sequence.nextValue' )
            // Dsltranstext.g:6343:2: a0= 'Sequence.nextValue'
            {
            a0=(Token)match(input,58,FOLLOW_58_in_parse_dsltrans_Sequencer6571); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createSequencer();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_28_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_102, 252, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_103, 252, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_104, 252, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_13);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_105, 252);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_166, 252);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, parse_dsltrans_Sequencer_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_Sequencer"


    // $ANTLR start "parse_dsltrans_AttributeEquality"
    // Dsltranstext.g:6363:1: parse_dsltrans_AttributeEquality returns [dsltrans.AttributeEquality element = null] : (a0= IDENTIFIER ) a1= '=' (a2= IDENTIFIER ) ;
    public final dsltrans.AttributeEquality parse_dsltrans_AttributeEquality() throws RecognitionException {
        dsltrans.AttributeEquality element =  null;
        int parse_dsltrans_AttributeEquality_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // Dsltranstext.g:6366:1: ( (a0= IDENTIFIER ) a1= '=' (a2= IDENTIFIER ) )
            // Dsltranstext.g:6367:2: (a0= IDENTIFIER ) a1= '=' (a2= IDENTIFIER )
            {
            // Dsltranstext.g:6367:2: (a0= IDENTIFIER )
            // Dsltranstext.g:6368:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_AttributeEquality6604); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_178, 253);
              	
            }
            a1=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_AttributeEquality6625); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createAttributeEquality();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_29_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_179, 254);
              	
            }
            // Dsltranstext.g:6421:2: (a2= IDENTIFIER )
            // Dsltranstext.g:6422:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_AttributeEquality6643); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_47, 255, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_48, 255, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 255);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 255);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 255);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, parse_dsltrans_AttributeEquality_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_AttributeEquality"


    // $ANTLR start "parse_dsltrans_AttributeInequality"
    // Dsltranstext.g:6467:1: parse_dsltrans_AttributeInequality returns [dsltrans.AttributeInequality element = null] : (a0= IDENTIFIER ) a1= '<>' (a2= IDENTIFIER ) ;
    public final dsltrans.AttributeInequality parse_dsltrans_AttributeInequality() throws RecognitionException {
        dsltrans.AttributeInequality element =  null;
        int parse_dsltrans_AttributeInequality_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }
            // Dsltranstext.g:6470:1: ( (a0= IDENTIFIER ) a1= '<>' (a2= IDENTIFIER ) )
            // Dsltranstext.g:6471:2: (a0= IDENTIFIER ) a1= '<>' (a2= IDENTIFIER )
            {
            // Dsltranstext.g:6471:2: (a0= IDENTIFIER )
            // Dsltranstext.g:6472:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_AttributeInequality6683); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_180, 256);
              	
            }
            a1=(Token)match(input,59,FOLLOW_59_in_parse_dsltrans_AttributeInequality6704); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createAttributeInequality();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_30_0_0_1, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_181, 257);
              	
            }
            // Dsltranstext.g:6525:2: (a2= IDENTIFIER )
            // Dsltranstext.g:6526:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_AttributeInequality6722); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_47, 258, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_48, 258, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_6);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 258);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 258);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 258);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, parse_dsltrans_AttributeInequality_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_AttributeInequality"


    // $ANTLR start "parse_dsltrans_MatchMayBeSameRelation"
    // Dsltranstext.g:6571:1: parse_dsltrans_MatchMayBeSameRelation returns [dsltrans.MatchMayBeSameRelation element = null] : a0= 'allow' (a1= IDENTIFIER ) a2= '=' (a3= IDENTIFIER ) ;
    public final dsltrans.MatchMayBeSameRelation parse_dsltrans_MatchMayBeSameRelation() throws RecognitionException {
        dsltrans.MatchMayBeSameRelation element =  null;
        int parse_dsltrans_MatchMayBeSameRelation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }
            // Dsltranstext.g:6574:1: (a0= 'allow' (a1= IDENTIFIER ) a2= '=' (a3= IDENTIFIER ) )
            // Dsltranstext.g:6575:2: a0= 'allow' (a1= IDENTIFIER ) a2= '=' (a3= IDENTIFIER )
            {
            a0=(Token)match(input,60,FOLLOW_60_in_parse_dsltrans_MatchMayBeSameRelation6758); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createMatchMayBeSameRelation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_31_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_182, 259);
              	
            }
            // Dsltranstext.g:6589:2: (a1= IDENTIFIER )
            // Dsltranstext.g:6590:3: a1= IDENTIFIER
            {
            a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_MatchMayBeSameRelation6776); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_183, 260);
              	
            }
            a2=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_MatchMayBeSameRelation6797); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createMatchMayBeSameRelation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_31_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_184, 261);
              	
            }
            // Dsltranstext.g:6643:2: (a3= IDENTIFIER )
            // Dsltranstext.g:6644:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_MatchMayBeSameRelation6815); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_66, 262, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_67, 262, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_68, 262, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_69, 262, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_70, 262, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_10);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_34, 262);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_37, 262);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, parse_dsltrans_MatchMayBeSameRelation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_MatchMayBeSameRelation"


    // $ANTLR start "parse_dsltrans_ApplyMayBeSameRelation"
    // Dsltranstext.g:6691:1: parse_dsltrans_ApplyMayBeSameRelation returns [dsltrans.ApplyMayBeSameRelation element = null] : a0= 'allow' (a1= IDENTIFIER ) a2= '=' (a3= IDENTIFIER ) ;
    public final dsltrans.ApplyMayBeSameRelation parse_dsltrans_ApplyMayBeSameRelation() throws RecognitionException {
        dsltrans.ApplyMayBeSameRelation element =  null;
        int parse_dsltrans_ApplyMayBeSameRelation_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }
            // Dsltranstext.g:6694:1: (a0= 'allow' (a1= IDENTIFIER ) a2= '=' (a3= IDENTIFIER ) )
            // Dsltranstext.g:6695:2: a0= 'allow' (a1= IDENTIFIER ) a2= '=' (a3= IDENTIFIER )
            {
            a0=(Token)match(input,60,FOLLOW_60_in_parse_dsltrans_ApplyMayBeSameRelation6851); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createApplyMayBeSameRelation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_32_0_0_0, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_185, 263);
              	
            }
            // Dsltranstext.g:6709:2: (a1= IDENTIFIER )
            // Dsltranstext.g:6710:3: a1= IDENTIFIER
            {
            a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyMayBeSameRelation6869); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_186, 264);
              	
            }
            a2=(Token)match(input,11,FOLLOW_11_in_parse_dsltrans_ApplyMayBeSameRelation6890); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = dsltrans.DsltransFactory.eINSTANCE.createApplyMayBeSameRelation();
              			incompleteObjects.push(element);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, dsltrans.resource.dsltranstext.grammar.DsltranstextGrammarInformationProvider.DSLTRANSTEXT_32_0_0_2, null, true);
              		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_187, 265);
              	
            }
            // Dsltranstext.g:6763:2: (a3= IDENTIFIER )
            // Dsltranstext.g:6764:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyMayBeSameRelation6908); if (state.failed) return element;
            if ( state.backtracking==0 ) {

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

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_72, 266, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_73, 266, dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.FEATURE_11);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_43, 266);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_44, 266);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_45, 266);
              		addExpectedElement(dsltrans.resource.dsltranstext.grammar.DsltranstextFollowSetProvider.TERMINAL_46, 266);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, parse_dsltrans_ApplyMayBeSameRelation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_ApplyMayBeSameRelation"


    // $ANTLR start "parse_dsltrans_AbstractSource"
    // Dsltranstext.g:6810:1: parse_dsltrans_AbstractSource returns [dsltrans.AbstractSource element = null] : (c0= parse_dsltrans_FilePort | c1= parse_dsltrans_Sequential );
    public final dsltrans.AbstractSource parse_dsltrans_AbstractSource() throws RecognitionException {
        dsltrans.AbstractSource element =  null;
        int parse_dsltrans_AbstractSource_StartIndex = input.index();
        dsltrans.FilePort c0 = null;

        dsltrans.Sequential c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return element; }
            // Dsltranstext.g:6811:1: (c0= parse_dsltrans_FilePort | c1= parse_dsltrans_Sequential )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==9) ) {
                alt58=1;
            }
            else if ( (LA58_0==17) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // Dsltranstext.g:6812:2: c0= parse_dsltrans_FilePort
                    {
                    pushFollow(FOLLOW_parse_dsltrans_FilePort_in_parse_dsltrans_AbstractSource6940);
                    c0=parse_dsltrans_FilePort();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:6813:4: c1= parse_dsltrans_Sequential
                    {
                    pushFollow(FOLLOW_parse_dsltrans_Sequential_in_parse_dsltrans_AbstractSource6950);
                    c1=parse_dsltrans_Sequential();

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
            if ( state.backtracking>0 ) { memoize(input, 35, parse_dsltrans_AbstractSource_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_AbstractSource"


    // $ANTLR start "parse_dsltrans_AbstractAttributeRelation"
    // Dsltranstext.g:6817:1: parse_dsltrans_AbstractAttributeRelation returns [dsltrans.AbstractAttributeRelation element = null] : (c0= parse_dsltrans_AttributeEquality | c1= parse_dsltrans_AttributeInequality );
    public final dsltrans.AbstractAttributeRelation parse_dsltrans_AbstractAttributeRelation() throws RecognitionException {
        dsltrans.AbstractAttributeRelation element =  null;
        int parse_dsltrans_AbstractAttributeRelation_StartIndex = input.index();
        dsltrans.AttributeEquality c0 = null;

        dsltrans.AttributeInequality c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return element; }
            // Dsltranstext.g:6818:1: (c0= parse_dsltrans_AttributeEquality | c1= parse_dsltrans_AttributeInequality )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IDENTIFIER) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==11) ) {
                    alt59=1;
                }
                else if ( (LA59_1==59) ) {
                    alt59=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // Dsltranstext.g:6819:2: c0= parse_dsltrans_AttributeEquality
                    {
                    pushFollow(FOLLOW_parse_dsltrans_AttributeEquality_in_parse_dsltrans_AbstractAttributeRelation6971);
                    c0=parse_dsltrans_AttributeEquality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:6820:4: c1= parse_dsltrans_AttributeInequality
                    {
                    pushFollow(FOLLOW_parse_dsltrans_AttributeInequality_in_parse_dsltrans_AbstractAttributeRelation6981);
                    c1=parse_dsltrans_AttributeInequality();

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
            if ( state.backtracking>0 ) { memoize(input, 36, parse_dsltrans_AbstractAttributeRelation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_AbstractAttributeRelation"


    // $ANTLR start "parse_dsltrans_AbstractTemporalRelation"
    // Dsltranstext.g:6824:1: parse_dsltrans_AbstractTemporalRelation returns [dsltrans.AbstractTemporalRelation element = null] : (c0= parse_dsltrans_PositiveBackwardRestriction | c1= parse_dsltrans_NegativeBackwardRestriction );
    public final dsltrans.AbstractTemporalRelation parse_dsltrans_AbstractTemporalRelation() throws RecognitionException {
        dsltrans.AbstractTemporalRelation element =  null;
        int parse_dsltrans_AbstractTemporalRelation_StartIndex = input.index();
        dsltrans.PositiveBackwardRestriction c0 = null;

        dsltrans.NegativeBackwardRestriction c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return element; }
            // Dsltranstext.g:6825:1: (c0= parse_dsltrans_PositiveBackwardRestriction | c1= parse_dsltrans_NegativeBackwardRestriction )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==IDENTIFIER) ) {
                int LA60_1 = input.LA(2);

                if ( (LA60_1==47) ) {
                    alt60=1;
                }
                else if ( (LA60_1==38) ) {
                    alt60=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 60, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // Dsltranstext.g:6826:2: c0= parse_dsltrans_PositiveBackwardRestriction
                    {
                    pushFollow(FOLLOW_parse_dsltrans_PositiveBackwardRestriction_in_parse_dsltrans_AbstractTemporalRelation7002);
                    c0=parse_dsltrans_PositiveBackwardRestriction();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:6827:4: c1= parse_dsltrans_NegativeBackwardRestriction
                    {
                    pushFollow(FOLLOW_parse_dsltrans_NegativeBackwardRestriction_in_parse_dsltrans_AbstractTemporalRelation7012);
                    c1=parse_dsltrans_NegativeBackwardRestriction();

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
            if ( state.backtracking>0 ) { memoize(input, 37, parse_dsltrans_AbstractTemporalRelation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_AbstractTemporalRelation"


    // $ANTLR start "parse_dsltrans_MatchClass"
    // Dsltranstext.g:6831:1: parse_dsltrans_MatchClass returns [dsltrans.MatchClass element = null] : (c0= parse_dsltrans_AnyMatchClass | c1= parse_dsltrans_ExistsMatchClass | c2= parse_dsltrans_NegativeMatchClass );
    public final dsltrans.MatchClass parse_dsltrans_MatchClass() throws RecognitionException {
        dsltrans.MatchClass element =  null;
        int parse_dsltrans_MatchClass_StartIndex = input.index();
        dsltrans.AnyMatchClass c0 = null;

        dsltrans.ExistsMatchClass c1 = null;

        dsltrans.NegativeMatchClass c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return element; }
            // Dsltranstext.g:6832:1: (c0= parse_dsltrans_AnyMatchClass | c1= parse_dsltrans_ExistsMatchClass | c2= parse_dsltrans_NegativeMatchClass )
            int alt61=3;
            switch ( input.LA(1) ) {
            case DESCCOM:
                {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA61_2 = input.LA(3);

                    if ( (LA61_2==18) ) {
                        switch ( input.LA(4) ) {
                        case 34:
                            {
                            alt61=1;
                            }
                            break;
                        case 37:
                            {
                            alt61=2;
                            }
                            break;
                        case 38:
                            {
                            alt61=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 61, 6, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 34:
                    {
                    alt61=1;
                    }
                    break;
                case 37:
                    {
                    alt61=2;
                    }
                    break;
                case 38:
                    {
                    alt61=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }

                }
                break;
            case IDENTIFIER:
                {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==18) ) {
                    switch ( input.LA(3) ) {
                    case 34:
                        {
                        alt61=1;
                        }
                        break;
                    case 37:
                        {
                        alt61=2;
                        }
                        break;
                    case 38:
                        {
                        alt61=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 6, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                alt61=1;
                }
                break;
            case 37:
                {
                alt61=2;
                }
                break;
            case 38:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // Dsltranstext.g:6833:2: c0= parse_dsltrans_AnyMatchClass
                    {
                    pushFollow(FOLLOW_parse_dsltrans_AnyMatchClass_in_parse_dsltrans_MatchClass7033);
                    c0=parse_dsltrans_AnyMatchClass();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:6834:4: c1= parse_dsltrans_ExistsMatchClass
                    {
                    pushFollow(FOLLOW_parse_dsltrans_ExistsMatchClass_in_parse_dsltrans_MatchClass7043);
                    c1=parse_dsltrans_ExistsMatchClass();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Dsltranstext.g:6835:4: c2= parse_dsltrans_NegativeMatchClass
                    {
                    pushFollow(FOLLOW_parse_dsltrans_NegativeMatchClass_in_parse_dsltrans_MatchClass7053);
                    c2=parse_dsltrans_NegativeMatchClass();

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
            if ( state.backtracking>0 ) { memoize(input, 38, parse_dsltrans_MatchClass_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_MatchClass"


    // $ANTLR start "parse_dsltrans_MatchAssociation"
    // Dsltranstext.g:6839:1: parse_dsltrans_MatchAssociation returns [dsltrans.MatchAssociation element = null] : (c0= parse_dsltrans_PositiveMatchAssociation | c1= parse_dsltrans_NegativeMatchAssociation | c2= parse_dsltrans_PositiveIndirectAssociation | c3= parse_dsltrans_NegativeIndirectAssociation | c4= parse_dsltrans_MatchMayBeSameRelation );
    public final dsltrans.MatchAssociation parse_dsltrans_MatchAssociation() throws RecognitionException {
        dsltrans.MatchAssociation element =  null;
        int parse_dsltrans_MatchAssociation_StartIndex = input.index();
        dsltrans.PositiveMatchAssociation c0 = null;

        dsltrans.NegativeMatchAssociation c1 = null;

        dsltrans.PositiveIndirectAssociation c2 = null;

        dsltrans.NegativeIndirectAssociation c3 = null;

        dsltrans.MatchMayBeSameRelation c4 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return element; }
            // Dsltranstext.g:6840:1: (c0= parse_dsltrans_PositiveMatchAssociation | c1= parse_dsltrans_NegativeMatchAssociation | c2= parse_dsltrans_PositiveIndirectAssociation | c3= parse_dsltrans_NegativeIndirectAssociation | c4= parse_dsltrans_MatchMayBeSameRelation )
            int alt62=5;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IDENTIFIER) ) {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt62=1;
                    }
                    break;
                case 42:
                    {
                    alt62=2;
                    }
                    break;
                case 43:
                    {
                    alt62=3;
                    }
                    break;
                case 45:
                    {
                    alt62=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA62_0==60) ) {
                alt62=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // Dsltranstext.g:6841:2: c0= parse_dsltrans_PositiveMatchAssociation
                    {
                    pushFollow(FOLLOW_parse_dsltrans_PositiveMatchAssociation_in_parse_dsltrans_MatchAssociation7074);
                    c0=parse_dsltrans_PositiveMatchAssociation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:6842:4: c1= parse_dsltrans_NegativeMatchAssociation
                    {
                    pushFollow(FOLLOW_parse_dsltrans_NegativeMatchAssociation_in_parse_dsltrans_MatchAssociation7084);
                    c1=parse_dsltrans_NegativeMatchAssociation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Dsltranstext.g:6843:4: c2= parse_dsltrans_PositiveIndirectAssociation
                    {
                    pushFollow(FOLLOW_parse_dsltrans_PositiveIndirectAssociation_in_parse_dsltrans_MatchAssociation7094);
                    c2=parse_dsltrans_PositiveIndirectAssociation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Dsltranstext.g:6844:4: c3= parse_dsltrans_NegativeIndirectAssociation
                    {
                    pushFollow(FOLLOW_parse_dsltrans_NegativeIndirectAssociation_in_parse_dsltrans_MatchAssociation7104);
                    c3=parse_dsltrans_NegativeIndirectAssociation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Dsltranstext.g:6845:4: c4= parse_dsltrans_MatchMayBeSameRelation
                    {
                    pushFollow(FOLLOW_parse_dsltrans_MatchMayBeSameRelation_in_parse_dsltrans_MatchAssociation7114);
                    c4=parse_dsltrans_MatchMayBeSameRelation();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 39, parse_dsltrans_MatchAssociation_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_MatchAssociation"


    // $ANTLR start "parse_dsltrans_MatchAttributeValue"
    // Dsltranstext.g:6849:1: parse_dsltrans_MatchAttributeValue returns [dsltrans.MatchAttributeValue element = null] : (c0= parse_dsltrans_Atom | c1= parse_dsltrans_isNull );
    public final dsltrans.MatchAttributeValue parse_dsltrans_MatchAttributeValue() throws RecognitionException {
        dsltrans.MatchAttributeValue element =  null;
        int parse_dsltrans_MatchAttributeValue_StartIndex = input.index();
        dsltrans.Atom c0 = null;

        dsltrans.isNull c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return element; }
            // Dsltranstext.g:6850:1: (c0= parse_dsltrans_Atom | c1= parse_dsltrans_isNull )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==QUOTED_39_39_92) ) {
                alt63=1;
            }
            else if ( (LA63_0==55) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // Dsltranstext.g:6851:2: c0= parse_dsltrans_Atom
                    {
                    pushFollow(FOLLOW_parse_dsltrans_Atom_in_parse_dsltrans_MatchAttributeValue7135);
                    c0=parse_dsltrans_Atom();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:6852:4: c1= parse_dsltrans_isNull
                    {
                    pushFollow(FOLLOW_parse_dsltrans_isNull_in_parse_dsltrans_MatchAttributeValue7145);
                    c1=parse_dsltrans_isNull();

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
            if ( state.backtracking>0 ) { memoize(input, 40, parse_dsltrans_MatchAttributeValue_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_MatchAttributeValue"


    // $ANTLR start "parse_dsltrans_Term"
    // Dsltranstext.g:6856:1: parse_dsltrans_Term returns [dsltrans.Term element = null] : (c0= parse_dsltrans_Atom | c1= parse_dsltrans_AttributeRef | c2= parse_dsltrans_ClassRef | c3= parse_dsltrans_Concat | c4= parse_dsltrans_TypeOf | c5= parse_dsltrans_Wildcard | c6= parse_dsltrans_Sequencer );
    public final dsltrans.Term parse_dsltrans_Term() throws RecognitionException {
        dsltrans.Term element =  null;
        int parse_dsltrans_Term_StartIndex = input.index();
        dsltrans.Atom c0 = null;

        dsltrans.AttributeRef c1 = null;

        dsltrans.ClassRef c2 = null;

        dsltrans.Concat c3 = null;

        dsltrans.TypeOf c4 = null;

        dsltrans.Wildcard c5 = null;

        dsltrans.Sequencer c6 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return element; }
            // Dsltranstext.g:6857:1: (c0= parse_dsltrans_Atom | c1= parse_dsltrans_AttributeRef | c2= parse_dsltrans_ClassRef | c3= parse_dsltrans_Concat | c4= parse_dsltrans_TypeOf | c5= parse_dsltrans_Wildcard | c6= parse_dsltrans_Sequencer )
            int alt64=7;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // Dsltranstext.g:6858:2: c0= parse_dsltrans_Atom
                    {
                    pushFollow(FOLLOW_parse_dsltrans_Atom_in_parse_dsltrans_Term7166);
                    c0=parse_dsltrans_Atom();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Dsltranstext.g:6859:4: c1= parse_dsltrans_AttributeRef
                    {
                    pushFollow(FOLLOW_parse_dsltrans_AttributeRef_in_parse_dsltrans_Term7176);
                    c1=parse_dsltrans_AttributeRef();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Dsltranstext.g:6860:4: c2= parse_dsltrans_ClassRef
                    {
                    pushFollow(FOLLOW_parse_dsltrans_ClassRef_in_parse_dsltrans_Term7186);
                    c2=parse_dsltrans_ClassRef();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Dsltranstext.g:6861:4: c3= parse_dsltrans_Concat
                    {
                    pushFollow(FOLLOW_parse_dsltrans_Concat_in_parse_dsltrans_Term7196);
                    c3=parse_dsltrans_Concat();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Dsltranstext.g:6862:4: c4= parse_dsltrans_TypeOf
                    {
                    pushFollow(FOLLOW_parse_dsltrans_TypeOf_in_parse_dsltrans_Term7206);
                    c4=parse_dsltrans_TypeOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 6 :
                    // Dsltranstext.g:6863:4: c5= parse_dsltrans_Wildcard
                    {
                    pushFollow(FOLLOW_parse_dsltrans_Wildcard_in_parse_dsltrans_Term7216);
                    c5=parse_dsltrans_Wildcard();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 7 :
                    // Dsltranstext.g:6864:4: c6= parse_dsltrans_Sequencer
                    {
                    pushFollow(FOLLOW_parse_dsltrans_Sequencer_in_parse_dsltrans_Term7226);
                    c6=parse_dsltrans_Sequencer();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 41, parse_dsltrans_Term_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_dsltrans_Term"

    // $ANTLR start synpred69_Dsltranstext
    public final void synpred69_Dsltranstext_fragment() throws RecognitionException {   
        dsltrans.AttributeRef c1 = null;


        // Dsltranstext.g:6859:4: (c1= parse_dsltrans_AttributeRef )
        // Dsltranstext.g:6859:4: c1= parse_dsltrans_AttributeRef
        {
        pushFollow(FOLLOW_parse_dsltrans_AttributeRef_in_synpred69_Dsltranstext7176);
        c1=parse_dsltrans_AttributeRef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_Dsltranstext

    // $ANTLR start synpred70_Dsltranstext
    public final void synpred70_Dsltranstext_fragment() throws RecognitionException {   
        dsltrans.ClassRef c2 = null;


        // Dsltranstext.g:6860:4: (c2= parse_dsltrans_ClassRef )
        // Dsltranstext.g:6860:4: c2= parse_dsltrans_ClassRef
        {
        pushFollow(FOLLOW_parse_dsltrans_ClassRef_in_synpred70_Dsltranstext7186);
        c2=parse_dsltrans_ClassRef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_Dsltranstext

    // $ANTLR start synpred72_Dsltranstext
    public final void synpred72_Dsltranstext_fragment() throws RecognitionException {   
        dsltrans.TypeOf c4 = null;


        // Dsltranstext.g:6862:4: (c4= parse_dsltrans_TypeOf )
        // Dsltranstext.g:6862:4: c4= parse_dsltrans_TypeOf
        {
        pushFollow(FOLLOW_parse_dsltrans_TypeOf_in_synpred72_Dsltranstext7206);
        c4=parse_dsltrans_TypeOf();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_Dsltranstext

    // Delegated rules

    public final boolean synpred70_Dsltranstext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_Dsltranstext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_Dsltranstext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_Dsltranstext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_Dsltranstext() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_Dsltranstext_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA64_eotS =
        "\16\uffff";
    static final String DFA64_eofS =
        "\16\uffff";
    static final String DFA64_minS =
        "\1\5\1\uffff\1\16\1\4\3\uffff\1\4\1\0\1\20\2\uffff\1\0\1\uffff";
    static final String DFA64_maxS =
        "\1\72\1\uffff\1\16\1\4\3\uffff\1\4\1\0\1\20\2\uffff\1\0\1\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\6\1\7\3\uffff\1\2\1\5\1\uffff\1\3";
    static final String DFA64_specialS =
        "\10\uffff\1\0\3\uffff\1\1\1\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\55\uffff\1\2\1\4\1\3\1\5\3\uffff\1\6",
            "",
            "\1\7",
            "\1\10",
            "",
            "",
            "",
            "\1\11",
            "\1\uffff",
            "\1\14",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "6856:1: parse_dsltrans_Term returns [dsltrans.Term element = null] : (c0= parse_dsltrans_Atom | c1= parse_dsltrans_AttributeRef | c2= parse_dsltrans_ClassRef | c3= parse_dsltrans_Concat | c4= parse_dsltrans_TypeOf | c5= parse_dsltrans_Wildcard | c6= parse_dsltrans_Sequencer );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_8 = input.LA(1);

                         
                        int index64_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Dsltranstext()) ) {s = 10;}

                        else if ( (synpred72_Dsltranstext()) ) {s = 11;}

                         
                        input.seek(index64_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_12 = input.LA(1);

                         
                        int index64_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_Dsltranstext()) ) {s = 10;}

                        else if ( (synpred70_Dsltranstext()) ) {s = 13;}

                         
                        input.seek(index64_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_parse_dsltrans_TransformationModel_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_AbstractSource_in_parse_dsltrans_TransformationModel124 = new BitSet(new long[]{0x0000000000020202L});
    public static final BitSet FOLLOW_9_in_parse_dsltrans_FilePort165 = new BitSet(new long[]{0x0000000000003400L});
    public static final BitSet FOLLOW_10_in_parse_dsltrans_FilePort188 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_FilePort208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_FilePort234 = new BitSet(new long[]{0x0000000000003400L});
    public static final BitSet FOLLOW_12_in_parse_dsltrans_FilePort289 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_FilePort309 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_FilePort335 = new BitSet(new long[]{0x0000000000003400L});
    public static final BitSet FOLLOW_parse_dsltrans_MetaModelIdentifier_in_parse_dsltrans_FilePort385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_dsltrans_MetaModelIdentifier418 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_MetaModelIdentifier432 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_15_in_parse_dsltrans_MetaModelIdentifier455 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_MetaModelIdentifier475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_MetaModelIdentifier501 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_parse_dsltrans_MetaModelIdentifier556 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_MetaModelIdentifier576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_MetaModelIdentifier602 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_MetaModelIdentifier648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_parse_dsltrans_Sequential677 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Sequential706 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_dsltrans_Sequential739 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_dsltrans_Sequential772 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Sequential801 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_dsltrans_Sequential847 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_Sequential861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Sequential884 = new BitSet(new long[]{0x0000000000603420L});
    public static final BitSet FOLLOW_21_in_parse_dsltrans_Sequential923 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_Sequential943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_Sequential969 = new BitSet(new long[]{0x0000000000403400L});
    public static final BitSet FOLLOW_22_in_parse_dsltrans_Sequential1024 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_Sequential1044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Sequential1070 = new BitSet(new long[]{0x0000000000003400L});
    public static final BitSet FOLLOW_parse_dsltrans_MetaModelIdentifier_in_parse_dsltrans_Sequential1120 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_parse_dsltrans_Rule_in_parse_dsltrans_Sequential1153 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_parse_dsltrans_Sequential1194 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_dsltrans_Sequential1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_dsltrans_Rule1237 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Rule1266 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_dsltrans_Rule1321 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_parse_dsltrans_MatchModel_in_parse_dsltrans_Rule1347 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_parse_dsltrans_Rule1392 = new BitSet(new long[]{0x0000000938800050L});
    public static final BitSet FOLLOW_parse_dsltrans_ApplyModel_in_parse_dsltrans_Rule1414 = new BitSet(new long[]{0x0000000038800000L});
    public static final BitSet FOLLOW_27_in_parse_dsltrans_Rule1453 = new BitSet(new long[]{0x0000000030800010L});
    public static final BitSet FOLLOW_parse_dsltrans_AbstractAttributeRelation_in_parse_dsltrans_Rule1494 = new BitSet(new long[]{0x0000000030800010L});
    public static final BitSet FOLLOW_28_in_parse_dsltrans_Rule1577 = new BitSet(new long[]{0x0000000020800010L});
    public static final BitSet FOLLOW_parse_dsltrans_AbstractTemporalRelation_in_parse_dsltrans_Rule1618 = new BitSet(new long[]{0x0000000020800010L});
    public static final BitSet FOLLOW_29_in_parse_dsltrans_Rule1701 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_parse_dsltrans_Import_in_parse_dsltrans_Rule1742 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_23_in_parse_dsltrans_Rule1816 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_dsltrans_Rule1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_dsltrans_MatchModel1868 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_MatchModel1888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_MatchModel1914 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_dsltrans_MatchModel1960 = new BitSet(new long[]{0x0000006500000052L});
    public static final BitSet FOLLOW_parse_dsltrans_MatchClass_in_parse_dsltrans_MatchModel1989 = new BitSet(new long[]{0x0000006500000052L});
    public static final BitSet FOLLOW_32_in_parse_dsltrans_MatchModel2039 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_dsltrans_MatchModel2059 = new BitSet(new long[]{0x1000000000000012L});
    public static final BitSet FOLLOW_parse_dsltrans_MatchAssociation_in_parse_dsltrans_MatchModel2100 = new BitSet(new long[]{0x1000000000000012L});
    public static final BitSet FOLLOW_parse_dsltrans_ApplyClass_in_parse_dsltrans_ApplyModel2204 = new BitSet(new long[]{0x0000000900000052L});
    public static final BitSet FOLLOW_32_in_parse_dsltrans_ApplyModel2254 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_dsltrans_ApplyModel2274 = new BitSet(new long[]{0x1000000000000012L});
    public static final BitSet FOLLOW_parse_dsltrans_ApplyAssociation_in_parse_dsltrans_ApplyModel2315 = new BitSet(new long[]{0x1000000000000012L});
    public static final BitSet FOLLOW_DESCCOM_in_parse_dsltrans_AnyMatchClass2419 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_AnyMatchClass2480 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_dsltrans_AnyMatchClass2513 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parse_dsltrans_AnyMatchClass2546 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_parse_dsltrans_AnyMatchClass2582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_AnyMatchClass2630 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_dsltrans_AnyMatchClass2651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_AnyMatchClass2669 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_AnyMatchClass2699 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_parse_dsltrans_MatchAttribute_in_parse_dsltrans_AnyMatchClass2740 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_AnyMatchClass2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCCOM_in_parse_dsltrans_ExistsMatchClass2864 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ExistsMatchClass2925 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_dsltrans_ExistsMatchClass2958 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_dsltrans_ExistsMatchClass2991 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_parse_dsltrans_ExistsMatchClass3027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ExistsMatchClass3075 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_dsltrans_ExistsMatchClass3096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ExistsMatchClass3114 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_ExistsMatchClass3144 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_parse_dsltrans_MatchAttribute_in_parse_dsltrans_ExistsMatchClass3185 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_ExistsMatchClass3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCCOM_in_parse_dsltrans_NegativeMatchClass3308 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchClass3369 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_dsltrans_NegativeMatchClass3402 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_dsltrans_NegativeMatchClass3435 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_parse_dsltrans_NegativeMatchClass3471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchClass3519 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_dsltrans_NegativeMatchClass3540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchClass3558 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_NegativeMatchClass3588 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_parse_dsltrans_MatchAttribute_in_parse_dsltrans_NegativeMatchClass3638 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_NegativeMatchClass3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESCCOM_in_parse_dsltrans_ApplyClass3785 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyClass3846 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_dsltrans_ApplyClass3879 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_parse_dsltrans_ApplyClass3934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyClass3982 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_dsltrans_ApplyClass4003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyClass4021 = new BitSet(new long[]{0x0000008000004002L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_ApplyClass4051 = new BitSet(new long[]{0x0000400000010010L});
    public static final BitSet FOLLOW_parse_dsltrans_ApplyAttribute_in_parse_dsltrans_ApplyClass4092 = new BitSet(new long[]{0x0000400000010010L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_ApplyClass4153 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_parse_dsltrans_ApplyClass4195 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_dsltrans_ApplyClass4215 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_ApplyClass4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveMatchAssociation4306 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_dsltrans_PositiveMatchAssociation4327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_PositiveMatchAssociation4341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveMatchAssociation4359 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_PositiveMatchAssociation4380 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_dsltrans_PositiveMatchAssociation4394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveMatchAssociation4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchAssociation4452 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_parse_dsltrans_NegativeMatchAssociation4473 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_NegativeMatchAssociation4487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchAssociation4505 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_NegativeMatchAssociation4526 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_dsltrans_NegativeMatchAssociation4540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeMatchAssociation4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveIndirectAssociation4598 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parse_dsltrans_PositiveIndirectAssociation4619 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_PositiveIndirectAssociation4642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveIndirectAssociation4668 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_PositiveIndirectAssociation4701 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_dsltrans_PositiveIndirectAssociation4734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveIndirectAssociation4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeIndirectAssociation4792 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_parse_dsltrans_NegativeIndirectAssociation4813 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_NegativeIndirectAssociation4836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeIndirectAssociation4862 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_NegativeIndirectAssociation4895 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_dsltrans_NegativeIndirectAssociation4928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeIndirectAssociation4946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyAssociation4986 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_dsltrans_ApplyAssociation5007 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_ApplyAssociation5021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyAssociation5039 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_ApplyAssociation5060 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_dsltrans_ApplyAssociation5074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyAssociation5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_ApplyMayBeSameRelation_in_parse_dsltrans_ApplyAssociation5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_MatchAttribute5158 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_dsltrans_MatchAttribute5191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_MatchAttribute5228 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_MatchAttribute5258 = new BitSet(new long[]{0x0080000000000020L});
    public static final BitSet FOLLOW_parse_dsltrans_MatchAttributeValue_in_parse_dsltrans_MatchAttribute5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyAttribute5362 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_dsltrans_ApplyAttribute5401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyAttribute5453 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_ApplyAttribute5499 = new BitSet(new long[]{0x0478000000000020L});
    public static final BitSet FOLLOW_parse_dsltrans_Term_in_parse_dsltrans_ApplyAttribute5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_parse_dsltrans_ApplyAttribute5619 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_ApplyAttribute5636 = new BitSet(new long[]{0x0478000000000020L});
    public static final BitSet FOLLOW_parse_dsltrans_Term_in_parse_dsltrans_ApplyAttribute5658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveBackwardRestriction5707 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parse_dsltrans_PositiveBackwardRestriction5728 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_parse_dsltrans_PositiveBackwardRestriction5742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_PositiveBackwardRestriction5760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeBackwardRestriction5800 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_dsltrans_NegativeBackwardRestriction5821 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parse_dsltrans_NegativeBackwardRestriction5835 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_parse_dsltrans_NegativeBackwardRestriction5849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_NegativeBackwardRestriction5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_Import5903 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_parse_dsltrans_Import5917 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_Import5931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_Import5949 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_parse_dsltrans_Import5970 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_dsltrans_Import5984 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_Import5998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_Import6016 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_Import6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_39_39_92_in_parse_dsltrans_Atom6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_parse_dsltrans_AttributeRef6106 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_AttributeRef6120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_AttributeRef6138 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_AttributeRef6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_TypeOf_in_parse_dsltrans_AttributeRef6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_parse_dsltrans_ClassRef6203 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_ClassRef6217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ClassRef6235 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_ClassRef6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_parse_dsltrans_Concat6285 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_dsltrans_Concat6299 = new BitSet(new long[]{0x0478000000000020L});
    public static final BitSet FOLLOW_parse_dsltrans_Term_in_parse_dsltrans_Concat6317 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_dsltrans_Concat6335 = new BitSet(new long[]{0x0478000000000020L});
    public static final BitSet FOLLOW_parse_dsltrans_Term_in_parse_dsltrans_Concat6353 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_dsltrans_Concat6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_parse_dsltrans_TypeOf6400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_TypeOf6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_parse_dsltrans_Wildcard6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_parse_dsltrans_isNull6483 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_isNull6497 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_56_in_parse_dsltrans_isNull6520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_parse_dsltrans_isNull6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_parse_dsltrans_Sequencer6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_AttributeEquality6604 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_AttributeEquality6625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_AttributeEquality6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_AttributeInequality6683 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parse_dsltrans_AttributeInequality6704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_AttributeInequality6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_parse_dsltrans_MatchMayBeSameRelation6758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_MatchMayBeSameRelation6776 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_MatchMayBeSameRelation6797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_MatchMayBeSameRelation6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_parse_dsltrans_ApplyMayBeSameRelation6851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyMayBeSameRelation6869 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_dsltrans_ApplyMayBeSameRelation6890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_dsltrans_ApplyMayBeSameRelation6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_FilePort_in_parse_dsltrans_AbstractSource6940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_Sequential_in_parse_dsltrans_AbstractSource6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_AttributeEquality_in_parse_dsltrans_AbstractAttributeRelation6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_AttributeInequality_in_parse_dsltrans_AbstractAttributeRelation6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_PositiveBackwardRestriction_in_parse_dsltrans_AbstractTemporalRelation7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_NegativeBackwardRestriction_in_parse_dsltrans_AbstractTemporalRelation7012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_AnyMatchClass_in_parse_dsltrans_MatchClass7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_ExistsMatchClass_in_parse_dsltrans_MatchClass7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_NegativeMatchClass_in_parse_dsltrans_MatchClass7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_PositiveMatchAssociation_in_parse_dsltrans_MatchAssociation7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_NegativeMatchAssociation_in_parse_dsltrans_MatchAssociation7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_PositiveIndirectAssociation_in_parse_dsltrans_MatchAssociation7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_NegativeIndirectAssociation_in_parse_dsltrans_MatchAssociation7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_MatchMayBeSameRelation_in_parse_dsltrans_MatchAssociation7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_Atom_in_parse_dsltrans_MatchAttributeValue7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_isNull_in_parse_dsltrans_MatchAttributeValue7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_Atom_in_parse_dsltrans_Term7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_AttributeRef_in_parse_dsltrans_Term7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_ClassRef_in_parse_dsltrans_Term7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_Concat_in_parse_dsltrans_Term7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_TypeOf_in_parse_dsltrans_Term7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_Wildcard_in_parse_dsltrans_Term7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_Sequencer_in_parse_dsltrans_Term7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_AttributeRef_in_synpred69_Dsltranstext7176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_ClassRef_in_synpred70_Dsltranstext7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_dsltrans_TypeOf_in_synpred72_Dsltranstext7206 = new BitSet(new long[]{0x0000000000000002L});

}