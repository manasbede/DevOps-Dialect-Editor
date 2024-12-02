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
    public static final int Types=51;
    public static final int RULE_BEGIN=74;
    public static final int Pipelines=20;
    public static final int Include=39;
    public static final int Executors=19;
    public static final int AutoCancel=15;
    public static final int Cron=53;
    public static final int RunName=31;
    public static final int Template=33;
    public static final int Name=54;
    public static final int Read=61;
    public static final int RULE_VERSION=73;
    public static final int Concurrency=12;
    public static final int Version=41;
    public static final int Workflow_call=8;
    public static final int TagsIgnore=14;
    public static final int Packages=29;
    public static final int ReadAll=40;
    public static final int Permission=18;
    public static final int Pool=56;
    public static final int Extends=38;
    public static final int Job=59;
    public static final int Tags=50;
    public static final int RightSquareBracket=68;
    public static final int WorkingDirectory=6;
    public static final int Parameters=17;
    public static final int Builds=44;
    public static final int RULE_ID=76;
    public static final int Branches=24;
    public static final int WriteAll=35;
    public static final int Orbs=55;
    public static final int Defaults=26;
    public static final int RULE_INT=71;
    public static final int Value=52;
    public static final int RULE_ML_COMMENT=77;
    public static final int LeftSquareBracket=67;
    public static final int Resources=21;
    public static final int Always=43;
    public static final int Repositories=10;
    public static final int Write=57;
    public static final int Schedules=22;
    public static final int Group=47;
    public static final int RULE_END=75;
    public static final int Demands=37;
    public static final int Containers=16;
    public static final int RULE_STRING=79;
    public static final int VmImage=42;
    public static final int Env=58;
    public static final int CancelInProgress=4;
    public static final int RULE_SL_COMMENT=78;
    public static final int Variables=23;
    public static final int RULE_FLOAT_LITERAL=72;
    public static final int Comma=64;
    public static final int Shell=49;
    public static final int HyphenMinus=65;
    public static final int Readonly=30;
    public static final int Batch=46;
    public static final int DisplayName=13;
    public static final int Commands=25;
    public static final int RULE_COMPLEX_EXPRESSION=69;
    public static final int Paths=48;
    public static final int Colon=66;
    public static final int EOF=-1;
    public static final int Excluded=27;
    public static final int RULE_HEX_INT=70;
    public static final int BranchesIgnore=7;
    public static final int PathsIgnore=9;
    public static final int RULE_WS=80;
    public static final int Included=28;
    public static final int Run=62;
    public static final int RULE_ANY_OTHER=81;
    public static final int Default=36;
    public static final int Workflow_dispatch=5;
    public static final int Drafts=45;
    public static final int Schedule=32;
    public static final int Webhooks=34;
    public static final int None=60;
    public static final int Workflow_run=11;
    public static final int On=63;

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

    // $ANTLR start "Workflow_dispatch"
    public final void mWorkflow_dispatch() throws RecognitionException {
        try {
            int _type = Workflow_dispatch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:16:19: ( 'workflow_dispatch:' )
            // InternalPipelineLexer.g:16:21: 'workflow_dispatch:'
            {
            match("workflow_dispatch:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Workflow_dispatch"

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

    // $ANTLR start "Workflow_call"
    public final void mWorkflow_call() throws RecognitionException {
        try {
            int _type = Workflow_call;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:22:15: ( 'workflow_call:' )
            // InternalPipelineLexer.g:22:17: 'workflow_call:'
            {
            match("workflow_call:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Workflow_call"

    // $ANTLR start "PathsIgnore"
    public final void mPathsIgnore() throws RecognitionException {
        try {
            int _type = PathsIgnore;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:24:13: ( 'paths-ignore:' )
            // InternalPipelineLexer.g:24:15: 'paths-ignore:'
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

    // $ANTLR start "Repositories"
    public final void mRepositories() throws RecognitionException {
        try {
            int _type = Repositories;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:26:14: ( 'repositories:' )
            // InternalPipelineLexer.g:26:16: 'repositories:'
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
            // InternalPipelineLexer.g:28:14: ( 'workflow_run:' )
            // InternalPipelineLexer.g:28:16: 'workflow_run:'
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
            // InternalPipelineLexer.g:30:13: ( 'concurrency:' )
            // InternalPipelineLexer.g:30:15: 'concurrency:'
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
            // InternalPipelineLexer.g:32:13: ( 'displayName:' )
            // InternalPipelineLexer.g:32:15: 'displayName:'
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

    // $ANTLR start "TagsIgnore"
    public final void mTagsIgnore() throws RecognitionException {
        try {
            int _type = TagsIgnore;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:34:12: ( 'tags-ignore:' )
            // InternalPipelineLexer.g:34:14: 'tags-ignore:'
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

    // $ANTLR start "AutoCancel"
    public final void mAutoCancel() throws RecognitionException {
        try {
            int _type = AutoCancel;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:36:12: ( 'autoCancel:' )
            // InternalPipelineLexer.g:36:14: 'autoCancel:'
            {
            match("autoCancel:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AutoCancel"

    // $ANTLR start "Containers"
    public final void mContainers() throws RecognitionException {
        try {
            int _type = Containers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:38:12: ( 'containers:' )
            // InternalPipelineLexer.g:38:14: 'containers:'
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
            // InternalPipelineLexer.g:40:12: ( 'parameters:' )
            // InternalPipelineLexer.g:40:14: 'parameters:'
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
            // InternalPipelineLexer.g:42:12: ( 'permission:' )
            // InternalPipelineLexer.g:42:14: 'permission:'
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

    // $ANTLR start "Executors"
    public final void mExecutors() throws RecognitionException {
        try {
            int _type = Executors;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:44:11: ( 'executors:' )
            // InternalPipelineLexer.g:44:13: 'executors:'
            {
            match("executors:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Executors"

    // $ANTLR start "Pipelines"
    public final void mPipelines() throws RecognitionException {
        try {
            int _type = Pipelines;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:46:11: ( 'pipelines:' )
            // InternalPipelineLexer.g:46:13: 'pipelines:'
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
            // InternalPipelineLexer.g:48:11: ( 'resources:' )
            // InternalPipelineLexer.g:48:13: 'resources:'
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

    // $ANTLR start "Schedules"
    public final void mSchedules() throws RecognitionException {
        try {
            int _type = Schedules;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:50:11: ( 'schedules:' )
            // InternalPipelineLexer.g:50:13: 'schedules:'
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
            // InternalPipelineLexer.g:52:11: ( 'variables:' )
            // InternalPipelineLexer.g:52:13: 'variables:'
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
            // InternalPipelineLexer.g:54:10: ( 'branches:' )
            // InternalPipelineLexer.g:54:12: 'branches:'
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

    // $ANTLR start "Commands"
    public final void mCommands() throws RecognitionException {
        try {
            int _type = Commands;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:56:10: ( 'commands:' )
            // InternalPipelineLexer.g:56:12: 'commands:'
            {
            match("commands:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Commands"

    // $ANTLR start "Defaults"
    public final void mDefaults() throws RecognitionException {
        try {
            int _type = Defaults;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:58:10: ( 'defaults:' )
            // InternalPipelineLexer.g:58:12: 'defaults:'
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

    // $ANTLR start "Excluded"
    public final void mExcluded() throws RecognitionException {
        try {
            int _type = Excluded;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:60:10: ( 'excluded:' )
            // InternalPipelineLexer.g:60:12: 'excluded:'
            {
            match("excluded:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Excluded"

    // $ANTLR start "Included"
    public final void mIncluded() throws RecognitionException {
        try {
            int _type = Included;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:62:10: ( 'included:' )
            // InternalPipelineLexer.g:62:12: 'included:'
            {
            match("included:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Included"

    // $ANTLR start "Packages"
    public final void mPackages() throws RecognitionException {
        try {
            int _type = Packages;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:64:10: ( 'packages:' )
            // InternalPipelineLexer.g:64:12: 'packages:'
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
            // InternalPipelineLexer.g:66:10: ( 'readonly:' )
            // InternalPipelineLexer.g:66:12: 'readonly:'
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
            // InternalPipelineLexer.g:68:9: ( 'run-name:' )
            // InternalPipelineLexer.g:68:11: 'run-name:'
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
            // InternalPipelineLexer.g:70:10: ( 'schedule:' )
            // InternalPipelineLexer.g:70:12: 'schedule:'
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

    // $ANTLR start "Template"
    public final void mTemplate() throws RecognitionException {
        try {
            int _type = Template;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:72:10: ( 'template:' )
            // InternalPipelineLexer.g:72:12: 'template:'
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
            // InternalPipelineLexer.g:74:10: ( 'webhooks:' )
            // InternalPipelineLexer.g:74:12: 'webhooks:'
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
            // InternalPipelineLexer.g:76:10: ( 'write-all' )
            // InternalPipelineLexer.g:76:12: 'write-all'
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
            // InternalPipelineLexer.g:78:9: ( 'default:' )
            // InternalPipelineLexer.g:78:11: 'default:'
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
            // InternalPipelineLexer.g:80:9: ( 'demands:' )
            // InternalPipelineLexer.g:80:11: 'demands:'
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
            // InternalPipelineLexer.g:82:9: ( 'extends:' )
            // InternalPipelineLexer.g:82:11: 'extends:'
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
            // InternalPipelineLexer.g:84:9: ( 'include:' )
            // InternalPipelineLexer.g:84:11: 'include:'
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
            // InternalPipelineLexer.g:86:9: ( 'read-all' )
            // InternalPipelineLexer.g:86:11: 'read-all'
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

    // $ANTLR start "Version"
    public final void mVersion() throws RecognitionException {
        try {
            int _type = Version;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:88:9: ( 'version:' )
            // InternalPipelineLexer.g:88:11: 'version:'
            {
            match("version:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Version"

    // $ANTLR start "VmImage"
    public final void mVmImage() throws RecognitionException {
        try {
            int _type = VmImage;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:90:9: ( 'vmImage:' )
            // InternalPipelineLexer.g:90:11: 'vmImage:'
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

    // $ANTLR start "Always"
    public final void mAlways() throws RecognitionException {
        try {
            int _type = Always;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:92:8: ( 'always:' )
            // InternalPipelineLexer.g:92:10: 'always:'
            {
            match("always:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Always"

    // $ANTLR start "Builds"
    public final void mBuilds() throws RecognitionException {
        try {
            int _type = Builds;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:94:8: ( 'builds:' )
            // InternalPipelineLexer.g:94:10: 'builds:'
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

    // $ANTLR start "Drafts"
    public final void mDrafts() throws RecognitionException {
        try {
            int _type = Drafts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:96:8: ( 'drafts:' )
            // InternalPipelineLexer.g:96:10: 'drafts:'
            {
            match("drafts:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Drafts"

    // $ANTLR start "Batch"
    public final void mBatch() throws RecognitionException {
        try {
            int _type = Batch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:98:7: ( 'batch:' )
            // InternalPipelineLexer.g:98:9: 'batch:'
            {
            match("batch:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Batch"

    // $ANTLR start "Group"
    public final void mGroup() throws RecognitionException {
        try {
            int _type = Group;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:100:7: ( 'group:' )
            // InternalPipelineLexer.g:100:9: 'group:'
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

    // $ANTLR start "Paths"
    public final void mPaths() throws RecognitionException {
        try {
            int _type = Paths;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:102:7: ( 'paths:' )
            // InternalPipelineLexer.g:102:9: 'paths:'
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

    // $ANTLR start "Shell"
    public final void mShell() throws RecognitionException {
        try {
            int _type = Shell;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:104:7: ( 'shell:' )
            // InternalPipelineLexer.g:104:9: 'shell:'
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

    // $ANTLR start "Tags"
    public final void mTags() throws RecognitionException {
        try {
            int _type = Tags;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:106:6: ( 'tags::' )
            // InternalPipelineLexer.g:106:8: 'tags::'
            {
            match("tags::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tags"

    // $ANTLR start "Types"
    public final void mTypes() throws RecognitionException {
        try {
            int _type = Types;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:108:7: ( 'types:' )
            // InternalPipelineLexer.g:108:9: 'types:'
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

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:110:7: ( 'value:' )
            // InternalPipelineLexer.g:110:9: 'value:'
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

    // $ANTLR start "Cron"
    public final void mCron() throws RecognitionException {
        try {
            int _type = Cron;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:112:6: ( 'cron:' )
            // InternalPipelineLexer.g:112:8: 'cron:'
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
            // InternalPipelineLexer.g:114:6: ( 'name:' )
            // InternalPipelineLexer.g:114:8: 'name:'
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

    // $ANTLR start "Orbs"
    public final void mOrbs() throws RecognitionException {
        try {
            int _type = Orbs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:116:6: ( 'orbs:' )
            // InternalPipelineLexer.g:116:8: 'orbs:'
            {
            match("orbs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Orbs"

    // $ANTLR start "Pool"
    public final void mPool() throws RecognitionException {
        try {
            int _type = Pool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:118:6: ( 'pool:' )
            // InternalPipelineLexer.g:118:8: 'pool:'
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
            // InternalPipelineLexer.g:120:7: ( 'write' )
            // InternalPipelineLexer.g:120:9: 'write'
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
            // InternalPipelineLexer.g:122:5: ( 'env:' )
            // InternalPipelineLexer.g:122:7: 'env:'
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

    // $ANTLR start "Job"
    public final void mJob() throws RecognitionException {
        try {
            int _type = Job;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:124:5: ( 'job:' )
            // InternalPipelineLexer.g:124:7: 'job:'
            {
            match("job:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Job"

    // $ANTLR start "None"
    public final void mNone() throws RecognitionException {
        try {
            int _type = None;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:126:6: ( 'none' )
            // InternalPipelineLexer.g:126:8: 'none'
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
            // InternalPipelineLexer.g:128:6: ( 'read' )
            // InternalPipelineLexer.g:128:8: 'read'
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
            // InternalPipelineLexer.g:130:5: ( 'run:' )
            // InternalPipelineLexer.g:130:7: 'run:'
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

    // $ANTLR start "On"
    public final void mOn() throws RecognitionException {
        try {
            int _type = On;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:132:4: ( 'on:' )
            // InternalPipelineLexer.g:132:6: 'on:'
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

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPipelineLexer.g:134:7: ( ',' )
            // InternalPipelineLexer.g:134:9: ','
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
            // InternalPipelineLexer.g:136:13: ( '-' )
            // InternalPipelineLexer.g:136:15: '-'
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
            // InternalPipelineLexer.g:138:7: ( ':' )
            // InternalPipelineLexer.g:138:9: ':'
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
            // InternalPipelineLexer.g:140:19: ( '[' )
            // InternalPipelineLexer.g:140:21: '['
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
            // InternalPipelineLexer.g:142:20: ( ']' )
            // InternalPipelineLexer.g:142:22: ']'
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
            // InternalPipelineLexer.g:144:25: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )* )? '${{' ( options {greedy=false; } : . )* '}}' ( '-${{' ( options {greedy=false; } : . )* '}}' )* )
            // InternalPipelineLexer.g:144:27: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )* )? '${{' ( options {greedy=false; } : . )* '}}' ( '-${{' ( options {greedy=false; } : . )* '}}' )*
            {
            // InternalPipelineLexer.g:144:27: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPipelineLexer.g:144:28: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalPipelineLexer.g:144:48: ( 'a' .. 'z' | 'A' .. 'Z' | '-' )*
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

            // InternalPipelineLexer.g:144:81: ( options {greedy=false; } : . )*
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
            	    // InternalPipelineLexer.g:144:109: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("}}"); 

            // InternalPipelineLexer.g:144:118: ( '-${{' ( options {greedy=false; } : . )* '}}' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPipelineLexer.g:144:119: '-${{' ( options {greedy=false; } : . )* '}}'
            	    {
            	    match("-${{"); 

            	    // InternalPipelineLexer.g:144:126: ( options {greedy=false; } : . )*
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
            	    	    // InternalPipelineLexer.g:144:154: .
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
            // InternalPipelineLexer.g:146:14: ( '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // InternalPipelineLexer.g:146:16: '0x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match("0x"); 

            // InternalPipelineLexer.g:146:21: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
            // InternalPipelineLexer.g:148:20: ( ( '-' )? RULE_INT '.' RULE_INT )
            // InternalPipelineLexer.g:148:22: ( '-' )? RULE_INT '.' RULE_INT
            {
            // InternalPipelineLexer.g:148:22: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPipelineLexer.g:148:22: '-'
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
            // InternalPipelineLexer.g:150:14: ( RULE_INT ( '.' RULE_INT )+ )
            // InternalPipelineLexer.g:150:16: RULE_INT ( '.' RULE_INT )+
            {
            mRULE_INT(); 
            // InternalPipelineLexer.g:150:25: ( '.' RULE_INT )+
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
            	    // InternalPipelineLexer.g:150:26: '.' RULE_INT
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
            // InternalPipelineLexer.g:152:21: ()
            // InternalPipelineLexer.g:152:23: 
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
            // InternalPipelineLexer.g:154:19: ()
            // InternalPipelineLexer.g:154:21: 
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
            // InternalPipelineLexer.g:156:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' | '@' | '-' | '.' | '\\\\' | '&' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '/' | '@' | '&' | '-' | '.' | '\\\\' | '(' | ')' | '|' | '$' )* )
            // InternalPipelineLexer.g:156:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '/' | '@' | '-' | '.' | '\\\\' | '&' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '/' | '@' | '&' | '-' | '.' | '\\\\' | '(' | ')' | '|' | '$' )*
            {
            if ( input.LA(1)=='&'||(input.LA(1)>='-' && input.LA(1)<='/')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPipelineLexer.g:156:60: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '/' | '@' | '&' | '-' | '.' | '\\\\' | '(' | ')' | '|' | '$' )*
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
            // InternalPipelineLexer.g:158:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPipelineLexer.g:158:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPipelineLexer.g:158:24: ( options {greedy=false; } : . )*
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
            	    // InternalPipelineLexer.g:158:52: .
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
            // InternalPipelineLexer.g:160:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPipelineLexer.g:160:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalPipelineLexer.g:160:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPipelineLexer.g:160:23: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalPipelineLexer.g:160:39: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPipelineLexer.g:160:40: ( '\\r' )? '\\n'
                    {
                    // InternalPipelineLexer.g:160:40: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalPipelineLexer.g:160:40: '\\r'
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
            // InternalPipelineLexer.g:162:10: ( ( '0' .. '9' )+ )
            // InternalPipelineLexer.g:162:12: ( '0' .. '9' )+
            {
            // InternalPipelineLexer.g:162:12: ( '0' .. '9' )+
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
            	    // InternalPipelineLexer.g:162:13: '0' .. '9'
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
            // InternalPipelineLexer.g:164:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPipelineLexer.g:164:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPipelineLexer.g:164:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalPipelineLexer.g:164:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPipelineLexer.g:164:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalPipelineLexer.g:164:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPipelineLexer.g:164:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalPipelineLexer.g:164:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPipelineLexer.g:164:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalPipelineLexer.g:164:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPipelineLexer.g:164:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalPipelineLexer.g:166:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPipelineLexer.g:166:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPipelineLexer.g:166:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalPipelineLexer.g:168:16: ( . )
            // InternalPipelineLexer.g:168:18: .
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
        // InternalPipelineLexer.g:1:8: ( CancelInProgress | Workflow_dispatch | WorkingDirectory | BranchesIgnore | Workflow_call | PathsIgnore | Repositories | Workflow_run | Concurrency | DisplayName | TagsIgnore | AutoCancel | Containers | Parameters | Permission | Executors | Pipelines | Resources | Schedules | Variables | Branches | Commands | Defaults | Excluded | Included | Packages | Readonly | RunName | Schedule | Template | Webhooks | WriteAll | Default | Demands | Extends | Include | ReadAll | Version | VmImage | Always | Builds | Drafts | Batch | Group | Paths | Shell | Tags | Types | Value | Cron | Name | Orbs | Pool | Write | Env | Job | None | Read | Run | On | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_COMPLEX_EXPRESSION | RULE_HEX_INT | RULE_FLOAT_LITERAL | RULE_VERSION | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt19=76;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalPipelineLexer.g:1:10: CancelInProgress
                {
                mCancelInProgress(); 

                }
                break;
            case 2 :
                // InternalPipelineLexer.g:1:27: Workflow_dispatch
                {
                mWorkflow_dispatch(); 

                }
                break;
            case 3 :
                // InternalPipelineLexer.g:1:45: WorkingDirectory
                {
                mWorkingDirectory(); 

                }
                break;
            case 4 :
                // InternalPipelineLexer.g:1:62: BranchesIgnore
                {
                mBranchesIgnore(); 

                }
                break;
            case 5 :
                // InternalPipelineLexer.g:1:77: Workflow_call
                {
                mWorkflow_call(); 

                }
                break;
            case 6 :
                // InternalPipelineLexer.g:1:91: PathsIgnore
                {
                mPathsIgnore(); 

                }
                break;
            case 7 :
                // InternalPipelineLexer.g:1:103: Repositories
                {
                mRepositories(); 

                }
                break;
            case 8 :
                // InternalPipelineLexer.g:1:116: Workflow_run
                {
                mWorkflow_run(); 

                }
                break;
            case 9 :
                // InternalPipelineLexer.g:1:129: Concurrency
                {
                mConcurrency(); 

                }
                break;
            case 10 :
                // InternalPipelineLexer.g:1:141: DisplayName
                {
                mDisplayName(); 

                }
                break;
            case 11 :
                // InternalPipelineLexer.g:1:153: TagsIgnore
                {
                mTagsIgnore(); 

                }
                break;
            case 12 :
                // InternalPipelineLexer.g:1:164: AutoCancel
                {
                mAutoCancel(); 

                }
                break;
            case 13 :
                // InternalPipelineLexer.g:1:175: Containers
                {
                mContainers(); 

                }
                break;
            case 14 :
                // InternalPipelineLexer.g:1:186: Parameters
                {
                mParameters(); 

                }
                break;
            case 15 :
                // InternalPipelineLexer.g:1:197: Permission
                {
                mPermission(); 

                }
                break;
            case 16 :
                // InternalPipelineLexer.g:1:208: Executors
                {
                mExecutors(); 

                }
                break;
            case 17 :
                // InternalPipelineLexer.g:1:218: Pipelines
                {
                mPipelines(); 

                }
                break;
            case 18 :
                // InternalPipelineLexer.g:1:228: Resources
                {
                mResources(); 

                }
                break;
            case 19 :
                // InternalPipelineLexer.g:1:238: Schedules
                {
                mSchedules(); 

                }
                break;
            case 20 :
                // InternalPipelineLexer.g:1:248: Variables
                {
                mVariables(); 

                }
                break;
            case 21 :
                // InternalPipelineLexer.g:1:258: Branches
                {
                mBranches(); 

                }
                break;
            case 22 :
                // InternalPipelineLexer.g:1:267: Commands
                {
                mCommands(); 

                }
                break;
            case 23 :
                // InternalPipelineLexer.g:1:276: Defaults
                {
                mDefaults(); 

                }
                break;
            case 24 :
                // InternalPipelineLexer.g:1:285: Excluded
                {
                mExcluded(); 

                }
                break;
            case 25 :
                // InternalPipelineLexer.g:1:294: Included
                {
                mIncluded(); 

                }
                break;
            case 26 :
                // InternalPipelineLexer.g:1:303: Packages
                {
                mPackages(); 

                }
                break;
            case 27 :
                // InternalPipelineLexer.g:1:312: Readonly
                {
                mReadonly(); 

                }
                break;
            case 28 :
                // InternalPipelineLexer.g:1:321: RunName
                {
                mRunName(); 

                }
                break;
            case 29 :
                // InternalPipelineLexer.g:1:329: Schedule
                {
                mSchedule(); 

                }
                break;
            case 30 :
                // InternalPipelineLexer.g:1:338: Template
                {
                mTemplate(); 

                }
                break;
            case 31 :
                // InternalPipelineLexer.g:1:347: Webhooks
                {
                mWebhooks(); 

                }
                break;
            case 32 :
                // InternalPipelineLexer.g:1:356: WriteAll
                {
                mWriteAll(); 

                }
                break;
            case 33 :
                // InternalPipelineLexer.g:1:365: Default
                {
                mDefault(); 

                }
                break;
            case 34 :
                // InternalPipelineLexer.g:1:373: Demands
                {
                mDemands(); 

                }
                break;
            case 35 :
                // InternalPipelineLexer.g:1:381: Extends
                {
                mExtends(); 

                }
                break;
            case 36 :
                // InternalPipelineLexer.g:1:389: Include
                {
                mInclude(); 

                }
                break;
            case 37 :
                // InternalPipelineLexer.g:1:397: ReadAll
                {
                mReadAll(); 

                }
                break;
            case 38 :
                // InternalPipelineLexer.g:1:405: Version
                {
                mVersion(); 

                }
                break;
            case 39 :
                // InternalPipelineLexer.g:1:413: VmImage
                {
                mVmImage(); 

                }
                break;
            case 40 :
                // InternalPipelineLexer.g:1:421: Always
                {
                mAlways(); 

                }
                break;
            case 41 :
                // InternalPipelineLexer.g:1:428: Builds
                {
                mBuilds(); 

                }
                break;
            case 42 :
                // InternalPipelineLexer.g:1:435: Drafts
                {
                mDrafts(); 

                }
                break;
            case 43 :
                // InternalPipelineLexer.g:1:442: Batch
                {
                mBatch(); 

                }
                break;
            case 44 :
                // InternalPipelineLexer.g:1:448: Group
                {
                mGroup(); 

                }
                break;
            case 45 :
                // InternalPipelineLexer.g:1:454: Paths
                {
                mPaths(); 

                }
                break;
            case 46 :
                // InternalPipelineLexer.g:1:460: Shell
                {
                mShell(); 

                }
                break;
            case 47 :
                // InternalPipelineLexer.g:1:466: Tags
                {
                mTags(); 

                }
                break;
            case 48 :
                // InternalPipelineLexer.g:1:471: Types
                {
                mTypes(); 

                }
                break;
            case 49 :
                // InternalPipelineLexer.g:1:477: Value
                {
                mValue(); 

                }
                break;
            case 50 :
                // InternalPipelineLexer.g:1:483: Cron
                {
                mCron(); 

                }
                break;
            case 51 :
                // InternalPipelineLexer.g:1:488: Name
                {
                mName(); 

                }
                break;
            case 52 :
                // InternalPipelineLexer.g:1:493: Orbs
                {
                mOrbs(); 

                }
                break;
            case 53 :
                // InternalPipelineLexer.g:1:498: Pool
                {
                mPool(); 

                }
                break;
            case 54 :
                // InternalPipelineLexer.g:1:503: Write
                {
                mWrite(); 

                }
                break;
            case 55 :
                // InternalPipelineLexer.g:1:509: Env
                {
                mEnv(); 

                }
                break;
            case 56 :
                // InternalPipelineLexer.g:1:513: Job
                {
                mJob(); 

                }
                break;
            case 57 :
                // InternalPipelineLexer.g:1:517: None
                {
                mNone(); 

                }
                break;
            case 58 :
                // InternalPipelineLexer.g:1:522: Read
                {
                mRead(); 

                }
                break;
            case 59 :
                // InternalPipelineLexer.g:1:527: Run
                {
                mRun(); 

                }
                break;
            case 60 :
                // InternalPipelineLexer.g:1:531: On
                {
                mOn(); 

                }
                break;
            case 61 :
                // InternalPipelineLexer.g:1:534: Comma
                {
                mComma(); 

                }
                break;
            case 62 :
                // InternalPipelineLexer.g:1:540: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 63 :
                // InternalPipelineLexer.g:1:552: Colon
                {
                mColon(); 

                }
                break;
            case 64 :
                // InternalPipelineLexer.g:1:558: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 65 :
                // InternalPipelineLexer.g:1:576: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 66 :
                // InternalPipelineLexer.g:1:595: RULE_COMPLEX_EXPRESSION
                {
                mRULE_COMPLEX_EXPRESSION(); 

                }
                break;
            case 67 :
                // InternalPipelineLexer.g:1:619: RULE_HEX_INT
                {
                mRULE_HEX_INT(); 

                }
                break;
            case 68 :
                // InternalPipelineLexer.g:1:632: RULE_FLOAT_LITERAL
                {
                mRULE_FLOAT_LITERAL(); 

                }
                break;
            case 69 :
                // InternalPipelineLexer.g:1:651: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 70 :
                // InternalPipelineLexer.g:1:664: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 71 :
                // InternalPipelineLexer.g:1:672: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // InternalPipelineLexer.g:1:688: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // InternalPipelineLexer.g:1:704: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 74 :
                // InternalPipelineLexer.g:1:713: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // InternalPipelineLexer.g:1:725: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 76 :
                // InternalPipelineLexer.g:1:733: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\20\45\1\uffff\1\112\3\uffff\1\45\1\40\2\121\1\45\2\uffff\2\40\2\uffff\4\45\1\uffff\43\45\2\uffff\1\45\7\uffff\1\121\4\uffff\54\45\1\uffff\2\45\1\u00b8\23\45\1\u00d0\1\45\1\uffff\14\45\1\uffff\11\45\1\u00e8\1\45\1\uffff\1\u00b8\2\uffff\4\45\1\uffff\3\45\1\u00f2\10\45\1\uffff\4\45\1\uffff\6\45\1\uffff\17\45\3\uffff\10\45\1\uffff\2\45\1\uffff\1\45\1\uffff\17\45\1\uffff\6\45\1\uffff\1\45\1\uffff\3\45\1\uffff\11\45\1\uffff\15\45\1\uffff\3\45\1\uffff\31\45\1\u016e\3\45\2\uffff\5\45\1\uffff\2\45\2\uffff\1\45\1\uffff\3\45\1\uffff\2\45\1\uffff\1\u0182\1\45\1\uffff\2\45\1\uffff\4\45\3\uffff\1\45\1\uffff\1\45\1\uffff\2\45\1\uffff\1\45\1\uffff\1\45\1\uffff\7\45\1\uffff\4\45\1\uffff\1\45\1\uffff\3\45\3\uffff\2\45\1\uffff\6\45\2\uffff\3\45\1\uffff\1\45\1\uffff\7\45\2\uffff\3\45\1\uffff\2\45\2\uffff\2\45\1\uffff\11\45\1\uffff\4\45\3\uffff";
    static final String DFA19_eofS =
        "\u01c6\uffff";
    static final String DFA19_minS =
        "\1\0\20\44\1\uffff\1\44\3\uffff\1\44\1\173\2\56\1\52\2\uffff\2\0\2\uffff\4\44\1\uffff\1\173\42\44\2\uffff\1\56\6\uffff\1\60\1\56\4\uffff\54\44\1\uffff\1\44\1\60\1\56\25\44\1\uffff\14\44\1\uffff\13\44\1\uffff\1\44\2\uffff\4\44\1\uffff\14\44\1\uffff\4\44\1\uffff\6\44\1\uffff\17\44\3\uffff\10\44\1\uffff\2\44\1\uffff\1\44\1\uffff\17\44\1\uffff\6\44\1\uffff\1\44\1\uffff\3\44\1\uffff\11\44\1\uffff\15\44\1\uffff\3\44\1\uffff\35\44\2\uffff\5\44\1\uffff\2\44\2\uffff\1\44\1\uffff\3\44\1\uffff\1\143\1\44\1\uffff\2\44\1\uffff\2\44\1\uffff\4\44\3\uffff\1\44\1\uffff\1\44\1\uffff\2\44\1\uffff\1\44\1\uffff\1\44\1\uffff\3\44\1\151\1\141\1\165\1\44\1\uffff\4\44\1\uffff\1\44\1\uffff\3\44\3\uffff\2\44\1\uffff\1\163\1\154\1\156\3\44\2\uffff\3\44\1\uffff\1\44\1\uffff\1\160\1\154\1\72\4\44\2\uffff\1\44\1\141\1\72\1\uffff\2\44\2\uffff\1\44\1\164\1\uffff\3\44\1\143\3\44\1\150\1\44\1\uffff\1\44\1\72\2\44\3\uffff";
    static final String DFA19_maxS =
        "\1\uffff\20\172\1\uffff\1\174\3\uffff\1\172\1\173\1\170\1\71\1\52\2\uffff\2\uffff\2\uffff\4\172\1\uffff\1\173\42\172\2\uffff\1\71\6\uffff\2\71\4\uffff\54\172\1\uffff\1\172\2\71\23\172\1\174\1\172\1\uffff\14\172\1\uffff\11\172\1\174\1\172\1\uffff\1\174\2\uffff\4\172\1\uffff\3\172\1\174\10\172\1\uffff\4\172\1\uffff\6\172\1\uffff\17\172\3\uffff\10\172\1\uffff\2\172\1\uffff\1\172\1\uffff\17\172\1\uffff\6\172\1\uffff\1\172\1\uffff\3\172\1\uffff\11\172\1\uffff\15\172\1\uffff\3\172\1\uffff\31\172\1\174\3\172\2\uffff\5\172\1\uffff\2\172\2\uffff\1\172\1\uffff\3\172\1\uffff\1\162\1\172\1\uffff\1\174\1\172\1\uffff\2\172\1\uffff\4\172\3\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\1\151\1\141\1\165\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff\3\172\3\uffff\2\172\1\uffff\1\163\1\154\1\156\3\172\2\uffff\3\172\1\uffff\1\172\1\uffff\1\160\1\154\1\72\4\172\2\uffff\1\172\1\141\1\72\1\uffff\2\172\2\uffff\1\172\1\164\1\uffff\3\172\1\143\3\172\1\150\1\172\1\uffff\1\172\1\72\2\172\3\uffff";
    static final String DFA19_acceptS =
        "\21\uffff\1\75\1\uffff\1\77\1\100\1\101\5\uffff\1\106\1\110\2\uffff\1\113\1\114\4\uffff\1\106\43\uffff\1\75\1\76\1\uffff\1\77\1\100\1\101\1\102\1\103\1\111\2\uffff\1\107\1\110\1\112\1\113\54\uffff\1\74\30\uffff\1\73\14\uffff\1\67\13\uffff\1\70\1\uffff\1\104\1\105\4\uffff\1\62\14\uffff\1\65\4\uffff\1\72\6\uffff\1\57\17\uffff\1\63\1\71\1\64\10\uffff\1\66\2\uffff\1\53\1\uffff\1\55\17\uffff\1\60\6\uffff\1\56\1\uffff\1\61\3\uffff\1\54\11\uffff\1\51\15\uffff\1\52\3\uffff\1\50\35\uffff\1\41\1\42\5\uffff\1\43\2\uffff\1\46\1\47\1\uffff\1\44\3\uffff\1\26\2\uffff\1\37\2\uffff\1\25\2\uffff\1\32\4\uffff\1\33\1\45\1\34\1\uffff\1\27\1\uffff\1\36\2\uffff\1\30\1\uffff\1\35\1\uffff\1\31\7\uffff\1\40\4\uffff\1\21\1\uffff\1\22\3\uffff\1\20\1\23\1\24\2\uffff\1\15\6\uffff\1\16\1\17\3\uffff\1\14\1\uffff\1\11\7\uffff\1\12\1\13\3\uffff\1\10\2\uffff\1\6\1\7\2\uffff\1\5\11\uffff\1\4\4\uffff\1\2\1\3\1\1";
    static final String DFA19_specialS =
        "\1\2\34\uffff\1\0\1\1\u01a7\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\40\1\35\1\34\1\27\1\40\1\33\1\36\4\40\1\21\1\22\1\33\1\32\1\30\11\31\1\23\5\40\1\33\32\26\1\24\1\33\1\25\1\40\1\33\1\40\1\10\1\3\1\1\1\6\1\11\1\26\1\15\1\26\1\14\1\20\3\26\1\16\1\17\1\4\1\26\1\5\1\12\1\7\1\26\1\13\1\2\3\26\uff85\40",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\41\15\44\1\42\2\44\1\43\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\50\11\44\1\47\2\44\1\51\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\54\20\44\1\52\2\44\1\53\5\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\55\3\44\1\56\3\44\1\57\5\44\1\60\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\61\17\44\1\62\5\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\64\3\44\1\63\10\44\1\65\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\66\3\44\1\67\23\44\1\70\1\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\72\10\44\1\71\5\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\74\11\44\1\73\2\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\75\4\44\1\76\22\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\77\3\44\1\100\7\44\1\101\15\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\102\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\103\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\104\15\44\1\105\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\107\3\44\1\106\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\110\13\44",
            "",
            "\1\45\1\uffff\1\45\1\uffff\2\45\3\uffff\3\45\12\113\6\uffff\33\45\1\uffff\1\45\2\uffff\1\45\1\uffff\32\45\1\uffff\1\45",
            "",
            "",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\32\44",
            "\1\117",
            "\1\122\1\uffff\12\123\76\uffff\1\120",
            "\1\122\1\uffff\12\123",
            "\1\124",
            "",
            "",
            "\0\126",
            "\0\126",
            "",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\130\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\14\44\1\132\1\131\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\133\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\32\44",
            "",
            "\1\117",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\134\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\44\1\135\30\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\136\21\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\137\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\140\21\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\23\44\1\141\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\144\16\44\1\143\1\44\1\142\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\145\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\17\44\1\146\12\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\147\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\152\16\44\1\150\2\44\1\151\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\153\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\154\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\5\44\1\155\6\44\1\156\15\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\157\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\6\44\1\160\23\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\14\44\1\161\15\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\17\44\1\162\12\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\23\44\1\163\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\26\44\1\164\3\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\166\1\44\1\165\16\44\1\167\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\25\44\1\170\4\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\7\44\1\171\22\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\172\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\174\5\44\1\173\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\175\10\44",
            "\1\46\10\uffff\1\44\23\uffff\10\44\1\176\21\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\177\27\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u0080\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\14\44\1\u0081\15\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u0082\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\44\1\u0083\30\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0084\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\44\1\u0085\30\44",
            "",
            "",
            "\1\u0086\1\uffff\12\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0087",
            "\1\122\1\uffff\12\123",
            "",
            "",
            "",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\u0088\27\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\u0089\20\44\1\u008a\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\14\44\1\u008b\15\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u008c\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\12\44\1\u008d\17\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\7\44\1\u008e\22\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\23\44\1\u008f\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u0090\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u0091\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\u0092\27\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\7\44\1\u0093\22\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u0094\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\12\44\1\u0095\17\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\14\44\1\u0096\15\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0097\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u0098\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u0099\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u009a\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\3\44\1\u009b\26\44",
            "\1\46\10\uffff\1\u009c\14\uffff\1\u009d\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\17\44\1\u009e\12\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u009f\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u00a0\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\5\44\1\u00a1\24\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u00a2\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\17\44\1\u00a3\12\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u00a4\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u00a5\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u00a6\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\u00a7\27\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u00a8\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u00a9\25\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u00aa\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u00ab\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u00ac\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u00ad\21\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\24\44\1\u00ae\5\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u00af\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\14\44\1\u00b0\15\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u00b1\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\24\44\1\u00b2\5\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u00b3\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u00b4\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u00b5\7\44",
            "",
            "\1\46\10\uffff\1\44\14\uffff\1\u00b6\6\uffff\32\44\6\uffff\32\44",
            "\12\u00b7",
            "\1\u00b9\1\uffff\12\u0087",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u00ba\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\24\44\1\u00bb\5\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u00bc\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u00bd\31\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u00be\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\5\44\1\u00bf\2\44\1\u00c0\21\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u00c1\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u00c2\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\u00c3\27\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\3\44\1\u00c4\26\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\7\44\1\u00c5\22\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u00c6\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\14\44\1\u00c7\15\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u00c8\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u00c9\21\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u00ca\16\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u00cb\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u00cc\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\24\44\1\u00cd\5\44",
            "\1\46\1\uffff\1\45\1\uffff\2\45\3\uffff\1\u00cf\14\45\6\uffff\1\45\32\44\1\uffff\1\45\2\uffff\1\45\1\uffff\16\44\1\u00ce\13\44\1\uffff\1\45",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u00d1\14\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u00d2\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\24\44\1\u00d3\5\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u00d4\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\23\44\1\u00d5\6\44",
            "\1\46\10\uffff\1\u00d6\14\uffff\1\u00d7\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u00d8\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u00d9\7\44",
            "\1\46\10\uffff\1\44\23\uffff\2\44\1\u00da\27\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\30\44\1\u00db\1\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\24\44\1\u00dc\5\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\24\44\1\u00dd\5\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u00de\14\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\3\44\1\u00df\26\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u00e0\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u00e1\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u00e2\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u00e3\21\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u00e4\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\24\44\1\u00e5\5\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\17\44\1\u00e6\12\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u00e7\6\uffff\32\44\6\uffff\32\44",
            "\1\46\1\uffff\1\45\1\uffff\2\45\3\uffff\1\44\14\45\6\uffff\1\45\32\44\1\uffff\1\45\2\uffff\1\45\1\uffff\32\44\1\uffff\1\45",
            "\1\46\10\uffff\1\44\14\uffff\1\u00e9\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\45\1\uffff\1\45\1\uffff\2\45\3\uffff\3\45\12\u00b7\6\uffff\33\45\1\uffff\1\45\2\uffff\1\45\1\uffff\32\45\1\uffff\1\45",
            "",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u00ea\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u00eb\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u00ec\21\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u00ed\14\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u00ee\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u00ef\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u00f0\13\44",
            "\1\46\1\uffff\1\45\1\uffff\2\45\3\uffff\1\u00f1\14\45\6\uffff\1\45\32\44\1\uffff\1\45\2\uffff\1\45\1\uffff\32\44\1\uffff\1\45",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\7\44\1\u00f3\22\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u00f4\7\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u00f5\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\u00f6\14\uffff\1\u00f7\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u00f8\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\6\44\1\u00f9\23\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u00fa\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u00fb\21\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u00fc\21\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u00fd\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u00fe\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u00ff\31\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u0100\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u0101\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u0102\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\3\44\1\u0103\26\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u0104\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u0105\21\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u0106\31\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0107\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u0108\31\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u0109\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\23\44\1\u010a\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\3\44\1\u010b\26\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\3\44\1\u010c\26\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\24\44\1\u010d\5\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u010e\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\44\1\u010f\30\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0110\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u0111\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\6\44\1\u0112\23\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\3\44\1\u0113\26\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0114\6\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "",
            "\1\46\10\uffff\1\u0115\23\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u0116\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u0117\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\3\44\1\u0118\26\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u0119\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\6\44\1\u011a\23\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\12\44\1\u011b\17\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u011c\31\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u011d\25\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u011e\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u011f\21\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\23\44\1\u0120\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0121\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u0122\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u0123\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\23\44\1\u0124\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\u0125\27\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u0126\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u0127\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\14\44\1\u0128\15\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\30\44\1\u0129\1\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\23\44\1\u012a\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u012b\7\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u012c\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\6\44\1\u012d\23\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\23\44\1\u012e\6\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u012f\14\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0130\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u0131\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0132\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u0133\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u0134\16\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u0135\16\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u0136\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0137\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0138\25\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u0139\21\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u013a\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u013b\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u013c\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\26\44\1\u013d\3\44",
            "\1\46\10\uffff\1\u013e\23\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u013f\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u0140\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u0141\7\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\6\44\1\u0142\23\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0143\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u0144\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u0145\21\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0146\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u0147\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0148\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\30\44\1\u0149\1\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u014a\16\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u014b\25\44",
            "\1\46\10\uffff\1\44\23\uffff\15\44\1\u014c\14\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u014e\6\uffff\32\44\6\uffff\22\44\1\u014d\7\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u014f\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u0150\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0151\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\u0152\27\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u0153\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\3\44\1\u0154\26\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0155\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0156\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0157\25\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0158\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0159\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u015b\6\uffff\32\44\6\uffff\3\44\1\u015a\26\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u015c\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u015d\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u015e\10\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u015f\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\4\uffff\1\u0160\1\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\3\44\1\u0161\26\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0162\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u0163\16\44",
            "\1\46\10\uffff\1\u0164\14\uffff\1\u0165\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u0166\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u0167\10\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0168\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u0169\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u016a\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u016b\10\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u016c\7\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u016d\6\uffff\32\44\6\uffff\32\44",
            "\1\46\1\uffff\1\45\1\uffff\2\45\3\uffff\1\44\14\45\6\uffff\1\45\32\44\1\uffff\1\45\2\uffff\1\45\1\uffff\32\44\1\uffff\1\45",
            "\1\46\10\uffff\1\44\14\uffff\1\u016f\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\1\u0170\31\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0171\6\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u0172\13\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0173\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u0174\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u0175\7\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0176\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\46\10\uffff\1\44\14\uffff\1\u0178\6\uffff\32\44\6\uffff\22\44\1\u0177\7\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u0179\7\44",
            "",
            "",
            "\1\46\10\uffff\1\44\14\uffff\1\u017a\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\46\10\uffff\1\u017b\23\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\u017c\27\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u017d\7\44",
            "",
            "\1\u017f\1\u017e\15\uffff\1\u0180",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u0181\21\44",
            "",
            "\1\46\1\uffff\1\45\1\uffff\2\45\3\uffff\1\44\14\45\6\uffff\1\45\32\44\1\uffff\1\45\2\uffff\1\45\1\uffff\32\44\1\uffff\1\45",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u0183\21\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u0184\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u0185\7\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u0186\14\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0187\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\10\44\1\u0188\21\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0189\6\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\14\44\1\u018a\15\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u018b\10\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\13\44\1\u018c\16\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u018d\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\46\10\uffff\1\44\14\uffff\1\u018e\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\46\10\uffff\1\44\14\uffff\1\u018f\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\17\44\1\u0190\12\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\30\44\1\u0191\1\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0192\6\uffff\32\44\6\uffff\32\44",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u0196\10\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\6\44\1\u0197\23\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u0198\10\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u0199\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u019a\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u019b\25\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u019c\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u019d\25\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u019e\6\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u019f\10\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u01a0\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u01a4\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\15\44\1\u01a5\14\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u01a6\25\44",
            "",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u01a7\7\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u01a8\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u01a9\6\uffff\32\44\6\uffff\32\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u01aa\13\44",
            "",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\2\44\1\u01ae\27\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u01af\13\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u01b0\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u01b1\6\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\6\44\1\u01b2\23\44",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\23\44\1\u01b5\6\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u01b6\10\44",
            "",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u01b7\10\44",
            "\1\u01b8",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\16\44\1\u01b9\13\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u01ba\25\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\4\44\1\u01bb\25\44",
            "\1\u01bc",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\21\44\1\u01bd\10\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u01be\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u01bf\7\44",
            "\1\u01c0",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\30\44\1\u01c1\1\44",
            "",
            "\1\46\10\uffff\1\44\23\uffff\32\44\6\uffff\22\44\1\u01c2\7\44",
            "\1\u01c3",
            "\1\46\10\uffff\1\44\14\uffff\1\u01c4\6\uffff\32\44\6\uffff\32\44",
            "\1\46\10\uffff\1\44\14\uffff\1\u01c5\6\uffff\32\44\6\uffff\32\44",
            "",
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
            return "1:1: Tokens : ( CancelInProgress | Workflow_dispatch | WorkingDirectory | BranchesIgnore | Workflow_call | PathsIgnore | Repositories | Workflow_run | Concurrency | DisplayName | TagsIgnore | AutoCancel | Containers | Parameters | Permission | Executors | Pipelines | Resources | Schedules | Variables | Branches | Commands | Defaults | Excluded | Included | Packages | Readonly | RunName | Schedule | Template | Webhooks | WriteAll | Default | Demands | Extends | Include | ReadAll | Version | VmImage | Always | Builds | Drafts | Batch | Group | Paths | Shell | Tags | Types | Value | Cron | Name | Orbs | Pool | Write | Env | Job | None | Read | Run | On | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_COMPLEX_EXPRESSION | RULE_HEX_INT | RULE_FLOAT_LITERAL | RULE_VERSION | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_29 = input.LA(1);

                        s = -1;
                        if ( ((LA19_29>='\u0000' && LA19_29<='\uFFFF')) ) {s = 86;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_30 = input.LA(1);

                        s = -1;
                        if ( ((LA19_30>='\u0000' && LA19_30<='\uFFFF')) ) {s = 86;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='c') ) {s = 1;}

                        else if ( (LA19_0=='w') ) {s = 2;}

                        else if ( (LA19_0=='b') ) {s = 3;}

                        else if ( (LA19_0=='p') ) {s = 4;}

                        else if ( (LA19_0=='r') ) {s = 5;}

                        else if ( (LA19_0=='d') ) {s = 6;}

                        else if ( (LA19_0=='t') ) {s = 7;}

                        else if ( (LA19_0=='a') ) {s = 8;}

                        else if ( (LA19_0=='e') ) {s = 9;}

                        else if ( (LA19_0=='s') ) {s = 10;}

                        else if ( (LA19_0=='v') ) {s = 11;}

                        else if ( (LA19_0=='i') ) {s = 12;}

                        else if ( (LA19_0=='g') ) {s = 13;}

                        else if ( (LA19_0=='n') ) {s = 14;}

                        else if ( (LA19_0=='o') ) {s = 15;}

                        else if ( (LA19_0=='j') ) {s = 16;}

                        else if ( (LA19_0==',') ) {s = 17;}

                        else if ( (LA19_0=='-') ) {s = 18;}

                        else if ( (LA19_0==':') ) {s = 19;}

                        else if ( (LA19_0=='[') ) {s = 20;}

                        else if ( (LA19_0==']') ) {s = 21;}

                        else if ( ((LA19_0>='A' && LA19_0<='Z')||LA19_0=='f'||LA19_0=='h'||(LA19_0>='k' && LA19_0<='m')||LA19_0=='q'||LA19_0=='u'||(LA19_0>='x' && LA19_0<='z')) ) {s = 22;}

                        else if ( (LA19_0=='$') ) {s = 23;}

                        else if ( (LA19_0=='0') ) {s = 24;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 25;}

                        else if ( (LA19_0=='/') ) {s = 26;}

                        else if ( (LA19_0=='&'||LA19_0=='.'||LA19_0=='@'||LA19_0=='\\'||LA19_0=='_') ) {s = 27;}

                        else if ( (LA19_0=='#') ) {s = 28;}

                        else if ( (LA19_0=='\"') ) {s = 29;}

                        else if ( (LA19_0=='\'') ) {s = 30;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 31;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||LA19_0=='%'||(LA19_0>='(' && LA19_0<='+')||(LA19_0>=';' && LA19_0<='?')||LA19_0=='^'||LA19_0=='`'||(LA19_0>='{' && LA19_0<='\uFFFF')) ) {s = 32;}

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