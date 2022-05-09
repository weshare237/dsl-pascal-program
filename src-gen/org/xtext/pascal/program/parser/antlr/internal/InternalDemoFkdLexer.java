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
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=14;
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
    public static final int RULE_DIGIT=16;
    public static final int RULE_SIGNED_REAL_NUMBER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=18;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=17;
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
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_DIGIT_SEQUENCE=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=20;
    public static final int RULE_MULTIPLICATION_OPERATOR=9;
    public static final int RULE_ANY_OTHER=21;
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

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:11:7: ( '.' )
            // InternalDemoFkd.g:11:9: '.'
            {
            match('.'); 

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
            // InternalDemoFkd.g:12:7: ( 'program' )
            // InternalDemoFkd.g:12:9: 'program'
            {
            match("program"); 


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
            // InternalDemoFkd.g:13:7: ( '(' )
            // InternalDemoFkd.g:13:9: '('
            {
            match('('); 

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
            // InternalDemoFkd.g:14:7: ( ')' )
            // InternalDemoFkd.g:14:9: ')'
            {
            match(')'); 

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
            // InternalDemoFkd.g:15:7: ( ';' )
            // InternalDemoFkd.g:15:9: ';'
            {
            match(';'); 

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
            // InternalDemoFkd.g:16:7: ( ',' )
            // InternalDemoFkd.g:16:9: ','
            {
            match(','); 

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
            // InternalDemoFkd.g:17:7: ( 'uses' )
            // InternalDemoFkd.g:17:9: 'uses'
            {
            match("uses"); 


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
            // InternalDemoFkd.g:18:7: ( 'begin' )
            // InternalDemoFkd.g:18:9: 'begin'
            {
            match("begin"); 


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
            // InternalDemoFkd.g:19:7: ( 'end' )
            // InternalDemoFkd.g:19:9: 'end'
            {
            match("end"); 


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
            // InternalDemoFkd.g:20:7: ( ':' )
            // InternalDemoFkd.g:20:9: ':'
            {
            match(':'); 

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
            // InternalDemoFkd.g:21:7: ( ':=' )
            // InternalDemoFkd.g:21:9: ':='
            {
            match(":="); 


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
            // InternalDemoFkd.g:22:7: ( '[' )
            // InternalDemoFkd.g:22:9: '['
            {
            match('['); 

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
            // InternalDemoFkd.g:23:7: ( ']' )
            // InternalDemoFkd.g:23:9: ']'
            {
            match(']'); 

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
            // InternalDemoFkd.g:24:7: ( '^' )
            // InternalDemoFkd.g:24:9: '^'
            {
            match('^'); 

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
            // InternalDemoFkd.g:25:7: ( 'in' )
            // InternalDemoFkd.g:25:9: 'in'
            {
            match("in"); 


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
            // InternalDemoFkd.g:26:7: ( '=' )
            // InternalDemoFkd.g:26:9: '='
            {
            match('='); 

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
            // InternalDemoFkd.g:27:7: ( 'or' )
            // InternalDemoFkd.g:27:9: 'or'
            {
            match("or"); 


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
            // InternalDemoFkd.g:28:7: ( 'div' )
            // InternalDemoFkd.g:28:9: 'div'
            {
            match("div"); 


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
            // InternalDemoFkd.g:29:7: ( 'mod' )
            // InternalDemoFkd.g:29:9: 'mod'
            {
            match("mod"); 


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
            // InternalDemoFkd.g:30:7: ( 'and' )
            // InternalDemoFkd.g:30:9: 'and'
            {
            match("and"); 


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
            // InternalDemoFkd.g:31:7: ( 'nil' )
            // InternalDemoFkd.g:31:9: 'nil'
            {
            match("nil"); 


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
            // InternalDemoFkd.g:32:7: ( 'true' )
            // InternalDemoFkd.g:32:9: 'true'
            {
            match("true"); 


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
            // InternalDemoFkd.g:33:7: ( 'false' )
            // InternalDemoFkd.g:33:9: 'false'
            {
            match("false"); 


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
            // InternalDemoFkd.g:34:7: ( 'not' )
            // InternalDemoFkd.g:34:9: 'not'
            {
            match("not"); 


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
            // InternalDemoFkd.g:35:7: ( 'while' )
            // InternalDemoFkd.g:35:9: 'while'
            {
            match("while"); 


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
            // InternalDemoFkd.g:36:7: ( 'do' )
            // InternalDemoFkd.g:36:9: 'do'
            {
            match("do"); 


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
            // InternalDemoFkd.g:37:7: ( 'repeat' )
            // InternalDemoFkd.g:37:9: 'repeat'
            {
            match("repeat"); 


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
            // InternalDemoFkd.g:38:7: ( 'until' )
            // InternalDemoFkd.g:38:9: 'until'
            {
            match("until"); 


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
            // InternalDemoFkd.g:39:7: ( 'for' )
            // InternalDemoFkd.g:39:9: 'for'
            {
            match("for"); 


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
            // InternalDemoFkd.g:40:7: ( 'to' )
            // InternalDemoFkd.g:40:9: 'to'
            {
            match("to"); 


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
            // InternalDemoFkd.g:41:7: ( 'downto' )
            // InternalDemoFkd.g:41:9: 'downto'
            {
            match("downto"); 


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
            // InternalDemoFkd.g:42:7: ( 'if' )
            // InternalDemoFkd.g:42:9: 'if'
            {
            match("if"); 


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
            // InternalDemoFkd.g:43:7: ( 'then' )
            // InternalDemoFkd.g:43:9: 'then'
            {
            match("then"); 


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
            // InternalDemoFkd.g:44:7: ( 'else' )
            // InternalDemoFkd.g:44:9: 'else'
            {
            match("else"); 


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
            // InternalDemoFkd.g:45:7: ( 'case' )
            // InternalDemoFkd.g:45:9: 'case'
            {
            match("case"); 


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
            // InternalDemoFkd.g:46:7: ( 'of' )
            // InternalDemoFkd.g:46:9: 'of'
            {
            match("of"); 


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
            // InternalDemoFkd.g:47:7: ( 'with' )
            // InternalDemoFkd.g:47:9: 'with'
            {
            match("with"); 


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
            // InternalDemoFkd.g:48:7: ( 'goto' )
            // InternalDemoFkd.g:48:9: 'goto'
            {
            match("goto"); 


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
            // InternalDemoFkd.g:49:7: ( 'label' )
            // InternalDemoFkd.g:49:9: 'label'
            {
            match("label"); 


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
            // InternalDemoFkd.g:50:7: ( 'const' )
            // InternalDemoFkd.g:50:9: 'const'
            {
            match("const"); 


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
            // InternalDemoFkd.g:51:7: ( 'type' )
            // InternalDemoFkd.g:51:9: 'type'
            {
            match("type"); 


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
            // InternalDemoFkd.g:52:7: ( '..' )
            // InternalDemoFkd.g:52:9: '..'
            {
            match(".."); 


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
            // InternalDemoFkd.g:53:7: ( 'packed' )
            // InternalDemoFkd.g:53:9: 'packed'
            {
            match("packed"); 


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
            // InternalDemoFkd.g:54:7: ( 'array' )
            // InternalDemoFkd.g:54:9: 'array'
            {
            match("array"); 


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
            // InternalDemoFkd.g:55:7: ( 'record' )
            // InternalDemoFkd.g:55:9: 'record'
            {
            match("record"); 


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
            // InternalDemoFkd.g:56:7: ( 'set' )
            // InternalDemoFkd.g:56:9: 'set'
            {
            match("set"); 


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
            // InternalDemoFkd.g:57:7: ( 'file' )
            // InternalDemoFkd.g:57:9: 'file'
            {
            match("file"); 


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
            // InternalDemoFkd.g:58:7: ( 'var' )
            // InternalDemoFkd.g:58:9: 'var'
            {
            match("var"); 


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
            // InternalDemoFkd.g:59:7: ( 'forward' )
            // InternalDemoFkd.g:59:9: 'forward'
            {
            match("forward"); 


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
            // InternalDemoFkd.g:60:7: ( 'procedure' )
            // InternalDemoFkd.g:60:9: 'procedure'
            {
            match("procedure"); 


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
            // InternalDemoFkd.g:61:7: ( 'function' )
            // InternalDemoFkd.g:61:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "RULE_NUMERIC_SUBRANGE"
    public final void mRULE_NUMERIC_SUBRANGE() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_SUBRANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDemoFkd.g:5997:23: ( ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..' )
            // InternalDemoFkd.g:5997:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER ) '..'
            {
            // InternalDemoFkd.g:5997:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalDemoFkd.g:5997:26: RULE_INTEGER_NUMBER
                    {
                    mRULE_INTEGER_NUMBER(); 

                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:5997:46: RULE_REAL_NUMBER
                    {
                    mRULE_REAL_NUMBER(); 

                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:5997:63: RULE_SIGNED_INTEGER_NUMBER
                    {
                    mRULE_SIGNED_INTEGER_NUMBER(); 

                    }
                    break;
                case 4 :
                    // InternalDemoFkd.g:5997:90: RULE_SIGNED_REAL_NUMBER
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
            // InternalDemoFkd.g:5999:24: ( ( '+' | '-' ) )
            // InternalDemoFkd.g:5999:26: ( '+' | '-' )
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
            // InternalDemoFkd.g:6001:30: ( ( '*' | '/' ) )
            // InternalDemoFkd.g:6001:32: ( '*' | '/' )
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
            // InternalDemoFkd.g:6003:26: ( ( '=' | '<>' | '<' | '<=' | '>' | '>=' ) )
            // InternalDemoFkd.g:6003:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            {
            // InternalDemoFkd.g:6003:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt2=1;
                }
                break;
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt2=2;
                    }
                    break;
                case '=':
                    {
                    alt2=4;
                    }
                    break;
                default:
                    alt2=3;}

                }
                break;
            case '>':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='=') ) {
                    alt2=6;
                }
                else {
                    alt2=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDemoFkd.g:6003:29: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6003:33: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 3 :
                    // InternalDemoFkd.g:6003:38: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalDemoFkd.g:6003:42: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalDemoFkd.g:6003:47: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalDemoFkd.g:6003:51: '>='
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
            // InternalDemoFkd.g:6005:28: ( RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER )
            // InternalDemoFkd.g:6005:30: RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER
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
            // InternalDemoFkd.g:6007:21: ( RULE_UNSIGNED_DIGIT_SEQUENCE )
            // InternalDemoFkd.g:6007:23: RULE_UNSIGNED_DIGIT_SEQUENCE
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
            // InternalDemoFkd.g:6009:25: ( RULE_ADDITION_OPERATOR RULE_REAL_NUMBER )
            // InternalDemoFkd.g:6009:27: RULE_ADDITION_OPERATOR RULE_REAL_NUMBER
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
            // InternalDemoFkd.g:6011:18: ( ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE ) )
            // InternalDemoFkd.g:6011:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            {
            // InternalDemoFkd.g:6011:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalDemoFkd.g:6011:21: RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    {
                    mRULE_UNSIGNED_DIGIT_SEQUENCE(); 
                    match('.'); 
                    // InternalDemoFkd.g:6011:54: ( RULE_UNSIGNED_DIGIT_SEQUENCE )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalDemoFkd.g:6011:54: RULE_UNSIGNED_DIGIT_SEQUENCE
                            {
                            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

                            }
                            break;

                    }

                    // InternalDemoFkd.g:6011:84: ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='E'||LA4_0=='e') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalDemoFkd.g:6011:85: ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
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
                    // InternalDemoFkd.g:6011:117: RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE
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
            // InternalDemoFkd.g:6013:39: ( ( RULE_DIGIT )+ )
            // InternalDemoFkd.g:6013:41: ( RULE_DIGIT )+
            {
            // InternalDemoFkd.g:6013:41: ( RULE_DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDemoFkd.g:6013:41: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // InternalDemoFkd.g:6015:30: ( ( RULE_ADDITION_OPERATOR )? RULE_UNSIGNED_DIGIT_SEQUENCE )
            // InternalDemoFkd.g:6015:32: ( RULE_ADDITION_OPERATOR )? RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            // InternalDemoFkd.g:6015:32: ( RULE_ADDITION_OPERATOR )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='+'||LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDemoFkd.g:6015:32: RULE_ADDITION_OPERATOR
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
            // InternalDemoFkd.g:6017:21: ( '0' .. '9' )
            // InternalDemoFkd.g:6017:23: '0' .. '9'
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
            // InternalDemoFkd.g:6019:17: ( ( '(*' ( options {greedy=false; } : . )* '*)' | '{' ( options {greedy=false; } : . )* '}' ) )
            // InternalDemoFkd.g:6019:19: ( '(*' ( options {greedy=false; } : . )* '*)' | '{' ( options {greedy=false; } : . )* '}' )
            {
            // InternalDemoFkd.g:6019:19: ( '(*' ( options {greedy=false; } : . )* '*)' | '{' ( options {greedy=false; } : . )* '}' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='(') ) {
                alt10=1;
            }
            else if ( (LA10_0=='{') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDemoFkd.g:6019:20: '(*' ( options {greedy=false; } : . )* '*)'
                    {
                    match("(*"); 

                    // InternalDemoFkd.g:6019:25: ( options {greedy=false; } : . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='*') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==')') ) {
                                alt8=2;
                            }
                            else if ( ((LA8_1>='\u0000' && LA8_1<='(')||(LA8_1>='*' && LA8_1<='\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDemoFkd.g:6019:53: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match("*)"); 


                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6019:62: '{' ( options {greedy=false; } : . )* '}'
                    {
                    match('{'); 
                    // InternalDemoFkd.g:6019:66: ( options {greedy=false; } : . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='}') ) {
                            alt9=2;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='|')||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDemoFkd.g:6019:94: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
            // InternalDemoFkd.g:6021:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDemoFkd.g:6021:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDemoFkd.g:6021:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDemoFkd.g:6021:11: '^'
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

            // InternalDemoFkd.g:6021:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    break loop12;
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
            // InternalDemoFkd.g:6023:10: ( ( '0' .. '9' )+ )
            // InternalDemoFkd.g:6023:12: ( '0' .. '9' )+
            {
            // InternalDemoFkd.g:6023:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDemoFkd.g:6023:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalDemoFkd.g:6025:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDemoFkd.g:6025:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDemoFkd.g:6025:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDemoFkd.g:6025:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDemoFkd.g:6025:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDemoFkd.g:6025:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDemoFkd.g:6025:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDemoFkd.g:6025:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDemoFkd.g:6025:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDemoFkd.g:6025:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDemoFkd.g:6025:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop15;
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
            // InternalDemoFkd.g:6027:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDemoFkd.g:6027:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDemoFkd.g:6027:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDemoFkd.g:6027:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            // InternalDemoFkd.g:6027:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDemoFkd.g:6027:41: ( '\\r' )? '\\n'
                    {
                    // InternalDemoFkd.g:6027:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDemoFkd.g:6027:41: '\\r'
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
            // InternalDemoFkd.g:6029:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDemoFkd.g:6029:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDemoFkd.g:6029:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // InternalDemoFkd.g:6031:16: ( . )
            // InternalDemoFkd.g:6031:18: .
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
        // InternalDemoFkd.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | RULE_NUMERIC_SUBRANGE | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_REAL_NUMBER | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=66;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalDemoFkd.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalDemoFkd.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalDemoFkd.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalDemoFkd.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalDemoFkd.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalDemoFkd.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalDemoFkd.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalDemoFkd.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalDemoFkd.g:1:58: T__30
                {
                mT__30(); 

                }
                break;
            case 10 :
                // InternalDemoFkd.g:1:64: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // InternalDemoFkd.g:1:70: T__32
                {
                mT__32(); 

                }
                break;
            case 12 :
                // InternalDemoFkd.g:1:76: T__33
                {
                mT__33(); 

                }
                break;
            case 13 :
                // InternalDemoFkd.g:1:82: T__34
                {
                mT__34(); 

                }
                break;
            case 14 :
                // InternalDemoFkd.g:1:88: T__35
                {
                mT__35(); 

                }
                break;
            case 15 :
                // InternalDemoFkd.g:1:94: T__36
                {
                mT__36(); 

                }
                break;
            case 16 :
                // InternalDemoFkd.g:1:100: T__37
                {
                mT__37(); 

                }
                break;
            case 17 :
                // InternalDemoFkd.g:1:106: T__38
                {
                mT__38(); 

                }
                break;
            case 18 :
                // InternalDemoFkd.g:1:112: T__39
                {
                mT__39(); 

                }
                break;
            case 19 :
                // InternalDemoFkd.g:1:118: T__40
                {
                mT__40(); 

                }
                break;
            case 20 :
                // InternalDemoFkd.g:1:124: T__41
                {
                mT__41(); 

                }
                break;
            case 21 :
                // InternalDemoFkd.g:1:130: T__42
                {
                mT__42(); 

                }
                break;
            case 22 :
                // InternalDemoFkd.g:1:136: T__43
                {
                mT__43(); 

                }
                break;
            case 23 :
                // InternalDemoFkd.g:1:142: T__44
                {
                mT__44(); 

                }
                break;
            case 24 :
                // InternalDemoFkd.g:1:148: T__45
                {
                mT__45(); 

                }
                break;
            case 25 :
                // InternalDemoFkd.g:1:154: T__46
                {
                mT__46(); 

                }
                break;
            case 26 :
                // InternalDemoFkd.g:1:160: T__47
                {
                mT__47(); 

                }
                break;
            case 27 :
                // InternalDemoFkd.g:1:166: T__48
                {
                mT__48(); 

                }
                break;
            case 28 :
                // InternalDemoFkd.g:1:172: T__49
                {
                mT__49(); 

                }
                break;
            case 29 :
                // InternalDemoFkd.g:1:178: T__50
                {
                mT__50(); 

                }
                break;
            case 30 :
                // InternalDemoFkd.g:1:184: T__51
                {
                mT__51(); 

                }
                break;
            case 31 :
                // InternalDemoFkd.g:1:190: T__52
                {
                mT__52(); 

                }
                break;
            case 32 :
                // InternalDemoFkd.g:1:196: T__53
                {
                mT__53(); 

                }
                break;
            case 33 :
                // InternalDemoFkd.g:1:202: T__54
                {
                mT__54(); 

                }
                break;
            case 34 :
                // InternalDemoFkd.g:1:208: T__55
                {
                mT__55(); 

                }
                break;
            case 35 :
                // InternalDemoFkd.g:1:214: T__56
                {
                mT__56(); 

                }
                break;
            case 36 :
                // InternalDemoFkd.g:1:220: T__57
                {
                mT__57(); 

                }
                break;
            case 37 :
                // InternalDemoFkd.g:1:226: T__58
                {
                mT__58(); 

                }
                break;
            case 38 :
                // InternalDemoFkd.g:1:232: T__59
                {
                mT__59(); 

                }
                break;
            case 39 :
                // InternalDemoFkd.g:1:238: T__60
                {
                mT__60(); 

                }
                break;
            case 40 :
                // InternalDemoFkd.g:1:244: T__61
                {
                mT__61(); 

                }
                break;
            case 41 :
                // InternalDemoFkd.g:1:250: T__62
                {
                mT__62(); 

                }
                break;
            case 42 :
                // InternalDemoFkd.g:1:256: T__63
                {
                mT__63(); 

                }
                break;
            case 43 :
                // InternalDemoFkd.g:1:262: T__64
                {
                mT__64(); 

                }
                break;
            case 44 :
                // InternalDemoFkd.g:1:268: T__65
                {
                mT__65(); 

                }
                break;
            case 45 :
                // InternalDemoFkd.g:1:274: T__66
                {
                mT__66(); 

                }
                break;
            case 46 :
                // InternalDemoFkd.g:1:280: T__67
                {
                mT__67(); 

                }
                break;
            case 47 :
                // InternalDemoFkd.g:1:286: T__68
                {
                mT__68(); 

                }
                break;
            case 48 :
                // InternalDemoFkd.g:1:292: T__69
                {
                mT__69(); 

                }
                break;
            case 49 :
                // InternalDemoFkd.g:1:298: T__70
                {
                mT__70(); 

                }
                break;
            case 50 :
                // InternalDemoFkd.g:1:304: T__71
                {
                mT__71(); 

                }
                break;
            case 51 :
                // InternalDemoFkd.g:1:310: T__72
                {
                mT__72(); 

                }
                break;
            case 52 :
                // InternalDemoFkd.g:1:316: RULE_NUMERIC_SUBRANGE
                {
                mRULE_NUMERIC_SUBRANGE(); 

                }
                break;
            case 53 :
                // InternalDemoFkd.g:1:338: RULE_ADDITION_OPERATOR
                {
                mRULE_ADDITION_OPERATOR(); 

                }
                break;
            case 54 :
                // InternalDemoFkd.g:1:361: RULE_MULTIPLICATION_OPERATOR
                {
                mRULE_MULTIPLICATION_OPERATOR(); 

                }
                break;
            case 55 :
                // InternalDemoFkd.g:1:390: RULE_RELATIONAL_OPERATOR
                {
                mRULE_RELATIONAL_OPERATOR(); 

                }
                break;
            case 56 :
                // InternalDemoFkd.g:1:415: RULE_SIGNED_INTEGER_NUMBER
                {
                mRULE_SIGNED_INTEGER_NUMBER(); 

                }
                break;
            case 57 :
                // InternalDemoFkd.g:1:442: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 58 :
                // InternalDemoFkd.g:1:462: RULE_SIGNED_REAL_NUMBER
                {
                mRULE_SIGNED_REAL_NUMBER(); 

                }
                break;
            case 59 :
                // InternalDemoFkd.g:1:486: RULE_REAL_NUMBER
                {
                mRULE_REAL_NUMBER(); 

                }
                break;
            case 60 :
                // InternalDemoFkd.g:1:503: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 61 :
                // InternalDemoFkd.g:1:519: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 62 :
                // InternalDemoFkd.g:1:527: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 63 :
                // InternalDemoFkd.g:1:536: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 64 :
                // InternalDemoFkd.g:1:548: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 65 :
                // InternalDemoFkd.g:1:564: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 66 :
                // InternalDemoFkd.g:1:572: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA1_eotS =
        "\6\uffff\1\11\3\uffff\1\13\1\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\53\1\56\1\60\1\56\1\uffff\3\56\2\uffff\1\56\1\uffff";
    static final String DFA1_maxS =
        "\1\71\1\145\1\71\1\145\1\uffff\1\145\1\56\1\145\2\uffff\1\56\1\uffff";
    static final String DFA1_acceptS =
        "\4\uffff\1\2\3\uffff\1\4\1\1\1\uffff\1\3";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "5997:25: ( RULE_INTEGER_NUMBER | RULE_REAL_NUMBER | RULE_SIGNED_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER )";
        }
    }
    static final String DFA5_eotS =
        "\4\uffff";
    static final String DFA5_eofS =
        "\4\uffff";
    static final String DFA5_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA5_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "6011:20: ( RULE_UNSIGNED_DIGIT_SEQUENCE '.' ( RULE_UNSIGNED_DIGIT_SEQUENCE )? ( ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )? | RULE_UNSIGNED_DIGIT_SEQUENCE ( 'E' | 'e' ) RULE_DIGIT_SEQUENCE )";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\1\53\1\56\1\60\3\uffff\3\56\1\72\2\uffff\1\75\1\56\1\uffff\16\56\1\133\1\137\1\142\2\uffff\1\51\1\uffff\2\51\5\uffff\2\56\6\uffff\5\56\5\uffff\1\155\1\156\1\uffff\1\157\1\160\1\56\1\163\6\56\1\172\17\56\1\uffff\1\u008e\1\133\2\uffff\1\u0091\5\uffff\5\56\1\u009a\1\56\4\uffff\1\u009c\1\56\1\uffff\1\u009e\1\u009f\1\56\1\u00a1\1\u00a2\1\56\1\uffff\3\56\1\u00a8\12\56\1\u00b3\1\u00b4\1\uffff\1\u008e\3\uffff\1\u008e\1\uffff\1\u00b9\1\uffff\3\56\1\u00bf\2\56\1\uffff\1\u00c2\1\uffff\1\56\2\uffff\1\56\2\uffff\1\u00c5\1\u00c6\1\u00c7\2\56\1\uffff\1\u00ca\2\56\1\u00cd\2\56\1\u00d0\1\56\1\u00d2\1\56\3\uffff\1\u008e\1\u00b9\3\uffff\1\u00b9\3\56\1\uffff\1\u00d9\1\u00da\1\uffff\1\56\1\u00dc\3\uffff\1\u00dd\1\56\1\uffff\1\56\1\u00e0\1\uffff\2\56\1\uffff\1\u00e3\1\uffff\1\u00e4\1\uffff\1\u00b9\2\56\1\u00e7\2\uffff\1\u00e8\2\uffff\2\56\1\uffff\1\u00eb\1\u00ec\2\uffff\1\u00ed\1\56\2\uffff\1\u00ef\1\56\3\uffff\1\56\1\uffff\1\u00f2\1\u00f3\2\uffff";
    static final String DFA21_eofS =
        "\u00f4\uffff";
    static final String DFA21_minS =
        "\1\0\1\56\1\141\1\52\3\uffff\1\156\1\145\1\154\1\75\2\uffff\1\101\1\146\1\uffff\1\146\1\151\1\157\1\156\1\151\1\150\1\141\1\150\1\145\1\141\1\157\1\141\1\145\1\141\1\56\1\60\1\57\2\uffff\1\0\1\uffff\2\0\5\uffff\1\157\1\143\6\uffff\1\145\1\164\1\147\1\144\1\163\5\uffff\2\60\1\uffff\2\60\1\166\1\60\2\144\1\162\1\154\1\164\1\165\1\60\1\145\1\160\1\154\1\162\1\154\1\156\1\151\1\164\1\143\1\163\1\156\1\164\1\142\1\164\1\162\1\uffff\2\56\1\53\1\uffff\1\56\5\uffff\1\143\1\153\1\163\2\151\1\60\1\145\4\uffff\1\60\1\156\1\uffff\2\60\1\141\2\60\1\145\1\uffff\1\156\1\145\1\163\1\60\1\145\1\143\1\154\1\150\1\145\1\157\1\145\1\163\1\157\1\145\2\60\1\uffff\1\56\1\53\1\uffff\1\60\1\56\1\uffff\1\56\1\53\1\162\2\145\1\60\1\154\1\156\1\uffff\1\60\1\uffff\1\164\2\uffff\1\171\2\uffff\3\60\1\145\1\141\1\uffff\1\60\1\164\1\145\1\60\1\141\1\162\1\60\1\164\1\60\1\154\2\uffff\1\60\2\56\1\53\1\uffff\1\60\1\56\1\141\2\144\1\uffff\2\60\1\uffff\1\157\1\60\3\uffff\1\60\1\162\1\uffff\1\151\1\60\1\uffff\1\164\1\144\1\uffff\1\60\1\uffff\2\60\1\56\1\155\1\165\1\60\2\uffff\1\60\2\uffff\1\144\1\157\1\uffff\2\60\2\uffff\1\60\1\162\2\uffff\1\60\1\156\3\uffff\1\145\1\uffff\2\60\2\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\56\1\162\1\52\3\uffff\1\163\1\145\1\156\1\75\2\uffff\1\172\1\156\1\uffff\1\162\2\157\1\162\1\157\1\171\1\165\1\151\1\145\2\157\1\141\1\145\1\141\1\145\1\71\1\57\2\uffff\1\uffff\1\uffff\2\uffff\5\uffff\1\157\1\143\6\uffff\1\145\1\164\1\147\1\144\1\163\5\uffff\2\172\1\uffff\2\172\1\166\1\172\2\144\1\162\1\154\1\164\1\165\1\172\1\145\1\160\1\154\1\162\1\154\1\156\1\151\1\164\1\160\1\163\1\156\1\164\1\142\1\164\1\162\1\uffff\2\145\1\71\1\uffff\1\145\5\uffff\1\147\1\153\1\163\2\151\1\172\1\145\4\uffff\1\172\1\156\1\uffff\2\172\1\141\2\172\1\145\1\uffff\1\156\1\145\1\163\1\172\1\145\1\143\1\154\1\150\1\145\1\157\1\145\1\163\1\157\1\145\2\172\1\uffff\1\145\1\71\1\uffff\2\71\1\uffff\1\145\1\71\1\162\2\145\1\172\1\154\1\156\1\uffff\1\172\1\uffff\1\164\2\uffff\1\171\2\uffff\3\172\1\145\1\141\1\uffff\1\172\1\164\1\145\1\172\1\141\1\162\1\172\1\164\1\172\1\154\2\uffff\2\71\1\145\1\71\1\uffff\2\71\1\141\2\144\1\uffff\2\172\1\uffff\1\157\1\172\3\uffff\1\172\1\162\1\uffff\1\151\1\172\1\uffff\1\164\1\144\1\uffff\1\172\1\uffff\1\172\2\71\1\155\1\165\1\172\2\uffff\1\172\2\uffff\1\144\1\157\1\uffff\2\172\2\uffff\1\172\1\162\2\uffff\1\172\1\156\3\uffff\1\145\1\uffff\2\172\2\uffff";
    static final String DFA21_acceptS =
        "\4\uffff\1\4\1\5\1\6\4\uffff\1\14\1\15\2\uffff\1\20\21\uffff\2\67\1\uffff\1\75\2\uffff\1\66\1\101\1\102\1\52\1\1\2\uffff\1\75\1\74\1\3\1\4\1\5\1\6\5\uffff\1\13\1\12\1\14\1\15\1\16\2\uffff\1\20\32\uffff\1\71\3\uffff\1\65\1\uffff\1\100\1\66\1\67\1\77\1\101\7\uffff\1\17\1\40\1\21\1\44\2\uffff\1\32\6\uffff\1\36\20\uffff\1\64\2\uffff\1\73\2\uffff\1\70\10\uffff\1\11\1\uffff\1\22\1\uffff\1\23\1\24\1\uffff\1\25\1\30\5\uffff\1\35\12\uffff\1\56\1\60\4\uffff\1\72\5\uffff\1\7\2\uffff\1\42\2\uffff\1\26\1\41\1\51\2\uffff\1\57\2\uffff\1\45\2\uffff\1\43\1\uffff\1\46\6\uffff\1\34\1\10\1\uffff\1\54\1\27\2\uffff\1\31\2\uffff\1\50\1\47\2\uffff\1\53\1\37\2\uffff\1\33\1\55\1\2\1\uffff\1\61\2\uffff\1\63\1\62";
    static final String DFA21_specialS =
        "\1\0\42\uffff\1\1\1\uffff\1\2\1\3\u00cd\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\45\4\51\1\46\1\3\1\4\1\47\1\37\1\6\1\37\1\1\1\40\12\36\1\12\1\5\1\41\1\17\1\42\2\51\32\44\1\13\1\51\1\14\1\15\1\44\1\51\1\23\1\10\1\31\1\21\1\11\1\26\1\32\1\44\1\16\2\44\1\33\1\22\1\24\1\20\1\2\1\44\1\30\1\34\1\25\1\7\1\35\1\27\3\44\1\43\uff84\51",
            "\1\52",
            "\1\55\20\uffff\1\54",
            "\1\57",
            "",
            "",
            "",
            "\1\65\4\uffff\1\64",
            "\1\66",
            "\1\70\1\uffff\1\67",
            "\1\71",
            "",
            "",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\77\7\uffff\1\76",
            "",
            "\1\102\13\uffff\1\101",
            "\1\103\5\uffff\1\104",
            "\1\105",
            "\1\106\3\uffff\1\107",
            "\1\110\5\uffff\1\111",
            "\1\114\6\uffff\1\113\2\uffff\1\112\6\uffff\1\115",
            "\1\116\7\uffff\1\120\5\uffff\1\117\5\uffff\1\121",
            "\1\122\1\123",
            "\1\124",
            "\1\125\15\uffff\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\134\1\uffff\12\135\13\uffff\1\136\37\uffff\1\136",
            "\12\140",
            "\1\141",
            "",
            "",
            "\0\57",
            "",
            "\0\144",
            "\0\144",
            "",
            "",
            "",
            "",
            "",
            "\1\146",
            "\1\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\161",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\26\56\1\162\3\56",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0084\14\uffff\1\u0083",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b\1\uffff\12\u008c\13\uffff\1\u008d\37\uffff\1\u008d",
            "\1\134\1\uffff\12\135\13\uffff\1\136\37\uffff\1\136",
            "\1\u008f\1\uffff\1\u008f\2\uffff\12\u0090",
            "",
            "\1\u0092\1\uffff\12\140\13\uffff\1\u0093\37\uffff\1\u0093",
            "",
            "",
            "",
            "",
            "",
            "\1\u0095\3\uffff\1\u0094",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u009b",
            "",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u009d",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\26\56\1\u00a7\3\56",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u008b\1\uffff\12\u008c\13\uffff\1\u008d\37\uffff\1\u008d",
            "\1\u00b5\1\uffff\1\u00b5\2\uffff\12\u00b6",
            "",
            "\12\u0090",
            "\1\u008b\1\uffff\12\u0090",
            "",
            "\1\u008b\1\uffff\12\u00b7\13\uffff\1\u00b8\37\uffff\1\u00b8",
            "\1\u00ba\1\uffff\1\u00ba\2\uffff\12\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00c3",
            "",
            "",
            "\1\u00c4",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00cb",
            "\1\u00cc",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ce",
            "\1\u00cf",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00d1",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00d3",
            "",
            "",
            "\12\u00b6",
            "\1\u008b\1\uffff\12\u00b6",
            "\1\u008b\1\uffff\12\u00b7\13\uffff\1\u00b8\37\uffff\1\u00b8",
            "\1\u00d4\1\uffff\1\u00d4\2\uffff\12\u00d5",
            "",
            "\12\u00bb",
            "\1\u008b\1\uffff\12\u00bb",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00db",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00de",
            "",
            "\1\u00df",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\u00d5",
            "\1\u008b\1\uffff\12\u00d5",
            "\1\u00e5",
            "\1\u00e6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ee",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00f0",
            "",
            "",
            "",
            "\1\u00f1",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | RULE_NUMERIC_SUBRANGE | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_SIGNED_REAL_NUMBER | RULE_REAL_NUMBER | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='.') ) {s = 1;}

                        else if ( (LA21_0=='p') ) {s = 2;}

                        else if ( (LA21_0=='(') ) {s = 3;}

                        else if ( (LA21_0==')') ) {s = 4;}

                        else if ( (LA21_0==';') ) {s = 5;}

                        else if ( (LA21_0==',') ) {s = 6;}

                        else if ( (LA21_0=='u') ) {s = 7;}

                        else if ( (LA21_0=='b') ) {s = 8;}

                        else if ( (LA21_0=='e') ) {s = 9;}

                        else if ( (LA21_0==':') ) {s = 10;}

                        else if ( (LA21_0=='[') ) {s = 11;}

                        else if ( (LA21_0==']') ) {s = 12;}

                        else if ( (LA21_0=='^') ) {s = 13;}

                        else if ( (LA21_0=='i') ) {s = 14;}

                        else if ( (LA21_0=='=') ) {s = 15;}

                        else if ( (LA21_0=='o') ) {s = 16;}

                        else if ( (LA21_0=='d') ) {s = 17;}

                        else if ( (LA21_0=='m') ) {s = 18;}

                        else if ( (LA21_0=='a') ) {s = 19;}

                        else if ( (LA21_0=='n') ) {s = 20;}

                        else if ( (LA21_0=='t') ) {s = 21;}

                        else if ( (LA21_0=='f') ) {s = 22;}

                        else if ( (LA21_0=='w') ) {s = 23;}

                        else if ( (LA21_0=='r') ) {s = 24;}

                        else if ( (LA21_0=='c') ) {s = 25;}

                        else if ( (LA21_0=='g') ) {s = 26;}

                        else if ( (LA21_0=='l') ) {s = 27;}

                        else if ( (LA21_0=='s') ) {s = 28;}

                        else if ( (LA21_0=='v') ) {s = 29;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 30;}

                        else if ( (LA21_0=='+'||LA21_0=='-') ) {s = 31;}

                        else if ( (LA21_0=='/') ) {s = 32;}

                        else if ( (LA21_0=='<') ) {s = 33;}

                        else if ( (LA21_0=='>') ) {s = 34;}

                        else if ( (LA21_0=='{') ) {s = 35;}

                        else if ( ((LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||LA21_0=='h'||(LA21_0>='j' && LA21_0<='k')||LA21_0=='q'||(LA21_0>='x' && LA21_0<='z')) ) {s = 36;}

                        else if ( (LA21_0=='\"') ) {s = 37;}

                        else if ( (LA21_0=='\'') ) {s = 38;}

                        else if ( (LA21_0=='*') ) {s = 39;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 40;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='?' && LA21_0<='@')||LA21_0=='\\'||LA21_0=='`'||(LA21_0>='|' && LA21_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_35 = input.LA(1);

                        s = -1;
                        if ( ((LA21_35>='\u0000' && LA21_35<='\uFFFF')) ) {s = 47;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_37 = input.LA(1);

                        s = -1;
                        if ( ((LA21_37>='\u0000' && LA21_37<='\uFFFF')) ) {s = 100;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_38 = input.LA(1);

                        s = -1;
                        if ( ((LA21_38>='\u0000' && LA21_38<='\uFFFF')) ) {s = 100;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}