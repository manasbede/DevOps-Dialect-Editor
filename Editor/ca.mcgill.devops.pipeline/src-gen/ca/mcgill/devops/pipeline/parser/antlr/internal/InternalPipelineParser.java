package ca.mcgill.devops.pipeline.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ca.mcgill.devops.pipeline.services.PipelineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPipelineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Repository_dispatch", "CancelInProgress", "ContinueOnError_1", "Workflow_dispatch", "WorkingDirectory", "TimeoutInMinutes", "BranchesIgnore", "ContainerImage", "ContinueOnError", "TimeoutMinutes", "ReleaseTrigger", "Allow_failure", "Before_script", "DeployTrigger", "Notifications", "PullRequests", "Workflow_call", "After_script", "DefaultsRun", "Dependencies", "LockBehavior", "MaxParallel", "PathsIgnore", "Pull_request", "Repositories", "Requirements", "ResourceName", "ResourceType", "TriggerRules", "Workflow_run", "Concurrency", "Credentials", "Definitions", "DisplayName", "Environment", "IsSkippable", "Permissions", "Provisioner", "ReviewStage", "TagsIgnore", "AutoCancel", "Conditions", "Containers", "Deployment", "GetPackage", "Parameters", "Permission", "Powershell", "Repository", "Approvals", "Artifacts", "Condition", "Container", "DependsOn", "Endpoints", "Executors", "FailFast", "Pipelines", "PostBuild", "Resources", "RunPolicy", "Schedules", "Variables", "Workspace", "Branches", "Checkout", "Commands", "Defaults", "Download", "MaxTime", "Packages", "Parallel", "Pipeline", "PreBuild", "Readonly", "RunName", "Schedule", "Services", "Snapshot", "Strategy", "Template", "Timeouts", "Webhooks", "Command", "Default", "Demands", "Exclude", "Extends", "Filters", "Include", "Inherit", "Outputs", "Project", "Publish", "Release", "Retries", "RunsOn", "Secrets", "Storage", "Timeout", "Trigger", "Version", "VmImage", "Always", "Builds", "Caches", "Docker", "Drafts", "Except", "Labels", "Matrix", "Policy", "Queued", "Script", "Stages", "Agent", "Batch", "Cache", "Final", "Group", "Image", "Needs", "Paths", "Ports", "Queue", "Rules", "Shell", "Stage", "Steps", "Tasks", "Types", "Value", "Auth", "Bash", "Cron", "Jobs", "Name", "Only", "Orbs", "Plan", "Pool", "Push", "Pwsh", "Step", "Tags", "Task", "Uses", "When", "With", "Write", "Env", "Jdk", "Job", "None", "Read", "Run", "Ssh", "Id", "If", "On", "GreaterThanSignHyphenMinus", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "VerticalLine", "RULE_COMPLEX_EXPRESSION", "RULE_HEX_INT", "RULE_INT", "RULE_FLOAT_LITERAL", "RULE_VERSION", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int PullRequests=19;
    public static final int Secrets=101;
    public static final int Pipelines=61;
    public static final int ResourceName=30;
    public static final int Needs=125;
    public static final int Approvals=53;
    public static final int Image=124;
    public static final int RunName=79;
    public static final int Before_script=16;
    public static final int Checkout=69;
    public static final int Matrix=114;
    public static final int RULE_VERSION=175;
    public static final int Docker=110;
    public static final int Concurrency=34;
    public static final int Workflow_call=20;
    public static final int TagsIgnore=43;
    public static final int Permission=50;
    public static final int Stage=131;
    public static final int Pool=144;
    public static final int Extends=91;
    public static final int Push=145;
    public static final int Tags=148;
    public static final int Agent=119;
    public static final int Repository_dispatch=4;
    public static final int Parameters=49;
    public static final int RULE_ID=178;
    public static final int ContinueOnError_1=6;
    public static final int Labels=113;
    public static final int Artifacts=54;
    public static final int Snapshot=82;
    public static final int Project=96;
    public static final int Defaults=71;
    public static final int MaxParallel=25;
    public static final int VerticalLine=170;
    public static final int RULE_INT=173;
    public static final int Outputs=95;
    public static final int RULE_ML_COMMENT=179;
    public static final int LeftSquareBracket=168;
    public static final int Resources=63;
    public static final int Always=107;
    public static final int Id=161;
    public static final int ContinueOnError=12;
    public static final int If=162;
    public static final int Repositories=28;
    public static final int Write=153;
    public static final int Schedules=65;
    public static final int Group=123;
    public static final int TriggerRules=32;
    public static final int Powershell=51;
    public static final int Timeouts=85;
    public static final int Containers=46;
    public static final int VmImage=106;
    public static final int Queued=116;
    public static final int Jdk=155;
    public static final int Allow_failure=15;
    public static final int Comma=165;
    public static final int HyphenMinus=166;
    public static final int Readonly=78;
    public static final int Jobs=139;
    public static final int Commands=70;
    public static final int RULE_COMPLEX_EXPRESSION=171;
    public static final int Paths=126;
    public static final int Download=72;
    public static final int Final=122;
    public static final int Queue=128;
    public static final int RULE_HEX_INT=172;
    public static final int TimeoutMinutes=13;
    public static final int Definitions=36;
    public static final int Stages=118;
    public static final int Provisioner=41;
    public static final int Ports=127;
    public static final int ResourceType=31;
    public static final int Run=159;
    public static final int Plan=143;
    public static final int LockBehavior=24;
    public static final int Default=88;
    public static final int Rules=129;
    public static final int Pipeline=76;
    public static final int Drafts=111;
    public static final int Services=81;
    public static final int Repository=52;
    public static final int When=151;
    public static final int ContainerImage=11;
    public static final int Pull_request=27;
    public static final int Webhooks=86;
    public static final int None=157;
    public static final int Credentials=35;
    public static final int TimeoutInMinutes=9;
    public static final int Policy=115;
    public static final int Types=134;
    public static final int Task=149;
    public static final int RULE_BEGIN=176;
    public static final int Deployment=47;
    public static final int Include=93;
    public static final int Executors=59;
    public static final int Parallel=75;
    public static final int Caches=109;
    public static final int ReleaseTrigger=14;
    public static final int Requirements=29;
    public static final int AutoCancel=44;
    public static final int Conditions=45;
    public static final int Cron=138;
    public static final int Template=84;
    public static final int Name=140;
    public static final int Read=158;
    public static final int Container=56;
    public static final int Filters=92;
    public static final int Trigger=104;
    public static final int Version=105;
    public static final int Packages=74;
    public static final int Retries=99;
    public static final int Permissions=40;
    public static final int Pwsh=146;
    public static final int Dependencies=23;
    public static final int Job=156;
    public static final int Inherit=94;
    public static final int RightSquareBracket=169;
    public static final int WorkingDirectory=8;
    public static final int Script=117;
    public static final int Tasks=133;
    public static final int Builds=108;
    public static final int DeployTrigger=17;
    public static final int Branches=68;
    public static final int Timeout=103;
    public static final int ReviewStage=42;
    public static final int Orbs=142;
    public static final int PostBuild=62;
    public static final int After_script=21;
    public static final int Storage=102;
    public static final int GetPackage=48;
    public static final int FailFast=60;
    public static final int Value=135;
    public static final int GreaterThanSignHyphenMinus=164;
    public static final int Environment=38;
    public static final int MaxTime=73;
    public static final int Notifications=18;
    public static final int PreBuild=77;
    public static final int Except=112;
    public static final int Cache=121;
    public static final int Steps=132;
    public static final int RULE_END=177;
    public static final int Exclude=90;
    public static final int Uses=150;
    public static final int Demands=89;
    public static final int RULE_STRING=181;
    public static final int Step=147;
    public static final int Env=154;
    public static final int CancelInProgress=5;
    public static final int With=152;
    public static final int RULE_SL_COMMENT=180;
    public static final int Endpoints=58;
    public static final int Variables=66;
    public static final int RULE_FLOAT_LITERAL=174;
    public static final int DefaultsRun=22;
    public static final int Shell=130;
    public static final int Batch=120;
    public static final int Auth=136;
    public static final int DisplayName=37;
    public static final int Colon=167;
    public static final int EOF=-1;
    public static final int Publish=97;
    public static final int Release=98;
    public static final int Condition=55;
    public static final int BranchesIgnore=10;
    public static final int PathsIgnore=26;
    public static final int RULE_WS=182;
    public static final int IsSkippable=39;
    public static final int RunPolicy=64;
    public static final int Only=141;
    public static final int Ssh=160;
    public static final int Bash=137;
    public static final int RULE_ANY_OTHER=183;
    public static final int Workflow_dispatch=7;
    public static final int DependsOn=57;
    public static final int Command=87;
    public static final int RunsOn=100;
    public static final int Schedule=80;
    public static final int Strategy=83;
    public static final int Workflow_run=33;
    public static final int Workspace=67;
    public static final int On=163;

    // delegates
    // delegators


        public InternalPipelineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPipelineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPipelineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPipelineParser.g"; }



     	private PipelineGrammarAccess grammarAccess;

        public InternalPipelineParser(TokenStream input, PipelineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Pipeline";
       	}

       	@Override
       	protected PipelineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePipeline"
    // InternalPipelineParser.g:58:1: entryRulePipeline returns [EObject current=null] : iv_rulePipeline= rulePipeline EOF ;
    public final EObject entryRulePipeline() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipeline = null;


        try {
            // InternalPipelineParser.g:58:49: (iv_rulePipeline= rulePipeline EOF )
            // InternalPipelineParser.g:59:2: iv_rulePipeline= rulePipeline EOF
            {
             newCompositeNode(grammarAccess.getPipelineRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePipeline=rulePipeline();

            state._fsp--;

             current =iv_rulePipeline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePipeline"


    // $ANTLR start "rulePipeline"
    // InternalPipelineParser.g:65:1: rulePipeline returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject rulePipeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token otherlv_10=null;
        Token lv_defaultShellValue_11_0=null;
        Token otherlv_12=null;
        Token lv_defaultWDValue_13_0=null;
        Token this_END_14=null;
        Token this_END_15=null;
        Token otherlv_16=null;
        Token this_BEGIN_17=null;
        Token otherlv_18=null;
        Token this_END_20=null;
        Token otherlv_21=null;
        Token lv_allPermission_22_0=null;
        Token this_BEGIN_23=null;
        Token this_END_25=null;
        Token otherlv_26=null;
        Token this_BEGIN_27=null;
        Token otherlv_28=null;
        Token lv_group_29_1=null;
        Token lv_group_29_2=null;
        Token otherlv_30=null;
        Token lv_cancelConcurrence_31_1=null;
        Token lv_cancelConcurrence_31_2=null;
        Token this_END_32=null;
        Token otherlv_34=null;
        Token this_BEGIN_36=null;
        Token otherlv_37=null;
        Token lv_vmName_38_0=null;
        Token otherlv_39=null;
        Token lv_vmImage_40_1=null;
        Token lv_vmImage_40_2=null;
        Token otherlv_41=null;
        Token this_END_43=null;
        Token otherlv_44=null;
        Token this_BEGIN_45=null;
        Token this_END_47=null;
        Token otherlv_48=null;
        Token lv_version_49_0=null;
        Token otherlv_50=null;
        Token otherlv_54=null;
        Token this_BEGIN_55=null;
        Token this_END_57=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token lv_jobOrStageVar_65_1=null;
        Token lv_jobOrStageVar_65_2=null;
        Token this_BEGIN_66=null;
        Token this_END_69=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_runName_4_0 = null;

        AntlrDatatypeRuleToken lv_env_19_0 = null;

        AntlrDatatypeRuleToken lv_indPermissions_24_0 = null;

        EObject lv_pipelineParameters_33_0 = null;

        AntlrDatatypeRuleToken lv_vmDemands_42_1 = null;

        AntlrDatatypeRuleToken lv_vmDemands_42_2 = null;

        EObject lv_resources_46_0 = null;

        EObject lv_pplVariables_51_0 = null;

        EObject lv_extendedParameter_52_0 = null;

        EObject lv_pipelineParameters_53_0 = null;

        EObject lv_triggers_56_0 = null;

        EObject lv_triggers_58_0 = null;

        EObject lv_triggers_60_0 = null;

        EObject lv_triggers_62_0 = null;

        EObject lv_triggers_64_0 = null;

        EObject lv_stages_67_0 = null;

        EObject lv_jobs_68_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:71:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+ {...}?) ) ) )
            // InternalPipelineParser.g:72:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalPipelineParser.g:72:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+ {...}?) ) )
            // InternalPipelineParser.g:73:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+ {...}?) )
            {
            // InternalPipelineParser.g:73:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+ {...}?) )
            // InternalPipelineParser.g:74:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup());
            			
            // InternalPipelineParser.g:77:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+ {...}?)
            // InternalPipelineParser.g:78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+ {...}?
            {
            // InternalPipelineParser.g:78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=14;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // InternalPipelineParser.g:79:3: ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:79:3: ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) )
            	    // InternalPipelineParser.g:80:4: {...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalPipelineParser.g:80:102: ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) )
            	    // InternalPipelineParser.g:81:5: ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalPipelineParser.g:84:8: ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) )
            	    // InternalPipelineParser.g:84:9: {...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:84:18: (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) )
            	    // InternalPipelineParser.g:84:19: otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) )
            	    {
            	    otherlv_1=(Token)match(input,Name,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getPipelineAccess().getNameKeyword_0_0());
            	    							
            	    // InternalPipelineParser.g:88:8: ( (lv_name_2_0= ruleUnquotedString ) )
            	    // InternalPipelineParser.g:89:9: (lv_name_2_0= ruleUnquotedString )
            	    {
            	    // InternalPipelineParser.g:89:9: (lv_name_2_0= ruleUnquotedString )
            	    // InternalPipelineParser.g:90:10: lv_name_2_0= ruleUnquotedString
            	    {

            	    										newCompositeNode(grammarAccess.getPipelineAccess().getNameUnquotedStringParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_name_2_0=ruleUnquotedString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    										}
            	    										set(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"ca.mcgill.devops.pipeline.Pipeline.UnquotedString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:113:3: ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:113:3: ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) )
            	    // InternalPipelineParser.g:114:4: {...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalPipelineParser.g:114:102: ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) )
            	    // InternalPipelineParser.g:115:5: ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalPipelineParser.g:118:8: ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) )
            	    // InternalPipelineParser.g:118:9: {...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:118:18: (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) )
            	    // InternalPipelineParser.g:118:19: otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) )
            	    {
            	    otherlv_3=(Token)match(input,RunName,FOLLOW_3); 

            	    								newLeafNode(otherlv_3, grammarAccess.getPipelineAccess().getRunNameKeyword_1_0());
            	    							
            	    // InternalPipelineParser.g:122:8: ( (lv_runName_4_0= ruleUnquotedString ) )
            	    // InternalPipelineParser.g:123:9: (lv_runName_4_0= ruleUnquotedString )
            	    {
            	    // InternalPipelineParser.g:123:9: (lv_runName_4_0= ruleUnquotedString )
            	    // InternalPipelineParser.g:124:10: lv_runName_4_0= ruleUnquotedString
            	    {

            	    										newCompositeNode(grammarAccess.getPipelineAccess().getRunNameUnquotedStringParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_runName_4_0=ruleUnquotedString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    										}
            	    										set(
            	    											current,
            	    											"runName",
            	    											lv_runName_4_0,
            	    											"ca.mcgill.devops.pipeline.Pipeline.UnquotedString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPipelineParser.g:147:3: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:147:3: ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // InternalPipelineParser.g:148:4: {...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalPipelineParser.g:148:102: ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            	    // InternalPipelineParser.g:149:5: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalPipelineParser.g:152:8: ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) )
            	    // InternalPipelineParser.g:152:9: {...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:152:18: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) )
            	    // InternalPipelineParser.g:152:19: ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalPipelineParser.g:152:19: ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) )
            	    // InternalPipelineParser.g:153:9: ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?)
            	    {
            	     
            	    								  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup_2());
            	    								
            	    // InternalPipelineParser.g:156:9: ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?)
            	    // InternalPipelineParser.g:157:10: ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?
            	    {
            	    // InternalPipelineParser.g:157:10: ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=3;
            	        switch ( input.LA(1) ) {
            	        case Defaults:
            	            {
            	            int LA3_2 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 0) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case WorkingDirectory:
            	            {
            	            int LA3_3 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 1) ) {
            	                alt3=2;
            	            }


            	            }
            	            break;
            	        case RULE_END:
            	            {
            	            int LA3_4 = input.LA(2);

            	            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 1) ) {
            	                alt3=2;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:158:8: ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:158:8: ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) )
            	    	    // InternalPipelineParser.g:159:9: {...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 0) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 0)");
            	    	    }
            	    	    // InternalPipelineParser.g:159:109: ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) )
            	    	    // InternalPipelineParser.g:160:10: ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) )
            	    	    {

            	    	    										getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 0);
            	    	    									
            	    	    // InternalPipelineParser.g:163:13: ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) )
            	    	    // InternalPipelineParser.g:163:14: {...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:163:23: (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? )
            	    	    // InternalPipelineParser.g:163:24: otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )?
            	    	    {
            	    	    otherlv_6=(Token)match(input,Defaults,FOLLOW_5); 

            	    	    													newLeafNode(otherlv_6, grammarAccess.getPipelineAccess().getDefaultsKeyword_2_0_0());
            	    	    												
            	    	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            	    	    													newLeafNode(this_BEGIN_7, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_2_0_1());
            	    	    												
            	    	    otherlv_8=(Token)match(input,Run,FOLLOW_5); 

            	    	    													newLeafNode(otherlv_8, grammarAccess.getPipelineAccess().getRunKeyword_2_0_2());
            	    	    												
            	    	    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    	    													newLeafNode(this_BEGIN_9, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_2_0_3());
            	    	    												
            	    	    // InternalPipelineParser.g:179:13: (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )?
            	    	    int alt1=2;
            	    	    int LA1_0 = input.LA(1);

            	    	    if ( (LA1_0==Shell) ) {
            	    	        alt1=1;
            	    	    }
            	    	    switch (alt1) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:180:14: otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) )
            	    	            {
            	    	            otherlv_10=(Token)match(input,Shell,FOLLOW_8); 

            	    	            														newLeafNode(otherlv_10, grammarAccess.getPipelineAccess().getShellKeyword_2_0_4_0());
            	    	            													
            	    	            // InternalPipelineParser.g:184:14: ( (lv_defaultShellValue_11_0= RULE_STRING ) )
            	    	            // InternalPipelineParser.g:185:15: (lv_defaultShellValue_11_0= RULE_STRING )
            	    	            {
            	    	            // InternalPipelineParser.g:185:15: (lv_defaultShellValue_11_0= RULE_STRING )
            	    	            // InternalPipelineParser.g:186:16: lv_defaultShellValue_11_0= RULE_STRING
            	    	            {
            	    	            lv_defaultShellValue_11_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    	            																newLeafNode(lv_defaultShellValue_11_0, grammarAccess.getPipelineAccess().getDefaultShellValueSTRINGTerminalRuleCall_2_0_4_1_0());
            	    	            															

            	    	            																if (current==null) {
            	    	            																	current = createModelElement(grammarAccess.getPipelineRule());
            	    	            																}
            	    	            																setWithLastConsumed(
            	    	            																	current,
            	    	            																	"defaultShellValue",
            	    	            																	lv_defaultShellValue_11_0,
            	    	            																	"org.eclipse.xtext.common.Terminals.STRING");
            	    	            															

            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    										getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_2());
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalPipelineParser.g:209:8: ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:209:8: ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) )
            	    	    // InternalPipelineParser.g:210:9: {...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 1) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 1)");
            	    	    }
            	    	    // InternalPipelineParser.g:210:109: ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) )
            	    	    // InternalPipelineParser.g:211:10: ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) )
            	    	    {

            	    	    										getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_2(), 1);
            	    	    									
            	    	    // InternalPipelineParser.g:214:13: ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) )
            	    	    // InternalPipelineParser.g:214:14: {...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:214:23: ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END )
            	    	    // InternalPipelineParser.g:214:24: (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END
            	    	    {
            	    	    // InternalPipelineParser.g:214:24: (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )?
            	    	    int alt2=2;
            	    	    int LA2_0 = input.LA(1);

            	    	    if ( (LA2_0==WorkingDirectory) ) {
            	    	        alt2=1;
            	    	    }
            	    	    switch (alt2) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:215:14: otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) )
            	    	            {
            	    	            otherlv_12=(Token)match(input,WorkingDirectory,FOLLOW_8); 

            	    	            														newLeafNode(otherlv_12, grammarAccess.getPipelineAccess().getWorkingDirectoryKeyword_2_1_0_0());
            	    	            													
            	    	            // InternalPipelineParser.g:219:14: ( (lv_defaultWDValue_13_0= RULE_STRING ) )
            	    	            // InternalPipelineParser.g:220:15: (lv_defaultWDValue_13_0= RULE_STRING )
            	    	            {
            	    	            // InternalPipelineParser.g:220:15: (lv_defaultWDValue_13_0= RULE_STRING )
            	    	            // InternalPipelineParser.g:221:16: lv_defaultWDValue_13_0= RULE_STRING
            	    	            {
            	    	            lv_defaultWDValue_13_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    	            																newLeafNode(lv_defaultWDValue_13_0, grammarAccess.getPipelineAccess().getDefaultWDValueSTRINGTerminalRuleCall_2_1_0_1_0());
            	    	            															

            	    	            																if (current==null) {
            	    	            																	current = createModelElement(grammarAccess.getPipelineRule());
            	    	            																}
            	    	            																setWithLastConsumed(
            	    	            																	current,
            	    	            																	"defaultWDValue",
            	    	            																	lv_defaultWDValue_13_0,
            	    	            																	"org.eclipse.xtext.common.Terminals.STRING");
            	    	            															

            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }

            	    	    this_END_14=(Token)match(input,RULE_END,FOLLOW_9); 

            	    	    													newLeafNode(this_END_14, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_2_1_1());
            	    	    												
            	    	    this_END_15=(Token)match(input,RULE_END,FOLLOW_4); 

            	    	    													newLeafNode(this_END_15, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_2_1_2());
            	    	    												

            	    	    }


            	    	    }

            	    	     
            	    	    										getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_2());
            	    	    									

            	    	    }


            	    	    }


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

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_2()) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_2())");
            	    }

            	    }


            	    }

            	     
            	    								  getUnorderedGroupHelper().leave(grammarAccess.getPipelineAccess().getUnorderedGroup_2());
            	    								

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPipelineParser.g:265:3: ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) )
            	    {
            	    // InternalPipelineParser.g:265:3: ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:266:4: {...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalPipelineParser.g:266:102: ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) )
            	    // InternalPipelineParser.g:267:5: ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalPipelineParser.g:270:8: ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) )
            	    // InternalPipelineParser.g:270:9: {...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:270:18: (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END )
            	    // InternalPipelineParser.g:270:19: otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END
            	    {
            	    otherlv_16=(Token)match(input,Env,FOLLOW_5); 

            	    								newLeafNode(otherlv_16, grammarAccess.getPipelineAccess().getEnvKeyword_3_0());
            	    							
            	    this_BEGIN_17=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            	    								newLeafNode(this_BEGIN_17, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_3_1());
            	    							
            	    // InternalPipelineParser.g:278:8: ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==HyphenMinus||LA5_0==RULE_ID) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:279:9: (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) )
            	    	    {
            	    	    // InternalPipelineParser.g:279:9: (otherlv_18= HyphenMinus )?
            	    	    int alt4=2;
            	    	    int LA4_0 = input.LA(1);

            	    	    if ( (LA4_0==HyphenMinus) ) {
            	    	        alt4=1;
            	    	    }
            	    	    switch (alt4) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:280:10: otherlv_18= HyphenMinus
            	    	            {
            	    	            otherlv_18=(Token)match(input,HyphenMinus,FOLLOW_11); 

            	    	            										newLeafNode(otherlv_18, grammarAccess.getPipelineAccess().getHyphenMinusKeyword_3_2_0());
            	    	            									

            	    	            }
            	    	            break;

            	    	    }

            	    	    // InternalPipelineParser.g:285:9: ( (lv_env_19_0= ruleKeyValue ) )
            	    	    // InternalPipelineParser.g:286:10: (lv_env_19_0= ruleKeyValue )
            	    	    {
            	    	    // InternalPipelineParser.g:286:10: (lv_env_19_0= ruleKeyValue )
            	    	    // InternalPipelineParser.g:287:11: lv_env_19_0= ruleKeyValue
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPipelineAccess().getEnvKeyValueParserRuleCall_3_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_env_19_0=ruleKeyValue();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"env",
            	    	    												lv_env_19_0,
            	    	    												"ca.mcgill.devops.pipeline.Pipeline.KeyValue");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    this_END_20=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_20, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPipelineParser.g:315:3: ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:315:3: ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) )
            	    // InternalPipelineParser.g:316:4: {...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalPipelineParser.g:316:102: ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) )
            	    // InternalPipelineParser.g:317:5: ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalPipelineParser.g:320:8: ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:320:9: {...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:320:18: (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) )
            	    // InternalPipelineParser.g:320:19: otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) )
            	    {
            	    otherlv_21=(Token)match(input,Permission,FOLLOW_12); 

            	    								newLeafNode(otherlv_21, grammarAccess.getPipelineAccess().getPermissionKeyword_4_0());
            	    							
            	    // InternalPipelineParser.g:324:8: ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_ID) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==RULE_BEGIN) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalPipelineParser.g:325:9: ( (lv_allPermission_22_0= RULE_ID ) )
            	            {
            	            // InternalPipelineParser.g:325:9: ( (lv_allPermission_22_0= RULE_ID ) )
            	            // InternalPipelineParser.g:326:10: (lv_allPermission_22_0= RULE_ID )
            	            {
            	            // InternalPipelineParser.g:326:10: (lv_allPermission_22_0= RULE_ID )
            	            // InternalPipelineParser.g:327:11: lv_allPermission_22_0= RULE_ID
            	            {
            	            lv_allPermission_22_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	            											newLeafNode(lv_allPermission_22_0, grammarAccess.getPipelineAccess().getAllPermissionIDTerminalRuleCall_4_1_0_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getPipelineRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"allPermission",
            	            												lv_allPermission_22_0,
            	            												"ca.mcgill.devops.pipeline.Pipeline.ID");
            	            										

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:344:9: (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END )
            	            {
            	            // InternalPipelineParser.g:344:9: (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END )
            	            // InternalPipelineParser.g:345:10: this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END
            	            {
            	            this_BEGIN_23=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            	            										newLeafNode(this_BEGIN_23, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_4_1_1_0());
            	            									
            	            // InternalPipelineParser.g:349:10: ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )*
            	            loop6:
            	            do {
            	                int alt6=2;
            	                int LA6_0 = input.LA(1);

            	                if ( (LA6_0==RULE_ID) ) {
            	                    alt6=1;
            	                }


            	                switch (alt6) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:350:11: (lv_indPermissions_24_0= ruleIndPermissionValue )
            	            	    {
            	            	    // InternalPipelineParser.g:350:11: (lv_indPermissions_24_0= ruleIndPermissionValue )
            	            	    // InternalPipelineParser.g:351:12: lv_indPermissions_24_0= ruleIndPermissionValue
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getPipelineAccess().getIndPermissionsIndPermissionValueParserRuleCall_4_1_1_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_13);
            	            	    lv_indPermissions_24_0=ruleIndPermissionValue();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getPipelineRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"indPermissions",
            	            	    													lv_indPermissions_24_0,
            	            	    													"ca.mcgill.devops.pipeline.Pipeline.IndPermissionValue");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop6;
            	                }
            	            } while (true);

            	            this_END_25=(Token)match(input,RULE_END,FOLLOW_4); 

            	            										newLeafNode(this_END_25, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_4_1_1_2());
            	            									

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalPipelineParser.g:380:3: ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:380:3: ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) )
            	    // InternalPipelineParser.g:381:4: {...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalPipelineParser.g:381:102: ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:382:5: ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalPipelineParser.g:385:8: ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) )
            	    // InternalPipelineParser.g:385:9: {...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:385:18: (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) )
            	    // InternalPipelineParser.g:385:19: otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END )
            	    {
            	    otherlv_26=(Token)match(input,Concurrency,FOLLOW_5); 

            	    								newLeafNode(otherlv_26, grammarAccess.getPipelineAccess().getConcurrencyKeyword_5_0());
            	    							
            	    // InternalPipelineParser.g:389:8: (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END )
            	    // InternalPipelineParser.g:390:9: this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END
            	    {
            	    this_BEGIN_27=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_27, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_5_1_0());
            	    								
            	    // InternalPipelineParser.g:394:9: (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) )
            	    // InternalPipelineParser.g:395:10: otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) )
            	    {
            	    otherlv_28=(Token)match(input,Group,FOLLOW_15); 

            	    										newLeafNode(otherlv_28, grammarAccess.getPipelineAccess().getGroupKeyword_5_1_1_0());
            	    									
            	    // InternalPipelineParser.g:399:10: ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) )
            	    // InternalPipelineParser.g:400:11: ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) )
            	    {
            	    // InternalPipelineParser.g:400:11: ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) )
            	    // InternalPipelineParser.g:401:12: (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION )
            	    {
            	    // InternalPipelineParser.g:401:12: (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==RULE_ID) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==RULE_COMPLEX_EXPRESSION) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalPipelineParser.g:402:13: lv_group_29_1= RULE_ID
            	            {
            	            lv_group_29_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            	            													newLeafNode(lv_group_29_1, grammarAccess.getPipelineAccess().getGroupIDTerminalRuleCall_5_1_1_1_0_0());
            	            												

            	            													if (current==null) {
            	            														current = createModelElement(grammarAccess.getPipelineRule());
            	            													}
            	            													setWithLastConsumed(
            	            														current,
            	            														"group",
            	            														lv_group_29_1,
            	            														"ca.mcgill.devops.pipeline.Pipeline.ID");
            	            												

            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:417:13: lv_group_29_2= RULE_COMPLEX_EXPRESSION
            	            {
            	            lv_group_29_2=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_16); 

            	            													newLeafNode(lv_group_29_2, grammarAccess.getPipelineAccess().getGroupCOMPLEX_EXPRESSIONTerminalRuleCall_5_1_1_1_0_1());
            	            												

            	            													if (current==null) {
            	            														current = createModelElement(grammarAccess.getPipelineRule());
            	            													}
            	            													setWithLastConsumed(
            	            														current,
            	            														"group",
            	            														lv_group_29_2,
            	            														"ca.mcgill.devops.pipeline.Pipeline.COMPLEX_EXPRESSION");
            	            												

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalPipelineParser.g:435:9: (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) )
            	    // InternalPipelineParser.g:436:10: otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) )
            	    {
            	    otherlv_30=(Token)match(input,CancelInProgress,FOLLOW_15); 

            	    										newLeafNode(otherlv_30, grammarAccess.getPipelineAccess().getCancelInProgressKeyword_5_1_2_0());
            	    									
            	    // InternalPipelineParser.g:440:10: ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) )
            	    // InternalPipelineParser.g:441:11: ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) )
            	    {
            	    // InternalPipelineParser.g:441:11: ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) )
            	    // InternalPipelineParser.g:442:12: (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION )
            	    {
            	    // InternalPipelineParser.g:442:12: (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==RULE_COMPLEX_EXPRESSION) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalPipelineParser.g:443:13: lv_cancelConcurrence_31_1= RULE_ID
            	            {
            	            lv_cancelConcurrence_31_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            	            													newLeafNode(lv_cancelConcurrence_31_1, grammarAccess.getPipelineAccess().getCancelConcurrenceIDTerminalRuleCall_5_1_2_1_0_0());
            	            												

            	            													if (current==null) {
            	            														current = createModelElement(grammarAccess.getPipelineRule());
            	            													}
            	            													setWithLastConsumed(
            	            														current,
            	            														"cancelConcurrence",
            	            														lv_cancelConcurrence_31_1,
            	            														"ca.mcgill.devops.pipeline.Pipeline.ID");
            	            												

            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:458:13: lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION
            	            {
            	            lv_cancelConcurrence_31_2=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_9); 

            	            													newLeafNode(lv_cancelConcurrence_31_2, grammarAccess.getPipelineAccess().getCancelConcurrenceCOMPLEX_EXPRESSIONTerminalRuleCall_5_1_2_1_0_1());
            	            												

            	            													if (current==null) {
            	            														current = createModelElement(grammarAccess.getPipelineRule());
            	            													}
            	            													setWithLastConsumed(
            	            														current,
            	            														"cancelConcurrence",
            	            														lv_cancelConcurrence_31_2,
            	            														"ca.mcgill.devops.pipeline.Pipeline.COMPLEX_EXPRESSION");
            	            												

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    this_END_32=(Token)match(input,RULE_END,FOLLOW_4); 

            	    									newLeafNode(this_END_32, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_5_1_3());
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalPipelineParser.g:487:3: ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) )
            	    {
            	    // InternalPipelineParser.g:487:3: ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) )
            	    // InternalPipelineParser.g:488:4: {...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalPipelineParser.g:488:102: ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ )
            	    // InternalPipelineParser.g:489:5: ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalPipelineParser.g:492:8: ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        switch ( input.LA(1) ) {
            	        case Parameters:
            	            {
            	            int LA10_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	            }
            	            break;
            	        case Default:
            	            {
            	            int LA10_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	            }
            	            break;
            	        case Executors:
            	            {
            	            int LA10_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	            }
            	            break;
            	        case Orbs:
            	            {
            	            int LA10_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	            }
            	            break;
            	        case Commands:
            	            {
            	            int LA10_6 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:492:9: {...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:492:18: ( (lv_pipelineParameters_33_0= rulePipelineParameter ) )
            	    	    // InternalPipelineParser.g:492:19: (lv_pipelineParameters_33_0= rulePipelineParameter )
            	    	    {
            	    	    // InternalPipelineParser.g:492:19: (lv_pipelineParameters_33_0= rulePipelineParameter )
            	    	    // InternalPipelineParser.g:493:9: lv_pipelineParameters_33_0= rulePipelineParameter
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getPipelineAccess().getPipelineParametersPipelineParameterParserRuleCall_6_0());
            	    	    								
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_pipelineParameters_33_0=rulePipelineParameter();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"pipelineParameters",
            	    	    										lv_pipelineParameters_33_0,
            	    	    										"ca.mcgill.devops.pipeline.Pipeline.PipelineParameter");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalPipelineParser.g:515:3: ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:515:3: ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
            	    // InternalPipelineParser.g:516:4: {...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalPipelineParser.g:516:102: ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
            	    // InternalPipelineParser.g:517:5: ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalPipelineParser.g:520:8: ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            	    // InternalPipelineParser.g:520:9: {...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:520:18: (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) )
            	    // InternalPipelineParser.g:520:19: otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) )
            	    {
            	    otherlv_34=(Token)match(input,Pool,FOLLOW_17); 

            	    								newLeafNode(otherlv_34, grammarAccess.getPipelineAccess().getPoolKeyword_7_0());
            	    							
            	    // InternalPipelineParser.g:524:8: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) )
            	    // InternalPipelineParser.g:525:9: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalPipelineParser.g:525:9: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) )
            	    // InternalPipelineParser.g:526:10: ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?)
            	    {
            	     
            	    									  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1());
            	    									
            	    // InternalPipelineParser.g:529:10: ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?)
            	    // InternalPipelineParser.g:530:11: ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?
            	    {
            	    // InternalPipelineParser.g:530:11: ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=3;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==RULE_END) ) {
            	            int LA15_2 = input.LA(2);

            	            if ( (LA15_2==RULE_END) ) {
            	                int LA15_5 = input.LA(3);

            	                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {
            	                    alt15=2;
            	                }


            	            }
            	            else if ( ( LA15_2 == EOF || LA15_2 >= Workflow_dispatch && LA15_2 <= WorkingDirectory || LA15_2 == Workflow_call || LA15_2 >= Workflow_run && LA15_2 <= Concurrency || LA15_2 >= Parameters && LA15_2 <= Permission || LA15_2 == Executors || LA15_2 == Resources || LA15_2 >= Schedules && LA15_2 <= Variables || LA15_2 >= Commands && LA15_2 <= Defaults || LA15_2 >= RunName && LA15_2 <= Schedule || LA15_2 >= Default && LA15_2 <= Demands || LA15_2 == Extends || LA15_2 == Include || LA15_2 == Version || LA15_2 == Stages || LA15_2 >= Jobs && LA15_2 <= Name || LA15_2 == Orbs || LA15_2 == Pool || LA15_2 == Env || LA15_2 == On || LA15_2 == RULE_BEGIN || LA15_2 == RULE_ID ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {
            	                alt15=2;
            	            }


            	        }
            	        else if ( LA15_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0) ) {
            	            alt15=1;
            	        }
            	        else if ( LA15_0 == Demands && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {
            	            alt15=2;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:531:9: ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:531:9: ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) )
            	    	    // InternalPipelineParser.g:532:10: {...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0)");
            	    	    }
            	    	    // InternalPipelineParser.g:532:112: ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) )
            	    	    // InternalPipelineParser.g:533:11: ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 0);
            	    	    										
            	    	    // InternalPipelineParser.g:536:14: ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) )
            	    	    // InternalPipelineParser.g:536:15: {...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:536:24: (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? )
            	    	    // InternalPipelineParser.g:536:25: this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )?
            	    	    {
            	    	    this_BEGIN_36=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            	    	    														newLeafNode(this_BEGIN_36, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_7_1_0_0());
            	    	    													
            	    	    // InternalPipelineParser.g:540:14: (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) )
            	    	    // InternalPipelineParser.g:541:15: otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_37=(Token)match(input,Name,FOLLOW_3); 

            	    	    															newLeafNode(otherlv_37, grammarAccess.getPipelineAccess().getNameKeyword_7_1_0_1_0());
            	    	    														
            	    	    // InternalPipelineParser.g:545:15: ( (lv_vmName_38_0= RULE_ID ) )
            	    	    // InternalPipelineParser.g:546:16: (lv_vmName_38_0= RULE_ID )
            	    	    {
            	    	    // InternalPipelineParser.g:546:16: (lv_vmName_38_0= RULE_ID )
            	    	    // InternalPipelineParser.g:547:17: lv_vmName_38_0= RULE_ID
            	    	    {
            	    	    lv_vmName_38_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    	    																	newLeafNode(lv_vmName_38_0, grammarAccess.getPipelineAccess().getVmNameIDTerminalRuleCall_7_1_0_1_1_0());
            	    	    																

            	    	    																	if (current==null) {
            	    	    																		current = createModelElement(grammarAccess.getPipelineRule());
            	    	    																	}
            	    	    																	setWithLastConsumed(
            	    	    																		current,
            	    	    																		"vmName",
            	    	    																		lv_vmName_38_0,
            	    	    																		"ca.mcgill.devops.pipeline.Pipeline.ID");
            	    	    																

            	    	    }


            	    	    }


            	    	    }

            	    	    // InternalPipelineParser.g:564:14: (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )?
            	    	    int alt12=2;
            	    	    int LA12_0 = input.LA(1);

            	    	    if ( (LA12_0==VmImage) ) {
            	    	        alt12=1;
            	    	    }
            	    	    switch (alt12) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:565:15: otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) )
            	    	            {
            	    	            otherlv_39=(Token)match(input,VmImage,FOLLOW_20); 

            	    	            															newLeafNode(otherlv_39, grammarAccess.getPipelineAccess().getVmImageKeyword_7_1_0_2_0());
            	    	            														
            	    	            // InternalPipelineParser.g:569:15: ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) )
            	    	            // InternalPipelineParser.g:570:16: ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) )
            	    	            {
            	    	            // InternalPipelineParser.g:570:16: ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) )
            	    	            // InternalPipelineParser.g:571:17: (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING )
            	    	            {
            	    	            // InternalPipelineParser.g:571:17: (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING )
            	    	            int alt11=2;
            	    	            int LA11_0 = input.LA(1);

            	    	            if ( (LA11_0==RULE_ID) ) {
            	    	                alt11=1;
            	    	            }
            	    	            else if ( (LA11_0==RULE_STRING) ) {
            	    	                alt11=2;
            	    	            }
            	    	            else {
            	    	                NoViableAltException nvae =
            	    	                    new NoViableAltException("", 11, 0, input);

            	    	                throw nvae;
            	    	            }
            	    	            switch (alt11) {
            	    	                case 1 :
            	    	                    // InternalPipelineParser.g:572:18: lv_vmImage_40_1= RULE_ID
            	    	                    {
            	    	                    lv_vmImage_40_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    	                    																		newLeafNode(lv_vmImage_40_1, grammarAccess.getPipelineAccess().getVmImageIDTerminalRuleCall_7_1_0_2_1_0_0());
            	    	                    																	

            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElement(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		setWithLastConsumed(
            	    	                    																			current,
            	    	                    																			"vmImage",
            	    	                    																			lv_vmImage_40_1,
            	    	                    																			"ca.mcgill.devops.pipeline.Pipeline.ID");
            	    	                    																	

            	    	                    }
            	    	                    break;
            	    	                case 2 :
            	    	                    // InternalPipelineParser.g:587:18: lv_vmImage_40_2= RULE_STRING
            	    	                    {
            	    	                    lv_vmImage_40_2=(Token)match(input,RULE_STRING,FOLLOW_21); 

            	    	                    																		newLeafNode(lv_vmImage_40_2, grammarAccess.getPipelineAccess().getVmImageSTRINGTerminalRuleCall_7_1_0_2_1_0_1());
            	    	                    																	

            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElement(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		setWithLastConsumed(
            	    	                    																			current,
            	    	                    																			"vmImage",
            	    	                    																			lv_vmImage_40_2,
            	    	                    																			"org.eclipse.xtext.common.Terminals.STRING");
            	    	                    																	

            	    	                    }
            	    	                    break;

            	    	            }


            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalPipelineParser.g:611:9: ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) )
            	    	    {
            	    	    // InternalPipelineParser.g:611:9: ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) )
            	    	    // InternalPipelineParser.g:612:10: {...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1)");
            	    	    }
            	    	    // InternalPipelineParser.g:612:112: ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) )
            	    	    // InternalPipelineParser.g:613:11: ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1);
            	    	    										
            	    	    // InternalPipelineParser.g:616:14: ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) )
            	    	    // InternalPipelineParser.g:616:15: {...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    	    }
            	    	    // InternalPipelineParser.g:616:24: ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END )
            	    	    // InternalPipelineParser.g:616:25: (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END
            	    	    {
            	    	    // InternalPipelineParser.g:616:25: (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )?
            	    	    int alt14=2;
            	    	    int LA14_0 = input.LA(1);

            	    	    if ( (LA14_0==Demands) ) {
            	    	        alt14=1;
            	    	    }
            	    	    switch (alt14) {
            	    	        case 1 :
            	    	            // InternalPipelineParser.g:617:15: otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) )
            	    	            {
            	    	            otherlv_41=(Token)match(input,Demands,FOLLOW_22); 

            	    	            															newLeafNode(otherlv_41, grammarAccess.getPipelineAccess().getDemandsKeyword_7_1_1_0_0());
            	    	            														
            	    	            // InternalPipelineParser.g:621:15: ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) )
            	    	            // InternalPipelineParser.g:622:16: ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) )
            	    	            {
            	    	            // InternalPipelineParser.g:622:16: ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) )
            	    	            // InternalPipelineParser.g:623:17: (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues )
            	    	            {
            	    	            // InternalPipelineParser.g:623:17: (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues )
            	    	            int alt13=2;
            	    	            int LA13_0 = input.LA(1);

            	    	            if ( ((LA13_0>=RULE_COMPLEX_EXPRESSION && LA13_0<=RULE_VERSION)||LA13_0==RULE_ID||LA13_0==RULE_STRING) ) {
            	    	                alt13=1;
            	    	            }
            	    	            else if ( (LA13_0==HyphenMinus||LA13_0==RULE_BEGIN) ) {
            	    	                alt13=2;
            	    	            }
            	    	            else {
            	    	                NoViableAltException nvae =
            	    	                    new NoViableAltException("", 13, 0, input);

            	    	                throw nvae;
            	    	            }
            	    	            switch (alt13) {
            	    	                case 1 :
            	    	                    // InternalPipelineParser.g:624:18: lv_vmDemands_42_1= ruleAnyData
            	    	                    {

            	    	                    																		newCompositeNode(grammarAccess.getPipelineAccess().getVmDemandsAnyDataParserRuleCall_7_1_1_0_1_0_0());
            	    	                    																	
            	    	                    pushFollow(FOLLOW_9);
            	    	                    lv_vmDemands_42_1=ruleAnyData();

            	    	                    state._fsp--;


            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		set(
            	    	                    																			current,
            	    	                    																			"vmDemands",
            	    	                    																			lv_vmDemands_42_1,
            	    	                    																			"ca.mcgill.devops.pipeline.Pipeline.AnyData");
            	    	                    																		afterParserOrEnumRuleCall();
            	    	                    																	

            	    	                    }
            	    	                    break;
            	    	                case 2 :
            	    	                    // InternalPipelineParser.g:640:18: lv_vmDemands_42_2= ruleHyphenValues
            	    	                    {

            	    	                    																		newCompositeNode(grammarAccess.getPipelineAccess().getVmDemandsHyphenValuesParserRuleCall_7_1_1_0_1_0_1());
            	    	                    																	
            	    	                    pushFollow(FOLLOW_9);
            	    	                    lv_vmDemands_42_2=ruleHyphenValues();

            	    	                    state._fsp--;


            	    	                    																		if (current==null) {
            	    	                    																			current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	                    																		}
            	    	                    																		set(
            	    	                    																			current,
            	    	                    																			"vmDemands",
            	    	                    																			lv_vmDemands_42_2,
            	    	                    																			"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
            	    	                    																		afterParserOrEnumRuleCall();
            	    	                    																	

            	    	                    }
            	    	                    break;

            	    	            }


            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }

            	    	    this_END_43=(Token)match(input,RULE_END,FOLLOW_21); 

            	    	    														newLeafNode(this_END_43, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_7_1_1_1());
            	    	    													

            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1());
            	    	    										

            	    	    }


            	    	    }


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

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1()) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1())");
            	    }

            	    }


            	    }

            	     
            	    									  getUnorderedGroupHelper().leave(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1());
            	    									

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalPipelineParser.g:683:3: ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:683:3: ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) )
            	    // InternalPipelineParser.g:684:4: {...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalPipelineParser.g:684:102: ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:685:5: ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalPipelineParser.g:688:8: ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) )
            	    // InternalPipelineParser.g:688:9: {...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:688:18: (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) )
            	    // InternalPipelineParser.g:688:19: otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END )
            	    {
            	    otherlv_44=(Token)match(input,Resources,FOLLOW_5); 

            	    								newLeafNode(otherlv_44, grammarAccess.getPipelineAccess().getResourcesKeyword_8_0());
            	    							
            	    // InternalPipelineParser.g:692:8: (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END )
            	    // InternalPipelineParser.g:693:9: this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END
            	    {
            	    this_BEGIN_45=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            	    									newLeafNode(this_BEGIN_45, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_8_1_0());
            	    								
            	    // InternalPipelineParser.g:697:9: ( (lv_resources_46_0= ruleResource ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==Repositories||LA16_0==Containers||LA16_0==Pipelines||LA16_0==Packages||LA16_0==Webhooks||LA16_0==Builds) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:698:10: (lv_resources_46_0= ruleResource )
            	    	    {
            	    	    // InternalPipelineParser.g:698:10: (lv_resources_46_0= ruleResource )
            	    	    // InternalPipelineParser.g:699:11: lv_resources_46_0= ruleResource
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPipelineAccess().getResourcesResourceParserRuleCall_8_1_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_23);
            	    	    lv_resources_46_0=ruleResource();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"resources",
            	    	    												lv_resources_46_0,
            	    	    												"ca.mcgill.devops.pipeline.Pipeline.Resource");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    this_END_47=(Token)match(input,RULE_END,FOLLOW_4); 

            	    									newLeafNode(this_END_47, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_8_1_2());
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalPipelineParser.g:727:3: ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:727:3: ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) )
            	    // InternalPipelineParser.g:728:4: {...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalPipelineParser.g:728:102: ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) )
            	    // InternalPipelineParser.g:729:5: ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalPipelineParser.g:732:8: ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) )
            	    // InternalPipelineParser.g:732:9: {...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:732:18: (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) )
            	    // InternalPipelineParser.g:732:19: otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) )
            	    {
            	    otherlv_48=(Token)match(input,Version,FOLLOW_24); 

            	    								newLeafNode(otherlv_48, grammarAccess.getPipelineAccess().getVersionKeyword_9_0());
            	    							
            	    // InternalPipelineParser.g:736:8: ( (lv_version_49_0= RULE_VERSION ) )
            	    // InternalPipelineParser.g:737:9: (lv_version_49_0= RULE_VERSION )
            	    {
            	    // InternalPipelineParser.g:737:9: (lv_version_49_0= RULE_VERSION )
            	    // InternalPipelineParser.g:738:10: lv_version_49_0= RULE_VERSION
            	    {
            	    lv_version_49_0=(Token)match(input,RULE_VERSION,FOLLOW_4); 

            	    										newLeafNode(lv_version_49_0, grammarAccess.getPipelineAccess().getVersionVERSIONTerminalRuleCall_9_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPipelineRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"version",
            	    											lv_version_49_0,
            	    											"ca.mcgill.devops.pipeline.Pipeline.VERSION");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalPipelineParser.g:760:3: ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) )
            	    {
            	    // InternalPipelineParser.g:760:3: ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) )
            	    // InternalPipelineParser.g:761:4: {...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalPipelineParser.g:761:103: ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) )
            	    // InternalPipelineParser.g:762:5: ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalPipelineParser.g:765:8: ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) )
            	    // InternalPipelineParser.g:765:9: {...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:765:18: (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* )
            	    // InternalPipelineParser.g:765:19: otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )*
            	    {
            	    otherlv_50=(Token)match(input,Variables,FOLLOW_25); 

            	    								newLeafNode(otherlv_50, grammarAccess.getPipelineAccess().getVariablesKeyword_10_0());
            	    							
            	    // InternalPipelineParser.g:769:8: ( (lv_pplVariables_51_0= ruleVariable ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==HyphenMinus||LA17_0==RULE_BEGIN) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:770:9: (lv_pplVariables_51_0= ruleVariable )
            	    	    {
            	    	    // InternalPipelineParser.g:770:9: (lv_pplVariables_51_0= ruleVariable )
            	    	    // InternalPipelineParser.g:771:10: lv_pplVariables_51_0= ruleVariable
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPipelineAccess().getPplVariablesVariableParserRuleCall_10_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_pplVariables_51_0=ruleVariable();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"pplVariables",
            	    	    											lv_pplVariables_51_0,
            	    	    											"ca.mcgill.devops.pipeline.Pipeline.Variable");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalPipelineParser.g:794:3: ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:794:3: ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) )
            	    // InternalPipelineParser.g:795:4: {...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11)");
            	    }
            	    // InternalPipelineParser.g:795:103: ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) )
            	    // InternalPipelineParser.g:796:5: ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11);
            	    				
            	    // InternalPipelineParser.g:799:8: ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) )
            	    // InternalPipelineParser.g:799:9: {...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:799:18: ( (lv_extendedParameter_52_0= ruleExtendedParameter ) )
            	    // InternalPipelineParser.g:799:19: (lv_extendedParameter_52_0= ruleExtendedParameter )
            	    {
            	    // InternalPipelineParser.g:799:19: (lv_extendedParameter_52_0= ruleExtendedParameter )
            	    // InternalPipelineParser.g:800:9: lv_extendedParameter_52_0= ruleExtendedParameter
            	    {

            	    									newCompositeNode(grammarAccess.getPipelineAccess().getExtendedParameterExtendedParameterParserRuleCall_11_0());
            	    								
            	    pushFollow(FOLLOW_4);
            	    lv_extendedParameter_52_0=ruleExtendedParameter();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    									}
            	    									set(
            	    										current,
            	    										"extendedParameter",
            	    										lv_extendedParameter_52_0,
            	    										"ca.mcgill.devops.pipeline.Pipeline.ExtendedParameter");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalPipelineParser.g:822:3: ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:822:3: ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) )
            	    // InternalPipelineParser.g:823:4: {...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12)");
            	    }
            	    // InternalPipelineParser.g:823:103: ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:824:5: ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12);
            	    				
            	    // InternalPipelineParser.g:827:8: ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) )
            	    // InternalPipelineParser.g:827:9: {...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:827:18: ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) )
            	    // InternalPipelineParser.g:827:19: ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END )
            	    {
            	    // InternalPipelineParser.g:827:19: ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==Parameters||LA18_0==Executors||LA18_0==Commands||LA18_0==Default||LA18_0==Orbs) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:828:9: (lv_pipelineParameters_53_0= rulePipelineParameter )
            	    	    {
            	    	    // InternalPipelineParser.g:828:9: (lv_pipelineParameters_53_0= rulePipelineParameter )
            	    	    // InternalPipelineParser.g:829:10: lv_pipelineParameters_53_0= rulePipelineParameter
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPipelineAccess().getPipelineParametersPipelineParameterParserRuleCall_12_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_pipelineParameters_53_0=rulePipelineParameter();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPipelineRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"pipelineParameters",
            	    	    											lv_pipelineParameters_53_0,
            	    	    											"ca.mcgill.devops.pipeline.Pipeline.PipelineParameter");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);

            	    // InternalPipelineParser.g:846:8: ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==On) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==Workflow_dispatch||LA24_0==Workflow_call||LA24_0==Workflow_run||LA24_0==Schedules||LA24_0==Schedule||LA24_0==Stages||LA24_0==Jobs||LA24_0==RULE_ID) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalPipelineParser.g:847:9: (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? )
            	            {
            	            // InternalPipelineParser.g:847:9: (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? )
            	            // InternalPipelineParser.g:848:10: otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )?
            	            {
            	            otherlv_54=(Token)match(input,On,FOLLOW_27); 

            	            										newLeafNode(otherlv_54, grammarAccess.getPipelineAccess().getOnKeyword_12_1_0_0());
            	            									
            	            // InternalPipelineParser.g:852:10: (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )?
            	            int alt20=2;
            	            int LA20_0 = input.LA(1);

            	            if ( (LA20_0==RULE_BEGIN) ) {
            	                alt20=1;
            	            }
            	            switch (alt20) {
            	                case 1 :
            	                    // InternalPipelineParser.g:853:11: this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END
            	                    {
            	                    this_BEGIN_55=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            	                    											newLeafNode(this_BEGIN_55, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_12_1_0_1_0());
            	                    										
            	                    // InternalPipelineParser.g:857:11: ( (lv_triggers_56_0= ruleEvent ) )+
            	                    int cnt19=0;
            	                    loop19:
            	                    do {
            	                        int alt19=2;
            	                        int LA19_0 = input.LA(1);

            	                        if ( (LA19_0==Workflow_dispatch||LA19_0==Workflow_call||LA19_0==Workflow_run||LA19_0==Schedules||LA19_0==Schedule||LA19_0==RULE_ID) ) {
            	                            alt19=1;
            	                        }


            	                        switch (alt19) {
            	                    	case 1 :
            	                    	    // InternalPipelineParser.g:858:12: (lv_triggers_56_0= ruleEvent )
            	                    	    {
            	                    	    // InternalPipelineParser.g:858:12: (lv_triggers_56_0= ruleEvent )
            	                    	    // InternalPipelineParser.g:859:13: lv_triggers_56_0= ruleEvent
            	                    	    {

            	                    	    													newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_12_1_0_1_1_0());
            	                    	    												
            	                    	    pushFollow(FOLLOW_29);
            	                    	    lv_triggers_56_0=ruleEvent();

            	                    	    state._fsp--;


            	                    	    													if (current==null) {
            	                    	    														current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    	    													}
            	                    	    													add(
            	                    	    														current,
            	                    	    														"triggers",
            	                    	    														lv_triggers_56_0,
            	                    	    														"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    	    													afterParserOrEnumRuleCall();
            	                    	    												

            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    if ( cnt19 >= 1 ) break loop19;
            	                                EarlyExitException eee =
            	                                    new EarlyExitException(19, input);
            	                                throw eee;
            	                        }
            	                        cnt19++;
            	                    } while (true);

            	                    this_END_57=(Token)match(input,RULE_END,FOLLOW_30); 

            	                    											newLeafNode(this_END_57, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_12_1_0_1_2());
            	                    										

            	                    }
            	                    break;

            	            }

            	            // InternalPipelineParser.g:881:10: ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )?
            	            int alt22=3;
            	            int LA22_0 = input.LA(1);

            	            if ( (LA22_0==Workflow_dispatch||LA22_0==Workflow_call||LA22_0==Workflow_run||LA22_0==Schedules||LA22_0==Schedule||LA22_0==RULE_ID) ) {
            	                alt22=1;
            	            }
            	            else if ( (LA22_0==LeftSquareBracket) ) {
            	                alt22=2;
            	            }
            	            switch (alt22) {
            	                case 1 :
            	                    // InternalPipelineParser.g:882:11: ( (lv_triggers_58_0= ruleEvent ) )
            	                    {
            	                    // InternalPipelineParser.g:882:11: ( (lv_triggers_58_0= ruleEvent ) )
            	                    // InternalPipelineParser.g:883:12: (lv_triggers_58_0= ruleEvent )
            	                    {
            	                    // InternalPipelineParser.g:883:12: (lv_triggers_58_0= ruleEvent )
            	                    // InternalPipelineParser.g:884:13: lv_triggers_58_0= ruleEvent
            	                    {

            	                    													newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_12_1_0_2_0_0());
            	                    												
            	                    pushFollow(FOLLOW_31);
            	                    lv_triggers_58_0=ruleEvent();

            	                    state._fsp--;


            	                    													if (current==null) {
            	                    														current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    													}
            	                    													add(
            	                    														current,
            	                    														"triggers",
            	                    														lv_triggers_58_0,
            	                    														"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    													afterParserOrEnumRuleCall();
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalPipelineParser.g:902:11: (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket )
            	                    {
            	                    // InternalPipelineParser.g:902:11: (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket )
            	                    // InternalPipelineParser.g:903:12: otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket
            	                    {
            	                    otherlv_59=(Token)match(input,LeftSquareBracket,FOLLOW_28); 

            	                    												newLeafNode(otherlv_59, grammarAccess.getPipelineAccess().getLeftSquareBracketKeyword_12_1_0_2_1_0());
            	                    											
            	                    // InternalPipelineParser.g:907:12: ( (lv_triggers_60_0= ruleEvent ) )
            	                    // InternalPipelineParser.g:908:13: (lv_triggers_60_0= ruleEvent )
            	                    {
            	                    // InternalPipelineParser.g:908:13: (lv_triggers_60_0= ruleEvent )
            	                    // InternalPipelineParser.g:909:14: lv_triggers_60_0= ruleEvent
            	                    {

            	                    														newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_12_1_0_2_1_1_0());
            	                    													
            	                    pushFollow(FOLLOW_32);
            	                    lv_triggers_60_0=ruleEvent();

            	                    state._fsp--;


            	                    														if (current==null) {
            	                    															current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    														}
            	                    														add(
            	                    															current,
            	                    															"triggers",
            	                    															lv_triggers_60_0,
            	                    															"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    														afterParserOrEnumRuleCall();
            	                    													

            	                    }


            	                    }

            	                    // InternalPipelineParser.g:926:12: (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )*
            	                    loop21:
            	                    do {
            	                        int alt21=2;
            	                        int LA21_0 = input.LA(1);

            	                        if ( (LA21_0==Comma) ) {
            	                            alt21=1;
            	                        }


            	                        switch (alt21) {
            	                    	case 1 :
            	                    	    // InternalPipelineParser.g:927:13: otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) )
            	                    	    {
            	                    	    otherlv_61=(Token)match(input,Comma,FOLLOW_28); 

            	                    	    													newLeafNode(otherlv_61, grammarAccess.getPipelineAccess().getCommaKeyword_12_1_0_2_1_2_0());
            	                    	    												
            	                    	    // InternalPipelineParser.g:931:13: ( (lv_triggers_62_0= ruleEvent ) )
            	                    	    // InternalPipelineParser.g:932:14: (lv_triggers_62_0= ruleEvent )
            	                    	    {
            	                    	    // InternalPipelineParser.g:932:14: (lv_triggers_62_0= ruleEvent )
            	                    	    // InternalPipelineParser.g:933:15: lv_triggers_62_0= ruleEvent
            	                    	    {

            	                    	    															newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_12_1_0_2_1_2_1_0());
            	                    	    														
            	                    	    pushFollow(FOLLOW_32);
            	                    	    lv_triggers_62_0=ruleEvent();

            	                    	    state._fsp--;


            	                    	    															if (current==null) {
            	                    	    																current = createModelElementForParent(grammarAccess.getPipelineRule());
            	                    	    															}
            	                    	    															add(
            	                    	    																current,
            	                    	    																"triggers",
            	                    	    																lv_triggers_62_0,
            	                    	    																"ca.mcgill.devops.pipeline.Pipeline.Event");
            	                    	    															afterParserOrEnumRuleCall();
            	                    	    														

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop21;
            	                        }
            	                    } while (true);

            	                    otherlv_63=(Token)match(input,RightSquareBracket,FOLLOW_31); 

            	                    												newLeafNode(otherlv_63, grammarAccess.getPipelineAccess().getRightSquareBracketKeyword_12_1_0_2_1_3());
            	                    											

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:959:9: ( (lv_triggers_64_0= ruleEvent ) )*
            	            {
            	            // InternalPipelineParser.g:959:9: ( (lv_triggers_64_0= ruleEvent ) )*
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==Workflow_dispatch||LA23_0==Workflow_call||LA23_0==Workflow_run||LA23_0==Schedules||LA23_0==Schedule||LA23_0==RULE_ID) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:960:10: (lv_triggers_64_0= ruleEvent )
            	            	    {
            	            	    // InternalPipelineParser.g:960:10: (lv_triggers_64_0= ruleEvent )
            	            	    // InternalPipelineParser.g:961:11: lv_triggers_64_0= ruleEvent
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getPipelineAccess().getTriggersEventParserRuleCall_12_1_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_33);
            	            	    lv_triggers_64_0=ruleEvent();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getPipelineRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"triggers",
            	            	    												lv_triggers_64_0,
            	            	    												"ca.mcgill.devops.pipeline.Pipeline.Event");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop23;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    // InternalPipelineParser.g:979:8: ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END )
            	    // InternalPipelineParser.g:980:9: ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END
            	    {
            	    // InternalPipelineParser.g:980:9: ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) )
            	    // InternalPipelineParser.g:981:10: ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) )
            	    {
            	    // InternalPipelineParser.g:981:10: ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) )
            	    // InternalPipelineParser.g:982:11: (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs )
            	    {
            	    // InternalPipelineParser.g:982:11: (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==Stages) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==Jobs) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalPipelineParser.g:983:12: lv_jobOrStageVar_65_1= Stages
            	            {
            	            lv_jobOrStageVar_65_1=(Token)match(input,Stages,FOLLOW_5); 

            	            												newLeafNode(lv_jobOrStageVar_65_1, grammarAccess.getPipelineAccess().getJobOrStageVarStagesKeyword_12_2_0_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getPipelineRule());
            	            												}
            	            												setWithLastConsumed(current, "jobOrStageVar", lv_jobOrStageVar_65_1, null);
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:994:12: lv_jobOrStageVar_65_2= Jobs
            	            {
            	            lv_jobOrStageVar_65_2=(Token)match(input,Jobs,FOLLOW_5); 

            	            												newLeafNode(lv_jobOrStageVar_65_2, grammarAccess.getPipelineAccess().getJobOrStageVarJobsKeyword_12_2_0_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getPipelineRule());
            	            												}
            	            												setWithLastConsumed(current, "jobOrStageVar", lv_jobOrStageVar_65_2, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    this_BEGIN_66=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

            	    									newLeafNode(this_BEGIN_66, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_12_2_1());
            	    								
            	    // InternalPipelineParser.g:1011:9: ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* )
            	    int alt28=2;
            	    switch ( input.LA(1) ) {
            	    case HyphenMinus:
            	        {
            	        int LA28_1 = input.LA(2);

            	        if ( (LA28_1==Stage) ) {
            	            alt28=1;
            	        }
            	        else if ( (LA28_1==Deployment||LA28_1==Job) ) {
            	            alt28=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 28, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_END:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case RULE_ID:
            	    case RULE_STRING:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // InternalPipelineParser.g:1012:10: ( (lv_stages_67_0= ruleStage ) )*
            	            {
            	            // InternalPipelineParser.g:1012:10: ( (lv_stages_67_0= ruleStage ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==HyphenMinus) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:1013:11: (lv_stages_67_0= ruleStage )
            	            	    {
            	            	    // InternalPipelineParser.g:1013:11: (lv_stages_67_0= ruleStage )
            	            	    // InternalPipelineParser.g:1014:12: lv_stages_67_0= ruleStage
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getPipelineAccess().getStagesStageParserRuleCall_12_2_2_0_0());
            	            	    											
            	            	    pushFollow(FOLLOW_35);
            	            	    lv_stages_67_0=ruleStage();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getPipelineRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"stages",
            	            	    													lv_stages_67_0,
            	            	    													"ca.mcgill.devops.pipeline.Pipeline.Stage");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop26;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:1032:10: ( (lv_jobs_68_0= ruleJob ) )*
            	            {
            	            // InternalPipelineParser.g:1032:10: ( (lv_jobs_68_0= ruleJob ) )*
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==HyphenMinus||LA27_0==RULE_ID||LA27_0==RULE_STRING) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:1033:11: (lv_jobs_68_0= ruleJob )
            	            	    {
            	            	    // InternalPipelineParser.g:1033:11: (lv_jobs_68_0= ruleJob )
            	            	    // InternalPipelineParser.g:1034:12: lv_jobs_68_0= ruleJob
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getPipelineAccess().getJobsJobParserRuleCall_12_2_2_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_34);
            	            	    lv_jobs_68_0=ruleJob();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getPipelineRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"jobs",
            	            	    													lv_jobs_68_0,
            	            	    													"ca.mcgill.devops.pipeline.Pipeline.Job");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop27;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    this_END_69=(Token)match(input,RULE_END,FOLLOW_4); 

            	    									newLeafNode(this_END_69, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_12_2_3());
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canLeave(grammarAccess.getPipelineAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getPipelineAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePipeline"


    // $ANTLR start "entryRuleExtendedParameter"
    // InternalPipelineParser.g:1074:1: entryRuleExtendedParameter returns [EObject current=null] : iv_ruleExtendedParameter= ruleExtendedParameter EOF ;
    public final EObject entryRuleExtendedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedParameter = null;


        try {
            // InternalPipelineParser.g:1074:58: (iv_ruleExtendedParameter= ruleExtendedParameter EOF )
            // InternalPipelineParser.g:1075:2: iv_ruleExtendedParameter= ruleExtendedParameter EOF
            {
             newCompositeNode(grammarAccess.getExtendedParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtendedParameter=ruleExtendedParameter();

            state._fsp--;

             current =iv_ruleExtendedParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedParameter"


    // $ANTLR start "ruleExtendedParameter"
    // InternalPipelineParser.g:1081:1: ruleExtendedParameter returns [EObject current=null] : ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) ) ;
    public final EObject ruleExtendedParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token lv_template_3_0=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token this_END_8=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        EObject lv_extendedParameterValues_6_0 = null;

        EObject lv_extendedParameterValues_11_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1087:2: ( ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) ) )
            // InternalPipelineParser.g:1088:2: ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) )
            {
            // InternalPipelineParser.g:1088:2: ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Extends) ) {
                alt32=1;
            }
            else if ( (LA32_0==Include) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalPipelineParser.g:1089:3: (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) )
                    {
                    // InternalPipelineParser.g:1089:3: (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) )
                    // InternalPipelineParser.g:1090:4: otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END )
                    {
                    otherlv_0=(Token)match(input,Extends,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getExtendedParameterAccess().getExtendsKeyword_0_0());
                    			
                    // InternalPipelineParser.g:1094:4: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END )
                    // InternalPipelineParser.g:1095:5: this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END
                    {
                    this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

                    					newLeafNode(this_BEGIN_1, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_0());
                    				
                    // InternalPipelineParser.g:1099:5: (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) )
                    // InternalPipelineParser.g:1100:6: otherlv_2= Template ( (lv_template_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,Template,FOLLOW_3); 

                    						newLeafNode(otherlv_2, grammarAccess.getExtendedParameterAccess().getTemplateKeyword_0_1_1_0());
                    					
                    // InternalPipelineParser.g:1104:6: ( (lv_template_3_0= RULE_ID ) )
                    // InternalPipelineParser.g:1105:7: (lv_template_3_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:1105:7: (lv_template_3_0= RULE_ID )
                    // InternalPipelineParser.g:1106:8: lv_template_3_0= RULE_ID
                    {
                    lv_template_3_0=(Token)match(input,RULE_ID,FOLLOW_37); 

                    								newLeafNode(lv_template_3_0, grammarAccess.getExtendedParameterAccess().getTemplateIDTerminalRuleCall_0_1_1_1_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getExtendedParameterRule());
                    								}
                    								setWithLastConsumed(
                    									current,
                    									"template",
                    									lv_template_3_0,
                    									"ca.mcgill.devops.pipeline.Pipeline.ID");
                    							

                    }


                    }


                    }

                    // InternalPipelineParser.g:1123:5: (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) )
                    // InternalPipelineParser.g:1124:6: otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    {
                    otherlv_4=(Token)match(input,Parameters,FOLLOW_5); 

                    						newLeafNode(otherlv_4, grammarAccess.getExtendedParameterAccess().getParametersKeyword_0_1_2_0());
                    					
                    // InternalPipelineParser.g:1128:6: (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    // InternalPipelineParser.g:1129:7: this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_38); 

                    							newLeafNode(this_BEGIN_5, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_2_1_0());
                    						
                    // InternalPipelineParser.g:1133:7: ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==HyphenMinus||LA30_0==RULE_COMPLEX_EXPRESSION||LA30_0==RULE_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1134:8: (lv_extendedParameterValues_6_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1134:8: (lv_extendedParameterValues_6_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1135:9: lv_extendedParameterValues_6_0= ruleParameterValue
                    	    {

                    	    									newCompositeNode(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_0_1_2_1_1_0());
                    	    								
                    	    pushFollow(FOLLOW_38);
                    	    lv_extendedParameterValues_6_0=ruleParameterValue();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getExtendedParameterRule());
                    	    									}
                    	    									add(
                    	    										current,
                    	    										"extendedParameterValues",
                    	    										lv_extendedParameterValues_6_0,
                    	    										"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_9); 

                    							newLeafNode(this_END_7, grammarAccess.getExtendedParameterAccess().getENDTerminalRuleCall_0_1_2_1_2());
                    						

                    }


                    }

                    this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_8, grammarAccess.getExtendedParameterAccess().getENDTerminalRuleCall_0_1_3());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1165:3: (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) )
                    {
                    // InternalPipelineParser.g:1165:3: (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) )
                    // InternalPipelineParser.g:1166:4: otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END )
                    {
                    otherlv_9=(Token)match(input,Include,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getExtendedParameterAccess().getIncludeKeyword_1_0());
                    			
                    // InternalPipelineParser.g:1170:4: (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END )
                    // InternalPipelineParser.g:1171:5: this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END
                    {
                    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

                    					newLeafNode(this_BEGIN_10, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:1175:5: ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==HyphenMinus||LA31_0==RULE_COMPLEX_EXPRESSION||LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1176:6: (lv_extendedParameterValues_11_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1176:6: (lv_extendedParameterValues_11_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1177:7: lv_extendedParameterValues_11_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_extendedParameterValues_11_0=ruleParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExtendedParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"extendedParameterValues",
                    	    								lv_extendedParameterValues_11_0,
                    	    								"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_12, grammarAccess.getExtendedParameterAccess().getENDTerminalRuleCall_1_1_2());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtendedParameter"


    // $ANTLR start "entryRuleVariable"
    // InternalPipelineParser.g:1204:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPipelineParser.g:1204:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPipelineParser.g:1205:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalPipelineParser.g:1211:1: ruleVariable returns [EObject current=null] : ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token this_END_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_readonly_13_0=null;
        Token this_END_14=null;
        EObject lv_variableValues_1_0 = null;

        AntlrDatatypeRuleToken lv_group_5_0 = null;

        AntlrDatatypeRuleToken lv_name_8_0 = null;

        AntlrDatatypeRuleToken lv_value_11_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1217:2: ( ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) ) )
            // InternalPipelineParser.g:1218:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) )
            {
            // InternalPipelineParser.g:1218:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_BEGIN) ) {
                alt36=1;
            }
            else if ( (LA36_0==HyphenMinus) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPipelineParser.g:1219:3: (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END )
                    {
                    // InternalPipelineParser.g:1219:3: (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END )
                    // InternalPipelineParser.g:1220:4: this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END
                    {
                    this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

                    				newLeafNode(this_BEGIN_0, grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_0_0());
                    			
                    // InternalPipelineParser.g:1224:4: ( (lv_variableValues_1_0= ruleParameterValue ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==HyphenMinus||LA33_0==RULE_COMPLEX_EXPRESSION||LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1225:5: (lv_variableValues_1_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1225:5: (lv_variableValues_1_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1226:6: lv_variableValues_1_0= ruleParameterValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getVariableAccess().getVariableValuesParameterValueParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_38);
                    	    lv_variableValues_1_0=ruleParameterValue();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variableValues",
                    	    							lv_variableValues_1_0,
                    	    							"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);

                    this_END_2=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_2, grammarAccess.getVariableAccess().getENDTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1249:3: ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) )
                    {
                    // InternalPipelineParser.g:1249:3: ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) )
                    // InternalPipelineParser.g:1250:4: (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) )
                    {
                    // InternalPipelineParser.g:1250:4: (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==HyphenMinus) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==Group) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalPipelineParser.g:1251:5: otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) )
                            {
                            otherlv_3=(Token)match(input,HyphenMinus,FOLLOW_14); 

                            					newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_0_0());
                            				
                            otherlv_4=(Token)match(input,Group,FOLLOW_40); 

                            					newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getGroupKeyword_1_0_1());
                            				
                            // InternalPipelineParser.g:1259:5: ( (lv_group_5_0= ruleAnyData ) )
                            // InternalPipelineParser.g:1260:6: (lv_group_5_0= ruleAnyData )
                            {
                            // InternalPipelineParser.g:1260:6: (lv_group_5_0= ruleAnyData )
                            // InternalPipelineParser.g:1261:7: lv_group_5_0= ruleAnyData
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getGroupAnyDataParserRuleCall_1_0_2_0());
                            						
                            pushFollow(FOLLOW_41);
                            lv_group_5_0=ruleAnyData();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVariableRule());
                            							}
                            							set(
                            								current,
                            								"group",
                            								lv_group_5_0,
                            								"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalPipelineParser.g:1279:4: ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) )
                    // InternalPipelineParser.g:1280:5: (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END )
                    {
                    // InternalPipelineParser.g:1280:5: (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) )
                    // InternalPipelineParser.g:1281:6: otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) )
                    {
                    otherlv_6=(Token)match(input,HyphenMinus,FOLLOW_18); 

                    						newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_1_0_0());
                    					
                    otherlv_7=(Token)match(input,Name,FOLLOW_40); 

                    						newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getNameKeyword_1_1_0_1());
                    					
                    // InternalPipelineParser.g:1289:6: ( (lv_name_8_0= ruleAnyData ) )
                    // InternalPipelineParser.g:1290:7: (lv_name_8_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:1290:7: (lv_name_8_0= ruleAnyData )
                    // InternalPipelineParser.g:1291:8: lv_name_8_0= ruleAnyData
                    {

                    								newCompositeNode(grammarAccess.getVariableAccess().getNameAnyDataParserRuleCall_1_1_0_2_0());
                    							
                    pushFollow(FOLLOW_5);
                    lv_name_8_0=ruleAnyData();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getVariableRule());
                    								}
                    								set(
                    									current,
                    									"name",
                    									lv_name_8_0,
                    									"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }

                    // InternalPipelineParser.g:1309:5: (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END )
                    // InternalPipelineParser.g:1310:6: this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END
                    {
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

                    						newLeafNode(this_BEGIN_9, grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_1_1_1_0());
                    					
                    // InternalPipelineParser.g:1314:6: (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) )
                    // InternalPipelineParser.g:1315:7: otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) )
                    {
                    otherlv_10=(Token)match(input,Value,FOLLOW_40); 

                    							newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getValueKeyword_1_1_1_1_0());
                    						
                    // InternalPipelineParser.g:1319:7: ( (lv_value_11_0= ruleAnyData ) )
                    // InternalPipelineParser.g:1320:8: (lv_value_11_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:1320:8: (lv_value_11_0= ruleAnyData )
                    // InternalPipelineParser.g:1321:9: lv_value_11_0= ruleAnyData
                    {

                    									newCompositeNode(grammarAccess.getVariableAccess().getValueAnyDataParserRuleCall_1_1_1_1_1_0());
                    								
                    pushFollow(FOLLOW_43);
                    lv_value_11_0=ruleAnyData();

                    state._fsp--;


                    									if (current==null) {
                    										current = createModelElementForParent(grammarAccess.getVariableRule());
                    									}
                    									set(
                    										current,
                    										"value",
                    										lv_value_11_0,
                    										"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                    									afterParserOrEnumRuleCall();
                    								

                    }


                    }


                    }

                    // InternalPipelineParser.g:1339:6: (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==Readonly) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalPipelineParser.g:1340:7: otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) )
                            {
                            otherlv_12=(Token)match(input,Readonly,FOLLOW_3); 

                            							newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getReadonlyKeyword_1_1_1_2_0());
                            						
                            // InternalPipelineParser.g:1344:7: ( (lv_readonly_13_0= RULE_ID ) )
                            // InternalPipelineParser.g:1345:8: (lv_readonly_13_0= RULE_ID )
                            {
                            // InternalPipelineParser.g:1345:8: (lv_readonly_13_0= RULE_ID )
                            // InternalPipelineParser.g:1346:9: lv_readonly_13_0= RULE_ID
                            {
                            lv_readonly_13_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                            									newLeafNode(lv_readonly_13_0, grammarAccess.getVariableAccess().getReadonlyIDTerminalRuleCall_1_1_1_2_1_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getVariableRule());
                            									}
                            									setWithLastConsumed(
                            										current,
                            										"readonly",
                            										lv_readonly_13_0,
                            										"ca.mcgill.devops.pipeline.Pipeline.ID");
                            								

                            }


                            }


                            }
                            break;

                    }

                    this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

                    						newLeafNode(this_END_14, grammarAccess.getVariableAccess().getENDTerminalRuleCall_1_1_1_3());
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleResource"
    // InternalPipelineParser.g:1374:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalPipelineParser.g:1374:49: (iv_ruleResource= ruleResource EOF )
            // InternalPipelineParser.g:1375:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalPipelineParser.g:1381:1: ruleResource returns [EObject current=null] : ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_resourceName_0_1=null;
        Token lv_resourceName_0_2=null;
        Token lv_resourceName_0_3=null;
        Token lv_resourceName_0_4=null;
        Token lv_resourceName_0_5=null;
        Token lv_resourceName_0_6=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        EObject lv_resourceValues_2_0 = null;

        EObject lv_resourceValues_5_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1387:2: ( ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) ) )
            // InternalPipelineParser.g:1388:2: ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) )
            {
            // InternalPipelineParser.g:1388:2: ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) )
            // InternalPipelineParser.g:1389:3: ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) )
            {
            // InternalPipelineParser.g:1389:3: ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) )
            // InternalPipelineParser.g:1390:4: ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) )
            {
            // InternalPipelineParser.g:1390:4: ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) )
            // InternalPipelineParser.g:1391:5: (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages )
            {
            // InternalPipelineParser.g:1391:5: (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages )
            int alt37=6;
            switch ( input.LA(1) ) {
            case Builds:
                {
                alt37=1;
                }
                break;
            case Containers:
                {
                alt37=2;
                }
                break;
            case Pipelines:
                {
                alt37=3;
                }
                break;
            case Repositories:
                {
                alt37=4;
                }
                break;
            case Webhooks:
                {
                alt37=5;
                }
                break;
            case Packages:
                {
                alt37=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalPipelineParser.g:1392:6: lv_resourceName_0_1= Builds
                    {
                    lv_resourceName_0_1=(Token)match(input,Builds,FOLLOW_44); 

                    						newLeafNode(lv_resourceName_0_1, grammarAccess.getResourceAccess().getResourceNameBuildsKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1403:6: lv_resourceName_0_2= Containers
                    {
                    lv_resourceName_0_2=(Token)match(input,Containers,FOLLOW_44); 

                    						newLeafNode(lv_resourceName_0_2, grammarAccess.getResourceAccess().getResourceNameContainersKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:1414:6: lv_resourceName_0_3= Pipelines
                    {
                    lv_resourceName_0_3=(Token)match(input,Pipelines,FOLLOW_44); 

                    						newLeafNode(lv_resourceName_0_3, grammarAccess.getResourceAccess().getResourceNamePipelinesKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:1425:6: lv_resourceName_0_4= Repositories
                    {
                    lv_resourceName_0_4=(Token)match(input,Repositories,FOLLOW_44); 

                    						newLeafNode(lv_resourceName_0_4, grammarAccess.getResourceAccess().getResourceNameRepositoriesKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:1436:6: lv_resourceName_0_5= Webhooks
                    {
                    lv_resourceName_0_5=(Token)match(input,Webhooks,FOLLOW_44); 

                    						newLeafNode(lv_resourceName_0_5, grammarAccess.getResourceAccess().getResourceNameWebhooksKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:1447:6: lv_resourceName_0_6= Packages
                    {
                    lv_resourceName_0_6=(Token)match(input,Packages,FOLLOW_44); 

                    						newLeafNode(lv_resourceName_0_6, grammarAccess.getResourceAccess().getResourceNamePackagesKeyword_0_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_6, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalPipelineParser.g:1460:3: ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==EOF||LA40_0==Repositories||LA40_0==Containers||LA40_0==Pipelines||LA40_0==Packages||LA40_0==Webhooks||LA40_0==Builds||LA40_0==HyphenMinus||LA40_0==RULE_END) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_BEGIN) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalPipelineParser.g:1461:4: (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )*
                    {
                    // InternalPipelineParser.g:1461:4: (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==HyphenMinus) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1462:5: otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_39); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_0_0());
                    	    				
                    	    // InternalPipelineParser.g:1466:5: ( (lv_resourceValues_2_0= ruleParameterValue ) )
                    	    // InternalPipelineParser.g:1467:6: (lv_resourceValues_2_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1467:6: (lv_resourceValues_2_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1468:7: lv_resourceValues_2_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_45);
                    	    lv_resourceValues_2_0=ruleParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resourceValues",
                    	    								lv_resourceValues_2_0,
                    	    								"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1487:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:1487:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END )
                    // InternalPipelineParser.g:1488:5: this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_35); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getResourceAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:1492:5: (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==HyphenMinus) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1493:6: otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_39); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_1_1_0());
                    	    					
                    	    // InternalPipelineParser.g:1497:6: ( (lv_resourceValues_5_0= ruleParameterValue ) )
                    	    // InternalPipelineParser.g:1498:7: (lv_resourceValues_5_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1498:7: (lv_resourceValues_5_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1499:8: lv_resourceValues_5_0= ruleParameterValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_35);
                    	    lv_resourceValues_5_0=ruleParameterValue();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"resourceValues",
                    	    									lv_resourceValues_5_0,
                    	    									"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_6, grammarAccess.getResourceAccess().getENDTerminalRuleCall_1_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRulePipelineParameter"
    // InternalPipelineParser.g:1527:1: entryRulePipelineParameter returns [EObject current=null] : iv_rulePipelineParameter= rulePipelineParameter EOF ;
    public final EObject entryRulePipelineParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipelineParameter = null;


        try {
            // InternalPipelineParser.g:1527:58: (iv_rulePipelineParameter= rulePipelineParameter EOF )
            // InternalPipelineParser.g:1528:2: iv_rulePipelineParameter= rulePipelineParameter EOF
            {
             newCompositeNode(grammarAccess.getPipelineParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePipelineParameter=rulePipelineParameter();

            state._fsp--;

             current =iv_rulePipelineParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePipelineParameter"


    // $ANTLR start "rulePipelineParameter"
    // InternalPipelineParser.g:1534:1: rulePipelineParameter returns [EObject current=null] : ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) ) ;
    public final EObject rulePipelineParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_name_2_3=null;
        Token lv_name_2_4=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_parameterValues_1_0 = null;

        EObject lv_parameterValues_4_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1540:2: ( ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) ) )
            // InternalPipelineParser.g:1541:2: ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) )
            {
            // InternalPipelineParser.g:1541:2: ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==Parameters) ) {
                alt44=1;
            }
            else if ( (LA44_0==Executors||LA44_0==Commands||LA44_0==Default||LA44_0==Orbs) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalPipelineParser.g:1542:3: ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ )
                    {
                    // InternalPipelineParser.g:1542:3: ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ )
                    // InternalPipelineParser.g:1543:4: ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+
                    {
                    // InternalPipelineParser.g:1543:4: ( (lv_name_0_0= Parameters ) )
                    // InternalPipelineParser.g:1544:5: (lv_name_0_0= Parameters )
                    {
                    // InternalPipelineParser.g:1544:5: (lv_name_0_0= Parameters )
                    // InternalPipelineParser.g:1545:6: lv_name_0_0= Parameters
                    {
                    lv_name_0_0=(Token)match(input,Parameters,FOLLOW_39); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getPipelineParameterAccess().getNameParametersKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPipelineParameterRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_0, "parameters:");
                    					

                    }


                    }

                    // InternalPipelineParser.g:1557:4: ( (lv_parameterValues_1_0= ruleParameterValue ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        alt41 = dfa41.predict(input);
                        switch (alt41) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1558:5: (lv_parameterValues_1_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1558:5: (lv_parameterValues_1_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1559:6: lv_parameterValues_1_0= ruleParameterValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineParameterAccess().getParameterValuesParameterValueParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_46);
                    	    lv_parameterValues_1_0=ruleParameterValue();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPipelineParameterRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameterValues",
                    	    							lv_parameterValues_1_0,
                    	    							"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1578:3: ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) )
                    {
                    // InternalPipelineParser.g:1578:3: ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) )
                    // InternalPipelineParser.g:1579:4: ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END )
                    {
                    // InternalPipelineParser.g:1579:4: ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) )
                    // InternalPipelineParser.g:1580:5: ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) )
                    {
                    // InternalPipelineParser.g:1580:5: ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) )
                    // InternalPipelineParser.g:1581:6: (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands )
                    {
                    // InternalPipelineParser.g:1581:6: (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands )
                    int alt42=4;
                    switch ( input.LA(1) ) {
                    case Default:
                        {
                        alt42=1;
                        }
                        break;
                    case Executors:
                        {
                        alt42=2;
                        }
                        break;
                    case Orbs:
                        {
                        alt42=3;
                        }
                        break;
                    case Commands:
                        {
                        alt42=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }

                    switch (alt42) {
                        case 1 :
                            // InternalPipelineParser.g:1582:7: lv_name_2_1= Default
                            {
                            lv_name_2_1=(Token)match(input,Default,FOLLOW_5); 

                            							newLeafNode(lv_name_2_1, grammarAccess.getPipelineParameterAccess().getNameDefaultKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPipelineParameterRule());
                            							}
                            							setWithLastConsumed(current, "name", lv_name_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:1593:7: lv_name_2_2= Executors
                            {
                            lv_name_2_2=(Token)match(input,Executors,FOLLOW_5); 

                            							newLeafNode(lv_name_2_2, grammarAccess.getPipelineParameterAccess().getNameExecutorsKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPipelineParameterRule());
                            							}
                            							setWithLastConsumed(current, "name", lv_name_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalPipelineParser.g:1604:7: lv_name_2_3= Orbs
                            {
                            lv_name_2_3=(Token)match(input,Orbs,FOLLOW_5); 

                            							newLeafNode(lv_name_2_3, grammarAccess.getPipelineParameterAccess().getNameOrbsKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPipelineParameterRule());
                            							}
                            							setWithLastConsumed(current, "name", lv_name_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalPipelineParser.g:1615:7: lv_name_2_4= Commands
                            {
                            lv_name_2_4=(Token)match(input,Commands,FOLLOW_5); 

                            							newLeafNode(lv_name_2_4, grammarAccess.getPipelineParameterAccess().getNameCommandsKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPipelineParameterRule());
                            							}
                            							setWithLastConsumed(current, "name", lv_name_2_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalPipelineParser.g:1628:4: (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END )
                    // InternalPipelineParser.g:1629:5: this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getPipelineParameterAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:1633:5: ( (lv_parameterValues_4_0= ruleParameterValue ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==HyphenMinus||LA43_0==RULE_COMPLEX_EXPRESSION||LA43_0==RULE_ID) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1634:6: (lv_parameterValues_4_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1634:6: (lv_parameterValues_4_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1635:7: lv_parameterValues_4_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getPipelineParameterAccess().getParameterValuesParameterValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_parameterValues_4_0=ruleParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPipelineParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameterValues",
                    	    								lv_parameterValues_4_0,
                    	    								"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_5, grammarAccess.getPipelineParameterAccess().getENDTerminalRuleCall_1_1_2());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePipelineParameter"


    // $ANTLR start "entryRuleEvent"
    // InternalPipelineParser.g:1662:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalPipelineParser.g:1662:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalPipelineParser.g:1663:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalPipelineParser.g:1669:1: ruleEvent returns [EObject current=null] : ( ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) ) ) this_END_68= RULE_END )? ) | ( ( ( ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) ) ) ( (lv_triggerSchedules_70_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )* ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token otherlv_10=null;
        Token lv_batch_11_0=null;
        Token otherlv_12=null;
        Token lv_autoCancel_13_0=null;
        Token otherlv_14=null;
        Token lv_drafts_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token this_BEGIN_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token this_END_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token this_BEGIN_37=null;
        Token this_END_39=null;
        Token otherlv_40=null;
        Token this_BEGIN_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token this_END_48=null;
        Token otherlv_49=null;
        Token this_BEGIN_51=null;
        Token this_END_53=null;
        Token otherlv_54=null;
        Token this_BEGIN_56=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token this_END_62=null;
        Token otherlv_63=null;
        Token this_BEGIN_65=null;
        Token this_END_67=null;
        Token this_END_68=null;
        Token lv_name_69_1=null;
        Token lv_name_69_2=null;
        Token lv_name_71_1=null;
        Token lv_name_71_2=null;
        Token lv_name_71_3=null;
        EObject lv_includedBranches_2_0 = null;

        EObject lv_activities_5_0 = null;

        EObject lv_activities_7_0 = null;

        EObject lv_includedBranches_17_0 = null;

        EObject lv_includedBranches_19_0 = null;

        EObject lv_includedBranches_21_0 = null;

        EObject lv_includedBranches_24_0 = null;

        EObject lv_includedBranches_26_0 = null;

        EObject lv_excludedBranches_28_0 = null;

        EObject lv_excludedBranches_31_0 = null;

        EObject lv_excludedBranches_33_0 = null;

        EObject lv_excludedBranches_35_0 = null;

        EObject lv_excludedBranches_38_0 = null;

        AntlrDatatypeRuleToken lv_includedPaths_41_0 = null;

        AntlrDatatypeRuleToken lv_includedPaths_43_0 = null;

        AntlrDatatypeRuleToken lv_includedPaths_45_0 = null;

        AntlrDatatypeRuleToken lv_excludedPaths_47_0 = null;

        AntlrDatatypeRuleToken lv_excludedPaths_50_0 = null;

        AntlrDatatypeRuleToken lv_excludedPaths_52_0 = null;

        AntlrDatatypeRuleToken lv_includedTags_55_0 = null;

        AntlrDatatypeRuleToken lv_includedTags_57_0 = null;

        AntlrDatatypeRuleToken lv_includedTags_59_0 = null;

        AntlrDatatypeRuleToken lv_excludedTags_61_0 = null;

        AntlrDatatypeRuleToken lv_excludedTags_64_0 = null;

        AntlrDatatypeRuleToken lv_excludedTags_66_0 = null;

        EObject lv_triggerSchedules_70_0 = null;

        EObject lv_otherEventParameterValues_72_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1675:2: ( ( ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) ) ) this_END_68= RULE_END )? ) | ( ( ( ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) ) ) ( (lv_triggerSchedules_70_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )* ) ) ) )
            // InternalPipelineParser.g:1676:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) ) ) this_END_68= RULE_END )? ) | ( ( ( ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) ) ) ( (lv_triggerSchedules_70_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )* ) ) )
            {
            // InternalPipelineParser.g:1676:2: ( ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) ) ) this_END_68= RULE_END )? ) | ( ( ( ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) ) ) ( (lv_triggerSchedules_70_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )* ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            else if ( (LA79_0==Workflow_dispatch||LA79_0==Workflow_call||LA79_0==Workflow_run||LA79_0==Schedules||LA79_0==Schedule) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalPipelineParser.g:1677:3: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) ) ) this_END_68= RULE_END )? )
                    {
                    // InternalPipelineParser.g:1677:3: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) ) ) this_END_68= RULE_END )? )
                    // InternalPipelineParser.g:1678:4: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? ) ( (lv_includedBranches_2_0= ruleBranch ) )* (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) ) ) this_END_68= RULE_END )?
                    {
                    // InternalPipelineParser.g:1678:4: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )? )
                    // InternalPipelineParser.g:1679:5: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= Colon )?
                    {
                    // InternalPipelineParser.g:1679:5: ( (lv_name_0_0= RULE_ID ) )
                    // InternalPipelineParser.g:1680:6: (lv_name_0_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:1680:6: (lv_name_0_0= RULE_ID )
                    // InternalPipelineParser.g:1681:7: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_47); 

                    							newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEventRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_0_0,
                    								"ca.mcgill.devops.pipeline.Pipeline.ID");
                    						

                    }


                    }

                    // InternalPipelineParser.g:1697:5: (otherlv_1= Colon )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==Colon) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalPipelineParser.g:1698:6: otherlv_1= Colon
                            {
                            otherlv_1=(Token)match(input,Colon,FOLLOW_48); 

                            						newLeafNode(otherlv_1, grammarAccess.getEventAccess().getColonKeyword_0_0_1());
                            					

                            }
                            break;

                    }


                    }

                    // InternalPipelineParser.g:1704:4: ( (lv_includedBranches_2_0= ruleBranch ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==HyphenMinus||LA46_0==RULE_ID||LA46_0==RULE_STRING) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1705:5: (lv_includedBranches_2_0= ruleBranch )
                    	    {
                    	    // InternalPipelineParser.g:1705:5: (lv_includedBranches_2_0= ruleBranch )
                    	    // InternalPipelineParser.g:1706:6: lv_includedBranches_2_0= ruleBranch
                    	    {

                    	    						newCompositeNode(grammarAccess.getEventAccess().getIncludedBranchesBranchParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_48);
                    	    lv_includedBranches_2_0=ruleBranch();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEventRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"includedBranches",
                    	    							lv_includedBranches_2_0,
                    	    							"ca.mcgill.devops.pipeline.Pipeline.Branch");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    // InternalPipelineParser.g:1723:4: (this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) ) ) this_END_68= RULE_END )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_BEGIN) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalPipelineParser.g:1724:5: this_BEGIN_3= RULE_BEGIN ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) ) ) this_END_68= RULE_END
                            {
                            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

                            					newLeafNode(this_BEGIN_3, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_0());
                            				
                            // InternalPipelineParser.g:1728:5: ( (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) ) | (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END ) )?
                            int alt47=3;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==Types) ) {
                                alt47=1;
                            }
                            else if ( (LA47_0==RULE_BEGIN) ) {
                                alt47=2;
                            }
                            switch (alt47) {
                                case 1 :
                                    // InternalPipelineParser.g:1729:6: (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) )
                                    {
                                    // InternalPipelineParser.g:1729:6: (otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) ) )
                                    // InternalPipelineParser.g:1730:7: otherlv_4= Types ( (lv_activities_5_0= ruleActivity ) )
                                    {
                                    otherlv_4=(Token)match(input,Types,FOLLOW_50); 

                                    							newLeafNode(otherlv_4, grammarAccess.getEventAccess().getTypesKeyword_0_2_1_0_0());
                                    						
                                    // InternalPipelineParser.g:1734:7: ( (lv_activities_5_0= ruleActivity ) )
                                    // InternalPipelineParser.g:1735:8: (lv_activities_5_0= ruleActivity )
                                    {
                                    // InternalPipelineParser.g:1735:8: (lv_activities_5_0= ruleActivity )
                                    // InternalPipelineParser.g:1736:9: lv_activities_5_0= ruleActivity
                                    {

                                    									newCompositeNode(grammarAccess.getEventAccess().getActivitiesActivityParserRuleCall_0_2_1_0_1_0());
                                    								
                                    pushFollow(FOLLOW_51);
                                    lv_activities_5_0=ruleActivity();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getEventRule());
                                    									}
                                    									add(
                                    										current,
                                    										"activities",
                                    										lv_activities_5_0,
                                    										"ca.mcgill.devops.pipeline.Pipeline.Activity");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalPipelineParser.g:1755:6: (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END )
                                    {
                                    // InternalPipelineParser.g:1755:6: (this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END )
                                    // InternalPipelineParser.g:1756:7: this_BEGIN_6= RULE_BEGIN ( (lv_activities_7_0= ruleActivity ) ) this_END_8= RULE_END
                                    {
                                    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

                                    							newLeafNode(this_BEGIN_6, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_1_1_0());
                                    						
                                    // InternalPipelineParser.g:1760:7: ( (lv_activities_7_0= ruleActivity ) )
                                    // InternalPipelineParser.g:1761:8: (lv_activities_7_0= ruleActivity )
                                    {
                                    // InternalPipelineParser.g:1761:8: (lv_activities_7_0= ruleActivity )
                                    // InternalPipelineParser.g:1762:9: lv_activities_7_0= ruleActivity
                                    {

                                    									newCompositeNode(grammarAccess.getEventAccess().getActivitiesActivityParserRuleCall_0_2_1_1_1_0());
                                    								
                                    pushFollow(FOLLOW_9);
                                    lv_activities_7_0=ruleActivity();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getEventRule());
                                    									}
                                    									add(
                                    										current,
                                    										"activities",
                                    										lv_activities_7_0,
                                    										"ca.mcgill.devops.pipeline.Pipeline.Activity");
                                    									afterParserOrEnumRuleCall();
                                    								

                                    }


                                    }

                                    this_END_8=(Token)match(input,RULE_END,FOLLOW_51); 

                                    							newLeafNode(this_END_8, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_1_1_2());
                                    						

                                    }


                                    }
                                    break;

                            }

                            // InternalPipelineParser.g:1785:5: ( ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) ) )
                            // InternalPipelineParser.g:1786:6: ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) )
                            {
                            // InternalPipelineParser.g:1786:6: ( ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* ) )
                            // InternalPipelineParser.g:1787:7: ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* )
                            {
                             
                            						  getUnorderedGroupHelper().enter(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            						
                            // InternalPipelineParser.g:1790:7: ( ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )* )
                            // InternalPipelineParser.g:1791:8: ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )*
                            {
                            // InternalPipelineParser.g:1791:8: ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )*
                            loop72:
                            do {
                                int alt72=10;
                                alt72 = dfa72.predict(input);
                                switch (alt72) {
                            	case 1 :
                            	    // InternalPipelineParser.g:1792:6: ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1792:6: ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) )
                            	    // InternalPipelineParser.g:1793:7: {...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 0) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 0)");
                            	    }
                            	    // InternalPipelineParser.g:1793:108: ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) )
                            	    // InternalPipelineParser.g:1794:8: ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 0);
                            	    							
                            	    // InternalPipelineParser.g:1797:11: ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) )
                            	    // InternalPipelineParser.g:1797:12: {...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1797:21: (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) )
                            	    // InternalPipelineParser.g:1797:22: otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) )
                            	    {
                            	    otherlv_10=(Token)match(input,Batch,FOLLOW_3); 

                            	    											newLeafNode(otherlv_10, grammarAccess.getEventAccess().getBatchKeyword_0_2_2_0_0());
                            	    										
                            	    // InternalPipelineParser.g:1801:11: ( (lv_batch_11_0= RULE_ID ) )
                            	    // InternalPipelineParser.g:1802:12: (lv_batch_11_0= RULE_ID )
                            	    {
                            	    // InternalPipelineParser.g:1802:12: (lv_batch_11_0= RULE_ID )
                            	    // InternalPipelineParser.g:1803:13: lv_batch_11_0= RULE_ID
                            	    {
                            	    lv_batch_11_0=(Token)match(input,RULE_ID,FOLLOW_51); 

                            	    													newLeafNode(lv_batch_11_0, grammarAccess.getEventAccess().getBatchIDTerminalRuleCall_0_2_2_0_1_0());
                            	    												

                            	    													if (current==null) {
                            	    														current = createModelElement(grammarAccess.getEventRule());
                            	    													}
                            	    													setWithLastConsumed(
                            	    														current,
                            	    														"batch",
                            	    														lv_batch_11_0,
                            	    														"ca.mcgill.devops.pipeline.Pipeline.ID");
                            	    												

                            	    }


                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 2 :
                            	    // InternalPipelineParser.g:1825:6: ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1825:6: ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) )
                            	    // InternalPipelineParser.g:1826:7: {...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 1) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 1)");
                            	    }
                            	    // InternalPipelineParser.g:1826:108: ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) )
                            	    // InternalPipelineParser.g:1827:8: ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 1);
                            	    							
                            	    // InternalPipelineParser.g:1830:11: ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) )
                            	    // InternalPipelineParser.g:1830:12: {...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1830:21: (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) )
                            	    // InternalPipelineParser.g:1830:22: otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) )
                            	    {
                            	    otherlv_12=(Token)match(input,AutoCancel,FOLLOW_3); 

                            	    											newLeafNode(otherlv_12, grammarAccess.getEventAccess().getAutoCancelKeyword_0_2_2_1_0());
                            	    										
                            	    // InternalPipelineParser.g:1834:11: ( (lv_autoCancel_13_0= RULE_ID ) )
                            	    // InternalPipelineParser.g:1835:12: (lv_autoCancel_13_0= RULE_ID )
                            	    {
                            	    // InternalPipelineParser.g:1835:12: (lv_autoCancel_13_0= RULE_ID )
                            	    // InternalPipelineParser.g:1836:13: lv_autoCancel_13_0= RULE_ID
                            	    {
                            	    lv_autoCancel_13_0=(Token)match(input,RULE_ID,FOLLOW_51); 

                            	    													newLeafNode(lv_autoCancel_13_0, grammarAccess.getEventAccess().getAutoCancelIDTerminalRuleCall_0_2_2_1_1_0());
                            	    												

                            	    													if (current==null) {
                            	    														current = createModelElement(grammarAccess.getEventRule());
                            	    													}
                            	    													setWithLastConsumed(
                            	    														current,
                            	    														"autoCancel",
                            	    														lv_autoCancel_13_0,
                            	    														"ca.mcgill.devops.pipeline.Pipeline.ID");
                            	    												

                            	    }


                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 3 :
                            	    // InternalPipelineParser.g:1858:6: ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1858:6: ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) )
                            	    // InternalPipelineParser.g:1859:7: {...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 2) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 2)");
                            	    }
                            	    // InternalPipelineParser.g:1859:108: ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) )
                            	    // InternalPipelineParser.g:1860:8: ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 2);
                            	    							
                            	    // InternalPipelineParser.g:1863:11: ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) )
                            	    // InternalPipelineParser.g:1863:12: {...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1863:21: (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) )
                            	    // InternalPipelineParser.g:1863:22: otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) )
                            	    {
                            	    otherlv_14=(Token)match(input,Drafts,FOLLOW_3); 

                            	    											newLeafNode(otherlv_14, grammarAccess.getEventAccess().getDraftsKeyword_0_2_2_2_0());
                            	    										
                            	    // InternalPipelineParser.g:1867:11: ( (lv_drafts_15_0= RULE_ID ) )
                            	    // InternalPipelineParser.g:1868:12: (lv_drafts_15_0= RULE_ID )
                            	    {
                            	    // InternalPipelineParser.g:1868:12: (lv_drafts_15_0= RULE_ID )
                            	    // InternalPipelineParser.g:1869:13: lv_drafts_15_0= RULE_ID
                            	    {
                            	    lv_drafts_15_0=(Token)match(input,RULE_ID,FOLLOW_51); 

                            	    													newLeafNode(lv_drafts_15_0, grammarAccess.getEventAccess().getDraftsIDTerminalRuleCall_0_2_2_2_1_0());
                            	    												

                            	    													if (current==null) {
                            	    														current = createModelElement(grammarAccess.getEventRule());
                            	    													}
                            	    													setWithLastConsumed(
                            	    														current,
                            	    														"drafts",
                            	    														lv_drafts_15_0,
                            	    														"ca.mcgill.devops.pipeline.Pipeline.ID");
                            	    												

                            	    }


                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 4 :
                            	    // InternalPipelineParser.g:1891:6: ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:1891:6: ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) )
                            	    // InternalPipelineParser.g:1892:7: {...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 3) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 3)");
                            	    }
                            	    // InternalPipelineParser.g:1892:108: ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:1893:8: ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 3);
                            	    							
                            	    // InternalPipelineParser.g:1896:11: ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:1896:12: {...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:1896:21: (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) )
                            	    // InternalPipelineParser.g:1896:22: otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) )
                            	    {
                            	    otherlv_16=(Token)match(input,Branches,FOLLOW_52); 

                            	    											newLeafNode(otherlv_16, grammarAccess.getEventAccess().getBranchesKeyword_0_2_2_3_0());
                            	    										
                            	    // InternalPipelineParser.g:1900:11: ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) )
                            	    int alt56=2;
                            	    int LA56_0 = input.LA(1);

                            	    if ( (LA56_0==BranchesIgnore||LA56_0==PathsIgnore||(LA56_0>=TagsIgnore && LA56_0<=AutoCancel)||LA56_0==Branches||LA56_0==Drafts||LA56_0==Batch||LA56_0==Paths||LA56_0==Tags||LA56_0==HyphenMinus||LA56_0==LeftSquareBracket||(LA56_0>=RULE_END && LA56_0<=RULE_ID)||LA56_0==RULE_STRING) ) {
                            	        alt56=1;
                            	    }
                            	    else if ( (LA56_0==RULE_BEGIN) ) {
                            	        alt56=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 56, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt56) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:1901:12: ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) )
                            	            {
                            	            // InternalPipelineParser.g:1901:12: ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) )
                            	            int alt50=2;
                            	            int LA50_0 = input.LA(1);

                            	            if ( (LA50_0==BranchesIgnore||LA50_0==PathsIgnore||(LA50_0>=TagsIgnore && LA50_0<=AutoCancel)||LA50_0==Branches||LA50_0==Drafts||LA50_0==Batch||LA50_0==Paths||LA50_0==Tags||LA50_0==HyphenMinus||(LA50_0>=RULE_END && LA50_0<=RULE_ID)||LA50_0==RULE_STRING) ) {
                            	                alt50=1;
                            	            }
                            	            else if ( (LA50_0==LeftSquareBracket) ) {
                            	                alt50=2;
                            	            }
                            	            else {
                            	                NoViableAltException nvae =
                            	                    new NoViableAltException("", 50, 0, input);

                            	                throw nvae;
                            	            }
                            	            switch (alt50) {
                            	                case 1 :
                            	                    // InternalPipelineParser.g:1902:13: ( (lv_includedBranches_17_0= ruleBranch ) )*
                            	                    {
                            	                    // InternalPipelineParser.g:1902:13: ( (lv_includedBranches_17_0= ruleBranch ) )*
                            	                    loop48:
                            	                    do {
                            	                        int alt48=2;
                            	                        int LA48_0 = input.LA(1);

                            	                        if ( (LA48_0==HyphenMinus||LA48_0==RULE_ID||LA48_0==RULE_STRING) ) {
                            	                            alt48=1;
                            	                        }


                            	                        switch (alt48) {
                            	                    	case 1 :
                            	                    	    // InternalPipelineParser.g:1903:14: (lv_includedBranches_17_0= ruleBranch )
                            	                    	    {
                            	                    	    // InternalPipelineParser.g:1903:14: (lv_includedBranches_17_0= ruleBranch )
                            	                    	    // InternalPipelineParser.g:1904:15: lv_includedBranches_17_0= ruleBranch
                            	                    	    {

                            	                    	    															newCompositeNode(grammarAccess.getEventAccess().getIncludedBranchesBranchParserRuleCall_0_2_2_3_1_0_0_0());
                            	                    	    														
                            	                    	    pushFollow(FOLLOW_53);
                            	                    	    lv_includedBranches_17_0=ruleBranch();

                            	                    	    state._fsp--;


                            	                    	    															if (current==null) {
                            	                    	    																current = createModelElementForParent(grammarAccess.getEventRule());
                            	                    	    															}
                            	                    	    															add(
                            	                    	    																current,
                            	                    	    																"includedBranches",
                            	                    	    																lv_includedBranches_17_0,
                            	                    	    																"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	                    	    															afterParserOrEnumRuleCall();
                            	                    	    														

                            	                    	    }


                            	                    	    }
                            	                    	    break;

                            	                    	default :
                            	                    	    break loop48;
                            	                        }
                            	                    } while (true);


                            	                    }
                            	                    break;
                            	                case 2 :
                            	                    // InternalPipelineParser.g:1922:13: (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket )
                            	                    {
                            	                    // InternalPipelineParser.g:1922:13: (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket )
                            	                    // InternalPipelineParser.g:1923:14: otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket
                            	                    {
                            	                    otherlv_18=(Token)match(input,LeftSquareBracket,FOLLOW_54); 

                            	                    														newLeafNode(otherlv_18, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_0_2_2_3_1_0_1_0());
                            	                    													
                            	                    // InternalPipelineParser.g:1927:14: ( (lv_includedBranches_19_0= ruleBranch ) )
                            	                    // InternalPipelineParser.g:1928:15: (lv_includedBranches_19_0= ruleBranch )
                            	                    {
                            	                    // InternalPipelineParser.g:1928:15: (lv_includedBranches_19_0= ruleBranch )
                            	                    // InternalPipelineParser.g:1929:16: lv_includedBranches_19_0= ruleBranch
                            	                    {

                            	                    																newCompositeNode(grammarAccess.getEventAccess().getIncludedBranchesBranchParserRuleCall_0_2_2_3_1_0_1_1_0());
                            	                    															
                            	                    pushFollow(FOLLOW_32);
                            	                    lv_includedBranches_19_0=ruleBranch();

                            	                    state._fsp--;


                            	                    																if (current==null) {
                            	                    																	current = createModelElementForParent(grammarAccess.getEventRule());
                            	                    																}
                            	                    																add(
                            	                    																	current,
                            	                    																	"includedBranches",
                            	                    																	lv_includedBranches_19_0,
                            	                    																	"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	                    																afterParserOrEnumRuleCall();
                            	                    															

                            	                    }


                            	                    }

                            	                    // InternalPipelineParser.g:1946:14: (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )*
                            	                    loop49:
                            	                    do {
                            	                        int alt49=2;
                            	                        int LA49_0 = input.LA(1);

                            	                        if ( (LA49_0==Comma) ) {
                            	                            alt49=1;
                            	                        }


                            	                        switch (alt49) {
                            	                    	case 1 :
                            	                    	    // InternalPipelineParser.g:1947:15: otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) )
                            	                    	    {
                            	                    	    otherlv_20=(Token)match(input,Comma,FOLLOW_54); 

                            	                    	    															newLeafNode(otherlv_20, grammarAccess.getEventAccess().getCommaKeyword_0_2_2_3_1_0_1_2_0());
                            	                    	    														
                            	                    	    // InternalPipelineParser.g:1951:15: ( (lv_includedBranches_21_0= ruleBranch ) )
                            	                    	    // InternalPipelineParser.g:1952:16: (lv_includedBranches_21_0= ruleBranch )
                            	                    	    {
                            	                    	    // InternalPipelineParser.g:1952:16: (lv_includedBranches_21_0= ruleBranch )
                            	                    	    // InternalPipelineParser.g:1953:17: lv_includedBranches_21_0= ruleBranch
                            	                    	    {

                            	                    	    																	newCompositeNode(grammarAccess.getEventAccess().getIncludedBranchesBranchParserRuleCall_0_2_2_3_1_0_1_2_1_0());
                            	                    	    																
                            	                    	    pushFollow(FOLLOW_32);
                            	                    	    lv_includedBranches_21_0=ruleBranch();

                            	                    	    state._fsp--;


                            	                    	    																	if (current==null) {
                            	                    	    																		current = createModelElementForParent(grammarAccess.getEventRule());
                            	                    	    																	}
                            	                    	    																	add(
                            	                    	    																		current,
                            	                    	    																		"includedBranches",
                            	                    	    																		lv_includedBranches_21_0,
                            	                    	    																		"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	                    	    																	afterParserOrEnumRuleCall();
                            	                    	    																

                            	                    	    }


                            	                    	    }


                            	                    	    }
                            	                    	    break;

                            	                    	default :
                            	                    	    break loop49;
                            	                        }
                            	                    } while (true);

                            	                    otherlv_22=(Token)match(input,RightSquareBracket,FOLLOW_51); 

                            	                    														newLeafNode(otherlv_22, grammarAccess.getEventAccess().getRightSquareBracketKeyword_0_2_2_3_1_0_1_3());
                            	                    													

                            	                    }


                            	                    }
                            	                    break;

                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalPipelineParser.g:1978:12: (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END )
                            	            {
                            	            // InternalPipelineParser.g:1978:12: (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END )
                            	            // InternalPipelineParser.g:1979:13: this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END
                            	            {
                            	            this_BEGIN_23=(Token)match(input,RULE_BEGIN,FOLLOW_55); 

                            	            													newLeafNode(this_BEGIN_23, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_3_1_1_0());
                            	            												
                            	            // InternalPipelineParser.g:1983:13: ( (lv_includedBranches_24_0= ruleBranch ) )*
                            	            loop51:
                            	            do {
                            	                int alt51=2;
                            	                int LA51_0 = input.LA(1);

                            	                if ( (LA51_0==HyphenMinus||LA51_0==RULE_ID||LA51_0==RULE_STRING) ) {
                            	                    alt51=1;
                            	                }


                            	                switch (alt51) {
                            	            	case 1 :
                            	            	    // InternalPipelineParser.g:1984:14: (lv_includedBranches_24_0= ruleBranch )
                            	            	    {
                            	            	    // InternalPipelineParser.g:1984:14: (lv_includedBranches_24_0= ruleBranch )
                            	            	    // InternalPipelineParser.g:1985:15: lv_includedBranches_24_0= ruleBranch
                            	            	    {

                            	            	    															newCompositeNode(grammarAccess.getEventAccess().getIncludedBranchesBranchParserRuleCall_0_2_2_3_1_1_1_0());
                            	            	    														
                            	            	    pushFollow(FOLLOW_55);
                            	            	    lv_includedBranches_24_0=ruleBranch();

                            	            	    state._fsp--;


                            	            	    															if (current==null) {
                            	            	    																current = createModelElementForParent(grammarAccess.getEventRule());
                            	            	    															}
                            	            	    															add(
                            	            	    																current,
                            	            	    																"includedBranches",
                            	            	    																lv_includedBranches_24_0,
                            	            	    																"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	            	    															afterParserOrEnumRuleCall();
                            	            	    														

                            	            	    }


                            	            	    }
                            	            	    break;

                            	            	default :
                            	            	    break loop51;
                            	                }
                            	            } while (true);

                            	            // InternalPipelineParser.g:2002:13: (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )?
                            	            int alt53=2;
                            	            int LA53_0 = input.LA(1);

                            	            if ( (LA53_0==Include) ) {
                            	                alt53=1;
                            	            }
                            	            switch (alt53) {
                            	                case 1 :
                            	                    // InternalPipelineParser.g:2003:14: otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )*
                            	                    {
                            	                    otherlv_25=(Token)match(input,Include,FOLLOW_56); 

                            	                    														newLeafNode(otherlv_25, grammarAccess.getEventAccess().getIncludeKeyword_0_2_2_3_1_1_2_0());
                            	                    													
                            	                    // InternalPipelineParser.g:2007:14: ( (lv_includedBranches_26_0= ruleBranch ) )*
                            	                    loop52:
                            	                    do {
                            	                        int alt52=2;
                            	                        int LA52_0 = input.LA(1);

                            	                        if ( (LA52_0==HyphenMinus||LA52_0==RULE_ID||LA52_0==RULE_STRING) ) {
                            	                            alt52=1;
                            	                        }


                            	                        switch (alt52) {
                            	                    	case 1 :
                            	                    	    // InternalPipelineParser.g:2008:15: (lv_includedBranches_26_0= ruleBranch )
                            	                    	    {
                            	                    	    // InternalPipelineParser.g:2008:15: (lv_includedBranches_26_0= ruleBranch )
                            	                    	    // InternalPipelineParser.g:2009:16: lv_includedBranches_26_0= ruleBranch
                            	                    	    {

                            	                    	    																newCompositeNode(grammarAccess.getEventAccess().getIncludedBranchesBranchParserRuleCall_0_2_2_3_1_1_2_1_0());
                            	                    	    															
                            	                    	    pushFollow(FOLLOW_56);
                            	                    	    lv_includedBranches_26_0=ruleBranch();

                            	                    	    state._fsp--;


                            	                    	    																if (current==null) {
                            	                    	    																	current = createModelElementForParent(grammarAccess.getEventRule());
                            	                    	    																}
                            	                    	    																add(
                            	                    	    																	current,
                            	                    	    																	"includedBranches",
                            	                    	    																	lv_includedBranches_26_0,
                            	                    	    																	"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	                    	    																afterParserOrEnumRuleCall();
                            	                    	    															

                            	                    	    }


                            	                    	    }
                            	                    	    break;

                            	                    	default :
                            	                    	    break loop52;
                            	                        }
                            	                    } while (true);


                            	                    }
                            	                    break;

                            	            }

                            	            // InternalPipelineParser.g:2027:13: (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )?
                            	            int alt55=2;
                            	            int LA55_0 = input.LA(1);

                            	            if ( (LA55_0==Exclude) ) {
                            	                alt55=1;
                            	            }
                            	            switch (alt55) {
                            	                case 1 :
                            	                    // InternalPipelineParser.g:2028:14: otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )*
                            	                    {
                            	                    otherlv_27=(Token)match(input,Exclude,FOLLOW_34); 

                            	                    														newLeafNode(otherlv_27, grammarAccess.getEventAccess().getExcludeKeyword_0_2_2_3_1_1_3_0());
                            	                    													
                            	                    // InternalPipelineParser.g:2032:14: ( (lv_excludedBranches_28_0= ruleBranch ) )*
                            	                    loop54:
                            	                    do {
                            	                        int alt54=2;
                            	                        int LA54_0 = input.LA(1);

                            	                        if ( (LA54_0==HyphenMinus||LA54_0==RULE_ID||LA54_0==RULE_STRING) ) {
                            	                            alt54=1;
                            	                        }


                            	                        switch (alt54) {
                            	                    	case 1 :
                            	                    	    // InternalPipelineParser.g:2033:15: (lv_excludedBranches_28_0= ruleBranch )
                            	                    	    {
                            	                    	    // InternalPipelineParser.g:2033:15: (lv_excludedBranches_28_0= ruleBranch )
                            	                    	    // InternalPipelineParser.g:2034:16: lv_excludedBranches_28_0= ruleBranch
                            	                    	    {

                            	                    	    																newCompositeNode(grammarAccess.getEventAccess().getExcludedBranchesBranchParserRuleCall_0_2_2_3_1_1_3_1_0());
                            	                    	    															
                            	                    	    pushFollow(FOLLOW_34);
                            	                    	    lv_excludedBranches_28_0=ruleBranch();

                            	                    	    state._fsp--;


                            	                    	    																if (current==null) {
                            	                    	    																	current = createModelElementForParent(grammarAccess.getEventRule());
                            	                    	    																}
                            	                    	    																add(
                            	                    	    																	current,
                            	                    	    																	"excludedBranches",
                            	                    	    																	lv_excludedBranches_28_0,
                            	                    	    																	"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	                    	    																afterParserOrEnumRuleCall();
                            	                    	    															

                            	                    	    }


                            	                    	    }
                            	                    	    break;

                            	                    	default :
                            	                    	    break loop54;
                            	                        }
                            	                    } while (true);


                            	                    }
                            	                    break;

                            	            }

                            	            this_END_29=(Token)match(input,RULE_END,FOLLOW_51); 

                            	            													newLeafNode(this_END_29, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_3_1_1_4());
                            	            												

                            	            }


                            	            }
                            	            break;

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 5 :
                            	    // InternalPipelineParser.g:2064:6: ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:2064:6: ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) )
                            	    // InternalPipelineParser.g:2065:7: {...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 4) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 4)");
                            	    }
                            	    // InternalPipelineParser.g:2065:108: ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:2066:8: ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 4);
                            	    							
                            	    // InternalPipelineParser.g:2069:11: ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:2069:12: {...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:2069:21: (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) )
                            	    // InternalPipelineParser.g:2069:22: otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) )
                            	    {
                            	    otherlv_30=(Token)match(input,BranchesIgnore,FOLLOW_52); 

                            	    											newLeafNode(otherlv_30, grammarAccess.getEventAccess().getBranchesIgnoreKeyword_0_2_2_4_0());
                            	    										
                            	    // InternalPipelineParser.g:2073:11: ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) )
                            	    int alt61=2;
                            	    int LA61_0 = input.LA(1);

                            	    if ( (LA61_0==BranchesIgnore||LA61_0==PathsIgnore||(LA61_0>=TagsIgnore && LA61_0<=AutoCancel)||LA61_0==Branches||LA61_0==Drafts||LA61_0==Batch||LA61_0==Paths||LA61_0==Tags||LA61_0==HyphenMinus||LA61_0==LeftSquareBracket||(LA61_0>=RULE_END && LA61_0<=RULE_ID)||LA61_0==RULE_STRING) ) {
                            	        alt61=1;
                            	    }
                            	    else if ( (LA61_0==RULE_BEGIN) ) {
                            	        alt61=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 61, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt61) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2074:12: ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) )
                            	            {
                            	            // InternalPipelineParser.g:2074:12: ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) )
                            	            int alt59=2;
                            	            int LA59_0 = input.LA(1);

                            	            if ( (LA59_0==BranchesIgnore||LA59_0==PathsIgnore||(LA59_0>=TagsIgnore && LA59_0<=AutoCancel)||LA59_0==Branches||LA59_0==Drafts||LA59_0==Batch||LA59_0==Paths||LA59_0==Tags||LA59_0==HyphenMinus||(LA59_0>=RULE_END && LA59_0<=RULE_ID)||LA59_0==RULE_STRING) ) {
                            	                alt59=1;
                            	            }
                            	            else if ( (LA59_0==LeftSquareBracket) ) {
                            	                alt59=2;
                            	            }
                            	            else {
                            	                NoViableAltException nvae =
                            	                    new NoViableAltException("", 59, 0, input);

                            	                throw nvae;
                            	            }
                            	            switch (alt59) {
                            	                case 1 :
                            	                    // InternalPipelineParser.g:2075:13: ( (lv_excludedBranches_31_0= ruleBranch ) )*
                            	                    {
                            	                    // InternalPipelineParser.g:2075:13: ( (lv_excludedBranches_31_0= ruleBranch ) )*
                            	                    loop57:
                            	                    do {
                            	                        int alt57=2;
                            	                        int LA57_0 = input.LA(1);

                            	                        if ( (LA57_0==HyphenMinus||LA57_0==RULE_ID||LA57_0==RULE_STRING) ) {
                            	                            alt57=1;
                            	                        }


                            	                        switch (alt57) {
                            	                    	case 1 :
                            	                    	    // InternalPipelineParser.g:2076:14: (lv_excludedBranches_31_0= ruleBranch )
                            	                    	    {
                            	                    	    // InternalPipelineParser.g:2076:14: (lv_excludedBranches_31_0= ruleBranch )
                            	                    	    // InternalPipelineParser.g:2077:15: lv_excludedBranches_31_0= ruleBranch
                            	                    	    {

                            	                    	    															newCompositeNode(grammarAccess.getEventAccess().getExcludedBranchesBranchParserRuleCall_0_2_2_4_1_0_0_0());
                            	                    	    														
                            	                    	    pushFollow(FOLLOW_53);
                            	                    	    lv_excludedBranches_31_0=ruleBranch();

                            	                    	    state._fsp--;


                            	                    	    															if (current==null) {
                            	                    	    																current = createModelElementForParent(grammarAccess.getEventRule());
                            	                    	    															}
                            	                    	    															add(
                            	                    	    																current,
                            	                    	    																"excludedBranches",
                            	                    	    																lv_excludedBranches_31_0,
                            	                    	    																"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	                    	    															afterParserOrEnumRuleCall();
                            	                    	    														

                            	                    	    }


                            	                    	    }
                            	                    	    break;

                            	                    	default :
                            	                    	    break loop57;
                            	                        }
                            	                    } while (true);


                            	                    }
                            	                    break;
                            	                case 2 :
                            	                    // InternalPipelineParser.g:2095:13: (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket )
                            	                    {
                            	                    // InternalPipelineParser.g:2095:13: (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket )
                            	                    // InternalPipelineParser.g:2096:14: otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket
                            	                    {
                            	                    otherlv_32=(Token)match(input,LeftSquareBracket,FOLLOW_54); 

                            	                    														newLeafNode(otherlv_32, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_0_2_2_4_1_0_1_0());
                            	                    													
                            	                    // InternalPipelineParser.g:2100:14: ( (lv_excludedBranches_33_0= ruleBranch ) )
                            	                    // InternalPipelineParser.g:2101:15: (lv_excludedBranches_33_0= ruleBranch )
                            	                    {
                            	                    // InternalPipelineParser.g:2101:15: (lv_excludedBranches_33_0= ruleBranch )
                            	                    // InternalPipelineParser.g:2102:16: lv_excludedBranches_33_0= ruleBranch
                            	                    {

                            	                    																newCompositeNode(grammarAccess.getEventAccess().getExcludedBranchesBranchParserRuleCall_0_2_2_4_1_0_1_1_0());
                            	                    															
                            	                    pushFollow(FOLLOW_32);
                            	                    lv_excludedBranches_33_0=ruleBranch();

                            	                    state._fsp--;


                            	                    																if (current==null) {
                            	                    																	current = createModelElementForParent(grammarAccess.getEventRule());
                            	                    																}
                            	                    																add(
                            	                    																	current,
                            	                    																	"excludedBranches",
                            	                    																	lv_excludedBranches_33_0,
                            	                    																	"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	                    																afterParserOrEnumRuleCall();
                            	                    															

                            	                    }


                            	                    }

                            	                    // InternalPipelineParser.g:2119:14: (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )*
                            	                    loop58:
                            	                    do {
                            	                        int alt58=2;
                            	                        int LA58_0 = input.LA(1);

                            	                        if ( (LA58_0==Comma) ) {
                            	                            alt58=1;
                            	                        }


                            	                        switch (alt58) {
                            	                    	case 1 :
                            	                    	    // InternalPipelineParser.g:2120:15: otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) )
                            	                    	    {
                            	                    	    otherlv_34=(Token)match(input,Comma,FOLLOW_54); 

                            	                    	    															newLeafNode(otherlv_34, grammarAccess.getEventAccess().getCommaKeyword_0_2_2_4_1_0_1_2_0());
                            	                    	    														
                            	                    	    // InternalPipelineParser.g:2124:15: ( (lv_excludedBranches_35_0= ruleBranch ) )
                            	                    	    // InternalPipelineParser.g:2125:16: (lv_excludedBranches_35_0= ruleBranch )
                            	                    	    {
                            	                    	    // InternalPipelineParser.g:2125:16: (lv_excludedBranches_35_0= ruleBranch )
                            	                    	    // InternalPipelineParser.g:2126:17: lv_excludedBranches_35_0= ruleBranch
                            	                    	    {

                            	                    	    																	newCompositeNode(grammarAccess.getEventAccess().getExcludedBranchesBranchParserRuleCall_0_2_2_4_1_0_1_2_1_0());
                            	                    	    																
                            	                    	    pushFollow(FOLLOW_32);
                            	                    	    lv_excludedBranches_35_0=ruleBranch();

                            	                    	    state._fsp--;


                            	                    	    																	if (current==null) {
                            	                    	    																		current = createModelElementForParent(grammarAccess.getEventRule());
                            	                    	    																	}
                            	                    	    																	add(
                            	                    	    																		current,
                            	                    	    																		"excludedBranches",
                            	                    	    																		lv_excludedBranches_35_0,
                            	                    	    																		"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	                    	    																	afterParserOrEnumRuleCall();
                            	                    	    																

                            	                    	    }


                            	                    	    }


                            	                    	    }
                            	                    	    break;

                            	                    	default :
                            	                    	    break loop58;
                            	                        }
                            	                    } while (true);

                            	                    otherlv_36=(Token)match(input,RightSquareBracket,FOLLOW_51); 

                            	                    														newLeafNode(otherlv_36, grammarAccess.getEventAccess().getRightSquareBracketKeyword_0_2_2_4_1_0_1_3());
                            	                    													

                            	                    }


                            	                    }
                            	                    break;

                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalPipelineParser.g:2151:12: (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END )
                            	            {
                            	            // InternalPipelineParser.g:2151:12: (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END )
                            	            // InternalPipelineParser.g:2152:13: this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END
                            	            {
                            	            this_BEGIN_37=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

                            	            													newLeafNode(this_BEGIN_37, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_4_1_1_0());
                            	            												
                            	            // InternalPipelineParser.g:2156:13: ( (lv_excludedBranches_38_0= ruleBranch ) )*
                            	            loop60:
                            	            do {
                            	                int alt60=2;
                            	                int LA60_0 = input.LA(1);

                            	                if ( (LA60_0==HyphenMinus||LA60_0==RULE_ID||LA60_0==RULE_STRING) ) {
                            	                    alt60=1;
                            	                }


                            	                switch (alt60) {
                            	            	case 1 :
                            	            	    // InternalPipelineParser.g:2157:14: (lv_excludedBranches_38_0= ruleBranch )
                            	            	    {
                            	            	    // InternalPipelineParser.g:2157:14: (lv_excludedBranches_38_0= ruleBranch )
                            	            	    // InternalPipelineParser.g:2158:15: lv_excludedBranches_38_0= ruleBranch
                            	            	    {

                            	            	    															newCompositeNode(grammarAccess.getEventAccess().getExcludedBranchesBranchParserRuleCall_0_2_2_4_1_1_1_0());
                            	            	    														
                            	            	    pushFollow(FOLLOW_34);
                            	            	    lv_excludedBranches_38_0=ruleBranch();

                            	            	    state._fsp--;


                            	            	    															if (current==null) {
                            	            	    																current = createModelElementForParent(grammarAccess.getEventRule());
                            	            	    															}
                            	            	    															add(
                            	            	    																current,
                            	            	    																"excludedBranches",
                            	            	    																lv_excludedBranches_38_0,
                            	            	    																"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	            	    															afterParserOrEnumRuleCall();
                            	            	    														

                            	            	    }


                            	            	    }
                            	            	    break;

                            	            	default :
                            	            	    break loop60;
                            	                }
                            	            } while (true);

                            	            this_END_39=(Token)match(input,RULE_END,FOLLOW_51); 

                            	            													newLeafNode(this_END_39, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_4_1_1_2());
                            	            												

                            	            }


                            	            }
                            	            break;

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 6 :
                            	    // InternalPipelineParser.g:2187:6: ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:2187:6: ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:2188:7: {...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 5) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 5)");
                            	    }
                            	    // InternalPipelineParser.g:2188:108: ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:2189:8: ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 5);
                            	    							
                            	    // InternalPipelineParser.g:2192:11: ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) )
                            	    // InternalPipelineParser.g:2192:12: {...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:2192:21: (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) )
                            	    // InternalPipelineParser.g:2192:22: otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END )
                            	    {
                            	    otherlv_40=(Token)match(input,Paths,FOLLOW_22); 

                            	    											newLeafNode(otherlv_40, grammarAccess.getEventAccess().getPathsKeyword_0_2_2_5_0());
                            	    										
                            	    // InternalPipelineParser.g:2196:11: ( (lv_includedPaths_41_0= ruleHyphenValues ) )?
                            	    int alt62=2;
                            	    alt62 = dfa62.predict(input);
                            	    switch (alt62) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2197:12: (lv_includedPaths_41_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:2197:12: (lv_includedPaths_41_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:2198:13: lv_includedPaths_41_0= ruleHyphenValues
                            	            {

                            	            													newCompositeNode(grammarAccess.getEventAccess().getIncludedPathsHyphenValuesParserRuleCall_0_2_2_5_1_0());
                            	            												
                            	            pushFollow(FOLLOW_5);
                            	            lv_includedPaths_41_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            													if (current==null) {
                            	            														current = createModelElementForParent(grammarAccess.getEventRule());
                            	            													}
                            	            													add(
                            	            														current,
                            	            														"includedPaths",
                            	            														lv_includedPaths_41_0,
                            	            														"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            													afterParserOrEnumRuleCall();
                            	            												

                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:2215:11: (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END )
                            	    // InternalPipelineParser.g:2216:12: this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END
                            	    {
                            	    this_BEGIN_42=(Token)match(input,RULE_BEGIN,FOLLOW_57); 

                            	    												newLeafNode(this_BEGIN_42, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_5_2_0());
                            	    											
                            	    // InternalPipelineParser.g:2220:12: ( (lv_includedPaths_43_0= ruleHyphenValues ) )?
                            	    int alt63=2;
                            	    int LA63_0 = input.LA(1);

                            	    if ( (LA63_0==HyphenMinus||LA63_0==RULE_BEGIN) ) {
                            	        alt63=1;
                            	    }
                            	    switch (alt63) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2221:13: (lv_includedPaths_43_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:2221:13: (lv_includedPaths_43_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:2222:14: lv_includedPaths_43_0= ruleHyphenValues
                            	            {

                            	            														newCompositeNode(grammarAccess.getEventAccess().getIncludedPathsHyphenValuesParserRuleCall_0_2_2_5_2_1_0());
                            	            													
                            	            pushFollow(FOLLOW_58);
                            	            lv_includedPaths_43_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            														if (current==null) {
                            	            															current = createModelElementForParent(grammarAccess.getEventRule());
                            	            														}
                            	            														add(
                            	            															current,
                            	            															"includedPaths",
                            	            															lv_includedPaths_43_0,
                            	            															"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            														afterParserOrEnumRuleCall();
                            	            													

                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:2239:12: (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )?
                            	    int alt64=2;
                            	    int LA64_0 = input.LA(1);

                            	    if ( (LA64_0==Include) ) {
                            	        alt64=1;
                            	    }
                            	    switch (alt64) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2240:13: otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) )
                            	            {
                            	            otherlv_44=(Token)match(input,Include,FOLLOW_22); 

                            	            													newLeafNode(otherlv_44, grammarAccess.getEventAccess().getIncludeKeyword_0_2_2_5_2_2_0());
                            	            												
                            	            // InternalPipelineParser.g:2244:13: ( (lv_includedPaths_45_0= ruleHyphenValues ) )
                            	            // InternalPipelineParser.g:2245:14: (lv_includedPaths_45_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:2245:14: (lv_includedPaths_45_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:2246:15: lv_includedPaths_45_0= ruleHyphenValues
                            	            {

                            	            															newCompositeNode(grammarAccess.getEventAccess().getIncludedPathsHyphenValuesParserRuleCall_0_2_2_5_2_2_1_0());
                            	            														
                            	            pushFollow(FOLLOW_59);
                            	            lv_includedPaths_45_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            															if (current==null) {
                            	            																current = createModelElementForParent(grammarAccess.getEventRule());
                            	            															}
                            	            															add(
                            	            																current,
                            	            																"includedPaths",
                            	            																lv_includedPaths_45_0,
                            	            																"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            															afterParserOrEnumRuleCall();
                            	            														

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:2264:12: (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )?
                            	    int alt65=2;
                            	    int LA65_0 = input.LA(1);

                            	    if ( (LA65_0==Exclude) ) {
                            	        alt65=1;
                            	    }
                            	    switch (alt65) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2265:13: otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) )
                            	            {
                            	            otherlv_46=(Token)match(input,Exclude,FOLLOW_22); 

                            	            													newLeafNode(otherlv_46, grammarAccess.getEventAccess().getExcludeKeyword_0_2_2_5_2_3_0());
                            	            												
                            	            // InternalPipelineParser.g:2269:13: ( (lv_excludedPaths_47_0= ruleHyphenValues ) )
                            	            // InternalPipelineParser.g:2270:14: (lv_excludedPaths_47_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:2270:14: (lv_excludedPaths_47_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:2271:15: lv_excludedPaths_47_0= ruleHyphenValues
                            	            {

                            	            															newCompositeNode(grammarAccess.getEventAccess().getExcludedPathsHyphenValuesParserRuleCall_0_2_2_5_2_3_1_0());
                            	            														
                            	            pushFollow(FOLLOW_9);
                            	            lv_excludedPaths_47_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            															if (current==null) {
                            	            																current = createModelElementForParent(grammarAccess.getEventRule());
                            	            															}
                            	            															add(
                            	            																current,
                            	            																"excludedPaths",
                            	            																lv_excludedPaths_47_0,
                            	            																"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            															afterParserOrEnumRuleCall();
                            	            														

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }

                            	    this_END_48=(Token)match(input,RULE_END,FOLLOW_51); 

                            	    												newLeafNode(this_END_48, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_5_2_4());
                            	    											

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 7 :
                            	    // InternalPipelineParser.g:2300:6: ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:2300:6: ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:2301:7: {...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 6) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 6)");
                            	    }
                            	    // InternalPipelineParser.g:2301:108: ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:2302:8: ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 6);
                            	    							
                            	    // InternalPipelineParser.g:2305:11: ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) )
                            	    // InternalPipelineParser.g:2305:12: {...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:2305:21: (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) )
                            	    // InternalPipelineParser.g:2305:22: otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END )
                            	    {
                            	    otherlv_49=(Token)match(input,PathsIgnore,FOLLOW_22); 

                            	    											newLeafNode(otherlv_49, grammarAccess.getEventAccess().getPathsIgnoreKeyword_0_2_2_6_0());
                            	    										
                            	    // InternalPipelineParser.g:2309:11: ( (lv_excludedPaths_50_0= ruleHyphenValues ) )?
                            	    int alt66=2;
                            	    alt66 = dfa66.predict(input);
                            	    switch (alt66) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2310:12: (lv_excludedPaths_50_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:2310:12: (lv_excludedPaths_50_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:2311:13: lv_excludedPaths_50_0= ruleHyphenValues
                            	            {

                            	            													newCompositeNode(grammarAccess.getEventAccess().getExcludedPathsHyphenValuesParserRuleCall_0_2_2_6_1_0());
                            	            												
                            	            pushFollow(FOLLOW_5);
                            	            lv_excludedPaths_50_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            													if (current==null) {
                            	            														current = createModelElementForParent(grammarAccess.getEventRule());
                            	            													}
                            	            													add(
                            	            														current,
                            	            														"excludedPaths",
                            	            														lv_excludedPaths_50_0,
                            	            														"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            													afterParserOrEnumRuleCall();
                            	            												

                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:2328:11: (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END )
                            	    // InternalPipelineParser.g:2329:12: this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END
                            	    {
                            	    this_BEGIN_51=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

                            	    												newLeafNode(this_BEGIN_51, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_6_2_0());
                            	    											
                            	    // InternalPipelineParser.g:2333:12: ( (lv_excludedPaths_52_0= ruleHyphenValues ) )
                            	    // InternalPipelineParser.g:2334:13: (lv_excludedPaths_52_0= ruleHyphenValues )
                            	    {
                            	    // InternalPipelineParser.g:2334:13: (lv_excludedPaths_52_0= ruleHyphenValues )
                            	    // InternalPipelineParser.g:2335:14: lv_excludedPaths_52_0= ruleHyphenValues
                            	    {

                            	    														newCompositeNode(grammarAccess.getEventAccess().getExcludedPathsHyphenValuesParserRuleCall_0_2_2_6_2_1_0());
                            	    													
                            	    pushFollow(FOLLOW_9);
                            	    lv_excludedPaths_52_0=ruleHyphenValues();

                            	    state._fsp--;


                            	    														if (current==null) {
                            	    															current = createModelElementForParent(grammarAccess.getEventRule());
                            	    														}
                            	    														add(
                            	    															current,
                            	    															"excludedPaths",
                            	    															lv_excludedPaths_52_0,
                            	    															"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	    														afterParserOrEnumRuleCall();
                            	    													

                            	    }


                            	    }

                            	    this_END_53=(Token)match(input,RULE_END,FOLLOW_51); 

                            	    												newLeafNode(this_END_53, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_6_2_2());
                            	    											

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 8 :
                            	    // InternalPipelineParser.g:2363:6: ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:2363:6: ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:2364:7: {...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 7) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 7)");
                            	    }
                            	    // InternalPipelineParser.g:2364:108: ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:2365:8: ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 7);
                            	    							
                            	    // InternalPipelineParser.g:2368:11: ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) )
                            	    // InternalPipelineParser.g:2368:12: {...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:2368:21: (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) )
                            	    // InternalPipelineParser.g:2368:22: otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END )
                            	    {
                            	    otherlv_54=(Token)match(input,Tags,FOLLOW_22); 

                            	    											newLeafNode(otherlv_54, grammarAccess.getEventAccess().getTagsKeyword_0_2_2_7_0());
                            	    										
                            	    // InternalPipelineParser.g:2372:11: ( (lv_includedTags_55_0= ruleHyphenValues ) )?
                            	    int alt67=2;
                            	    alt67 = dfa67.predict(input);
                            	    switch (alt67) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2373:12: (lv_includedTags_55_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:2373:12: (lv_includedTags_55_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:2374:13: lv_includedTags_55_0= ruleHyphenValues
                            	            {

                            	            													newCompositeNode(grammarAccess.getEventAccess().getIncludedTagsHyphenValuesParserRuleCall_0_2_2_7_1_0());
                            	            												
                            	            pushFollow(FOLLOW_5);
                            	            lv_includedTags_55_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            													if (current==null) {
                            	            														current = createModelElementForParent(grammarAccess.getEventRule());
                            	            													}
                            	            													add(
                            	            														current,
                            	            														"includedTags",
                            	            														lv_includedTags_55_0,
                            	            														"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            													afterParserOrEnumRuleCall();
                            	            												

                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:2391:11: (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END )
                            	    // InternalPipelineParser.g:2392:12: this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END
                            	    {
                            	    this_BEGIN_56=(Token)match(input,RULE_BEGIN,FOLLOW_57); 

                            	    												newLeafNode(this_BEGIN_56, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_7_2_0());
                            	    											
                            	    // InternalPipelineParser.g:2396:12: ( (lv_includedTags_57_0= ruleHyphenValues ) )?
                            	    int alt68=2;
                            	    int LA68_0 = input.LA(1);

                            	    if ( (LA68_0==HyphenMinus||LA68_0==RULE_BEGIN) ) {
                            	        alt68=1;
                            	    }
                            	    switch (alt68) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2397:13: (lv_includedTags_57_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:2397:13: (lv_includedTags_57_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:2398:14: lv_includedTags_57_0= ruleHyphenValues
                            	            {

                            	            														newCompositeNode(grammarAccess.getEventAccess().getIncludedTagsHyphenValuesParserRuleCall_0_2_2_7_2_1_0());
                            	            													
                            	            pushFollow(FOLLOW_58);
                            	            lv_includedTags_57_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            														if (current==null) {
                            	            															current = createModelElementForParent(grammarAccess.getEventRule());
                            	            														}
                            	            														add(
                            	            															current,
                            	            															"includedTags",
                            	            															lv_includedTags_57_0,
                            	            															"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            														afterParserOrEnumRuleCall();
                            	            													

                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:2415:12: (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )?
                            	    int alt69=2;
                            	    int LA69_0 = input.LA(1);

                            	    if ( (LA69_0==Include) ) {
                            	        alt69=1;
                            	    }
                            	    switch (alt69) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2416:13: otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) )
                            	            {
                            	            otherlv_58=(Token)match(input,Include,FOLLOW_22); 

                            	            													newLeafNode(otherlv_58, grammarAccess.getEventAccess().getIncludeKeyword_0_2_2_7_2_2_0());
                            	            												
                            	            // InternalPipelineParser.g:2420:13: ( (lv_includedTags_59_0= ruleHyphenValues ) )
                            	            // InternalPipelineParser.g:2421:14: (lv_includedTags_59_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:2421:14: (lv_includedTags_59_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:2422:15: lv_includedTags_59_0= ruleHyphenValues
                            	            {

                            	            															newCompositeNode(grammarAccess.getEventAccess().getIncludedTagsHyphenValuesParserRuleCall_0_2_2_7_2_2_1_0());
                            	            														
                            	            pushFollow(FOLLOW_59);
                            	            lv_includedTags_59_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            															if (current==null) {
                            	            																current = createModelElementForParent(grammarAccess.getEventRule());
                            	            															}
                            	            															add(
                            	            																current,
                            	            																"includedTags",
                            	            																lv_includedTags_59_0,
                            	            																"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            															afterParserOrEnumRuleCall();
                            	            														

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:2440:12: (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )?
                            	    int alt70=2;
                            	    int LA70_0 = input.LA(1);

                            	    if ( (LA70_0==Exclude) ) {
                            	        alt70=1;
                            	    }
                            	    switch (alt70) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2441:13: otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) )
                            	            {
                            	            otherlv_60=(Token)match(input,Exclude,FOLLOW_22); 

                            	            													newLeafNode(otherlv_60, grammarAccess.getEventAccess().getExcludeKeyword_0_2_2_7_2_3_0());
                            	            												
                            	            // InternalPipelineParser.g:2445:13: ( (lv_excludedTags_61_0= ruleHyphenValues ) )
                            	            // InternalPipelineParser.g:2446:14: (lv_excludedTags_61_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:2446:14: (lv_excludedTags_61_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:2447:15: lv_excludedTags_61_0= ruleHyphenValues
                            	            {

                            	            															newCompositeNode(grammarAccess.getEventAccess().getExcludedTagsHyphenValuesParserRuleCall_0_2_2_7_2_3_1_0());
                            	            														
                            	            pushFollow(FOLLOW_9);
                            	            lv_excludedTags_61_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            															if (current==null) {
                            	            																current = createModelElementForParent(grammarAccess.getEventRule());
                            	            															}
                            	            															add(
                            	            																current,
                            	            																"excludedTags",
                            	            																lv_excludedTags_61_0,
                            	            																"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            															afterParserOrEnumRuleCall();
                            	            														

                            	            }


                            	            }


                            	            }
                            	            break;

                            	    }

                            	    this_END_62=(Token)match(input,RULE_END,FOLLOW_51); 

                            	    												newLeafNode(this_END_62, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_7_2_4());
                            	    											

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;
                            	case 9 :
                            	    // InternalPipelineParser.g:2476:6: ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) )
                            	    {
                            	    // InternalPipelineParser.g:2476:6: ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) )
                            	    // InternalPipelineParser.g:2477:7: {...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) )
                            	    {
                            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 8) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 8)");
                            	    }
                            	    // InternalPipelineParser.g:2477:108: ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) )
                            	    // InternalPipelineParser.g:2478:8: ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) )
                            	    {

                            	    								getUnorderedGroupHelper().select(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 8);
                            	    							
                            	    // InternalPipelineParser.g:2481:11: ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) )
                            	    // InternalPipelineParser.g:2481:12: {...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) )
                            	    {
                            	    if ( !((true)) ) {
                            	        throw new FailedPredicateException(input, "ruleEvent", "true");
                            	    }
                            	    // InternalPipelineParser.g:2481:21: (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) )
                            	    // InternalPipelineParser.g:2481:22: otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END )
                            	    {
                            	    otherlv_63=(Token)match(input,TagsIgnore,FOLLOW_22); 

                            	    											newLeafNode(otherlv_63, grammarAccess.getEventAccess().getTagsIgnoreKeyword_0_2_2_8_0());
                            	    										
                            	    // InternalPipelineParser.g:2485:11: ( (lv_excludedTags_64_0= ruleHyphenValues ) )?
                            	    int alt71=2;
                            	    alt71 = dfa71.predict(input);
                            	    switch (alt71) {
                            	        case 1 :
                            	            // InternalPipelineParser.g:2486:12: (lv_excludedTags_64_0= ruleHyphenValues )
                            	            {
                            	            // InternalPipelineParser.g:2486:12: (lv_excludedTags_64_0= ruleHyphenValues )
                            	            // InternalPipelineParser.g:2487:13: lv_excludedTags_64_0= ruleHyphenValues
                            	            {

                            	            													newCompositeNode(grammarAccess.getEventAccess().getExcludedTagsHyphenValuesParserRuleCall_0_2_2_8_1_0());
                            	            												
                            	            pushFollow(FOLLOW_5);
                            	            lv_excludedTags_64_0=ruleHyphenValues();

                            	            state._fsp--;


                            	            													if (current==null) {
                            	            														current = createModelElementForParent(grammarAccess.getEventRule());
                            	            													}
                            	            													add(
                            	            														current,
                            	            														"excludedTags",
                            	            														lv_excludedTags_64_0,
                            	            														"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	            													afterParserOrEnumRuleCall();
                            	            												

                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // InternalPipelineParser.g:2504:11: (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END )
                            	    // InternalPipelineParser.g:2505:12: this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END
                            	    {
                            	    this_BEGIN_65=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

                            	    												newLeafNode(this_BEGIN_65, grammarAccess.getEventAccess().getBEGINTerminalRuleCall_0_2_2_8_2_0());
                            	    											
                            	    // InternalPipelineParser.g:2509:12: ( (lv_excludedTags_66_0= ruleHyphenValues ) )
                            	    // InternalPipelineParser.g:2510:13: (lv_excludedTags_66_0= ruleHyphenValues )
                            	    {
                            	    // InternalPipelineParser.g:2510:13: (lv_excludedTags_66_0= ruleHyphenValues )
                            	    // InternalPipelineParser.g:2511:14: lv_excludedTags_66_0= ruleHyphenValues
                            	    {

                            	    														newCompositeNode(grammarAccess.getEventAccess().getExcludedTagsHyphenValuesParserRuleCall_0_2_2_8_2_1_0());
                            	    													
                            	    pushFollow(FOLLOW_9);
                            	    lv_excludedTags_66_0=ruleHyphenValues();

                            	    state._fsp--;


                            	    														if (current==null) {
                            	    															current = createModelElementForParent(grammarAccess.getEventRule());
                            	    														}
                            	    														add(
                            	    															current,
                            	    															"excludedTags",
                            	    															lv_excludedTags_66_0,
                            	    															"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            	    														afterParserOrEnumRuleCall();
                            	    													

                            	    }


                            	    }

                            	    this_END_67=(Token)match(input,RULE_END,FOLLOW_51); 

                            	    												newLeafNode(this_END_67, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_2_8_2_2());
                            	    											

                            	    }


                            	    }


                            	    }

                            	     
                            	    								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop72;
                                }
                            } while (true);


                            }


                            }

                             
                            						  getUnorderedGroupHelper().leave(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2());
                            						

                            }

                            this_END_68=(Token)match(input,RULE_END,FOLLOW_2); 

                            					newLeafNode(this_END_68, grammarAccess.getEventAccess().getENDTerminalRuleCall_0_2_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2553:3: ( ( ( ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) ) ) ( (lv_triggerSchedules_70_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )* ) )
                    {
                    // InternalPipelineParser.g:2553:3: ( ( ( ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) ) ) ( (lv_triggerSchedules_70_0= ruleTriggerSchedule ) )* ) | ( ( ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )* ) )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==Schedules||LA78_0==Schedule) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==Workflow_dispatch||LA78_0==Workflow_call||LA78_0==Workflow_run) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalPipelineParser.g:2554:4: ( ( ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) ) ) ( (lv_triggerSchedules_70_0= ruleTriggerSchedule ) )* )
                            {
                            // InternalPipelineParser.g:2554:4: ( ( ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) ) ) ( (lv_triggerSchedules_70_0= ruleTriggerSchedule ) )* )
                            // InternalPipelineParser.g:2555:5: ( ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) ) ) ( (lv_triggerSchedules_70_0= ruleTriggerSchedule ) )*
                            {
                            // InternalPipelineParser.g:2555:5: ( ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) ) )
                            // InternalPipelineParser.g:2556:6: ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) )
                            {
                            // InternalPipelineParser.g:2556:6: ( (lv_name_69_1= Schedules | lv_name_69_2= Schedule ) )
                            // InternalPipelineParser.g:2557:7: (lv_name_69_1= Schedules | lv_name_69_2= Schedule )
                            {
                            // InternalPipelineParser.g:2557:7: (lv_name_69_1= Schedules | lv_name_69_2= Schedule )
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==Schedules) ) {
                                alt74=1;
                            }
                            else if ( (LA74_0==Schedule) ) {
                                alt74=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 74, 0, input);

                                throw nvae;
                            }
                            switch (alt74) {
                                case 1 :
                                    // InternalPipelineParser.g:2558:8: lv_name_69_1= Schedules
                                    {
                                    lv_name_69_1=(Token)match(input,Schedules,FOLLOW_44); 

                                    								newLeafNode(lv_name_69_1, grammarAccess.getEventAccess().getNameSchedulesKeyword_1_0_0_0_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEventRule());
                                    								}
                                    								setWithLastConsumed(current, "name", lv_name_69_1, null);
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalPipelineParser.g:2569:8: lv_name_69_2= Schedule
                                    {
                                    lv_name_69_2=(Token)match(input,Schedule,FOLLOW_44); 

                                    								newLeafNode(lv_name_69_2, grammarAccess.getEventAccess().getNameScheduleKeyword_1_0_0_0_1());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEventRule());
                                    								}
                                    								setWithLastConsumed(current, "name", lv_name_69_2, null);
                                    							

                                    }
                                    break;

                            }


                            }


                            }

                            // InternalPipelineParser.g:2582:5: ( (lv_triggerSchedules_70_0= ruleTriggerSchedule ) )*
                            loop75:
                            do {
                                int alt75=2;
                                int LA75_0 = input.LA(1);

                                if ( (LA75_0==HyphenMinus||LA75_0==RULE_BEGIN) ) {
                                    alt75=1;
                                }


                                switch (alt75) {
                            	case 1 :
                            	    // InternalPipelineParser.g:2583:6: (lv_triggerSchedules_70_0= ruleTriggerSchedule )
                            	    {
                            	    // InternalPipelineParser.g:2583:6: (lv_triggerSchedules_70_0= ruleTriggerSchedule )
                            	    // InternalPipelineParser.g:2584:7: lv_triggerSchedules_70_0= ruleTriggerSchedule
                            	    {

                            	    							newCompositeNode(grammarAccess.getEventAccess().getTriggerSchedulesTriggerScheduleParserRuleCall_1_0_1_0());
                            	    						
                            	    pushFollow(FOLLOW_44);
                            	    lv_triggerSchedules_70_0=ruleTriggerSchedule();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getEventRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"triggerSchedules",
                            	    								lv_triggerSchedules_70_0,
                            	    								"ca.mcgill.devops.pipeline.Pipeline.TriggerSchedule");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop75;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:2603:4: ( ( ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )* )
                            {
                            // InternalPipelineParser.g:2603:4: ( ( ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )* )
                            // InternalPipelineParser.g:2604:5: ( ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) ) ) ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )*
                            {
                            // InternalPipelineParser.g:2604:5: ( ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) ) )
                            // InternalPipelineParser.g:2605:6: ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) )
                            {
                            // InternalPipelineParser.g:2605:6: ( (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch ) )
                            // InternalPipelineParser.g:2606:7: (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch )
                            {
                            // InternalPipelineParser.g:2606:7: (lv_name_71_1= Workflow_call | lv_name_71_2= Workflow_run | lv_name_71_3= Workflow_dispatch )
                            int alt76=3;
                            switch ( input.LA(1) ) {
                            case Workflow_call:
                                {
                                alt76=1;
                                }
                                break;
                            case Workflow_run:
                                {
                                alt76=2;
                                }
                                break;
                            case Workflow_dispatch:
                                {
                                alt76=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 76, 0, input);

                                throw nvae;
                            }

                            switch (alt76) {
                                case 1 :
                                    // InternalPipelineParser.g:2607:8: lv_name_71_1= Workflow_call
                                    {
                                    lv_name_71_1=(Token)match(input,Workflow_call,FOLLOW_46); 

                                    								newLeafNode(lv_name_71_1, grammarAccess.getEventAccess().getNameWorkflow_callKeyword_1_1_0_0_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEventRule());
                                    								}
                                    								setWithLastConsumed(current, "name", lv_name_71_1, null);
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalPipelineParser.g:2618:8: lv_name_71_2= Workflow_run
                                    {
                                    lv_name_71_2=(Token)match(input,Workflow_run,FOLLOW_46); 

                                    								newLeafNode(lv_name_71_2, grammarAccess.getEventAccess().getNameWorkflow_runKeyword_1_1_0_0_1());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEventRule());
                                    								}
                                    								setWithLastConsumed(current, "name", lv_name_71_2, null);
                                    							

                                    }
                                    break;
                                case 3 :
                                    // InternalPipelineParser.g:2629:8: lv_name_71_3= Workflow_dispatch
                                    {
                                    lv_name_71_3=(Token)match(input,Workflow_dispatch,FOLLOW_46); 

                                    								newLeafNode(lv_name_71_3, grammarAccess.getEventAccess().getNameWorkflow_dispatchKeyword_1_1_0_0_2());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEventRule());
                                    								}
                                    								setWithLastConsumed(current, "name", lv_name_71_3, null);
                                    							

                                    }
                                    break;

                            }


                            }


                            }

                            // InternalPipelineParser.g:2642:5: ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )*
                            loop77:
                            do {
                                int alt77=2;
                                alt77 = dfa77.predict(input);
                                switch (alt77) {
                            	case 1 :
                            	    // InternalPipelineParser.g:2643:6: (lv_otherEventParameterValues_72_0= ruleParameterValue )
                            	    {
                            	    // InternalPipelineParser.g:2643:6: (lv_otherEventParameterValues_72_0= ruleParameterValue )
                            	    // InternalPipelineParser.g:2644:7: lv_otherEventParameterValues_72_0= ruleParameterValue
                            	    {

                            	    							newCompositeNode(grammarAccess.getEventAccess().getOtherEventParameterValuesParameterValueParserRuleCall_1_1_1_0());
                            	    						
                            	    pushFollow(FOLLOW_46);
                            	    lv_otherEventParameterValues_72_0=ruleParameterValue();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getEventRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"otherEventParameterValues",
                            	    								lv_otherEventParameterValues_72_0,
                            	    								"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop77;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTriggerSchedule"
    // InternalPipelineParser.g:2667:1: entryRuleTriggerSchedule returns [EObject current=null] : iv_ruleTriggerSchedule= ruleTriggerSchedule EOF ;
    public final EObject entryRuleTriggerSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerSchedule = null;


        try {
            // InternalPipelineParser.g:2667:56: (iv_ruleTriggerSchedule= ruleTriggerSchedule EOF )
            // InternalPipelineParser.g:2668:2: iv_ruleTriggerSchedule= ruleTriggerSchedule EOF
            {
             newCompositeNode(grammarAccess.getTriggerScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerSchedule=ruleTriggerSchedule();

            state._fsp--;

             current =iv_ruleTriggerSchedule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerSchedule"


    // $ANTLR start "ruleTriggerSchedule"
    // InternalPipelineParser.g:2674:1: ruleTriggerSchedule returns [EObject current=null] : ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? ) ;
    public final EObject ruleTriggerSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cronValue_2_0=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_cronValue_6_0=null;
        Token this_END_7=null;
        Token this_BEGIN_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token this_END_17=null;
        Token otherlv_19=null;
        Token lv_batch_20_0=null;
        Token otherlv_21=null;
        Token lv_always_22_0=null;
        Token this_END_23=null;
        AntlrDatatypeRuleToken lv_displayName_10_0 = null;

        EObject lv_includedBranches_14_0 = null;

        EObject lv_excludedBranches_16_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:2680:2: ( ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? ) )
            // InternalPipelineParser.g:2681:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? )
            {
            // InternalPipelineParser.g:2681:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? )
            // InternalPipelineParser.g:2682:3: ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )?
            {
            // InternalPipelineParser.g:2682:3: ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==HyphenMinus) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_BEGIN) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalPipelineParser.g:2683:4: (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) )
                    {
                    // InternalPipelineParser.g:2683:4: (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) )
                    // InternalPipelineParser.g:2684:5: otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_60); 

                    					newLeafNode(otherlv_0, grammarAccess.getTriggerScheduleAccess().getHyphenMinusKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,Cron,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getTriggerScheduleAccess().getCronKeyword_0_0_1());
                    				
                    // InternalPipelineParser.g:2692:5: ( (lv_cronValue_2_0= RULE_STRING ) )
                    // InternalPipelineParser.g:2693:6: (lv_cronValue_2_0= RULE_STRING )
                    {
                    // InternalPipelineParser.g:2693:6: (lv_cronValue_2_0= RULE_STRING )
                    // InternalPipelineParser.g:2694:7: lv_cronValue_2_0= RULE_STRING
                    {
                    lv_cronValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

                    							newLeafNode(lv_cronValue_2_0, grammarAccess.getTriggerScheduleAccess().getCronValueSTRINGTerminalRuleCall_0_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTriggerScheduleRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"cronValue",
                    								lv_cronValue_2_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2712:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END )
                    {
                    // InternalPipelineParser.g:2712:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END )
                    // InternalPipelineParser.g:2713:5: this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getTriggerScheduleAccess().getBEGINTerminalRuleCall_0_1_0());
                    				
                    // InternalPipelineParser.g:2717:5: (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) )
                    // InternalPipelineParser.g:2718:6: otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_60); 

                    						newLeafNode(otherlv_4, grammarAccess.getTriggerScheduleAccess().getHyphenMinusKeyword_0_1_1_0());
                    					
                    otherlv_5=(Token)match(input,Cron,FOLLOW_8); 

                    						newLeafNode(otherlv_5, grammarAccess.getTriggerScheduleAccess().getCronKeyword_0_1_1_1());
                    					
                    // InternalPipelineParser.g:2726:6: ( (lv_cronValue_6_0= RULE_STRING ) )
                    // InternalPipelineParser.g:2727:7: (lv_cronValue_6_0= RULE_STRING )
                    {
                    // InternalPipelineParser.g:2727:7: (lv_cronValue_6_0= RULE_STRING )
                    // InternalPipelineParser.g:2728:8: lv_cronValue_6_0= RULE_STRING
                    {
                    lv_cronValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    								newLeafNode(lv_cronValue_6_0, grammarAccess.getTriggerScheduleAccess().getCronValueSTRINGTerminalRuleCall_0_1_1_2_0());
                    							

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getTriggerScheduleRule());
                    								}
                    								setWithLastConsumed(
                    									current,
                    									"cronValue",
                    									lv_cronValue_6_0,
                    									"org.eclipse.xtext.common.Terminals.STRING");
                    							

                    }


                    }


                    }

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_61); 

                    					newLeafNode(this_END_7, grammarAccess.getTriggerScheduleAccess().getENDTerminalRuleCall_0_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:2751:3: (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_BEGIN) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==DisplayName||LA87_1==Branches) ) {
                    alt87=1;
                }
            }
            switch (alt87) {
                case 1 :
                    // InternalPipelineParser.g:2752:4: this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END
                    {
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_62); 

                    				newLeafNode(this_BEGIN_8, grammarAccess.getTriggerScheduleAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:2756:4: (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==DisplayName) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalPipelineParser.g:2757:5: otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) )
                            {
                            otherlv_9=(Token)match(input,DisplayName,FOLLOW_3); 

                            					newLeafNode(otherlv_9, grammarAccess.getTriggerScheduleAccess().getDisplayNameKeyword_1_1_0());
                            				
                            // InternalPipelineParser.g:2761:5: ( (lv_displayName_10_0= ruleUnquotedString ) )
                            // InternalPipelineParser.g:2762:6: (lv_displayName_10_0= ruleUnquotedString )
                            {
                            // InternalPipelineParser.g:2762:6: (lv_displayName_10_0= ruleUnquotedString )
                            // InternalPipelineParser.g:2763:7: lv_displayName_10_0= ruleUnquotedString
                            {

                            							newCompositeNode(grammarAccess.getTriggerScheduleAccess().getDisplayNameUnquotedStringParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_63);
                            lv_displayName_10_0=ruleUnquotedString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTriggerScheduleRule());
                            							}
                            							set(
                            								current,
                            								"displayName",
                            								lv_displayName_10_0,
                            								"ca.mcgill.devops.pipeline.Pipeline.UnquotedString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalPipelineParser.g:2781:4: (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) )
                    // InternalPipelineParser.g:2782:5: otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END )
                    {
                    otherlv_11=(Token)match(input,Branches,FOLLOW_5); 

                    					newLeafNode(otherlv_11, grammarAccess.getTriggerScheduleAccess().getBranchesKeyword_1_2_0());
                    				
                    // InternalPipelineParser.g:2786:5: (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END )
                    // InternalPipelineParser.g:2787:6: this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END
                    {
                    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_58); 

                    						newLeafNode(this_BEGIN_12, grammarAccess.getTriggerScheduleAccess().getBEGINTerminalRuleCall_1_2_1_0());
                    					
                    // InternalPipelineParser.g:2791:6: (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==Include) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalPipelineParser.g:2792:7: otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )*
                            {
                            otherlv_13=(Token)match(input,Include,FOLLOW_56); 

                            							newLeafNode(otherlv_13, grammarAccess.getTriggerScheduleAccess().getIncludeKeyword_1_2_1_1_0());
                            						
                            // InternalPipelineParser.g:2796:7: ( (lv_includedBranches_14_0= ruleBranch ) )*
                            loop82:
                            do {
                                int alt82=2;
                                int LA82_0 = input.LA(1);

                                if ( (LA82_0==HyphenMinus||LA82_0==RULE_ID||LA82_0==RULE_STRING) ) {
                                    alt82=1;
                                }


                                switch (alt82) {
                            	case 1 :
                            	    // InternalPipelineParser.g:2797:8: (lv_includedBranches_14_0= ruleBranch )
                            	    {
                            	    // InternalPipelineParser.g:2797:8: (lv_includedBranches_14_0= ruleBranch )
                            	    // InternalPipelineParser.g:2798:9: lv_includedBranches_14_0= ruleBranch
                            	    {

                            	    									newCompositeNode(grammarAccess.getTriggerScheduleAccess().getIncludedBranchesBranchParserRuleCall_1_2_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_56);
                            	    lv_includedBranches_14_0=ruleBranch();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getTriggerScheduleRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"includedBranches",
                            	    										lv_includedBranches_14_0,
                            	    										"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop82;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalPipelineParser.g:2816:6: (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==Exclude) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalPipelineParser.g:2817:7: otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )*
                            {
                            otherlv_15=(Token)match(input,Exclude,FOLLOW_34); 

                            							newLeafNode(otherlv_15, grammarAccess.getTriggerScheduleAccess().getExcludeKeyword_1_2_1_2_0());
                            						
                            // InternalPipelineParser.g:2821:7: ( (lv_excludedBranches_16_0= ruleBranch ) )*
                            loop84:
                            do {
                                int alt84=2;
                                int LA84_0 = input.LA(1);

                                if ( (LA84_0==HyphenMinus||LA84_0==RULE_ID||LA84_0==RULE_STRING) ) {
                                    alt84=1;
                                }


                                switch (alt84) {
                            	case 1 :
                            	    // InternalPipelineParser.g:2822:8: (lv_excludedBranches_16_0= ruleBranch )
                            	    {
                            	    // InternalPipelineParser.g:2822:8: (lv_excludedBranches_16_0= ruleBranch )
                            	    // InternalPipelineParser.g:2823:9: lv_excludedBranches_16_0= ruleBranch
                            	    {

                            	    									newCompositeNode(grammarAccess.getTriggerScheduleAccess().getExcludedBranchesBranchParserRuleCall_1_2_1_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_34);
                            	    lv_excludedBranches_16_0=ruleBranch();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getTriggerScheduleRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"excludedBranches",
                            	    										lv_excludedBranches_16_0,
                            	    										"ca.mcgill.devops.pipeline.Pipeline.Branch");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop84;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_END_17=(Token)match(input,RULE_END,FOLLOW_64); 

                    						newLeafNode(this_END_17, grammarAccess.getTriggerScheduleAccess().getENDTerminalRuleCall_1_2_1_3());
                    					

                    }


                    }

                    // InternalPipelineParser.g:2847:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) )
                    // InternalPipelineParser.g:2848:5: ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) )
                    {
                    // InternalPipelineParser.g:2848:5: ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) )
                    // InternalPipelineParser.g:2849:6: ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3());
                    					
                    // InternalPipelineParser.g:2852:6: ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* )
                    // InternalPipelineParser.g:2853:7: ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )*
                    {
                    // InternalPipelineParser.g:2853:7: ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )*
                    loop86:
                    do {
                        int alt86=3;
                        int LA86_0 = input.LA(1);

                        if ( LA86_0 == Batch && getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0) ) {
                            alt86=1;
                        }
                        else if ( LA86_0 == Always && getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1) ) {
                            alt86=2;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2854:5: ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:2854:5: ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) )
                    	    // InternalPipelineParser.g:2855:6: {...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0)");
                    	    }
                    	    // InternalPipelineParser.g:2855:115: ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) )
                    	    // InternalPipelineParser.g:2856:7: ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0);
                    	    						
                    	    // InternalPipelineParser.g:2859:10: ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:2859:11: {...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "true");
                    	    }
                    	    // InternalPipelineParser.g:2859:20: (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:2859:21: otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) )
                    	    {
                    	    otherlv_19=(Token)match(input,Batch,FOLLOW_3); 

                    	    										newLeafNode(otherlv_19, grammarAccess.getTriggerScheduleAccess().getBatchKeyword_1_3_0_0());
                    	    									
                    	    // InternalPipelineParser.g:2863:10: ( (lv_batch_20_0= RULE_ID ) )
                    	    // InternalPipelineParser.g:2864:11: (lv_batch_20_0= RULE_ID )
                    	    {
                    	    // InternalPipelineParser.g:2864:11: (lv_batch_20_0= RULE_ID )
                    	    // InternalPipelineParser.g:2865:12: lv_batch_20_0= RULE_ID
                    	    {
                    	    lv_batch_20_0=(Token)match(input,RULE_ID,FOLLOW_64); 

                    	    												newLeafNode(lv_batch_20_0, grammarAccess.getTriggerScheduleAccess().getBatchIDTerminalRuleCall_1_3_0_1_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getTriggerScheduleRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"batch",
                    	    													lv_batch_20_0,
                    	    													"ca.mcgill.devops.pipeline.Pipeline.ID");
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPipelineParser.g:2887:5: ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:2887:5: ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) )
                    	    // InternalPipelineParser.g:2888:6: {...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1)");
                    	    }
                    	    // InternalPipelineParser.g:2888:115: ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) )
                    	    // InternalPipelineParser.g:2889:7: ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1);
                    	    						
                    	    // InternalPipelineParser.g:2892:10: ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:2892:11: {...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "true");
                    	    }
                    	    // InternalPipelineParser.g:2892:20: (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:2892:21: otherlv_21= Always ( (lv_always_22_0= RULE_ID ) )
                    	    {
                    	    otherlv_21=(Token)match(input,Always,FOLLOW_3); 

                    	    										newLeafNode(otherlv_21, grammarAccess.getTriggerScheduleAccess().getAlwaysKeyword_1_3_1_0());
                    	    									
                    	    // InternalPipelineParser.g:2896:10: ( (lv_always_22_0= RULE_ID ) )
                    	    // InternalPipelineParser.g:2897:11: (lv_always_22_0= RULE_ID )
                    	    {
                    	    // InternalPipelineParser.g:2897:11: (lv_always_22_0= RULE_ID )
                    	    // InternalPipelineParser.g:2898:12: lv_always_22_0= RULE_ID
                    	    {
                    	    lv_always_22_0=(Token)match(input,RULE_ID,FOLLOW_64); 

                    	    												newLeafNode(lv_always_22_0, grammarAccess.getTriggerScheduleAccess().getAlwaysIDTerminalRuleCall_1_3_1_1_0());
                    	    											

                    	    												if (current==null) {
                    	    													current = createModelElement(grammarAccess.getTriggerScheduleRule());
                    	    												}
                    	    												setWithLastConsumed(
                    	    													current,
                    	    													"always",
                    	    													lv_always_22_0,
                    	    													"ca.mcgill.devops.pipeline.Pipeline.ID");
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3());
                    					

                    }

                    this_END_23=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_23, grammarAccess.getTriggerScheduleAccess().getENDTerminalRuleCall_1_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerSchedule"


    // $ANTLR start "entryRuleBranch"
    // InternalPipelineParser.g:2936:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalPipelineParser.g:2936:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalPipelineParser.g:2937:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // InternalPipelineParser.g:2943:1: ruleBranch returns [EObject current=null] : ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:2949:2: ( ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ) )
            // InternalPipelineParser.g:2950:2: ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) )
            {
            // InternalPipelineParser.g:2950:2: ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) )
            // InternalPipelineParser.g:2951:3: (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) )
            {
            // InternalPipelineParser.g:2951:3: (otherlv_0= HyphenMinus )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==HyphenMinus) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalPipelineParser.g:2952:4: otherlv_0= HyphenMinus
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPipelineParser.g:2957:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) )
            // InternalPipelineParser.g:2958:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            {
            // InternalPipelineParser.g:2958:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            // InternalPipelineParser.g:2959:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            {
            // InternalPipelineParser.g:2959:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID) ) {
                alt89=1;
            }
            else if ( (LA89_0==RULE_STRING) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalPipelineParser.g:2960:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getBranchAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBranchRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"ca.mcgill.devops.pipeline.Pipeline.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2975:6: lv_name_1_2= RULE_STRING
                    {
                    lv_name_1_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getBranchAccess().getNameSTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBranchRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleActivity"
    // InternalPipelineParser.g:2996:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalPipelineParser.g:2996:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalPipelineParser.g:2997:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalPipelineParser.g:3003:1: ruleActivity returns [EObject current=null] : ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_1 = null;

        AntlrDatatypeRuleToken lv_name_0_2 = null;

        AntlrDatatypeRuleToken lv_name_0_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3009:2: ( ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) ) )
            // InternalPipelineParser.g:3010:2: ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) )
            {
            // InternalPipelineParser.g:3010:2: ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) )
            // InternalPipelineParser.g:3011:3: ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) )
            {
            // InternalPipelineParser.g:3011:3: ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) )
            // InternalPipelineParser.g:3012:4: (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues )
            {
            // InternalPipelineParser.g:3012:4: (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues )
            int alt90=3;
            switch ( input.LA(1) ) {
            case RULE_COMPLEX_EXPRESSION:
            case RULE_HEX_INT:
            case RULE_INT:
            case RULE_FLOAT_LITERAL:
            case RULE_VERSION:
            case RULE_ID:
            case RULE_STRING:
                {
                alt90=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt90=2;
                }
                break;
            case HyphenMinus:
            case RULE_BEGIN:
                {
                alt90=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalPipelineParser.g:3013:5: lv_name_0_1= ruleAnyData
                    {

                    					newCompositeNode(grammarAccess.getActivityAccess().getNameAnyDataParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_1=ruleAnyData();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActivityRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3029:5: lv_name_0_2= ruleArrayList
                    {

                    					newCompositeNode(grammarAccess.getActivityAccess().getNameArrayListParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_2=ruleArrayList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActivityRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_2,
                    						"ca.mcgill.devops.pipeline.Pipeline.ArrayList");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:3045:5: lv_name_0_3= ruleHyphenValues
                    {

                    					newCompositeNode(grammarAccess.getActivityAccess().getNameHyphenValuesParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_name_0_3=ruleHyphenValues();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActivityRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_0_3,
                    						"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleStage"
    // InternalPipelineParser.g:3066:1: entryRuleStage returns [EObject current=null] : iv_ruleStage= ruleStage EOF ;
    public final EObject entryRuleStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStage = null;


        try {
            // InternalPipelineParser.g:3066:46: (iv_ruleStage= ruleStage EOF )
            // InternalPipelineParser.g:3067:2: iv_ruleStage= ruleStage EOF
            {
             newCompositeNode(grammarAccess.getStageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStage=ruleStage();

            state._fsp--;

             current =iv_ruleStage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStage"


    // $ANTLR start "ruleStage"
    // InternalPipelineParser.g:3073:1: ruleStage returns [EObject current=null] : ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )? ) ;
    public final EObject ruleStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token lv_displayName_6_0=null;
        Token otherlv_7=null;
        Token this_BEGIN_10=null;
        Token otherlv_11=null;
        Token lv_vmName_12_0=null;
        Token otherlv_13=null;
        Token lv_vmImage_14_1=null;
        Token lv_vmImage_14_2=null;
        Token otherlv_15=null;
        Token this_END_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_isSkippable_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token this_END_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_poolValue_8_0 = null;

        AntlrDatatypeRuleToken lv_vmDemands_16_1 = null;

        AntlrDatatypeRuleToken lv_vmDemands_16_2 = null;

        AntlrDatatypeRuleToken lv_conditionValue_19_0 = null;

        EObject lv_stageVariables_23_0 = null;

        EObject lv_jobs_27_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3079:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )? ) )
            // InternalPipelineParser.g:3080:2: ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalPipelineParser.g:3080:2: ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )? )
            // InternalPipelineParser.g:3081:3: (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )?
            {
            // InternalPipelineParser.g:3081:3: (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) )
            // InternalPipelineParser.g:3082:4: otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) )
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_65); 

            				newLeafNode(otherlv_0, grammarAccess.getStageAccess().getHyphenMinusKeyword_0_0());
            			
            otherlv_1=(Token)match(input,Stage,FOLLOW_40); 

            				newLeafNode(otherlv_1, grammarAccess.getStageAccess().getStageKeyword_0_1());
            			
            // InternalPipelineParser.g:3090:4: ( (lv_name_2_0= ruleAnyData ) )
            // InternalPipelineParser.g:3091:5: (lv_name_2_0= ruleAnyData )
            {
            // InternalPipelineParser.g:3091:5: (lv_name_2_0= ruleAnyData )
            // InternalPipelineParser.g:3092:6: lv_name_2_0= ruleAnyData
            {

            						newCompositeNode(grammarAccess.getStageAccess().getNameAnyDataParserRuleCall_0_2_0());
            					
            pushFollow(FOLLOW_66);
            lv_name_2_0=ruleAnyData();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStageRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_2_0,
            							"ca.mcgill.devops.pipeline.Pipeline.AnyData");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalPipelineParser.g:3110:3: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==IsSkippable||LA102_0==Condition||LA102_0==DependsOn||LA102_0==Variables||LA102_0==Jobs||LA102_0==Pool||LA102_0==RULE_BEGIN) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalPipelineParser.g:3111:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) )
                    {
                    // InternalPipelineParser.g:3111:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) )
                    // InternalPipelineParser.g:3112:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    				
                    // InternalPipelineParser.g:3115:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?)
                    // InternalPipelineParser.g:3116:6: ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?
                    {
                    // InternalPipelineParser.g:3116:6: ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+
                    int cnt101=0;
                    loop101:
                    do {
                        int alt101=8;
                        int LA101_0 = input.LA(1);

                        if ( LA101_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0) ) {
                            alt101=1;
                        }
                        else if ( LA101_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1) ) {
                            alt101=2;
                        }
                        else if ( LA101_0 == Condition && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2) ) {
                            alt101=3;
                        }
                        else if ( LA101_0 == IsSkippable && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 3) ) {
                            alt101=4;
                        }
                        else if ( LA101_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 4) ) {
                            alt101=5;
                        }
                        else if ( LA101_0 == DependsOn && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 5) ) {
                            alt101=6;
                        }
                        else if ( LA101_0 == Jobs && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 6) ) {
                            alt101=7;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3117:4: ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3117:4: ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) )
                    	    // InternalPipelineParser.g:3118:5: {...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0)");
                    	    }
                    	    // InternalPipelineParser.g:3118:102: ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) )
                    	    // InternalPipelineParser.g:3119:6: ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0);
                    	    					
                    	    // InternalPipelineParser.g:3122:9: ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) )
                    	    // InternalPipelineParser.g:3122:10: {...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:3122:19: (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? )
                    	    // InternalPipelineParser.g:3122:20: this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )?
                    	    {
                    	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_67); 

                    	    									newLeafNode(this_BEGIN_4, grammarAccess.getStageAccess().getBEGINTerminalRuleCall_1_0_0());
                    	    								
                    	    // InternalPipelineParser.g:3126:9: (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )?
                    	    int alt91=2;
                    	    int LA91_0 = input.LA(1);

                    	    if ( (LA91_0==DisplayName) ) {
                    	        alt91=1;
                    	    }
                    	    switch (alt91) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:3127:10: otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) )
                    	            {
                    	            otherlv_5=(Token)match(input,DisplayName,FOLLOW_8); 

                    	            										newLeafNode(otherlv_5, grammarAccess.getStageAccess().getDisplayNameKeyword_1_0_1_0());
                    	            									
                    	            // InternalPipelineParser.g:3131:10: ( (lv_displayName_6_0= RULE_STRING ) )
                    	            // InternalPipelineParser.g:3132:11: (lv_displayName_6_0= RULE_STRING )
                    	            {
                    	            // InternalPipelineParser.g:3132:11: (lv_displayName_6_0= RULE_STRING )
                    	            // InternalPipelineParser.g:3133:12: lv_displayName_6_0= RULE_STRING
                    	            {
                    	            lv_displayName_6_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

                    	            												newLeafNode(lv_displayName_6_0, grammarAccess.getStageAccess().getDisplayNameSTRINGTerminalRuleCall_1_0_1_1_0());
                    	            											

                    	            												if (current==null) {
                    	            													current = createModelElement(grammarAccess.getStageRule());
                    	            												}
                    	            												setWithLastConsumed(
                    	            													current,
                    	            													"displayName",
                    	            													lv_displayName_6_0,
                    	            													"org.eclipse.xtext.common.Terminals.STRING");
                    	            											

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPipelineParser.g:3156:4: ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3156:4: ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) )
                    	    // InternalPipelineParser.g:3157:5: {...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1)");
                    	    }
                    	    // InternalPipelineParser.g:3157:102: ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
                    	    // InternalPipelineParser.g:3158:6: ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1);
                    	    					
                    	    // InternalPipelineParser.g:3161:9: ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
                    	    // InternalPipelineParser.g:3161:10: {...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:3161:19: (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
                    	    // InternalPipelineParser.g:3161:20: otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Pool,FOLLOW_68); 

                    	    									newLeafNode(otherlv_7, grammarAccess.getStageAccess().getPoolKeyword_1_1_0());
                    	    								
                    	    // InternalPipelineParser.g:3165:9: ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) )
                    	    int alt97=2;
                    	    int LA97_0 = input.LA(1);

                    	    if ( ((LA97_0>=RULE_COMPLEX_EXPRESSION && LA97_0<=RULE_VERSION)||LA97_0==RULE_ID||LA97_0==RULE_STRING) ) {
                    	        alt97=1;
                    	    }
                    	    else if ( (LA97_0==Demands||(LA97_0>=RULE_BEGIN && LA97_0<=RULE_END)) ) {
                    	        alt97=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 97, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt97) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:3166:10: ( (lv_poolValue_8_0= ruleAnyData ) )
                    	            {
                    	            // InternalPipelineParser.g:3166:10: ( (lv_poolValue_8_0= ruleAnyData ) )
                    	            // InternalPipelineParser.g:3167:11: (lv_poolValue_8_0= ruleAnyData )
                    	            {
                    	            // InternalPipelineParser.g:3167:11: (lv_poolValue_8_0= ruleAnyData )
                    	            // InternalPipelineParser.g:3168:12: lv_poolValue_8_0= ruleAnyData
                    	            {

                    	            												newCompositeNode(grammarAccess.getStageAccess().getPoolValueAnyDataParserRuleCall_1_1_1_0_0());
                    	            											
                    	            pushFollow(FOLLOW_66);
                    	            lv_poolValue_8_0=ruleAnyData();

                    	            state._fsp--;


                    	            												if (current==null) {
                    	            													current = createModelElementForParent(grammarAccess.getStageRule());
                    	            												}
                    	            												set(
                    	            													current,
                    	            													"poolValue",
                    	            													lv_poolValue_8_0,
                    	            													"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                    	            												afterParserOrEnumRuleCall();
                    	            											

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:3186:10: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) )
                    	            {
                    	            // InternalPipelineParser.g:3186:10: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) )
                    	            // InternalPipelineParser.g:3187:11: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) )
                    	            {
                    	            // InternalPipelineParser.g:3187:11: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) )
                    	            // InternalPipelineParser.g:3188:12: ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?)
                    	            {
                    	             
                    	            											  getUnorderedGroupHelper().enter(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1());
                    	            											
                    	            // InternalPipelineParser.g:3191:12: ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?)
                    	            // InternalPipelineParser.g:3192:13: ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?
                    	            {
                    	            // InternalPipelineParser.g:3192:13: ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+
                    	            int cnt96=0;
                    	            loop96:
                    	            do {
                    	                int alt96=3;
                    	                alt96 = dfa96.predict(input);
                    	                switch (alt96) {
                    	            	case 1 :
                    	            	    // InternalPipelineParser.g:3193:11: ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) )
                    	            	    {
                    	            	    // InternalPipelineParser.g:3193:11: ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) )
                    	            	    // InternalPipelineParser.g:3194:12: {...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) )
                    	            	    {
                    	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 0) ) {
                    	            	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 0)");
                    	            	    }
                    	            	    // InternalPipelineParser.g:3194:115: ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) )
                    	            	    // InternalPipelineParser.g:3195:13: ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) )
                    	            	    {

                    	            	    													getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 0);
                    	            	    												
                    	            	    // InternalPipelineParser.g:3198:16: ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) )
                    	            	    // InternalPipelineParser.g:3198:17: {...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? )
                    	            	    {
                    	            	    if ( !((true)) ) {
                    	            	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	            	    }
                    	            	    // InternalPipelineParser.g:3198:26: (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? )
                    	            	    // InternalPipelineParser.g:3198:27: this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )?
                    	            	    {
                    	            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

                    	            	    																newLeafNode(this_BEGIN_10, grammarAccess.getStageAccess().getBEGINTerminalRuleCall_1_1_1_1_0_0());
                    	            	    															
                    	            	    // InternalPipelineParser.g:3202:16: (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) )
                    	            	    // InternalPipelineParser.g:3203:17: otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) )
                    	            	    {
                    	            	    otherlv_11=(Token)match(input,Name,FOLLOW_3); 

                    	            	    																	newLeafNode(otherlv_11, grammarAccess.getStageAccess().getNameKeyword_1_1_1_1_0_1_0());
                    	            	    																
                    	            	    // InternalPipelineParser.g:3207:17: ( (lv_vmName_12_0= RULE_ID ) )
                    	            	    // InternalPipelineParser.g:3208:18: (lv_vmName_12_0= RULE_ID )
                    	            	    {
                    	            	    // InternalPipelineParser.g:3208:18: (lv_vmName_12_0= RULE_ID )
                    	            	    // InternalPipelineParser.g:3209:19: lv_vmName_12_0= RULE_ID
                    	            	    {
                    	            	    lv_vmName_12_0=(Token)match(input,RULE_ID,FOLLOW_69); 

                    	            	    																			newLeafNode(lv_vmName_12_0, grammarAccess.getStageAccess().getVmNameIDTerminalRuleCall_1_1_1_1_0_1_1_0());
                    	            	    																		

                    	            	    																			if (current==null) {
                    	            	    																				current = createModelElement(grammarAccess.getStageRule());
                    	            	    																			}
                    	            	    																			setWithLastConsumed(
                    	            	    																				current,
                    	            	    																				"vmName",
                    	            	    																				lv_vmName_12_0,
                    	            	    																				"ca.mcgill.devops.pipeline.Pipeline.ID");
                    	            	    																		

                    	            	    }


                    	            	    }


                    	            	    }

                    	            	    // InternalPipelineParser.g:3226:16: (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )?
                    	            	    int alt93=2;
                    	            	    int LA93_0 = input.LA(1);

                    	            	    if ( (LA93_0==VmImage) ) {
                    	            	        alt93=1;
                    	            	    }
                    	            	    switch (alt93) {
                    	            	        case 1 :
                    	            	            // InternalPipelineParser.g:3227:17: otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) )
                    	            	            {
                    	            	            otherlv_13=(Token)match(input,VmImage,FOLLOW_20); 

                    	            	            																	newLeafNode(otherlv_13, grammarAccess.getStageAccess().getVmImageKeyword_1_1_1_1_0_2_0());
                    	            	            																
                    	            	            // InternalPipelineParser.g:3231:17: ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) )
                    	            	            // InternalPipelineParser.g:3232:18: ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) )
                    	            	            {
                    	            	            // InternalPipelineParser.g:3232:18: ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) )
                    	            	            // InternalPipelineParser.g:3233:19: (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING )
                    	            	            {
                    	            	            // InternalPipelineParser.g:3233:19: (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING )
                    	            	            int alt92=2;
                    	            	            int LA92_0 = input.LA(1);

                    	            	            if ( (LA92_0==RULE_ID) ) {
                    	            	                alt92=1;
                    	            	            }
                    	            	            else if ( (LA92_0==RULE_STRING) ) {
                    	            	                alt92=2;
                    	            	            }
                    	            	            else {
                    	            	                NoViableAltException nvae =
                    	            	                    new NoViableAltException("", 92, 0, input);

                    	            	                throw nvae;
                    	            	            }
                    	            	            switch (alt92) {
                    	            	                case 1 :
                    	            	                    // InternalPipelineParser.g:3234:20: lv_vmImage_14_1= RULE_ID
                    	            	                    {
                    	            	                    lv_vmImage_14_1=(Token)match(input,RULE_ID,FOLLOW_70); 

                    	            	                    																				newLeafNode(lv_vmImage_14_1, grammarAccess.getStageAccess().getVmImageIDTerminalRuleCall_1_1_1_1_0_2_1_0_0());
                    	            	                    																			

                    	            	                    																				if (current==null) {
                    	            	                    																					current = createModelElement(grammarAccess.getStageRule());
                    	            	                    																				}
                    	            	                    																				setWithLastConsumed(
                    	            	                    																					current,
                    	            	                    																					"vmImage",
                    	            	                    																					lv_vmImage_14_1,
                    	            	                    																					"ca.mcgill.devops.pipeline.Pipeline.ID");
                    	            	                    																			

                    	            	                    }
                    	            	                    break;
                    	            	                case 2 :
                    	            	                    // InternalPipelineParser.g:3249:20: lv_vmImage_14_2= RULE_STRING
                    	            	                    {
                    	            	                    lv_vmImage_14_2=(Token)match(input,RULE_STRING,FOLLOW_70); 

                    	            	                    																				newLeafNode(lv_vmImage_14_2, grammarAccess.getStageAccess().getVmImageSTRINGTerminalRuleCall_1_1_1_1_0_2_1_0_1());
                    	            	                    																			

                    	            	                    																				if (current==null) {
                    	            	                    																					current = createModelElement(grammarAccess.getStageRule());
                    	            	                    																				}
                    	            	                    																				setWithLastConsumed(
                    	            	                    																					current,
                    	            	                    																					"vmImage",
                    	            	                    																					lv_vmImage_14_2,
                    	            	                    																					"org.eclipse.xtext.common.Terminals.STRING");
                    	            	                    																			

                    	            	                    }
                    	            	                    break;

                    	            	            }


                    	            	            }


                    	            	            }


                    	            	            }
                    	            	            break;

                    	            	    }


                    	            	    }


                    	            	    }

                    	            	     
                    	            	    													getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1());
                    	            	    												

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;
                    	            	case 2 :
                    	            	    // InternalPipelineParser.g:3273:11: ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) )
                    	            	    {
                    	            	    // InternalPipelineParser.g:3273:11: ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) )
                    	            	    // InternalPipelineParser.g:3274:12: {...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) )
                    	            	    {
                    	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 1) ) {
                    	            	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 1)");
                    	            	    }
                    	            	    // InternalPipelineParser.g:3274:115: ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) )
                    	            	    // InternalPipelineParser.g:3275:13: ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) )
                    	            	    {

                    	            	    													getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 1);
                    	            	    												
                    	            	    // InternalPipelineParser.g:3278:16: ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) )
                    	            	    // InternalPipelineParser.g:3278:17: {...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END )
                    	            	    {
                    	            	    if ( !((true)) ) {
                    	            	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	            	    }
                    	            	    // InternalPipelineParser.g:3278:26: ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END )
                    	            	    // InternalPipelineParser.g:3278:27: (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END
                    	            	    {
                    	            	    // InternalPipelineParser.g:3278:27: (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )?
                    	            	    int alt95=2;
                    	            	    int LA95_0 = input.LA(1);

                    	            	    if ( (LA95_0==Demands) ) {
                    	            	        alt95=1;
                    	            	    }
                    	            	    switch (alt95) {
                    	            	        case 1 :
                    	            	            // InternalPipelineParser.g:3279:17: otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) )
                    	            	            {
                    	            	            otherlv_15=(Token)match(input,Demands,FOLLOW_22); 

                    	            	            																	newLeafNode(otherlv_15, grammarAccess.getStageAccess().getDemandsKeyword_1_1_1_1_1_0_0());
                    	            	            																
                    	            	            // InternalPipelineParser.g:3283:17: ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) )
                    	            	            // InternalPipelineParser.g:3284:18: ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) )
                    	            	            {
                    	            	            // InternalPipelineParser.g:3284:18: ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) )
                    	            	            // InternalPipelineParser.g:3285:19: (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues )
                    	            	            {
                    	            	            // InternalPipelineParser.g:3285:19: (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues )
                    	            	            int alt94=2;
                    	            	            int LA94_0 = input.LA(1);

                    	            	            if ( ((LA94_0>=RULE_COMPLEX_EXPRESSION && LA94_0<=RULE_VERSION)||LA94_0==RULE_ID||LA94_0==RULE_STRING) ) {
                    	            	                alt94=1;
                    	            	            }
                    	            	            else if ( (LA94_0==HyphenMinus||LA94_0==RULE_BEGIN) ) {
                    	            	                alt94=2;
                    	            	            }
                    	            	            else {
                    	            	                NoViableAltException nvae =
                    	            	                    new NoViableAltException("", 94, 0, input);

                    	            	                throw nvae;
                    	            	            }
                    	            	            switch (alt94) {
                    	            	                case 1 :
                    	            	                    // InternalPipelineParser.g:3286:20: lv_vmDemands_16_1= ruleAnyData
                    	            	                    {

                    	            	                    																				newCompositeNode(grammarAccess.getStageAccess().getVmDemandsAnyDataParserRuleCall_1_1_1_1_1_0_1_0_0());
                    	            	                    																			
                    	            	                    pushFollow(FOLLOW_9);
                    	            	                    lv_vmDemands_16_1=ruleAnyData();

                    	            	                    state._fsp--;


                    	            	                    																				if (current==null) {
                    	            	                    																					current = createModelElementForParent(grammarAccess.getStageRule());
                    	            	                    																				}
                    	            	                    																				set(
                    	            	                    																					current,
                    	            	                    																					"vmDemands",
                    	            	                    																					lv_vmDemands_16_1,
                    	            	                    																					"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                    	            	                    																				afterParserOrEnumRuleCall();
                    	            	                    																			

                    	            	                    }
                    	            	                    break;
                    	            	                case 2 :
                    	            	                    // InternalPipelineParser.g:3302:20: lv_vmDemands_16_2= ruleHyphenValues
                    	            	                    {

                    	            	                    																				newCompositeNode(grammarAccess.getStageAccess().getVmDemandsHyphenValuesParserRuleCall_1_1_1_1_1_0_1_0_1());
                    	            	                    																			
                    	            	                    pushFollow(FOLLOW_9);
                    	            	                    lv_vmDemands_16_2=ruleHyphenValues();

                    	            	                    state._fsp--;


                    	            	                    																				if (current==null) {
                    	            	                    																					current = createModelElementForParent(grammarAccess.getStageRule());
                    	            	                    																				}
                    	            	                    																				set(
                    	            	                    																					current,
                    	            	                    																					"vmDemands",
                    	            	                    																					lv_vmDemands_16_2,
                    	            	                    																					"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                    	            	                    																				afterParserOrEnumRuleCall();
                    	            	                    																			

                    	            	                    }
                    	            	                    break;

                    	            	            }


                    	            	            }


                    	            	            }


                    	            	            }
                    	            	            break;

                    	            	    }

                    	            	    this_END_17=(Token)match(input,RULE_END,FOLLOW_70); 

                    	            	    																newLeafNode(this_END_17, grammarAccess.getStageAccess().getENDTerminalRuleCall_1_1_1_1_1_1());
                    	            	    															

                    	            	    }


                    	            	    }

                    	            	     
                    	            	    													getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1());
                    	            	    												

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt96 >= 1 ) break loop96;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(96, input);
                    	                        throw eee;
                    	                }
                    	                cnt96++;
                    	            } while (true);

                    	            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1()) ) {
                    	                throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canLeave(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1())");
                    	            }

                    	            }


                    	            }

                    	             
                    	            											  getUnorderedGroupHelper().leave(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1());
                    	            											

                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalPipelineParser.g:3346:4: ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3346:4: ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) )
                    	    // InternalPipelineParser.g:3347:5: {...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2)");
                    	    }
                    	    // InternalPipelineParser.g:3347:102: ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) )
                    	    // InternalPipelineParser.g:3348:6: ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2);
                    	    					
                    	    // InternalPipelineParser.g:3351:9: ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) )
                    	    // InternalPipelineParser.g:3351:10: {...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:3351:19: (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) )
                    	    // InternalPipelineParser.g:3351:20: otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Condition,FOLLOW_40); 

                    	    									newLeafNode(otherlv_18, grammarAccess.getStageAccess().getConditionKeyword_1_2_0());
                    	    								
                    	    // InternalPipelineParser.g:3355:9: ( (lv_conditionValue_19_0= ruleAnyData ) )
                    	    // InternalPipelineParser.g:3356:10: (lv_conditionValue_19_0= ruleAnyData )
                    	    {
                    	    // InternalPipelineParser.g:3356:10: (lv_conditionValue_19_0= ruleAnyData )
                    	    // InternalPipelineParser.g:3357:11: lv_conditionValue_19_0= ruleAnyData
                    	    {

                    	    											newCompositeNode(grammarAccess.getStageAccess().getConditionValueAnyDataParserRuleCall_1_2_1_0());
                    	    										
                    	    pushFollow(FOLLOW_66);
                    	    lv_conditionValue_19_0=ruleAnyData();

                    	    state._fsp--;


                    	    											if (current==null) {
                    	    												current = createModelElementForParent(grammarAccess.getStageRule());
                    	    											}
                    	    											set(
                    	    												current,
                    	    												"conditionValue",
                    	    												lv_conditionValue_19_0,
                    	    												"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                    	    											afterParserOrEnumRuleCall();
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalPipelineParser.g:3380:4: ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3380:4: ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) )
                    	    // InternalPipelineParser.g:3381:5: {...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 3)");
                    	    }
                    	    // InternalPipelineParser.g:3381:102: ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) )
                    	    // InternalPipelineParser.g:3382:6: ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 3);
                    	    					
                    	    // InternalPipelineParser.g:3385:9: ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:3385:10: {...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:3385:19: (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:3385:20: otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) )
                    	    {
                    	    otherlv_20=(Token)match(input,IsSkippable,FOLLOW_3); 

                    	    									newLeafNode(otherlv_20, grammarAccess.getStageAccess().getIsSkippableKeyword_1_3_0());
                    	    								
                    	    // InternalPipelineParser.g:3389:9: ( (lv_isSkippable_21_0= RULE_ID ) )
                    	    // InternalPipelineParser.g:3390:10: (lv_isSkippable_21_0= RULE_ID )
                    	    {
                    	    // InternalPipelineParser.g:3390:10: (lv_isSkippable_21_0= RULE_ID )
                    	    // InternalPipelineParser.g:3391:11: lv_isSkippable_21_0= RULE_ID
                    	    {
                    	    lv_isSkippable_21_0=(Token)match(input,RULE_ID,FOLLOW_66); 

                    	    											newLeafNode(lv_isSkippable_21_0, grammarAccess.getStageAccess().getIsSkippableIDTerminalRuleCall_1_3_1_0());
                    	    										

                    	    											if (current==null) {
                    	    												current = createModelElement(grammarAccess.getStageRule());
                    	    											}
                    	    											setWithLastConsumed(
                    	    												current,
                    	    												"isSkippable",
                    	    												lv_isSkippable_21_0,
                    	    												"ca.mcgill.devops.pipeline.Pipeline.ID");
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalPipelineParser.g:3413:4: ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3413:4: ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) )
                    	    // InternalPipelineParser.g:3414:5: {...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 4)");
                    	    }
                    	    // InternalPipelineParser.g:3414:102: ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) )
                    	    // InternalPipelineParser.g:3415:6: ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 4);
                    	    					
                    	    // InternalPipelineParser.g:3418:9: ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) )
                    	    // InternalPipelineParser.g:3418:10: {...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:3418:19: (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* )
                    	    // InternalPipelineParser.g:3418:20: otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )*
                    	    {
                    	    otherlv_22=(Token)match(input,Variables,FOLLOW_71); 

                    	    									newLeafNode(otherlv_22, grammarAccess.getStageAccess().getVariablesKeyword_1_4_0());
                    	    								
                    	    // InternalPipelineParser.g:3422:9: ( (lv_stageVariables_23_0= ruleVariable ) )*
                    	    loop98:
                    	    do {
                    	        int alt98=2;
                    	        int LA98_0 = input.LA(1);

                    	        if ( (LA98_0==HyphenMinus) ) {
                    	            int LA98_2 = input.LA(2);

                    	            if ( (LA98_2==Group||LA98_2==Name) ) {
                    	                alt98=1;
                    	            }


                    	        }
                    	        else if ( (LA98_0==RULE_BEGIN) ) {
                    	            int LA98_3 = input.LA(2);

                    	            if ( (LA98_3==HyphenMinus) ) {
                    	                int LA98_5 = input.LA(3);

                    	                if ( (LA98_5==RULE_COMPLEX_EXPRESSION||LA98_5==RULE_ID) ) {
                    	                    alt98=1;
                    	                }


                    	            }
                    	            else if ( (LA98_3==RULE_COMPLEX_EXPRESSION||LA98_3==RULE_ID) ) {
                    	                alt98=1;
                    	            }


                    	        }


                    	        switch (alt98) {
                    	    	case 1 :
                    	    	    // InternalPipelineParser.g:3423:10: (lv_stageVariables_23_0= ruleVariable )
                    	    	    {
                    	    	    // InternalPipelineParser.g:3423:10: (lv_stageVariables_23_0= ruleVariable )
                    	    	    // InternalPipelineParser.g:3424:11: lv_stageVariables_23_0= ruleVariable
                    	    	    {

                    	    	    											newCompositeNode(grammarAccess.getStageAccess().getStageVariablesVariableParserRuleCall_1_4_1_0());
                    	    	    										
                    	    	    pushFollow(FOLLOW_71);
                    	    	    lv_stageVariables_23_0=ruleVariable();

                    	    	    state._fsp--;


                    	    	    											if (current==null) {
                    	    	    												current = createModelElementForParent(grammarAccess.getStageRule());
                    	    	    											}
                    	    	    											add(
                    	    	    												current,
                    	    	    												"stageVariables",
                    	    	    												lv_stageVariables_23_0,
                    	    	    												"ca.mcgill.devops.pipeline.Pipeline.Variable");
                    	    	    											afterParserOrEnumRuleCall();
                    	    	    										

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop98;
                    	        }
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalPipelineParser.g:3447:4: ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3447:4: ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) )
                    	    // InternalPipelineParser.g:3448:5: {...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 5)");
                    	    }
                    	    // InternalPipelineParser.g:3448:102: ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) )
                    	    // InternalPipelineParser.g:3449:6: ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 5);
                    	    					
                    	    // InternalPipelineParser.g:3452:9: ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) )
                    	    // InternalPipelineParser.g:3452:10: {...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:3452:19: (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* )
                    	    // InternalPipelineParser.g:3452:20: otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )*
                    	    {
                    	    otherlv_24=(Token)match(input,DependsOn,FOLLOW_72); 

                    	    									newLeafNode(otherlv_24, grammarAccess.getStageAccess().getDependsOnKeyword_1_5_0());
                    	    								
                    	    // InternalPipelineParser.g:3456:9: ( (otherlv_25= RULE_ID ) )*
                    	    loop99:
                    	    do {
                    	        int alt99=2;
                    	        int LA99_0 = input.LA(1);

                    	        if ( (LA99_0==RULE_ID) ) {
                    	            alt99=1;
                    	        }


                    	        switch (alt99) {
                    	    	case 1 :
                    	    	    // InternalPipelineParser.g:3457:10: (otherlv_25= RULE_ID )
                    	    	    {
                    	    	    // InternalPipelineParser.g:3457:10: (otherlv_25= RULE_ID )
                    	    	    // InternalPipelineParser.g:3458:11: otherlv_25= RULE_ID
                    	    	    {

                    	    	    											if (current==null) {
                    	    	    												current = createModelElement(grammarAccess.getStageRule());
                    	    	    											}
                    	    	    										
                    	    	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_72); 

                    	    	    											newLeafNode(otherlv_25, grammarAccess.getStageAccess().getDependsOnStageCrossReference_1_5_1_0());
                    	    	    										

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop99;
                    	        }
                    	    } while (true);


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalPipelineParser.g:3475:4: ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:3475:4: ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) )
                    	    // InternalPipelineParser.g:3476:5: {...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 6)");
                    	    }
                    	    // InternalPipelineParser.g:3476:102: ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) )
                    	    // InternalPipelineParser.g:3477:6: ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 6);
                    	    					
                    	    // InternalPipelineParser.g:3480:9: ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) )
                    	    // InternalPipelineParser.g:3480:10: {...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:3480:19: ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END )
                    	    // InternalPipelineParser.g:3480:20: (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END
                    	    {
                    	    // InternalPipelineParser.g:3480:20: (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* )
                    	    // InternalPipelineParser.g:3481:10: otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )*
                    	    {
                    	    otherlv_26=(Token)match(input,Jobs,FOLLOW_34); 

                    	    										newLeafNode(otherlv_26, grammarAccess.getStageAccess().getJobsKeyword_1_6_0_0());
                    	    									
                    	    // InternalPipelineParser.g:3485:10: ( (lv_jobs_27_0= ruleJob ) )*
                    	    loop100:
                    	    do {
                    	        int alt100=2;
                    	        int LA100_0 = input.LA(1);

                    	        if ( (LA100_0==HyphenMinus||LA100_0==RULE_ID||LA100_0==RULE_STRING) ) {
                    	            alt100=1;
                    	        }


                    	        switch (alt100) {
                    	    	case 1 :
                    	    	    // InternalPipelineParser.g:3486:11: (lv_jobs_27_0= ruleJob )
                    	    	    {
                    	    	    // InternalPipelineParser.g:3486:11: (lv_jobs_27_0= ruleJob )
                    	    	    // InternalPipelineParser.g:3487:12: lv_jobs_27_0= ruleJob
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getStageAccess().getJobsJobParserRuleCall_1_6_0_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_34);
                    	    	    lv_jobs_27_0=ruleJob();

                    	    	    state._fsp--;


                    	    	    												if (current==null) {
                    	    	    													current = createModelElementForParent(grammarAccess.getStageRule());
                    	    	    												}
                    	    	    												add(
                    	    	    													current,
                    	    	    													"jobs",
                    	    	    													lv_jobs_27_0,
                    	    	    													"ca.mcgill.devops.pipeline.Pipeline.Job");
                    	    	    												afterParserOrEnumRuleCall();
                    	    	    											

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop100;
                    	        }
                    	    } while (true);


                    	    }

                    	    this_END_28=(Token)match(input,RULE_END,FOLLOW_66); 

                    	    									newLeafNode(this_END_28, grammarAccess.getStageAccess().getENDTerminalRuleCall_1_6_1());
                    	    								

                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt101 >= 1 ) break loop101;
                                EarlyExitException eee =
                                    new EarlyExitException(101, input);
                                throw eee;
                        }
                        cnt101++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStageAccess().getUnorderedGroup_1()) ) {
                        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canLeave(grammarAccess.getStageAccess().getUnorderedGroup_1())");
                    }

                    }


                    }

                     
                    				  getUnorderedGroupHelper().leave(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    				

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStage"


    // $ANTLR start "entryRuleJob"
    // InternalPipelineParser.g:3527:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalPipelineParser.g:3527:44: (iv_ruleJob= ruleJob EOF )
            // InternalPipelineParser.g:3528:2: iv_ruleJob= ruleJob EOF
            {
             newCompositeNode(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJob=ruleJob();

            state._fsp--;

             current =iv_ruleJob; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalPipelineParser.g:3534:1: ruleJob returns [EObject current=null] : ( ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_1=null;
        Token lv_name_3_2=null;
        Token otherlv_4=null;
        Token this_BEGIN_6=null;
        Token lv_nameKW_7_1=null;
        Token lv_nameKW_7_2=null;
        Token lv_jobName_8_0=null;
        Token lv_dependKW_9_1=null;
        Token lv_dependKW_9_2=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token this_END_19=null;
        EObject lv_jobParameterValues_16_0 = null;

        EObject lv_steps_18_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3540:2: ( ( ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            // InternalPipelineParser.g:3541:2: ( ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalPipelineParser.g:3541:2: ( ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalPipelineParser.g:3542:3: ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalPipelineParser.g:3542:3: ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? )
            // InternalPipelineParser.g:3543:4: (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )?
            {
            // InternalPipelineParser.g:3543:4: (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==HyphenMinus) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalPipelineParser.g:3544:5: otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment )
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_73); 

                    					newLeafNode(otherlv_0, grammarAccess.getJobAccess().getHyphenMinusKeyword_0_0_0());
                    				
                    // InternalPipelineParser.g:3548:5: (otherlv_1= Job | otherlv_2= Deployment )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==Job) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==Deployment) ) {
                        alt103=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalPipelineParser.g:3549:6: otherlv_1= Job
                            {
                            otherlv_1=(Token)match(input,Job,FOLLOW_20); 

                            						newLeafNode(otherlv_1, grammarAccess.getJobAccess().getJobKeyword_0_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:3554:6: otherlv_2= Deployment
                            {
                            otherlv_2=(Token)match(input,Deployment,FOLLOW_20); 

                            						newLeafNode(otherlv_2, grammarAccess.getJobAccess().getDeploymentKeyword_0_0_1_1());
                            					

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:3560:4: ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) )
            // InternalPipelineParser.g:3561:5: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            {
            // InternalPipelineParser.g:3561:5: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            // InternalPipelineParser.g:3562:6: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
            {
            // InternalPipelineParser.g:3562:6: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_ID) ) {
                alt105=1;
            }
            else if ( (LA105_0==RULE_STRING) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalPipelineParser.g:3563:7: lv_name_3_1= RULE_ID
                    {
                    lv_name_3_1=(Token)match(input,RULE_ID,FOLLOW_74); 

                    							newLeafNode(lv_name_3_1, grammarAccess.getJobAccess().getNameIDTerminalRuleCall_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getJobRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_3_1,
                    								"ca.mcgill.devops.pipeline.Pipeline.ID");
                    						

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3578:7: lv_name_3_2= RULE_STRING
                    {
                    lv_name_3_2=(Token)match(input,RULE_STRING,FOLLOW_74); 

                    							newLeafNode(lv_name_3_2, grammarAccess.getJobAccess().getNameSTRINGTerminalRuleCall_0_1_0_1());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getJobRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_3_2,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }
                    break;

            }


            }


            }

            // InternalPipelineParser.g:3595:4: (otherlv_4= Colon )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==Colon) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalPipelineParser.g:3596:5: otherlv_4= Colon
                    {
                    otherlv_4=(Token)match(input,Colon,FOLLOW_75); 

                    					newLeafNode(otherlv_4, grammarAccess.getJobAccess().getColonKeyword_0_2());
                    				

                    }
                    break;

            }


            }

            // InternalPipelineParser.g:3602:3: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalPipelineParser.g:3603:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalPipelineParser.g:3603:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) )
            // InternalPipelineParser.g:3604:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_1());
            				
            // InternalPipelineParser.g:3607:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?)
            // InternalPipelineParser.g:3608:6: ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalPipelineParser.g:3608:6: ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+
            int cnt115=0;
            loop115:
            do {
                int alt115=4;
                alt115 = dfa115.predict(input);
                switch (alt115) {
            	case 1 :
            	    // InternalPipelineParser.g:3609:4: ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // InternalPipelineParser.g:3609:4: ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) )
            	    // InternalPipelineParser.g:3610:5: {...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalPipelineParser.g:3610:100: ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) )
            	    // InternalPipelineParser.g:3611:6: ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalPipelineParser.g:3614:9: ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) )
            	    // InternalPipelineParser.g:3614:10: {...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalPipelineParser.g:3614:19: (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? )
            	    // InternalPipelineParser.g:3614:20: this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )?
            	    {
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_76); 

            	    									newLeafNode(this_BEGIN_6, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_1_0_0());
            	    								
            	    // InternalPipelineParser.g:3618:9: ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==Name) ) {
            	        int LA108_1 = input.LA(2);

            	        if ( (LA108_1==RULE_STRING) ) {
            	            alt108=1;
            	        }
            	    }
            	    else if ( (LA108_0==DisplayName) ) {
            	        int LA108_2 = input.LA(2);

            	        if ( (LA108_2==RULE_STRING) ) {
            	            alt108=1;
            	        }
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // InternalPipelineParser.g:3619:10: ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) )
            	            {
            	            // InternalPipelineParser.g:3619:10: ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) )
            	            // InternalPipelineParser.g:3620:11: ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) )
            	            {
            	            // InternalPipelineParser.g:3620:11: ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) )
            	            // InternalPipelineParser.g:3621:12: (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName )
            	            {
            	            // InternalPipelineParser.g:3621:12: (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName )
            	            int alt107=2;
            	            int LA107_0 = input.LA(1);

            	            if ( (LA107_0==Name) ) {
            	                alt107=1;
            	            }
            	            else if ( (LA107_0==DisplayName) ) {
            	                alt107=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 107, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt107) {
            	                case 1 :
            	                    // InternalPipelineParser.g:3622:13: lv_nameKW_7_1= Name
            	                    {
            	                    lv_nameKW_7_1=(Token)match(input,Name,FOLLOW_8); 

            	                    													newLeafNode(lv_nameKW_7_1, grammarAccess.getJobAccess().getNameKWNameKeyword_1_0_1_0_0_0());
            	                    												

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getJobRule());
            	                    													}
            	                    													setWithLastConsumed(current, "nameKW", lv_nameKW_7_1, null);
            	                    												

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalPipelineParser.g:3633:13: lv_nameKW_7_2= DisplayName
            	                    {
            	                    lv_nameKW_7_2=(Token)match(input,DisplayName,FOLLOW_8); 

            	                    													newLeafNode(lv_nameKW_7_2, grammarAccess.getJobAccess().getNameKWDisplayNameKeyword_1_0_1_0_0_1());
            	                    												

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getJobRule());
            	                    													}
            	                    													setWithLastConsumed(current, "nameKW", lv_nameKW_7_2, null);
            	                    												

            	                    }
            	                    break;

            	            }


            	            }


            	            }

            	            // InternalPipelineParser.g:3646:10: ( (lv_jobName_8_0= RULE_STRING ) )
            	            // InternalPipelineParser.g:3647:11: (lv_jobName_8_0= RULE_STRING )
            	            {
            	            // InternalPipelineParser.g:3647:11: (lv_jobName_8_0= RULE_STRING )
            	            // InternalPipelineParser.g:3648:12: lv_jobName_8_0= RULE_STRING
            	            {
            	            lv_jobName_8_0=(Token)match(input,RULE_STRING,FOLLOW_76); 

            	            												newLeafNode(lv_jobName_8_0, grammarAccess.getJobAccess().getJobNameSTRINGTerminalRuleCall_1_0_1_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getJobRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"jobName",
            	            													lv_jobName_8_0,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:3671:4: ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:3671:4: ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) )
            	    // InternalPipelineParser.g:3672:5: {...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalPipelineParser.g:3672:100: ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) )
            	    // InternalPipelineParser.g:3673:6: ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalPipelineParser.g:3676:9: ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) )
            	    // InternalPipelineParser.g:3676:10: {...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalPipelineParser.g:3676:19: ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) )
            	    // InternalPipelineParser.g:3676:20: ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) )
            	    {
            	    // InternalPipelineParser.g:3676:20: ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) )
            	    // InternalPipelineParser.g:3677:10: ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) )
            	    {
            	    // InternalPipelineParser.g:3677:10: ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) )
            	    // InternalPipelineParser.g:3678:11: (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn )
            	    {
            	    // InternalPipelineParser.g:3678:11: (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn )
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==Needs) ) {
            	        alt109=1;
            	    }
            	    else if ( (LA109_0==DependsOn) ) {
            	        alt109=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 109, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // InternalPipelineParser.g:3679:12: lv_dependKW_9_1= Needs
            	            {
            	            lv_dependKW_9_1=(Token)match(input,Needs,FOLLOW_77); 

            	            												newLeafNode(lv_dependKW_9_1, grammarAccess.getJobAccess().getDependKWNeedsKeyword_1_1_0_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getJobRule());
            	            												}
            	            												setWithLastConsumed(current, "dependKW", lv_dependKW_9_1, null);
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:3690:12: lv_dependKW_9_2= DependsOn
            	            {
            	            lv_dependKW_9_2=(Token)match(input,DependsOn,FOLLOW_77); 

            	            												newLeafNode(lv_dependKW_9_2, grammarAccess.getJobAccess().getDependKWDependsOnKeyword_1_1_0_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getJobRule());
            	            												}
            	            												setWithLastConsumed(current, "dependKW", lv_dependKW_9_2, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalPipelineParser.g:3703:9: ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) )
            	    int alt111=2;
            	    int LA111_0 = input.LA(1);

            	    if ( (LA111_0==RULE_ID) ) {
            	        alt111=1;
            	    }
            	    else if ( (LA111_0==LeftSquareBracket) ) {
            	        alt111=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 111, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt111) {
            	        case 1 :
            	            // InternalPipelineParser.g:3704:10: ( (otherlv_10= RULE_ID ) )
            	            {
            	            // InternalPipelineParser.g:3704:10: ( (otherlv_10= RULE_ID ) )
            	            // InternalPipelineParser.g:3705:11: (otherlv_10= RULE_ID )
            	            {
            	            // InternalPipelineParser.g:3705:11: (otherlv_10= RULE_ID )
            	            // InternalPipelineParser.g:3706:12: otherlv_10= RULE_ID
            	            {

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getJobRule());
            	            												}
            	            											
            	            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_76); 

            	            												newLeafNode(otherlv_10, grammarAccess.getJobAccess().getReferencesJobCrossReference_1_1_1_0_0());
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:3718:10: (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket )
            	            {
            	            // InternalPipelineParser.g:3718:10: (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket )
            	            // InternalPipelineParser.g:3719:11: otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket
            	            {
            	            otherlv_11=(Token)match(input,LeftSquareBracket,FOLLOW_3); 

            	            											newLeafNode(otherlv_11, grammarAccess.getJobAccess().getLeftSquareBracketKeyword_1_1_1_1_0());
            	            										
            	            // InternalPipelineParser.g:3723:11: ( (otherlv_12= RULE_ID ) )
            	            // InternalPipelineParser.g:3724:12: (otherlv_12= RULE_ID )
            	            {
            	            // InternalPipelineParser.g:3724:12: (otherlv_12= RULE_ID )
            	            // InternalPipelineParser.g:3725:13: otherlv_12= RULE_ID
            	            {

            	            													if (current==null) {
            	            														current = createModelElement(grammarAccess.getJobRule());
            	            													}
            	            												
            	            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_32); 

            	            													newLeafNode(otherlv_12, grammarAccess.getJobAccess().getReferencesJobCrossReference_1_1_1_1_1_0());
            	            												

            	            }


            	            }

            	            // InternalPipelineParser.g:3736:11: (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )*
            	            loop110:
            	            do {
            	                int alt110=2;
            	                int LA110_0 = input.LA(1);

            	                if ( (LA110_0==Comma) ) {
            	                    alt110=1;
            	                }


            	                switch (alt110) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:3737:12: otherlv_13= Comma ( (otherlv_14= RULE_ID ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,Comma,FOLLOW_3); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getJobAccess().getCommaKeyword_1_1_1_1_2_0());
            	            	    											
            	            	    // InternalPipelineParser.g:3741:12: ( (otherlv_14= RULE_ID ) )
            	            	    // InternalPipelineParser.g:3742:13: (otherlv_14= RULE_ID )
            	            	    {
            	            	    // InternalPipelineParser.g:3742:13: (otherlv_14= RULE_ID )
            	            	    // InternalPipelineParser.g:3743:14: otherlv_14= RULE_ID
            	            	    {

            	            	    														if (current==null) {
            	            	    															current = createModelElement(grammarAccess.getJobRule());
            	            	    														}
            	            	    													
            	            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_32); 

            	            	    														newLeafNode(otherlv_14, grammarAccess.getJobAccess().getReferencesJobCrossReference_1_1_1_1_2_1_0());
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop110;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,RightSquareBracket,FOLLOW_76); 

            	            											newLeafNode(otherlv_15, grammarAccess.getJobAccess().getRightSquareBracketKeyword_1_1_1_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPipelineParser.g:3767:4: ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) )
            	    {
            	    // InternalPipelineParser.g:3767:4: ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:3768:5: {...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalPipelineParser.g:3768:100: ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) )
            	    // InternalPipelineParser.g:3769:6: ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalPipelineParser.g:3772:9: ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) )
            	    // InternalPipelineParser.g:3772:10: {...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalPipelineParser.g:3772:19: ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END )
            	    // InternalPipelineParser.g:3772:20: ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END
            	    {
            	    // InternalPipelineParser.g:3772:20: ( (lv_jobParameterValues_16_0= ruleJobParameter ) )*
            	    loop112:
            	    do {
            	        int alt112=2;
            	        int LA112_0 = input.LA(1);

            	        if ( (LA112_0==Steps) ) {
            	            int LA112_1 = input.LA(2);

            	            if ( (LA112_1==LeftSquareBracket||(LA112_1>=RULE_COMPLEX_EXPRESSION && LA112_1<=RULE_BEGIN)||LA112_1==RULE_ID||LA112_1==RULE_STRING) ) {
            	                alt112=1;
            	            }


            	        }
            	        else if ( (LA112_0==Repository_dispatch||(LA112_0>=ContinueOnError_1 && LA112_0<=Pull_request)||(LA112_0>=Requirements && LA112_0<=Environment)||(LA112_0>=Permissions && LA112_0<=Conditions)||LA112_0==Deployment||LA112_0==Parameters||(LA112_0>=Repository && LA112_0<=Endpoints)||(LA112_0>=FailFast && LA112_0<=RunPolicy)||(LA112_0>=Variables && LA112_0<=Checkout)||LA112_0==Defaults||LA112_0==MaxTime||(LA112_0>=Parallel && LA112_0<=PreBuild)||(LA112_0>=RunName && LA112_0<=Timeouts)||(LA112_0>=Command && LA112_0<=Default)||(LA112_0>=Exclude && LA112_0<=Project)||(LA112_0>=Release && LA112_0<=VmImage)||(LA112_0>=Caches && LA112_0<=Docker)||(LA112_0>=Except && LA112_0<=Agent)||(LA112_0>=Cache && LA112_0<=Final)||(LA112_0>=Image && LA112_0<=Stage)||LA112_0==Tasks||LA112_0==Auth||LA112_0==Cron||(LA112_0>=Name && LA112_0<=Only)||(LA112_0>=Plan && LA112_0<=Push)||(LA112_0>=Step && LA112_0<=With)||(LA112_0>=Env && LA112_0<=Jdk)||(LA112_0>=Run && LA112_0<=On)||LA112_0==RULE_ID) ) {
            	            alt112=1;
            	        }


            	        switch (alt112) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:3773:10: (lv_jobParameterValues_16_0= ruleJobParameter )
            	    	    {
            	    	    // InternalPipelineParser.g:3773:10: (lv_jobParameterValues_16_0= ruleJobParameter )
            	    	    // InternalPipelineParser.g:3774:11: lv_jobParameterValues_16_0= ruleJobParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getJobAccess().getJobParameterValuesJobParameterParserRuleCall_1_2_0_0());
            	    	    										
            	    	    pushFollow(FOLLOW_78);
            	    	    lv_jobParameterValues_16_0=ruleJobParameter();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"jobParameterValues",
            	    	    												lv_jobParameterValues_16_0,
            	    	    												"ca.mcgill.devops.pipeline.Pipeline.JobParameter");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop112;
            	        }
            	    } while (true);

            	    // InternalPipelineParser.g:3791:9: (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )?
            	    int alt114=2;
            	    int LA114_0 = input.LA(1);

            	    if ( (LA114_0==Steps) ) {
            	        alt114=1;
            	    }
            	    switch (alt114) {
            	        case 1 :
            	            // InternalPipelineParser.g:3792:10: otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )*
            	            {
            	            otherlv_17=(Token)match(input,Steps,FOLLOW_35); 

            	            										newLeafNode(otherlv_17, grammarAccess.getJobAccess().getStepsKeyword_1_2_1_0());
            	            									
            	            // InternalPipelineParser.g:3796:10: ( (lv_steps_18_0= ruleStep ) )*
            	            loop113:
            	            do {
            	                int alt113=2;
            	                int LA113_0 = input.LA(1);

            	                if ( (LA113_0==HyphenMinus) ) {
            	                    alt113=1;
            	                }


            	                switch (alt113) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:3797:11: (lv_steps_18_0= ruleStep )
            	            	    {
            	            	    // InternalPipelineParser.g:3797:11: (lv_steps_18_0= ruleStep )
            	            	    // InternalPipelineParser.g:3798:12: lv_steps_18_0= ruleStep
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_1_2_1_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_35);
            	            	    lv_steps_18_0=ruleStep();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getJobRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"steps",
            	            	    													lv_steps_18_0,
            	            	    													"ca.mcgill.devops.pipeline.Pipeline.Step");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop113;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    this_END_19=(Token)match(input,RULE_END,FOLLOW_76); 

            	    									newLeafNode(this_END_19, grammarAccess.getJobAccess().getENDTerminalRuleCall_1_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt115 >= 1 ) break loop115;
                        EarlyExitException eee =
                            new EarlyExitException(115, input);
                        throw eee;
                }
                cnt115++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJobAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleJobParameter"
    // InternalPipelineParser.g:3838:1: entryRuleJobParameter returns [EObject current=null] : iv_ruleJobParameter= ruleJobParameter EOF ;
    public final EObject entryRuleJobParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobParameter = null;


        try {
            // InternalPipelineParser.g:3838:53: (iv_ruleJobParameter= ruleJobParameter EOF )
            // InternalPipelineParser.g:3839:2: iv_ruleJobParameter= ruleJobParameter EOF
            {
             newCompositeNode(grammarAccess.getJobParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJobParameter=ruleJobParameter();

            state._fsp--;

             current =iv_ruleJobParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJobParameter"


    // $ANTLR start "ruleJobParameter"
    // InternalPipelineParser.g:3845:1: ruleJobParameter returns [EObject current=null] : ( ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) ) ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) ) ) ;
    public final EObject ruleJobParameter() throws RecognitionException {
        EObject current = null;

        Token lv_otherName_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Enumerator lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_1 = null;

        AntlrDatatypeRuleToken lv_value_3_2 = null;

        EObject lv_subParameters_5_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3851:2: ( ( ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) ) ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) ) ) )
            // InternalPipelineParser.g:3852:2: ( ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) ) ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) ) )
            {
            // InternalPipelineParser.g:3852:2: ( ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) ) ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) ) )
            // InternalPipelineParser.g:3853:3: ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) ) ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) )
            {
            // InternalPipelineParser.g:3853:3: ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==Repository_dispatch||(LA116_0>=ContinueOnError_1 && LA116_0<=Pull_request)||(LA116_0>=Requirements && LA116_0<=Environment)||(LA116_0>=Permissions && LA116_0<=Conditions)||LA116_0==Deployment||LA116_0==Parameters||(LA116_0>=Repository && LA116_0<=Endpoints)||(LA116_0>=FailFast && LA116_0<=RunPolicy)||(LA116_0>=Variables && LA116_0<=Checkout)||LA116_0==Defaults||LA116_0==MaxTime||(LA116_0>=Parallel && LA116_0<=PreBuild)||(LA116_0>=RunName && LA116_0<=Timeouts)||(LA116_0>=Command && LA116_0<=Default)||(LA116_0>=Exclude && LA116_0<=Project)||(LA116_0>=Release && LA116_0<=VmImage)||(LA116_0>=Caches && LA116_0<=Docker)||(LA116_0>=Except && LA116_0<=Agent)||(LA116_0>=Cache && LA116_0<=Final)||(LA116_0>=Image && LA116_0<=Tasks)||LA116_0==Auth||LA116_0==Cron||(LA116_0>=Name && LA116_0<=Only)||(LA116_0>=Plan && LA116_0<=Push)||(LA116_0>=Step && LA116_0<=With)||(LA116_0>=Env && LA116_0<=Jdk)||(LA116_0>=Run && LA116_0<=On)) ) {
                alt116=1;
            }
            else if ( (LA116_0==RULE_ID) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalPipelineParser.g:3854:4: ( (lv_name_0_0= rulePipelineKeyword ) )
                    {
                    // InternalPipelineParser.g:3854:4: ( (lv_name_0_0= rulePipelineKeyword ) )
                    // InternalPipelineParser.g:3855:5: (lv_name_0_0= rulePipelineKeyword )
                    {
                    // InternalPipelineParser.g:3855:5: (lv_name_0_0= rulePipelineKeyword )
                    // InternalPipelineParser.g:3856:6: lv_name_0_0= rulePipelineKeyword
                    {

                    						newCompositeNode(grammarAccess.getJobParameterAccess().getNamePipelineKeywordEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_name_0_0=rulePipelineKeyword();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobParameterRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"ca.mcgill.devops.pipeline.Pipeline.PipelineKeyword");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3874:4: ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon )
                    {
                    // InternalPipelineParser.g:3874:4: ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon )
                    // InternalPipelineParser.g:3875:5: ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon
                    {
                    // InternalPipelineParser.g:3875:5: ( (lv_otherName_1_0= RULE_ID ) )
                    // InternalPipelineParser.g:3876:6: (lv_otherName_1_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:3876:6: (lv_otherName_1_0= RULE_ID )
                    // InternalPipelineParser.g:3877:7: lv_otherName_1_0= RULE_ID
                    {
                    lv_otherName_1_0=(Token)match(input,RULE_ID,FOLLOW_80); 

                    							newLeafNode(lv_otherName_1_0, grammarAccess.getJobParameterAccess().getOtherNameIDTerminalRuleCall_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getJobParameterRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"otherName",
                    								lv_otherName_1_0,
                    								"ca.mcgill.devops.pipeline.Pipeline.ID");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,Colon,FOLLOW_79); 

                    					newLeafNode(otherlv_2, grammarAccess.getJobParameterAccess().getColonKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:3899:3: ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==LeftSquareBracket||(LA119_0>=RULE_COMPLEX_EXPRESSION && LA119_0<=RULE_VERSION)||LA119_0==RULE_ID||LA119_0==RULE_STRING) ) {
                alt119=1;
            }
            else if ( (LA119_0==RULE_BEGIN) ) {
                alt119=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // InternalPipelineParser.g:3900:4: ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) )
                    {
                    // InternalPipelineParser.g:3900:4: ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) )
                    // InternalPipelineParser.g:3901:5: ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) )
                    {
                    // InternalPipelineParser.g:3901:5: ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) )
                    // InternalPipelineParser.g:3902:6: (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList )
                    {
                    // InternalPipelineParser.g:3902:6: (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList )
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( ((LA117_0>=RULE_COMPLEX_EXPRESSION && LA117_0<=RULE_VERSION)||LA117_0==RULE_ID||LA117_0==RULE_STRING) ) {
                        alt117=1;
                    }
                    else if ( (LA117_0==LeftSquareBracket) ) {
                        alt117=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 117, 0, input);

                        throw nvae;
                    }
                    switch (alt117) {
                        case 1 :
                            // InternalPipelineParser.g:3903:7: lv_value_3_1= ruleAnyData
                            {

                            							newCompositeNode(grammarAccess.getJobParameterAccess().getValueAnyDataParserRuleCall_1_0_0_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_3_1=ruleAnyData();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getJobParameterRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_3_1,
                            								"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:3919:7: lv_value_3_2= ruleArrayList
                            {

                            							newCompositeNode(grammarAccess.getJobParameterAccess().getValueArrayListParserRuleCall_1_0_0_1());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_3_2=ruleArrayList();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getJobParameterRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_3_2,
                            								"ca.mcgill.devops.pipeline.Pipeline.ArrayList");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3938:4: (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:3938:4: (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END )
                    // InternalPipelineParser.g:3939:5: this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_81); 

                    					newLeafNode(this_BEGIN_4, grammarAccess.getJobParameterAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:3943:5: ( (lv_subParameters_5_0= ruleJobParameter ) )+
                    int cnt118=0;
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==Repository_dispatch||(LA118_0>=ContinueOnError_1 && LA118_0<=Pull_request)||(LA118_0>=Requirements && LA118_0<=Environment)||(LA118_0>=Permissions && LA118_0<=Conditions)||LA118_0==Deployment||LA118_0==Parameters||(LA118_0>=Repository && LA118_0<=Endpoints)||(LA118_0>=FailFast && LA118_0<=RunPolicy)||(LA118_0>=Variables && LA118_0<=Checkout)||LA118_0==Defaults||LA118_0==MaxTime||(LA118_0>=Parallel && LA118_0<=PreBuild)||(LA118_0>=RunName && LA118_0<=Timeouts)||(LA118_0>=Command && LA118_0<=Default)||(LA118_0>=Exclude && LA118_0<=Project)||(LA118_0>=Release && LA118_0<=VmImage)||(LA118_0>=Caches && LA118_0<=Docker)||(LA118_0>=Except && LA118_0<=Agent)||(LA118_0>=Cache && LA118_0<=Final)||(LA118_0>=Image && LA118_0<=Tasks)||LA118_0==Auth||LA118_0==Cron||(LA118_0>=Name && LA118_0<=Only)||(LA118_0>=Plan && LA118_0<=Push)||(LA118_0>=Step && LA118_0<=With)||(LA118_0>=Env && LA118_0<=Jdk)||(LA118_0>=Run && LA118_0<=On)||LA118_0==RULE_ID) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3944:6: (lv_subParameters_5_0= ruleJobParameter )
                    	    {
                    	    // InternalPipelineParser.g:3944:6: (lv_subParameters_5_0= ruleJobParameter )
                    	    // InternalPipelineParser.g:3945:7: lv_subParameters_5_0= ruleJobParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobParameterAccess().getSubParametersJobParameterParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_78);
                    	    lv_subParameters_5_0=ruleJobParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subParameters",
                    	    								lv_subParameters_5_0,
                    	    								"ca.mcgill.devops.pipeline.Pipeline.JobParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt118 >= 1 ) break loop118;
                                EarlyExitException eee =
                                    new EarlyExitException(118, input);
                                throw eee;
                        }
                        cnt118++;
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_6, grammarAccess.getJobParameterAccess().getENDTerminalRuleCall_1_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJobParameter"


    // $ANTLR start "entryRuleStep"
    // InternalPipelineParser.g:3972:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalPipelineParser.g:3972:45: (iv_ruleStep= ruleStep EOF )
            // InternalPipelineParser.g:3973:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalPipelineParser.g:3979:1: ruleStep returns [EObject current=null] : (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Action_1 = null;

        EObject this_Script_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3985:2: ( (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) ) )
            // InternalPipelineParser.g:3986:2: (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) )
            {
            // InternalPipelineParser.g:3986:2: (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) )
            // InternalPipelineParser.g:3987:3: otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript )
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_82); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getHyphenMinusKeyword_0());
            		
            // InternalPipelineParser.g:3991:3: (this_Action_1= ruleAction | this_Script_2= ruleScript )
            int alt120=2;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // InternalPipelineParser.g:3992:4: this_Action_1= ruleAction
                    {

                    				newCompositeNode(grammarAccess.getStepAccess().getActionParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Action_1=ruleAction();

                    state._fsp--;


                    				current = this_Action_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4001:4: this_Script_2= ruleScript
                    {

                    				newCompositeNode(grammarAccess.getStepAccess().getScriptParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Script_2=ruleScript();

                    state._fsp--;


                    				current = this_Script_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleScript"
    // InternalPipelineParser.g:4014:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalPipelineParser.g:4014:47: (iv_ruleScript= ruleScript EOF )
            // InternalPipelineParser.g:4015:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalPipelineParser.g:4021:1: ruleScript returns [EObject current=null] : ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token lv_name_0_3=null;
        Token lv_name_0_4=null;
        Token lv_name_0_5=null;
        Token lv_name_0_6=null;
        Token lv_name_0_7=null;
        Token lv_name_0_8=null;
        Token lv_name_0_9=null;
        Token lv_name_0_10=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        AntlrDatatypeRuleToken lv_command_1_0 = null;

        AntlrDatatypeRuleToken lv_command_5_0 = null;

        EObject lv_subSteps_8_1 = null;

        EObject lv_subSteps_8_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:4027:2: ( ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? ) )
            // InternalPipelineParser.g:4028:2: ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? )
            {
            // InternalPipelineParser.g:4028:2: ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? )
            // InternalPipelineParser.g:4029:3: ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )?
            {
            // InternalPipelineParser.g:4029:3: ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) )
            // InternalPipelineParser.g:4030:4: ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) )
            {
            // InternalPipelineParser.g:4030:4: ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) )
            // InternalPipelineParser.g:4031:5: ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) )
            {
            // InternalPipelineParser.g:4031:5: ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) )
            // InternalPipelineParser.g:4032:6: (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task )
            {
            // InternalPipelineParser.g:4032:6: (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task )
            int alt121=10;
            switch ( input.LA(1) ) {
            case Run:
                {
                alt121=1;
                }
                break;
            case Script:
                {
                alt121=2;
                }
                break;
            case Bash:
                {
                alt121=3;
                }
                break;
            case Pwsh:
                {
                alt121=4;
                }
                break;
            case Powershell:
                {
                alt121=5;
                }
                break;
            case Checkout:
                {
                alt121=6;
                }
                break;
            case Download:
                {
                alt121=7;
                }
                break;
            case GetPackage:
                {
                alt121=8;
                }
                break;
            case Publish:
                {
                alt121=9;
                }
                break;
            case Task:
                {
                alt121=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // InternalPipelineParser.g:4033:7: lv_name_0_1= Run
                    {
                    lv_name_0_1=(Token)match(input,Run,FOLLOW_83); 

                    							newLeafNode(lv_name_0_1, grammarAccess.getScriptAccess().getNameRunKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_1, null);
                    						

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4044:7: lv_name_0_2= Script
                    {
                    lv_name_0_2=(Token)match(input,Script,FOLLOW_83); 

                    							newLeafNode(lv_name_0_2, grammarAccess.getScriptAccess().getNameScriptKeyword_0_0_0_1());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_2, null);
                    						

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:4055:7: lv_name_0_3= Bash
                    {
                    lv_name_0_3=(Token)match(input,Bash,FOLLOW_83); 

                    							newLeafNode(lv_name_0_3, grammarAccess.getScriptAccess().getNameBashKeyword_0_0_0_2());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_3, null);
                    						

                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:4066:7: lv_name_0_4= Pwsh
                    {
                    lv_name_0_4=(Token)match(input,Pwsh,FOLLOW_83); 

                    							newLeafNode(lv_name_0_4, grammarAccess.getScriptAccess().getNamePwshKeyword_0_0_0_3());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_4, null);
                    						

                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:4077:7: lv_name_0_5= Powershell
                    {
                    lv_name_0_5=(Token)match(input,Powershell,FOLLOW_83); 

                    							newLeafNode(lv_name_0_5, grammarAccess.getScriptAccess().getNamePowershellKeyword_0_0_0_4());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_5, null);
                    						

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:4088:7: lv_name_0_6= Checkout
                    {
                    lv_name_0_6=(Token)match(input,Checkout,FOLLOW_83); 

                    							newLeafNode(lv_name_0_6, grammarAccess.getScriptAccess().getNameCheckoutKeyword_0_0_0_5());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_6, null);
                    						

                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:4099:7: lv_name_0_7= Download
                    {
                    lv_name_0_7=(Token)match(input,Download,FOLLOW_83); 

                    							newLeafNode(lv_name_0_7, grammarAccess.getScriptAccess().getNameDownloadKeyword_0_0_0_6());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_7, null);
                    						

                    }
                    break;
                case 8 :
                    // InternalPipelineParser.g:4110:7: lv_name_0_8= GetPackage
                    {
                    lv_name_0_8=(Token)match(input,GetPackage,FOLLOW_83); 

                    							newLeafNode(lv_name_0_8, grammarAccess.getScriptAccess().getNameGetPackageKeyword_0_0_0_7());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_8, null);
                    						

                    }
                    break;
                case 9 :
                    // InternalPipelineParser.g:4121:7: lv_name_0_9= Publish
                    {
                    lv_name_0_9=(Token)match(input,Publish,FOLLOW_83); 

                    							newLeafNode(lv_name_0_9, grammarAccess.getScriptAccess().getNamePublishKeyword_0_0_0_8());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_9, null);
                    						

                    }
                    break;
                case 10 :
                    // InternalPipelineParser.g:4132:7: lv_name_0_10= Task
                    {
                    lv_name_0_10=(Token)match(input,Task,FOLLOW_83); 

                    							newLeafNode(lv_name_0_10, grammarAccess.getScriptAccess().getNameTaskKeyword_0_0_0_9());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_10, null);
                    						

                    }
                    break;

            }


            }


            }

            // InternalPipelineParser.g:4145:4: ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( ((LA123_0>=RULE_COMPLEX_EXPRESSION && LA123_0<=RULE_VERSION)||LA123_0==RULE_ID||LA123_0==RULE_STRING) ) {
                alt123=1;
            }
            else if ( (LA123_0==GreaterThanSignHyphenMinus||LA123_0==VerticalLine) ) {
                alt123=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // InternalPipelineParser.g:4146:5: ( (lv_command_1_0= ruleAnyData ) )
                    {
                    // InternalPipelineParser.g:4146:5: ( (lv_command_1_0= ruleAnyData ) )
                    // InternalPipelineParser.g:4147:6: (lv_command_1_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:4147:6: (lv_command_1_0= ruleAnyData )
                    // InternalPipelineParser.g:4148:7: lv_command_1_0= ruleAnyData
                    {

                    							newCompositeNode(grammarAccess.getScriptAccess().getCommandAnyDataParserRuleCall_0_1_0_0());
                    						
                    pushFollow(FOLLOW_61);
                    lv_command_1_0=ruleAnyData();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getScriptRule());
                    							}
                    							set(
                    								current,
                    								"command",
                    								lv_command_1_0,
                    								"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4166:5: ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:4166:5: ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END )
                    // InternalPipelineParser.g:4167:6: (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END
                    {
                    // InternalPipelineParser.g:4167:6: (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus )
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==VerticalLine) ) {
                        alt122=1;
                    }
                    else if ( (LA122_0==GreaterThanSignHyphenMinus) ) {
                        alt122=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 122, 0, input);

                        throw nvae;
                    }
                    switch (alt122) {
                        case 1 :
                            // InternalPipelineParser.g:4168:7: otherlv_2= VerticalLine
                            {
                            otherlv_2=(Token)match(input,VerticalLine,FOLLOW_5); 

                            							newLeafNode(otherlv_2, grammarAccess.getScriptAccess().getVerticalLineKeyword_0_1_1_0_0());
                            						

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:4173:7: otherlv_3= GreaterThanSignHyphenMinus
                            {
                            otherlv_3=(Token)match(input,GreaterThanSignHyphenMinus,FOLLOW_5); 

                            							newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getGreaterThanSignHyphenMinusKeyword_0_1_1_0_1());
                            						

                            }
                            break;

                    }

                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_40); 

                    						newLeafNode(this_BEGIN_4, grammarAccess.getScriptAccess().getBEGINTerminalRuleCall_0_1_1_1());
                    					
                    // InternalPipelineParser.g:4182:6: ( (lv_command_5_0= ruleAnyData ) )
                    // InternalPipelineParser.g:4183:7: (lv_command_5_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:4183:7: (lv_command_5_0= ruleAnyData )
                    // InternalPipelineParser.g:4184:8: lv_command_5_0= ruleAnyData
                    {

                    								newCompositeNode(grammarAccess.getScriptAccess().getCommandAnyDataParserRuleCall_0_1_1_2_0());
                    							
                    pushFollow(FOLLOW_9);
                    lv_command_5_0=ruleAnyData();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getScriptRule());
                    								}
                    								set(
                    									current,
                    									"command",
                    									lv_command_5_0,
                    									"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_61); 

                    						newLeafNode(this_END_6, grammarAccess.getScriptAccess().getENDTerminalRuleCall_0_1_1_3());
                    					

                    }


                    }
                    break;

            }


            }

            // InternalPipelineParser.g:4208:3: (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_BEGIN) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalPipelineParser.g:4209:4: this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END
                    {
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_84); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getScriptAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:4213:4: ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==Repository_dispatch||(LA125_0>=ContinueOnError_1 && LA125_0<=Pull_request)||(LA125_0>=Requirements && LA125_0<=Environment)||(LA125_0>=Permissions && LA125_0<=Conditions)||(LA125_0>=Deployment && LA125_0<=Parameters)||(LA125_0>=Powershell && LA125_0<=Endpoints)||(LA125_0>=FailFast && LA125_0<=RunPolicy)||(LA125_0>=Variables && LA125_0<=Checkout)||(LA125_0>=Defaults && LA125_0<=MaxTime)||(LA125_0>=Parallel && LA125_0<=PreBuild)||(LA125_0>=RunName && LA125_0<=Timeouts)||(LA125_0>=Command && LA125_0<=Default)||(LA125_0>=Exclude && LA125_0<=VmImage)||(LA125_0>=Caches && LA125_0<=Docker)||(LA125_0>=Except && LA125_0<=Agent)||(LA125_0>=Cache && LA125_0<=Final)||(LA125_0>=Image && LA125_0<=Tasks)||(LA125_0>=Auth && LA125_0<=Cron)||(LA125_0>=Name && LA125_0<=Only)||(LA125_0>=Plan && LA125_0<=With)||(LA125_0>=Env && LA125_0<=Jdk)||(LA125_0>=Run && LA125_0<=On)||LA125_0==RULE_ID) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalPipelineParser.g:4214:5: ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) )
                    	    {
                    	    // InternalPipelineParser.g:4214:5: ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) )
                    	    // InternalPipelineParser.g:4215:6: (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript )
                    	    {
                    	    // InternalPipelineParser.g:4215:6: (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript )
                    	    int alt124=2;
                    	    alt124 = dfa124.predict(input);
                    	    switch (alt124) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:4216:7: lv_subSteps_8_1= ruleAction
                    	            {

                    	            							newCompositeNode(grammarAccess.getScriptAccess().getSubStepsActionParserRuleCall_1_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_84);
                    	            lv_subSteps_8_1=ruleAction();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScriptRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"subSteps",
                    	            								lv_subSteps_8_1,
                    	            								"ca.mcgill.devops.pipeline.Pipeline.Action");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:4232:7: lv_subSteps_8_2= ruleScript
                    	            {

                    	            							newCompositeNode(grammarAccess.getScriptAccess().getSubStepsScriptParserRuleCall_1_1_0_1());
                    	            						
                    	            pushFollow(FOLLOW_84);
                    	            lv_subSteps_8_2=ruleScript();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScriptRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"subSteps",
                    	            								lv_subSteps_8_2,
                    	            								"ca.mcgill.devops.pipeline.Pipeline.Script");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop125;
                        }
                    } while (true);

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_9, grammarAccess.getScriptAccess().getENDTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleAction"
    // InternalPipelineParser.g:4259:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPipelineParser.g:4259:47: (iv_ruleAction= ruleAction EOF )
            // InternalPipelineParser.g:4260:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalPipelineParser.g:4266:1: ruleAction returns [EObject current=null] : ( ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stepName_1_0=null;
        Token lv_otherKeyword_3_0=null;
        Token otherlv_4=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Enumerator lv_actionKeyword_2_0 = null;

        AntlrDatatypeRuleToken lv_actionValue_5_0 = null;

        EObject lv_subSteps_7_1 = null;

        EObject lv_subSteps_7_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:4272:2: ( ( ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )? ) )
            // InternalPipelineParser.g:4273:2: ( ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )? )
            {
            // InternalPipelineParser.g:4273:2: ( ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )? )
            // InternalPipelineParser.g:4274:3: ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )?
            {
            // InternalPipelineParser.g:4274:3: ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==Name) ) {
                int LA129_1 = input.LA(2);

                if ( (LA129_1==RULE_STRING) ) {
                    alt129=1;
                }
                else if ( (LA129_1==EOF||LA129_1==Repository_dispatch||(LA129_1>=ContinueOnError_1 && LA129_1<=Pull_request)||(LA129_1>=Requirements && LA129_1<=Environment)||(LA129_1>=Permissions && LA129_1<=Conditions)||(LA129_1>=Deployment && LA129_1<=Parameters)||(LA129_1>=Powershell && LA129_1<=Endpoints)||(LA129_1>=FailFast && LA129_1<=RunPolicy)||(LA129_1>=Variables && LA129_1<=Checkout)||(LA129_1>=Defaults && LA129_1<=MaxTime)||(LA129_1>=Parallel && LA129_1<=PreBuild)||(LA129_1>=RunName && LA129_1<=Timeouts)||(LA129_1>=Command && LA129_1<=Default)||(LA129_1>=Exclude && LA129_1<=VmImage)||(LA129_1>=Caches && LA129_1<=Docker)||(LA129_1>=Except && LA129_1<=Agent)||(LA129_1>=Cache && LA129_1<=Final)||(LA129_1>=Image && LA129_1<=Tasks)||(LA129_1>=Auth && LA129_1<=Cron)||(LA129_1>=Name && LA129_1<=Only)||(LA129_1>=Plan && LA129_1<=With)||(LA129_1>=Env && LA129_1<=Jdk)||(LA129_1>=Run && LA129_1<=On)||LA129_1==HyphenMinus||(LA129_1>=RULE_COMPLEX_EXPRESSION && LA129_1<=RULE_ID)) ) {
                    alt129=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 129, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA129_0==Repository_dispatch||(LA129_0>=ContinueOnError_1 && LA129_0<=Pull_request)||(LA129_0>=Requirements && LA129_0<=Environment)||(LA129_0>=Permissions && LA129_0<=Conditions)||LA129_0==Deployment||LA129_0==Parameters||(LA129_0>=Repository && LA129_0<=Endpoints)||(LA129_0>=FailFast && LA129_0<=RunPolicy)||(LA129_0>=Variables && LA129_0<=Checkout)||LA129_0==Defaults||LA129_0==MaxTime||(LA129_0>=Parallel && LA129_0<=PreBuild)||(LA129_0>=RunName && LA129_0<=Timeouts)||(LA129_0>=Command && LA129_0<=Default)||(LA129_0>=Exclude && LA129_0<=Project)||(LA129_0>=Release && LA129_0<=VmImage)||(LA129_0>=Caches && LA129_0<=Docker)||(LA129_0>=Except && LA129_0<=Agent)||(LA129_0>=Cache && LA129_0<=Final)||(LA129_0>=Image && LA129_0<=Tasks)||LA129_0==Auth||LA129_0==Cron||LA129_0==Only||(LA129_0>=Plan && LA129_0<=Push)||(LA129_0>=Step && LA129_0<=With)||(LA129_0>=Env && LA129_0<=Jdk)||(LA129_0>=Run && LA129_0<=On)||LA129_0==RULE_ID) ) {
                alt129=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // InternalPipelineParser.g:4275:4: (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) )
                    {
                    // InternalPipelineParser.g:4275:4: (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) )
                    // InternalPipelineParser.g:4276:5: otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,Name,FOLLOW_8); 

                    					newLeafNode(otherlv_0, grammarAccess.getActionAccess().getNameKeyword_0_0_0());
                    				
                    // InternalPipelineParser.g:4280:5: ( (lv_stepName_1_0= RULE_STRING ) )
                    // InternalPipelineParser.g:4281:6: (lv_stepName_1_0= RULE_STRING )
                    {
                    // InternalPipelineParser.g:4281:6: (lv_stepName_1_0= RULE_STRING )
                    // InternalPipelineParser.g:4282:7: lv_stepName_1_0= RULE_STRING
                    {
                    lv_stepName_1_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

                    							newLeafNode(lv_stepName_1_0, grammarAccess.getActionAccess().getStepNameSTRINGTerminalRuleCall_0_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getActionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"stepName",
                    								lv_stepName_1_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4300:4: ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? )
                    {
                    // InternalPipelineParser.g:4300:4: ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? )
                    // InternalPipelineParser.g:4301:5: ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )?
                    {
                    // InternalPipelineParser.g:4301:5: ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) )
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==Repository_dispatch||(LA127_0>=ContinueOnError_1 && LA127_0<=Pull_request)||(LA127_0>=Requirements && LA127_0<=Environment)||(LA127_0>=Permissions && LA127_0<=Conditions)||LA127_0==Deployment||LA127_0==Parameters||(LA127_0>=Repository && LA127_0<=Endpoints)||(LA127_0>=FailFast && LA127_0<=RunPolicy)||(LA127_0>=Variables && LA127_0<=Checkout)||LA127_0==Defaults||LA127_0==MaxTime||(LA127_0>=Parallel && LA127_0<=PreBuild)||(LA127_0>=RunName && LA127_0<=Timeouts)||(LA127_0>=Command && LA127_0<=Default)||(LA127_0>=Exclude && LA127_0<=Project)||(LA127_0>=Release && LA127_0<=VmImage)||(LA127_0>=Caches && LA127_0<=Docker)||(LA127_0>=Except && LA127_0<=Agent)||(LA127_0>=Cache && LA127_0<=Final)||(LA127_0>=Image && LA127_0<=Tasks)||LA127_0==Auth||LA127_0==Cron||(LA127_0>=Name && LA127_0<=Only)||(LA127_0>=Plan && LA127_0<=Push)||(LA127_0>=Step && LA127_0<=With)||(LA127_0>=Env && LA127_0<=Jdk)||(LA127_0>=Run && LA127_0<=On)) ) {
                        alt127=1;
                    }
                    else if ( (LA127_0==RULE_ID) ) {
                        alt127=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 127, 0, input);

                        throw nvae;
                    }
                    switch (alt127) {
                        case 1 :
                            // InternalPipelineParser.g:4302:6: ( (lv_actionKeyword_2_0= rulePipelineKeyword ) )
                            {
                            // InternalPipelineParser.g:4302:6: ( (lv_actionKeyword_2_0= rulePipelineKeyword ) )
                            // InternalPipelineParser.g:4303:7: (lv_actionKeyword_2_0= rulePipelineKeyword )
                            {
                            // InternalPipelineParser.g:4303:7: (lv_actionKeyword_2_0= rulePipelineKeyword )
                            // InternalPipelineParser.g:4304:8: lv_actionKeyword_2_0= rulePipelineKeyword
                            {

                            								newCompositeNode(grammarAccess.getActionAccess().getActionKeywordPipelineKeywordEnumRuleCall_0_1_0_0_0());
                            							
                            pushFollow(FOLLOW_85);
                            lv_actionKeyword_2_0=rulePipelineKeyword();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getActionRule());
                            								}
                            								set(
                            									current,
                            									"actionKeyword",
                            									lv_actionKeyword_2_0,
                            									"ca.mcgill.devops.pipeline.Pipeline.PipelineKeyword");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:4322:6: ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon )
                            {
                            // InternalPipelineParser.g:4322:6: ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon )
                            // InternalPipelineParser.g:4323:7: ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon
                            {
                            // InternalPipelineParser.g:4323:7: ( (lv_otherKeyword_3_0= RULE_ID ) )
                            // InternalPipelineParser.g:4324:8: (lv_otherKeyword_3_0= RULE_ID )
                            {
                            // InternalPipelineParser.g:4324:8: (lv_otherKeyword_3_0= RULE_ID )
                            // InternalPipelineParser.g:4325:9: lv_otherKeyword_3_0= RULE_ID
                            {
                            lv_otherKeyword_3_0=(Token)match(input,RULE_ID,FOLLOW_80); 

                            									newLeafNode(lv_otherKeyword_3_0, grammarAccess.getActionAccess().getOtherKeywordIDTerminalRuleCall_0_1_0_1_0_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getActionRule());
                            									}
                            									setWithLastConsumed(
                            										current,
                            										"otherKeyword",
                            										lv_otherKeyword_3_0,
                            										"ca.mcgill.devops.pipeline.Pipeline.ID");
                            								

                            }


                            }

                            otherlv_4=(Token)match(input,Colon,FOLLOW_85); 

                            							newLeafNode(otherlv_4, grammarAccess.getActionAccess().getColonKeyword_0_1_0_1_1());
                            						

                            }


                            }
                            break;

                    }

                    // InternalPipelineParser.g:4347:5: ( (lv_actionValue_5_0= ruleAnyData ) )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( ((LA128_0>=RULE_COMPLEX_EXPRESSION && LA128_0<=RULE_VERSION)||LA128_0==RULE_STRING) ) {
                        alt128=1;
                    }
                    else if ( (LA128_0==RULE_ID) ) {
                        int LA128_2 = input.LA(2);

                        if ( (LA128_2==EOF||LA128_2==Repository_dispatch||(LA128_2>=ContinueOnError_1 && LA128_2<=Pull_request)||(LA128_2>=Requirements && LA128_2<=Environment)||(LA128_2>=Permissions && LA128_2<=Conditions)||(LA128_2>=Deployment && LA128_2<=Parameters)||(LA128_2>=Powershell && LA128_2<=Endpoints)||(LA128_2>=FailFast && LA128_2<=RunPolicy)||(LA128_2>=Variables && LA128_2<=Checkout)||(LA128_2>=Defaults && LA128_2<=MaxTime)||(LA128_2>=Parallel && LA128_2<=PreBuild)||(LA128_2>=RunName && LA128_2<=Timeouts)||(LA128_2>=Command && LA128_2<=Default)||(LA128_2>=Exclude && LA128_2<=VmImage)||(LA128_2>=Caches && LA128_2<=Docker)||(LA128_2>=Except && LA128_2<=Agent)||(LA128_2>=Cache && LA128_2<=Final)||(LA128_2>=Image && LA128_2<=Tasks)||(LA128_2>=Auth && LA128_2<=Cron)||(LA128_2>=Name && LA128_2<=Only)||(LA128_2>=Plan && LA128_2<=With)||(LA128_2>=Env && LA128_2<=Jdk)||(LA128_2>=Run && LA128_2<=On)||LA128_2==HyphenMinus||(LA128_2>=RULE_BEGIN && LA128_2<=RULE_ID)) ) {
                            alt128=1;
                        }
                    }
                    switch (alt128) {
                        case 1 :
                            // InternalPipelineParser.g:4348:6: (lv_actionValue_5_0= ruleAnyData )
                            {
                            // InternalPipelineParser.g:4348:6: (lv_actionValue_5_0= ruleAnyData )
                            // InternalPipelineParser.g:4349:7: lv_actionValue_5_0= ruleAnyData
                            {

                            							newCompositeNode(grammarAccess.getActionAccess().getActionValueAnyDataParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_61);
                            lv_actionValue_5_0=ruleAnyData();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getActionRule());
                            							}
                            							set(
                            								current,
                            								"actionValue",
                            								lv_actionValue_5_0,
                            								"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:4368:3: (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==RULE_BEGIN) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalPipelineParser.g:4369:4: this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END
                    {
                    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_84); 

                    				newLeafNode(this_BEGIN_6, grammarAccess.getActionAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:4373:4: ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==Repository_dispatch||(LA131_0>=ContinueOnError_1 && LA131_0<=Pull_request)||(LA131_0>=Requirements && LA131_0<=Environment)||(LA131_0>=Permissions && LA131_0<=Conditions)||(LA131_0>=Deployment && LA131_0<=Parameters)||(LA131_0>=Powershell && LA131_0<=Endpoints)||(LA131_0>=FailFast && LA131_0<=RunPolicy)||(LA131_0>=Variables && LA131_0<=Checkout)||(LA131_0>=Defaults && LA131_0<=MaxTime)||(LA131_0>=Parallel && LA131_0<=PreBuild)||(LA131_0>=RunName && LA131_0<=Timeouts)||(LA131_0>=Command && LA131_0<=Default)||(LA131_0>=Exclude && LA131_0<=VmImage)||(LA131_0>=Caches && LA131_0<=Docker)||(LA131_0>=Except && LA131_0<=Agent)||(LA131_0>=Cache && LA131_0<=Final)||(LA131_0>=Image && LA131_0<=Tasks)||(LA131_0>=Auth && LA131_0<=Cron)||(LA131_0>=Name && LA131_0<=Only)||(LA131_0>=Plan && LA131_0<=With)||(LA131_0>=Env && LA131_0<=Jdk)||(LA131_0>=Run && LA131_0<=On)||LA131_0==RULE_ID) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // InternalPipelineParser.g:4374:5: ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) )
                    	    {
                    	    // InternalPipelineParser.g:4374:5: ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) )
                    	    // InternalPipelineParser.g:4375:6: (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript )
                    	    {
                    	    // InternalPipelineParser.g:4375:6: (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript )
                    	    int alt130=2;
                    	    alt130 = dfa130.predict(input);
                    	    switch (alt130) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:4376:7: lv_subSteps_7_1= ruleAction
                    	            {

                    	            							newCompositeNode(grammarAccess.getActionAccess().getSubStepsActionParserRuleCall_1_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_84);
                    	            lv_subSteps_7_1=ruleAction();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getActionRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"subSteps",
                    	            								lv_subSteps_7_1,
                    	            								"ca.mcgill.devops.pipeline.Pipeline.Action");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPipelineParser.g:4392:7: lv_subSteps_7_2= ruleScript
                    	            {

                    	            							newCompositeNode(grammarAccess.getActionAccess().getSubStepsScriptParserRuleCall_1_1_0_1());
                    	            						
                    	            pushFollow(FOLLOW_84);
                    	            lv_subSteps_7_2=ruleScript();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getActionRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"subSteps",
                    	            								lv_subSteps_7_2,
                    	            								"ca.mcgill.devops.pipeline.Pipeline.Script");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);

                    this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_8, grammarAccess.getActionAccess().getENDTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleParameterValue"
    // InternalPipelineParser.g:4419:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalPipelineParser.g:4419:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalPipelineParser.g:4420:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalPipelineParser.g:4426:1: ruleParameterValue returns [EObject current=null] : ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) otherlv_2= Colon (this_WS_3= RULE_WS )* ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) ) ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token this_WS_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        EObject lv_subParameterValues_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_1 = null;

        AntlrDatatypeRuleToken lv_value_7_2 = null;

        AntlrDatatypeRuleToken lv_value_7_3 = null;

        EObject lv_subParameterValues_9_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:4432:2: ( ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) otherlv_2= Colon (this_WS_3= RULE_WS )* ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) ) ) )
            // InternalPipelineParser.g:4433:2: ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) otherlv_2= Colon (this_WS_3= RULE_WS )* ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) ) )
            {
            // InternalPipelineParser.g:4433:2: ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) otherlv_2= Colon (this_WS_3= RULE_WS )* ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) ) )
            // InternalPipelineParser.g:4434:3: (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) otherlv_2= Colon (this_WS_3= RULE_WS )* ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) )
            {
            // InternalPipelineParser.g:4434:3: (otherlv_0= HyphenMinus )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==HyphenMinus) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalPipelineParser.g:4435:4: otherlv_0= HyphenMinus
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getParameterValueAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPipelineParser.g:4440:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) )
            // InternalPipelineParser.g:4441:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) )
            {
            // InternalPipelineParser.g:4441:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) )
            // InternalPipelineParser.g:4442:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION )
            {
            // InternalPipelineParser.g:4442:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==RULE_ID) ) {
                alt134=1;
            }
            else if ( (LA134_0==RULE_COMPLEX_EXPRESSION) ) {
                alt134=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // InternalPipelineParser.g:4443:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_80); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getParameterValueAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"ca.mcgill.devops.pipeline.Pipeline.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4458:6: lv_name_1_2= RULE_COMPLEX_EXPRESSION
                    {
                    lv_name_1_2=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_80); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getParameterValueAccess().getNameCOMPLEX_EXPRESSIONTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"ca.mcgill.devops.pipeline.Pipeline.COMPLEX_EXPRESSION");
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_86); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterValueAccess().getColonKeyword_2());
            		
            // InternalPipelineParser.g:4479:3: (this_WS_3= RULE_WS )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==RULE_WS) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // InternalPipelineParser.g:4480:4: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_86); 

            	    				newLeafNode(this_WS_3, grammarAccess.getParameterValueAccess().getWSTerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);

            // InternalPipelineParser.g:4485:3: ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==RULE_BEGIN) ) {
                int LA140_1 = input.LA(2);

                if ( (LA140_1==HyphenMinus) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                        {
                        int LA140_5 = input.LA(4);

                        if ( (LA140_5==HyphenMinus||LA140_5==RULE_END) ) {
                            alt140=2;
                        }
                        else if ( (LA140_5==Colon) ) {
                            alt140=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 140, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_COMPLEX_EXPRESSION:
                        {
                        int LA140_6 = input.LA(4);

                        if ( (LA140_6==Colon) ) {
                            alt140=1;
                        }
                        else if ( (LA140_6==HyphenMinus||LA140_6==RULE_END) ) {
                            alt140=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 140, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_HEX_INT:
                    case RULE_INT:
                    case RULE_FLOAT_LITERAL:
                    case RULE_VERSION:
                    case RULE_STRING:
                        {
                        alt140=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 140, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA140_1==RULE_COMPLEX_EXPRESSION||(LA140_1>=RULE_END && LA140_1<=RULE_ID)) ) {
                    alt140=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 140, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA140_0==HyphenMinus||LA140_0==LeftSquareBracket||(LA140_0>=RULE_COMPLEX_EXPRESSION && LA140_0<=RULE_VERSION)||LA140_0==RULE_ID||LA140_0==RULE_STRING) ) {
                alt140=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // InternalPipelineParser.g:4486:4: (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:4486:4: (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END )
                    // InternalPipelineParser.g:4487:5: this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_38); 

                    					newLeafNode(this_BEGIN_4, grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_0_0());
                    				
                    // InternalPipelineParser.g:4491:5: ( (lv_subParameterValues_5_0= ruleParameterValue ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==HyphenMinus||LA136_0==RULE_COMPLEX_EXPRESSION||LA136_0==RULE_ID) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // InternalPipelineParser.g:4492:6: (lv_subParameterValues_5_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:4492:6: (lv_subParameterValues_5_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:4493:7: lv_subParameterValues_5_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_subParameterValues_5_0=ruleParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subParameterValues",
                    	    								lv_subParameterValues_5_0,
                    	    								"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_6, grammarAccess.getParameterValueAccess().getENDTerminalRuleCall_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4516:4: ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? )
                    {
                    // InternalPipelineParser.g:4516:4: ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? )
                    // InternalPipelineParser.g:4517:5: ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )?
                    {
                    // InternalPipelineParser.g:4517:5: ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) )
                    // InternalPipelineParser.g:4518:6: ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) )
                    {
                    // InternalPipelineParser.g:4518:6: ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) )
                    // InternalPipelineParser.g:4519:7: (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues )
                    {
                    // InternalPipelineParser.g:4519:7: (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues )
                    int alt137=3;
                    switch ( input.LA(1) ) {
                    case RULE_COMPLEX_EXPRESSION:
                    case RULE_HEX_INT:
                    case RULE_INT:
                    case RULE_FLOAT_LITERAL:
                    case RULE_VERSION:
                    case RULE_ID:
                    case RULE_STRING:
                        {
                        alt137=1;
                        }
                        break;
                    case LeftSquareBracket:
                        {
                        alt137=2;
                        }
                        break;
                    case HyphenMinus:
                    case RULE_BEGIN:
                        {
                        alt137=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 137, 0, input);

                        throw nvae;
                    }

                    switch (alt137) {
                        case 1 :
                            // InternalPipelineParser.g:4520:8: lv_value_7_1= ruleAnyData
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueAnyDataParserRuleCall_4_1_0_0_0());
                            							
                            pushFollow(FOLLOW_61);
                            lv_value_7_1=ruleAnyData();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getParameterValueRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_7_1,
                            									"ca.mcgill.devops.pipeline.Pipeline.AnyData");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:4536:8: lv_value_7_2= ruleArrayList
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueArrayListParserRuleCall_4_1_0_0_1());
                            							
                            pushFollow(FOLLOW_61);
                            lv_value_7_2=ruleArrayList();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getParameterValueRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_7_2,
                            									"ca.mcgill.devops.pipeline.Pipeline.ArrayList");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;
                        case 3 :
                            // InternalPipelineParser.g:4552:8: lv_value_7_3= ruleHyphenValues
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueHyphenValuesParserRuleCall_4_1_0_0_2());
                            							
                            pushFollow(FOLLOW_61);
                            lv_value_7_3=ruleHyphenValues();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getParameterValueRule());
                            								}
                            								set(
                            									current,
                            									"value",
                            									lv_value_7_3,
                            									"ca.mcgill.devops.pipeline.Pipeline.HyphenValues");
                            								afterParserOrEnumRuleCall();
                            							

                            }
                            break;

                    }


                    }


                    }

                    // InternalPipelineParser.g:4570:5: (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==RULE_BEGIN) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // InternalPipelineParser.g:4571:6: this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END
                            {
                            this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_38); 

                            						newLeafNode(this_BEGIN_8, grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_1_1_0());
                            					
                            // InternalPipelineParser.g:4575:6: ( (lv_subParameterValues_9_0= ruleParameterValue ) )*
                            loop138:
                            do {
                                int alt138=2;
                                int LA138_0 = input.LA(1);

                                if ( (LA138_0==HyphenMinus||LA138_0==RULE_COMPLEX_EXPRESSION||LA138_0==RULE_ID) ) {
                                    alt138=1;
                                }


                                switch (alt138) {
                            	case 1 :
                            	    // InternalPipelineParser.g:4576:7: (lv_subParameterValues_9_0= ruleParameterValue )
                            	    {
                            	    // InternalPipelineParser.g:4576:7: (lv_subParameterValues_9_0= ruleParameterValue )
                            	    // InternalPipelineParser.g:4577:8: lv_subParameterValues_9_0= ruleParameterValue
                            	    {

                            	    								newCompositeNode(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_38);
                            	    lv_subParameterValues_9_0=ruleParameterValue();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getParameterValueRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"subParameterValues",
                            	    									lv_subParameterValues_9_0,
                            	    									"ca.mcgill.devops.pipeline.Pipeline.ParameterValue");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop138;
                                }
                            } while (true);

                            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

                            						newLeafNode(this_END_10, grammarAccess.getParameterValueAccess().getENDTerminalRuleCall_4_1_1_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleAnyData"
    // InternalPipelineParser.g:4605:1: entryRuleAnyData returns [String current=null] : iv_ruleAnyData= ruleAnyData EOF ;
    public final String entryRuleAnyData() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyData = null;


        try {
            // InternalPipelineParser.g:4605:47: (iv_ruleAnyData= ruleAnyData EOF )
            // InternalPipelineParser.g:4606:2: iv_ruleAnyData= ruleAnyData EOF
            {
             newCompositeNode(grammarAccess.getAnyDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyData=ruleAnyData();

            state._fsp--;

             current =iv_ruleAnyData.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyData"


    // $ANTLR start "ruleAnyData"
    // InternalPipelineParser.g:4612:1: ruleAnyData returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT ) ;
    public final AntlrDatatypeRuleToken ruleAnyData() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_COMPLEX_EXPRESSION_4=null;
        Token this_VERSION_5=null;
        Token this_HEX_INT_6=null;
        AntlrDatatypeRuleToken this_Number_1 = null;

        AntlrDatatypeRuleToken this_FloatingPoint_2 = null;

        AntlrDatatypeRuleToken this_SimpleWord_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:4618:2: ( (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT ) )
            // InternalPipelineParser.g:4619:2: (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT )
            {
            // InternalPipelineParser.g:4619:2: (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT )
            int alt141=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt141=1;
                }
                break;
            case RULE_INT:
                {
                alt141=2;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt141=3;
                }
                break;
            case RULE_ID:
                {
                alt141=4;
                }
                break;
            case RULE_COMPLEX_EXPRESSION:
                {
                alt141=5;
                }
                break;
            case RULE_VERSION:
                {
                alt141=6;
                }
                break;
            case RULE_HEX_INT:
                {
                alt141=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // InternalPipelineParser.g:4620:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getAnyDataAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4628:3: this_Number_1= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getAnyDataAccess().getNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_1=ruleNumber();

                    state._fsp--;


                    			current.merge(this_Number_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:4639:3: this_FloatingPoint_2= ruleFloatingPoint
                    {

                    			newCompositeNode(grammarAccess.getAnyDataAccess().getFloatingPointParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatingPoint_2=ruleFloatingPoint();

                    state._fsp--;


                    			current.merge(this_FloatingPoint_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:4650:3: this_SimpleWord_3= ruleSimpleWord
                    {

                    			newCompositeNode(grammarAccess.getAnyDataAccess().getSimpleWordParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleWord_3=ruleSimpleWord();

                    state._fsp--;


                    			current.merge(this_SimpleWord_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:4661:3: this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION
                    {
                    this_COMPLEX_EXPRESSION_4=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 

                    			current.merge(this_COMPLEX_EXPRESSION_4);
                    		

                    			newLeafNode(this_COMPLEX_EXPRESSION_4, grammarAccess.getAnyDataAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:4669:3: this_VERSION_5= RULE_VERSION
                    {
                    this_VERSION_5=(Token)match(input,RULE_VERSION,FOLLOW_2); 

                    			current.merge(this_VERSION_5);
                    		

                    			newLeafNode(this_VERSION_5, grammarAccess.getAnyDataAccess().getVERSIONTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:4677:3: this_HEX_INT_6= RULE_HEX_INT
                    {
                    this_HEX_INT_6=(Token)match(input,RULE_HEX_INT,FOLLOW_2); 

                    			current.merge(this_HEX_INT_6);
                    		

                    			newLeafNode(this_HEX_INT_6, grammarAccess.getAnyDataAccess().getHEX_INTTerminalRuleCall_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyData"


    // $ANTLR start "entryRuleKeyValue"
    // InternalPipelineParser.g:4688:1: entryRuleKeyValue returns [String current=null] : iv_ruleKeyValue= ruleKeyValue EOF ;
    public final String entryRuleKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyValue = null;


        try {
            // InternalPipelineParser.g:4688:48: (iv_ruleKeyValue= ruleKeyValue EOF )
            // InternalPipelineParser.g:4689:2: iv_ruleKeyValue= ruleKeyValue EOF
            {
             newCompositeNode(grammarAccess.getKeyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValue=ruleKeyValue();

            state._fsp--;

             current =iv_ruleKeyValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyValue"


    // $ANTLR start "ruleKeyValue"
    // InternalPipelineParser.g:4695:1: ruleKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData ) ;
    public final AntlrDatatypeRuleToken ruleKeyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_AnyData_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:4701:2: ( (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData ) )
            // InternalPipelineParser.g:4702:2: (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData )
            {
            // InternalPipelineParser.g:4702:2: (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData )
            // InternalPipelineParser.g:4703:3: this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_80); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getKeyValueAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_40); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getKeyValueAccess().getColonKeyword_1());
            		

            			newCompositeNode(grammarAccess.getKeyValueAccess().getAnyDataParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_AnyData_2=ruleAnyData();

            state._fsp--;


            			current.merge(this_AnyData_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyValue"


    // $ANTLR start "entryRuleIndPermissionValue"
    // InternalPipelineParser.g:4729:1: entryRuleIndPermissionValue returns [String current=null] : iv_ruleIndPermissionValue= ruleIndPermissionValue EOF ;
    public final String entryRuleIndPermissionValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndPermissionValue = null;


        try {
            // InternalPipelineParser.g:4729:58: (iv_ruleIndPermissionValue= ruleIndPermissionValue EOF )
            // InternalPipelineParser.g:4730:2: iv_ruleIndPermissionValue= ruleIndPermissionValue EOF
            {
             newCompositeNode(grammarAccess.getIndPermissionValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndPermissionValue=ruleIndPermissionValue();

            state._fsp--;

             current =iv_ruleIndPermissionValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndPermissionValue"


    // $ANTLR start "ruleIndPermissionValue"
    // InternalPipelineParser.g:4736:1: ruleIndPermissionValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) ) ;
    public final AntlrDatatypeRuleToken ruleIndPermissionValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:4742:2: ( (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) ) )
            // InternalPipelineParser.g:4743:2: (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) )
            {
            // InternalPipelineParser.g:4743:2: (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) )
            // InternalPipelineParser.g:4744:3: this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_80); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIndPermissionValueAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_87); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getColonKeyword_1());
            		
            // InternalPipelineParser.g:4756:3: (kw= Read | kw= Write | kw= None )
            int alt142=3;
            switch ( input.LA(1) ) {
            case Read:
                {
                alt142=1;
                }
                break;
            case Write:
                {
                alt142=2;
                }
                break;
            case None:
                {
                alt142=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // InternalPipelineParser.g:4757:4: kw= Read
                    {
                    kw=(Token)match(input,Read,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getReadKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4763:4: kw= Write
                    {
                    kw=(Token)match(input,Write,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getWriteKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:4769:4: kw= None
                    {
                    kw=(Token)match(input,None,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getNoneKeyword_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndPermissionValue"


    // $ANTLR start "entryRuleUnquotedString"
    // InternalPipelineParser.g:4779:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;


        try {
            // InternalPipelineParser.g:4779:54: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // InternalPipelineParser.g:4780:2: iv_ruleUnquotedString= ruleUnquotedString EOF
            {
             newCompositeNode(grammarAccess.getUnquotedStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnquotedString=ruleUnquotedString();

            state._fsp--;

             current =iv_ruleUnquotedString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnquotedString"


    // $ANTLR start "ruleUnquotedString"
    // InternalPipelineParser.g:4786:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* ) ;
    public final AntlrDatatypeRuleToken ruleUnquotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_COMPLEX_EXPRESSION_3=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:4792:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* ) )
            // InternalPipelineParser.g:4793:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* )
            {
            // InternalPipelineParser.g:4793:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* )
            // InternalPipelineParser.g:4794:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_88); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_0());
            		
            // InternalPipelineParser.g:4801:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )*
            loop143:
            do {
                int alt143=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt143=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt143=2;
                    }
                    break;
                case RULE_COMPLEX_EXPRESSION:
                    {
                    alt143=3;
                    }
                    break;

                }

                switch (alt143) {
            	case 1 :
            	    // InternalPipelineParser.g:4802:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_88); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:4810:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_88); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalPipelineParser.g:4818:4: this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION
            	    {
            	    this_COMPLEX_EXPRESSION_3=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_88); 

            	    				current.merge(this_COMPLEX_EXPRESSION_3);
            	    			

            	    				newLeafNode(this_COMPLEX_EXPRESSION_3, grammarAccess.getUnquotedStringAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop143;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnquotedString"


    // $ANTLR start "entryRuleHyphenValues"
    // InternalPipelineParser.g:4830:1: entryRuleHyphenValues returns [String current=null] : iv_ruleHyphenValues= ruleHyphenValues EOF ;
    public final String entryRuleHyphenValues() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHyphenValues = null;


        try {
            // InternalPipelineParser.g:4830:52: (iv_ruleHyphenValues= ruleHyphenValues EOF )
            // InternalPipelineParser.g:4831:2: iv_ruleHyphenValues= ruleHyphenValues EOF
            {
             newCompositeNode(grammarAccess.getHyphenValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHyphenValues=ruleHyphenValues();

            state._fsp--;

             current =iv_ruleHyphenValues.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHyphenValues"


    // $ANTLR start "ruleHyphenValues"
    // InternalPipelineParser.g:4837:1: ruleHyphenValues returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) ) ;
    public final AntlrDatatypeRuleToken ruleHyphenValues() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BEGIN_2=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken this_AnyData_1 = null;

        AntlrDatatypeRuleToken this_AnyData_4 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:4843:2: ( ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) ) )
            // InternalPipelineParser.g:4844:2: ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) )
            {
            // InternalPipelineParser.g:4844:2: ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==HyphenMinus) ) {
                alt146=1;
            }
            else if ( (LA146_0==RULE_BEGIN) ) {
                alt146=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // InternalPipelineParser.g:4845:3: (kw= HyphenMinus this_AnyData_1= ruleAnyData )+
                    {
                    // InternalPipelineParser.g:4845:3: (kw= HyphenMinus this_AnyData_1= ruleAnyData )+
                    int cnt144=0;
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==HyphenMinus) ) {
                            switch ( input.LA(2) ) {
                            case RULE_ID:
                                {
                                int LA144_3 = input.LA(3);

                                if ( (LA144_3==EOF||(LA144_3>=Workflow_dispatch && LA144_3<=WorkingDirectory)||LA144_3==BranchesIgnore||LA144_3==Workflow_call||LA144_3==PathsIgnore||LA144_3==Repositories||(LA144_3>=Workflow_run && LA144_3<=Concurrency)||(LA144_3>=TagsIgnore && LA144_3<=AutoCancel)||LA144_3==Containers||(LA144_3>=Parameters && LA144_3<=Permission)||LA144_3==Executors||LA144_3==Pipelines||LA144_3==Resources||(LA144_3>=Schedules && LA144_3<=Variables)||LA144_3==Branches||(LA144_3>=Commands && LA144_3<=Defaults)||LA144_3==Packages||(LA144_3>=RunName && LA144_3<=Schedule)||LA144_3==Webhooks||LA144_3==Default||(LA144_3>=Exclude && LA144_3<=Extends)||LA144_3==Include||LA144_3==Version||LA144_3==Builds||LA144_3==Drafts||LA144_3==Stages||LA144_3==Batch||LA144_3==Paths||(LA144_3>=Jobs && LA144_3<=Name)||LA144_3==Orbs||LA144_3==Pool||LA144_3==Tags||LA144_3==Env||LA144_3==On||(LA144_3>=Comma && LA144_3<=HyphenMinus)||LA144_3==RightSquareBracket||LA144_3==RULE_COMPLEX_EXPRESSION||(LA144_3>=RULE_BEGIN && LA144_3<=RULE_ID)) ) {
                                    alt144=1;
                                }


                                }
                                break;
                            case RULE_COMPLEX_EXPRESSION:
                                {
                                int LA144_4 = input.LA(3);

                                if ( (LA144_4==EOF||(LA144_4>=Workflow_dispatch && LA144_4<=WorkingDirectory)||LA144_4==BranchesIgnore||LA144_4==Workflow_call||LA144_4==PathsIgnore||LA144_4==Repositories||(LA144_4>=Workflow_run && LA144_4<=Concurrency)||(LA144_4>=TagsIgnore && LA144_4<=AutoCancel)||LA144_4==Containers||(LA144_4>=Parameters && LA144_4<=Permission)||LA144_4==Executors||LA144_4==Pipelines||LA144_4==Resources||(LA144_4>=Schedules && LA144_4<=Variables)||LA144_4==Branches||(LA144_4>=Commands && LA144_4<=Defaults)||LA144_4==Packages||(LA144_4>=RunName && LA144_4<=Schedule)||LA144_4==Webhooks||LA144_4==Default||(LA144_4>=Exclude && LA144_4<=Extends)||LA144_4==Include||LA144_4==Version||LA144_4==Builds||LA144_4==Drafts||LA144_4==Stages||LA144_4==Batch||LA144_4==Paths||(LA144_4>=Jobs && LA144_4<=Name)||LA144_4==Orbs||LA144_4==Pool||LA144_4==Tags||LA144_4==Env||LA144_4==On||(LA144_4>=Comma && LA144_4<=HyphenMinus)||LA144_4==RightSquareBracket||LA144_4==RULE_COMPLEX_EXPRESSION||(LA144_4>=RULE_BEGIN && LA144_4<=RULE_ID)) ) {
                                    alt144=1;
                                }


                                }
                                break;
                            case RULE_HEX_INT:
                            case RULE_INT:
                            case RULE_FLOAT_LITERAL:
                            case RULE_VERSION:
                            case RULE_STRING:
                                {
                                alt144=1;
                                }
                                break;

                            }

                        }


                        switch (alt144) {
                    	case 1 :
                    	    // InternalPipelineParser.g:4846:4: kw= HyphenMinus this_AnyData_1= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,HyphenMinus,FOLLOW_40); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_0_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_0_1());
                    	    			
                    	    pushFollow(FOLLOW_45);
                    	    this_AnyData_1=ruleAnyData();

                    	    state._fsp--;


                    	    				current.merge(this_AnyData_1);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt144 >= 1 ) break loop144;
                                EarlyExitException eee =
                                    new EarlyExitException(144, input);
                                throw eee;
                        }
                        cnt144++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:4863:3: (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END )
                    {
                    // InternalPipelineParser.g:4863:3: (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END )
                    // InternalPipelineParser.g:4864:4: this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

                    				current.merge(this_BEGIN_2);
                    			

                    				newLeafNode(this_BEGIN_2, grammarAccess.getHyphenValuesAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:4871:4: (kw= HyphenMinus this_AnyData_4= ruleAnyData )+
                    int cnt145=0;
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==HyphenMinus) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // InternalPipelineParser.g:4872:5: kw= HyphenMinus this_AnyData_4= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,HyphenMinus,FOLLOW_40); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_1_1_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_1_1_1());
                    	    				
                    	    pushFollow(FOLLOW_35);
                    	    this_AnyData_4=ruleAnyData();

                    	    state._fsp--;


                    	    					current.merge(this_AnyData_4);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt145 >= 1 ) break loop145;
                                EarlyExitException eee =
                                    new EarlyExitException(145, input);
                                throw eee;
                        }
                        cnt145++;
                    } while (true);

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				current.merge(this_END_5);
                    			

                    				newLeafNode(this_END_5, grammarAccess.getHyphenValuesAccess().getENDTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHyphenValues"


    // $ANTLR start "entryRuleNumber"
    // InternalPipelineParser.g:4900:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalPipelineParser.g:4900:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalPipelineParser.g:4901:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalPipelineParser.g:4907:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:4913:2: (this_INT_0= RULE_INT )
            // InternalPipelineParser.g:4914:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleFloatingPoint"
    // InternalPipelineParser.g:4924:1: entryRuleFloatingPoint returns [String current=null] : iv_ruleFloatingPoint= ruleFloatingPoint EOF ;
    public final String entryRuleFloatingPoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPoint = null;


        try {
            // InternalPipelineParser.g:4924:53: (iv_ruleFloatingPoint= ruleFloatingPoint EOF )
            // InternalPipelineParser.g:4925:2: iv_ruleFloatingPoint= ruleFloatingPoint EOF
            {
             newCompositeNode(grammarAccess.getFloatingPointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatingPoint=ruleFloatingPoint();

            state._fsp--;

             current =iv_ruleFloatingPoint.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatingPoint"


    // $ANTLR start "ruleFloatingPoint"
    // InternalPipelineParser.g:4931:1: ruleFloatingPoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL ;
    public final AntlrDatatypeRuleToken ruleFloatingPoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_LITERAL_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:4937:2: (this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL )
            // InternalPipelineParser.g:4938:2: this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL
            {
            this_FLOAT_LITERAL_0=(Token)match(input,RULE_FLOAT_LITERAL,FOLLOW_2); 

            		current.merge(this_FLOAT_LITERAL_0);
            	

            		newLeafNode(this_FLOAT_LITERAL_0, grammarAccess.getFloatingPointAccess().getFLOAT_LITERALTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatingPoint"


    // $ANTLR start "entryRuleSimpleWord"
    // InternalPipelineParser.g:4948:1: entryRuleSimpleWord returns [String current=null] : iv_ruleSimpleWord= ruleSimpleWord EOF ;
    public final String entryRuleSimpleWord() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleWord = null;


        try {
            // InternalPipelineParser.g:4948:50: (iv_ruleSimpleWord= ruleSimpleWord EOF )
            // InternalPipelineParser.g:4949:2: iv_ruleSimpleWord= ruleSimpleWord EOF
            {
             newCompositeNode(grammarAccess.getSimpleWordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleWord=ruleSimpleWord();

            state._fsp--;

             current =iv_ruleSimpleWord.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleWord"


    // $ANTLR start "ruleSimpleWord"
    // InternalPipelineParser.g:4955:1: ruleSimpleWord returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSimpleWord() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:4961:2: (this_ID_0= RULE_ID )
            // InternalPipelineParser.g:4962:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getSimpleWordAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleWord"


    // $ANTLR start "entryRuleArrayList"
    // InternalPipelineParser.g:4972:1: entryRuleArrayList returns [String current=null] : iv_ruleArrayList= ruleArrayList EOF ;
    public final String entryRuleArrayList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayList = null;


        try {
            // InternalPipelineParser.g:4972:49: (iv_ruleArrayList= ruleArrayList EOF )
            // InternalPipelineParser.g:4973:2: iv_ruleArrayList= ruleArrayList EOF
            {
             newCompositeNode(grammarAccess.getArrayListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayList=ruleArrayList();

            state._fsp--;

             current =iv_ruleArrayList.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayList"


    // $ANTLR start "ruleArrayList"
    // InternalPipelineParser.g:4979:1: ruleArrayList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleArrayList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AnyData_1 = null;

        AntlrDatatypeRuleToken this_AnyData_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:4985:2: ( (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket ) )
            // InternalPipelineParser.g:4986:2: (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket )
            {
            // InternalPipelineParser.g:4986:2: (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket )
            // InternalPipelineParser.g:4987:3: kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_89); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArrayListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPipelineParser.g:4992:3: (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( ((LA148_0>=RULE_COMPLEX_EXPRESSION && LA148_0<=RULE_VERSION)||LA148_0==RULE_ID||LA148_0==RULE_STRING) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalPipelineParser.g:4993:4: this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )*
                    {

                    				newCompositeNode(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_32);
                    this_AnyData_1=ruleAnyData();

                    state._fsp--;


                    				current.merge(this_AnyData_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPipelineParser.g:5003:4: (kw= Comma this_AnyData_3= ruleAnyData )*
                    loop147:
                    do {
                        int alt147=2;
                        int LA147_0 = input.LA(1);

                        if ( (LA147_0==Comma) ) {
                            alt147=1;
                        }


                        switch (alt147) {
                    	case 1 :
                    	    // InternalPipelineParser.g:5004:5: kw= Comma this_AnyData_3= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,Comma,FOLLOW_40); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getArrayListAccess().getCommaKeyword_1_1_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_1_1());
                    	    				
                    	    pushFollow(FOLLOW_32);
                    	    this_AnyData_3=ruleAnyData();

                    	    state._fsp--;


                    	    					current.merge(this_AnyData_3);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArrayListAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayList"


    // $ANTLR start "rulePipelineKeyword"
    // InternalPipelineParser.g:5030:1: rulePipelineKeyword returns [Enumerator current=null] : ( (enumLiteral_0= Name ) | (enumLiteral_1= On ) | (enumLiteral_2= RunName ) | (enumLiteral_3= If ) | (enumLiteral_4= RunsOn ) | (enumLiteral_5= Env ) | (enumLiteral_6= Defaults ) | (enumLiteral_7= Strategy ) | (enumLiteral_8= Matrix ) | (enumLiteral_9= Container ) | (enumLiteral_10= Services ) | (enumLiteral_11= Steps ) | (enumLiteral_12= Uses ) | (enumLiteral_13= Run ) | (enumLiteral_14= Shell ) | (enumLiteral_15= WorkingDirectory ) | (enumLiteral_16= With ) | (enumLiteral_17= TimeoutMinutes ) | (enumLiteral_18= ContinueOnError_1 ) | (enumLiteral_19= Condition ) | (enumLiteral_20= Environment ) | (enumLiteral_21= Id ) | (enumLiteral_22= Needs ) | (enumLiteral_23= Outputs ) | (enumLiteral_24= Secrets ) | (enumLiteral_25= Permissions ) | (enumLiteral_26= Concurrency ) | (enumLiteral_27= Timeouts ) | (enumLiteral_28= DefaultsRun ) | (enumLiteral_29= Workflow_dispatch ) | (enumLiteral_30= Workflow_call ) | (enumLiteral_31= Schedule ) | (enumLiteral_32= Push ) | (enumLiteral_33= Pull_request ) | (enumLiteral_34= Paths ) | (enumLiteral_35= Branches ) | (enumLiteral_36= Tags ) | (enumLiteral_37= BranchesIgnore ) | (enumLiteral_38= PathsIgnore ) | (enumLiteral_39= TagsIgnore ) | (enumLiteral_40= Cron ) | (enumLiteral_41= Repository_dispatch ) | (enumLiteral_42= Workflow_run ) | (enumLiteral_43= Checkout ) | (enumLiteral_44= Filters ) | (enumLiteral_45= Include ) | (enumLiteral_46= Exclude ) | (enumLiteral_47= FailFast ) | (enumLiteral_48= MaxParallel ) | (enumLiteral_49= ContainerImage ) | (enumLiteral_50= Credentials ) | (enumLiteral_51= Ports ) | (enumLiteral_52= Inherit ) | (enumLiteral_53= Trigger ) | (enumLiteral_54= Pool ) | (enumLiteral_55= DisplayName ) | (enumLiteral_56= Task ) | (enumLiteral_57= Template ) | (enumLiteral_58= DependsOn ) | (enumLiteral_59= Workspace ) | (enumLiteral_60= Parameters ) | (enumLiteral_61= VmImage ) | (enumLiteral_62= Resources ) | (enumLiteral_63= Pipeline ) | (enumLiteral_64= Stage ) | (enumLiteral_65= TimeoutInMinutes ) | (enumLiteral_66= ContinueOnError ) | (enumLiteral_67= ResourceType ) | (enumLiteral_68= ResourceName ) | (enumLiteral_69= Stages ) | (enumLiteral_70= Only ) | (enumLiteral_71= Except ) | (enumLiteral_72= Image ) | (enumLiteral_73= Variables ) | (enumLiteral_74= Cache ) | (enumLiteral_75= Artifacts ) | (enumLiteral_76= Retries ) | (enumLiteral_77= Rules ) | (enumLiteral_78= Before_script ) | (enumLiteral_79= After_script ) | (enumLiteral_80= Timeout ) | (enumLiteral_81= When ) | (enumLiteral_82= Allow_failure ) | (enumLiteral_83= Dependencies ) | (enumLiteral_84= Extends ) | (enumLiteral_85= Pipelines ) | (enumLiteral_86= Default ) | (enumLiteral_87= PullRequests ) | (enumLiteral_88= Step ) | (enumLiteral_89= Script ) | (enumLiteral_90= Definitions ) | (enumLiteral_91= Caches ) | (enumLiteral_92= Parallel ) | (enumLiteral_93= Conditions ) | (enumLiteral_94= MaxTime ) | (enumLiteral_95= Project ) | (enumLiteral_96= Plan ) | (enumLiteral_97= Tasks ) | (enumLiteral_98= Requirements ) | (enumLiteral_99= Final ) | (enumLiteral_100= Jdk ) | (enumLiteral_101= Labels ) | (enumLiteral_102= Repository ) | (enumLiteral_103= Deployment ) | (enumLiteral_104= Release ) | (enumLiteral_105= Version ) | (enumLiteral_106= Docker ) | (enumLiteral_107= Agent ) | (enumLiteral_108= Queue ) | (enumLiteral_109= Snapshot ) | (enumLiteral_110= Policy ) | (enumLiteral_111= Approvals ) | (enumLiteral_112= PreBuild ) | (enumLiteral_113= PostBuild ) | (enumLiteral_114= Ssh ) | (enumLiteral_115= Auth ) | (enumLiteral_116= Storage ) | (enumLiteral_117= Endpoints ) | (enumLiteral_118= Command ) | (enumLiteral_119= Provisioner ) | (enumLiteral_120= TriggerRules ) | (enumLiteral_121= RunPolicy ) | (enumLiteral_122= Queued ) | (enumLiteral_123= AutoCancel ) | (enumLiteral_124= Notifications ) | (enumLiteral_125= DeployTrigger ) | (enumLiteral_126= ReleaseTrigger ) | (enumLiteral_127= LockBehavior ) | (enumLiteral_128= ReviewStage ) ) ;
    public final Enumerator rulePipelineKeyword() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;
        Token enumLiteral_21=null;
        Token enumLiteral_22=null;
        Token enumLiteral_23=null;
        Token enumLiteral_24=null;
        Token enumLiteral_25=null;
        Token enumLiteral_26=null;
        Token enumLiteral_27=null;
        Token enumLiteral_28=null;
        Token enumLiteral_29=null;
        Token enumLiteral_30=null;
        Token enumLiteral_31=null;
        Token enumLiteral_32=null;
        Token enumLiteral_33=null;
        Token enumLiteral_34=null;
        Token enumLiteral_35=null;
        Token enumLiteral_36=null;
        Token enumLiteral_37=null;
        Token enumLiteral_38=null;
        Token enumLiteral_39=null;
        Token enumLiteral_40=null;
        Token enumLiteral_41=null;
        Token enumLiteral_42=null;
        Token enumLiteral_43=null;
        Token enumLiteral_44=null;
        Token enumLiteral_45=null;
        Token enumLiteral_46=null;
        Token enumLiteral_47=null;
        Token enumLiteral_48=null;
        Token enumLiteral_49=null;
        Token enumLiteral_50=null;
        Token enumLiteral_51=null;
        Token enumLiteral_52=null;
        Token enumLiteral_53=null;
        Token enumLiteral_54=null;
        Token enumLiteral_55=null;
        Token enumLiteral_56=null;
        Token enumLiteral_57=null;
        Token enumLiteral_58=null;
        Token enumLiteral_59=null;
        Token enumLiteral_60=null;
        Token enumLiteral_61=null;
        Token enumLiteral_62=null;
        Token enumLiteral_63=null;
        Token enumLiteral_64=null;
        Token enumLiteral_65=null;
        Token enumLiteral_66=null;
        Token enumLiteral_67=null;
        Token enumLiteral_68=null;
        Token enumLiteral_69=null;
        Token enumLiteral_70=null;
        Token enumLiteral_71=null;
        Token enumLiteral_72=null;
        Token enumLiteral_73=null;
        Token enumLiteral_74=null;
        Token enumLiteral_75=null;
        Token enumLiteral_76=null;
        Token enumLiteral_77=null;
        Token enumLiteral_78=null;
        Token enumLiteral_79=null;
        Token enumLiteral_80=null;
        Token enumLiteral_81=null;
        Token enumLiteral_82=null;
        Token enumLiteral_83=null;
        Token enumLiteral_84=null;
        Token enumLiteral_85=null;
        Token enumLiteral_86=null;
        Token enumLiteral_87=null;
        Token enumLiteral_88=null;
        Token enumLiteral_89=null;
        Token enumLiteral_90=null;
        Token enumLiteral_91=null;
        Token enumLiteral_92=null;
        Token enumLiteral_93=null;
        Token enumLiteral_94=null;
        Token enumLiteral_95=null;
        Token enumLiteral_96=null;
        Token enumLiteral_97=null;
        Token enumLiteral_98=null;
        Token enumLiteral_99=null;
        Token enumLiteral_100=null;
        Token enumLiteral_101=null;
        Token enumLiteral_102=null;
        Token enumLiteral_103=null;
        Token enumLiteral_104=null;
        Token enumLiteral_105=null;
        Token enumLiteral_106=null;
        Token enumLiteral_107=null;
        Token enumLiteral_108=null;
        Token enumLiteral_109=null;
        Token enumLiteral_110=null;
        Token enumLiteral_111=null;
        Token enumLiteral_112=null;
        Token enumLiteral_113=null;
        Token enumLiteral_114=null;
        Token enumLiteral_115=null;
        Token enumLiteral_116=null;
        Token enumLiteral_117=null;
        Token enumLiteral_118=null;
        Token enumLiteral_119=null;
        Token enumLiteral_120=null;
        Token enumLiteral_121=null;
        Token enumLiteral_122=null;
        Token enumLiteral_123=null;
        Token enumLiteral_124=null;
        Token enumLiteral_125=null;
        Token enumLiteral_126=null;
        Token enumLiteral_127=null;
        Token enumLiteral_128=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:5036:2: ( ( (enumLiteral_0= Name ) | (enumLiteral_1= On ) | (enumLiteral_2= RunName ) | (enumLiteral_3= If ) | (enumLiteral_4= RunsOn ) | (enumLiteral_5= Env ) | (enumLiteral_6= Defaults ) | (enumLiteral_7= Strategy ) | (enumLiteral_8= Matrix ) | (enumLiteral_9= Container ) | (enumLiteral_10= Services ) | (enumLiteral_11= Steps ) | (enumLiteral_12= Uses ) | (enumLiteral_13= Run ) | (enumLiteral_14= Shell ) | (enumLiteral_15= WorkingDirectory ) | (enumLiteral_16= With ) | (enumLiteral_17= TimeoutMinutes ) | (enumLiteral_18= ContinueOnError_1 ) | (enumLiteral_19= Condition ) | (enumLiteral_20= Environment ) | (enumLiteral_21= Id ) | (enumLiteral_22= Needs ) | (enumLiteral_23= Outputs ) | (enumLiteral_24= Secrets ) | (enumLiteral_25= Permissions ) | (enumLiteral_26= Concurrency ) | (enumLiteral_27= Timeouts ) | (enumLiteral_28= DefaultsRun ) | (enumLiteral_29= Workflow_dispatch ) | (enumLiteral_30= Workflow_call ) | (enumLiteral_31= Schedule ) | (enumLiteral_32= Push ) | (enumLiteral_33= Pull_request ) | (enumLiteral_34= Paths ) | (enumLiteral_35= Branches ) | (enumLiteral_36= Tags ) | (enumLiteral_37= BranchesIgnore ) | (enumLiteral_38= PathsIgnore ) | (enumLiteral_39= TagsIgnore ) | (enumLiteral_40= Cron ) | (enumLiteral_41= Repository_dispatch ) | (enumLiteral_42= Workflow_run ) | (enumLiteral_43= Checkout ) | (enumLiteral_44= Filters ) | (enumLiteral_45= Include ) | (enumLiteral_46= Exclude ) | (enumLiteral_47= FailFast ) | (enumLiteral_48= MaxParallel ) | (enumLiteral_49= ContainerImage ) | (enumLiteral_50= Credentials ) | (enumLiteral_51= Ports ) | (enumLiteral_52= Inherit ) | (enumLiteral_53= Trigger ) | (enumLiteral_54= Pool ) | (enumLiteral_55= DisplayName ) | (enumLiteral_56= Task ) | (enumLiteral_57= Template ) | (enumLiteral_58= DependsOn ) | (enumLiteral_59= Workspace ) | (enumLiteral_60= Parameters ) | (enumLiteral_61= VmImage ) | (enumLiteral_62= Resources ) | (enumLiteral_63= Pipeline ) | (enumLiteral_64= Stage ) | (enumLiteral_65= TimeoutInMinutes ) | (enumLiteral_66= ContinueOnError ) | (enumLiteral_67= ResourceType ) | (enumLiteral_68= ResourceName ) | (enumLiteral_69= Stages ) | (enumLiteral_70= Only ) | (enumLiteral_71= Except ) | (enumLiteral_72= Image ) | (enumLiteral_73= Variables ) | (enumLiteral_74= Cache ) | (enumLiteral_75= Artifacts ) | (enumLiteral_76= Retries ) | (enumLiteral_77= Rules ) | (enumLiteral_78= Before_script ) | (enumLiteral_79= After_script ) | (enumLiteral_80= Timeout ) | (enumLiteral_81= When ) | (enumLiteral_82= Allow_failure ) | (enumLiteral_83= Dependencies ) | (enumLiteral_84= Extends ) | (enumLiteral_85= Pipelines ) | (enumLiteral_86= Default ) | (enumLiteral_87= PullRequests ) | (enumLiteral_88= Step ) | (enumLiteral_89= Script ) | (enumLiteral_90= Definitions ) | (enumLiteral_91= Caches ) | (enumLiteral_92= Parallel ) | (enumLiteral_93= Conditions ) | (enumLiteral_94= MaxTime ) | (enumLiteral_95= Project ) | (enumLiteral_96= Plan ) | (enumLiteral_97= Tasks ) | (enumLiteral_98= Requirements ) | (enumLiteral_99= Final ) | (enumLiteral_100= Jdk ) | (enumLiteral_101= Labels ) | (enumLiteral_102= Repository ) | (enumLiteral_103= Deployment ) | (enumLiteral_104= Release ) | (enumLiteral_105= Version ) | (enumLiteral_106= Docker ) | (enumLiteral_107= Agent ) | (enumLiteral_108= Queue ) | (enumLiteral_109= Snapshot ) | (enumLiteral_110= Policy ) | (enumLiteral_111= Approvals ) | (enumLiteral_112= PreBuild ) | (enumLiteral_113= PostBuild ) | (enumLiteral_114= Ssh ) | (enumLiteral_115= Auth ) | (enumLiteral_116= Storage ) | (enumLiteral_117= Endpoints ) | (enumLiteral_118= Command ) | (enumLiteral_119= Provisioner ) | (enumLiteral_120= TriggerRules ) | (enumLiteral_121= RunPolicy ) | (enumLiteral_122= Queued ) | (enumLiteral_123= AutoCancel ) | (enumLiteral_124= Notifications ) | (enumLiteral_125= DeployTrigger ) | (enumLiteral_126= ReleaseTrigger ) | (enumLiteral_127= LockBehavior ) | (enumLiteral_128= ReviewStage ) ) )
            // InternalPipelineParser.g:5037:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= On ) | (enumLiteral_2= RunName ) | (enumLiteral_3= If ) | (enumLiteral_4= RunsOn ) | (enumLiteral_5= Env ) | (enumLiteral_6= Defaults ) | (enumLiteral_7= Strategy ) | (enumLiteral_8= Matrix ) | (enumLiteral_9= Container ) | (enumLiteral_10= Services ) | (enumLiteral_11= Steps ) | (enumLiteral_12= Uses ) | (enumLiteral_13= Run ) | (enumLiteral_14= Shell ) | (enumLiteral_15= WorkingDirectory ) | (enumLiteral_16= With ) | (enumLiteral_17= TimeoutMinutes ) | (enumLiteral_18= ContinueOnError_1 ) | (enumLiteral_19= Condition ) | (enumLiteral_20= Environment ) | (enumLiteral_21= Id ) | (enumLiteral_22= Needs ) | (enumLiteral_23= Outputs ) | (enumLiteral_24= Secrets ) | (enumLiteral_25= Permissions ) | (enumLiteral_26= Concurrency ) | (enumLiteral_27= Timeouts ) | (enumLiteral_28= DefaultsRun ) | (enumLiteral_29= Workflow_dispatch ) | (enumLiteral_30= Workflow_call ) | (enumLiteral_31= Schedule ) | (enumLiteral_32= Push ) | (enumLiteral_33= Pull_request ) | (enumLiteral_34= Paths ) | (enumLiteral_35= Branches ) | (enumLiteral_36= Tags ) | (enumLiteral_37= BranchesIgnore ) | (enumLiteral_38= PathsIgnore ) | (enumLiteral_39= TagsIgnore ) | (enumLiteral_40= Cron ) | (enumLiteral_41= Repository_dispatch ) | (enumLiteral_42= Workflow_run ) | (enumLiteral_43= Checkout ) | (enumLiteral_44= Filters ) | (enumLiteral_45= Include ) | (enumLiteral_46= Exclude ) | (enumLiteral_47= FailFast ) | (enumLiteral_48= MaxParallel ) | (enumLiteral_49= ContainerImage ) | (enumLiteral_50= Credentials ) | (enumLiteral_51= Ports ) | (enumLiteral_52= Inherit ) | (enumLiteral_53= Trigger ) | (enumLiteral_54= Pool ) | (enumLiteral_55= DisplayName ) | (enumLiteral_56= Task ) | (enumLiteral_57= Template ) | (enumLiteral_58= DependsOn ) | (enumLiteral_59= Workspace ) | (enumLiteral_60= Parameters ) | (enumLiteral_61= VmImage ) | (enumLiteral_62= Resources ) | (enumLiteral_63= Pipeline ) | (enumLiteral_64= Stage ) | (enumLiteral_65= TimeoutInMinutes ) | (enumLiteral_66= ContinueOnError ) | (enumLiteral_67= ResourceType ) | (enumLiteral_68= ResourceName ) | (enumLiteral_69= Stages ) | (enumLiteral_70= Only ) | (enumLiteral_71= Except ) | (enumLiteral_72= Image ) | (enumLiteral_73= Variables ) | (enumLiteral_74= Cache ) | (enumLiteral_75= Artifacts ) | (enumLiteral_76= Retries ) | (enumLiteral_77= Rules ) | (enumLiteral_78= Before_script ) | (enumLiteral_79= After_script ) | (enumLiteral_80= Timeout ) | (enumLiteral_81= When ) | (enumLiteral_82= Allow_failure ) | (enumLiteral_83= Dependencies ) | (enumLiteral_84= Extends ) | (enumLiteral_85= Pipelines ) | (enumLiteral_86= Default ) | (enumLiteral_87= PullRequests ) | (enumLiteral_88= Step ) | (enumLiteral_89= Script ) | (enumLiteral_90= Definitions ) | (enumLiteral_91= Caches ) | (enumLiteral_92= Parallel ) | (enumLiteral_93= Conditions ) | (enumLiteral_94= MaxTime ) | (enumLiteral_95= Project ) | (enumLiteral_96= Plan ) | (enumLiteral_97= Tasks ) | (enumLiteral_98= Requirements ) | (enumLiteral_99= Final ) | (enumLiteral_100= Jdk ) | (enumLiteral_101= Labels ) | (enumLiteral_102= Repository ) | (enumLiteral_103= Deployment ) | (enumLiteral_104= Release ) | (enumLiteral_105= Version ) | (enumLiteral_106= Docker ) | (enumLiteral_107= Agent ) | (enumLiteral_108= Queue ) | (enumLiteral_109= Snapshot ) | (enumLiteral_110= Policy ) | (enumLiteral_111= Approvals ) | (enumLiteral_112= PreBuild ) | (enumLiteral_113= PostBuild ) | (enumLiteral_114= Ssh ) | (enumLiteral_115= Auth ) | (enumLiteral_116= Storage ) | (enumLiteral_117= Endpoints ) | (enumLiteral_118= Command ) | (enumLiteral_119= Provisioner ) | (enumLiteral_120= TriggerRules ) | (enumLiteral_121= RunPolicy ) | (enumLiteral_122= Queued ) | (enumLiteral_123= AutoCancel ) | (enumLiteral_124= Notifications ) | (enumLiteral_125= DeployTrigger ) | (enumLiteral_126= ReleaseTrigger ) | (enumLiteral_127= LockBehavior ) | (enumLiteral_128= ReviewStage ) )
            {
            // InternalPipelineParser.g:5037:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= On ) | (enumLiteral_2= RunName ) | (enumLiteral_3= If ) | (enumLiteral_4= RunsOn ) | (enumLiteral_5= Env ) | (enumLiteral_6= Defaults ) | (enumLiteral_7= Strategy ) | (enumLiteral_8= Matrix ) | (enumLiteral_9= Container ) | (enumLiteral_10= Services ) | (enumLiteral_11= Steps ) | (enumLiteral_12= Uses ) | (enumLiteral_13= Run ) | (enumLiteral_14= Shell ) | (enumLiteral_15= WorkingDirectory ) | (enumLiteral_16= With ) | (enumLiteral_17= TimeoutMinutes ) | (enumLiteral_18= ContinueOnError_1 ) | (enumLiteral_19= Condition ) | (enumLiteral_20= Environment ) | (enumLiteral_21= Id ) | (enumLiteral_22= Needs ) | (enumLiteral_23= Outputs ) | (enumLiteral_24= Secrets ) | (enumLiteral_25= Permissions ) | (enumLiteral_26= Concurrency ) | (enumLiteral_27= Timeouts ) | (enumLiteral_28= DefaultsRun ) | (enumLiteral_29= Workflow_dispatch ) | (enumLiteral_30= Workflow_call ) | (enumLiteral_31= Schedule ) | (enumLiteral_32= Push ) | (enumLiteral_33= Pull_request ) | (enumLiteral_34= Paths ) | (enumLiteral_35= Branches ) | (enumLiteral_36= Tags ) | (enumLiteral_37= BranchesIgnore ) | (enumLiteral_38= PathsIgnore ) | (enumLiteral_39= TagsIgnore ) | (enumLiteral_40= Cron ) | (enumLiteral_41= Repository_dispatch ) | (enumLiteral_42= Workflow_run ) | (enumLiteral_43= Checkout ) | (enumLiteral_44= Filters ) | (enumLiteral_45= Include ) | (enumLiteral_46= Exclude ) | (enumLiteral_47= FailFast ) | (enumLiteral_48= MaxParallel ) | (enumLiteral_49= ContainerImage ) | (enumLiteral_50= Credentials ) | (enumLiteral_51= Ports ) | (enumLiteral_52= Inherit ) | (enumLiteral_53= Trigger ) | (enumLiteral_54= Pool ) | (enumLiteral_55= DisplayName ) | (enumLiteral_56= Task ) | (enumLiteral_57= Template ) | (enumLiteral_58= DependsOn ) | (enumLiteral_59= Workspace ) | (enumLiteral_60= Parameters ) | (enumLiteral_61= VmImage ) | (enumLiteral_62= Resources ) | (enumLiteral_63= Pipeline ) | (enumLiteral_64= Stage ) | (enumLiteral_65= TimeoutInMinutes ) | (enumLiteral_66= ContinueOnError ) | (enumLiteral_67= ResourceType ) | (enumLiteral_68= ResourceName ) | (enumLiteral_69= Stages ) | (enumLiteral_70= Only ) | (enumLiteral_71= Except ) | (enumLiteral_72= Image ) | (enumLiteral_73= Variables ) | (enumLiteral_74= Cache ) | (enumLiteral_75= Artifacts ) | (enumLiteral_76= Retries ) | (enumLiteral_77= Rules ) | (enumLiteral_78= Before_script ) | (enumLiteral_79= After_script ) | (enumLiteral_80= Timeout ) | (enumLiteral_81= When ) | (enumLiteral_82= Allow_failure ) | (enumLiteral_83= Dependencies ) | (enumLiteral_84= Extends ) | (enumLiteral_85= Pipelines ) | (enumLiteral_86= Default ) | (enumLiteral_87= PullRequests ) | (enumLiteral_88= Step ) | (enumLiteral_89= Script ) | (enumLiteral_90= Definitions ) | (enumLiteral_91= Caches ) | (enumLiteral_92= Parallel ) | (enumLiteral_93= Conditions ) | (enumLiteral_94= MaxTime ) | (enumLiteral_95= Project ) | (enumLiteral_96= Plan ) | (enumLiteral_97= Tasks ) | (enumLiteral_98= Requirements ) | (enumLiteral_99= Final ) | (enumLiteral_100= Jdk ) | (enumLiteral_101= Labels ) | (enumLiteral_102= Repository ) | (enumLiteral_103= Deployment ) | (enumLiteral_104= Release ) | (enumLiteral_105= Version ) | (enumLiteral_106= Docker ) | (enumLiteral_107= Agent ) | (enumLiteral_108= Queue ) | (enumLiteral_109= Snapshot ) | (enumLiteral_110= Policy ) | (enumLiteral_111= Approvals ) | (enumLiteral_112= PreBuild ) | (enumLiteral_113= PostBuild ) | (enumLiteral_114= Ssh ) | (enumLiteral_115= Auth ) | (enumLiteral_116= Storage ) | (enumLiteral_117= Endpoints ) | (enumLiteral_118= Command ) | (enumLiteral_119= Provisioner ) | (enumLiteral_120= TriggerRules ) | (enumLiteral_121= RunPolicy ) | (enumLiteral_122= Queued ) | (enumLiteral_123= AutoCancel ) | (enumLiteral_124= Notifications ) | (enumLiteral_125= DeployTrigger ) | (enumLiteral_126= ReleaseTrigger ) | (enumLiteral_127= LockBehavior ) | (enumLiteral_128= ReviewStage ) )
            int alt149=129;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt149=1;
                }
                break;
            case On:
                {
                alt149=2;
                }
                break;
            case RunName:
                {
                alt149=3;
                }
                break;
            case If:
                {
                alt149=4;
                }
                break;
            case RunsOn:
                {
                alt149=5;
                }
                break;
            case Env:
                {
                alt149=6;
                }
                break;
            case Defaults:
                {
                alt149=7;
                }
                break;
            case Strategy:
                {
                alt149=8;
                }
                break;
            case Matrix:
                {
                alt149=9;
                }
                break;
            case Container:
                {
                alt149=10;
                }
                break;
            case Services:
                {
                alt149=11;
                }
                break;
            case Steps:
                {
                alt149=12;
                }
                break;
            case Uses:
                {
                alt149=13;
                }
                break;
            case Run:
                {
                alt149=14;
                }
                break;
            case Shell:
                {
                alt149=15;
                }
                break;
            case WorkingDirectory:
                {
                alt149=16;
                }
                break;
            case With:
                {
                alt149=17;
                }
                break;
            case TimeoutMinutes:
                {
                alt149=18;
                }
                break;
            case ContinueOnError_1:
                {
                alt149=19;
                }
                break;
            case Condition:
                {
                alt149=20;
                }
                break;
            case Environment:
                {
                alt149=21;
                }
                break;
            case Id:
                {
                alt149=22;
                }
                break;
            case Needs:
                {
                alt149=23;
                }
                break;
            case Outputs:
                {
                alt149=24;
                }
                break;
            case Secrets:
                {
                alt149=25;
                }
                break;
            case Permissions:
                {
                alt149=26;
                }
                break;
            case Concurrency:
                {
                alt149=27;
                }
                break;
            case Timeouts:
                {
                alt149=28;
                }
                break;
            case DefaultsRun:
                {
                alt149=29;
                }
                break;
            case Workflow_dispatch:
                {
                alt149=30;
                }
                break;
            case Workflow_call:
                {
                alt149=31;
                }
                break;
            case Schedule:
                {
                alt149=32;
                }
                break;
            case Push:
                {
                alt149=33;
                }
                break;
            case Pull_request:
                {
                alt149=34;
                }
                break;
            case Paths:
                {
                alt149=35;
                }
                break;
            case Branches:
                {
                alt149=36;
                }
                break;
            case Tags:
                {
                alt149=37;
                }
                break;
            case BranchesIgnore:
                {
                alt149=38;
                }
                break;
            case PathsIgnore:
                {
                alt149=39;
                }
                break;
            case TagsIgnore:
                {
                alt149=40;
                }
                break;
            case Cron:
                {
                alt149=41;
                }
                break;
            case Repository_dispatch:
                {
                alt149=42;
                }
                break;
            case Workflow_run:
                {
                alt149=43;
                }
                break;
            case Checkout:
                {
                alt149=44;
                }
                break;
            case Filters:
                {
                alt149=45;
                }
                break;
            case Include:
                {
                alt149=46;
                }
                break;
            case Exclude:
                {
                alt149=47;
                }
                break;
            case FailFast:
                {
                alt149=48;
                }
                break;
            case MaxParallel:
                {
                alt149=49;
                }
                break;
            case ContainerImage:
                {
                alt149=50;
                }
                break;
            case Credentials:
                {
                alt149=51;
                }
                break;
            case Ports:
                {
                alt149=52;
                }
                break;
            case Inherit:
                {
                alt149=53;
                }
                break;
            case Trigger:
                {
                alt149=54;
                }
                break;
            case Pool:
                {
                alt149=55;
                }
                break;
            case DisplayName:
                {
                alt149=56;
                }
                break;
            case Task:
                {
                alt149=57;
                }
                break;
            case Template:
                {
                alt149=58;
                }
                break;
            case DependsOn:
                {
                alt149=59;
                }
                break;
            case Workspace:
                {
                alt149=60;
                }
                break;
            case Parameters:
                {
                alt149=61;
                }
                break;
            case VmImage:
                {
                alt149=62;
                }
                break;
            case Resources:
                {
                alt149=63;
                }
                break;
            case Pipeline:
                {
                alt149=64;
                }
                break;
            case Stage:
                {
                alt149=65;
                }
                break;
            case TimeoutInMinutes:
                {
                alt149=66;
                }
                break;
            case ContinueOnError:
                {
                alt149=67;
                }
                break;
            case ResourceType:
                {
                alt149=68;
                }
                break;
            case ResourceName:
                {
                alt149=69;
                }
                break;
            case Stages:
                {
                alt149=70;
                }
                break;
            case Only:
                {
                alt149=71;
                }
                break;
            case Except:
                {
                alt149=72;
                }
                break;
            case Image:
                {
                alt149=73;
                }
                break;
            case Variables:
                {
                alt149=74;
                }
                break;
            case Cache:
                {
                alt149=75;
                }
                break;
            case Artifacts:
                {
                alt149=76;
                }
                break;
            case Retries:
                {
                alt149=77;
                }
                break;
            case Rules:
                {
                alt149=78;
                }
                break;
            case Before_script:
                {
                alt149=79;
                }
                break;
            case After_script:
                {
                alt149=80;
                }
                break;
            case Timeout:
                {
                alt149=81;
                }
                break;
            case When:
                {
                alt149=82;
                }
                break;
            case Allow_failure:
                {
                alt149=83;
                }
                break;
            case Dependencies:
                {
                alt149=84;
                }
                break;
            case Extends:
                {
                alt149=85;
                }
                break;
            case Pipelines:
                {
                alt149=86;
                }
                break;
            case Default:
                {
                alt149=87;
                }
                break;
            case PullRequests:
                {
                alt149=88;
                }
                break;
            case Step:
                {
                alt149=89;
                }
                break;
            case Script:
                {
                alt149=90;
                }
                break;
            case Definitions:
                {
                alt149=91;
                }
                break;
            case Caches:
                {
                alt149=92;
                }
                break;
            case Parallel:
                {
                alt149=93;
                }
                break;
            case Conditions:
                {
                alt149=94;
                }
                break;
            case MaxTime:
                {
                alt149=95;
                }
                break;
            case Project:
                {
                alt149=96;
                }
                break;
            case Plan:
                {
                alt149=97;
                }
                break;
            case Tasks:
                {
                alt149=98;
                }
                break;
            case Requirements:
                {
                alt149=99;
                }
                break;
            case Final:
                {
                alt149=100;
                }
                break;
            case Jdk:
                {
                alt149=101;
                }
                break;
            case Labels:
                {
                alt149=102;
                }
                break;
            case Repository:
                {
                alt149=103;
                }
                break;
            case Deployment:
                {
                alt149=104;
                }
                break;
            case Release:
                {
                alt149=105;
                }
                break;
            case Version:
                {
                alt149=106;
                }
                break;
            case Docker:
                {
                alt149=107;
                }
                break;
            case Agent:
                {
                alt149=108;
                }
                break;
            case Queue:
                {
                alt149=109;
                }
                break;
            case Snapshot:
                {
                alt149=110;
                }
                break;
            case Policy:
                {
                alt149=111;
                }
                break;
            case Approvals:
                {
                alt149=112;
                }
                break;
            case PreBuild:
                {
                alt149=113;
                }
                break;
            case PostBuild:
                {
                alt149=114;
                }
                break;
            case Ssh:
                {
                alt149=115;
                }
                break;
            case Auth:
                {
                alt149=116;
                }
                break;
            case Storage:
                {
                alt149=117;
                }
                break;
            case Endpoints:
                {
                alt149=118;
                }
                break;
            case Command:
                {
                alt149=119;
                }
                break;
            case Provisioner:
                {
                alt149=120;
                }
                break;
            case TriggerRules:
                {
                alt149=121;
                }
                break;
            case RunPolicy:
                {
                alt149=122;
                }
                break;
            case Queued:
                {
                alt149=123;
                }
                break;
            case AutoCancel:
                {
                alt149=124;
                }
                break;
            case Notifications:
                {
                alt149=125;
                }
                break;
            case DeployTrigger:
                {
                alt149=126;
                }
                break;
            case ReleaseTrigger:
                {
                alt149=127;
                }
                break;
            case LockBehavior:
                {
                alt149=128;
                }
                break;
            case ReviewStage:
                {
                alt149=129;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // InternalPipelineParser.g:5038:3: (enumLiteral_0= Name )
                    {
                    // InternalPipelineParser.g:5038:3: (enumLiteral_0= Name )
                    // InternalPipelineParser.g:5039:4: enumLiteral_0= Name
                    {
                    enumLiteral_0=(Token)match(input,Name,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_NAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPipelineKeywordAccess().getPPL_KW_NAMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:5046:3: (enumLiteral_1= On )
                    {
                    // InternalPipelineParser.g:5046:3: (enumLiteral_1= On )
                    // InternalPipelineParser.g:5047:4: enumLiteral_1= On
                    {
                    enumLiteral_1=(Token)match(input,On,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:5054:3: (enumLiteral_2= RunName )
                    {
                    // InternalPipelineParser.g:5054:3: (enumLiteral_2= RunName )
                    // InternalPipelineParser.g:5055:4: enumLiteral_2= RunName
                    {
                    enumLiteral_2=(Token)match(input,RunName,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUN_NAMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUN_NAMEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:5062:3: (enumLiteral_3= If )
                    {
                    // InternalPipelineParser.g:5062:3: (enumLiteral_3= If )
                    // InternalPipelineParser.g:5063:4: enumLiteral_3= If
                    {
                    enumLiteral_3=(Token)match(input,If,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_IFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPipelineKeywordAccess().getPPL_KW_IFEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:5070:3: (enumLiteral_4= RunsOn )
                    {
                    // InternalPipelineParser.g:5070:3: (enumLiteral_4= RunsOn )
                    // InternalPipelineParser.g:5071:4: enumLiteral_4= RunsOn
                    {
                    enumLiteral_4=(Token)match(input,RunsOn,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNS_ONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNS_ONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:5078:3: (enumLiteral_5= Env )
                    {
                    // InternalPipelineParser.g:5078:3: (enumLiteral_5= Env )
                    // InternalPipelineParser.g:5079:4: enumLiteral_5= Env
                    {
                    enumLiteral_5=(Token)match(input,Env,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:5086:3: (enumLiteral_6= Defaults )
                    {
                    // InternalPipelineParser.g:5086:3: (enumLiteral_6= Defaults )
                    // InternalPipelineParser.g:5087:4: enumLiteral_6= Defaults
                    {
                    enumLiteral_6=(Token)match(input,Defaults,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTSEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalPipelineParser.g:5094:3: (enumLiteral_7= Strategy )
                    {
                    // InternalPipelineParser.g:5094:3: (enumLiteral_7= Strategy )
                    // InternalPipelineParser.g:5095:4: enumLiteral_7= Strategy
                    {
                    enumLiteral_7=(Token)match(input,Strategy,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STRATEGYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STRATEGYEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalPipelineParser.g:5102:3: (enumLiteral_8= Matrix )
                    {
                    // InternalPipelineParser.g:5102:3: (enumLiteral_8= Matrix )
                    // InternalPipelineParser.g:5103:4: enumLiteral_8= Matrix
                    {
                    enumLiteral_8=(Token)match(input,Matrix,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_MATRIXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPipelineKeywordAccess().getPPL_KW_MATRIXEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalPipelineParser.g:5110:3: (enumLiteral_9= Container )
                    {
                    // InternalPipelineParser.g:5110:3: (enumLiteral_9= Container )
                    // InternalPipelineParser.g:5111:4: enumLiteral_9= Container
                    {
                    enumLiteral_9=(Token)match(input,Container,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINEREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINEREnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalPipelineParser.g:5118:3: (enumLiteral_10= Services )
                    {
                    // InternalPipelineParser.g:5118:3: (enumLiteral_10= Services )
                    // InternalPipelineParser.g:5119:4: enumLiteral_10= Services
                    {
                    enumLiteral_10=(Token)match(input,Services,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SERVICESEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SERVICESEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalPipelineParser.g:5126:3: (enumLiteral_11= Steps )
                    {
                    // InternalPipelineParser.g:5126:3: (enumLiteral_11= Steps )
                    // InternalPipelineParser.g:5127:4: enumLiteral_11= Steps
                    {
                    enumLiteral_11=(Token)match(input,Steps,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STEPSEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STEPSEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalPipelineParser.g:5134:3: (enumLiteral_12= Uses )
                    {
                    // InternalPipelineParser.g:5134:3: (enumLiteral_12= Uses )
                    // InternalPipelineParser.g:5135:4: enumLiteral_12= Uses
                    {
                    enumLiteral_12=(Token)match(input,Uses,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_USESEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getPipelineKeywordAccess().getPPL_KW_USESEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalPipelineParser.g:5142:3: (enumLiteral_13= Run )
                    {
                    // InternalPipelineParser.g:5142:3: (enumLiteral_13= Run )
                    // InternalPipelineParser.g:5143:4: enumLiteral_13= Run
                    {
                    enumLiteral_13=(Token)match(input,Run,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalPipelineParser.g:5150:3: (enumLiteral_14= Shell )
                    {
                    // InternalPipelineParser.g:5150:3: (enumLiteral_14= Shell )
                    // InternalPipelineParser.g:5151:4: enumLiteral_14= Shell
                    {
                    enumLiteral_14=(Token)match(input,Shell,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SHELLEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SHELLEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalPipelineParser.g:5158:3: (enumLiteral_15= WorkingDirectory )
                    {
                    // InternalPipelineParser.g:5158:3: (enumLiteral_15= WorkingDirectory )
                    // InternalPipelineParser.g:5159:4: enumLiteral_15= WorkingDirectory
                    {
                    enumLiteral_15=(Token)match(input,WorkingDirectory,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKING_DIRECTORYEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKING_DIRECTORYEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalPipelineParser.g:5166:3: (enumLiteral_16= With )
                    {
                    // InternalPipelineParser.g:5166:3: (enumLiteral_16= With )
                    // InternalPipelineParser.g:5167:4: enumLiteral_16= With
                    {
                    enumLiteral_16=(Token)match(input,With,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WITHEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WITHEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalPipelineParser.g:5174:3: (enumLiteral_17= TimeoutMinutes )
                    {
                    // InternalPipelineParser.g:5174:3: (enumLiteral_17= TimeoutMinutes )
                    // InternalPipelineParser.g:5175:4: enumLiteral_17= TimeoutMinutes
                    {
                    enumLiteral_17=(Token)match(input,TimeoutMinutes,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUT_MINUTESEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUT_MINUTESEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalPipelineParser.g:5182:3: (enumLiteral_18= ContinueOnError_1 )
                    {
                    // InternalPipelineParser.g:5182:3: (enumLiteral_18= ContinueOnError_1 )
                    // InternalPipelineParser.g:5183:4: enumLiteral_18= ContinueOnError_1
                    {
                    enumLiteral_18=(Token)match(input,ContinueOnError_1,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTINUE_ON_ERROREnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTINUE_ON_ERROREnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalPipelineParser.g:5190:3: (enumLiteral_19= Condition )
                    {
                    // InternalPipelineParser.g:5190:3: (enumLiteral_19= Condition )
                    // InternalPipelineParser.g:5191:4: enumLiteral_19= Condition
                    {
                    enumLiteral_19=(Token)match(input,Condition,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONDITIONEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONDITIONEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalPipelineParser.g:5198:3: (enumLiteral_20= Environment )
                    {
                    // InternalPipelineParser.g:5198:3: (enumLiteral_20= Environment )
                    // InternalPipelineParser.g:5199:4: enumLiteral_20= Environment
                    {
                    enumLiteral_20=(Token)match(input,Environment,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVIRONMENTEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVIRONMENTEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalPipelineParser.g:5206:3: (enumLiteral_21= Id )
                    {
                    // InternalPipelineParser.g:5206:3: (enumLiteral_21= Id )
                    // InternalPipelineParser.g:5207:4: enumLiteral_21= Id
                    {
                    enumLiteral_21=(Token)match(input,Id,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_IDEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getPipelineKeywordAccess().getPPL_KW_IDEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalPipelineParser.g:5214:3: (enumLiteral_22= Needs )
                    {
                    // InternalPipelineParser.g:5214:3: (enumLiteral_22= Needs )
                    // InternalPipelineParser.g:5215:4: enumLiteral_22= Needs
                    {
                    enumLiteral_22=(Token)match(input,Needs,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_NEEDSEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getPipelineKeywordAccess().getPPL_KW_NEEDSEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalPipelineParser.g:5222:3: (enumLiteral_23= Outputs )
                    {
                    // InternalPipelineParser.g:5222:3: (enumLiteral_23= Outputs )
                    // InternalPipelineParser.g:5223:4: enumLiteral_23= Outputs
                    {
                    enumLiteral_23=(Token)match(input,Outputs,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_OUTPUTSEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getPipelineKeywordAccess().getPPL_KW_OUTPUTSEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalPipelineParser.g:5230:3: (enumLiteral_24= Secrets )
                    {
                    // InternalPipelineParser.g:5230:3: (enumLiteral_24= Secrets )
                    // InternalPipelineParser.g:5231:4: enumLiteral_24= Secrets
                    {
                    enumLiteral_24=(Token)match(input,Secrets,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SECRETSEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SECRETSEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalPipelineParser.g:5238:3: (enumLiteral_25= Permissions )
                    {
                    // InternalPipelineParser.g:5238:3: (enumLiteral_25= Permissions )
                    // InternalPipelineParser.g:5239:4: enumLiteral_25= Permissions
                    {
                    enumLiteral_25=(Token)match(input,Permissions,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PERMISSIONSEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PERMISSIONSEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalPipelineParser.g:5246:3: (enumLiteral_26= Concurrency )
                    {
                    // InternalPipelineParser.g:5246:3: (enumLiteral_26= Concurrency )
                    // InternalPipelineParser.g:5247:4: enumLiteral_26= Concurrency
                    {
                    enumLiteral_26=(Token)match(input,Concurrency,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONCURRENCYEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONCURRENCYEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalPipelineParser.g:5254:3: (enumLiteral_27= Timeouts )
                    {
                    // InternalPipelineParser.g:5254:3: (enumLiteral_27= Timeouts )
                    // InternalPipelineParser.g:5255:4: enumLiteral_27= Timeouts
                    {
                    enumLiteral_27=(Token)match(input,Timeouts,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUTSEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_27, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUTSEnumLiteralDeclaration_27());
                    			

                    }


                    }
                    break;
                case 29 :
                    // InternalPipelineParser.g:5262:3: (enumLiteral_28= DefaultsRun )
                    {
                    // InternalPipelineParser.g:5262:3: (enumLiteral_28= DefaultsRun )
                    // InternalPipelineParser.g:5263:4: enumLiteral_28= DefaultsRun
                    {
                    enumLiteral_28=(Token)match(input,DefaultsRun,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTS_RUNEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_28, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTS_RUNEnumLiteralDeclaration_28());
                    			

                    }


                    }
                    break;
                case 30 :
                    // InternalPipelineParser.g:5270:3: (enumLiteral_29= Workflow_dispatch )
                    {
                    // InternalPipelineParser.g:5270:3: (enumLiteral_29= Workflow_dispatch )
                    // InternalPipelineParser.g:5271:4: enumLiteral_29= Workflow_dispatch
                    {
                    enumLiteral_29=(Token)match(input,Workflow_dispatch,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_DISPATCHEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_29, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_DISPATCHEnumLiteralDeclaration_29());
                    			

                    }


                    }
                    break;
                case 31 :
                    // InternalPipelineParser.g:5278:3: (enumLiteral_30= Workflow_call )
                    {
                    // InternalPipelineParser.g:5278:3: (enumLiteral_30= Workflow_call )
                    // InternalPipelineParser.g:5279:4: enumLiteral_30= Workflow_call
                    {
                    enumLiteral_30=(Token)match(input,Workflow_call,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_CALLEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_30, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_CALLEnumLiteralDeclaration_30());
                    			

                    }


                    }
                    break;
                case 32 :
                    // InternalPipelineParser.g:5286:3: (enumLiteral_31= Schedule )
                    {
                    // InternalPipelineParser.g:5286:3: (enumLiteral_31= Schedule )
                    // InternalPipelineParser.g:5287:4: enumLiteral_31= Schedule
                    {
                    enumLiteral_31=(Token)match(input,Schedule,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCHEDULEEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_31, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCHEDULEEnumLiteralDeclaration_31());
                    			

                    }


                    }
                    break;
                case 33 :
                    // InternalPipelineParser.g:5294:3: (enumLiteral_32= Push )
                    {
                    // InternalPipelineParser.g:5294:3: (enumLiteral_32= Push )
                    // InternalPipelineParser.g:5295:4: enumLiteral_32= Push
                    {
                    enumLiteral_32=(Token)match(input,Push,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PUSHEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_32, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PUSHEnumLiteralDeclaration_32());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalPipelineParser.g:5302:3: (enumLiteral_33= Pull_request )
                    {
                    // InternalPipelineParser.g:5302:3: (enumLiteral_33= Pull_request )
                    // InternalPipelineParser.g:5303:4: enumLiteral_33= Pull_request
                    {
                    enumLiteral_33=(Token)match(input,Pull_request,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PULL_REQUESTEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_33, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PULL_REQUESTEnumLiteralDeclaration_33());
                    			

                    }


                    }
                    break;
                case 35 :
                    // InternalPipelineParser.g:5310:3: (enumLiteral_34= Paths )
                    {
                    // InternalPipelineParser.g:5310:3: (enumLiteral_34= Paths )
                    // InternalPipelineParser.g:5311:4: enumLiteral_34= Paths
                    {
                    enumLiteral_34=(Token)match(input,Paths,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHSEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_34, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHSEnumLiteralDeclaration_34());
                    			

                    }


                    }
                    break;
                case 36 :
                    // InternalPipelineParser.g:5318:3: (enumLiteral_35= Branches )
                    {
                    // InternalPipelineParser.g:5318:3: (enumLiteral_35= Branches )
                    // InternalPipelineParser.g:5319:4: enumLiteral_35= Branches
                    {
                    enumLiteral_35=(Token)match(input,Branches,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHESEnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_35, grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHESEnumLiteralDeclaration_35());
                    			

                    }


                    }
                    break;
                case 37 :
                    // InternalPipelineParser.g:5326:3: (enumLiteral_36= Tags )
                    {
                    // InternalPipelineParser.g:5326:3: (enumLiteral_36= Tags )
                    // InternalPipelineParser.g:5327:4: enumLiteral_36= Tags
                    {
                    enumLiteral_36=(Token)match(input,Tags,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGSEnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_36, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGSEnumLiteralDeclaration_36());
                    			

                    }


                    }
                    break;
                case 38 :
                    // InternalPipelineParser.g:5334:3: (enumLiteral_37= BranchesIgnore )
                    {
                    // InternalPipelineParser.g:5334:3: (enumLiteral_37= BranchesIgnore )
                    // InternalPipelineParser.g:5335:4: enumLiteral_37= BranchesIgnore
                    {
                    enumLiteral_37=(Token)match(input,BranchesIgnore,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHES_IGNOREEnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_37, grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHES_IGNOREEnumLiteralDeclaration_37());
                    			

                    }


                    }
                    break;
                case 39 :
                    // InternalPipelineParser.g:5342:3: (enumLiteral_38= PathsIgnore )
                    {
                    // InternalPipelineParser.g:5342:3: (enumLiteral_38= PathsIgnore )
                    // InternalPipelineParser.g:5343:4: enumLiteral_38= PathsIgnore
                    {
                    enumLiteral_38=(Token)match(input,PathsIgnore,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHS_IGNOREEnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_38, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHS_IGNOREEnumLiteralDeclaration_38());
                    			

                    }


                    }
                    break;
                case 40 :
                    // InternalPipelineParser.g:5350:3: (enumLiteral_39= TagsIgnore )
                    {
                    // InternalPipelineParser.g:5350:3: (enumLiteral_39= TagsIgnore )
                    // InternalPipelineParser.g:5351:4: enumLiteral_39= TagsIgnore
                    {
                    enumLiteral_39=(Token)match(input,TagsIgnore,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGS_IGNOREEnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_39, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGS_IGNOREEnumLiteralDeclaration_39());
                    			

                    }


                    }
                    break;
                case 41 :
                    // InternalPipelineParser.g:5358:3: (enumLiteral_40= Cron )
                    {
                    // InternalPipelineParser.g:5358:3: (enumLiteral_40= Cron )
                    // InternalPipelineParser.g:5359:4: enumLiteral_40= Cron
                    {
                    enumLiteral_40=(Token)match(input,Cron,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CRONEnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_40, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CRONEnumLiteralDeclaration_40());
                    			

                    }


                    }
                    break;
                case 42 :
                    // InternalPipelineParser.g:5366:3: (enumLiteral_41= Repository_dispatch )
                    {
                    // InternalPipelineParser.g:5366:3: (enumLiteral_41= Repository_dispatch )
                    // InternalPipelineParser.g:5367:4: enumLiteral_41= Repository_dispatch
                    {
                    enumLiteral_41=(Token)match(input,Repository_dispatch,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_REPOSITORY_DISPATCHEnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_41, grammarAccess.getPipelineKeywordAccess().getPPL_KW_REPOSITORY_DISPATCHEnumLiteralDeclaration_41());
                    			

                    }


                    }
                    break;
                case 43 :
                    // InternalPipelineParser.g:5374:3: (enumLiteral_42= Workflow_run )
                    {
                    // InternalPipelineParser.g:5374:3: (enumLiteral_42= Workflow_run )
                    // InternalPipelineParser.g:5375:4: enumLiteral_42= Workflow_run
                    {
                    enumLiteral_42=(Token)match(input,Workflow_run,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_RUNEnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_42, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_RUNEnumLiteralDeclaration_42());
                    			

                    }


                    }
                    break;
                case 44 :
                    // InternalPipelineParser.g:5382:3: (enumLiteral_43= Checkout )
                    {
                    // InternalPipelineParser.g:5382:3: (enumLiteral_43= Checkout )
                    // InternalPipelineParser.g:5383:4: enumLiteral_43= Checkout
                    {
                    enumLiteral_43=(Token)match(input,Checkout,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CHECKOUTEnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_43, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CHECKOUTEnumLiteralDeclaration_43());
                    			

                    }


                    }
                    break;
                case 45 :
                    // InternalPipelineParser.g:5390:3: (enumLiteral_44= Filters )
                    {
                    // InternalPipelineParser.g:5390:3: (enumLiteral_44= Filters )
                    // InternalPipelineParser.g:5391:4: enumLiteral_44= Filters
                    {
                    enumLiteral_44=(Token)match(input,Filters,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_FILTERSEnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_44, grammarAccess.getPipelineKeywordAccess().getPPL_KW_FILTERSEnumLiteralDeclaration_44());
                    			

                    }


                    }
                    break;
                case 46 :
                    // InternalPipelineParser.g:5398:3: (enumLiteral_45= Include )
                    {
                    // InternalPipelineParser.g:5398:3: (enumLiteral_45= Include )
                    // InternalPipelineParser.g:5399:4: enumLiteral_45= Include
                    {
                    enumLiteral_45=(Token)match(input,Include,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_INCLUDEEnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_45, grammarAccess.getPipelineKeywordAccess().getPPL_KW_INCLUDEEnumLiteralDeclaration_45());
                    			

                    }


                    }
                    break;
                case 47 :
                    // InternalPipelineParser.g:5406:3: (enumLiteral_46= Exclude )
                    {
                    // InternalPipelineParser.g:5406:3: (enumLiteral_46= Exclude )
                    // InternalPipelineParser.g:5407:4: enumLiteral_46= Exclude
                    {
                    enumLiteral_46=(Token)match(input,Exclude,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXCLUDEEnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_46, grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXCLUDEEnumLiteralDeclaration_46());
                    			

                    }


                    }
                    break;
                case 48 :
                    // InternalPipelineParser.g:5414:3: (enumLiteral_47= FailFast )
                    {
                    // InternalPipelineParser.g:5414:3: (enumLiteral_47= FailFast )
                    // InternalPipelineParser.g:5415:4: enumLiteral_47= FailFast
                    {
                    enumLiteral_47=(Token)match(input,FailFast,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_FAIL_FASTEnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_47, grammarAccess.getPipelineKeywordAccess().getPPL_KW_FAIL_FASTEnumLiteralDeclaration_47());
                    			

                    }


                    }
                    break;
                case 49 :
                    // InternalPipelineParser.g:5422:3: (enumLiteral_48= MaxParallel )
                    {
                    // InternalPipelineParser.g:5422:3: (enumLiteral_48= MaxParallel )
                    // InternalPipelineParser.g:5423:4: enumLiteral_48= MaxParallel
                    {
                    enumLiteral_48=(Token)match(input,MaxParallel,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_MAX_PARALLELEnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_48, grammarAccess.getPipelineKeywordAccess().getPPL_KW_MAX_PARALLELEnumLiteralDeclaration_48());
                    			

                    }


                    }
                    break;
                case 50 :
                    // InternalPipelineParser.g:5430:3: (enumLiteral_49= ContainerImage )
                    {
                    // InternalPipelineParser.g:5430:3: (enumLiteral_49= ContainerImage )
                    // InternalPipelineParser.g:5431:4: enumLiteral_49= ContainerImage
                    {
                    enumLiteral_49=(Token)match(input,ContainerImage,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINER_IMAGEEnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_49, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINER_IMAGEEnumLiteralDeclaration_49());
                    			

                    }


                    }
                    break;
                case 51 :
                    // InternalPipelineParser.g:5438:3: (enumLiteral_50= Credentials )
                    {
                    // InternalPipelineParser.g:5438:3: (enumLiteral_50= Credentials )
                    // InternalPipelineParser.g:5439:4: enumLiteral_50= Credentials
                    {
                    enumLiteral_50=(Token)match(input,Credentials,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CREDENTIALSEnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_50, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CREDENTIALSEnumLiteralDeclaration_50());
                    			

                    }


                    }
                    break;
                case 52 :
                    // InternalPipelineParser.g:5446:3: (enumLiteral_51= Ports )
                    {
                    // InternalPipelineParser.g:5446:3: (enumLiteral_51= Ports )
                    // InternalPipelineParser.g:5447:4: enumLiteral_51= Ports
                    {
                    enumLiteral_51=(Token)match(input,Ports,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PORTSEnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_51, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PORTSEnumLiteralDeclaration_51());
                    			

                    }


                    }
                    break;
                case 53 :
                    // InternalPipelineParser.g:5454:3: (enumLiteral_52= Inherit )
                    {
                    // InternalPipelineParser.g:5454:3: (enumLiteral_52= Inherit )
                    // InternalPipelineParser.g:5455:4: enumLiteral_52= Inherit
                    {
                    enumLiteral_52=(Token)match(input,Inherit,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_INHERITEnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_52, grammarAccess.getPipelineKeywordAccess().getPPL_KW_INHERITEnumLiteralDeclaration_52());
                    			

                    }


                    }
                    break;
                case 54 :
                    // InternalPipelineParser.g:5462:3: (enumLiteral_53= Trigger )
                    {
                    // InternalPipelineParser.g:5462:3: (enumLiteral_53= Trigger )
                    // InternalPipelineParser.g:5463:4: enumLiteral_53= Trigger
                    {
                    enumLiteral_53=(Token)match(input,Trigger,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TRIGGEREnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_53, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TRIGGEREnumLiteralDeclaration_53());
                    			

                    }


                    }
                    break;
                case 55 :
                    // InternalPipelineParser.g:5470:3: (enumLiteral_54= Pool )
                    {
                    // InternalPipelineParser.g:5470:3: (enumLiteral_54= Pool )
                    // InternalPipelineParser.g:5471:4: enumLiteral_54= Pool
                    {
                    enumLiteral_54=(Token)match(input,Pool,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_POOLEnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_54, grammarAccess.getPipelineKeywordAccess().getPPL_KW_POOLEnumLiteralDeclaration_54());
                    			

                    }


                    }
                    break;
                case 56 :
                    // InternalPipelineParser.g:5478:3: (enumLiteral_55= DisplayName )
                    {
                    // InternalPipelineParser.g:5478:3: (enumLiteral_55= DisplayName )
                    // InternalPipelineParser.g:5479:4: enumLiteral_55= DisplayName
                    {
                    enumLiteral_55=(Token)match(input,DisplayName,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DISPLAY_NAMEEnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_55, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DISPLAY_NAMEEnumLiteralDeclaration_55());
                    			

                    }


                    }
                    break;
                case 57 :
                    // InternalPipelineParser.g:5486:3: (enumLiteral_56= Task )
                    {
                    // InternalPipelineParser.g:5486:3: (enumLiteral_56= Task )
                    // InternalPipelineParser.g:5487:4: enumLiteral_56= Task
                    {
                    enumLiteral_56=(Token)match(input,Task,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TASKEnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_56, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TASKEnumLiteralDeclaration_56());
                    			

                    }


                    }
                    break;
                case 58 :
                    // InternalPipelineParser.g:5494:3: (enumLiteral_57= Template )
                    {
                    // InternalPipelineParser.g:5494:3: (enumLiteral_57= Template )
                    // InternalPipelineParser.g:5495:4: enumLiteral_57= Template
                    {
                    enumLiteral_57=(Token)match(input,Template,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TEMPLATEEnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_57, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TEMPLATEEnumLiteralDeclaration_57());
                    			

                    }


                    }
                    break;
                case 59 :
                    // InternalPipelineParser.g:5502:3: (enumLiteral_58= DependsOn )
                    {
                    // InternalPipelineParser.g:5502:3: (enumLiteral_58= DependsOn )
                    // InternalPipelineParser.g:5503:4: enumLiteral_58= DependsOn
                    {
                    enumLiteral_58=(Token)match(input,DependsOn,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPENDS_ONEnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_58, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPENDS_ONEnumLiteralDeclaration_58());
                    			

                    }


                    }
                    break;
                case 60 :
                    // InternalPipelineParser.g:5510:3: (enumLiteral_59= Workspace )
                    {
                    // InternalPipelineParser.g:5510:3: (enumLiteral_59= Workspace )
                    // InternalPipelineParser.g:5511:4: enumLiteral_59= Workspace
                    {
                    enumLiteral_59=(Token)match(input,Workspace,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKSPACEEnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_59, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKSPACEEnumLiteralDeclaration_59());
                    			

                    }


                    }
                    break;
                case 61 :
                    // InternalPipelineParser.g:5518:3: (enumLiteral_60= Parameters )
                    {
                    // InternalPipelineParser.g:5518:3: (enumLiteral_60= Parameters )
                    // InternalPipelineParser.g:5519:4: enumLiteral_60= Parameters
                    {
                    enumLiteral_60=(Token)match(input,Parameters,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PARAMETERSEnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_60, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PARAMETERSEnumLiteralDeclaration_60());
                    			

                    }


                    }
                    break;
                case 62 :
                    // InternalPipelineParser.g:5526:3: (enumLiteral_61= VmImage )
                    {
                    // InternalPipelineParser.g:5526:3: (enumLiteral_61= VmImage )
                    // InternalPipelineParser.g:5527:4: enumLiteral_61= VmImage
                    {
                    enumLiteral_61=(Token)match(input,VmImage,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_POOL_VM_IMAGEEnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_61, grammarAccess.getPipelineKeywordAccess().getPPL_KW_POOL_VM_IMAGEEnumLiteralDeclaration_61());
                    			

                    }


                    }
                    break;
                case 63 :
                    // InternalPipelineParser.g:5534:3: (enumLiteral_62= Resources )
                    {
                    // InternalPipelineParser.g:5534:3: (enumLiteral_62= Resources )
                    // InternalPipelineParser.g:5535:4: enumLiteral_62= Resources
                    {
                    enumLiteral_62=(Token)match(input,Resources,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCESEnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_62, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCESEnumLiteralDeclaration_62());
                    			

                    }


                    }
                    break;
                case 64 :
                    // InternalPipelineParser.g:5542:3: (enumLiteral_63= Pipeline )
                    {
                    // InternalPipelineParser.g:5542:3: (enumLiteral_63= Pipeline )
                    // InternalPipelineParser.g:5543:4: enumLiteral_63= Pipeline
                    {
                    enumLiteral_63=(Token)match(input,Pipeline,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINEEnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_63, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINEEnumLiteralDeclaration_63());
                    			

                    }


                    }
                    break;
                case 65 :
                    // InternalPipelineParser.g:5550:3: (enumLiteral_64= Stage )
                    {
                    // InternalPipelineParser.g:5550:3: (enumLiteral_64= Stage )
                    // InternalPipelineParser.g:5551:4: enumLiteral_64= Stage
                    {
                    enumLiteral_64=(Token)match(input,Stage,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STAGEEnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_64, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STAGEEnumLiteralDeclaration_64());
                    			

                    }


                    }
                    break;
                case 66 :
                    // InternalPipelineParser.g:5558:3: (enumLiteral_65= TimeoutInMinutes )
                    {
                    // InternalPipelineParser.g:5558:3: (enumLiteral_65= TimeoutInMinutes )
                    // InternalPipelineParser.g:5559:4: enumLiteral_65= TimeoutInMinutes
                    {
                    enumLiteral_65=(Token)match(input,TimeoutInMinutes,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUT_IN_MINUTESEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_65, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUT_IN_MINUTESEnumLiteralDeclaration_65());
                    			

                    }


                    }
                    break;
                case 67 :
                    // InternalPipelineParser.g:5566:3: (enumLiteral_66= ContinueOnError )
                    {
                    // InternalPipelineParser.g:5566:3: (enumLiteral_66= ContinueOnError )
                    // InternalPipelineParser.g:5567:4: enumLiteral_66= ContinueOnError
                    {
                    enumLiteral_66=(Token)match(input,ContinueOnError,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTINUE_ON_ERREnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_66, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTINUE_ON_ERREnumLiteralDeclaration_66());
                    			

                    }


                    }
                    break;
                case 68 :
                    // InternalPipelineParser.g:5574:3: (enumLiteral_67= ResourceType )
                    {
                    // InternalPipelineParser.g:5574:3: (enumLiteral_67= ResourceType )
                    // InternalPipelineParser.g:5575:4: enumLiteral_67= ResourceType
                    {
                    enumLiteral_67=(Token)match(input,ResourceType,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCE_TYPEEnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_67, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCE_TYPEEnumLiteralDeclaration_67());
                    			

                    }


                    }
                    break;
                case 69 :
                    // InternalPipelineParser.g:5582:3: (enumLiteral_68= ResourceName )
                    {
                    // InternalPipelineParser.g:5582:3: (enumLiteral_68= ResourceName )
                    // InternalPipelineParser.g:5583:4: enumLiteral_68= ResourceName
                    {
                    enumLiteral_68=(Token)match(input,ResourceName,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCE_NAMEEnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_68, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCE_NAMEEnumLiteralDeclaration_68());
                    			

                    }


                    }
                    break;
                case 70 :
                    // InternalPipelineParser.g:5590:3: (enumLiteral_69= Stages )
                    {
                    // InternalPipelineParser.g:5590:3: (enumLiteral_69= Stages )
                    // InternalPipelineParser.g:5591:4: enumLiteral_69= Stages
                    {
                    enumLiteral_69=(Token)match(input,Stages,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STAGESEnumLiteralDeclaration_69().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_69, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STAGESEnumLiteralDeclaration_69());
                    			

                    }


                    }
                    break;
                case 71 :
                    // InternalPipelineParser.g:5598:3: (enumLiteral_70= Only )
                    {
                    // InternalPipelineParser.g:5598:3: (enumLiteral_70= Only )
                    // InternalPipelineParser.g:5599:4: enumLiteral_70= Only
                    {
                    enumLiteral_70=(Token)match(input,Only,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ONLYEnumLiteralDeclaration_70().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_70, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ONLYEnumLiteralDeclaration_70());
                    			

                    }


                    }
                    break;
                case 72 :
                    // InternalPipelineParser.g:5606:3: (enumLiteral_71= Except )
                    {
                    // InternalPipelineParser.g:5606:3: (enumLiteral_71= Except )
                    // InternalPipelineParser.g:5607:4: enumLiteral_71= Except
                    {
                    enumLiteral_71=(Token)match(input,Except,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXCEPTEnumLiteralDeclaration_71().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_71, grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXCEPTEnumLiteralDeclaration_71());
                    			

                    }


                    }
                    break;
                case 73 :
                    // InternalPipelineParser.g:5614:3: (enumLiteral_72= Image )
                    {
                    // InternalPipelineParser.g:5614:3: (enumLiteral_72= Image )
                    // InternalPipelineParser.g:5615:4: enumLiteral_72= Image
                    {
                    enumLiteral_72=(Token)match(input,Image,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_IMAGEEnumLiteralDeclaration_72().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_72, grammarAccess.getPipelineKeywordAccess().getPPL_KW_IMAGEEnumLiteralDeclaration_72());
                    			

                    }


                    }
                    break;
                case 74 :
                    // InternalPipelineParser.g:5622:3: (enumLiteral_73= Variables )
                    {
                    // InternalPipelineParser.g:5622:3: (enumLiteral_73= Variables )
                    // InternalPipelineParser.g:5623:4: enumLiteral_73= Variables
                    {
                    enumLiteral_73=(Token)match(input,Variables,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_VARIABLESEnumLiteralDeclaration_73().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_73, grammarAccess.getPipelineKeywordAccess().getPPL_KW_VARIABLESEnumLiteralDeclaration_73());
                    			

                    }


                    }
                    break;
                case 75 :
                    // InternalPipelineParser.g:5630:3: (enumLiteral_74= Cache )
                    {
                    // InternalPipelineParser.g:5630:3: (enumLiteral_74= Cache )
                    // InternalPipelineParser.g:5631:4: enumLiteral_74= Cache
                    {
                    enumLiteral_74=(Token)match(input,Cache,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CACHEEnumLiteralDeclaration_74().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_74, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CACHEEnumLiteralDeclaration_74());
                    			

                    }


                    }
                    break;
                case 76 :
                    // InternalPipelineParser.g:5638:3: (enumLiteral_75= Artifacts )
                    {
                    // InternalPipelineParser.g:5638:3: (enumLiteral_75= Artifacts )
                    // InternalPipelineParser.g:5639:4: enumLiteral_75= Artifacts
                    {
                    enumLiteral_75=(Token)match(input,Artifacts,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ARTIFACTSEnumLiteralDeclaration_75().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_75, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ARTIFACTSEnumLiteralDeclaration_75());
                    			

                    }


                    }
                    break;
                case 77 :
                    // InternalPipelineParser.g:5646:3: (enumLiteral_76= Retries )
                    {
                    // InternalPipelineParser.g:5646:3: (enumLiteral_76= Retries )
                    // InternalPipelineParser.g:5647:4: enumLiteral_76= Retries
                    {
                    enumLiteral_76=(Token)match(input,Retries,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RETRIESEnumLiteralDeclaration_76().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_76, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RETRIESEnumLiteralDeclaration_76());
                    			

                    }


                    }
                    break;
                case 78 :
                    // InternalPipelineParser.g:5654:3: (enumLiteral_77= Rules )
                    {
                    // InternalPipelineParser.g:5654:3: (enumLiteral_77= Rules )
                    // InternalPipelineParser.g:5655:4: enumLiteral_77= Rules
                    {
                    enumLiteral_77=(Token)match(input,Rules,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RULESEnumLiteralDeclaration_77().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_77, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RULESEnumLiteralDeclaration_77());
                    			

                    }


                    }
                    break;
                case 79 :
                    // InternalPipelineParser.g:5662:3: (enumLiteral_78= Before_script )
                    {
                    // InternalPipelineParser.g:5662:3: (enumLiteral_78= Before_script )
                    // InternalPipelineParser.g:5663:4: enumLiteral_78= Before_script
                    {
                    enumLiteral_78=(Token)match(input,Before_script,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_BEFORE_SCRIPTEnumLiteralDeclaration_78().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_78, grammarAccess.getPipelineKeywordAccess().getPPL_KW_BEFORE_SCRIPTEnumLiteralDeclaration_78());
                    			

                    }


                    }
                    break;
                case 80 :
                    // InternalPipelineParser.g:5670:3: (enumLiteral_79= After_script )
                    {
                    // InternalPipelineParser.g:5670:3: (enumLiteral_79= After_script )
                    // InternalPipelineParser.g:5671:4: enumLiteral_79= After_script
                    {
                    enumLiteral_79=(Token)match(input,After_script,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_AFTER_SCRIPTEnumLiteralDeclaration_79().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_79, grammarAccess.getPipelineKeywordAccess().getPPL_KW_AFTER_SCRIPTEnumLiteralDeclaration_79());
                    			

                    }


                    }
                    break;
                case 81 :
                    // InternalPipelineParser.g:5678:3: (enumLiteral_80= Timeout )
                    {
                    // InternalPipelineParser.g:5678:3: (enumLiteral_80= Timeout )
                    // InternalPipelineParser.g:5679:4: enumLiteral_80= Timeout
                    {
                    enumLiteral_80=(Token)match(input,Timeout,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUTEnumLiteralDeclaration_80().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_80, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUTEnumLiteralDeclaration_80());
                    			

                    }


                    }
                    break;
                case 82 :
                    // InternalPipelineParser.g:5686:3: (enumLiteral_81= When )
                    {
                    // InternalPipelineParser.g:5686:3: (enumLiteral_81= When )
                    // InternalPipelineParser.g:5687:4: enumLiteral_81= When
                    {
                    enumLiteral_81=(Token)match(input,When,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WHENEnumLiteralDeclaration_81().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_81, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WHENEnumLiteralDeclaration_81());
                    			

                    }


                    }
                    break;
                case 83 :
                    // InternalPipelineParser.g:5694:3: (enumLiteral_82= Allow_failure )
                    {
                    // InternalPipelineParser.g:5694:3: (enumLiteral_82= Allow_failure )
                    // InternalPipelineParser.g:5695:4: enumLiteral_82= Allow_failure
                    {
                    enumLiteral_82=(Token)match(input,Allow_failure,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ALLOW_FAILUREEnumLiteralDeclaration_82().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_82, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ALLOW_FAILUREEnumLiteralDeclaration_82());
                    			

                    }


                    }
                    break;
                case 84 :
                    // InternalPipelineParser.g:5702:3: (enumLiteral_83= Dependencies )
                    {
                    // InternalPipelineParser.g:5702:3: (enumLiteral_83= Dependencies )
                    // InternalPipelineParser.g:5703:4: enumLiteral_83= Dependencies
                    {
                    enumLiteral_83=(Token)match(input,Dependencies,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPENDENCIESEnumLiteralDeclaration_83().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_83, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPENDENCIESEnumLiteralDeclaration_83());
                    			

                    }


                    }
                    break;
                case 85 :
                    // InternalPipelineParser.g:5710:3: (enumLiteral_84= Extends )
                    {
                    // InternalPipelineParser.g:5710:3: (enumLiteral_84= Extends )
                    // InternalPipelineParser.g:5711:4: enumLiteral_84= Extends
                    {
                    enumLiteral_84=(Token)match(input,Extends,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXTENDSEnumLiteralDeclaration_84().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_84, grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXTENDSEnumLiteralDeclaration_84());
                    			

                    }


                    }
                    break;
                case 86 :
                    // InternalPipelineParser.g:5718:3: (enumLiteral_85= Pipelines )
                    {
                    // InternalPipelineParser.g:5718:3: (enumLiteral_85= Pipelines )
                    // InternalPipelineParser.g:5719:4: enumLiteral_85= Pipelines
                    {
                    enumLiteral_85=(Token)match(input,Pipelines,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINESEnumLiteralDeclaration_85().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_85, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINESEnumLiteralDeclaration_85());
                    			

                    }


                    }
                    break;
                case 87 :
                    // InternalPipelineParser.g:5726:3: (enumLiteral_86= Default )
                    {
                    // InternalPipelineParser.g:5726:3: (enumLiteral_86= Default )
                    // InternalPipelineParser.g:5727:4: enumLiteral_86= Default
                    {
                    enumLiteral_86=(Token)match(input,Default,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTEnumLiteralDeclaration_86().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_86, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTEnumLiteralDeclaration_86());
                    			

                    }


                    }
                    break;
                case 88 :
                    // InternalPipelineParser.g:5734:3: (enumLiteral_87= PullRequests )
                    {
                    // InternalPipelineParser.g:5734:3: (enumLiteral_87= PullRequests )
                    // InternalPipelineParser.g:5735:4: enumLiteral_87= PullRequests
                    {
                    enumLiteral_87=(Token)match(input,PullRequests,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PULL_REQUESTSEnumLiteralDeclaration_87().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_87, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PULL_REQUESTSEnumLiteralDeclaration_87());
                    			

                    }


                    }
                    break;
                case 89 :
                    // InternalPipelineParser.g:5742:3: (enumLiteral_88= Step )
                    {
                    // InternalPipelineParser.g:5742:3: (enumLiteral_88= Step )
                    // InternalPipelineParser.g:5743:4: enumLiteral_88= Step
                    {
                    enumLiteral_88=(Token)match(input,Step,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STEPEnumLiteralDeclaration_88().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_88, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STEPEnumLiteralDeclaration_88());
                    			

                    }


                    }
                    break;
                case 90 :
                    // InternalPipelineParser.g:5750:3: (enumLiteral_89= Script )
                    {
                    // InternalPipelineParser.g:5750:3: (enumLiteral_89= Script )
                    // InternalPipelineParser.g:5751:4: enumLiteral_89= Script
                    {
                    enumLiteral_89=(Token)match(input,Script,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCRIPTEnumLiteralDeclaration_89().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_89, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCRIPTEnumLiteralDeclaration_89());
                    			

                    }


                    }
                    break;
                case 91 :
                    // InternalPipelineParser.g:5758:3: (enumLiteral_90= Definitions )
                    {
                    // InternalPipelineParser.g:5758:3: (enumLiteral_90= Definitions )
                    // InternalPipelineParser.g:5759:4: enumLiteral_90= Definitions
                    {
                    enumLiteral_90=(Token)match(input,Definitions,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFINITIONSEnumLiteralDeclaration_90().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_90, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFINITIONSEnumLiteralDeclaration_90());
                    			

                    }


                    }
                    break;
                case 92 :
                    // InternalPipelineParser.g:5766:3: (enumLiteral_91= Caches )
                    {
                    // InternalPipelineParser.g:5766:3: (enumLiteral_91= Caches )
                    // InternalPipelineParser.g:5767:4: enumLiteral_91= Caches
                    {
                    enumLiteral_91=(Token)match(input,Caches,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CACHESEnumLiteralDeclaration_91().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_91, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CACHESEnumLiteralDeclaration_91());
                    			

                    }


                    }
                    break;
                case 93 :
                    // InternalPipelineParser.g:5774:3: (enumLiteral_92= Parallel )
                    {
                    // InternalPipelineParser.g:5774:3: (enumLiteral_92= Parallel )
                    // InternalPipelineParser.g:5775:4: enumLiteral_92= Parallel
                    {
                    enumLiteral_92=(Token)match(input,Parallel,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PARALLELEnumLiteralDeclaration_92().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_92, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PARALLELEnumLiteralDeclaration_92());
                    			

                    }


                    }
                    break;
                case 94 :
                    // InternalPipelineParser.g:5782:3: (enumLiteral_93= Conditions )
                    {
                    // InternalPipelineParser.g:5782:3: (enumLiteral_93= Conditions )
                    // InternalPipelineParser.g:5783:4: enumLiteral_93= Conditions
                    {
                    enumLiteral_93=(Token)match(input,Conditions,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONDITIONSEnumLiteralDeclaration_93().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_93, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONDITIONSEnumLiteralDeclaration_93());
                    			

                    }


                    }
                    break;
                case 95 :
                    // InternalPipelineParser.g:5790:3: (enumLiteral_94= MaxTime )
                    {
                    // InternalPipelineParser.g:5790:3: (enumLiteral_94= MaxTime )
                    // InternalPipelineParser.g:5791:4: enumLiteral_94= MaxTime
                    {
                    enumLiteral_94=(Token)match(input,MaxTime,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_MAX_TIMEEnumLiteralDeclaration_94().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_94, grammarAccess.getPipelineKeywordAccess().getPPL_KW_MAX_TIMEEnumLiteralDeclaration_94());
                    			

                    }


                    }
                    break;
                case 96 :
                    // InternalPipelineParser.g:5798:3: (enumLiteral_95= Project )
                    {
                    // InternalPipelineParser.g:5798:3: (enumLiteral_95= Project )
                    // InternalPipelineParser.g:5799:4: enumLiteral_95= Project
                    {
                    enumLiteral_95=(Token)match(input,Project,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PROJECTEnumLiteralDeclaration_95().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_95, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PROJECTEnumLiteralDeclaration_95());
                    			

                    }


                    }
                    break;
                case 97 :
                    // InternalPipelineParser.g:5806:3: (enumLiteral_96= Plan )
                    {
                    // InternalPipelineParser.g:5806:3: (enumLiteral_96= Plan )
                    // InternalPipelineParser.g:5807:4: enumLiteral_96= Plan
                    {
                    enumLiteral_96=(Token)match(input,Plan,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PLANEnumLiteralDeclaration_96().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_96, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PLANEnumLiteralDeclaration_96());
                    			

                    }


                    }
                    break;
                case 98 :
                    // InternalPipelineParser.g:5814:3: (enumLiteral_97= Tasks )
                    {
                    // InternalPipelineParser.g:5814:3: (enumLiteral_97= Tasks )
                    // InternalPipelineParser.g:5815:4: enumLiteral_97= Tasks
                    {
                    enumLiteral_97=(Token)match(input,Tasks,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TASKSEnumLiteralDeclaration_97().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_97, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TASKSEnumLiteralDeclaration_97());
                    			

                    }


                    }
                    break;
                case 99 :
                    // InternalPipelineParser.g:5822:3: (enumLiteral_98= Requirements )
                    {
                    // InternalPipelineParser.g:5822:3: (enumLiteral_98= Requirements )
                    // InternalPipelineParser.g:5823:4: enumLiteral_98= Requirements
                    {
                    enumLiteral_98=(Token)match(input,Requirements,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_REQUIREMENTSEnumLiteralDeclaration_98().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_98, grammarAccess.getPipelineKeywordAccess().getPPL_KW_REQUIREMENTSEnumLiteralDeclaration_98());
                    			

                    }


                    }
                    break;
                case 100 :
                    // InternalPipelineParser.g:5830:3: (enumLiteral_99= Final )
                    {
                    // InternalPipelineParser.g:5830:3: (enumLiteral_99= Final )
                    // InternalPipelineParser.g:5831:4: enumLiteral_99= Final
                    {
                    enumLiteral_99=(Token)match(input,Final,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_FINALEnumLiteralDeclaration_99().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_99, grammarAccess.getPipelineKeywordAccess().getPPL_KW_FINALEnumLiteralDeclaration_99());
                    			

                    }


                    }
                    break;
                case 101 :
                    // InternalPipelineParser.g:5838:3: (enumLiteral_100= Jdk )
                    {
                    // InternalPipelineParser.g:5838:3: (enumLiteral_100= Jdk )
                    // InternalPipelineParser.g:5839:4: enumLiteral_100= Jdk
                    {
                    enumLiteral_100=(Token)match(input,Jdk,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_JDKEnumLiteralDeclaration_100().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_100, grammarAccess.getPipelineKeywordAccess().getPPL_KW_JDKEnumLiteralDeclaration_100());
                    			

                    }


                    }
                    break;
                case 102 :
                    // InternalPipelineParser.g:5846:3: (enumLiteral_101= Labels )
                    {
                    // InternalPipelineParser.g:5846:3: (enumLiteral_101= Labels )
                    // InternalPipelineParser.g:5847:4: enumLiteral_101= Labels
                    {
                    enumLiteral_101=(Token)match(input,Labels,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_LABELSEnumLiteralDeclaration_101().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_101, grammarAccess.getPipelineKeywordAccess().getPPL_KW_LABELSEnumLiteralDeclaration_101());
                    			

                    }


                    }
                    break;
                case 103 :
                    // InternalPipelineParser.g:5854:3: (enumLiteral_102= Repository )
                    {
                    // InternalPipelineParser.g:5854:3: (enumLiteral_102= Repository )
                    // InternalPipelineParser.g:5855:4: enumLiteral_102= Repository
                    {
                    enumLiteral_102=(Token)match(input,Repository,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_REPOSITORYEnumLiteralDeclaration_102().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_102, grammarAccess.getPipelineKeywordAccess().getPPL_KW_REPOSITORYEnumLiteralDeclaration_102());
                    			

                    }


                    }
                    break;
                case 104 :
                    // InternalPipelineParser.g:5862:3: (enumLiteral_103= Deployment )
                    {
                    // InternalPipelineParser.g:5862:3: (enumLiteral_103= Deployment )
                    // InternalPipelineParser.g:5863:4: enumLiteral_103= Deployment
                    {
                    enumLiteral_103=(Token)match(input,Deployment,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPLOYMENTEnumLiteralDeclaration_103().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_103, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPLOYMENTEnumLiteralDeclaration_103());
                    			

                    }


                    }
                    break;
                case 105 :
                    // InternalPipelineParser.g:5870:3: (enumLiteral_104= Release )
                    {
                    // InternalPipelineParser.g:5870:3: (enumLiteral_104= Release )
                    // InternalPipelineParser.g:5871:4: enumLiteral_104= Release
                    {
                    enumLiteral_104=(Token)match(input,Release,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RELEASEEnumLiteralDeclaration_104().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_104, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RELEASEEnumLiteralDeclaration_104());
                    			

                    }


                    }
                    break;
                case 106 :
                    // InternalPipelineParser.g:5878:3: (enumLiteral_105= Version )
                    {
                    // InternalPipelineParser.g:5878:3: (enumLiteral_105= Version )
                    // InternalPipelineParser.g:5879:4: enumLiteral_105= Version
                    {
                    enumLiteral_105=(Token)match(input,Version,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_VERSIONEnumLiteralDeclaration_105().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_105, grammarAccess.getPipelineKeywordAccess().getPPL_KW_VERSIONEnumLiteralDeclaration_105());
                    			

                    }


                    }
                    break;
                case 107 :
                    // InternalPipelineParser.g:5886:3: (enumLiteral_106= Docker )
                    {
                    // InternalPipelineParser.g:5886:3: (enumLiteral_106= Docker )
                    // InternalPipelineParser.g:5887:4: enumLiteral_106= Docker
                    {
                    enumLiteral_106=(Token)match(input,Docker,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DOCKEREnumLiteralDeclaration_106().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_106, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DOCKEREnumLiteralDeclaration_106());
                    			

                    }


                    }
                    break;
                case 108 :
                    // InternalPipelineParser.g:5894:3: (enumLiteral_107= Agent )
                    {
                    // InternalPipelineParser.g:5894:3: (enumLiteral_107= Agent )
                    // InternalPipelineParser.g:5895:4: enumLiteral_107= Agent
                    {
                    enumLiteral_107=(Token)match(input,Agent,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_AGENTEnumLiteralDeclaration_107().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_107, grammarAccess.getPipelineKeywordAccess().getPPL_KW_AGENTEnumLiteralDeclaration_107());
                    			

                    }


                    }
                    break;
                case 109 :
                    // InternalPipelineParser.g:5902:3: (enumLiteral_108= Queue )
                    {
                    // InternalPipelineParser.g:5902:3: (enumLiteral_108= Queue )
                    // InternalPipelineParser.g:5903:4: enumLiteral_108= Queue
                    {
                    enumLiteral_108=(Token)match(input,Queue,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_QUEUEEnumLiteralDeclaration_108().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_108, grammarAccess.getPipelineKeywordAccess().getPPL_KW_QUEUEEnumLiteralDeclaration_108());
                    			

                    }


                    }
                    break;
                case 110 :
                    // InternalPipelineParser.g:5910:3: (enumLiteral_109= Snapshot )
                    {
                    // InternalPipelineParser.g:5910:3: (enumLiteral_109= Snapshot )
                    // InternalPipelineParser.g:5911:4: enumLiteral_109= Snapshot
                    {
                    enumLiteral_109=(Token)match(input,Snapshot,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SNAPSHOTEnumLiteralDeclaration_109().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_109, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SNAPSHOTEnumLiteralDeclaration_109());
                    			

                    }


                    }
                    break;
                case 111 :
                    // InternalPipelineParser.g:5918:3: (enumLiteral_110= Policy )
                    {
                    // InternalPipelineParser.g:5918:3: (enumLiteral_110= Policy )
                    // InternalPipelineParser.g:5919:4: enumLiteral_110= Policy
                    {
                    enumLiteral_110=(Token)match(input,Policy,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_POLICYEnumLiteralDeclaration_110().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_110, grammarAccess.getPipelineKeywordAccess().getPPL_KW_POLICYEnumLiteralDeclaration_110());
                    			

                    }


                    }
                    break;
                case 112 :
                    // InternalPipelineParser.g:5926:3: (enumLiteral_111= Approvals )
                    {
                    // InternalPipelineParser.g:5926:3: (enumLiteral_111= Approvals )
                    // InternalPipelineParser.g:5927:4: enumLiteral_111= Approvals
                    {
                    enumLiteral_111=(Token)match(input,Approvals,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_APPROVALSEnumLiteralDeclaration_111().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_111, grammarAccess.getPipelineKeywordAccess().getPPL_KW_APPROVALSEnumLiteralDeclaration_111());
                    			

                    }


                    }
                    break;
                case 113 :
                    // InternalPipelineParser.g:5934:3: (enumLiteral_112= PreBuild )
                    {
                    // InternalPipelineParser.g:5934:3: (enumLiteral_112= PreBuild )
                    // InternalPipelineParser.g:5935:4: enumLiteral_112= PreBuild
                    {
                    enumLiteral_112=(Token)match(input,PreBuild,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PREBUILDEnumLiteralDeclaration_112().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_112, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PREBUILDEnumLiteralDeclaration_112());
                    			

                    }


                    }
                    break;
                case 114 :
                    // InternalPipelineParser.g:5942:3: (enumLiteral_113= PostBuild )
                    {
                    // InternalPipelineParser.g:5942:3: (enumLiteral_113= PostBuild )
                    // InternalPipelineParser.g:5943:4: enumLiteral_113= PostBuild
                    {
                    enumLiteral_113=(Token)match(input,PostBuild,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_POSTBUILDEnumLiteralDeclaration_113().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_113, grammarAccess.getPipelineKeywordAccess().getPPL_KW_POSTBUILDEnumLiteralDeclaration_113());
                    			

                    }


                    }
                    break;
                case 115 :
                    // InternalPipelineParser.g:5950:3: (enumLiteral_114= Ssh )
                    {
                    // InternalPipelineParser.g:5950:3: (enumLiteral_114= Ssh )
                    // InternalPipelineParser.g:5951:4: enumLiteral_114= Ssh
                    {
                    enumLiteral_114=(Token)match(input,Ssh,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SSHEnumLiteralDeclaration_114().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_114, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SSHEnumLiteralDeclaration_114());
                    			

                    }


                    }
                    break;
                case 116 :
                    // InternalPipelineParser.g:5958:3: (enumLiteral_115= Auth )
                    {
                    // InternalPipelineParser.g:5958:3: (enumLiteral_115= Auth )
                    // InternalPipelineParser.g:5959:4: enumLiteral_115= Auth
                    {
                    enumLiteral_115=(Token)match(input,Auth,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_AUTHEnumLiteralDeclaration_115().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_115, grammarAccess.getPipelineKeywordAccess().getPPL_KW_AUTHEnumLiteralDeclaration_115());
                    			

                    }


                    }
                    break;
                case 117 :
                    // InternalPipelineParser.g:5966:3: (enumLiteral_116= Storage )
                    {
                    // InternalPipelineParser.g:5966:3: (enumLiteral_116= Storage )
                    // InternalPipelineParser.g:5967:4: enumLiteral_116= Storage
                    {
                    enumLiteral_116=(Token)match(input,Storage,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STORAGEEnumLiteralDeclaration_116().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_116, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STORAGEEnumLiteralDeclaration_116());
                    			

                    }


                    }
                    break;
                case 118 :
                    // InternalPipelineParser.g:5974:3: (enumLiteral_117= Endpoints )
                    {
                    // InternalPipelineParser.g:5974:3: (enumLiteral_117= Endpoints )
                    // InternalPipelineParser.g:5975:4: enumLiteral_117= Endpoints
                    {
                    enumLiteral_117=(Token)match(input,Endpoints,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENDPOINTSEnumLiteralDeclaration_117().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_117, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENDPOINTSEnumLiteralDeclaration_117());
                    			

                    }


                    }
                    break;
                case 119 :
                    // InternalPipelineParser.g:5982:3: (enumLiteral_118= Command )
                    {
                    // InternalPipelineParser.g:5982:3: (enumLiteral_118= Command )
                    // InternalPipelineParser.g:5983:4: enumLiteral_118= Command
                    {
                    enumLiteral_118=(Token)match(input,Command,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_COMMANDEnumLiteralDeclaration_118().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_118, grammarAccess.getPipelineKeywordAccess().getPPL_KW_COMMANDEnumLiteralDeclaration_118());
                    			

                    }


                    }
                    break;
                case 120 :
                    // InternalPipelineParser.g:5990:3: (enumLiteral_119= Provisioner )
                    {
                    // InternalPipelineParser.g:5990:3: (enumLiteral_119= Provisioner )
                    // InternalPipelineParser.g:5991:4: enumLiteral_119= Provisioner
                    {
                    enumLiteral_119=(Token)match(input,Provisioner,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PROVISIONEREnumLiteralDeclaration_119().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_119, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PROVISIONEREnumLiteralDeclaration_119());
                    			

                    }


                    }
                    break;
                case 121 :
                    // InternalPipelineParser.g:5998:3: (enumLiteral_120= TriggerRules )
                    {
                    // InternalPipelineParser.g:5998:3: (enumLiteral_120= TriggerRules )
                    // InternalPipelineParser.g:5999:4: enumLiteral_120= TriggerRules
                    {
                    enumLiteral_120=(Token)match(input,TriggerRules,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TRIGGER_RULESEnumLiteralDeclaration_120().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_120, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TRIGGER_RULESEnumLiteralDeclaration_120());
                    			

                    }


                    }
                    break;
                case 122 :
                    // InternalPipelineParser.g:6006:3: (enumLiteral_121= RunPolicy )
                    {
                    // InternalPipelineParser.g:6006:3: (enumLiteral_121= RunPolicy )
                    // InternalPipelineParser.g:6007:4: enumLiteral_121= RunPolicy
                    {
                    enumLiteral_121=(Token)match(input,RunPolicy,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUN_POLICYEnumLiteralDeclaration_121().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_121, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUN_POLICYEnumLiteralDeclaration_121());
                    			

                    }


                    }
                    break;
                case 123 :
                    // InternalPipelineParser.g:6014:3: (enumLiteral_122= Queued )
                    {
                    // InternalPipelineParser.g:6014:3: (enumLiteral_122= Queued )
                    // InternalPipelineParser.g:6015:4: enumLiteral_122= Queued
                    {
                    enumLiteral_122=(Token)match(input,Queued,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_QUEUEDEnumLiteralDeclaration_122().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_122, grammarAccess.getPipelineKeywordAccess().getPPL_KW_QUEUEDEnumLiteralDeclaration_122());
                    			

                    }


                    }
                    break;
                case 124 :
                    // InternalPipelineParser.g:6022:3: (enumLiteral_123= AutoCancel )
                    {
                    // InternalPipelineParser.g:6022:3: (enumLiteral_123= AutoCancel )
                    // InternalPipelineParser.g:6023:4: enumLiteral_123= AutoCancel
                    {
                    enumLiteral_123=(Token)match(input,AutoCancel,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_AUTO_CANCELEnumLiteralDeclaration_123().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_123, grammarAccess.getPipelineKeywordAccess().getPPL_KW_AUTO_CANCELEnumLiteralDeclaration_123());
                    			

                    }


                    }
                    break;
                case 125 :
                    // InternalPipelineParser.g:6030:3: (enumLiteral_124= Notifications )
                    {
                    // InternalPipelineParser.g:6030:3: (enumLiteral_124= Notifications )
                    // InternalPipelineParser.g:6031:4: enumLiteral_124= Notifications
                    {
                    enumLiteral_124=(Token)match(input,Notifications,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_NOTIFICATIONSEnumLiteralDeclaration_124().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_124, grammarAccess.getPipelineKeywordAccess().getPPL_KW_NOTIFICATIONSEnumLiteralDeclaration_124());
                    			

                    }


                    }
                    break;
                case 126 :
                    // InternalPipelineParser.g:6038:3: (enumLiteral_125= DeployTrigger )
                    {
                    // InternalPipelineParser.g:6038:3: (enumLiteral_125= DeployTrigger )
                    // InternalPipelineParser.g:6039:4: enumLiteral_125= DeployTrigger
                    {
                    enumLiteral_125=(Token)match(input,DeployTrigger,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPLOY_TRIGGEREnumLiteralDeclaration_125().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_125, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPLOY_TRIGGEREnumLiteralDeclaration_125());
                    			

                    }


                    }
                    break;
                case 127 :
                    // InternalPipelineParser.g:6046:3: (enumLiteral_126= ReleaseTrigger )
                    {
                    // InternalPipelineParser.g:6046:3: (enumLiteral_126= ReleaseTrigger )
                    // InternalPipelineParser.g:6047:4: enumLiteral_126= ReleaseTrigger
                    {
                    enumLiteral_126=(Token)match(input,ReleaseTrigger,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RELEASE_TRIGGEREnumLiteralDeclaration_126().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_126, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RELEASE_TRIGGEREnumLiteralDeclaration_126());
                    			

                    }


                    }
                    break;
                case 128 :
                    // InternalPipelineParser.g:6054:3: (enumLiteral_127= LockBehavior )
                    {
                    // InternalPipelineParser.g:6054:3: (enumLiteral_127= LockBehavior )
                    // InternalPipelineParser.g:6055:4: enumLiteral_127= LockBehavior
                    {
                    enumLiteral_127=(Token)match(input,LockBehavior,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_LOCK_BEHAVIOREnumLiteralDeclaration_127().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_127, grammarAccess.getPipelineKeywordAccess().getPPL_KW_LOCK_BEHAVIOREnumLiteralDeclaration_127());
                    			

                    }


                    }
                    break;
                case 129 :
                    // InternalPipelineParser.g:6062:3: (enumLiteral_128= ReviewStage )
                    {
                    // InternalPipelineParser.g:6062:3: (enumLiteral_128= ReviewStage )
                    // InternalPipelineParser.g:6063:4: enumLiteral_128= ReviewStage
                    {
                    enumLiteral_128=(Token)match(input,ReviewStage,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_REVIEW_STAGEEnumLiteralDeclaration_128().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_128, grammarAccess.getPipelineKeywordAccess().getPPL_KW_REVIEW_STAGEEnumLiteralDeclaration_128());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePipelineKeyword"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA120 dfa120 = new DFA120(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA130 dfa130 = new DFA130(this);
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\1\1\36\uffff";
    static final String dfa_3s = "\1\7\11\uffff\5\0\20\uffff";
    static final String dfa_4s = "\1\u00b2\11\uffff\5\0\20\uffff";
    static final String dfa_5s = "\1\uffff\1\16\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\5\uffff\1\10\1\11\1\12\1\13\1\14\1\uffff\1\15\10\uffff\1\7";
    static final String dfa_6s = "\1\0\11\uffff\1\1\1\2\1\3\1\4\1\5\20\uffff}>";
    static final String[] dfa_7s = {
            "\1\25\1\4\13\uffff\1\25\14\uffff\1\25\1\11\16\uffff\1\12\1\10\10\uffff\1\14\3\uffff\1\20\1\uffff\1\25\1\22\3\uffff\1\16\1\4\7\uffff\1\3\1\25\7\uffff\1\13\2\uffff\1\23\1\uffff\1\23\13\uffff\1\21\14\uffff\1\25\24\uffff\1\25\1\2\1\uffff\1\15\1\uffff\1\17\11\uffff\1\7\10\uffff\1\25\15\uffff\1\4\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( (otherlv_54= On (this_BEGIN_55= RULE_BEGIN ( (lv_triggers_56_0= ruleEvent ) )+ this_END_57= RULE_END )? ( ( (lv_triggers_58_0= ruleEvent ) ) | (otherlv_59= LeftSquareBracket ( (lv_triggers_60_0= ruleEvent ) ) (otherlv_61= Comma ( (lv_triggers_62_0= ruleEvent ) ) )* otherlv_63= RightSquareBracket ) )? ) | ( (lv_triggers_64_0= ruleEvent ) )* ) ( ( ( (lv_jobOrStageVar_65_1= Stages | lv_jobOrStageVar_65_2= Jobs ) ) ) this_BEGIN_66= RULE_BEGIN ( ( (lv_stages_67_0= ruleStage ) )* | ( (lv_jobs_68_0= ruleJob ) )* ) this_END_69= RULE_END ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==EOF) ) {s = 1;}

                        else if ( LA29_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA29_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( ( LA29_0 == WorkingDirectory || LA29_0 == Defaults || LA29_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA29_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 7;}

                        else if ( LA29_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 8;}

                        else if ( LA29_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 9;}

                        else if ( LA29_0 == Parameters && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) ) {s = 10;}

                        else if ( LA29_0 == Default && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) ) {s = 11;}

                        else if ( LA29_0 == Executors && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) ) {s = 12;}

                        else if ( LA29_0 == Orbs && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) ) {s = 13;}

                        else if ( LA29_0 == Commands && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) ) {s = 14;}

                        else if ( LA29_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 15;}

                        else if ( LA29_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 16;}

                        else if ( LA29_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 17;}

                        else if ( LA29_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 18;}

                        else if ( ( LA29_0 == Extends || LA29_0 == Include ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 19;}

                        else if ( ( LA29_0 == Workflow_dispatch || LA29_0 == Workflow_call || LA29_0 == Workflow_run || LA29_0 == Schedules || LA29_0 == Schedule || LA29_0 == Stages || LA29_0 == Jobs || LA29_0 == On || LA29_0 == RULE_ID ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_10 = input.LA(1);

                         
                        int index29_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 30;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index29_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_11 = input.LA(1);

                         
                        int index29_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 30;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index29_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_12 = input.LA(1);

                         
                        int index29_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 30;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index29_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_13 = input.LA(1);

                         
                        int index29_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 30;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index29_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_14 = input.LA(1);

                         
                        int index29_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 30;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index29_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\14\uffff";
    static final String dfa_9s = "\1\1\13\uffff";
    static final String dfa_10s = "\1\7\1\uffff\1\7\1\uffff\1\7\1\12\2\uffff\1\u00ab\3\uffff";
    static final String dfa_11s = "\1\u00b2\1\uffff\1\u00b5\1\uffff\1\u00b6\1\u00b2\2\uffff\1\u00b5\3\uffff";
    static final String dfa_12s = "\1\uffff\1\2\1\uffff\1\1\2\uffff\2\1\1\uffff\3\1";
    static final String dfa_13s = "\14\uffff}>";
    static final String[] dfa_14s = {
            "\2\1\13\uffff\1\1\14\uffff\2\1\16\uffff\2\1\10\uffff\1\1\3\uffff\1\1\1\uffff\2\1\3\uffff\2\1\7\uffff\2\1\7\uffff\1\1\2\uffff\1\1\1\uffff\1\1\13\uffff\1\1\14\uffff\1\1\24\uffff\2\1\1\uffff\1\1\1\uffff\1\1\11\uffff\1\1\10\uffff\1\1\2\uffff\1\3\4\uffff\1\3\5\uffff\1\1\1\2",
            "",
            "\1\1\14\uffff\1\1\14\uffff\1\1\37\uffff\1\1\16\uffff\1\1\45\uffff\1\1\24\uffff\1\1\32\uffff\1\1\1\4\10\uffff\1\1\1\uffff\1\1\2\uffff\1\1",
            "",
            "\1\1\14\uffff\1\1\14\uffff\1\1\37\uffff\1\1\16\uffff\1\1\45\uffff\1\1\24\uffff\1\1\32\uffff\1\10\1\uffff\1\7\2\uffff\2\7\2\6\1\7\1\5\1\uffff\1\7\2\uffff\1\6\1\3",
            "\1\1\17\uffff\1\1\20\uffff\2\1\27\uffff\1\1\52\uffff\1\1\10\uffff\1\1\5\uffff\1\1\7\uffff\1\1\15\uffff\1\1\21\uffff\1\7\4\uffff\1\11\4\uffff\1\1\2\11",
            "",
            "",
            "\5\13\2\uffff\1\12\2\uffff\1\13",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 1557:4: ( (lv_parameterValues_1_0= ruleParameterValue ) )+";
        }
    }
    static final String dfa_15s = "\13\uffff";
    static final String dfa_16s = "\1\12\12\uffff";
    static final String dfa_17s = "\1\u00b1\12\uffff";
    static final String dfa_18s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_19s = "\1\0\12\uffff}>";
    static final String[] dfa_20s = {
            "\1\6\17\uffff\1\10\20\uffff\1\12\1\3\27\uffff\1\5\52\uffff\1\4\10\uffff\1\2\5\uffff\1\7\25\uffff\1\11\34\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()* loopback of 1791:8: ( ({...}? => ( ({...}? => (otherlv_10= Batch ( (lv_batch_11_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= AutoCancel ( (lv_autoCancel_13_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Drafts ( (lv_drafts_15_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Branches ( ( ( (lv_includedBranches_17_0= ruleBranch ) )* | (otherlv_18= LeftSquareBracket ( (lv_includedBranches_19_0= ruleBranch ) ) (otherlv_20= Comma ( (lv_includedBranches_21_0= ruleBranch ) ) )* otherlv_22= RightSquareBracket ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_includedBranches_24_0= ruleBranch ) )* (otherlv_25= Include ( (lv_includedBranches_26_0= ruleBranch ) )* )? (otherlv_27= Exclude ( (lv_excludedBranches_28_0= ruleBranch ) )* )? this_END_29= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= BranchesIgnore ( ( ( (lv_excludedBranches_31_0= ruleBranch ) )* | (otherlv_32= LeftSquareBracket ( (lv_excludedBranches_33_0= ruleBranch ) ) (otherlv_34= Comma ( (lv_excludedBranches_35_0= ruleBranch ) ) )* otherlv_36= RightSquareBracket ) ) | (this_BEGIN_37= RULE_BEGIN ( (lv_excludedBranches_38_0= ruleBranch ) )* this_END_39= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= Paths ( (lv_includedPaths_41_0= ruleHyphenValues ) )? (this_BEGIN_42= RULE_BEGIN ( (lv_includedPaths_43_0= ruleHyphenValues ) )? (otherlv_44= Include ( (lv_includedPaths_45_0= ruleHyphenValues ) ) )? (otherlv_46= Exclude ( (lv_excludedPaths_47_0= ruleHyphenValues ) ) )? this_END_48= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= PathsIgnore ( (lv_excludedPaths_50_0= ruleHyphenValues ) )? (this_BEGIN_51= RULE_BEGIN ( (lv_excludedPaths_52_0= ruleHyphenValues ) ) this_END_53= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_54= Tags ( (lv_includedTags_55_0= ruleHyphenValues ) )? (this_BEGIN_56= RULE_BEGIN ( (lv_includedTags_57_0= ruleHyphenValues ) )? (otherlv_58= Include ( (lv_includedTags_59_0= ruleHyphenValues ) ) )? (otherlv_60= Exclude ( (lv_excludedTags_61_0= ruleHyphenValues ) ) )? this_END_62= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= TagsIgnore ( (lv_excludedTags_64_0= ruleHyphenValues ) )? (this_BEGIN_65= RULE_BEGIN ( (lv_excludedTags_66_0= ruleHyphenValues ) ) this_END_67= RULE_END ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_0 = input.LA(1);

                         
                        int index72_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA72_0==RULE_END) ) {s = 1;}

                        else if ( LA72_0 == Batch && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 0) ) {s = 2;}

                        else if ( LA72_0 == AutoCancel && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 1) ) {s = 3;}

                        else if ( LA72_0 == Drafts && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 2) ) {s = 4;}

                        else if ( LA72_0 == Branches && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 3) ) {s = 5;}

                        else if ( LA72_0 == BranchesIgnore && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 4) ) {s = 6;}

                        else if ( LA72_0 == Paths && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 5) ) {s = 7;}

                        else if ( LA72_0 == PathsIgnore && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 6) ) {s = 8;}

                        else if ( LA72_0 == Tags && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 7) ) {s = 9;}

                        else if ( LA72_0 == TagsIgnore && getUnorderedGroupHelper().canSelect(grammarAccess.getEventAccess().getUnorderedGroup_0_2_2(), 8) ) {s = 10;}

                         
                        input.seek(index72_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\15\uffff";
    static final String dfa_22s = "\1\u00a6\1\uffff\1\132\1\u00ab\1\uffff\7\132\1\12";
    static final String dfa_23s = "\1\u00b0\1\uffff\1\u00b1\1\u00b5\1\uffff\10\u00b1";
    static final String dfa_24s = "\1\uffff\1\1\2\uffff\1\2\10\uffff";
    static final String dfa_25s = "\15\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\11\uffff\1\2",
            "",
            "\1\4\2\uffff\1\4\110\uffff\1\3\11\uffff\2\4",
            "\1\11\1\13\1\6\1\7\1\12\2\uffff\1\10\2\uffff\1\5",
            "",
            "\1\4\2\uffff\1\4\110\uffff\1\3\12\uffff\1\14",
            "\1\4\2\uffff\1\4\110\uffff\1\3\12\uffff\1\14",
            "\1\4\2\uffff\1\4\110\uffff\1\3\12\uffff\1\14",
            "\1\4\2\uffff\1\4\110\uffff\1\3\12\uffff\1\14",
            "\1\4\2\uffff\1\4\110\uffff\1\3\12\uffff\1\14",
            "\1\4\2\uffff\1\4\110\uffff\1\3\12\uffff\1\14",
            "\1\4\2\uffff\1\4\110\uffff\1\3\12\uffff\1\14",
            "\1\4\17\uffff\1\4\20\uffff\2\4\27\uffff\1\4\52\uffff\1\4\10\uffff\1\4\5\uffff\1\4\25\uffff\1\4\33\uffff\1\1\1\4"
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2196:11: ( (lv_includedPaths_41_0= ruleHyphenValues ) )?";
        }
    }
    static final String dfa_27s = "\1\u00a6\1\uffff\1\u00a6\1\u00ab\1\uffff\7\u00a6\1\12";
    static final String dfa_28s = "\1\u00b0\1\uffff\1\u00b0\1\u00b5\1\uffff\10\u00b1";
    static final String[] dfa_29s = {
            "\1\1\11\uffff\1\2",
            "",
            "\1\3\11\uffff\1\4",
            "\1\11\1\13\1\6\1\7\1\12\2\uffff\1\10\2\uffff\1\5",
            "",
            "\1\3\12\uffff\1\14",
            "\1\3\12\uffff\1\14",
            "\1\3\12\uffff\1\14",
            "\1\3\12\uffff\1\14",
            "\1\3\12\uffff\1\14",
            "\1\3\12\uffff\1\14",
            "\1\3\12\uffff\1\14",
            "\1\4\17\uffff\1\4\20\uffff\2\4\27\uffff\1\4\52\uffff\1\4\10\uffff\1\4\5\uffff\1\4\25\uffff\1\4\33\uffff\1\1\1\4"
    };
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "2309:11: ( (lv_excludedPaths_50_0= ruleHyphenValues ) )?";
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2372:11: ( (lv_includedTags_55_0= ruleHyphenValues ) )?";
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "2485:11: ( (lv_excludedTags_64_0= ruleHyphenValues ) )?";
        }
    }
    static final String dfa_30s = "\1\7\1\uffff\1\7\1\uffff\1\7\1\u00ab\2\uffff\1\12\3\uffff";
    static final String dfa_31s = "\1\u00b2\1\uffff\1\u00b5\1\uffff\1\u00b6\1\u00b5\2\uffff\1\u00b2\3\uffff";
    static final String[] dfa_32s = {
            "\1\1\14\uffff\1\1\14\uffff\1\1\37\uffff\1\1\16\uffff\1\1\45\uffff\1\1\24\uffff\1\1\31\uffff\1\1\1\3\2\uffff\1\1\1\uffff\1\3\5\uffff\1\1\1\2",
            "",
            "\1\1\14\uffff\1\1\14\uffff\1\1\37\uffff\1\1\16\uffff\1\1\45\uffff\1\1\24\uffff\1\1\32\uffff\1\1\1\4\10\uffff\3\1\2\uffff\1\1",
            "",
            "\1\1\14\uffff\1\1\14\uffff\1\1\37\uffff\1\1\16\uffff\1\1\45\uffff\1\1\24\uffff\1\1\32\uffff\1\5\1\uffff\1\7\2\uffff\5\7\1\10\1\1\1\6\2\uffff\2\7",
            "\2\12\2\11\1\12\2\uffff\1\12\2\uffff\1\11",
            "",
            "",
            "\1\1\17\uffff\1\1\20\uffff\2\1\27\uffff\1\1\52\uffff\1\1\10\uffff\1\1\5\uffff\1\1\7\uffff\1\1\15\uffff\1\1\21\uffff\1\12\4\uffff\1\12\4\uffff\1\1\1\13\1\12",
            "",
            "",
            ""
    };
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_30;
            this.max = dfa_31;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "()* loopback of 2642:5: ( (lv_otherEventParameterValues_72_0= ruleParameterValue ) )*";
        }
    }
    static final String dfa_33s = "\1\2\14\uffff";
    static final String dfa_34s = "\1\47\1\0\2\uffff\1\0\10\uffff";
    static final String dfa_35s = "\1\u00b1\1\0\2\uffff\1\0\10\uffff";
    static final String dfa_36s = "\2\uffff\1\3\10\uffff\1\2\1\1";
    static final String dfa_37s = "\1\0\1\1\2\uffff\1\2\10\uffff}>";
    static final String[] dfa_38s = {
            "\1\2\17\uffff\1\2\1\uffff\1\2\10\uffff\1\2\26\uffff\1\13\61\uffff\1\2\4\uffff\1\2\25\uffff\1\2\11\uffff\1\4\1\1",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = dfa_21;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "()+ loopback of 3192:13: ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA96_0 = input.LA(1);

                         
                        int index96_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA96_0==RULE_END) ) {s = 1;}

                        else if ( (LA96_0==EOF||LA96_0==IsSkippable||LA96_0==Condition||LA96_0==DependsOn||LA96_0==Variables||LA96_0==Jobs||LA96_0==Pool||LA96_0==HyphenMinus) ) {s = 2;}

                        else if ( (LA96_0==RULE_BEGIN) ) {s = 4;}

                        else if ( LA96_0 == Demands && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 1) ) {s = 11;}

                         
                        input.seek(index96_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA96_1 = input.LA(1);

                         
                        int index96_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1()) ) {s = 2;}

                         
                        input.seek(index96_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA96_4 = input.LA(1);

                         
                        int index96_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1()) ) {s = 2;}

                         
                        input.seek(index96_4);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 96, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_39s = "\u0089\uffff";
    static final String dfa_40s = "\1\2\u0088\uffff";
    static final String dfa_41s = "\1\4\1\0\1\uffff\1\0\3\uffff\2\0\u0080\uffff";
    static final String dfa_42s = "\1\u00b5\1\0\1\uffff\1\0\3\uffff\2\0\u0080\uffff";
    static final String dfa_43s = "\2\uffff\1\4\3\uffff\1\1\2\uffff\1\3\176\uffff\1\2";
    static final String dfa_44s = "\1\0\1\1\1\uffff\1\2\3\uffff\1\3\1\4\u0080\uffff}>";
    static final String[] dfa_45s = {
            "\1\11\1\uffff\26\11\1\uffff\12\11\1\uffff\6\11\1\uffff\1\11\1\uffff\1\11\2\uffff\5\11\1\10\1\11\1\uffff\5\11\1\uffff\4\11\1\uffff\1\11\1\uffff\1\11\1\uffff\3\11\1\uffff\7\11\1\uffff\2\11\1\uffff\7\11\1\uffff\11\11\2\uffff\2\11\1\uffff\10\11\1\uffff\2\11\1\uffff\1\11\1\7\10\11\2\uffff\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\3\11\1\uffff\6\11\1\uffff\2\11\3\uffff\5\11\2\uffff\1\2\11\uffff\1\6\1\1\1\3\2\uffff\1\2",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "()+ loopback of 3608:6: ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_0 = input.LA(1);

                         
                        int index115_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA115_0==RULE_END) ) {s = 1;}

                        else if ( (LA115_0==EOF||LA115_0==HyphenMinus||LA115_0==RULE_STRING) ) {s = 2;}

                        else if ( (LA115_0==RULE_ID) ) {s = 3;}

                        else if ( LA115_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0) ) {s = 6;}

                        else if ( LA115_0 == Needs && ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) ) {s = 7;}

                        else if ( LA115_0 == DependsOn && ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) ) {s = 8;}

                        else if ( ( LA115_0 == Repository_dispatch || LA115_0 >= ContinueOnError_1 && LA115_0 <= Pull_request || LA115_0 >= Requirements && LA115_0 <= Environment || LA115_0 >= Permissions && LA115_0 <= Conditions || LA115_0 == Deployment || LA115_0 == Parameters || LA115_0 >= Repository && LA115_0 <= Container || LA115_0 == Endpoints || LA115_0 >= FailFast && LA115_0 <= RunPolicy || LA115_0 >= Variables && LA115_0 <= Checkout || LA115_0 == Defaults || LA115_0 == MaxTime || LA115_0 >= Parallel && LA115_0 <= PreBuild || LA115_0 >= RunName && LA115_0 <= Timeouts || LA115_0 >= Command && LA115_0 <= Default || LA115_0 >= Exclude && LA115_0 <= Project || LA115_0 >= Release && LA115_0 <= VmImage || LA115_0 >= Caches && LA115_0 <= Docker || LA115_0 >= Except && LA115_0 <= Agent || LA115_0 >= Cache && LA115_0 <= Final || LA115_0 == Image || LA115_0 >= Paths && LA115_0 <= Tasks || LA115_0 == Auth || LA115_0 == Cron || LA115_0 >= Name && LA115_0 <= Only || LA115_0 >= Plan && LA115_0 <= Push || LA115_0 >= Step && LA115_0 <= With || LA115_0 >= Env && LA115_0 <= Jdk || LA115_0 >= Run && LA115_0 <= On ) && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 9;}

                         
                        input.seek(index115_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA115_1 = input.LA(1);

                         
                        int index115_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1()) ) {s = 2;}

                         
                        input.seek(index115_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA115_3 = input.LA(1);

                         
                        int index115_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1()) ) {s = 2;}

                         
                        input.seek(index115_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA115_7 = input.LA(1);

                         
                        int index115_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) {s = 136;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 9;}

                         
                        input.seek(index115_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA115_8 = input.LA(1);

                         
                        int index115_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) {s = 136;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 9;}

                         
                        input.seek(index115_8);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 115, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_46s = "\16\uffff";
    static final String dfa_47s = "\2\uffff\4\15\10\uffff";
    static final String dfa_48s = "\1\4\1\uffff\4\u00a4\10\uffff";
    static final String dfa_49s = "\1\u00b2\1\uffff\4\u00b5\10\uffff";
    static final String dfa_50s = "\1\uffff\1\1\4\uffff\1\2\7\1";
    static final String dfa_51s = "\16\uffff}>";
    static final String[] dfa_52s = {
            "\1\1\1\uffff\26\1\1\uffff\12\1\1\uffff\6\1\1\uffff\1\1\1\6\1\1\1\uffff\1\6\7\1\1\uffff\5\1\1\uffff\3\1\1\3\1\uffff\1\1\1\6\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\2\1\1\uffff\7\1\1\6\11\1\2\uffff\2\1\1\uffff\5\1\1\5\2\1\1\uffff\2\1\1\uffff\12\1\2\uffff\1\1\1\6\1\1\1\uffff\2\1\1\uffff\3\1\1\6\2\1\1\4\3\1\1\uffff\2\1\3\uffff\1\2\4\1\16\uffff\1\1",
            "",
            "\1\6\1\uffff\1\15\3\uffff\1\6\1\13\1\15\1\10\1\11\1\14\2\15\1\12\2\uffff\1\7",
            "\1\6\1\uffff\1\15\3\uffff\1\6\1\13\1\15\1\10\1\11\1\14\2\15\1\12\2\uffff\1\7",
            "\1\6\1\uffff\1\15\3\uffff\1\6\1\13\1\15\1\10\1\11\1\14\2\15\1\12\2\uffff\1\7",
            "\1\6\1\uffff\1\15\3\uffff\1\6\1\13\1\15\1\10\1\11\1\14\2\15\1\12\2\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = dfa_46;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "3991:3: (this_Action_1= ruleAction | this_Script_2= ruleScript )";
        }
    }
    static final String dfa_53s = "\1\4\1\uffff\4\4\10\uffff";
    static final String[] dfa_54s = {
            "\1\1\1\uffff\26\1\1\uffff\12\1\1\uffff\6\1\1\uffff\1\1\1\6\1\1\1\uffff\1\6\7\1\1\uffff\5\1\1\uffff\3\1\1\3\1\uffff\1\1\1\6\1\1\1\uffff\3\1\1\uffff\7\1\1\uffff\2\1\1\uffff\7\1\1\6\11\1\2\uffff\2\1\1\uffff\5\1\1\5\2\1\1\uffff\2\1\1\uffff\12\1\2\uffff\1\1\1\6\1\1\1\uffff\2\1\1\uffff\3\1\1\6\2\1\1\4\3\1\1\uffff\2\1\3\uffff\1\2\4\1\16\uffff\1\1",
            "",
            "\1\15\1\uffff\26\15\1\uffff\12\15\1\uffff\6\15\1\uffff\3\15\1\uffff\10\15\1\uffff\5\15\1\uffff\4\15\1\uffff\3\15\1\uffff\3\15\1\uffff\7\15\1\uffff\2\15\1\uffff\21\15\2\uffff\2\15\1\uffff\10\15\1\uffff\2\15\1\uffff\12\15\2\uffff\3\15\1\uffff\1\1\1\15\1\uffff\12\15\1\uffff\2\15\3\uffff\5\15\1\6\5\uffff\1\6\1\13\1\15\1\10\1\11\1\14\2\15\1\12\2\uffff\1\7",
            "\1\15\1\uffff\26\15\1\uffff\12\15\1\uffff\6\15\1\uffff\3\15\1\uffff\10\15\1\uffff\5\15\1\uffff\4\15\1\uffff\3\15\1\uffff\3\15\1\uffff\7\15\1\uffff\2\15\1\uffff\21\15\2\uffff\2\15\1\uffff\10\15\1\uffff\2\15\1\uffff\12\15\2\uffff\3\15\1\uffff\1\1\1\15\1\uffff\12\15\1\uffff\2\15\3\uffff\5\15\1\6\5\uffff\1\6\1\13\1\15\1\10\1\11\1\14\2\15\1\12\2\uffff\1\7",
            "\1\15\1\uffff\26\15\1\uffff\12\15\1\uffff\6\15\1\uffff\3\15\1\uffff\10\15\1\uffff\5\15\1\uffff\4\15\1\uffff\3\15\1\uffff\3\15\1\uffff\7\15\1\uffff\2\15\1\uffff\21\15\2\uffff\2\15\1\uffff\10\15\1\uffff\2\15\1\uffff\12\15\2\uffff\3\15\1\uffff\1\1\1\15\1\uffff\12\15\1\uffff\2\15\3\uffff\5\15\1\6\5\uffff\1\6\1\13\1\15\1\10\1\11\1\14\2\15\1\12\2\uffff\1\7",
            "\1\15\1\uffff\26\15\1\uffff\12\15\1\uffff\6\15\1\uffff\3\15\1\uffff\10\15\1\uffff\5\15\1\uffff\4\15\1\uffff\3\15\1\uffff\3\15\1\uffff\7\15\1\uffff\2\15\1\uffff\21\15\2\uffff\2\15\1\uffff\10\15\1\uffff\2\15\1\uffff\12\15\2\uffff\3\15\1\uffff\1\1\1\15\1\uffff\12\15\1\uffff\2\15\3\uffff\5\15\1\6\5\uffff\1\6\1\13\1\15\1\10\1\11\1\14\2\15\1\12\2\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[][] dfa_54 = unpackEncodedStringArray(dfa_54s);

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = dfa_46;
            this.eof = dfa_46;
            this.min = dfa_53;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_54;
        }
        public String getDescription() {
            return "4215:6: (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript )";
        }
    }

    class DFA130 extends DFA {

        public DFA130(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 130;
            this.eot = dfa_46;
            this.eof = dfa_46;
            this.min = dfa_53;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_54;
        }
        public String getDescription() {
            return "4375:6: (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8806000600100182L,0x00400200290180C6L,0x0006000804015800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8806000600100182L,0x00400200290180C6L,0x0006000804015804L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0006004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0005000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004080000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8806000600100182L,0x004006002B0180C6L,0x0007000804015800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0024000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8806000600100182L,0x004002002B0180C6L,0x0007000804015800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0025F84000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000400010000000L,0x0000100000400400L,0x0002000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8806000600100182L,0x00400200290180C6L,0x0007004804015800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0802000200100080L,0x0040000001010042L,0x0004000800004800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200100080L,0x0040000000010002L,0x0005010000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200100080L,0x0000000000010002L,0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200100080L,0x0000000000010002L,0x0006000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200100080L,0x0040000000010002L,0x0004010000000800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000022000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200100080L,0x0040000000010002L,0x0004000000000800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0026004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0006084000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004084000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0024F80000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001004000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004084000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x002500C000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0025004000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000180004000400L,0x4100800000000010L,0x0003000000100040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0025F94000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000180004000400L,0x4100800000000010L,0x0002000000100000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000180004000400L,0x4100800000000010L,0x0027014000100000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000180004000400L,0x4100800000000010L,0x0026004000100000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0024004000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000024000000L,0x0026004000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0026004000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000024000000L,0x0027F84000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000024000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0100080000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0280008000000002L,0x0000000000000004L,0x0001000000010800L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x028000A000000002L,0x0000000000000004L,0x0001000000010800L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0027F80000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0280008000000002L,0x0000040002000004L,0x0003000000010800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0280008000000002L,0x0000000002000004L,0x0003000000010800L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0280008000000002L,0x0000000000000004L,0x0001004000010800L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0280008000000002L,0x0000000000000004L,0x0005000000010800L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0xF7F2BF7FEFFFFFD0L,0xF6FF67FDFDBFBABDL,0x0007008F8DFBB53FL});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0xF7F2BF7FEFFFFFD0L,0xF6FF67FDFDBFBABDL,0x0007000F8DFBB53FL});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0xF7F2BF7FEFFFFFD2L,0xF6FF67FDFDBFBABDL,0x0007000F8DFBB53FL});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004010000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0xF7F2BF7FEFFFFFD0L,0xF6FF67FDFDBFBABDL,0x0006000F8DFBB53FL});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0025F90000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0xF7F2BF7FEFFFFFD0L,0xF6FF67FDFDBFBABDL,0x0004000F8DFBB53FL});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0xF7FBBF7FEFFFFFD0L,0xF6FF67FFFDBFBBBDL,0x0004000F8DFFB73FL});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0024FC1000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0xF7FBBF7FEFFFFFD0L,0xF6FF67FFFDBFBBBDL,0x0006000F8DFFB73FL});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0025F80000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0065F94000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000062000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004280000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0024FA0000000000L});

}
