package org.xtext.pascal.program.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoFkdLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_VISIBILITY_SUPPORTED=14;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=15;
    public static final int RULE_REAL_NUMBER=11;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_NUMERIC_SUBRANGE=13;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=17;
    public static final int RULE_SIGNED_REAL_NUMBER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=19;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_INTEGER_NUMBER=6;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_RELATIONAL_OPERATOR=7;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=20;
    public static final int RULE_DIGIT_SEQUENCE=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=21;
    public static final int RULE_MULTIPLICATION_OPERATOR=9;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_SIGNED_INTEGER_NUMBER=5;
    public static final int T__48=48;
    public static final int RULE_ADDITION_OPERATOR=8;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalDemoFkdLexer() {;} 
    public InternalDemoFkdLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDemoFkdLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDemoFkd.g"; }

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:11:7: ( 'package' )
            // InternalDemoFkd.g:11:9: 'package'
            {
            match("package"); 


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
            // InternalDemoFkd.g:12:7: ( '{' )
            // InternalDemoFkd.g:12:9: '{'
            {
            match('{'); 

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
            // InternalDemoFkd.g:13:7: ( '}' )
            // InternalDemoFkd.g:13:9: '}'
            {
            match('}'); 

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
            // InternalDemoFkd.g:14:7: ( '.' )
            // InternalDemoFkd.g:14:9: '.'
            {
            match('.'); 

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
            // InternalDemoFkd.g:15:7: ( 'import' )
            // InternalDemoFkd.g:15:9: 'import'
            {
            match("import"); 


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
            // InternalDemoFkd.g:16:7: ( '.*' )
            // InternalDemoFkd.g:16:9: '.*'
            {
            match(".*"); 


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
            // InternalDemoFkd.g:17:7: ( 'program' )
            // InternalDemoFkd.g:17:9: 'program'
            {
            match("program"); 


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
            // InternalDemoFkd.g:18:7: ( '(' )
            // InternalDemoFkd.g:18:9: '('
            {
            match('('); 

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
            // InternalDemoFkd.g:19:7: ( ')' )
            // InternalDemoFkd.g:19:9: ')'
            {
            match(')'); 

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
            // InternalDemoFkd.g:20:7: ( ';' )
            // InternalDemoFkd.g:20:9: ';'
            {
            match(';'); 

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
            // InternalDemoFkd.g:21:7: ( ',' )
            // InternalDemoFkd.g:21:9: ','
            {
            match(','); 

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
            // InternalDemoFkd.g:22:7: ( 'uses' )
            // InternalDemoFkd.g:22:9: 'uses'
            {
            match("uses"); 


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
            // InternalDemoFkd.g:23:7: ( 'begin' )
            // InternalDemoFkd.g:23:9: 'begin'
            {
            match("begin"); 


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
            // InternalDemoFkd.g:24:7: ( 'end' )
            // InternalDemoFkd.g:24:9: 'end'
            {
            match("end"); 


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
            // InternalDemoFkd.g:25:7: ( ':' )
            // InternalDemoFkd.g:25:9: ':'
            {
            match(':'); 

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
            // InternalDemoFkd.g:26:7: ( ':=' )
            // InternalDemoFkd.g:26:9: ':='
            {
            match(":="); 


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
            // InternalDemoFkd.g:27:7: ( '[' )
            // InternalDemoFkd.g:27:9: '['
            {
            match('['); 

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
            // InternalDemoFkd.g:28:7: ( ']' )
            // InternalDemoFkd.g:28:9: ']'
            {
            match(']'); 

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
            // InternalDemoFkd.g:29:7: ( '^' )
            // InternalDemoFkd.g:29:9: '^'
            {
            match('^'); 

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
            // InternalDemoFkd.g:30:7: ( 'in' )
            // InternalDemoFkd.g:30:9: 'in'
            {
            match("in"); 


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
            // InternalDemoFkd.g:31:7: ( '=' )
            // InternalDemoFkd.g:31:9: '='
            {
            match('='); 

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
            // InternalDemoFkd.g:32:7: ( 'or' )
            // InternalDemoFkd.g:32:9: 'or'
            {
            match("or"); 


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
            // InternalDemoFkd.g:33:7: ( 'div' )
            // InternalDemoFkd.g:33:9: 'div'
            {
            match("div"); 


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
            // InternalDemoFkd.g:34:7: ( 'mod' )
            // InternalDemoFkd.g:34:9: 'mod'
            {
            match("mod"); 


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
            // InternalDemoFkd.g:35:7: ( 'and' )
            // InternalDemoFkd.g:35:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:36:7: ( 'nil' )
            // InternalDemoFkd.g:36:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:37:7: ( 'true' )
            // InternalDemoFkd.g:37:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:38:7: ( 'false' )
            // InternalDemoFkd.g:38:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:39:7: ( 'not' )
            // InternalDemoFkd.g:39:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:40:7: ( 'while' )
            // InternalDemoFkd.g:40:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:41:7: ( 'do' )
            // InternalDemoFkd.g:41:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:42:7: ( 'repeat' )
            // InternalDemoFkd.g:42:9: 'repeat'
            {
            match("repeat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:43:7: ( 'until' )
            // InternalDemoFkd.g:43:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:44:7: ( 'for' )
            // InternalDemoFkd.g:44:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:45:7: ( 'to' )
            // InternalDemoFkd.g:45:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:46:7: ( 'downto' )
            // InternalDemoFkd.g:46:9: 'downto'
            {
            match("downto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:47:7: ( 'if' )
            // InternalDemoFkd.g:47:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:48:7: ( 'then' )
            // InternalDemoFkd.g:48:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:49:7: ( 'else' )
            // InternalDemoFkd.g:49:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:50:7: ( 'case' )
            // InternalDemoFkd.g:50:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:51:7: ( 'of' )
            // InternalDemoFkd.g:51:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:52:7: ( 'with' )
            // InternalDemoFkd.g:52:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:53:7: ( 'goto' )
            // InternalDemoFkd.g:53:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:54:7: ( 'label' )
            // InternalDemoFkd.g:54:9: 'label'
            {
            match("label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:55:7: ( 'const' )
            // InternalDemoFkd.g:55:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:56:7: ( 'type' )
            // InternalDemoFkd.g:56:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:57:7: ( '..' )
            // InternalDemoFkd.g:57:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:58:7: ( 'packed' )
            // InternalDemoFkd.g:58:9: 'packed'
            {
            match("packed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:59:7: ( 'array' )
            // InternalDemoFkd.g:59:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:60:7: ( 'record' )
            // InternalDemoFkd.g:60:9: 'record'
            {
            match("record"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:61:7: ( 'class' )
            // InternalDemoFkd.g:61:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:62:7: ( 'set' )
            // InternalDemoFkd.g:62:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:63:7: ( 'file' )
            // InternalDemoFkd.g:63:9: 'file'
            {
            match("file"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:64:7: ( 'var' )
            // InternalDemoFkd.g:64:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:65:7: ( 'forward' )
            // InternalDemoFkd.g:65:9: 'forward'
            {
            match("forward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:66:7: ( 'procedure' )
            // InternalDemoFkd.g:66:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:67:7: ( 'function' )
            // InternalDemoFkd.g:67:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "RULE_VISIBILITY_SUPPORTED"
    public final void mRULE_VISIBILITY_SUPPORTED() throws RecognitionException {
        try {
            int _type = RULE_VISIBILITY_SUPPORTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6753:27: ( ( 'private' | 'public' | 'protected' ) )
            // InternalDemoFkd.g:6753:29: ( 'private' | 'public' | 'protected' )
            {
            // InternalDemoFkd.g:6753:29: ( 'private' | 'public' | 'protected' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='p') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='r') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='i') ) {
                        alt1=1;
                    }
                    else if ( (LA1_2=='o') ) {
                        alt1=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_1=='u') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDemoFkd.g:6753:30: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6753:40: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:6753:49: 'protected'
                    {
                    match("protected"); 


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
    // $ANTLR end "RULE_VISIBILITY_SUPPORTED"

    // $ANTLR start "RULE_NUMERIC_SUBRANGE"
    public final void mRULE_NUMERIC_SUBRANGE() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_SUBRANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6755:23: ( ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..' )
            // InternalDemoFkd.g:6755:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..'
            {
            // InternalDemoFkd.g:6755:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDemoFkd.g:6755:26: RULE_INTEGER_NUMBER
                    {
                    mRULE_INTEGER_NUMBER(); 

                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6755:46: RULE_REAL_NUMBER
                    {
                    mRULE_REAL_NUMBER(); 

                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:6755:63: RULE_SIGNED_INTEGER_NUMBER
                    {
                    mRULE_SIGNED_INTEGER_NUMBER(); 

                    }
                    break;
                case 4 :
                    // InternalDemoFkd.g:6755:90: RULE_SIGNED_REAL_NUMBER
                    {
                    mRULE_SIGNED_REAL_NUMBER(); 

                    }
                    break;

            }

            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERIC_SUBRANGE"

    // $ANTLR start "RULE_ADDITION_OPERATOR"
    public final void mRULE_ADDITION_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_ADDITION_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6757:24: ( ( '+' | '-' ) )
            // InternalDemoFkd.g:6757:26: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADDITION_OPERATOR"

    // $ANTLR start "RULE_MULTIPLICATION_OPERATOR"
    public final void mRULE_MULTIPLICATION_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLICATION_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6759:30: ( ( '*' | '/' ) )
            // InternalDemoFkd.g:6759:32: ( '*' | '/' )
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLICATION_OPERATOR"

    // $ANTLR start "RULE_RELATIONAL_OPERATOR"
    public final void mRULE_RELATIONAL_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_RELATIONAL_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6761:26: ( ( '=' | '<>' | '<' | '<=' | '>' | '>=' ) )
            // InternalDemoFkd.g:6761:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            {
            // InternalDemoFkd.g:6761:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt3=1;
                }
                break;
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt3=2;
                    }
                    break;
                case '=':
                    {
                    alt3=4;
                    }
                    break;
                default:
                    alt3=3;}

                }
                break;
            case '>':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='=') ) {
                    alt3=6;
                }
                else {
                    alt3=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDemoFkd.g:6761:29: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6761:33: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:6761:38: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalDemoFkd.g:6761:42: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalDemoFkd.g:6761:47: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalDemoFkd.g:6761:51: '>='
                    {
                    match(">="); 


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
    // $ANTLR end "RULE_RELATIONAL_OPERATOR"

    // $ANTLR start "RULE_SIGNED_INTEGER_NUMBER"
    public final void mRULE_SIGNED_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6763:28: ( RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER )
            // InternalDemoFkd.g:6763:30: RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER
            {
            mRULE_ADDITION_OPERATOR(); 
            mRULE_INTEGER_NUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INTEGER_NUMBER"

    // $ANTLR start "RULE_INTEGER_NUMBER"
    public final void mRULE_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6765:21: ( RULE_UNSIGNED_DIGIT_SEQUENCE )
            // InternalDemoFkd.g:6765:23: RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_NUMBER"

    // $ANTLR start "RULE_SIGNED_REAL_NUMBER"
    public final void mRULE_SIGNED_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6767:25: ( RULE_ADDITION_OPERATOR RULE_REAL_NUMBER )
            // InternalDemoFkd.g:6767:27: RULE_ADDITION_OPERATOR RULE_REAL_NUMBER
            {
            mRULE_ADDITION_OPERATOR(); 
            mRULE_REAL_NUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_REAL_NUMBER"

    // $ANTLR start "RULE_REAL_NUMBER"
    public final void mRULE_REAL_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_REAL_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6769:18: ( ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE ) )
            // InternalDemoFkd.g:6769:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            {
            // InternalDemoFkd.g:6769:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalDemoFkd.g:6769:21: RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    {
                    mRULE_UNSIGNED_DIGIT_SEQUENCE(); 
                    match('.'); 
                    // InternalDemoFkd.g:6769:54: ( RULE_UNSIGNED_DIGIT_SEQUENCE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalDemoFkd.g:6769:54: RULE_UNSIGNED_DIGIT_SEQUENCE
                            {
                            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                            }
                            break;

                    }

                    // InternalDemoFkd.g:6769:84: ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDemoFkd.g:6769:85: ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
                            {
                            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            mRULE_DIGIT_SEQUENCE(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6769:117: RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
                    {
                    mRULE_UNSIGNED_DIGIT_SEQUENCE(); 
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mRULE_DIGIT_SEQUENCE(); 

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
    // $ANTLR end "RULE_REAL_NUMBER"

    // $ANTLR start "RULE_UNSIGNED_DIGIT_SEQUENCE"
    public final void mRULE_UNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            // InternalDemoFkd.g:6771:39: ( ( RULE_DIGIT )+ )
            // InternalDemoFkd.g:6771:41: ( RULE_DIGIT )+
            {
            // InternalDemoFkd.g:6771:41: ( RULE_DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDemoFkd.g:6771:41: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_DIGIT_SEQUENCE"
    public final void mRULE_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            // InternalDemoFkd.g:6773:30: ( ( RULE_ADDITION_OPERATOR )? RULE_UNSIGNED_DIGIT_SEQUENCE )
            // InternalDemoFkd.g:6773:32: ( RULE_ADDITION_OPERATOR )? RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            // InternalDemoFkd.g:6773:32: ( RULE_ADDITION_OPERATOR )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='+'||LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDemoFkd.g:6773:32: RULE_ADDITION_OPERATOR
                    {
                    mRULE_ADDITION_OPERATOR(); 

                    }
                    break;

            }

            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalDemoFkd.g:6775:21: ( '0' .. '9' )
            // InternalDemoFkd.g:6775:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6777:17: ( ( '(*' ( options {greedy=false; } : . )* '*)' | '{' ( options {greedy=false; } : . )* '}' ) )
            // InternalDemoFkd.g:6777:19: ( '(*' ( options {greedy=false; } : . )* '*)' | '{' ( options {greedy=false; } : . )* '}' )
            {
            // InternalDemoFkd.g:6777:19: ( '(*' ( options {greedy=false; } : . )* '*)' | '{' ( options {greedy=false; } : . )* '}' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='(') ) {
                alt11=1;
            }
            else if ( (LA11_0=='{') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDemoFkd.g:6777:20: '(*' ( options {greedy=false; } : . )* '*)'
                    {
                    match("(*"); 

                    // InternalDemoFkd.g:6777:25: ( options {greedy=false; } : . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='*') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1==')') ) {
                                alt9=2;
                            }
                            else if ( ((LA9_1>='\u0000' && LA9_1<='(')||(LA9_1>='*' && LA9_1<='\uFFFF')) ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDemoFkd.g:6777:53: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match("*)"); 


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6777:62: '{' ( options {greedy=false; } : . )* '}'
                    {
                    match('{'); 
                    // InternalDemoFkd.g:6777:66: ( options {greedy=false; } : . )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='}') ) {
                            alt10=2;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='|')||(LA10_0>='~' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDemoFkd.g:6777:94: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('}'); 

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
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6779:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDemoFkd.g:6779:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDemoFkd.g:6779:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDemoFkd.g:6779:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDemoFkd.g:6779:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDemoFkd.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6781:10: ( ( '0' .. '9' )+ )
            // InternalDemoFkd.g:6781:12: ( '0' .. '9' )+
            {
            // InternalDemoFkd.g:6781:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDemoFkd.g:6781:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6783:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDemoFkd.g:6783:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDemoFkd.g:6783:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDemoFkd.g:6783:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDemoFkd.g:6783:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDemoFkd.g:6783:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDemoFkd.g:6783:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6783:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDemoFkd.g:6783:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalDemoFkd.g:6783:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDemoFkd.g:6783:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6785:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDemoFkd.g:6785:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDemoFkd.g:6785:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDemoFkd.g:6785:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalDemoFkd.g:6785:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDemoFkd.g:6785:41: ( '\\r' )? '\\n'
                    {
                    // InternalDemoFkd.g:6785:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalDemoFkd.g:6785:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6787:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDemoFkd.g:6787:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDemoFkd.g:6787:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDemoFkd.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:6789:16: ( . )
            // InternalDemoFkd.g:6789:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDemoFkd.g:1:8: ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_VISIBILITY_SUPPORTED | RULE_NUMERIC_SUBRANGE | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_REAL_NUMBER | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=73;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalDemoFkd.g:1:10: T__23
                {
                mT__23(); 

                }
                break;
            case 2 :
                // InternalDemoFkd.g:1:16: T__24
                {
                mT__24(); 

                }
                break;
            case 3 :
                // InternalDemoFkd.g:1:22: T__25
                {
                mT__25(); 

                }
                break;
            case 4 :
                // InternalDemoFkd.g:1:28: T__26
                {
                mT__26(); 

                }
                break;
            case 5 :
                // InternalDemoFkd.g:1:34: T__27
                {
                mT__27(); 

                }
                break;
            case 6 :
                // InternalDemoFkd.g:1:40: T__28
                {
                mT__28(); 

                }
                break;
            case 7 :
                // InternalDemoFkd.g:1:46: T__29
                {
                mT__29(); 

                }
                break;
            case 8 :
                // InternalDemoFkd.g:1:52: T__30
                {
                mT__30(); 

                }
                break;
            case 9 :
                // InternalDemoFkd.g:1:58: T__31
                {
                mT__31(); 

                }
                break;
            case 10 :
                // InternalDemoFkd.g:1:64: T__32
                {
                mT__32(); 

                }
                break;
            case 11 :
                // InternalDemoFkd.g:1:70: T__33
                {
                mT__33(); 

                }
                break;
            case 12 :
                // InternalDemoFkd.g:1:76: T__34
                {
                mT__34(); 

                }
                break;
            case 13 :
                // InternalDemoFkd.g:1:82: T__35
                {
                mT__35(); 

                }
                break;
            case 14 :
                // InternalDemoFkd.g:1:88: T__36
                {
                mT__36(); 

                }
                break;
            case 15 :
                // InternalDemoFkd.g:1:94: T__37
                {
                mT__37(); 

                }
                break;
            case 16 :
                // InternalDemoFkd.g:1:100: T__38
                {
                mT__38(); 

                }
                break;
            case 17 :
                // InternalDemoFkd.g:1:106: T__39
                {
                mT__39(); 

                }
                break;
            case 18 :
                // InternalDemoFkd.g:1:112: T__40
                {
                mT__40(); 

                }
                break;
            case 19 :
                // InternalDemoFkd.g:1:118: T__41
                {
                mT__41(); 

                }
                break;
            case 20 :
                // InternalDemoFkd.g:1:124: T__42
                {
                mT__42(); 

                }
                break;
            case 21 :
                // InternalDemoFkd.g:1:130: T__43
                {
                mT__43(); 

                }
                break;
            case 22 :
                // InternalDemoFkd.g:1:136: T__44
                {
                mT__44(); 

                }
                break;
            case 23 :
                // InternalDemoFkd.g:1:142: T__45
                {
                mT__45(); 

                }
                break;
            case 24 :
                // InternalDemoFkd.g:1:148: T__46
                {
                mT__46(); 

                }
                break;
            case 25 :
                // InternalDemoFkd.g:1:154: T__47
                {
                mT__47(); 

                }
                break;
            case 26 :
                // InternalDemoFkd.g:1:160: T__48
                {
                mT__48(); 

                }
                break;
            case 27 :
                // InternalDemoFkd.g:1:166: T__49
                {
                mT__49(); 

                }
                break;
            case 28 :
                // InternalDemoFkd.g:1:172: T__50
                {
                mT__50(); 

                }
                break;
            case 29 :
                // InternalDemoFkd.g:1:178: T__51
                {
                mT__51(); 

                }
                break;
            case 30 :
                // InternalDemoFkd.g:1:184: T__52
                {
                mT__52(); 

                }
                break;
            case 31 :
                // InternalDemoFkd.g:1:190: T__53
                {
                mT__53(); 

                }
                break;
            case 32 :
                // InternalDemoFkd.g:1:196: T__54
                {
                mT__54(); 

                }
                break;
            case 33 :
                // InternalDemoFkd.g:1:202: T__55
                {
                mT__55(); 

                }
                break;
            case 34 :
                // InternalDemoFkd.g:1:208: T__56
                {
                mT__56(); 

                }
                break;
            case 35 :
                // InternalDemoFkd.g:1:214: T__57
                {
                mT__57(); 

                }
                break;
            case 36 :
                // InternalDemoFkd.g:1:220: T__58
                {
                mT__58(); 

                }
                break;
            case 37 :
                // InternalDemoFkd.g:1:226: T__59
                {
                mT__59(); 

                }
                break;
            case 38 :
                // InternalDemoFkd.g:1:232: T__60
                {
                mT__60(); 

                }
                break;
            case 39 :
                // InternalDemoFkd.g:1:238: T__61
                {
                mT__61(); 

                }
                break;
            case 40 :
                // InternalDemoFkd.g:1:244: T__62
                {
                mT__62(); 

                }
                break;
            case 41 :
                // InternalDemoFkd.g:1:250: T__63
                {
                mT__63(); 

                }
                break;
            case 42 :
                // InternalDemoFkd.g:1:256: T__64
                {
                mT__64(); 

                }
                break;
            case 43 :
                // InternalDemoFkd.g:1:262: T__65
                {
                mT__65(); 

                }
                break;
            case 44 :
                // InternalDemoFkd.g:1:268: T__66
                {
                mT__66(); 

                }
                break;
            case 45 :
                // InternalDemoFkd.g:1:274: T__67
                {
                mT__67(); 

                }
                break;
            case 46 :
                // InternalDemoFkd.g:1:280: T__68
                {
                mT__68(); 

                }
                break;
            case 47 :
                // InternalDemoFkd.g:1:286: T__69
                {
                mT__69(); 

                }
                break;
            case 48 :
                // InternalDemoFkd.g:1:292: T__70
                {
                mT__70(); 

                }
                break;
            case 49 :
                // InternalDemoFkd.g:1:298: T__71
                {
                mT__71(); 

                }
                break;
            case 50 :
                // InternalDemoFkd.g:1:304: T__72
                {
                mT__72(); 

                }
                break;
            case 51 :
                // InternalDemoFkd.g:1:310: T__73
                {
                mT__73(); 

                }
                break;
            case 52 :
                // InternalDemoFkd.g:1:316: T__74
                {
                mT__74(); 

                }
                break;
            case 53 :
                // InternalDemoFkd.g:1:322: T__75
                {
                mT__75(); 

                }
                break;
            case 54 :
                // InternalDemoFkd.g:1:328: T__76
                {
                mT__76(); 

                }
                break;
            case 55 :
                // InternalDemoFkd.g:1:334: T__77
                {
                mT__77(); 

                }
                break;
            case 56 :
                // InternalDemoFkd.g:1:340: T__78
                {
                mT__78(); 

                }
                break;
            case 57 :
                // InternalDemoFkd.g:1:346: T__79
                {
                mT__79(); 

                }
                break;
            case 58 :
                // InternalDemoFkd.g:1:352: RULE_VISIBILITY_SUPPORTED
                {
                mRULE_VISIBILITY_SUPPORTED(); 

                }
                break;
            case 59 :
                // InternalDemoFkd.g:1:378: RULE_NUMERIC_SUBRANGE
                {
                mRULE_NUMERIC_SUBRANGE(); 

                }
                break;
            case 60 :
                // InternalDemoFkd.g:1:400: RULE_ADDITION_OPERATOR
                {
                mRULE_ADDITION_OPERATOR(); 

                }
                break;
            case 61 :
                // InternalDemoFkd.g:1:423: RULE_MULTIPLICATION_OPERATOR
                {
                mRULE_MULTIPLICATION_OPERATOR(); 

                }
                break;
            case 62 :
                // InternalDemoFkd.g:1:452: RULE_RELATIONAL_OPERATOR
                {
                mRULE_RELATIONAL_OPERATOR(); 

                }
                break;
            case 63 :
                // InternalDemoFkd.g:1:477: RULE_SIGNED_INTEGER_NUMBER
                {
                mRULE_SIGNED_INTEGER_NUMBER(); 

                }
                break;
            case 64 :
                // InternalDemoFkd.g:1:504: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 65 :
                // InternalDemoFkd.g:1:524: RULE_SIGNED_REAL_NUMBER
                {
                mRULE_SIGNED_REAL_NUMBER(); 

                }
                break;
            case 66 :
                // InternalDemoFkd.g:1:548: RULE_REAL_NUMBER
                {
                mRULE_REAL_NUMBER(); 

                }
                break;
            case 67 :
                // InternalDemoFkd.g:1:565: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 68 :
                // InternalDemoFkd.g:1:581: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 69 :
                // InternalDemoFkd.g:1:589: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // InternalDemoFkd.g:1:598: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 71 :
                // InternalDemoFkd.g:1:610: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // InternalDemoFkd.g:1:626: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // InternalDemoFkd.g:1:634: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA2_eotS =
        "\6\uffff\1\11\3\uffff\1\13\1\uffff";
    static final String DFA2_eofS =
        "\14\uffff";
    static final String DFA2_minS =
        "\1\53\1\56\1\60\1\56\1\uffff\3\56\2\uffff\1\56\1\uffff";
    static final String DFA2_maxS =
        "\1\71\1\145\1\71\1\145\1\uffff\1\145\1\56\1\145\2\uffff\1\56\1\uffff";
    static final String DFA2_acceptS =
        "\4\uffff\1\2\3\uffff\1\4\1\1\1\uffff\1\3";
    static final String DFA2_specialS =
        "\14\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\uffff\1\2\2\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "\12\5",
            "\1\6\1\uffff\12\4\13\uffff\1\4\37\uffff\1\4",
            "",
            "\1\7\1\uffff\12\5\13\uffff\1\10\37\uffff\1\10",
            "\1\4",
            "\1\12\1\uffff\12\10\13\uffff\1\10\37\uffff\1\10",
            "",
            "",
            "\1\10",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "6755:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )";
        }
    }
    static final String DFA6_eotS =
        "\4\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA6_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\4\uffff}>";
    static final String[] DFA6_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "6769:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )";
        }
    }
    static final String DFA22_eotS =
        "\1\uffff\1\56\1\60\1\uffff\1\64\1\56\1\70\3\uffff\3\56\1\102\2\uffff\1\105\1\uffff\16\56\1\142\1\146\1\151\3\uffff\2\52\3\uffff\3\56\7\uffff\1\56\1\162\1\163\4\uffff\5\56\6\uffff\1\171\1\172\1\56\1\175\6\56\1\u0084\20\56\1\uffff\1\142\1\u0099\2\uffff\1\u009c\5\uffff\5\56\2\uffff\3\56\1\u00a9\1\56\2\uffff\1\u00ab\1\56\1\uffff\1\u00ad\1\u00ae\1\56\1\u00b0\1\u00b1\1\56\1\uffff\3\56\1\u00b7\13\56\1\u00c3\1\u00c4\1\uffff\1\u0099\3\uffff\1\u0099\1\uffff\1\u00c9\1\uffff\7\56\1\u00d4\2\56\1\uffff\1\u00d7\1\uffff\1\56\2\uffff\1\56\2\uffff\1\u00da\1\u00db\1\u00dc\2\56\1\uffff\1\u00df\2\56\1\u00e2\2\56\1\u00e5\2\56\1\u00e8\1\56\3\uffff\1\u0099\1\u00c9\3\uffff\1\u00c9\10\56\1\uffff\1\u00f4\1\u00f5\1\uffff\1\56\1\u00f7\3\uffff\1\u00f8\1\56\1\uffff\1\56\1\u00fb\1\uffff\2\56\1\uffff\1\u00fe\1\u00ff\1\uffff\1\u0100\1\uffff\1\u00c9\1\56\1\u0102\4\56\1\u0107\1\u0108\2\uffff\1\u0109\2\uffff\2\56\1\uffff\1\u010c\1\u010d\3\uffff\1\u010e\1\uffff\1\u010f\2\56\1\u0107\3\uffff\1\u0112\1\56\4\uffff\2\56\1\uffff\1\u0116\1\u0117\1\u0107\2\uffff";
    static final String DFA22_eofS =
        "\u0118\uffff";
    static final String DFA22_minS =
        "\1\0\1\141\1\0\1\uffff\1\52\1\146\1\52\3\uffff\1\156\1\145\1\154\1\75\2\uffff\1\101\1\uffff\1\146\1\151\1\157\1\156\1\151\1\150\1\141\1\150\1\145\1\141\1\157\1\141\1\145\1\141\1\56\1\60\1\57\3\uffff\2\0\3\uffff\1\143\1\151\1\142\7\uffff\1\160\2\60\4\uffff\1\145\1\164\1\147\1\144\1\163\6\uffff\2\60\1\166\1\60\2\144\1\162\1\154\1\164\1\165\1\60\1\145\1\160\1\154\1\162\1\154\1\156\1\151\1\164\1\143\1\163\1\156\1\141\1\164\1\142\1\164\1\162\1\uffff\2\56\1\53\1\uffff\1\56\5\uffff\1\153\1\143\1\166\1\154\1\157\2\uffff\1\163\2\151\1\60\1\145\2\uffff\1\60\1\156\1\uffff\2\60\1\141\2\60\1\145\1\uffff\1\156\1\145\1\163\1\60\1\145\1\143\1\154\1\150\1\145\1\157\1\145\2\163\1\157\1\145\2\60\1\uffff\1\56\1\53\1\uffff\1\60\1\56\1\uffff\1\56\1\53\1\141\1\162\2\145\1\141\1\151\1\162\1\60\1\154\1\156\1\uffff\1\60\1\uffff\1\164\2\uffff\1\171\2\uffff\3\60\1\145\1\141\1\uffff\1\60\1\164\1\145\1\60\1\141\1\162\1\60\1\164\1\163\1\60\1\154\2\uffff\1\60\2\56\1\53\1\uffff\1\60\1\56\1\147\1\144\1\141\1\144\1\143\1\164\1\143\1\164\1\uffff\2\60\1\uffff\1\157\1\60\3\uffff\1\60\1\162\1\uffff\1\151\1\60\1\uffff\1\164\1\144\1\uffff\2\60\1\uffff\2\60\1\56\1\145\1\60\1\155\1\165\1\164\1\145\2\60\2\uffff\1\60\2\uffff\1\144\1\157\1\uffff\2\60\3\uffff\1\60\1\uffff\1\60\1\162\1\145\1\60\3\uffff\1\60\1\156\4\uffff\1\145\1\144\1\uffff\3\60\2\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\165\1\uffff\1\uffff\1\56\1\156\1\52\3\uffff\1\163\1\145\1\156\1\75\2\uffff\1\172\1\uffff\1\162\2\157\1\162\1\157\1\171\1\165\1\151\1\145\2\157\1\141\1\145\1\141\1\145\1\71\1\57\3\uffff\2\uffff\3\uffff\1\143\1\157\1\142\7\uffff\1\160\2\172\4\uffff\1\145\1\164\1\147\1\144\1\163\6\uffff\2\172\1\166\1\172\2\144\1\162\1\154\1\164\1\165\1\172\1\145\1\160\1\154\1\162\1\154\1\156\1\151\1\164\1\160\1\163\1\156\1\141\1\164\1\142\1\164\1\162\1\uffff\2\145\1\71\1\uffff\1\145\5\uffff\1\153\1\164\1\166\1\154\1\157\2\uffff\1\163\2\151\1\172\1\145\2\uffff\1\172\1\156\1\uffff\2\172\1\141\2\172\1\145\1\uffff\1\156\1\145\1\163\1\172\1\145\1\143\1\154\1\150\1\145\1\157\1\145\2\163\1\157\1\145\2\172\1\uffff\1\145\1\71\1\uffff\2\71\1\uffff\1\145\1\71\1\145\1\162\2\145\1\141\1\151\1\162\1\172\1\154\1\156\1\uffff\1\172\1\uffff\1\164\2\uffff\1\171\2\uffff\3\172\1\145\1\141\1\uffff\1\172\1\164\1\145\1\172\1\141\1\162\1\172\1\164\1\163\1\172\1\154\2\uffff\2\71\1\145\1\71\1\uffff\2\71\1\147\1\144\1\141\1\144\1\143\1\164\1\143\1\164\1\uffff\2\172\1\uffff\1\157\1\172\3\uffff\1\172\1\162\1\uffff\1\151\1\172\1\uffff\1\164\1\144\1\uffff\2\172\1\uffff\1\172\2\71\1\145\1\172\1\155\1\165\1\164\1\145\2\172\2\uffff\1\172\2\uffff\1\144\1\157\1\uffff\2\172\3\uffff\1\172\1\uffff\1\172\1\162\1\145\1\172\3\uffff\1\172\1\156\4\uffff\1\145\1\144\1\uffff\3\172\2\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\3\3\uffff\1\11\1\12\1\13\4\uffff\1\21\1\22\1\uffff\1\25\21\uffff\2\76\1\104\2\uffff\1\75\1\110\1\111\3\uffff\1\104\1\103\1\2\1\3\1\6\1\57\1\4\3\uffff\1\10\1\11\1\12\1\13\5\uffff\1\20\1\17\1\21\1\22\1\23\1\25\33\uffff\1\100\3\uffff\1\74\1\uffff\1\107\1\75\1\76\1\106\1\110\5\uffff\1\24\1\45\5\uffff\1\26\1\51\2\uffff\1\37\6\uffff\1\43\21\uffff\1\73\2\uffff\1\102\2\uffff\1\77\14\uffff\1\16\1\uffff\1\27\1\uffff\1\30\1\31\1\uffff\1\32\1\35\5\uffff\1\42\13\uffff\1\64\1\66\4\uffff\1\101\12\uffff\1\14\2\uffff\1\47\2\uffff\1\33\1\46\1\56\2\uffff\1\65\2\uffff\1\52\2\uffff\1\50\2\uffff\1\53\13\uffff\1\41\1\15\1\uffff\1\61\1\34\2\uffff\1\36\2\uffff\1\55\1\63\1\54\1\uffff\1\60\4\uffff\1\72\1\5\1\44\2\uffff\1\40\1\62\1\1\1\7\2\uffff\1\67\3\uffff\1\71\1\70";
    static final String DFA22_specialS =
        "\1\1\1\uffff\1\3\43\uffff\1\0\1\2\u00f0\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\52\1\46\4\52\1\47\1\6\1\7\1\50\1\41\1\11\1\41\1\4\1\42\12\40\1\15\1\10\1\43\1\21\1\44\2\52\32\45\1\16\1\52\1\17\1\20\1\45\1\52\1\25\1\13\1\33\1\23\1\14\1\30\1\34\1\45\1\5\2\45\1\35\1\24\1\26\1\22\1\1\1\45\1\32\1\36\1\27\1\12\1\37\1\31\3\45\1\2\1\52\1\3\uff82\52",
            "\1\53\20\uffff\1\54\2\uffff\1\55",
            "\0\57",
            "",
            "\1\62\3\uffff\1\63",
            "\1\67\6\uffff\1\65\1\66",
            "\1\57",
            "",
            "",
            "",
            "\1\75\4\uffff\1\74",
            "\1\76",
            "\1\100\1\uffff\1\77",
            "\1\101",
            "",
            "",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\110\13\uffff\1\107",
            "\1\111\5\uffff\1\112",
            "\1\113",
            "\1\114\3\uffff\1\115",
            "\1\116\5\uffff\1\117",
            "\1\122\6\uffff\1\121\2\uffff\1\120\6\uffff\1\123",
            "\1\124\7\uffff\1\126\5\uffff\1\125\5\uffff\1\127",
            "\1\130\1\131",
            "\1\132",
            "\1\133\12\uffff\1\135\2\uffff\1\134",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\144\1\uffff\12\143\13\uffff\1\145\37\uffff\1\145",
            "\12\147",
            "\1\150",
            "",
            "",
            "",
            "\0\153",
            "\0\153",
            "",
            "",
            "",
            "\1\155",
            "\1\157\5\uffff\1\156",
            "\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\161",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\173",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\26\56\1\174\3\56",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008e\14\uffff\1\u008d",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\144\1\uffff\12\143\13\uffff\1\145\37\uffff\1\145",
            "\1\u0096\1\uffff\12\u0097\13\uffff\1\u0098\37\uffff\1\u0098",
            "\1\u009a\1\uffff\1\u009a\2\uffff\12\u009b",
            "",
            "\1\u009d\1\uffff\12\147\13\uffff\1\u009e\37\uffff\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "\1\u009f",
            "\1\u00a1\3\uffff\1\u00a0\14\uffff\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00aa",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ac",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00af",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\26\56\1\u00b6\3\56",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0096\1\uffff\12\u0097\13\uffff\1\u0098\37\uffff\1\u0098",
            "\1\u00c5\1\uffff\1\u00c5\2\uffff\12\u00c6",
            "",
            "\12\u009b",
            "\1\u0096\1\uffff\12\u009b",
            "",
            "\1\u0096\1\uffff\12\u00c7\13\uffff\1\u00c8\37\uffff\1\u00c8",
            "\1\u00ca\1\uffff\1\u00ca\2\uffff\12\u00cb",
            "\1\u00cc\3\uffff\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00d8",
            "",
            "",
            "\1\u00d9",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e0",
            "\1\u00e1",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e3",
            "\1\u00e4",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e6",
            "\1\u00e7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e9",
            "",
            "",
            "\12\u00c6",
            "\1\u0096\1\uffff\12\u00c6",
            "\1\u0096\1\uffff\12\u00c7\13\uffff\1\u00c8\37\uffff\1\u00c8",
            "\1\u00ea\1\uffff\1\u00ea\2\uffff\12\u00eb",
            "",
            "\12\u00cb",
            "\1\u0096\1\uffff\12\u00cb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00f6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\u00eb",
            "\1\u0096\1\uffff\12\u00eb",
            "\1\u0101",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u010a",
            "\1\u010b",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0110",
            "\1\u0111",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0113",
            "",
            "",
            "",
            "",
            "\1\u0114",
            "\1\u0115",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | RULE_VISIBILITY_SUPPORTED | RULE_NUMERIC_SUBRANGE | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_REAL_NUMBER | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_38 = input.LA(1);

                        s = -1;
                        if ( ((LA22_38>='\u0000' && LA22_38<='\uFFFF')) ) {s = 107;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='p') ) {s = 1;}

                        else if ( (LA22_0=='{') ) {s = 2;}

                        else if ( (LA22_0=='}') ) {s = 3;}

                        else if ( (LA22_0=='.') ) {s = 4;}

                        else if ( (LA22_0=='i') ) {s = 5;}

                        else if ( (LA22_0=='(') ) {s = 6;}

                        else if ( (LA22_0==')') ) {s = 7;}

                        else if ( (LA22_0==';') ) {s = 8;}

                        else if ( (LA22_0==',') ) {s = 9;}

                        else if ( (LA22_0=='u') ) {s = 10;}

                        else if ( (LA22_0=='b') ) {s = 11;}

                        else if ( (LA22_0=='e') ) {s = 12;}

                        else if ( (LA22_0==':') ) {s = 13;}

                        else if ( (LA22_0=='[') ) {s = 14;}

                        else if ( (LA22_0==']') ) {s = 15;}

                        else if ( (LA22_0=='^') ) {s = 16;}

                        else if ( (LA22_0=='=') ) {s = 17;}

                        else if ( (LA22_0=='o') ) {s = 18;}

                        else if ( (LA22_0=='d') ) {s = 19;}

                        else if ( (LA22_0=='m') ) {s = 20;}

                        else if ( (LA22_0=='a') ) {s = 21;}

                        else if ( (LA22_0=='n') ) {s = 22;}

                        else if ( (LA22_0=='t') ) {s = 23;}

                        else if ( (LA22_0=='f') ) {s = 24;}

                        else if ( (LA22_0=='w') ) {s = 25;}

                        else if ( (LA22_0=='r') ) {s = 26;}

                        else if ( (LA22_0=='c') ) {s = 27;}

                        else if ( (LA22_0=='g') ) {s = 28;}

                        else if ( (LA22_0=='l') ) {s = 29;}

                        else if ( (LA22_0=='s') ) {s = 30;}

                        else if ( (LA22_0=='v') ) {s = 31;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 32;}

                        else if ( (LA22_0=='+'||LA22_0=='-') ) {s = 33;}

                        else if ( (LA22_0=='/') ) {s = 34;}

                        else if ( (LA22_0=='<') ) {s = 35;}

                        else if ( (LA22_0=='>') ) {s = 36;}

                        else if ( ((LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='h'||(LA22_0>='j' && LA22_0<='k')||LA22_0=='q'||(LA22_0>='x' && LA22_0<='z')) ) {s = 37;}

                        else if ( (LA22_0=='\"') ) {s = 38;}

                        else if ( (LA22_0=='\'') ) {s = 39;}

                        else if ( (LA22_0=='*') ) {s = 40;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 41;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='&')||(LA22_0>='?' && LA22_0<='@')||LA22_0=='\\'||LA22_0=='`'||LA22_0=='|'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_39 = input.LA(1);

                        s = -1;
                        if ( ((LA22_39>='\u0000' && LA22_39<='\uFFFF')) ) {s = 107;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_2 = input.LA(1);

                        s = -1;
                        if ( ((LA22_2>='\u0000' && LA22_2<='\uFFFF')) ) {s = 47;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}