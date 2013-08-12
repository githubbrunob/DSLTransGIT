// $ANTLR ${project.version} ${buildNumber}

	package SOS.resource.SOS.mopp;


import org.antlr.runtime3_3_0.*;

public class SOSLexer extends Lexer {
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

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public SOSLexer() {;} 
    public SOSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SOSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "SOS.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:16:7: ( 'Semantics' )
            // SOS.g:16:9: 'Semantics'
            {
            match("Semantics"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:17:7: ( 'Assuming' )
            // SOS.g:17:9: 'Assuming'
            {
            match("Assuming"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:18:7: ( 'Then' )
            // SOS.g:18:9: 'Then'
            {
            match("Then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:19:7: ( 'Fact' )
            // SOS.g:19:9: 'Fact'
            {
            match("Fact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:20:7: ( 'Where' )
            // SOS.g:20:9: 'Where'
            {
            match("Where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:21:7: ( ',' )
            // SOS.g:21:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:22:7: ( ':' )
            // SOS.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:23:7: ( '->>' )
            // SOS.g:23:9: '->>'
            {
            match("->>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:24:7: ( 'in' )
            // SOS.g:24:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:25:7: ( 'Transition' )
            // SOS.g:25:9: 'Transition'
            {
            match("Transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:26:7: ( 'System' )
            // SOS.g:26:9: 'System'
            {
            match("System"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:27:7: ( '|-' )
            // SOS.g:27:9: '|-'
            {
            match("|-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:28:7: ( '(' )
            // SOS.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:29:7: ( ')' )
            // SOS.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:30:7: ( 'ADT' )
            // SOS.g:30:9: 'ADT'
            {
            match("ADT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:31:7: ( 'Sorts' )
            // SOS.g:31:9: 'Sorts'
            {
            match("Sorts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:32:7: ( 'Generators' )
            // SOS.g:32:9: 'Generators'
            {
            match("Generators"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:33:7: ( 'Operations' )
            // SOS.g:33:9: 'Operations'
            {
            match("Operations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:34:7: ( 'Axioms' )
            // SOS.g:34:9: 'Axioms'
            {
            match("Axioms"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:35:7: ( '->' )
            // SOS.g:35:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:36:7: ( ';' )
            // SOS.g:36:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:37:7: ( '=>' )
            // SOS.g:37:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:38:7: ( '@' )
            // SOS.g:38:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:39:7: ( '^' )
            // SOS.g:39:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:40:7: ( '=' )
            // SOS.g:40:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:41:7: ( '!=' )
            // SOS.g:41:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:42:7: ( 'Set' )
            // SOS.g:42:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:43:7: ( 'Model' )
            // SOS.g:43:9: 'Model'
            {
            match("Model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:44:7: ( '{' )
            // SOS.g:44:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:45:7: ( '|' )
            // SOS.g:45:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:46:7: ( '}' )
            // SOS.g:46:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:47:7: ( 'existsIn' )
            // SOS.g:47:9: 'existsIn'
            {
            match("existsIn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:48:7: ( 'Union' )
            // SOS.g:48:9: 'Union'
            {
            match("Union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:49:7: ( 'Excluding' )
            // SOS.g:49:9: 'Excluding'
            {
            match("Excluding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:50:7: ( 'Intersect' )
            // SOS.g:50:9: 'Intersect'
            {
            match("Intersect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:51:7: ( '.' )
            // SOS.g:51:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:52:7: ( 'class' )
            // SOS.g:52:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:4446:8: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // SOS.g:4447:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // SOS.g:4447:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // SOS.g:4447:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 

            // SOS.g:4447:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // SOS.g:4447:8: ~ ( '\\n' | '\\r' | '\\uffff' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:4450:8: ( ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) )
            // SOS.g:4451:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            {
            // SOS.g:4451:2: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-'||(LA4_0>='1' && LA4_0<='9')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='0') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // SOS.g:4451:3: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // SOS.g:4451:3: ( '-' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='-') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // SOS.g:4451:4: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // SOS.g:4451:9: ( '1' .. '9' )
                    // SOS.g:4451:10: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // SOS.g:4451:19: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // SOS.g:4451:20: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // SOS.g:4451:31: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:4453:6: ( ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ ) )
            // SOS.g:4454:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            {
            // SOS.g:4454:2: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // SOS.g:4454:3: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // SOS.g:4454:3: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // SOS.g:4454:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // SOS.g:4454:9: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='0') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // SOS.g:4454:10: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // SOS.g:4454:10: ( '1' .. '9' )
                    // SOS.g:4454:11: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // SOS.g:4454:21: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // SOS.g:4454:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // SOS.g:4454:35: '0'
                    {
                    match('0'); 

                    }
                    break;

            }

            match('.'); 
            // SOS.g:4454:44: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // SOS.g:4454:45: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:4457:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // SOS.g:4458:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // SOS.g:4458:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // SOS.g:4458:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // SOS.g:4458:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='-'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // SOS.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:4460:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // SOS.g:4461:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // SOS.g:4461:2: ( ( ' ' | '\\t' | '\\f' ) )
            // SOS.g:4461:3: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:4464:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // SOS.g:4465:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // SOS.g:4465:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // SOS.g:4465:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // SOS.g:4465:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='\n') ) {
                    alt10=1;
                }
                else {
                    alt10=2;}
            }
            else if ( (LA10_0=='\n') ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // SOS.g:4465:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // SOS.g:4465:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // SOS.g:4465:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "QUOTED_34_34"
    public final void mQUOTED_34_34() throws RecognitionException {
        try {
            int _type = QUOTED_34_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // SOS.g:4468:13: ( ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) ) )
            // SOS.g:4469:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            {
            // SOS.g:4469:2: ( ( '\"' ) (~ ( '\"' ) )* ( '\"' ) )
            // SOS.g:4469:3: ( '\"' ) (~ ( '\"' ) )* ( '\"' )
            {
            // SOS.g:4469:3: ( '\"' )
            // SOS.g:4469:4: '\"'
            {
            match('\"'); 

            }

            // SOS.g:4469:8: (~ ( '\"' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // SOS.g:4469:9: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // SOS.g:4469:17: ( '\"' )
            // SOS.g:4469:18: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_34_34"

    public void mTokens() throws RecognitionException {
        // SOS.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | COMMENT | INTEGER | FLOAT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 )
        int alt12=44;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // SOS.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // SOS.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // SOS.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // SOS.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // SOS.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // SOS.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // SOS.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // SOS.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // SOS.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // SOS.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // SOS.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // SOS.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // SOS.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // SOS.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // SOS.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // SOS.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // SOS.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // SOS.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // SOS.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // SOS.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // SOS.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // SOS.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // SOS.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // SOS.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // SOS.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // SOS.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // SOS.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // SOS.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // SOS.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // SOS.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // SOS.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // SOS.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // SOS.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // SOS.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // SOS.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // SOS.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // SOS.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // SOS.g:1:232: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 39 :
                // SOS.g:1:240: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 40 :
                // SOS.g:1:248: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 41 :
                // SOS.g:1:254: TEXT
                {
                mTEXT(); 

                }
                break;
            case 42 :
                // SOS.g:1:259: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 43 :
                // SOS.g:1:270: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 44 :
                // SOS.g:1:280: QUOTED_34_34
                {
                mQUOTED_34_34(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\5\40\2\uffff\2\40\1\62\2\uffff\2\40\1\uffff\1\66\3\uffff"+
        "\1\40\2\uffff\4\40\1\uffff\1\40\1\uffff\2\76\4\uffff\12\40\1\114"+
        "\1\40\1\115\2\uffff\2\40\2\uffff\6\40\1\76\2\uffff\1\40\1\127\3"+
        "\40\1\133\5\40\3\uffff\11\40\1\uffff\3\40\1\uffff\1\40\1\156\1\40"+
        "\1\160\13\40\1\174\2\40\1\uffff\1\40\1\uffff\1\u0080\2\40\1\u0083"+
        "\1\40\1\u0085\2\40\1\u0088\1\40\1\u008a\1\uffff\1\40\1\u008c\1\40"+
        "\1\uffff\2\40\1\uffff\1\40\1\uffff\2\40\1\uffff\1\40\1\uffff\1\40"+
        "\1\uffff\7\40\1\u009c\3\40\1\u00a0\2\40\1\u00a3\1\uffff\3\40\1\uffff"+
        "\1\u00a7\1\u00a8\1\uffff\1\u00a9\1\u00aa\1\u00ab\5\uffff";
    static final String DFA12_eofS =
        "\u00ac\uffff";
    static final String DFA12_minS =
        "\1\11\1\145\1\104\1\150\1\141\1\150\2\uffff\1\60\1\156\1\55\2\uffff"+
        "\1\145\1\160\1\uffff\1\76\3\uffff\1\157\2\uffff\1\170\1\156\1\170"+
        "\1\156\1\uffff\1\154\1\uffff\2\55\4\uffff\1\155\1\163\1\162\1\163"+
        "\1\124\1\151\1\145\1\141\1\143\1\145\1\76\1\56\1\55\2\uffff\1\156"+
        "\1\145\2\uffff\1\144\2\151\1\143\1\164\1\141\1\55\2\uffff\1\141"+
        "\1\55\2\164\1\165\1\55\1\157\2\156\1\164\1\162\3\uffff\1\145\1\162"+
        "\1\145\1\163\1\157\1\154\1\145\1\163\1\156\1\uffff\1\145\1\163\1"+
        "\155\1\uffff\1\155\1\55\1\163\1\55\1\145\1\162\1\141\1\154\1\164"+
        "\1\156\1\165\1\162\1\163\1\164\1\155\1\55\1\151\1\163\1\uffff\1"+
        "\151\1\uffff\1\55\1\141\1\164\1\55\1\163\1\55\1\144\1\163\1\55\1"+
        "\151\1\55\1\uffff\1\156\1\55\1\164\1\uffff\1\164\1\151\1\uffff\1"+
        "\111\1\uffff\1\151\1\145\1\uffff\1\143\1\uffff\1\147\1\uffff\1\151"+
        "\2\157\2\156\1\143\1\163\1\55\1\157\1\162\1\156\1\55\1\147\1\164"+
        "\1\55\1\uffff\1\156\2\163\1\uffff\2\55\1\uffff\3\55\5\uffff";
    static final String DFA12_maxS =
        "\1\175\1\171\1\170\1\162\1\141\1\150\2\uffff\1\76\1\156\1\55\2"+
        "\uffff\1\145\1\160\1\uffff\1\76\3\uffff\1\157\2\uffff\1\170\1\156"+
        "\1\170\1\156\1\uffff\1\154\1\uffff\2\172\4\uffff\1\164\1\163\1\162"+
        "\1\163\1\124\1\151\1\145\1\141\1\143\1\145\1\76\1\56\1\172\2\uffff"+
        "\1\156\1\145\2\uffff\1\144\2\151\1\143\1\164\1\141\1\172\2\uffff"+
        "\1\141\1\172\2\164\1\165\1\172\1\157\2\156\1\164\1\162\3\uffff\1"+
        "\145\1\162\1\145\1\163\1\157\1\154\1\145\1\163\1\156\1\uffff\1\145"+
        "\1\163\1\155\1\uffff\1\155\1\172\1\163\1\172\1\145\1\162\1\141\1"+
        "\154\1\164\1\156\1\165\1\162\1\163\1\164\1\155\1\172\1\151\1\163"+
        "\1\uffff\1\151\1\uffff\1\172\1\141\1\164\1\172\1\163\1\172\1\144"+
        "\1\163\1\172\1\151\1\172\1\uffff\1\156\1\172\1\164\1\uffff\1\164"+
        "\1\151\1\uffff\1\111\1\uffff\1\151\1\145\1\uffff\1\143\1\uffff\1"+
        "\147\1\uffff\1\151\2\157\2\156\1\143\1\163\1\172\1\157\1\162\1\156"+
        "\1\172\1\147\1\164\1\172\1\uffff\1\156\2\163\1\uffff\2\172\1\uffff"+
        "\3\172\5\uffff";
    static final String DFA12_acceptS =
        "\6\uffff\1\6\1\7\3\uffff\1\15\1\16\2\uffff\1\25\1\uffff\1\27\1"+
        "\30\1\32\1\uffff\1\35\1\37\4\uffff\1\44\1\uffff\1\46\2\uffff\1\51"+
        "\1\52\1\53\1\54\15\uffff\1\14\1\36\2\uffff\1\26\1\31\7\uffff\1\47"+
        "\1\50\13\uffff\1\10\1\24\1\11\11\uffff\1\33\3\uffff\1\17\22\uffff"+
        "\1\3\1\uffff\1\4\13\uffff\1\20\3\uffff\1\5\2\uffff\1\34\1\uffff"+
        "\1\41\2\uffff\1\45\1\uffff\1\13\1\uffff\1\23\17\uffff\1\2\3\uffff"+
        "\1\40\2\uffff\1\1\3\uffff\1\42\1\43\1\12\1\21\1\22";
    static final String DFA12_specialS =
        "\u00ac\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\41\1\42\1\uffff\1\41\1\42\22\uffff\1\41\1\23\1\43\5\uffff"+
            "\1\13\1\14\2\uffff\1\6\1\10\1\33\1\35\1\37\11\36\1\7\1\17\1"+
            "\uffff\1\20\2\uffff\1\21\1\2\3\40\1\31\1\4\1\15\1\40\1\32\3"+
            "\40\1\24\1\40\1\16\3\40\1\1\1\3\1\30\1\40\1\5\3\40\3\uffff\1"+
            "\22\1\40\1\uffff\2\40\1\34\1\40\1\27\3\40\1\11\21\40\1\25\1"+
            "\12\1\26",
            "\1\44\11\uffff\1\46\11\uffff\1\45",
            "\1\50\56\uffff\1\47\4\uffff\1\51",
            "\1\52\11\uffff\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "\1\57\11\36\4\uffff\1\56",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\63",
            "\1\64",
            "",
            "\1\65",
            "",
            "",
            "",
            "\1\67",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "",
            "\1\40\1\77\1\uffff\12\75\7\uffff\32\40\4\uffff\1\40\1\uffff"+
            "\32\40",
            "\1\40\1\77\1\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff"+
            "\32\40",
            "",
            "",
            "",
            "",
            "\1\100\6\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\77",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "",
            "",
            "\1\116",
            "\1\117",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\40\1\77\1\uffff\12\75\7\uffff\32\40\4\uffff\1\40\1\uffff"+
            "\32\40",
            "",
            "",
            "\1\126",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\157",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\u0081",
            "\1\u0082",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\u0084",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\u0086",
            "\1\u0087",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\u0089",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "",
            "\1\u008b",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\u00a1",
            "\1\u00a2",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\1\40\2\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | COMMENT | INTEGER | FLOAT | TEXT | WHITESPACE | LINEBREAK | QUOTED_34_34 );";
        }
    }
 

}