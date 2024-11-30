package ca.mcgill.devops.pipeline.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPipelineLexer extends Lexer {
    public static final int Secrets=52;
    public static final int Pipelines=26;
    public static final int Needs=63;
    public static final int Image=62;
    public static final int RunName=36;
    public static final int Matrix=57;
    public static final int RULE_VERSION=96;
    public static final int Concurrency=15;
    public static final int RunOnce=50;
    public static final int TagsIgnore=19;
    public static final int Extends=43;
    public static final int Push=72;
    public static final int Tags=73;
    public static final int ExclamationMark=81;
    public static final int Pr=80;
    public static final int Parameters=23;
    public static final int RULE_ID=91;
    public static final int SettableVariables=5;
    public static final int Defaults=32;
    public static final int MaxParallel=10;
    public static final int RULE_INT=94;
    public static final int Outputs=47;
    public static final int RULE_ML_COMMENT=98;
    public static final int LeftSquareBracket=86;
    public static final int Resources=27;
    public static final int Id=77;
    public static final int ContinueOnError=4;
    public static final int If=78;
    public static final int Repositories=13;
    public static final int Schedules=29;
    public static final int Group=61;
    public static final int Containers=20;
    public static final int DownloadBuild=9;
    public static final int Comma=83;
    public static final int Target=59;
    public static final int HyphenMinus=84;
    public static final int RULE_COMPLEX_EXPRESSION=92;
    public static final int Paths=64;
    public static final int RightCurlyBracket=90;
    public static final int ReviewApp=28;
    public static final int Path=71;
    public static final int RULE_HEX_INT=93;
    public static final int TimeoutMinutes=8;
    public static final int Canary=55;
    public static final int Rolling=49;
    public static final int Ports=65;
    public static final int Pipeline=34;
    public static final int KW__=88;
    public static final int Type=74;
    public static final int Pull_request=12;
    public static final int Webhooks=40;
    public static final int Credentials=16;
    public static final int Types=67;
    public static final int RULE_BEGIN=103;
    public static final int Deployment=21;
    public static final int Include=45;
    public static final int Cron=69;
    public static final int Template=39;
    public static final int Name=70;
    public static final int Container=24;
    public static final int Filters=44;
    public static final int Trigger=53;
    public static final int Packages=33;
    public static final int ReadAll=48;
    public static final int Build=60;
    public static final int Permissions=18;
    public static final int RULE_UNCLOSED_STRING=102;
    public static final int Inherit=46;
    public static final int RightSquareBracket=87;
    public static final int WorkingDirectory=6;
    public static final int Script=58;
    public static final int Builds=54;
    public static final int Branches=31;
    public static final int WriteAll=41;
    public static final int FailFast=25;
    public static final int Environment=17;
    public static final int RULE_END=104;
    public static final int Exclude=42;
    public static final int Uses=75;
    public static final int RULE_STRING=97;
    public static final int Env=76;
    public static final int RULE_SL_COMMENT=99;
    public static final int Variables=30;
    public static final int RULE_FLOAT_LITERAL=95;
    public static final int Shell=66;
    public static final int Required=35;
    public static final int Colon=85;
    public static final int EOF=-1;
    public static final int Inputs=56;
    public static final int Asterisk=82;
    public static final int BranchesIgnore=7;
    public static final int Args=68;
    public static final int Entrypoint=22;
    public static final int PathsIgnore=11;
    public static final int RULE_WS=100;
    public static final int LeftCurlyBracket=89;
    public static final int RULE_ANY_OTHER=101;
    public static final int RunsOn=51;
    public static final int Schedule=37;
    public static final int Strategy=38;
    public static final int Workflow_run=14;
    public static final int On=79;

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

    // $ANTLR start "ContinueOnError"
    public final void mContinueOnError() throws RecognitionException {
        try {
            int _type = ContinueOnError;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:14:17: ( 'continue-on-error:' )
            // InternalPipelineLexer.g:14:19: 'continue-on-error:'
            {
            match("continue-on-error:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ContinueOnError"

    // $ANTLR start "SettableVariables"
    public final void mSettableVariables() throws RecognitionException {
        try {
            int _type = SettableVariables;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:16:19: ( 'settableVariables:' )
            // InternalPipelineLexer.g:16:21: 'settableVariables:'
            {
            match("settableVariables:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SettableVariables"

    // $ANTLR start "WorkingDirectory"
    public final void mWorkingDirectory() throws RecognitionException {
        try {
            int _type = WorkingDirectory;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:18:18: ( 'working-directory:' )
            // InternalPipelineLexer.g:18:20: 'working-directory:'
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

    // $ANTLR start "BranchesIgnore"
    public final void mBranchesIgnore() throws RecognitionException {
        try {
            int _type = BranchesIgnore;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:20:16: ( 'branches-ignore:' )
            // InternalPipelineLexer.g:20:18: 'branches-ignore:'
            {
            match("branches-ignore:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BranchesIgnore"

    // $ANTLR start "TimeoutMinutes"
    public final void mTimeoutMinutes() throws RecognitionException {
        try {
            int _type = TimeoutMinutes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:22:16: ( 'timeout-minutes:' )
            // InternalPipelineLexer.g:22:18: 'timeout-minutes:'
            {
            match("timeout-minutes:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TimeoutMinutes"

    // $ANTLR start "DownloadBuild"
    public final void mDownloadBuild() throws RecognitionException {
        try {
            int _type = DownloadBuild;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:24:15: ( 'downloadBuild:' )
            // InternalPipelineLexer.g:24:17: 'downloadBuild:'
            {
            match("downloadBuild:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DownloadBuild"

    // $ANTLR start "MaxParallel"
    public final void mMaxParallel() throws RecognitionException {
        try {
            int _type = MaxParallel;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:26:13: ( 'max-parallel:' )
            // InternalPipelineLexer.g:26:15: 'max-parallel:'
            {
            match("max-parallel:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MaxParallel"

    // $ANTLR start "PathsIgnore"
    public final void mPathsIgnore() throws RecognitionException {
        try {
            int _type = PathsIgnore;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:28:13: ( 'paths-ignore:' )
            // InternalPipelineLexer.g:28:15: 'paths-ignore:'
            {
            match("paths-ignore:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PathsIgnore"

    // $ANTLR start "Pull_request"
    public final void mPull_request() throws RecognitionException {
        try {
            int _type = Pull_request;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:30:14: ( 'pull_request:' )
            // InternalPipelineLexer.g:30:16: 'pull_request:'
            {
            match("pull_request:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pull_request"

    // $ANTLR start "Repositories"
    public final void mRepositories() throws RecognitionException {
        try {
            int _type = Repositories;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:32:14: ( 'repositories:' )
            // InternalPipelineLexer.g:32:16: 'repositories:'
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

    // $ANTLR start "Workflow_run"
    public final void mWorkflow_run() throws RecognitionException {
        try {
            int _type = Workflow_run;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:34:14: ( 'workflow_run:' )
            // InternalPipelineLexer.g:34:16: 'workflow_run:'
            {
            match("workflow_run:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Workflow_run"

    // $ANTLR start "Concurrency"
    public final void mConcurrency() throws RecognitionException {
        try {
            int _type = Concurrency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:36:13: ( 'concurrency:' )
            // InternalPipelineLexer.g:36:15: 'concurrency:'
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

    // $ANTLR start "Credentials"
    public final void mCredentials() throws RecognitionException {
        try {
            int _type = Credentials;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:38:13: ( 'credentials:' )
            // InternalPipelineLexer.g:38:15: 'credentials:'
            {
            match("credentials:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Credentials"

    // $ANTLR start "Environment"
    public final void mEnvironment() throws RecognitionException {
        try {
            int _type = Environment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:40:13: ( 'environment:' )
            // InternalPipelineLexer.g:40:15: 'environment:'
            {
            match("environment:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Environment"

    // $ANTLR start "Permissions"
    public final void mPermissions() throws RecognitionException {
        try {
            int _type = Permissions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:42:13: ( 'permissions:' )
            // InternalPipelineLexer.g:42:15: 'permissions:'
            {
            match("permissions:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Permissions"

    // $ANTLR start "TagsIgnore"
    public final void mTagsIgnore() throws RecognitionException {
        try {
            int _type = TagsIgnore;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:44:12: ( 'tags-ignore:' )
            // InternalPipelineLexer.g:44:14: 'tags-ignore:'
            {
            match("tags-ignore:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TagsIgnore"

    // $ANTLR start "Containers"
    public final void mContainers() throws RecognitionException {
        try {
            int _type = Containers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:46:12: ( 'containers:' )
            // InternalPipelineLexer.g:46:14: 'containers:'
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

    // $ANTLR start "Deployment"
    public final void mDeployment() throws RecognitionException {
        try {
            int _type = Deployment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:48:12: ( 'deployment:' )
            // InternalPipelineLexer.g:48:14: 'deployment:'
            {
            match("deployment:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Deployment"

    // $ANTLR start "Entrypoint"
    public final void mEntrypoint() throws RecognitionException {
        try {
            int _type = Entrypoint;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:50:12: ( 'entrypoint:' )
            // InternalPipelineLexer.g:50:14: 'entrypoint:'
            {
            match("entrypoint:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Entrypoint"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:52:12: ( 'parameters:' )
            // InternalPipelineLexer.g:52:14: 'parameters:'
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

    // $ANTLR start "Container"
    public final void mContainer() throws RecognitionException {
        try {
            int _type = Container;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:54:11: ( 'container:' )
            // InternalPipelineLexer.g:54:13: 'container:'
            {
            match("container:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Container"

    // $ANTLR start "FailFast"
    public final void mFailFast() throws RecognitionException {
        try {
            int _type = FailFast;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:56:10: ( 'fail-fast:' )
            // InternalPipelineLexer.g:56:12: 'fail-fast:'
            {
            match("fail-fast:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FailFast"

    // $ANTLR start "Pipelines"
    public final void mPipelines() throws RecognitionException {
        try {
            int _type = Pipelines;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:58:11: ( 'pipelines:' )
            // InternalPipelineLexer.g:58:13: 'pipelines:'
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
            // InternalPipelineLexer.g:60:11: ( 'resources:' )
            // InternalPipelineLexer.g:60:13: 'resources:'
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

    // $ANTLR start "ReviewApp"
    public final void mReviewApp() throws RecognitionException {
        try {
            int _type = ReviewApp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:62:11: ( 'reviewApp:' )
            // InternalPipelineLexer.g:62:13: 'reviewApp:'
            {
            match("reviewApp:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ReviewApp"

    // $ANTLR start "Schedules"
    public final void mSchedules() throws RecognitionException {
        try {
            int _type = Schedules;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:64:11: ( 'schedules:' )
            // InternalPipelineLexer.g:64:13: 'schedules:'
            {
            match("schedules:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Schedules"

    // $ANTLR start "Variables"
    public final void mVariables() throws RecognitionException {
        try {
            int _type = Variables;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:66:11: ( 'variables:' )
            // InternalPipelineLexer.g:66:13: 'variables:'
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

    // $ANTLR start "Branches"
    public final void mBranches() throws RecognitionException {
        try {
            int _type = Branches;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:68:10: ( 'branches:' )
            // InternalPipelineLexer.g:68:12: 'branches:'
            {
            match("branches:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Branches"

    // $ANTLR start "Defaults"
    public final void mDefaults() throws RecognitionException {
        try {
            int _type = Defaults;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:70:10: ( 'defaults:' )
            // InternalPipelineLexer.g:70:12: 'defaults:'
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
            // InternalPipelineLexer.g:72:10: ( 'packages:' )
            // InternalPipelineLexer.g:72:12: 'packages:'
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

    // $ANTLR start "Pipeline"
    public final void mPipeline() throws RecognitionException {
        try {
            int _type = Pipeline;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:74:10: ( 'pipeline:' )
            // InternalPipelineLexer.g:74:12: 'pipeline:'
            {
            match("pipeline:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pipeline"

    // $ANTLR start "Required"
    public final void mRequired() throws RecognitionException {
        try {
            int _type = Required;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:76:10: ( 'required:' )
            // InternalPipelineLexer.g:76:12: 'required:'
            {
            match("required:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Required"

    // $ANTLR start "RunName"
    public final void mRunName() throws RecognitionException {
        try {
            int _type = RunName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:78:9: ( 'run-name:' )
            // InternalPipelineLexer.g:78:11: 'run-name:'
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

    // $ANTLR start "Schedule"
    public final void mSchedule() throws RecognitionException {
        try {
            int _type = Schedule;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:80:10: ( 'schedule:' )
            // InternalPipelineLexer.g:80:12: 'schedule:'
            {
            match("schedule:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Schedule"

    // $ANTLR start "Strategy"
    public final void mStrategy() throws RecognitionException {
        try {
            int _type = Strategy;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:82:10: ( 'strategy:' )
            // InternalPipelineLexer.g:82:12: 'strategy:'
            {
            match("strategy:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Strategy"

    // $ANTLR start "Template"
    public final void mTemplate() throws RecognitionException {
        try {
            int _type = Template;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:84:10: ( 'template:' )
            // InternalPipelineLexer.g:84:12: 'template:'
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
            // InternalPipelineLexer.g:86:10: ( 'webhooks:' )
            // InternalPipelineLexer.g:86:12: 'webhooks:'
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
            // InternalPipelineLexer.g:88:10: ( 'write-all' )
            // InternalPipelineLexer.g:88:12: 'write-all'
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

    // $ANTLR start "Exclude"
    public final void mExclude() throws RecognitionException {
        try {
            int _type = Exclude;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:90:9: ( 'exclude:' )
            // InternalPipelineLexer.g:90:11: 'exclude:'
            {
            match("exclude:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exclude"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:92:9: ( 'extends:' )
            // InternalPipelineLexer.g:92:11: 'extends:'
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

    // $ANTLR start "Filters"
    public final void mFilters() throws RecognitionException {
        try {
            int _type = Filters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:94:9: ( 'filters:' )
            // InternalPipelineLexer.g:94:11: 'filters:'
            {
            match("filters:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Filters"

    // $ANTLR start "Include"
    public final void mInclude() throws RecognitionException {
        try {
            int _type = Include;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:96:9: ( 'include:' )
            // InternalPipelineLexer.g:96:11: 'include:'
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

    // $ANTLR start "Inherit"
    public final void mInherit() throws RecognitionException {
        try {
            int _type = Inherit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:98:9: ( 'inherit:' )
            // InternalPipelineLexer.g:98:11: 'inherit:'
            {
            match("inherit:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inherit"

    // $ANTLR start "Outputs"
    public final void mOutputs() throws RecognitionException {
        try {
            int _type = Outputs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:100:9: ( 'outputs:' )
            // InternalPipelineLexer.g:100:11: 'outputs:'
            {
            match("outputs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Outputs"

    // $ANTLR start "ReadAll"
    public final void mReadAll() throws RecognitionException {
        try {
            int _type = ReadAll;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:102:9: ( 'read-all' )
            // InternalPipelineLexer.g:102:11: 'read-all'
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

    // $ANTLR start "Rolling"
    public final void mRolling() throws RecognitionException {
        try {
            int _type = Rolling;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:104:9: ( 'rolling:' )
            // InternalPipelineLexer.g:104:11: 'rolling:'
            {
            match("rolling:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rolling"

    // $ANTLR start "RunOnce"
    public final void mRunOnce() throws RecognitionException {
        try {
            int _type = RunOnce;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:106:9: ( 'runOnce:' )
            // InternalPipelineLexer.g:106:11: 'runOnce:'
            {
            match("runOnce:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RunOnce"

    // $ANTLR start "RunsOn"
    public final void mRunsOn() throws RecognitionException {
        try {
            int _type = RunsOn;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:108:8: ( 'runs-on:' )
            // InternalPipelineLexer.g:108:10: 'runs-on:'
            {
            match("runs-on:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RunsOn"

    // $ANTLR start "Secrets"
    public final void mSecrets() throws RecognitionException {
        try {
            int _type = Secrets;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:110:9: ( 'secrets:' )
            // InternalPipelineLexer.g:110:11: 'secrets:'
            {
            match("secrets:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Secrets"

    // $ANTLR start "Trigger"
    public final void mTrigger() throws RecognitionException {
        try {
            int _type = Trigger;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:112:9: ( 'trigger:' )
            // InternalPipelineLexer.g:112:11: 'trigger:'
            {
            match("trigger:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Trigger"

    // $ANTLR start "Builds"
    public final void mBuilds() throws RecognitionException {
        try {
            int _type = Builds;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:114:8: ( 'builds:' )
            // InternalPipelineLexer.g:114:10: 'builds:'
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

    // $ANTLR start "Canary"
    public final void mCanary() throws RecognitionException {
        try {
            int _type = Canary;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:116:8: ( 'canary:' )
            // InternalPipelineLexer.g:116:10: 'canary:'
            {
            match("canary:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Canary"

    // $ANTLR start "Inputs"
    public final void mInputs() throws RecognitionException {
        try {
            int _type = Inputs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:118:8: ( 'inputs:' )
            // InternalPipelineLexer.g:118:10: 'inputs:'
            {
            match("inputs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inputs"

    // $ANTLR start "Matrix"
    public final void mMatrix() throws RecognitionException {
        try {
            int _type = Matrix;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:120:8: ( 'matrix:' )
            // InternalPipelineLexer.g:120:10: 'matrix:'
            {
            match("matrix:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Matrix"

    // $ANTLR start "Script"
    public final void mScript() throws RecognitionException {
        try {
            int _type = Script;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:122:8: ( 'script:' )
            // InternalPipelineLexer.g:122:10: 'script:'
            {
            match("script:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Script"

    // $ANTLR start "Target"
    public final void mTarget() throws RecognitionException {
        try {
            int _type = Target;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:124:8: ( 'target:' )
            // InternalPipelineLexer.g:124:10: 'target:'
            {
            match("target:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Target"

    // $ANTLR start "Build"
    public final void mBuild() throws RecognitionException {
        try {
            int _type = Build;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:126:7: ( 'build:' )
            // InternalPipelineLexer.g:126:9: 'build:'
            {
            match("build:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Build"

    // $ANTLR start "Group"
    public final void mGroup() throws RecognitionException {
        try {
            int _type = Group;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:128:7: ( 'group:' )
            // InternalPipelineLexer.g:128:9: 'group:'
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

    // $ANTLR start "Image"
    public final void mImage() throws RecognitionException {
        try {
            int _type = Image;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:130:7: ( 'image:' )
            // InternalPipelineLexer.g:130:9: 'image:'
            {
            match("image:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Image"

    // $ANTLR start "Needs"
    public final void mNeeds() throws RecognitionException {
        try {
            int _type = Needs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:132:7: ( 'needs:' )
            // InternalPipelineLexer.g:132:9: 'needs:'
            {
            match("needs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Needs"

    // $ANTLR start "Paths"
    public final void mPaths() throws RecognitionException {
        try {
            int _type = Paths;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:134:7: ( 'paths:' )
            // InternalPipelineLexer.g:134:9: 'paths:'
            {
            match("paths:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Paths"

    // $ANTLR start "Ports"
    public final void mPorts() throws RecognitionException {
        try {
            int _type = Ports;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:136:7: ( 'ports:' )
            // InternalPipelineLexer.g:136:9: 'ports:'
            {
            match("ports:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ports"

    // $ANTLR start "Shell"
    public final void mShell() throws RecognitionException {
        try {
            int _type = Shell;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:138:7: ( 'shell:' )
            // InternalPipelineLexer.g:138:9: 'shell:'
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

    // $ANTLR start "Types"
    public final void mTypes() throws RecognitionException {
        try {
            int _type = Types;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:140:7: ( 'types:' )
            // InternalPipelineLexer.g:140:9: 'types:'
            {
            match("types:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Types"

    // $ANTLR start "Args"
    public final void mArgs() throws RecognitionException {
        try {
            int _type = Args;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:142:6: ( 'args:' )
            // InternalPipelineLexer.g:142:8: 'args:'
            {
            match("args:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Args"

    // $ANTLR start "Cron"
    public final void mCron() throws RecognitionException {
        try {
            int _type = Cron;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:144:6: ( 'cron:' )
            // InternalPipelineLexer.g:144:8: 'cron:'
            {
            match("cron:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cron"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:146:6: ( 'name:' )
            // InternalPipelineLexer.g:146:8: 'name:'
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

    // $ANTLR start "Path"
    public final void mPath() throws RecognitionException {
        try {
            int _type = Path;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:148:6: ( 'path:' )
            // InternalPipelineLexer.g:148:8: 'path:'
            {
            match("path:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Path"

    // $ANTLR start "Push"
    public final void mPush() throws RecognitionException {
        try {
            int _type = Push;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:150:6: ( 'push:' )
            // InternalPipelineLexer.g:150:8: 'push:'
            {
            match("push:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Push"

    // $ANTLR start "Tags"
    public final void mTags() throws RecognitionException {
        try {
            int _type = Tags;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:152:6: ( 'tags:' )
            // InternalPipelineLexer.g:152:8: 'tags:'
            {
            match("tags:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tags"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:154:6: ( 'type:' )
            // InternalPipelineLexer.g:154:8: 'type:'
            {
            match("type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Uses"
    public final void mUses() throws RecognitionException {
        try {
            int _type = Uses;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:156:6: ( 'uses:' )
            // InternalPipelineLexer.g:156:8: 'uses:'
            {
            match("uses:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uses"

    // $ANTLR start "Env"
    public final void mEnv() throws RecognitionException {
        try {
            int _type = Env;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:158:5: ( 'env:' )
            // InternalPipelineLexer.g:158:7: 'env:'
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

    // $ANTLR start "Id"
    public final void mId() throws RecognitionException {
        try {
            int _type = Id;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:160:4: ( 'id:' )
            // InternalPipelineLexer.g:160:6: 'id:'
            {
            match("id:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Id"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:162:4: ( 'if:' )
            // InternalPipelineLexer.g:162:6: 'if:'
            {
            match("if:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "On"
    public final void mOn() throws RecognitionException {
        try {
            int _type = On;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:164:4: ( 'on:' )
            // InternalPipelineLexer.g:164:6: 'on:'
            {
            match("on:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "On"

    // $ANTLR start "Pr"
    public final void mPr() throws RecognitionException {
        try {
            int _type = Pr;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:166:4: ( 'pr:' )
            // InternalPipelineLexer.g:166:6: 'pr:'
            {
            match("pr:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pr"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:168:17: ( '!' )
            // InternalPipelineLexer.g:168:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:170:10: ( '*' )
            // InternalPipelineLexer.g:170:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:172:7: ( ',' )
            // InternalPipelineLexer.g:172:9: ','
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
            // InternalPipelineLexer.g:174:13: ( '-' )
            // InternalPipelineLexer.g:174:15: '-'
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
            // InternalPipelineLexer.g:176:7: ( ':' )
            // InternalPipelineLexer.g:176:9: ':'
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
            // InternalPipelineLexer.g:178:19: ( '[' )
            // InternalPipelineLexer.g:178:21: '['
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
            // InternalPipelineLexer.g:180:20: ( ']' )
            // InternalPipelineLexer.g:180:22: ']'
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

    // $ANTLR start "KW__"
    public final void mKW__() throws RecognitionException {
        try {
            int _type = KW__;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:182:6: ( '_' )
            // InternalPipelineLexer.g:182:8: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW__"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:184:18: ( '{' )
            // InternalPipelineLexer.g:184:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:186:19: ( '}' )
            // InternalPipelineLexer.g:186:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:188:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' | '@' | '-' | '.' | '\\\\' | '&' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '/' | '@' | '&' | '-' | '.' | '\\\\' | '$' | '(' | ')' )* )
            // InternalPipelineLexer.g:188:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' | '@' | '-' | '.' | '\\\\' | '&' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '/' | '@' | '&' | '-' | '.' | '\\\\' | '$' | '(' | ')' )*
            {
            if ( input.LA(1)=='&'||(input.LA(1)>='-' && input.LA(1)<='/')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPipelineLexer.g:188:60: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '/' | '@' | '&' | '-' | '.' | '\\\\' | '$' | '(' | ')' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||LA1_0=='&'||(LA1_0>='(' && LA1_0<=')')||(LA1_0>='-' && LA1_0<='9')||(LA1_0>='@' && LA1_0<='Z')||LA1_0=='\\'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPipelineLexer.g:
            	    {
            	    if ( input.LA(1)=='$'||input.LA(1)=='&'||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>='-' && input.LA(1)<='9')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_COMPLEX_EXPRESSION"
    public final void mRULE_COMPLEX_EXPRESSION() throws RecognitionException {
        try {
            int _type = RULE_COMPLEX_EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:190:25: ( '${{' ( options {greedy=false; } : . )* '}}' )
            // InternalPipelineLexer.g:190:27: '${{' ( options {greedy=false; } : . )* '}}'
            {
            match("${{"); 

            // InternalPipelineLexer.g:190:33: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='}') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='}') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='|')||(LA2_1>='~' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='|')||(LA2_0>='~' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPipelineLexer.g:190:61: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("}}"); 


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
            // InternalPipelineLexer.g:192:14: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalPipelineLexer.g:192:16: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalPipelineLexer.g:192:21: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||(LA3_0>='a' && LA3_0<='f')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // InternalPipelineLexer.g:194:20: ( ( '-' )? RULE_INT '.' RULE_INT )
            // InternalPipelineLexer.g:194:22: ( '-' )? RULE_INT '.' RULE_INT
            {
            // InternalPipelineLexer.g:194:22: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPipelineLexer.g:194:22: '-'
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
            // InternalPipelineLexer.g:196:14: ( RULE_INT ( '.' RULE_INT )+ )
            // InternalPipelineLexer.g:196:16: RULE_INT ( '.' RULE_INT )+
            {
            mRULE_INT(); 
            // InternalPipelineLexer.g:196:25: ( '.' RULE_INT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='.') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPipelineLexer.g:196:26: '.' RULE_INT
            	    {
            	    match('.'); 
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:198:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPipelineLexer.g:198:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPipelineLexer.g:198:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPipelineLexer.g:198:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPipelineLexer.g:198:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPipelineLexer.g:198:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPipelineLexer.g:198:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPipelineLexer.g:198:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPipelineLexer.g:198:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalPipelineLexer.g:198:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPipelineLexer.g:198:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:200:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPipelineLexer.g:200:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPipelineLexer.g:200:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPipelineLexer.g:200:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalPipelineLexer.g:202:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPipelineLexer.g:202:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalPipelineLexer.g:202:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPipelineLexer.g:202:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalPipelineLexer.g:202:39: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPipelineLexer.g:202:40: ( '\\r' )? '\\n'
                    {
                    // InternalPipelineLexer.g:202:40: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalPipelineLexer.g:202:40: '\\r'
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
            // InternalPipelineLexer.g:204:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPipelineLexer.g:204:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPipelineLexer.g:204:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
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
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:206:16: ( . )
            // InternalPipelineLexer.g:206:18: .
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

    // $ANTLR start "RULE_UNCLOSED_STRING"
    public final void mRULE_UNCLOSED_STRING() throws RecognitionException {
        try {
            int _type = RULE_UNCLOSED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:208:22: ( '\"' (~ ( '\"' ) )* EOF )
            // InternalPipelineLexer.g:208:24: '\"' (~ ( '\"' ) )* EOF
            {
            match('\"'); 
            // InternalPipelineLexer.g:208:28: (~ ( '\"' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPipelineLexer.g:208:28: ~ ( '\"' )
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
            	    break loop14;
                }
            } while (true);

            match(EOF); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNCLOSED_STRING"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalPipelineLexer.g:210:21: ()
            // InternalPipelineLexer.g:210:23: 
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
            // InternalPipelineLexer.g:212:19: ()
            // InternalPipelineLexer.g:212:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:214:10: ( ( '0' .. '9' )+ )
            // InternalPipelineLexer.g:214:12: ( '0' .. '9' )+
            {
            // InternalPipelineLexer.g:214:12: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPipelineLexer.g:214:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    public void mTokens() throws RecognitionException {
        // InternalPipelineLexer.g:1:8: ( ContinueOnError | SettableVariables | WorkingDirectory | BranchesIgnore | TimeoutMinutes | DownloadBuild | MaxParallel | PathsIgnore | Pull_request | Repositories | Workflow_run | Concurrency | Credentials | Environment | Permissions | TagsIgnore | Containers | Deployment | Entrypoint | Parameters | Container | FailFast | Pipelines | Resources | ReviewApp | Schedules | Variables | Branches | Defaults | Packages | Pipeline | Required | RunName | Schedule | Strategy | Template | Webhooks | WriteAll | Exclude | Extends | Filters | Include | Inherit | Outputs | ReadAll | Rolling | RunOnce | RunsOn | Secrets | Trigger | Builds | Canary | Inputs | Matrix | Script | Target | Build | Group | Image | Needs | Paths | Ports | Shell | Types | Args | Cron | Name | Path | Push | Tags | Type | Uses | Env | Id | If | On | Pr | ExclamationMark | Asterisk | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_COMPLEX_EXPRESSION | RULE_HEX_INT | RULE_FLOAT_LITERAL | RULE_VERSION | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_UNCLOSED_STRING | RULE_INT )
        int alt16=99;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalPipelineLexer.g:1:10: ContinueOnError
                {
                mContinueOnError(); 

                }
                break;
            case 2 :
                // InternalPipelineLexer.g:1:26: SettableVariables
                {
                mSettableVariables(); 

                }
                break;
            case 3 :
                // InternalPipelineLexer.g:1:44: WorkingDirectory
                {
                mWorkingDirectory(); 

                }
                break;
            case 4 :
                // InternalPipelineLexer.g:1:61: BranchesIgnore
                {
                mBranchesIgnore(); 

                }
                break;
            case 5 :
                // InternalPipelineLexer.g:1:76: TimeoutMinutes
                {
                mTimeoutMinutes(); 

                }
                break;
            case 6 :
                // InternalPipelineLexer.g:1:91: DownloadBuild
                {
                mDownloadBuild(); 

                }
                break;
            case 7 :
                // InternalPipelineLexer.g:1:105: MaxParallel
                {
                mMaxParallel(); 

                }
                break;
            case 8 :
                // InternalPipelineLexer.g:1:117: PathsIgnore
                {
                mPathsIgnore(); 

                }
                break;
            case 9 :
                // InternalPipelineLexer.g:1:129: Pull_request
                {
                mPull_request(); 

                }
                break;
            case 10 :
                // InternalPipelineLexer.g:1:142: Repositories
                {
                mRepositories(); 

                }
                break;
            case 11 :
                // InternalPipelineLexer.g:1:155: Workflow_run
                {
                mWorkflow_run(); 

                }
                break;
            case 12 :
                // InternalPipelineLexer.g:1:168: Concurrency
                {
                mConcurrency(); 

                }
                break;
            case 13 :
                // InternalPipelineLexer.g:1:180: Credentials
                {
                mCredentials(); 

                }
                break;
            case 14 :
                // InternalPipelineLexer.g:1:192: Environment
                {
                mEnvironment(); 

                }
                break;
            case 15 :
                // InternalPipelineLexer.g:1:204: Permissions
                {
                mPermissions(); 

                }
                break;
            case 16 :
                // InternalPipelineLexer.g:1:216: TagsIgnore
                {
                mTagsIgnore(); 

                }
                break;
            case 17 :
                // InternalPipelineLexer.g:1:227: Containers
                {
                mContainers(); 

                }
                break;
            case 18 :
                // InternalPipelineLexer.g:1:238: Deployment
                {
                mDeployment(); 

                }
                break;
            case 19 :
                // InternalPipelineLexer.g:1:249: Entrypoint
                {
                mEntrypoint(); 

                }
                break;
            case 20 :
                // InternalPipelineLexer.g:1:260: Parameters
                {
                mParameters(); 

                }
                break;
            case 21 :
                // InternalPipelineLexer.g:1:271: Container
                {
                mContainer(); 

                }
                break;
            case 22 :
                // InternalPipelineLexer.g:1:281: FailFast
                {
                mFailFast(); 

                }
                break;
            case 23 :
                // InternalPipelineLexer.g:1:290: Pipelines
                {
                mPipelines(); 

                }
                break;
            case 24 :
                // InternalPipelineLexer.g:1:300: Resources
                {
                mResources(); 

                }
                break;
            case 25 :
                // InternalPipelineLexer.g:1:310: ReviewApp
                {
                mReviewApp(); 

                }
                break;
            case 26 :
                // InternalPipelineLexer.g:1:320: Schedules
                {
                mSchedules(); 

                }
                break;
            case 27 :
                // InternalPipelineLexer.g:1:330: Variables
                {
                mVariables(); 

                }
                break;
            case 28 :
                // InternalPipelineLexer.g:1:340: Branches
                {
                mBranches(); 

                }
                break;
            case 29 :
                // InternalPipelineLexer.g:1:349: Defaults
                {
                mDefaults(); 

                }
                break;
            case 30 :
                // InternalPipelineLexer.g:1:358: Packages
                {
                mPackages(); 

                }
                break;
            case 31 :
                // InternalPipelineLexer.g:1:367: Pipeline
                {
                mPipeline(); 

                }
                break;
            case 32 :
                // InternalPipelineLexer.g:1:376: Required
                {
                mRequired(); 

                }
                break;
            case 33 :
                // InternalPipelineLexer.g:1:385: RunName
                {
                mRunName(); 

                }
                break;
            case 34 :
                // InternalPipelineLexer.g:1:393: Schedule
                {
                mSchedule(); 

                }
                break;
            case 35 :
                // InternalPipelineLexer.g:1:402: Strategy
                {
                mStrategy(); 

                }
                break;
            case 36 :
                // InternalPipelineLexer.g:1:411: Template
                {
                mTemplate(); 

                }
                break;
            case 37 :
                // InternalPipelineLexer.g:1:420: Webhooks
                {
                mWebhooks(); 

                }
                break;
            case 38 :
                // InternalPipelineLexer.g:1:429: WriteAll
                {
                mWriteAll(); 

                }
                break;
            case 39 :
                // InternalPipelineLexer.g:1:438: Exclude
                {
                mExclude(); 

                }
                break;
            case 40 :
                // InternalPipelineLexer.g:1:446: Extends
                {
                mExtends(); 

                }
                break;
            case 41 :
                // InternalPipelineLexer.g:1:454: Filters
                {
                mFilters(); 

                }
                break;
            case 42 :
                // InternalPipelineLexer.g:1:462: Include
                {
                mInclude(); 

                }
                break;
            case 43 :
                // InternalPipelineLexer.g:1:470: Inherit
                {
                mInherit(); 

                }
                break;
            case 44 :
                // InternalPipelineLexer.g:1:478: Outputs
                {
                mOutputs(); 

                }
                break;
            case 45 :
                // InternalPipelineLexer.g:1:486: ReadAll
                {
                mReadAll(); 

                }
                break;
            case 46 :
                // InternalPipelineLexer.g:1:494: Rolling
                {
                mRolling(); 

                }
                break;
            case 47 :
                // InternalPipelineLexer.g:1:502: RunOnce
                {
                mRunOnce(); 

                }
                break;
            case 48 :
                // InternalPipelineLexer.g:1:510: RunsOn
                {
                mRunsOn(); 

                }
                break;
            case 49 :
                // InternalPipelineLexer.g:1:517: Secrets
                {
                mSecrets(); 

                }
                break;
            case 50 :
                // InternalPipelineLexer.g:1:525: Trigger
                {
                mTrigger(); 

                }
                break;
            case 51 :
                // InternalPipelineLexer.g:1:533: Builds
                {
                mBuilds(); 

                }
                break;
            case 52 :
                // InternalPipelineLexer.g:1:540: Canary
                {
                mCanary(); 

                }
                break;
            case 53 :
                // InternalPipelineLexer.g:1:547: Inputs
                {
                mInputs(); 

                }
                break;
            case 54 :
                // InternalPipelineLexer.g:1:554: Matrix
                {
                mMatrix(); 

                }
                break;
            case 55 :
                // InternalPipelineLexer.g:1:561: Script
                {
                mScript(); 

                }
                break;
            case 56 :
                // InternalPipelineLexer.g:1:568: Target
                {
                mTarget(); 

                }
                break;
            case 57 :
                // InternalPipelineLexer.g:1:575: Build
                {
                mBuild(); 

                }
                break;
            case 58 :
                // InternalPipelineLexer.g:1:581: Group
                {
                mGroup(); 

                }
                break;
            case 59 :
                // InternalPipelineLexer.g:1:587: Image
                {
                mImage(); 

                }
                break;
            case 60 :
                // InternalPipelineLexer.g:1:593: Needs
                {
                mNeeds(); 

                }
                break;
            case 61 :
                // InternalPipelineLexer.g:1:599: Paths
                {
                mPaths(); 

                }
                break;
            case 62 :
                // InternalPipelineLexer.g:1:605: Ports
                {
                mPorts(); 

                }
                break;
            case 63 :
                // InternalPipelineLexer.g:1:611: Shell
                {
                mShell(); 

                }
                break;
            case 64 :
                // InternalPipelineLexer.g:1:617: Types
                {
                mTypes(); 

                }
                break;
            case 65 :
                // InternalPipelineLexer.g:1:623: Args
                {
                mArgs(); 

                }
                break;
            case 66 :
                // InternalPipelineLexer.g:1:628: Cron
                {
                mCron(); 

                }
                break;
            case 67 :
                // InternalPipelineLexer.g:1:633: Name
                {
                mName(); 

                }
                break;
            case 68 :
                // InternalPipelineLexer.g:1:638: Path
                {
                mPath(); 

                }
                break;
            case 69 :
                // InternalPipelineLexer.g:1:643: Push
                {
                mPush(); 

                }
                break;
            case 70 :
                // InternalPipelineLexer.g:1:648: Tags
                {
                mTags(); 

                }
                break;
            case 71 :
                // InternalPipelineLexer.g:1:653: Type
                {
                mType(); 

                }
                break;
            case 72 :
                // InternalPipelineLexer.g:1:658: Uses
                {
                mUses(); 

                }
                break;
            case 73 :
                // InternalPipelineLexer.g:1:663: Env
                {
                mEnv(); 

                }
                break;
            case 74 :
                // InternalPipelineLexer.g:1:667: Id
                {
                mId(); 

                }
                break;
            case 75 :
                // InternalPipelineLexer.g:1:670: If
                {
                mIf(); 

                }
                break;
            case 76 :
                // InternalPipelineLexer.g:1:673: On
                {
                mOn(); 

                }
                break;
            case 77 :
                // InternalPipelineLexer.g:1:676: Pr
                {
                mPr(); 

                }
                break;
            case 78 :
                // InternalPipelineLexer.g:1:679: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 79 :
                // InternalPipelineLexer.g:1:695: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 80 :
                // InternalPipelineLexer.g:1:704: Comma
                {
                mComma(); 

                }
                break;
            case 81 :
                // InternalPipelineLexer.g:1:710: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 82 :
                // InternalPipelineLexer.g:1:722: Colon
                {
                mColon(); 

                }
                break;
            case 83 :
                // InternalPipelineLexer.g:1:728: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 84 :
                // InternalPipelineLexer.g:1:746: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 85 :
                // InternalPipelineLexer.g:1:765: KW__
                {
                mKW__(); 

                }
                break;
            case 86 :
                // InternalPipelineLexer.g:1:770: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 87 :
                // InternalPipelineLexer.g:1:787: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 88 :
                // InternalPipelineLexer.g:1:805: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 89 :
                // InternalPipelineLexer.g:1:813: RULE_COMPLEX_EXPRESSION
                {
                mRULE_COMPLEX_EXPRESSION(); 

                }
                break;
            case 90 :
                // InternalPipelineLexer.g:1:837: RULE_HEX_INT
                {
                mRULE_HEX_INT(); 

                }
                break;
            case 91 :
                // InternalPipelineLexer.g:1:850: RULE_FLOAT_LITERAL
                {
                mRULE_FLOAT_LITERAL(); 

                }
                break;
            case 92 :
                // InternalPipelineLexer.g:1:869: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 93 :
                // InternalPipelineLexer.g:1:882: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 94 :
                // InternalPipelineLexer.g:1:894: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 95 :
                // InternalPipelineLexer.g:1:910: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 96 :
                // InternalPipelineLexer.g:1:926: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 97 :
                // InternalPipelineLexer.g:1:934: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 98 :
                // InternalPipelineLexer.g:1:949: RULE_UNCLOSED_STRING
                {
                mRULE_UNCLOSED_STRING(); 

                }
                break;
            case 99 :
                // InternalPipelineLexer.g:1:970: RULE_INT
                {
                mRULE_INT(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\22\52\3\uffff\1\131\3\uffff\1\135\2\uffff\1\52\5\46\4\uffff\3\52\1\uffff\52\52\3\uffff\1\52\12\uffff\1\u00a9\1\uffff\2\u00ac\3\uffff\42\52\1\uffff\22\52\2\uffff\1\52\1\uffff\6\52\1\uffff\1\u00ec\1\u00ac\1\uffff\55\52\1\uffff\21\52\2\uffff\4\52\1\uffff\17\52\1\uffff\4\52\1\uffff\6\52\1\uffff\3\52\1\uffff\32\52\3\uffff\12\52\1\uffff\6\52\1\uffff\5\52\1\uffff\6\52\1\uffff\5\52\1\uffff\23\52\1\uffff\1\52\2\uffff\4\52\1\uffff\3\52\1\uffff\6\52\1\uffff\2\52\1\uffff\6\52\1\uffff\30\52\1\uffff\6\52\1\uffff\12\52\1\uffff\16\52\1\u01ee\1\52\3\uffff\2\52\2\uffff\1\52\1\uffff\1\52\3\uffff\6\52\2\uffff\2\52\1\uffff\1\u01fd\1\52\1\uffff\2\52\1\uffff\2\52\1\uffff\3\52\1\uffff\3\52\1\uffff\3\52\3\uffff\6\52\1\uffff\3\52\1\uffff\2\52\1\uffff\12\52\1\uffff\1\52\2\uffff\2\52\2\uffff\1\52\1\uffff\11\52\1\uffff\2\52\1\uffff\4\52\1\uffff\1\52\2\uffff\5\52\1\uffff\4\52\1\uffff\1\52\1\uffff\3\52\1\uffff\3\52\4\uffff\5\52\1\uffff\10\52\2\uffff\3\52\3\uffff";
    static final String DFA16_eofS =
        "\u0255\uffff";
    static final String DFA16_minS =
        "\1\0\1\141\1\143\1\145\1\162\1\141\1\145\2\141\1\145\1\156\2\141\1\144\1\156\1\162\1\141\1\162\1\163\3\uffff\1\44\3\uffff\1\44\2\uffff\1\52\1\173\2\56\2\0\4\uffff\1\156\1\145\1\156\1\uffff\1\143\1\150\1\162\1\145\1\162\1\142\1\151\1\141\1\151\1\155\1\147\1\155\1\151\1\160\1\167\1\146\1\164\1\143\1\154\1\162\1\160\1\162\1\72\1\141\1\156\1\154\1\164\1\143\1\151\1\154\1\162\1\143\1\141\2\72\1\164\1\72\1\157\1\145\1\155\1\147\1\145\3\uffff\1\56\12\uffff\1\56\1\60\1\42\1\0\3\uffff\1\143\1\144\1\156\1\141\1\164\1\162\1\145\1\151\1\141\1\154\1\153\1\150\1\164\1\156\1\154\1\145\1\163\1\147\1\160\1\147\1\145\1\156\1\154\1\141\1\55\1\162\1\150\1\141\1\153\1\154\1\150\1\155\1\145\1\164\1\uffff\2\157\1\151\1\165\1\144\1\55\1\154\1\72\1\162\1\154\1\145\1\154\1\164\1\151\1\154\1\145\1\165\1\147\2\uffff\1\160\1\uffff\1\165\1\144\1\145\2\163\1\60\1\uffff\1\56\1\0\1\uffff\1\141\1\165\1\145\1\72\1\162\1\141\1\145\1\144\1\160\1\164\1\154\1\146\1\157\1\145\1\143\1\144\1\157\1\55\1\145\1\154\1\147\1\72\1\154\1\157\1\165\1\160\1\151\1\72\1\155\1\141\1\137\1\72\1\151\1\154\2\163\1\165\1\145\1\151\1\55\2\156\1\55\1\151\1\162\1\uffff\1\171\1\165\1\156\1\55\1\145\1\141\1\165\1\162\1\164\1\145\1\165\1\160\1\163\3\72\1\60\2\uffff\1\156\1\151\1\162\1\156\1\uffff\1\171\1\142\1\164\1\165\1\164\1\145\1\72\1\156\1\154\1\157\1\55\1\150\1\72\1\165\1\151\1\uffff\1\164\1\141\1\145\1\72\1\uffff\1\157\1\171\1\154\1\141\1\170\1\55\1\uffff\1\145\1\147\1\162\1\uffff\1\163\1\151\1\72\1\151\1\162\1\167\1\162\2\141\1\143\1\157\1\156\1\157\1\160\2\144\1\146\1\162\1\142\1\144\1\151\1\163\1\72\1\164\2\72\3\uffff\1\165\1\156\1\162\1\164\1\72\1\154\1\163\1\154\1\72\1\147\1\uffff\1\147\1\157\1\153\1\141\1\145\1\72\1\uffff\1\164\1\147\1\72\1\164\1\162\1\uffff\1\141\1\155\1\164\1\162\1\72\1\151\1\uffff\1\164\2\145\1\163\1\156\1\uffff\1\164\1\143\1\101\1\145\1\154\1\155\1\145\1\156\1\147\1\156\1\157\1\145\1\163\1\141\1\163\1\154\1\145\1\164\1\72\1\uffff\1\163\2\uffff\3\145\1\151\1\uffff\1\145\1\72\1\145\1\uffff\1\171\1\55\1\167\1\163\1\154\1\163\1\uffff\1\55\1\156\1\uffff\1\145\1\72\1\144\1\145\1\163\1\141\1\uffff\1\147\1\145\1\163\1\161\1\151\1\145\1\157\1\145\1\160\1\144\1\154\1\145\3\72\1\155\1\151\2\72\1\163\1\72\1\145\2\72\1\uffff\1\72\1\55\1\162\1\156\1\141\1\126\1\uffff\2\72\1\144\1\137\1\72\1\154\1\55\1\155\1\157\1\72\1\uffff\1\102\1\156\1\72\1\154\1\156\1\162\1\72\1\165\1\157\1\72\1\162\1\163\1\160\1\72\1\44\1\72\3\uffff\1\145\1\156\2\uffff\1\164\1\uffff\1\163\3\uffff\1\157\1\72\1\143\1\154\1\141\1\72\2\uffff\1\151\1\162\1\uffff\1\44\1\151\1\uffff\1\151\1\162\1\uffff\1\165\1\164\1\uffff\1\154\1\157\1\163\1\uffff\1\145\1\156\1\72\1\uffff\1\151\2\72\3\uffff\1\156\1\164\2\72\1\156\1\72\1\uffff\1\171\1\163\1\162\1\uffff\1\162\1\165\1\uffff\1\147\1\156\1\145\1\151\1\72\1\145\1\162\1\72\2\163\1\uffff\1\145\2\uffff\1\164\1\72\2\uffff\1\55\1\uffff\2\72\1\151\1\145\2\156\1\165\1\72\1\154\1\uffff\1\154\1\145\1\uffff\1\164\1\72\1\163\1\72\1\uffff\1\145\2\uffff\1\141\1\143\1\72\1\157\1\164\1\uffff\1\144\3\72\1\uffff\1\72\1\uffff\1\162\1\142\1\164\1\uffff\1\162\1\145\1\72\4\uffff\1\162\1\154\1\157\1\145\1\163\1\uffff\1\157\1\145\1\162\2\72\1\162\1\163\1\171\2\uffff\3\72\3\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\162\1\164\1\162\1\165\1\171\1\157\1\141\2\165\1\170\1\151\1\141\1\156\1\165\1\162\1\145\1\162\1\163\3\uffff\1\172\3\uffff\1\172\2\uffff\1\52\1\173\1\170\1\71\2\uffff\4\uffff\1\156\1\157\1\156\1\uffff\1\164\2\162\1\145\1\162\1\142\1\151\1\141\1\151\1\155\1\162\1\155\1\151\1\160\1\167\1\160\1\170\1\164\1\163\1\162\1\160\1\162\1\72\1\166\1\156\1\154\1\166\1\164\1\151\1\154\1\162\1\160\1\141\2\72\1\164\1\72\1\157\1\145\1\155\1\147\1\145\3\uffff\1\71\12\uffff\2\71\1\165\1\uffff\3\uffff\1\164\1\144\1\156\1\141\1\164\1\162\1\145\1\151\1\141\1\154\1\153\1\150\1\164\1\156\1\154\1\145\1\163\1\147\1\160\1\147\1\145\1\156\1\154\1\141\1\55\1\162\1\150\1\141\1\153\1\154\1\150\1\155\1\145\1\164\1\uffff\2\157\1\151\1\165\1\144\1\163\1\154\1\151\1\162\1\154\1\145\1\154\1\164\1\151\1\154\1\145\1\165\1\147\2\uffff\1\160\1\uffff\1\165\1\144\1\145\2\163\1\71\1\uffff\1\71\1\uffff\1\uffff\1\151\1\165\1\145\1\72\1\162\1\141\1\145\1\144\1\160\1\164\1\154\1\151\1\157\1\145\1\143\1\144\1\157\1\72\1\145\1\154\1\147\1\163\1\154\1\157\1\165\1\160\1\151\1\163\1\155\1\141\1\137\1\72\1\151\1\154\2\163\1\165\1\145\1\151\1\55\2\156\1\55\1\151\1\162\1\uffff\1\171\1\165\1\156\1\55\1\145\1\141\1\165\1\162\1\164\1\145\1\165\1\160\1\163\3\72\1\71\2\uffff\1\156\1\151\1\162\1\156\1\uffff\1\171\1\142\1\164\1\165\1\164\1\145\1\72\1\156\1\154\1\157\1\55\1\150\1\163\1\165\1\151\1\uffff\1\164\1\141\1\145\1\72\1\uffff\1\157\1\171\1\154\1\141\1\170\1\72\1\uffff\1\145\1\147\1\162\1\uffff\1\163\1\151\1\72\1\151\1\162\1\167\1\162\2\141\1\143\1\157\1\156\1\157\1\160\2\144\1\146\1\162\1\142\1\144\1\151\1\163\1\72\1\164\2\72\3\uffff\1\165\1\156\1\162\1\164\1\72\1\154\1\163\1\154\1\72\1\147\1\uffff\1\147\1\157\1\153\1\141\1\145\1\72\1\uffff\1\164\1\147\1\72\1\164\1\162\1\uffff\1\141\1\155\1\164\1\162\1\72\1\151\1\uffff\1\164\2\145\1\163\1\156\1\uffff\1\164\1\143\1\101\1\145\1\154\1\155\1\145\1\156\1\147\1\156\1\157\1\145\1\163\1\141\1\163\1\154\1\145\1\164\1\72\1\uffff\1\163\2\uffff\3\145\1\151\1\uffff\1\145\1\72\1\145\1\uffff\1\171\1\55\1\167\1\163\1\154\1\163\1\uffff\1\55\1\156\1\uffff\1\145\1\72\1\144\1\145\1\163\1\141\1\uffff\1\147\1\145\1\163\1\161\1\151\1\145\1\157\1\145\1\160\1\144\1\154\1\145\3\72\1\155\1\151\2\72\1\163\1\72\1\145\2\72\1\uffff\1\72\1\55\1\162\1\156\1\141\1\126\1\uffff\1\163\1\72\1\144\1\137\1\72\1\154\1\72\1\155\1\157\1\72\1\uffff\1\102\1\156\1\72\1\154\1\156\1\162\1\72\1\165\1\157\1\163\1\162\1\163\1\160\1\72\1\172\1\72\3\uffff\1\145\1\156\2\uffff\1\164\1\uffff\1\163\3\uffff\1\157\1\163\1\143\1\154\1\141\1\72\2\uffff\1\151\1\162\1\uffff\1\172\1\151\1\uffff\1\151\1\162\1\uffff\1\165\1\164\1\uffff\1\154\1\157\1\163\1\uffff\1\145\1\156\1\72\1\uffff\1\151\2\72\3\uffff\1\156\1\164\2\72\1\156\1\72\1\uffff\1\171\1\163\1\162\1\uffff\1\162\1\165\1\uffff\1\147\1\156\1\145\1\151\1\72\1\145\1\162\1\72\2\163\1\uffff\1\145\2\uffff\1\164\1\72\2\uffff\1\55\1\uffff\2\72\1\151\1\145\2\156\1\165\1\72\1\154\1\uffff\1\154\1\145\1\uffff\1\164\1\72\1\163\1\72\1\uffff\1\145\2\uffff\1\141\1\143\1\72\1\157\1\164\1\uffff\1\144\3\72\1\uffff\1\72\1\uffff\1\162\1\142\1\164\1\uffff\1\162\1\145\1\72\4\uffff\1\162\1\154\1\157\1\145\1\163\1\uffff\1\157\1\145\1\162\2\72\1\162\1\163\1\171\2\uffff\3\72\3\uffff";
    static final String DFA16_acceptS =
        "\23\uffff\1\116\1\117\1\120\1\uffff\1\122\1\123\1\124\1\uffff\1\126\1\127\6\uffff\1\130\1\137\1\140\1\141\3\uffff\1\130\52\uffff\1\116\1\117\1\120\1\uffff\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\136\1\131\1\132\4\uffff\1\135\1\137\1\140\42\uffff\1\115\22\uffff\1\112\1\113\1\uffff\1\114\6\uffff\1\143\2\uffff\1\142\55\uffff\1\111\21\uffff\1\133\1\134\4\uffff\1\102\17\uffff\1\106\4\uffff\1\107\6\uffff\1\104\3\uffff\1\105\32\uffff\1\103\1\101\1\110\12\uffff\1\77\6\uffff\1\71\5\uffff\1\100\6\uffff\1\75\5\uffff\1\76\23\uffff\1\73\1\uffff\1\72\1\74\4\uffff\1\64\3\uffff\1\67\6\uffff\1\63\2\uffff\1\70\6\uffff\1\66\30\uffff\1\65\6\uffff\1\61\12\uffff\1\62\20\uffff\1\57\1\60\1\56\2\uffff\1\47\1\50\1\uffff\1\51\1\uffff\1\52\1\53\1\54\6\uffff\1\42\1\43\2\uffff\1\45\2\uffff\1\34\2\uffff\1\44\2\uffff\1\35\3\uffff\1\36\3\uffff\1\37\3\uffff\1\40\1\55\1\41\6\uffff\1\25\3\uffff\1\32\2\uffff\1\46\12\uffff\1\27\1\uffff\1\30\1\31\2\uffff\1\26\1\33\1\uffff\1\21\11\uffff\1\22\2\uffff\1\24\4\uffff\1\23\1\uffff\1\14\1\15\5\uffff\1\20\4\uffff\1\17\1\uffff\1\16\3\uffff\1\13\3\uffff\1\7\1\10\1\11\1\12\5\uffff\1\6\10\uffff\1\4\1\5\3\uffff\1\1\1\2\1\3";
    static final String DFA16_specialS =
        "\1\4\40\uffff\1\3\1\2\103\uffff\1\1\104\uffff\1\0\u01a9\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\23\1\41\1\44\1\36\1\46\1\43\1\42\2\46\1\24\1\46\1\25\1\26\1\43\1\35\1\37\11\40\1\27\5\46\33\43\1\30\1\43\1\31\1\46\1\32\1\46\1\21\1\4\1\1\1\6\1\12\1\13\1\17\1\43\1\15\3\43\1\7\1\20\1\16\1\10\1\43\1\11\1\2\1\5\1\22\1\14\1\3\3\43\1\33\1\46\1\34\uff82\46",
            "\1\51\15\uffff\1\47\2\uffff\1\50",
            "\1\54\1\uffff\1\53\2\uffff\1\56\13\uffff\1\55",
            "\1\60\11\uffff\1\57\2\uffff\1\61",
            "\1\62\2\uffff\1\63",
            "\1\65\3\uffff\1\66\3\uffff\1\64\10\uffff\1\67\6\uffff\1\70",
            "\1\72\11\uffff\1\71",
            "\1\73",
            "\1\74\3\uffff\1\76\3\uffff\1\77\5\uffff\1\100\2\uffff\1\101\2\uffff\1\75",
            "\1\102\11\uffff\1\104\5\uffff\1\103",
            "\1\105\11\uffff\1\106",
            "\1\107\7\uffff\1\110",
            "\1\111",
            "\1\114\1\uffff\1\115\6\uffff\1\113\1\112",
            "\1\117\6\uffff\1\116",
            "\1\120",
            "\1\122\3\uffff\1\121",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "\1\52\1\uffff\1\52\1\uffff\2\52\3\uffff\3\52\12\130\6\uffff\33\52\1\uffff\1\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\52\1\uffff\1\52\1\uffff\2\52\3\uffff\15\52\6\uffff\33\52\1\uffff\1\52\2\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\144\1\uffff\12\143\76\uffff\1\142",
            "\1\144\1\uffff\12\143",
            "\42\146\1\147\71\146\1\145\uffa3\146",
            "\0\147",
            "",
            "",
            "",
            "",
            "\1\152",
            "\1\153\11\uffff\1\154",
            "\1\155",
            "",
            "\1\157\20\uffff\1\156",
            "\1\160\11\uffff\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172\12\uffff\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0081\11\uffff\1\u0080",
            "\1\u0083\3\uffff\1\u0082",
            "\1\u0086\16\uffff\1\u0085\1\uffff\1\u0084",
            "\1\u0087\6\uffff\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u0091\16\uffff\1\u008d\1\u0090\1\uffff\1\u008e\2\uffff\1\u008f",
            "\1\u0092",
            "\1\u0093",
            "\1\u0095\1\uffff\1\u0094",
            "\1\u0096\20\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b\4\uffff\1\u009c\7\uffff\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "",
            "",
            "\1\u00a8\1\uffff\12\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\144\1\uffff\12\143",
            "\12\u00aa",
            "\1\147\4\uffff\1\u00ab\64\uffff\1\u00ab\5\uffff\1\u00ab\3\uffff\1\u00ab\7\uffff\1\u00ab\3\uffff\1\u00ab\1\uffff\2\u00ab",
            "\42\146\1\147\71\146\1\145\uffa3\146",
            "",
            "",
            "",
            "\1\u00ae\20\uffff\1\u00ad",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
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
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5\41\uffff\1\u00d6\43\uffff\1\u00d7",
            "\1\u00d8",
            "\1\u00da\56\uffff\1\u00d9",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\u00eb",
            "",
            "\1\u00ed\1\uffff\12\u00aa",
            "\42\146\1\147\71\146\1\145\uffa3\146",
            "",
            "\1\u00ef\7\uffff\1\u00ee",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fb\2\uffff\1\u00fa",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101\14\uffff\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0107\70\uffff\1\u0106",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010e\70\uffff\1\u010d",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\u00eb",
            "",
            "",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0141\70\uffff\1\u0140",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d\14\uffff\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "",
            "",
            "",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "",
            "\1\u019f",
            "",
            "",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "",
            "\1\u01ad",
            "\1\u01ae",
            "",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "",
            "\1\u01d4\70\uffff\1\u01d3",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da\14\uffff\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e9\70\uffff\1\u01e8",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\52\1\uffff\1\52\1\uffff\2\52\3\uffff\15\52\6\uffff\33\52\1\uffff\1\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01ef",
            "",
            "",
            "",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "",
            "\1\u01f2",
            "",
            "\1\u01f3",
            "",
            "",
            "",
            "\1\u01f4",
            "\1\u01f6\70\uffff\1\u01f5",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "",
            "",
            "\1\u01fb",
            "\1\u01fc",
            "",
            "\1\52\1\uffff\1\52\1\uffff\2\52\3\uffff\15\52\6\uffff\33\52\1\uffff\1\52\2\uffff\1\52\1\uffff\32\52",
            "\1\u01fe",
            "",
            "\1\u01ff",
            "\1\u0200",
            "",
            "\1\u0201",
            "\1\u0202",
            "",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "",
            "",
            "",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "",
            "\1\u0215",
            "\1\u0216",
            "",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "",
            "\1\u0221",
            "",
            "",
            "\1\u0222",
            "\1\u0223",
            "",
            "",
            "\1\u0224",
            "",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "",
            "\1\u022e",
            "\1\u022f",
            "",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "",
            "\1\u0234",
            "",
            "",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "",
            "\1\u023e",
            "",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "",
            "",
            "",
            "",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "",
            "",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ContinueOnError | SettableVariables | WorkingDirectory | BranchesIgnore | TimeoutMinutes | DownloadBuild | MaxParallel | PathsIgnore | Pull_request | Repositories | Workflow_run | Concurrency | Credentials | Environment | Permissions | TagsIgnore | Containers | Deployment | Entrypoint | Parameters | Container | FailFast | Pipelines | Resources | ReviewApp | Schedules | Variables | Branches | Defaults | Packages | Pipeline | Required | RunName | Schedule | Strategy | Template | Webhooks | WriteAll | Exclude | Extends | Filters | Include | Inherit | Outputs | ReadAll | Rolling | RunOnce | RunsOn | Secrets | Trigger | Builds | Canary | Inputs | Matrix | Script | Target | Build | Group | Image | Needs | Paths | Ports | Shell | Types | Args | Cron | Name | Path | Push | Tags | Type | Uses | Env | Id | If | On | Pr | ExclamationMark | Asterisk | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | KW__ | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_COMPLEX_EXPRESSION | RULE_HEX_INT | RULE_FLOAT_LITERAL | RULE_VERSION | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_UNCLOSED_STRING | RULE_INT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_171 = input.LA(1);

                        s = -1;
                        if ( (LA16_171=='\\') ) {s = 101;}

                        else if ( (LA16_171=='\"') ) {s = 103;}

                        else if ( ((LA16_171>='\u0000' && LA16_171<='!')||(LA16_171>='#' && LA16_171<='[')||(LA16_171>=']' && LA16_171<='\uFFFF')) ) {s = 102;}

                        else s = 172;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_102 = input.LA(1);

                        s = -1;
                        if ( (LA16_102=='\"') ) {s = 103;}

                        else if ( (LA16_102=='\\') ) {s = 101;}

                        else if ( ((LA16_102>='\u0000' && LA16_102<='!')||(LA16_102>='#' && LA16_102<='[')||(LA16_102>=']' && LA16_102<='\uFFFF')) ) {s = 102;}

                        else s = 172;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_34 = input.LA(1);

                        s = -1;
                        if ( ((LA16_34>='\u0000' && LA16_34<='\uFFFF')) ) {s = 103;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_33 = input.LA(1);

                        s = -1;
                        if ( (LA16_33=='\\') ) {s = 101;}

                        else if ( ((LA16_33>='\u0000' && LA16_33<='!')||(LA16_33>='#' && LA16_33<='[')||(LA16_33>=']' && LA16_33<='\uFFFF')) ) {s = 102;}

                        else if ( (LA16_33=='\"') ) {s = 103;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='c') ) {s = 1;}

                        else if ( (LA16_0=='s') ) {s = 2;}

                        else if ( (LA16_0=='w') ) {s = 3;}

                        else if ( (LA16_0=='b') ) {s = 4;}

                        else if ( (LA16_0=='t') ) {s = 5;}

                        else if ( (LA16_0=='d') ) {s = 6;}

                        else if ( (LA16_0=='m') ) {s = 7;}

                        else if ( (LA16_0=='p') ) {s = 8;}

                        else if ( (LA16_0=='r') ) {s = 9;}

                        else if ( (LA16_0=='e') ) {s = 10;}

                        else if ( (LA16_0=='f') ) {s = 11;}

                        else if ( (LA16_0=='v') ) {s = 12;}

                        else if ( (LA16_0=='i') ) {s = 13;}

                        else if ( (LA16_0=='o') ) {s = 14;}

                        else if ( (LA16_0=='g') ) {s = 15;}

                        else if ( (LA16_0=='n') ) {s = 16;}

                        else if ( (LA16_0=='a') ) {s = 17;}

                        else if ( (LA16_0=='u') ) {s = 18;}

                        else if ( (LA16_0=='!') ) {s = 19;}

                        else if ( (LA16_0=='*') ) {s = 20;}

                        else if ( (LA16_0==',') ) {s = 21;}

                        else if ( (LA16_0=='-') ) {s = 22;}

                        else if ( (LA16_0==':') ) {s = 23;}

                        else if ( (LA16_0=='[') ) {s = 24;}

                        else if ( (LA16_0==']') ) {s = 25;}

                        else if ( (LA16_0=='_') ) {s = 26;}

                        else if ( (LA16_0=='{') ) {s = 27;}

                        else if ( (LA16_0=='}') ) {s = 28;}

                        else if ( (LA16_0=='/') ) {s = 29;}

                        else if ( (LA16_0=='$') ) {s = 30;}

                        else if ( (LA16_0=='0') ) {s = 31;}

                        else if ( ((LA16_0>='1' && LA16_0<='9')) ) {s = 32;}

                        else if ( (LA16_0=='\"') ) {s = 33;}

                        else if ( (LA16_0=='\'') ) {s = 34;}

                        else if ( (LA16_0=='&'||LA16_0=='.'||(LA16_0>='@' && LA16_0<='Z')||LA16_0=='\\'||LA16_0=='h'||(LA16_0>='j' && LA16_0<='l')||LA16_0=='q'||(LA16_0>='x' && LA16_0<='z')) ) {s = 35;}

                        else if ( (LA16_0=='#') ) {s = 36;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 37;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='%'||(LA16_0>='(' && LA16_0<=')')||LA16_0=='+'||(LA16_0>=';' && LA16_0<='?')||LA16_0=='^'||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}