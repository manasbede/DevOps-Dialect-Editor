package ca.mcgill.devops.pipeline.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPipelineLexer extends Lexer {
    public static final int RULE_BEGIN=49;
    public static final int Pipelines=12;
    public static final int Include=25;
    public static final int RunName=18;
    public static final int Template=19;
    public static final int Name=32;
    public static final int Read=37;
    public static final int RULE_VERSION=48;
    public static final int Concurrency=7;
    public static final int Packages=16;
    public static final int ReadAll=26;
    public static final int Permission=11;
    public static final int Pool=33;
    public static final int Extends=24;
    public static final int RightSquareBracket=43;
    public static final int WorkingDirectory=5;
    public static final int Parameters=10;
    public static final int Builds=28;
    public static final int RULE_ID=51;
    public static final int WriteAll=21;
    public static final int Defaults=15;
    public static final int RULE_INT=46;
    public static final int Value=31;
    public static final int RULE_ML_COMMENT=52;
    public static final int LeftSquareBracket=42;
    public static final int Resources=13;
    public static final int Repositories=6;
    public static final int Write=34;
    public static final int Group=29;
    public static final int RULE_END=50;
    public static final int Demands=23;
    public static final int Containers=9;
    public static final int RULE_STRING=54;
    public static final int VmImage=27;
    public static final int Env=35;
    public static final int CancelInProgress=4;
    public static final int RULE_SL_COMMENT=53;
    public static final int Variables=14;
    public static final int RULE_FLOAT_LITERAL=47;
    public static final int Comma=39;
    public static final int Shell=30;
    public static final int HyphenMinus=40;
    public static final int Readonly=17;
    public static final int DisplayName=8;
    public static final int RULE_COMPLEX_EXPRESSION=44;
    public static final int Colon=41;
    public static final int EOF=-1;
    public static final int RULE_HEX_INT=45;
    public static final int RULE_WS=55;
    public static final int Run=38;
    public static final int RULE_ANY_OTHER=56;
    public static final int Default=22;
    public static final int Webhooks=20;
    public static final int None=36;

    // delegates
    // delegators

    public InternalPipelineLexer() {;} 
    public InternalPipelineLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPipelineLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPipelineLexer.g"; }

    // $ANTLR start "CancelInProgress"
    public final void mCancelInProgress() throws RecognitionException {
        try {
            int _type = CancelInProgress;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:14:18: ( 'cancel-in-progress:' )
            // InternalPipelineLexer.g:14:20: 'cancel-in-progress:'
            {
            match("cancel-in-progress:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CancelInProgress"

    // $ANTLR start "WorkingDirectory"
    public final void mWorkingDirectory() throws RecognitionException {
        try {
            int _type = WorkingDirectory;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:16:18: ( 'working-directory:' )
            // InternalPipelineLexer.g:16:20: 'working-directory:'
            {
            match("working-directory:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WorkingDirectory"

    // $ANTLR start "Repositories"
    public final void mRepositories() throws RecognitionException {
        try {
            int _type = Repositories;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:18:14: ( 'repositories:' )
            // InternalPipelineLexer.g:18:16: 'repositories:'
            {
            match("repositories:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Repositories"

    // $ANTLR start "Concurrency"
    public final void mConcurrency() throws RecognitionException {
        try {
            int _type = Concurrency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:20:13: ( 'concurrency:' )
            // InternalPipelineLexer.g:20:15: 'concurrency:'
            {
            match("concurrency:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Concurrency"

    // $ANTLR start "DisplayName"
    public final void mDisplayName() throws RecognitionException {
        try {
            int _type = DisplayName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:22:13: ( 'displayName:' )
            // InternalPipelineLexer.g:22:15: 'displayName:'
            {
            match("displayName:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DisplayName"

    // $ANTLR start "Containers"
    public final void mContainers() throws RecognitionException {
        try {
            int _type = Containers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:24:12: ( 'containers:' )
            // InternalPipelineLexer.g:24:14: 'containers:'
            {
            match("containers:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Containers"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:26:12: ( 'parameters:' )
            // InternalPipelineLexer.g:26:14: 'parameters:'
            {
            match("parameters:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameters"

    // $ANTLR start "Permission"
    public final void mPermission() throws RecognitionException {
        try {
            int _type = Permission;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:28:12: ( 'permission:' )
            // InternalPipelineLexer.g:28:14: 'permission:'
            {
            match("permission:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Permission"

    // $ANTLR start "Pipelines"
    public final void mPipelines() throws RecognitionException {
        try {
            int _type = Pipelines;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:30:11: ( 'pipelines:' )
            // InternalPipelineLexer.g:30:13: 'pipelines:'
            {
            match("pipelines:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pipelines"

    // $ANTLR start "Resources"
    public final void mResources() throws RecognitionException {
        try {
            int _type = Resources;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:32:11: ( 'resources:' )
            // InternalPipelineLexer.g:32:13: 'resources:'
            {
            match("resources:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Resources"

    // $ANTLR start "Variables"
    public final void mVariables() throws RecognitionException {
        try {
            int _type = Variables;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:34:11: ( 'variables:' )
            // InternalPipelineLexer.g:34:13: 'variables:'
            {
            match("variables:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Variables"

    // $ANTLR start "Defaults"
    public final void mDefaults() throws RecognitionException {
        try {
            int _type = Defaults;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:36:10: ( 'defaults:' )
            // InternalPipelineLexer.g:36:12: 'defaults:'
            {
            match("defaults:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Defaults"

    // $ANTLR start "Packages"
    public final void mPackages() throws RecognitionException {
        try {
            int _type = Packages;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:38:10: ( 'packages:' )
            // InternalPipelineLexer.g:38:12: 'packages:'
            {
            match("packages:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Packages"

    // $ANTLR start "Readonly"
    public final void mReadonly() throws RecognitionException {
        try {
            int _type = Readonly;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:40:10: ( 'readonly:' )
            // InternalPipelineLexer.g:40:12: 'readonly:'
            {
            match("readonly:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Readonly"

    // $ANTLR start "RunName"
    public final void mRunName() throws RecognitionException {
        try {
            int _type = RunName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:42:9: ( 'run-name:' )
            // InternalPipelineLexer.g:42:11: 'run-name:'
            {
            match("run-name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RunName"

    // $ANTLR start "Template"
    public final void mTemplate() throws RecognitionException {
        try {
            int _type = Template;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:44:10: ( 'template:' )
            // InternalPipelineLexer.g:44:12: 'template:'
            {
            match("template:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Template"

    // $ANTLR start "Webhooks"
    public final void mWebhooks() throws RecognitionException {
        try {
            int _type = Webhooks;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:46:10: ( 'webhooks:' )
            // InternalPipelineLexer.g:46:12: 'webhooks:'
            {
            match("webhooks:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Webhooks"

    // $ANTLR start "WriteAll"
    public final void mWriteAll() throws RecognitionException {
        try {
            int _type = WriteAll;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:48:10: ( 'write-all' )
            // InternalPipelineLexer.g:48:12: 'write-all'
            {
            match("write-all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WriteAll"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:50:9: ( 'default:' )
            // InternalPipelineLexer.g:50:11: 'default:'
            {
            match("default:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Demands"
    public final void mDemands() throws RecognitionException {
        try {
            int _type = Demands;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:52:9: ( 'demands:' )
            // InternalPipelineLexer.g:52:11: 'demands:'
            {
            match("demands:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Demands"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:54:9: ( 'extends:' )
            // InternalPipelineLexer.g:54:11: 'extends:'
            {
            match("extends:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "Include"
    public final void mInclude() throws RecognitionException {
        try {
            int _type = Include;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:56:9: ( 'include:' )
            // InternalPipelineLexer.g:56:11: 'include:'
            {
            match("include:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Include"

    // $ANTLR start "ReadAll"
    public final void mReadAll() throws RecognitionException {
        try {
            int _type = ReadAll;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:58:9: ( 'read-all' )
            // InternalPipelineLexer.g:58:11: 'read-all'
            {
            match("read-all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReadAll"

    // $ANTLR start "VmImage"
    public final void mVmImage() throws RecognitionException {
        try {
            int _type = VmImage;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:60:9: ( 'vmImage:' )
            // InternalPipelineLexer.g:60:11: 'vmImage:'
            {
            match("vmImage:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VmImage"

    // $ANTLR start "Builds"
    public final void mBuilds() throws RecognitionException {
        try {
            int _type = Builds;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:62:8: ( 'builds:' )
            // InternalPipelineLexer.g:62:10: 'builds:'
            {
            match("builds:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Builds"

    // $ANTLR start "Group"
    public final void mGroup() throws RecognitionException {
        try {
            int _type = Group;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:64:7: ( 'group:' )
            // InternalPipelineLexer.g:64:9: 'group:'
            {
            match("group:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Group"

    // $ANTLR start "Shell"
    public final void mShell() throws RecognitionException {
        try {
            int _type = Shell;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:66:7: ( 'shell:' )
            // InternalPipelineLexer.g:66:9: 'shell:'
            {
            match("shell:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Shell"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:68:7: ( 'value:' )
            // InternalPipelineLexer.g:68:9: 'value:'
            {
            match("value:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:70:6: ( 'name:' )
            // InternalPipelineLexer.g:70:8: 'name:'
            {
            match("name:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Pool"
    public final void mPool() throws RecognitionException {
        try {
            int _type = Pool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:72:6: ( 'pool:' )
            // InternalPipelineLexer.g:72:8: 'pool:'
            {
            match("pool:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pool"

    // $ANTLR start "Write"
    public final void mWrite() throws RecognitionException {
        try {
            int _type = Write;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:74:7: ( 'write' )
            // InternalPipelineLexer.g:74:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Write"

    // $ANTLR start "Env"
    public final void mEnv() throws RecognitionException {
        try {
            int _type = Env;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:76:5: ( 'env:' )
            // InternalPipelineLexer.g:76:7: 'env:'
            {
            match("env:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Env"

    // $ANTLR start "None"
    public final void mNone() throws RecognitionException {
        try {
            int _type = None;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:78:6: ( 'none' )
            // InternalPipelineLexer.g:78:8: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "None"

    // $ANTLR start "Read"
    public final void mRead() throws RecognitionException {
        try {
            int _type = Read;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:80:6: ( 'read' )
            // InternalPipelineLexer.g:80:8: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Read"

    // $ANTLR start "Run"
    public final void mRun() throws RecognitionException {
        try {
            int _type = Run;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:82:5: ( 'run:' )
            // InternalPipelineLexer.g:82:7: 'run:'
            {
            match("run:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Run"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:84:7: ( ',' )
            // InternalPipelineLexer.g:84:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:86:13: ( '-' )
            // InternalPipelineLexer.g:86:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:88:7: ( ':' )
            // InternalPipelineLexer.g:88:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:90:19: ( '[' )
            // InternalPipelineLexer.g:90:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:92:20: ( ']' )
            // InternalPipelineLexer.g:92:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RULE_COMPLEX_EXPRESSION"
    public final void mRULE_COMPLEX_EXPRESSION() throws RecognitionException {
        try {
            int _type = RULE_COMPLEX_EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:94:25: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )* )? '${{' ( options {greedy=false; } : . )* '}}' ( '-${{' ( options {greedy=false; } : . )* '}}' )* )
            // InternalPipelineLexer.g:94:27: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )* )? '${{' ( options {greedy=false; } : . )* '}}' ( '-${{' ( options {greedy=false; } : . )* '}}' )*
            {
            // InternalPipelineLexer.g:94:27: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPipelineLexer.g:94:28: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalPipelineLexer.g:94:48: ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='-'||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalPipelineLexer.g:
                    	    {
                    	    if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
                    break;

            }

            match("${{"); 

            // InternalPipelineLexer.g:94:81: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='}') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='}') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='|')||(LA3_1>='~' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='|')||(LA3_0>='~' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPipelineLexer.g:94:109: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("}}"); 

            // InternalPipelineLexer.g:94:118: ( '-${{' ( options {greedy=false; } : . )* '}}' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPipelineLexer.g:94:119: '-${{' ( options {greedy=false; } : . )* '}}'
            	    {
            	    match("-${{"); 

            	    // InternalPipelineLexer.g:94:126: ( options {greedy=false; } : . )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0=='}') ) {
            	            int LA4_1 = input.LA(2);

            	            if ( (LA4_1=='}') ) {
            	                alt4=2;
            	            }
            	            else if ( ((LA4_1>='\u0000' && LA4_1<='|')||(LA4_1>='~' && LA4_1<='\uFFFF')) ) {
            	                alt4=1;
            	            }


            	        }
            	        else if ( ((LA4_0>='\u0000' && LA4_0<='|')||(LA4_0>='~' && LA4_0<='\uFFFF')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalPipelineLexer.g:94:154: .
            	    	    {
            	    	    matchAny(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    match("}}"); 


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPLEX_EXPRESSION"

    // $ANTLR start "RULE_HEX_INT"
    public final void mRULE_HEX_INT() throws RecognitionException {
        try {
            int _type = RULE_HEX_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:96:14: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalPipelineLexer.g:96:16: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalPipelineLexer.g:96:21: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')||(LA6_0>='a' && LA6_0<='f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPipelineLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_INT"

    // $ANTLR start "RULE_FLOAT_LITERAL"
    public final void mRULE_FLOAT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOAT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:98:20: ( ( '-' )? RULE_INT '.' RULE_INT )
            // InternalPipelineLexer.g:98:22: ( '-' )? RULE_INT '.' RULE_INT
            {
            // InternalPipelineLexer.g:98:22: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPipelineLexer.g:98:22: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT_LITERAL"

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:100:14: ( RULE_INT ( '.' RULE_INT )+ )
            // InternalPipelineLexer.g:100:16: RULE_INT ( '.' RULE_INT )+
            {
            mRULE_INT(); 
            // InternalPipelineLexer.g:100:25: ( '.' RULE_INT )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='.') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPipelineLexer.g:100:26: '.' RULE_INT
            	    {
            	    match('.'); 
            	    mRULE_INT(); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalPipelineLexer.g:102:21: ()
            // InternalPipelineLexer.g:102:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalPipelineLexer.g:104:19: ()
            // InternalPipelineLexer.g:104:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:106:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' | '@' | '-' | '.' | '\\\\' | '&' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '/' | '@' | '&' | '-' | '.' | '\\\\' | '(' | ')' | '|' | '$' )* )
            // InternalPipelineLexer.g:106:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' | '@' | '-' | '.' | '\\\\' | '&' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '/' | '@' | '&' | '-' | '.' | '\\\\' | '(' | ')' | '|' | '$' )*
            {
            if ( input.LA(1)=='&'||(input.LA(1)>='-' && input.LA(1)<='/')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPipelineLexer.g:106:60: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '/' | '@' | '&' | '-' | '.' | '\\\\' | '(' | ')' | '|' | '$' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$'||LA9_0=='&'||(LA9_0>='(' && LA9_0<=')')||(LA9_0>='-' && LA9_0<='9')||(LA9_0>='@' && LA9_0<='Z')||LA9_0=='\\'||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')||LA9_0=='|') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPipelineLexer.g:
            	    {
            	    if ( input.LA(1)=='$'||input.LA(1)=='&'||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>='-' && input.LA(1)<='9')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:108:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPipelineLexer.g:108:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPipelineLexer.g:108:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPipelineLexer.g:108:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:110:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPipelineLexer.g:110:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalPipelineLexer.g:110:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPipelineLexer.g:110:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // InternalPipelineLexer.g:110:39: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPipelineLexer.g:110:40: ( '\\r' )? '\\n'
                    {
                    // InternalPipelineLexer.g:110:40: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalPipelineLexer.g:110:40: '\\r'
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:112:10: ( ( '0' .. '9' )+ )
            // InternalPipelineLexer.g:112:12: ( '0' .. '9' )+
            {
            // InternalPipelineLexer.g:112:12: ( '0' .. '9' )+
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
            	    // InternalPipelineLexer.g:112:13: '0' .. '9'
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
            // InternalPipelineLexer.g:114:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPipelineLexer.g:114:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPipelineLexer.g:114:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPipelineLexer.g:114:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPipelineLexer.g:114:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalPipelineLexer.g:114:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPipelineLexer.g:114:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPipelineLexer.g:114:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPipelineLexer.g:114:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalPipelineLexer.g:114:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPipelineLexer.g:114:61: ~ ( ( '\\\\' | '\\'' ) )
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:116:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPipelineLexer.g:116:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPipelineLexer.g:116:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPipelineLexer.g:
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // InternalPipelineLexer.g:118:16: ( . )
            // InternalPipelineLexer.g:118:18: .
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
        // InternalPipelineLexer.g:1:8: ( CancelInProgress | WorkingDirectory | Repositories | Concurrency | DisplayName | Containers | Parameters | Permission | Pipelines | Resources | Variables | Defaults | Packages | Readonly | RunName | Template | Webhooks | WriteAll | Default | Demands | Extends | Include | ReadAll | VmImage | Builds | Group | Shell | Value | Name | Pool | Write | Env | None | Read | Run | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_COMPLEX_EXPRESSION | RULE_HEX_INT | RULE_FLOAT_LITERAL | RULE_VERSION | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt19=51;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalPipelineLexer.g:1:10: CancelInProgress
                {
                mCancelInProgress(); 

                }
                break;
            case 2 :
                // InternalPipelineLexer.g:1:27: WorkingDirectory
                {
                mWorkingDirectory(); 

                }
                break;
            case 3 :
                // InternalPipelineLexer.g:1:44: Repositories
                {
                mRepositories(); 

                }
                break;
            case 4 :
                // InternalPipelineLexer.g:1:57: Concurrency
                {
                mConcurrency(); 

                }
                break;
            case 5 :
                // InternalPipelineLexer.g:1:69: DisplayName
                {
                mDisplayName(); 

                }
                break;
            case 6 :
                // InternalPipelineLexer.g:1:81: Containers
                {
                mContainers(); 

                }
                break;
            case 7 :
                // InternalPipelineLexer.g:1:92: Parameters
                {
                mParameters(); 

                }
                break;
            case 8 :
                // InternalPipelineLexer.g:1:103: Permission
                {
                mPermission(); 

                }
                break;
            case 9 :
                // InternalPipelineLexer.g:1:114: Pipelines
                {
                mPipelines(); 

                }
                break;
            case 10 :
                // InternalPipelineLexer.g:1:124: Resources
                {
                mResources(); 

                }
                break;
            case 11 :
                // InternalPipelineLexer.g:1:134: Variables
                {
                mVariables(); 

                }
                break;
            case 12 :
                // InternalPipelineLexer.g:1:144: Defaults
                {
                mDefaults(); 

                }
                break;
            case 13 :
                // InternalPipelineLexer.g:1:153: Packages
                {
                mPackages(); 

                }
                break;
            case 14 :
                // InternalPipelineLexer.g:1:162: Readonly
                {
                mReadonly(); 

                }
                break;
            case 15 :
                // InternalPipelineLexer.g:1:171: RunName
                {
                mRunName(); 

                }
                break;
            case 16 :
                // InternalPipelineLexer.g:1:179: Template
                {
                mTemplate(); 

                }
                break;
            case 17 :
                // InternalPipelineLexer.g:1:188: Webhooks
                {
                mWebhooks(); 

                }
                break;
            case 18 :
                // InternalPipelineLexer.g:1:197: WriteAll
                {
                mWriteAll(); 

                }
                break;
            case 19 :
                // InternalPipelineLexer.g:1:206: Default
                {
                mDefault(); 

                }
                break;
            case 20 :
                // InternalPipelineLexer.g:1:214: Demands
                {
                mDemands(); 

                }
                break;
            case 21 :
                // InternalPipelineLexer.g:1:222: Extends
                {
                mExtends(); 

                }
                break;
            case 22 :
                // InternalPipelineLexer.g:1:230: Include
                {
                mInclude(); 

                }
                break;
            case 23 :
                // InternalPipelineLexer.g:1:238: ReadAll
                {
                mReadAll(); 

                }
                break;
            case 24 :
                // InternalPipelineLexer.g:1:246: VmImage
                {
                mVmImage(); 

                }
                break;
            case 25 :
                // InternalPipelineLexer.g:1:254: Builds
                {
                mBuilds(); 

                }
                break;
            case 26 :
                // InternalPipelineLexer.g:1:261: Group
                {
                mGroup(); 

                }
                break;
            case 27 :
                // InternalPipelineLexer.g:1:267: Shell
                {
                mShell(); 

                }
                break;
            case 28 :
                // InternalPipelineLexer.g:1:273: Value
                {
                mValue(); 

                }
                break;
            case 29 :
                // InternalPipelineLexer.g:1:279: Name
                {
                mName(); 

                }
                break;
            case 30 :
                // InternalPipelineLexer.g:1:284: Pool
                {
                mPool(); 

                }
                break;
            case 31 :
                // InternalPipelineLexer.g:1:289: Write
                {
                mWrite(); 

                }
                break;
            case 32 :
                // InternalPipelineLexer.g:1:295: Env
                {
                mEnv(); 

                }
                break;
            case 33 :
                // InternalPipelineLexer.g:1:299: None
                {
                mNone(); 

                }
                break;
            case 34 :
                // InternalPipelineLexer.g:1:304: Read
                {
                mRead(); 

                }
                break;
            case 35 :
                // InternalPipelineLexer.g:1:309: Run
                {
                mRun(); 

                }
                break;
            case 36 :
                // InternalPipelineLexer.g:1:313: Comma
                {
                mComma(); 

                }
                break;
            case 37 :
                // InternalPipelineLexer.g:1:319: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 38 :
                // InternalPipelineLexer.g:1:331: Colon
                {
                mColon(); 

                }
                break;
            case 39 :
                // InternalPipelineLexer.g:1:337: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 40 :
                // InternalPipelineLexer.g:1:355: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 41 :
                // InternalPipelineLexer.g:1:374: RULE_COMPLEX_EXPRESSION
                {
                mRULE_COMPLEX_EXPRESSION(); 

                }
                break;
            case 42 :
                // InternalPipelineLexer.g:1:398: RULE_HEX_INT
                {
                mRULE_HEX_INT(); 

                }
                break;
            case 43 :
                // InternalPipelineLexer.g:1:411: RULE_FLOAT_LITERAL
                {
                mRULE_FLOAT_LITERAL(); 

                }
                break;
            case 44 :
                // InternalPipelineLexer.g:1:430: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 45 :
                // InternalPipelineLexer.g:1:443: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // InternalPipelineLexer.g:1:451: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 47 :
                // InternalPipelineLexer.g:1:467: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 48 :
                // InternalPipelineLexer.g:1:483: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalPipelineLexer.g:1:492: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // InternalPipelineLexer.g:1:504: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 51 :
                // InternalPipelineLexer.g:1:512: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\15\41\1\uffff\1\73\3\uffff\1\41\1\35\2\101\1\41\2\uffff\2\35\2\uffff\3\41\1\uffff\27\41\1\uffff\1\41\10\uffff\1\101\4\uffff\36\41\1\u0087\10\41\1\u0093\1\41\1\uffff\15\41\1\uffff\5\41\1\u00a7\1\u0087\2\uffff\5\41\1\u00ae\4\41\1\uffff\10\41\1\uffff\11\41\2\uffff\6\41\1\uffff\15\41\1\uffff\5\41\2\uffff\27\41\1\uffff\11\41\1\u00fd\3\41\2\uffff\5\41\1\uffff\1\41\2\uffff\4\41\1\uffff\1\u010b\2\41\3\uffff\1\41\1\uffff\1\41\1\uffff\3\41\1\uffff\4\41\1\uffff\1\41\1\uffff\3\41\2\uffff\2\41\1\uffff\3\41\2\uffff\1\41\1\uffff\2\41\1\uffff\2\41\1\uffff\11\41\2\uffff";
    static final String DFA19_eofS =
        "\u012e\uffff";
    static final String DFA19_minS =
        "\1\0\15\44\1\uffff\1\44\3\uffff\1\44\1\173\2\56\1\52\2\uffff\2\0\2\uffff\3\44\1\uffff\1\173\26\44\1\uffff\1\56\7\uffff\1\60\1\56\4\uffff\35\44\1\60\1\56\12\44\1\uffff\15\44\1\uffff\7\44\2\uffff\12\44\1\uffff\10\44\1\uffff\11\44\2\uffff\6\44\1\uffff\15\44\1\uffff\5\44\2\uffff\27\44\1\uffff\15\44\2\uffff\5\44\1\uffff\1\44\2\uffff\4\44\1\uffff\3\44\3\uffff\1\44\1\uffff\1\44\1\uffff\3\44\1\uffff\4\44\1\uffff\1\44\1\uffff\3\44\2\uffff\2\44\1\uffff\3\44\2\uffff\1\44\1\uffff\2\44\1\uffff\2\44\1\uffff\11\44\2\uffff";
    static final String DFA19_maxS =
        "\1\uffff\15\172\1\uffff\1\174\3\uffff\1\172\1\173\1\170\1\71\1\52\2\uffff\2\uffff\2\uffff\3\172\1\uffff\1\173\26\172\1\uffff\1\71\7\uffff\2\71\4\uffff\35\172\2\71\10\172\1\174\1\172\1\uffff\15\172\1\uffff\5\172\2\174\2\uffff\5\172\1\174\4\172\1\uffff\10\172\1\uffff\11\172\2\uffff\6\172\1\uffff\15\172\1\uffff\5\172\2\uffff\27\172\1\uffff\11\172\1\174\3\172\2\uffff\5\172\1\uffff\1\172\2\uffff\4\172\1\uffff\1\174\2\172\3\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\uffff\4\172\1\uffff\1\172\1\uffff\3\172\2\uffff\2\172\1\uffff\3\172\2\uffff\1\172\1\uffff\2\172\1\uffff\2\172\1\uffff\11\172\2\uffff";
    static final String DFA19_acceptS =
        "\16\uffff\1\44\1\uffff\1\46\1\47\1\50\5\uffff\1\55\1\57\2\uffff\1\62\1\63\3\uffff\1\55\27\uffff\1\44\1\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\60\2\uffff\1\56\1\57\1\61\1\62\51\uffff\1\43\15\uffff\1\40\7\uffff\1\53\1\54\12\uffff\1\42\10\uffff\1\36\11\uffff\1\35\1\41\6\uffff\1\37\15\uffff\1\34\5\uffff\1\32\1\33\27\uffff\1\31\15\uffff\1\23\1\24\5\uffff\1\30\1\uffff\1\25\1\26\4\uffff\1\21\3\uffff\1\16\1\27\1\17\1\uffff\1\14\1\uffff\1\15\3\uffff\1\20\4\uffff\1\22\1\uffff\1\12\3\uffff\1\11\1\13\2\uffff\1\6\3\uffff\1\7\1\10\1\uffff\1\4\2\uffff\1\5\2\uffff\1\3\11\uffff\1\2\1\1";
    static final String DFA19_specialS =
        "\1\2\31\uffff\1\0\1\1\u0112\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\32\1\31\1\24\1\35\1\30\1\33\4\35\1\16\1\17\1\30\1\27\1\25\11\26\1\20\5\35\1\30\32\23\1\21\1\30\1\22\1\35\1\30\1\35\1\23\1\12\1\1\1\4\1\10\1\23\1\13\1\23\1\11\4\23\1\15\1\23\1\5\1\23\1\3\1\14\1\7\1\23\1\6\1\2\3\23\uff85\35",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\36\15\40\1\37\13\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\44\11\40\1\43\2\40\1\45\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\46\17\40\1\47\5\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\51\3\40\1\50\21\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\52\3\40\1\53\3\40\1\54\5\40\1\55\13\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\56\13\40\1\57\15\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\60\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\62\11\40\1\61\2\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\63\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\24\40\1\64\5\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\65\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\7\40\1\66\22\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\67\15\40\1\70\13\40",
            "",
            "\1\41\1\uffff\1\41\1\uffff\2\41\3\uffff\3\41\12\72\6\uffff\33\41\1\uffff\1\41\2\uffff\1\41\1\uffff\32\41\1\uffff\1\41",
            "",
            "",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\32\40",
            "\1\77",
            "\1\102\1\uffff\12\103\76\uffff\1\100",
            "\1\102\1\uffff\12\103",
            "\1\104",
            "",
            "",
            "\0\106",
            "\0\106",
            "",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\110\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\111\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\32\40",
            "",
            "\1\77",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\112\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\40\1\113\30\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\114\21\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\117\16\40\1\115\2\40\1\116\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\120\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\121\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\5\40\1\122\6\40\1\123\15\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\2\40\1\125\16\40\1\124\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\126\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\17\40\1\127\12\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\16\40\1\130\13\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\132\5\40\1\131\10\40",
            "\1\42\10\uffff\1\40\23\uffff\10\40\1\133\21\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\14\40\1\134\15\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\23\40\1\135\6\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\25\40\1\136\4\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\2\40\1\137\27\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\140\21\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\16\40\1\141\13\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\142\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\14\40\1\143\15\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\144\14\40",
            "",
            "\1\145\1\uffff\12\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\146",
            "\1\102\1\uffff\12\103",
            "",
            "",
            "",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\2\40\1\147\27\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\2\40\1\150\20\40\1\151\6\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\12\40\1\152\17\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\7\40\1\153\22\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\23\40\1\154\6\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\16\40\1\155\13\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\16\40\1\156\13\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\3\40\1\157\26\40",
            "\1\42\10\uffff\1\160\14\uffff\1\161\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\17\40\1\162\12\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\163\31\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\164\31\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\165\31\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\12\40\1\166\17\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\14\40\1\167\15\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\170\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\171\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\172\21\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\24\40\1\173\5\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\14\40\1\174\15\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\17\40\1\175\12\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\176\25\40",
            "\1\42\10\uffff\1\40\14\uffff\1\177\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u0080\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u0081\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\24\40\1\u0082\5\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u0083\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u0084\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u0085\25\40",
            "\12\u0086",
            "\1\u0088\1\uffff\12\146",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u0089\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\24\40\1\u008a\5\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\u008b\31\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\u008c\21\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\16\40\1\u008d\13\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u008e\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u008f\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\24\40\1\u0090\5\40",
            "\1\42\1\uffff\1\41\1\uffff\2\41\3\uffff\1\u0092\14\41\6\uffff\1\41\32\40\1\uffff\1\41\2\uffff\1\41\1\uffff\16\40\1\u0091\13\40\1\uffff\1\41",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\u0094\14\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u0095\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\24\40\1\u0096\5\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\u0097\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\14\40\1\u0098\15\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\u0099\31\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\u009a\21\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u009b\16\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u009c\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\u009d\31\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u009e\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\u009f\31\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u00a0\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\u00a1\14\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\24\40\1\u00a2\5\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\3\40\1\u00a3\26\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\17\40\1\u00a4\12\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u00a5\16\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00a6\6\uffff\32\40\6\uffff\32\40",
            "\1\42\1\uffff\1\41\1\uffff\2\41\3\uffff\1\40\14\41\6\uffff\1\41\32\40\1\uffff\1\41\2\uffff\1\41\1\uffff\32\40\1\uffff\1\41",
            "\1\41\1\uffff\1\41\1\uffff\2\41\3\uffff\3\41\12\u0086\6\uffff\33\41\1\uffff\1\41\2\uffff\1\41\1\uffff\32\41\1\uffff\1\41",
            "",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u00a8\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\u00a9\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\u00aa\21\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\u00ab\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\16\40\1\u00ac\13\40",
            "\1\42\1\uffff\1\41\1\uffff\2\41\3\uffff\1\u00ad\14\41\6\uffff\1\41\32\40\1\uffff\1\41\2\uffff\1\41\1\uffff\32\40\1\uffff\1\41",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\u00af\21\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\u00b0\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\u00b1\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\u00b2\31\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\u00b3\31\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\u00b4\31\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u00b5\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\3\40\1\u00b6\26\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00b7\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\6\40\1\u00b8\23\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u00b9\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\u00ba\21\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\40\1\u00bb\30\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00bc\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\6\40\1\u00bd\23\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\u00be\31\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\3\40\1\u00bf\26\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\3\40\1\u00c0\26\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u00c1\7\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00c2\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00c3\6\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\1\42\10\uffff\1\u00c4\23\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\u00c5\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\u00c6\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\6\40\1\u00c7\23\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\12\40\1\u00c8\17\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\u00c9\31\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\23\40\1\u00ca\6\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\2\40\1\u00cb\27\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u00cc\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u00cd\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\14\40\1\u00ce\15\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\30\40\1\u00cf\1\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\23\40\1\u00d0\6\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u00d1\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\23\40\1\u00d2\6\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00d3\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u00d4\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\u00d5\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u00d6\16\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00d7\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\23\40\1\u00d8\6\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u00d9\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00da\25\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00db\6\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\u00dc\21\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00dd\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00de\25\40",
            "\1\42\10\uffff\1\u00df\23\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u00e0\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u00e1\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\16\40\1\u00e2\13\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00e3\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\30\40\1\u00e4\1\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u00e5\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00e6\25\40",
            "\1\42\10\uffff\1\40\23\uffff\15\40\1\u00e7\14\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00e9\6\uffff\32\40\6\uffff\22\40\1\u00e8\7\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00ea\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00eb\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u00ec\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\u00ed\21\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00ee\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00ef\25\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00f0\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u00f1\25\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00f2\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00f3\6\uffff\32\40\6\uffff\32\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\u00f4\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\u00f5\14\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\u00f6\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\3\40\1\u00f7\26\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00f8\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\13\40\1\u00f9\16\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\u00fa\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u00fb\7\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u00fc\6\uffff\32\40\6\uffff\32\40",
            "\1\42\1\uffff\1\41\1\uffff\2\41\3\uffff\1\40\14\41\6\uffff\1\41\32\40\1\uffff\1\41\2\uffff\1\41\1\uffff\32\40\1\uffff\1\41",
            "\1\42\10\uffff\1\40\14\uffff\1\u00fe\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\1\u00ff\31\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u0100\6\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\u0101\10\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u0102\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\16\40\1\u0103\13\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u0104\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u0105\7\40",
            "",
            "\1\42\10\uffff\1\40\14\uffff\1\u0106\6\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\1\42\10\uffff\1\u0107\23\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\2\40\1\u0108\27\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u0109\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\u010a\21\40",
            "",
            "\1\42\1\uffff\1\41\1\uffff\2\41\3\uffff\1\40\14\41\6\uffff\1\41\32\40\1\uffff\1\41\2\uffff\1\41\1\uffff\32\40\1\uffff\1\41",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\10\40\1\u010c\21\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u010d\6\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\14\40\1\u010e\15\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u010f\7\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\15\40\1\u0110\14\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u0111\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u0112\6\uffff\32\40\6\uffff\32\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\17\40\1\u0113\12\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\30\40\1\u0114\1\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u0115\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\u0116\10\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u0117\25\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u0118\25\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u0119\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u011a\6\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\u011b\10\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u011c\6\uffff\32\40\6\uffff\32\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u011d\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u011e\7\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u011f\6\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\16\40\1\u0120\13\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\2\40\1\u0121\27\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u0122\6\uffff\32\40\6\uffff\32\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\6\40\1\u0123\23\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\23\40\1\u0124\6\40",
            "",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\u0125\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\16\40\1\u0126\13\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\4\40\1\u0127\25\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\21\40\1\u0128\10\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u0129\7\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\30\40\1\u012a\1\40",
            "\1\42\10\uffff\1\40\23\uffff\32\40\6\uffff\22\40\1\u012b\7\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u012c\6\uffff\32\40\6\uffff\32\40",
            "\1\42\10\uffff\1\40\14\uffff\1\u012d\6\uffff\32\40\6\uffff\32\40",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( CancelInProgress | WorkingDirectory | Repositories | Concurrency | DisplayName | Containers | Parameters | Permission | Pipelines | Resources | Variables | Defaults | Packages | Readonly | RunName | Template | Webhooks | WriteAll | Default | Demands | Extends | Include | ReadAll | VmImage | Builds | Group | Shell | Value | Name | Pool | Write | Env | None | Read | Run | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_COMPLEX_EXPRESSION | RULE_HEX_INT | RULE_FLOAT_LITERAL | RULE_VERSION | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_26 = input.LA(1);

                        s = -1;
                        if ( ((LA19_26>='\u0000' && LA19_26<='\uFFFF')) ) {s = 70;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_27 = input.LA(1);

                        s = -1;
                        if ( ((LA19_27>='\u0000' && LA19_27<='\uFFFF')) ) {s = 70;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='c') ) {s = 1;}

                        else if ( (LA19_0=='w') ) {s = 2;}

                        else if ( (LA19_0=='r') ) {s = 3;}

                        else if ( (LA19_0=='d') ) {s = 4;}

                        else if ( (LA19_0=='p') ) {s = 5;}

                        else if ( (LA19_0=='v') ) {s = 6;}

                        else if ( (LA19_0=='t') ) {s = 7;}

                        else if ( (LA19_0=='e') ) {s = 8;}

                        else if ( (LA19_0=='i') ) {s = 9;}

                        else if ( (LA19_0=='b') ) {s = 10;}

                        else if ( (LA19_0=='g') ) {s = 11;}

                        else if ( (LA19_0=='s') ) {s = 12;}

                        else if ( (LA19_0=='n') ) {s = 13;}

                        else if ( (LA19_0==',') ) {s = 14;}

                        else if ( (LA19_0=='-') ) {s = 15;}

                        else if ( (LA19_0==':') ) {s = 16;}

                        else if ( (LA19_0=='[') ) {s = 17;}

                        else if ( (LA19_0==']') ) {s = 18;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='a'||LA19_0=='f'||LA19_0=='h'||(LA19_0>='j' && LA19_0<='m')||LA19_0=='o'||LA19_0=='q'||LA19_0=='u'||(LA19_0>='x' && LA19_0<='z')) ) {s = 19;}

                        else if ( (LA19_0=='$') ) {s = 20;}

                        else if ( (LA19_0=='0') ) {s = 21;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 22;}

                        else if ( (LA19_0=='/') ) {s = 23;}

                        else if ( (LA19_0=='&'||LA19_0=='.'||LA19_0=='@'||LA19_0=='\\'||LA19_0=='_') ) {s = 24;}

                        else if ( (LA19_0=='#') ) {s = 25;}

                        else if ( (LA19_0=='\"') ) {s = 26;}

                        else if ( (LA19_0=='\'') ) {s = 27;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 28;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||LA19_0=='%'||(LA19_0>='(' && LA19_0<='+')||(LA19_0>=';' && LA19_0<='?')||LA19_0=='^'||LA19_0=='`'||(LA19_0>='{' && LA19_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}