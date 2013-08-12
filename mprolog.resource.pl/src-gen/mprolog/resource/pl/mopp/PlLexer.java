// $ANTLR ${project.version} ${buildNumber}

	package mprolog.resource.pl.mopp;


import org.antlr.runtime3_3_0.*;

public class PlLexer extends Lexer {
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

    	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public PlLexer() {;} 
    public PlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Pl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pl.g:16:7: ( ':-' )
            // Pl.g:16:9: ':-'
            {
            match(":-"); 


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
            // Pl.g:17:7: ( '.' )
            // Pl.g:17:9: '.'
            {
            match('.'); 

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
            // Pl.g:18:7: ( ',' )
            // Pl.g:18:9: ','
            {
            match(','); 

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
            // Pl.g:19:7: ( '(' )
            // Pl.g:19:9: '('
            {
            match('('); 

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
            // Pl.g:20:7: ( ')' )
            // Pl.g:20:9: ')'
            {
            match(')'); 

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
            // Pl.g:21:7: ( '[' )
            // Pl.g:21:9: '['
            {
            match('['); 

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
            // Pl.g:22:7: ( '|' )
            // Pl.g:22:9: '|'
            {
            match('|'); 

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
            // Pl.g:23:7: ( ']' )
            // Pl.g:23:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pl.g:1807:8: ( ( '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Pl.g:1808:2: ( '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Pl.g:1808:2: ( '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Pl.g:1808:3: '%' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match('%'); 
            // Pl.g:1808:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Pl.g:1808:7: ~ ( '\\n' | '\\r' | '\\uffff' )
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

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pl.g:1811:9: ( ( ( 'A' .. 'Z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )* ) )
            // Pl.g:1812:2: ( ( 'A' .. 'Z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )* )
            {
            // Pl.g:1812:2: ( ( 'A' .. 'Z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )* )
            // Pl.g:1812:3: ( 'A' .. 'Z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Pl.g:1812:20: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Pl.g:
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
            	    break loop2;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "ATOM"
    public final void mATOM() throws RecognitionException {
        try {
            int _type = ATOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pl.g:1814:5: ( ( ( 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )* ) )
            // Pl.g:1815:2: ( ( 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )* )
            {
            // Pl.g:1815:2: ( ( 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )* )
            // Pl.g:1815:3: ( 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )*
            {
            // Pl.g:1815:3: ( 'a' .. 'z' )
            // Pl.g:1815:5: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // Pl.g:1815:15: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '-' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-'||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Pl.g:
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
            	    break loop3;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ATOM"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pl.g:1817:7: ( ( ( '0' .. '9' ) ) )
            // Pl.g:1818:2: ( ( '0' .. '9' ) )
            {
            // Pl.g:1818:2: ( ( '0' .. '9' ) )
            // Pl.g:1818:3: ( '0' .. '9' )
            {
            // Pl.g:1818:3: ( '0' .. '9' )
            // Pl.g:1818:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pl.g:1820:9: ( ( ( '=' ( '=' | '..' )? | '/' | '>' | '<' | '\\\\=' ( '=' )? ) ) )
            // Pl.g:1821:2: ( ( '=' ( '=' | '..' )? | '/' | '>' | '<' | '\\\\=' ( '=' )? ) )
            {
            // Pl.g:1821:2: ( ( '=' ( '=' | '..' )? | '/' | '>' | '<' | '\\\\=' ( '=' )? ) )
            // Pl.g:1821:3: ( '=' ( '=' | '..' )? | '/' | '>' | '<' | '\\\\=' ( '=' )? )
            {
            // Pl.g:1821:3: ( '=' ( '=' | '..' )? | '/' | '>' | '<' | '\\\\=' ( '=' )? )
            int alt6=5;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt6=1;
                }
                break;
            case '/':
                {
                alt6=2;
                }
                break;
            case '>':
                {
                alt6=3;
                }
                break;
            case '<':
                {
                alt6=4;
                }
                break;
            case '\\':
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // Pl.g:1821:4: '=' ( '=' | '..' )?
                    {
                    match('='); 
                    // Pl.g:1821:7: ( '=' | '..' )?
                    int alt4=3;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='=') ) {
                        alt4=1;
                    }
                    else if ( (LA4_0=='.') ) {
                        alt4=2;
                    }
                    switch (alt4) {
                        case 1 :
                            // Pl.g:1821:8: '='
                            {
                            match('='); 

                            }
                            break;
                        case 2 :
                            // Pl.g:1821:12: '..'
                            {
                            match(".."); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Pl.g:1821:21: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // Pl.g:1821:27: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // Pl.g:1821:33: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 5 :
                    // Pl.g:1821:39: '\\\\=' ( '=' )?
                    {
                    match("\\="); 

                    // Pl.g:1821:44: ( '=' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='=') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Pl.g:1821:45: '='
                            {
                            match('='); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pl.g:1823:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ ) )
            // Pl.g:1824:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            {
            // Pl.g:1824:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // Pl.g:1824:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // Pl.g:1824:3: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Pl.g:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "TEXT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pl.g:1827:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Pl.g:1828:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Pl.g:1828:2: ( ( ' ' | '\\t' | '\\f' ) )
            // Pl.g:1828:3: ( ' ' | '\\t' | '\\f' )
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
            // Pl.g:1831:10: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Pl.g:1832:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Pl.g:1832:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Pl.g:1832:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Pl.g:1832:3: ( '\\r\\n' | '\\r' | '\\n' )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\r') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='\n') ) {
                    alt8=1;
                }
                else {
                    alt8=2;}
            }
            else if ( (LA8_0=='\n') ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Pl.g:1832:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Pl.g:1832:13: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Pl.g:1832:20: '\\n'
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

    // $ANTLR start "QUOTED_39_39"
    public final void mQUOTED_39_39() throws RecognitionException {
        try {
            int _type = QUOTED_39_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pl.g:1835:13: ( ( ( '\\'' ) (~ ( '\\'' ) )* ( '\\'' ) ) )
            // Pl.g:1836:2: ( ( '\\'' ) (~ ( '\\'' ) )* ( '\\'' ) )
            {
            // Pl.g:1836:2: ( ( '\\'' ) (~ ( '\\'' ) )* ( '\\'' ) )
            // Pl.g:1836:3: ( '\\'' ) (~ ( '\\'' ) )* ( '\\'' )
            {
            // Pl.g:1836:3: ( '\\'' )
            // Pl.g:1836:4: '\\''
            {
            match('\''); 

            }

            // Pl.g:1836:9: (~ ( '\\'' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Pl.g:1836:10: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // Pl.g:1836:19: ( '\\'' )
            // Pl.g:1836:20: '\\''
            {
            match('\''); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTED_39_39"

    public void mTokens() throws RecognitionException {
        // Pl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | COMMENT | VARIABLE | ATOM | NUMBER | OPERATOR | TEXT | WHITESPACE | LINEBREAK | QUOTED_39_39 )
        int alt10=17;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // Pl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // Pl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // Pl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // Pl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // Pl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // Pl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // Pl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // Pl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // Pl.g:1:58: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 10 :
                // Pl.g:1:66: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 11 :
                // Pl.g:1:75: ATOM
                {
                mATOM(); 

                }
                break;
            case 12 :
                // Pl.g:1:80: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 13 :
                // Pl.g:1:87: OPERATOR
                {
                mOPERATOR(); 

                }
                break;
            case 14 :
                // Pl.g:1:96: TEXT
                {
                mTEXT(); 

                }
                break;
            case 15 :
                // Pl.g:1:101: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 16 :
                // Pl.g:1:112: LINEBREAK
                {
                mLINEBREAK(); 

                }
                break;
            case 17 :
                // Pl.g:1:122: QUOTED_39_39
                {
                mQUOTED_39_39(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\12\uffff\1\23\1\25\1\26\5\uffff\1\23\1\uffff\1\25\2\uffff";
    static final String DFA10_eofS =
        "\27\uffff";
    static final String DFA10_minS =
        "\1\11\11\uffff\3\55\5\uffff\1\55\1\uffff\1\55\2\uffff";
    static final String DFA10_maxS =
        "\1\174\11\uffff\3\172\5\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\1\15\1\16"+
        "\1\17\1\20\1\21\1\uffff\1\12\1\uffff\1\13\1\14";
    static final String DFA10_specialS =
        "\27\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\17\1\20\1\uffff\1\17\1\20\22\uffff\1\17\4\uffff\1\11\1\uffff"+
            "\1\21\1\4\1\5\2\uffff\1\3\1\16\1\2\1\15\12\14\1\1\1\uffff\3"+
            "\15\2\uffff\32\12\1\6\1\15\1\10\1\uffff\1\12\1\uffff\32\13\1"+
            "\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32"+
            "\16",
            "",
            "",
            "",
            "",
            "",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "",
            "\1\24\2\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | COMMENT | VARIABLE | ATOM | NUMBER | OPERATOR | TEXT | WHITESPACE | LINEBREAK | QUOTED_39_39 );";
        }
    }
 

}