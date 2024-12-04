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
    // InternalPipelineParser.g:65:1: rulePipeline returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+ {...}?) ) ) ;
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
        Token lv_jobOrStageVar_54_1=null;
        Token lv_jobOrStageVar_54_2=null;
        Token this_BEGIN_55=null;
        Token this_END_58=null;
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

        EObject lv_stages_56_0 = null;

        EObject lv_jobs_57_0 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:71:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+ {...}?) ) ) )
            // InternalPipelineParser.g:72:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalPipelineParser.g:72:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+ {...}?) ) )
            // InternalPipelineParser.g:73:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+ {...}?) )
            {
            // InternalPipelineParser.g:73:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+ {...}?) )
            // InternalPipelineParser.g:74:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPipelineAccess().getUnorderedGroup());
            			
            // InternalPipelineParser.g:77:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+ {...}?)
            // InternalPipelineParser.g:78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+ {...}?
            {
            // InternalPipelineParser.g:78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=14;
                alt23 = dfa23.predict(input);
                switch (alt23) {
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
            	            else if ( ( LA15_2 == EOF || LA15_2 == WorkingDirectory || LA15_2 == Concurrency || LA15_2 >= Parameters && LA15_2 <= Permission || LA15_2 == Executors || LA15_2 == Resources || LA15_2 == Variables || LA15_2 >= Commands && LA15_2 <= Defaults || LA15_2 == RunName || LA15_2 >= Default && LA15_2 <= Demands || LA15_2 == Extends || LA15_2 == Include || LA15_2 == Version || LA15_2 == Stages || LA15_2 >= Jobs && LA15_2 <= Name || LA15_2 == Orbs || LA15_2 == Pool || LA15_2 == Env || LA15_2 == RULE_BEGIN ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup_7_1(), 1) ) {
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
            	    // InternalPipelineParser.g:822:3: ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:822:3: ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) )
            	    // InternalPipelineParser.g:823:4: {...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12)");
            	    }
            	    // InternalPipelineParser.g:823:103: ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:824:5: ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12);
            	    				
            	    // InternalPipelineParser.g:827:8: ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) )
            	    // InternalPipelineParser.g:827:9: {...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePipeline", "true");
            	    }
            	    // InternalPipelineParser.g:827:18: ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) )
            	    // InternalPipelineParser.g:827:19: ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END )
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

            	    // InternalPipelineParser.g:846:8: ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END )
            	    // InternalPipelineParser.g:847:9: ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END
            	    {
            	    // InternalPipelineParser.g:847:9: ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) )
            	    // InternalPipelineParser.g:848:10: ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) )
            	    {
            	    // InternalPipelineParser.g:848:10: ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) )
            	    // InternalPipelineParser.g:849:11: (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs )
            	    {
            	    // InternalPipelineParser.g:849:11: (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==Stages) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==Jobs) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalPipelineParser.g:850:12: lv_jobOrStageVar_54_1= Stages
            	            {
            	            lv_jobOrStageVar_54_1=(Token)match(input,Stages,FOLLOW_5); 

            	            												newLeafNode(lv_jobOrStageVar_54_1, grammarAccess.getPipelineAccess().getJobOrStageVarStagesKeyword_12_1_0_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getPipelineRule());
            	            												}
            	            												setWithLastConsumed(current, "jobOrStageVar", lv_jobOrStageVar_54_1, null);
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:861:12: lv_jobOrStageVar_54_2= Jobs
            	            {
            	            lv_jobOrStageVar_54_2=(Token)match(input,Jobs,FOLLOW_5); 

            	            												newLeafNode(lv_jobOrStageVar_54_2, grammarAccess.getPipelineAccess().getJobOrStageVarJobsKeyword_12_1_0_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getPipelineRule());
            	            												}
            	            												setWithLastConsumed(current, "jobOrStageVar", lv_jobOrStageVar_54_2, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    this_BEGIN_55=(Token)match(input,RULE_BEGIN,FOLLOW_27); 

            	    									newLeafNode(this_BEGIN_55, grammarAccess.getPipelineAccess().getBEGINTerminalRuleCall_12_1_1());
            	    								
            	    // InternalPipelineParser.g:878:9: ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* )
            	    int alt22=2;
            	    switch ( input.LA(1) ) {
            	    case HyphenMinus:
            	        {
            	        int LA22_1 = input.LA(2);

            	        if ( (LA22_1==Stage) ) {
            	            alt22=1;
            	        }
            	        else if ( (LA22_1==Deployment||LA22_1==Job) ) {
            	            alt22=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 22, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case RULE_END:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case RULE_ID:
            	    case RULE_STRING:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // InternalPipelineParser.g:879:10: ( (lv_stages_56_0= ruleStage ) )*
            	            {
            	            // InternalPipelineParser.g:879:10: ( (lv_stages_56_0= ruleStage ) )*
            	            loop20:
            	            do {
            	                int alt20=2;
            	                int LA20_0 = input.LA(1);

            	                if ( (LA20_0==HyphenMinus) ) {
            	                    alt20=1;
            	                }


            	                switch (alt20) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:880:11: (lv_stages_56_0= ruleStage )
            	            	    {
            	            	    // InternalPipelineParser.g:880:11: (lv_stages_56_0= ruleStage )
            	            	    // InternalPipelineParser.g:881:12: lv_stages_56_0= ruleStage
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getPipelineAccess().getStagesStageParserRuleCall_12_1_2_0_0());
            	            	    											
            	            	    pushFollow(FOLLOW_28);
            	            	    lv_stages_56_0=ruleStage();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getPipelineRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"stages",
            	            	    													lv_stages_56_0,
            	            	    													"ca.mcgill.devops.pipeline.Pipeline.Stage");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop20;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:899:10: ( (lv_jobs_57_0= ruleJob ) )*
            	            {
            	            // InternalPipelineParser.g:899:10: ( (lv_jobs_57_0= ruleJob ) )*
            	            loop21:
            	            do {
            	                int alt21=2;
            	                int LA21_0 = input.LA(1);

            	                if ( (LA21_0==HyphenMinus||LA21_0==RULE_ID||LA21_0==RULE_STRING) ) {
            	                    alt21=1;
            	                }


            	                switch (alt21) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:900:11: (lv_jobs_57_0= ruleJob )
            	            	    {
            	            	    // InternalPipelineParser.g:900:11: (lv_jobs_57_0= ruleJob )
            	            	    // InternalPipelineParser.g:901:12: lv_jobs_57_0= ruleJob
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getPipelineAccess().getJobsJobParserRuleCall_12_1_2_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_27);
            	            	    lv_jobs_57_0=ruleJob();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getPipelineRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"jobs",
            	            	    													lv_jobs_57_0,
            	            	    													"ca.mcgill.devops.pipeline.Pipeline.Job");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop21;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    this_END_58=(Token)match(input,RULE_END,FOLLOW_4); 

            	    									newLeafNode(this_END_58, grammarAccess.getPipelineAccess().getENDTerminalRuleCall_12_1_3());
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPipelineAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // InternalPipelineParser.g:941:1: entryRuleExtendedParameter returns [EObject current=null] : iv_ruleExtendedParameter= ruleExtendedParameter EOF ;
    public final EObject entryRuleExtendedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendedParameter = null;


        try {
            // InternalPipelineParser.g:941:58: (iv_ruleExtendedParameter= ruleExtendedParameter EOF )
            // InternalPipelineParser.g:942:2: iv_ruleExtendedParameter= ruleExtendedParameter EOF
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
    // InternalPipelineParser.g:948:1: ruleExtendedParameter returns [EObject current=null] : ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) ) ;
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
            // InternalPipelineParser.g:954:2: ( ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) ) )
            // InternalPipelineParser.g:955:2: ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) )
            {
            // InternalPipelineParser.g:955:2: ( (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) ) | (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Extends) ) {
                alt26=1;
            }
            else if ( (LA26_0==Include) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPipelineParser.g:956:3: (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) )
                    {
                    // InternalPipelineParser.g:956:3: (otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END ) )
                    // InternalPipelineParser.g:957:4: otherlv_0= Extends (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END )
                    {
                    otherlv_0=(Token)match(input,Extends,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getExtendedParameterAccess().getExtendsKeyword_0_0());
                    			
                    // InternalPipelineParser.g:961:4: (this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END )
                    // InternalPipelineParser.g:962:5: this_BEGIN_1= RULE_BEGIN (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) ) (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) ) this_END_8= RULE_END
                    {
                    this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

                    					newLeafNode(this_BEGIN_1, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_0());
                    				
                    // InternalPipelineParser.g:966:5: (otherlv_2= Template ( (lv_template_3_0= RULE_ID ) ) )
                    // InternalPipelineParser.g:967:6: otherlv_2= Template ( (lv_template_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,Template,FOLLOW_3); 

                    						newLeafNode(otherlv_2, grammarAccess.getExtendedParameterAccess().getTemplateKeyword_0_1_1_0());
                    					
                    // InternalPipelineParser.g:971:6: ( (lv_template_3_0= RULE_ID ) )
                    // InternalPipelineParser.g:972:7: (lv_template_3_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:972:7: (lv_template_3_0= RULE_ID )
                    // InternalPipelineParser.g:973:8: lv_template_3_0= RULE_ID
                    {
                    lv_template_3_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

                    // InternalPipelineParser.g:990:5: (otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END ) )
                    // InternalPipelineParser.g:991:6: otherlv_4= Parameters (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    {
                    otherlv_4=(Token)match(input,Parameters,FOLLOW_5); 

                    						newLeafNode(otherlv_4, grammarAccess.getExtendedParameterAccess().getParametersKeyword_0_1_2_0());
                    					
                    // InternalPipelineParser.g:995:6: (this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END )
                    // InternalPipelineParser.g:996:7: this_BEGIN_5= RULE_BEGIN ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )* this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_31); 

                    							newLeafNode(this_BEGIN_5, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_0_1_2_1_0());
                    						
                    // InternalPipelineParser.g:1000:7: ( (lv_extendedParameterValues_6_0= ruleParameterValue ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==HyphenMinus||LA24_0==RULE_COMPLEX_EXPRESSION||LA24_0==RULE_ID) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1001:8: (lv_extendedParameterValues_6_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1001:8: (lv_extendedParameterValues_6_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1002:9: lv_extendedParameterValues_6_0= ruleParameterValue
                    	    {

                    	    									newCompositeNode(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_0_1_2_1_1_0());
                    	    								
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop24;
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
                    // InternalPipelineParser.g:1032:3: (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) )
                    {
                    // InternalPipelineParser.g:1032:3: (otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END ) )
                    // InternalPipelineParser.g:1033:4: otherlv_9= Include (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END )
                    {
                    otherlv_9=(Token)match(input,Include,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getExtendedParameterAccess().getIncludeKeyword_1_0());
                    			
                    // InternalPipelineParser.g:1037:4: (this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END )
                    // InternalPipelineParser.g:1038:5: this_BEGIN_10= RULE_BEGIN ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+ this_END_12= RULE_END
                    {
                    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

                    					newLeafNode(this_BEGIN_10, grammarAccess.getExtendedParameterAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:1042:5: ( (lv_extendedParameterValues_11_0= ruleParameterValue ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==HyphenMinus||LA25_0==RULE_COMPLEX_EXPRESSION||LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1043:6: (lv_extendedParameterValues_11_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1043:6: (lv_extendedParameterValues_11_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1044:7: lv_extendedParameterValues_11_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getExtendedParameterAccess().getExtendedParameterValuesParameterValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
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
    // InternalPipelineParser.g:1071:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalPipelineParser.g:1071:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalPipelineParser.g:1072:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalPipelineParser.g:1078:1: ruleVariable returns [EObject current=null] : ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) ) ;
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
            // InternalPipelineParser.g:1084:2: ( ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) ) )
            // InternalPipelineParser.g:1085:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) )
            {
            // InternalPipelineParser.g:1085:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END ) | ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_BEGIN) ) {
                alt30=1;
            }
            else if ( (LA30_0==HyphenMinus) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPipelineParser.g:1086:3: (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END )
                    {
                    // InternalPipelineParser.g:1086:3: (this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END )
                    // InternalPipelineParser.g:1087:4: this_BEGIN_0= RULE_BEGIN ( (lv_variableValues_1_0= ruleParameterValue ) )+ this_END_2= RULE_END
                    {
                    this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

                    				newLeafNode(this_BEGIN_0, grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_0_0());
                    			
                    // InternalPipelineParser.g:1091:4: ( (lv_variableValues_1_0= ruleParameterValue ) )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==HyphenMinus||LA27_0==RULE_COMPLEX_EXPRESSION||LA27_0==RULE_ID) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1092:5: (lv_variableValues_1_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1092:5: (lv_variableValues_1_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1093:6: lv_variableValues_1_0= ruleParameterValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getVariableAccess().getVariableValuesParameterValueParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
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
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    this_END_2=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_2, grammarAccess.getVariableAccess().getENDTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1116:3: ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) )
                    {
                    // InternalPipelineParser.g:1116:3: ( (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) ) )
                    // InternalPipelineParser.g:1117:4: (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )? ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) )
                    {
                    // InternalPipelineParser.g:1117:4: (otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==HyphenMinus) ) {
                        int LA28_1 = input.LA(2);

                        if ( (LA28_1==Group) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalPipelineParser.g:1118:5: otherlv_3= HyphenMinus otherlv_4= Group ( (lv_group_5_0= ruleAnyData ) )
                            {
                            otherlv_3=(Token)match(input,HyphenMinus,FOLLOW_14); 

                            					newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_0_0());
                            				
                            otherlv_4=(Token)match(input,Group,FOLLOW_33); 

                            					newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getGroupKeyword_1_0_1());
                            				
                            // InternalPipelineParser.g:1126:5: ( (lv_group_5_0= ruleAnyData ) )
                            // InternalPipelineParser.g:1127:6: (lv_group_5_0= ruleAnyData )
                            {
                            // InternalPipelineParser.g:1127:6: (lv_group_5_0= ruleAnyData )
                            // InternalPipelineParser.g:1128:7: lv_group_5_0= ruleAnyData
                            {

                            							newCompositeNode(grammarAccess.getVariableAccess().getGroupAnyDataParserRuleCall_1_0_2_0());
                            						
                            pushFollow(FOLLOW_34);
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

                    // InternalPipelineParser.g:1146:4: ( (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END ) )
                    // InternalPipelineParser.g:1147:5: (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) ) (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END )
                    {
                    // InternalPipelineParser.g:1147:5: (otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) ) )
                    // InternalPipelineParser.g:1148:6: otherlv_6= HyphenMinus otherlv_7= Name ( (lv_name_8_0= ruleAnyData ) )
                    {
                    otherlv_6=(Token)match(input,HyphenMinus,FOLLOW_18); 

                    						newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getHyphenMinusKeyword_1_1_0_0());
                    					
                    otherlv_7=(Token)match(input,Name,FOLLOW_33); 

                    						newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getNameKeyword_1_1_0_1());
                    					
                    // InternalPipelineParser.g:1156:6: ( (lv_name_8_0= ruleAnyData ) )
                    // InternalPipelineParser.g:1157:7: (lv_name_8_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:1157:7: (lv_name_8_0= ruleAnyData )
                    // InternalPipelineParser.g:1158:8: lv_name_8_0= ruleAnyData
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

                    // InternalPipelineParser.g:1176:5: (this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END )
                    // InternalPipelineParser.g:1177:6: this_BEGIN_9= RULE_BEGIN (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) ) (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )? this_END_14= RULE_END
                    {
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_35); 

                    						newLeafNode(this_BEGIN_9, grammarAccess.getVariableAccess().getBEGINTerminalRuleCall_1_1_1_0());
                    					
                    // InternalPipelineParser.g:1181:6: (otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) ) )
                    // InternalPipelineParser.g:1182:7: otherlv_10= Value ( (lv_value_11_0= ruleAnyData ) )
                    {
                    otherlv_10=(Token)match(input,Value,FOLLOW_33); 

                    							newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getValueKeyword_1_1_1_1_0());
                    						
                    // InternalPipelineParser.g:1186:7: ( (lv_value_11_0= ruleAnyData ) )
                    // InternalPipelineParser.g:1187:8: (lv_value_11_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:1187:8: (lv_value_11_0= ruleAnyData )
                    // InternalPipelineParser.g:1188:9: lv_value_11_0= ruleAnyData
                    {

                    									newCompositeNode(grammarAccess.getVariableAccess().getValueAnyDataParserRuleCall_1_1_1_1_1_0());
                    								
                    pushFollow(FOLLOW_36);
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

                    // InternalPipelineParser.g:1206:6: (otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==Readonly) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalPipelineParser.g:1207:7: otherlv_12= Readonly ( (lv_readonly_13_0= RULE_ID ) )
                            {
                            otherlv_12=(Token)match(input,Readonly,FOLLOW_3); 

                            							newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getReadonlyKeyword_1_1_1_2_0());
                            						
                            // InternalPipelineParser.g:1211:7: ( (lv_readonly_13_0= RULE_ID ) )
                            // InternalPipelineParser.g:1212:8: (lv_readonly_13_0= RULE_ID )
                            {
                            // InternalPipelineParser.g:1212:8: (lv_readonly_13_0= RULE_ID )
                            // InternalPipelineParser.g:1213:9: lv_readonly_13_0= RULE_ID
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
    // InternalPipelineParser.g:1241:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalPipelineParser.g:1241:49: (iv_ruleResource= ruleResource EOF )
            // InternalPipelineParser.g:1242:2: iv_ruleResource= ruleResource EOF
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
    // InternalPipelineParser.g:1248:1: ruleResource returns [EObject current=null] : ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) ) ;
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
            // InternalPipelineParser.g:1254:2: ( ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) ) )
            // InternalPipelineParser.g:1255:2: ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) )
            {
            // InternalPipelineParser.g:1255:2: ( ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) ) )
            // InternalPipelineParser.g:1256:3: ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) ) ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) )
            {
            // InternalPipelineParser.g:1256:3: ( ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) ) )
            // InternalPipelineParser.g:1257:4: ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) )
            {
            // InternalPipelineParser.g:1257:4: ( (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages ) )
            // InternalPipelineParser.g:1258:5: (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages )
            {
            // InternalPipelineParser.g:1258:5: (lv_resourceName_0_1= Builds | lv_resourceName_0_2= Containers | lv_resourceName_0_3= Pipelines | lv_resourceName_0_4= Repositories | lv_resourceName_0_5= Webhooks | lv_resourceName_0_6= Packages )
            int alt31=6;
            switch ( input.LA(1) ) {
            case Builds:
                {
                alt31=1;
                }
                break;
            case Containers:
                {
                alt31=2;
                }
                break;
            case Pipelines:
                {
                alt31=3;
                }
                break;
            case Repositories:
                {
                alt31=4;
                }
                break;
            case Webhooks:
                {
                alt31=5;
                }
                break;
            case Packages:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalPipelineParser.g:1259:6: lv_resourceName_0_1= Builds
                    {
                    lv_resourceName_0_1=(Token)match(input,Builds,FOLLOW_37); 

                    						newLeafNode(lv_resourceName_0_1, grammarAccess.getResourceAccess().getResourceNameBuildsKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1270:6: lv_resourceName_0_2= Containers
                    {
                    lv_resourceName_0_2=(Token)match(input,Containers,FOLLOW_37); 

                    						newLeafNode(lv_resourceName_0_2, grammarAccess.getResourceAccess().getResourceNameContainersKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:1281:6: lv_resourceName_0_3= Pipelines
                    {
                    lv_resourceName_0_3=(Token)match(input,Pipelines,FOLLOW_37); 

                    						newLeafNode(lv_resourceName_0_3, grammarAccess.getResourceAccess().getResourceNamePipelinesKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:1292:6: lv_resourceName_0_4= Repositories
                    {
                    lv_resourceName_0_4=(Token)match(input,Repositories,FOLLOW_37); 

                    						newLeafNode(lv_resourceName_0_4, grammarAccess.getResourceAccess().getResourceNameRepositoriesKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:1303:6: lv_resourceName_0_5= Webhooks
                    {
                    lv_resourceName_0_5=(Token)match(input,Webhooks,FOLLOW_37); 

                    						newLeafNode(lv_resourceName_0_5, grammarAccess.getResourceAccess().getResourceNameWebhooksKeyword_0_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(current, "resourceName", lv_resourceName_0_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:1314:6: lv_resourceName_0_6= Packages
                    {
                    lv_resourceName_0_6=(Token)match(input,Packages,FOLLOW_37); 

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

            // InternalPipelineParser.g:1327:3: ( (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )* | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==EOF||LA34_0==Repositories||LA34_0==Containers||LA34_0==Pipelines||LA34_0==Packages||LA34_0==Webhooks||LA34_0==Builds||LA34_0==HyphenMinus||LA34_0==RULE_END) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_BEGIN) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalPipelineParser.g:1328:4: (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )*
                    {
                    // InternalPipelineParser.g:1328:4: (otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==HyphenMinus) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1329:5: otherlv_1= HyphenMinus ( (lv_resourceValues_2_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_1=(Token)match(input,HyphenMinus,FOLLOW_32); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_0_0());
                    	    				
                    	    // InternalPipelineParser.g:1333:5: ( (lv_resourceValues_2_0= ruleParameterValue ) )
                    	    // InternalPipelineParser.g:1334:6: (lv_resourceValues_2_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1334:6: (lv_resourceValues_2_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1335:7: lv_resourceValues_2_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
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
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1354:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:1354:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END )
                    // InternalPipelineParser.g:1355:5: this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getResourceAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:1359:5: (otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==HyphenMinus) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1360:6: otherlv_4= HyphenMinus ( (lv_resourceValues_5_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_32); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getHyphenMinusKeyword_1_1_1_0());
                    	    					
                    	    // InternalPipelineParser.g:1364:6: ( (lv_resourceValues_5_0= ruleParameterValue ) )
                    	    // InternalPipelineParser.g:1365:7: (lv_resourceValues_5_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1365:7: (lv_resourceValues_5_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1366:8: lv_resourceValues_5_0= ruleParameterValue
                    	    {

                    	    								newCompositeNode(grammarAccess.getResourceAccess().getResourceValuesParameterValueParserRuleCall_1_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_28);
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
                    	    break loop33;
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
    // InternalPipelineParser.g:1394:1: entryRulePipelineParameter returns [EObject current=null] : iv_rulePipelineParameter= rulePipelineParameter EOF ;
    public final EObject entryRulePipelineParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePipelineParameter = null;


        try {
            // InternalPipelineParser.g:1394:58: (iv_rulePipelineParameter= rulePipelineParameter EOF )
            // InternalPipelineParser.g:1395:2: iv_rulePipelineParameter= rulePipelineParameter EOF
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
    // InternalPipelineParser.g:1401:1: rulePipelineParameter returns [EObject current=null] : ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) ) ;
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
            // InternalPipelineParser.g:1407:2: ( ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) ) )
            // InternalPipelineParser.g:1408:2: ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) )
            {
            // InternalPipelineParser.g:1408:2: ( ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ ) | ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Parameters) ) {
                alt38=1;
            }
            else if ( (LA38_0==Executors||LA38_0==Commands||LA38_0==Default||LA38_0==Orbs) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalPipelineParser.g:1409:3: ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ )
                    {
                    // InternalPipelineParser.g:1409:3: ( ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+ )
                    // InternalPipelineParser.g:1410:4: ( (lv_name_0_0= Parameters ) ) ( (lv_parameterValues_1_0= ruleParameterValue ) )+
                    {
                    // InternalPipelineParser.g:1410:4: ( (lv_name_0_0= Parameters ) )
                    // InternalPipelineParser.g:1411:5: (lv_name_0_0= Parameters )
                    {
                    // InternalPipelineParser.g:1411:5: (lv_name_0_0= Parameters )
                    // InternalPipelineParser.g:1412:6: lv_name_0_0= Parameters
                    {
                    lv_name_0_0=(Token)match(input,Parameters,FOLLOW_32); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getPipelineParameterAccess().getNameParametersKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPipelineParameterRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_0, "parameters:");
                    					

                    }


                    }

                    // InternalPipelineParser.g:1424:4: ( (lv_parameterValues_1_0= ruleParameterValue ) )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==HyphenMinus||LA35_0==RULE_COMPLEX_EXPRESSION||LA35_0==RULE_ID) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1425:5: (lv_parameterValues_1_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1425:5: (lv_parameterValues_1_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1426:6: lv_parameterValues_1_0= ruleParameterValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getPipelineParameterAccess().getParameterValuesParameterValueParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
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
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:1445:3: ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) )
                    {
                    // InternalPipelineParser.g:1445:3: ( ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END ) )
                    // InternalPipelineParser.g:1446:4: ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) ) (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END )
                    {
                    // InternalPipelineParser.g:1446:4: ( ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) ) )
                    // InternalPipelineParser.g:1447:5: ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) )
                    {
                    // InternalPipelineParser.g:1447:5: ( (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands ) )
                    // InternalPipelineParser.g:1448:6: (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands )
                    {
                    // InternalPipelineParser.g:1448:6: (lv_name_2_1= Default | lv_name_2_2= Executors | lv_name_2_3= Orbs | lv_name_2_4= Commands )
                    int alt36=4;
                    switch ( input.LA(1) ) {
                    case Default:
                        {
                        alt36=1;
                        }
                        break;
                    case Executors:
                        {
                        alt36=2;
                        }
                        break;
                    case Orbs:
                        {
                        alt36=3;
                        }
                        break;
                    case Commands:
                        {
                        alt36=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // InternalPipelineParser.g:1449:7: lv_name_2_1= Default
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
                            // InternalPipelineParser.g:1460:7: lv_name_2_2= Executors
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
                            // InternalPipelineParser.g:1471:7: lv_name_2_3= Orbs
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
                            // InternalPipelineParser.g:1482:7: lv_name_2_4= Commands
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

                    // InternalPipelineParser.g:1495:4: (this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END )
                    // InternalPipelineParser.g:1496:5: this_BEGIN_3= RULE_BEGIN ( (lv_parameterValues_4_0= ruleParameterValue ) )+ this_END_5= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getPipelineParameterAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:1500:5: ( (lv_parameterValues_4_0= ruleParameterValue ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==HyphenMinus||LA37_0==RULE_COMPLEX_EXPRESSION||LA37_0==RULE_ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1501:6: (lv_parameterValues_4_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:1501:6: (lv_parameterValues_4_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:1502:7: lv_parameterValues_4_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getPipelineParameterAccess().getParameterValuesParameterValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
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


    // $ANTLR start "entryRuleTriggerSchedule"
    // InternalPipelineParser.g:1529:1: entryRuleTriggerSchedule returns [EObject current=null] : iv_ruleTriggerSchedule= ruleTriggerSchedule EOF ;
    public final EObject entryRuleTriggerSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerSchedule = null;


        try {
            // InternalPipelineParser.g:1529:56: (iv_ruleTriggerSchedule= ruleTriggerSchedule EOF )
            // InternalPipelineParser.g:1530:2: iv_ruleTriggerSchedule= ruleTriggerSchedule EOF
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
    // InternalPipelineParser.g:1536:1: ruleTriggerSchedule returns [EObject current=null] : ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? ) ;
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
            // InternalPipelineParser.g:1542:2: ( ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? ) )
            // InternalPipelineParser.g:1543:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? )
            {
            // InternalPipelineParser.g:1543:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )? )
            // InternalPipelineParser.g:1544:3: ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) ) (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )?
            {
            // InternalPipelineParser.g:1544:3: ( (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) ) | (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==HyphenMinus) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_BEGIN) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalPipelineParser.g:1545:4: (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) )
                    {
                    // InternalPipelineParser.g:1545:4: (otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) ) )
                    // InternalPipelineParser.g:1546:5: otherlv_0= HyphenMinus otherlv_1= Cron ( (lv_cronValue_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_40); 

                    					newLeafNode(otherlv_0, grammarAccess.getTriggerScheduleAccess().getHyphenMinusKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,Cron,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getTriggerScheduleAccess().getCronKeyword_0_0_1());
                    				
                    // InternalPipelineParser.g:1554:5: ( (lv_cronValue_2_0= RULE_STRING ) )
                    // InternalPipelineParser.g:1555:6: (lv_cronValue_2_0= RULE_STRING )
                    {
                    // InternalPipelineParser.g:1555:6: (lv_cronValue_2_0= RULE_STRING )
                    // InternalPipelineParser.g:1556:7: lv_cronValue_2_0= RULE_STRING
                    {
                    lv_cronValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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
                    // InternalPipelineParser.g:1574:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END )
                    {
                    // InternalPipelineParser.g:1574:4: (this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END )
                    // InternalPipelineParser.g:1575:5: this_BEGIN_3= RULE_BEGIN (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

                    					newLeafNode(this_BEGIN_3, grammarAccess.getTriggerScheduleAccess().getBEGINTerminalRuleCall_0_1_0());
                    				
                    // InternalPipelineParser.g:1579:5: (otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) ) )
                    // InternalPipelineParser.g:1580:6: otherlv_4= HyphenMinus otherlv_5= Cron ( (lv_cronValue_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_40); 

                    						newLeafNode(otherlv_4, grammarAccess.getTriggerScheduleAccess().getHyphenMinusKeyword_0_1_1_0());
                    					
                    otherlv_5=(Token)match(input,Cron,FOLLOW_8); 

                    						newLeafNode(otherlv_5, grammarAccess.getTriggerScheduleAccess().getCronKeyword_0_1_1_1());
                    					
                    // InternalPipelineParser.g:1588:6: ( (lv_cronValue_6_0= RULE_STRING ) )
                    // InternalPipelineParser.g:1589:7: (lv_cronValue_6_0= RULE_STRING )
                    {
                    // InternalPipelineParser.g:1589:7: (lv_cronValue_6_0= RULE_STRING )
                    // InternalPipelineParser.g:1590:8: lv_cronValue_6_0= RULE_STRING
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

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_41); 

                    					newLeafNode(this_END_7, grammarAccess.getTriggerScheduleAccess().getENDTerminalRuleCall_0_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:1613:3: (this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_BEGIN) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPipelineParser.g:1614:4: this_BEGIN_8= RULE_BEGIN (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )? (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) ) this_END_23= RULE_END
                    {
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

                    				newLeafNode(this_BEGIN_8, grammarAccess.getTriggerScheduleAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:1618:4: (otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==DisplayName) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalPipelineParser.g:1619:5: otherlv_9= DisplayName ( (lv_displayName_10_0= ruleUnquotedString ) )
                            {
                            otherlv_9=(Token)match(input,DisplayName,FOLLOW_3); 

                            					newLeafNode(otherlv_9, grammarAccess.getTriggerScheduleAccess().getDisplayNameKeyword_1_1_0());
                            				
                            // InternalPipelineParser.g:1623:5: ( (lv_displayName_10_0= ruleUnquotedString ) )
                            // InternalPipelineParser.g:1624:6: (lv_displayName_10_0= ruleUnquotedString )
                            {
                            // InternalPipelineParser.g:1624:6: (lv_displayName_10_0= ruleUnquotedString )
                            // InternalPipelineParser.g:1625:7: lv_displayName_10_0= ruleUnquotedString
                            {

                            							newCompositeNode(grammarAccess.getTriggerScheduleAccess().getDisplayNameUnquotedStringParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_43);
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

                    // InternalPipelineParser.g:1643:4: (otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END ) )
                    // InternalPipelineParser.g:1644:5: otherlv_11= Branches (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END )
                    {
                    otherlv_11=(Token)match(input,Branches,FOLLOW_5); 

                    					newLeafNode(otherlv_11, grammarAccess.getTriggerScheduleAccess().getBranchesKeyword_1_2_0());
                    				
                    // InternalPipelineParser.g:1648:5: (this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END )
                    // InternalPipelineParser.g:1649:6: this_BEGIN_12= RULE_BEGIN (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )? (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )? this_END_17= RULE_END
                    {
                    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

                    						newLeafNode(this_BEGIN_12, grammarAccess.getTriggerScheduleAccess().getBEGINTerminalRuleCall_1_2_1_0());
                    					
                    // InternalPipelineParser.g:1653:6: (otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==Include) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalPipelineParser.g:1654:7: otherlv_13= Include ( (lv_includedBranches_14_0= ruleBranch ) )*
                            {
                            otherlv_13=(Token)match(input,Include,FOLLOW_45); 

                            							newLeafNode(otherlv_13, grammarAccess.getTriggerScheduleAccess().getIncludeKeyword_1_2_1_1_0());
                            						
                            // InternalPipelineParser.g:1658:7: ( (lv_includedBranches_14_0= ruleBranch ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==HyphenMinus||LA41_0==RULE_ID||LA41_0==RULE_STRING) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // InternalPipelineParser.g:1659:8: (lv_includedBranches_14_0= ruleBranch )
                            	    {
                            	    // InternalPipelineParser.g:1659:8: (lv_includedBranches_14_0= ruleBranch )
                            	    // InternalPipelineParser.g:1660:9: lv_includedBranches_14_0= ruleBranch
                            	    {

                            	    									newCompositeNode(grammarAccess.getTriggerScheduleAccess().getIncludedBranchesBranchParserRuleCall_1_2_1_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_45);
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
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalPipelineParser.g:1678:6: (otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )* )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==Exclude) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalPipelineParser.g:1679:7: otherlv_15= Exclude ( (lv_excludedBranches_16_0= ruleBranch ) )*
                            {
                            otherlv_15=(Token)match(input,Exclude,FOLLOW_27); 

                            							newLeafNode(otherlv_15, grammarAccess.getTriggerScheduleAccess().getExcludeKeyword_1_2_1_2_0());
                            						
                            // InternalPipelineParser.g:1683:7: ( (lv_excludedBranches_16_0= ruleBranch ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==HyphenMinus||LA43_0==RULE_ID||LA43_0==RULE_STRING) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // InternalPipelineParser.g:1684:8: (lv_excludedBranches_16_0= ruleBranch )
                            	    {
                            	    // InternalPipelineParser.g:1684:8: (lv_excludedBranches_16_0= ruleBranch )
                            	    // InternalPipelineParser.g:1685:9: lv_excludedBranches_16_0= ruleBranch
                            	    {

                            	    									newCompositeNode(grammarAccess.getTriggerScheduleAccess().getExcludedBranchesBranchParserRuleCall_1_2_1_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_27);
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
                            	    break loop43;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_END_17=(Token)match(input,RULE_END,FOLLOW_46); 

                    						newLeafNode(this_END_17, grammarAccess.getTriggerScheduleAccess().getENDTerminalRuleCall_1_2_1_3());
                    					

                    }


                    }

                    // InternalPipelineParser.g:1709:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) ) )
                    // InternalPipelineParser.g:1710:5: ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) )
                    {
                    // InternalPipelineParser.g:1710:5: ( ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* ) )
                    // InternalPipelineParser.g:1711:6: ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3());
                    					
                    // InternalPipelineParser.g:1714:6: ( ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )* )
                    // InternalPipelineParser.g:1715:7: ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )*
                    {
                    // InternalPipelineParser.g:1715:7: ( ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) ) )*
                    loop45:
                    do {
                        int alt45=3;
                        int LA45_0 = input.LA(1);

                        if ( LA45_0 == Batch && getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0) ) {
                            alt45=1;
                        }
                        else if ( LA45_0 == Always && getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1) ) {
                            alt45=2;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1716:5: ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1716:5: ({...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) ) )
                    	    // InternalPipelineParser.g:1717:6: {...}? => ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0)");
                    	    }
                    	    // InternalPipelineParser.g:1717:115: ( ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) ) )
                    	    // InternalPipelineParser.g:1718:7: ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 0);
                    	    						
                    	    // InternalPipelineParser.g:1721:10: ({...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:1721:11: {...}? => (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "true");
                    	    }
                    	    // InternalPipelineParser.g:1721:20: (otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:1721:21: otherlv_19= Batch ( (lv_batch_20_0= RULE_ID ) )
                    	    {
                    	    otherlv_19=(Token)match(input,Batch,FOLLOW_3); 

                    	    										newLeafNode(otherlv_19, grammarAccess.getTriggerScheduleAccess().getBatchKeyword_1_3_0_0());
                    	    									
                    	    // InternalPipelineParser.g:1725:10: ( (lv_batch_20_0= RULE_ID ) )
                    	    // InternalPipelineParser.g:1726:11: (lv_batch_20_0= RULE_ID )
                    	    {
                    	    // InternalPipelineParser.g:1726:11: (lv_batch_20_0= RULE_ID )
                    	    // InternalPipelineParser.g:1727:12: lv_batch_20_0= RULE_ID
                    	    {
                    	    lv_batch_20_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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
                    	    // InternalPipelineParser.g:1749:5: ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1749:5: ({...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) ) )
                    	    // InternalPipelineParser.g:1750:6: {...}? => ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "getUnorderedGroupHelper().canSelect(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1)");
                    	    }
                    	    // InternalPipelineParser.g:1750:115: ( ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) ) )
                    	    // InternalPipelineParser.g:1751:7: ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getTriggerScheduleAccess().getUnorderedGroup_1_3(), 1);
                    	    						
                    	    // InternalPipelineParser.g:1754:10: ({...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:1754:11: {...}? => (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTriggerSchedule", "true");
                    	    }
                    	    // InternalPipelineParser.g:1754:20: (otherlv_21= Always ( (lv_always_22_0= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:1754:21: otherlv_21= Always ( (lv_always_22_0= RULE_ID ) )
                    	    {
                    	    otherlv_21=(Token)match(input,Always,FOLLOW_3); 

                    	    										newLeafNode(otherlv_21, grammarAccess.getTriggerScheduleAccess().getAlwaysKeyword_1_3_1_0());
                    	    									
                    	    // InternalPipelineParser.g:1758:10: ( (lv_always_22_0= RULE_ID ) )
                    	    // InternalPipelineParser.g:1759:11: (lv_always_22_0= RULE_ID )
                    	    {
                    	    // InternalPipelineParser.g:1759:11: (lv_always_22_0= RULE_ID )
                    	    // InternalPipelineParser.g:1760:12: lv_always_22_0= RULE_ID
                    	    {
                    	    lv_always_22_0=(Token)match(input,RULE_ID,FOLLOW_46); 

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
                    	    break loop45;
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
    // InternalPipelineParser.g:1798:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // InternalPipelineParser.g:1798:47: (iv_ruleBranch= ruleBranch EOF )
            // InternalPipelineParser.g:1799:2: iv_ruleBranch= ruleBranch EOF
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
    // InternalPipelineParser.g:1805:1: ruleBranch returns [EObject current=null] : ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:1811:2: ( ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) ) )
            // InternalPipelineParser.g:1812:2: ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) )
            {
            // InternalPipelineParser.g:1812:2: ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) ) )
            // InternalPipelineParser.g:1813:3: (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) )
            {
            // InternalPipelineParser.g:1813:3: (otherlv_0= HyphenMinus )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==HyphenMinus) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPipelineParser.g:1814:4: otherlv_0= HyphenMinus
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_20); 

                    				newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPipelineParser.g:1819:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) ) )
            // InternalPipelineParser.g:1820:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            {
            // InternalPipelineParser.g:1820:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING ) )
            // InternalPipelineParser.g:1821:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            {
            // InternalPipelineParser.g:1821:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_STRING )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_STRING) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalPipelineParser.g:1822:6: lv_name_1_1= RULE_ID
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
                    // InternalPipelineParser.g:1837:6: lv_name_1_2= RULE_STRING
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
    // InternalPipelineParser.g:1858:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalPipelineParser.g:1858:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalPipelineParser.g:1859:2: iv_ruleActivity= ruleActivity EOF
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
    // InternalPipelineParser.g:1865:1: ruleActivity returns [EObject current=null] : ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_1 = null;

        AntlrDatatypeRuleToken lv_name_0_2 = null;

        AntlrDatatypeRuleToken lv_name_0_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:1871:2: ( ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) ) )
            // InternalPipelineParser.g:1872:2: ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) )
            {
            // InternalPipelineParser.g:1872:2: ( ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) ) )
            // InternalPipelineParser.g:1873:3: ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) )
            {
            // InternalPipelineParser.g:1873:3: ( (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues ) )
            // InternalPipelineParser.g:1874:4: (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues )
            {
            // InternalPipelineParser.g:1874:4: (lv_name_0_1= ruleAnyData | lv_name_0_2= ruleArrayList | lv_name_0_3= ruleHyphenValues )
            int alt49=3;
            switch ( input.LA(1) ) {
            case RULE_COMPLEX_EXPRESSION:
            case RULE_HEX_INT:
            case RULE_INT:
            case RULE_FLOAT_LITERAL:
            case RULE_VERSION:
            case RULE_ID:
            case RULE_STRING:
                {
                alt49=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt49=2;
                }
                break;
            case HyphenMinus:
            case RULE_BEGIN:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalPipelineParser.g:1875:5: lv_name_0_1= ruleAnyData
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
                    // InternalPipelineParser.g:1891:5: lv_name_0_2= ruleArrayList
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
                    // InternalPipelineParser.g:1907:5: lv_name_0_3= ruleHyphenValues
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
    // InternalPipelineParser.g:1928:1: entryRuleStage returns [EObject current=null] : iv_ruleStage= ruleStage EOF ;
    public final EObject entryRuleStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStage = null;


        try {
            // InternalPipelineParser.g:1928:46: (iv_ruleStage= ruleStage EOF )
            // InternalPipelineParser.g:1929:2: iv_ruleStage= ruleStage EOF
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
    // InternalPipelineParser.g:1935:1: ruleStage returns [EObject current=null] : ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )? ) ;
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
            // InternalPipelineParser.g:1941:2: ( ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )? ) )
            // InternalPipelineParser.g:1942:2: ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )? )
            {
            // InternalPipelineParser.g:1942:2: ( (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )? )
            // InternalPipelineParser.g:1943:3: (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )?
            {
            // InternalPipelineParser.g:1943:3: (otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) ) )
            // InternalPipelineParser.g:1944:4: otherlv_0= HyphenMinus otherlv_1= Stage ( (lv_name_2_0= ruleAnyData ) )
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_47); 

            				newLeafNode(otherlv_0, grammarAccess.getStageAccess().getHyphenMinusKeyword_0_0());
            			
            otherlv_1=(Token)match(input,Stage,FOLLOW_33); 

            				newLeafNode(otherlv_1, grammarAccess.getStageAccess().getStageKeyword_0_1());
            			
            // InternalPipelineParser.g:1952:4: ( (lv_name_2_0= ruleAnyData ) )
            // InternalPipelineParser.g:1953:5: (lv_name_2_0= ruleAnyData )
            {
            // InternalPipelineParser.g:1953:5: (lv_name_2_0= ruleAnyData )
            // InternalPipelineParser.g:1954:6: lv_name_2_0= ruleAnyData
            {

            						newCompositeNode(grammarAccess.getStageAccess().getNameAnyDataParserRuleCall_0_2_0());
            					
            pushFollow(FOLLOW_48);
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

            // InternalPipelineParser.g:1972:3: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==IsSkippable||LA61_0==Condition||LA61_0==DependsOn||LA61_0==Variables||LA61_0==Jobs||LA61_0==Pool||LA61_0==RULE_BEGIN) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalPipelineParser.g:1973:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) )
                    {
                    // InternalPipelineParser.g:1973:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?) )
                    // InternalPipelineParser.g:1974:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    				
                    // InternalPipelineParser.g:1977:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?)
                    // InternalPipelineParser.g:1978:6: ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+ {...}?
                    {
                    // InternalPipelineParser.g:1978:6: ( ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=8;
                        int LA60_0 = input.LA(1);

                        if ( LA60_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0) ) {
                            alt60=1;
                        }
                        else if ( LA60_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1) ) {
                            alt60=2;
                        }
                        else if ( LA60_0 == Condition && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2) ) {
                            alt60=3;
                        }
                        else if ( LA60_0 == IsSkippable && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 3) ) {
                            alt60=4;
                        }
                        else if ( LA60_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 4) ) {
                            alt60=5;
                        }
                        else if ( LA60_0 == DependsOn && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 5) ) {
                            alt60=6;
                        }
                        else if ( LA60_0 == Jobs && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 6) ) {
                            alt60=7;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalPipelineParser.g:1979:4: ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:1979:4: ({...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) ) )
                    	    // InternalPipelineParser.g:1980:5: {...}? => ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0)");
                    	    }
                    	    // InternalPipelineParser.g:1980:102: ( ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) ) )
                    	    // InternalPipelineParser.g:1981:6: ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 0);
                    	    					
                    	    // InternalPipelineParser.g:1984:9: ({...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? ) )
                    	    // InternalPipelineParser.g:1984:10: {...}? => (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:1984:19: (this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )? )
                    	    // InternalPipelineParser.g:1984:20: this_BEGIN_4= RULE_BEGIN (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )?
                    	    {
                    	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

                    	    									newLeafNode(this_BEGIN_4, grammarAccess.getStageAccess().getBEGINTerminalRuleCall_1_0_0());
                    	    								
                    	    // InternalPipelineParser.g:1988:9: (otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) ) )?
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( (LA50_0==DisplayName) ) {
                    	        alt50=1;
                    	    }
                    	    switch (alt50) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:1989:10: otherlv_5= DisplayName ( (lv_displayName_6_0= RULE_STRING ) )
                    	            {
                    	            otherlv_5=(Token)match(input,DisplayName,FOLLOW_8); 

                    	            										newLeafNode(otherlv_5, grammarAccess.getStageAccess().getDisplayNameKeyword_1_0_1_0());
                    	            									
                    	            // InternalPipelineParser.g:1993:10: ( (lv_displayName_6_0= RULE_STRING ) )
                    	            // InternalPipelineParser.g:1994:11: (lv_displayName_6_0= RULE_STRING )
                    	            {
                    	            // InternalPipelineParser.g:1994:11: (lv_displayName_6_0= RULE_STRING )
                    	            // InternalPipelineParser.g:1995:12: lv_displayName_6_0= RULE_STRING
                    	            {
                    	            lv_displayName_6_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

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
                    	    // InternalPipelineParser.g:2018:4: ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:2018:4: ({...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) )
                    	    // InternalPipelineParser.g:2019:5: {...}? => ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1)");
                    	    }
                    	    // InternalPipelineParser.g:2019:102: ( ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) )
                    	    // InternalPipelineParser.g:2020:6: ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 1);
                    	    					
                    	    // InternalPipelineParser.g:2023:9: ({...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) )
                    	    // InternalPipelineParser.g:2023:10: {...}? => (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:2023:19: (otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
                    	    // InternalPipelineParser.g:2023:20: otherlv_7= Pool ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Pool,FOLLOW_50); 

                    	    									newLeafNode(otherlv_7, grammarAccess.getStageAccess().getPoolKeyword_1_1_0());
                    	    								
                    	    // InternalPipelineParser.g:2027:9: ( ( (lv_poolValue_8_0= ruleAnyData ) ) | ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) ) )
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( ((LA56_0>=RULE_COMPLEX_EXPRESSION && LA56_0<=RULE_VERSION)||LA56_0==RULE_ID||LA56_0==RULE_STRING) ) {
                    	        alt56=1;
                    	    }
                    	    else if ( (LA56_0==Demands||(LA56_0>=RULE_BEGIN && LA56_0<=RULE_END)) ) {
                    	        alt56=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 56, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:2028:10: ( (lv_poolValue_8_0= ruleAnyData ) )
                    	            {
                    	            // InternalPipelineParser.g:2028:10: ( (lv_poolValue_8_0= ruleAnyData ) )
                    	            // InternalPipelineParser.g:2029:11: (lv_poolValue_8_0= ruleAnyData )
                    	            {
                    	            // InternalPipelineParser.g:2029:11: (lv_poolValue_8_0= ruleAnyData )
                    	            // InternalPipelineParser.g:2030:12: lv_poolValue_8_0= ruleAnyData
                    	            {

                    	            												newCompositeNode(grammarAccess.getStageAccess().getPoolValueAnyDataParserRuleCall_1_1_1_0_0());
                    	            											
                    	            pushFollow(FOLLOW_48);
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
                    	            // InternalPipelineParser.g:2048:10: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) )
                    	            {
                    	            // InternalPipelineParser.g:2048:10: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) ) )
                    	            // InternalPipelineParser.g:2049:11: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) )
                    	            {
                    	            // InternalPipelineParser.g:2049:11: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?) )
                    	            // InternalPipelineParser.g:2050:12: ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?)
                    	            {
                    	             
                    	            											  getUnorderedGroupHelper().enter(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1());
                    	            											
                    	            // InternalPipelineParser.g:2053:12: ( ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?)
                    	            // InternalPipelineParser.g:2054:13: ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+ {...}?
                    	            {
                    	            // InternalPipelineParser.g:2054:13: ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+
                    	            int cnt55=0;
                    	            loop55:
                    	            do {
                    	                int alt55=3;
                    	                alt55 = dfa55.predict(input);
                    	                switch (alt55) {
                    	            	case 1 :
                    	            	    // InternalPipelineParser.g:2055:11: ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) )
                    	            	    {
                    	            	    // InternalPipelineParser.g:2055:11: ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) )
                    	            	    // InternalPipelineParser.g:2056:12: {...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) )
                    	            	    {
                    	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 0) ) {
                    	            	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 0)");
                    	            	    }
                    	            	    // InternalPipelineParser.g:2056:115: ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) )
                    	            	    // InternalPipelineParser.g:2057:13: ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) )
                    	            	    {

                    	            	    													getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 0);
                    	            	    												
                    	            	    // InternalPipelineParser.g:2060:16: ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) )
                    	            	    // InternalPipelineParser.g:2060:17: {...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? )
                    	            	    {
                    	            	    if ( !((true)) ) {
                    	            	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	            	    }
                    	            	    // InternalPipelineParser.g:2060:26: (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? )
                    	            	    // InternalPipelineParser.g:2060:27: this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )?
                    	            	    {
                    	            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

                    	            	    																newLeafNode(this_BEGIN_10, grammarAccess.getStageAccess().getBEGINTerminalRuleCall_1_1_1_1_0_0());
                    	            	    															
                    	            	    // InternalPipelineParser.g:2064:16: (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) )
                    	            	    // InternalPipelineParser.g:2065:17: otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) )
                    	            	    {
                    	            	    otherlv_11=(Token)match(input,Name,FOLLOW_3); 

                    	            	    																	newLeafNode(otherlv_11, grammarAccess.getStageAccess().getNameKeyword_1_1_1_1_0_1_0());
                    	            	    																
                    	            	    // InternalPipelineParser.g:2069:17: ( (lv_vmName_12_0= RULE_ID ) )
                    	            	    // InternalPipelineParser.g:2070:18: (lv_vmName_12_0= RULE_ID )
                    	            	    {
                    	            	    // InternalPipelineParser.g:2070:18: (lv_vmName_12_0= RULE_ID )
                    	            	    // InternalPipelineParser.g:2071:19: lv_vmName_12_0= RULE_ID
                    	            	    {
                    	            	    lv_vmName_12_0=(Token)match(input,RULE_ID,FOLLOW_51); 

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

                    	            	    // InternalPipelineParser.g:2088:16: (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )?
                    	            	    int alt52=2;
                    	            	    int LA52_0 = input.LA(1);

                    	            	    if ( (LA52_0==VmImage) ) {
                    	            	        alt52=1;
                    	            	    }
                    	            	    switch (alt52) {
                    	            	        case 1 :
                    	            	            // InternalPipelineParser.g:2089:17: otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) )
                    	            	            {
                    	            	            otherlv_13=(Token)match(input,VmImage,FOLLOW_20); 

                    	            	            																	newLeafNode(otherlv_13, grammarAccess.getStageAccess().getVmImageKeyword_1_1_1_1_0_2_0());
                    	            	            																
                    	            	            // InternalPipelineParser.g:2093:17: ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) )
                    	            	            // InternalPipelineParser.g:2094:18: ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) )
                    	            	            {
                    	            	            // InternalPipelineParser.g:2094:18: ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) )
                    	            	            // InternalPipelineParser.g:2095:19: (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING )
                    	            	            {
                    	            	            // InternalPipelineParser.g:2095:19: (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING )
                    	            	            int alt51=2;
                    	            	            int LA51_0 = input.LA(1);

                    	            	            if ( (LA51_0==RULE_ID) ) {
                    	            	                alt51=1;
                    	            	            }
                    	            	            else if ( (LA51_0==RULE_STRING) ) {
                    	            	                alt51=2;
                    	            	            }
                    	            	            else {
                    	            	                NoViableAltException nvae =
                    	            	                    new NoViableAltException("", 51, 0, input);

                    	            	                throw nvae;
                    	            	            }
                    	            	            switch (alt51) {
                    	            	                case 1 :
                    	            	                    // InternalPipelineParser.g:2096:20: lv_vmImage_14_1= RULE_ID
                    	            	                    {
                    	            	                    lv_vmImage_14_1=(Token)match(input,RULE_ID,FOLLOW_52); 

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
                    	            	                    // InternalPipelineParser.g:2111:20: lv_vmImage_14_2= RULE_STRING
                    	            	                    {
                    	            	                    lv_vmImage_14_2=(Token)match(input,RULE_STRING,FOLLOW_52); 

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
                    	            	    // InternalPipelineParser.g:2135:11: ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) )
                    	            	    {
                    	            	    // InternalPipelineParser.g:2135:11: ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) )
                    	            	    // InternalPipelineParser.g:2136:12: {...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) )
                    	            	    {
                    	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 1) ) {
                    	            	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 1)");
                    	            	    }
                    	            	    // InternalPipelineParser.g:2136:115: ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) )
                    	            	    // InternalPipelineParser.g:2137:13: ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) )
                    	            	    {

                    	            	    													getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 1);
                    	            	    												
                    	            	    // InternalPipelineParser.g:2140:16: ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) )
                    	            	    // InternalPipelineParser.g:2140:17: {...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END )
                    	            	    {
                    	            	    if ( !((true)) ) {
                    	            	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	            	    }
                    	            	    // InternalPipelineParser.g:2140:26: ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END )
                    	            	    // InternalPipelineParser.g:2140:27: (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END
                    	            	    {
                    	            	    // InternalPipelineParser.g:2140:27: (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )?
                    	            	    int alt54=2;
                    	            	    int LA54_0 = input.LA(1);

                    	            	    if ( (LA54_0==Demands) ) {
                    	            	        alt54=1;
                    	            	    }
                    	            	    switch (alt54) {
                    	            	        case 1 :
                    	            	            // InternalPipelineParser.g:2141:17: otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) )
                    	            	            {
                    	            	            otherlv_15=(Token)match(input,Demands,FOLLOW_22); 

                    	            	            																	newLeafNode(otherlv_15, grammarAccess.getStageAccess().getDemandsKeyword_1_1_1_1_1_0_0());
                    	            	            																
                    	            	            // InternalPipelineParser.g:2145:17: ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) )
                    	            	            // InternalPipelineParser.g:2146:18: ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) )
                    	            	            {
                    	            	            // InternalPipelineParser.g:2146:18: ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) )
                    	            	            // InternalPipelineParser.g:2147:19: (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues )
                    	            	            {
                    	            	            // InternalPipelineParser.g:2147:19: (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues )
                    	            	            int alt53=2;
                    	            	            int LA53_0 = input.LA(1);

                    	            	            if ( ((LA53_0>=RULE_COMPLEX_EXPRESSION && LA53_0<=RULE_VERSION)||LA53_0==RULE_ID||LA53_0==RULE_STRING) ) {
                    	            	                alt53=1;
                    	            	            }
                    	            	            else if ( (LA53_0==HyphenMinus||LA53_0==RULE_BEGIN) ) {
                    	            	                alt53=2;
                    	            	            }
                    	            	            else {
                    	            	                NoViableAltException nvae =
                    	            	                    new NoViableAltException("", 53, 0, input);

                    	            	                throw nvae;
                    	            	            }
                    	            	            switch (alt53) {
                    	            	                case 1 :
                    	            	                    // InternalPipelineParser.g:2148:20: lv_vmDemands_16_1= ruleAnyData
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
                    	            	                    // InternalPipelineParser.g:2164:20: lv_vmDemands_16_2= ruleHyphenValues
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

                    	            	    this_END_17=(Token)match(input,RULE_END,FOLLOW_52); 

                    	            	    																newLeafNode(this_END_17, grammarAccess.getStageAccess().getENDTerminalRuleCall_1_1_1_1_1_1());
                    	            	    															

                    	            	    }


                    	            	    }

                    	            	     
                    	            	    													getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1());
                    	            	    												

                    	            	    }


                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt55 >= 1 ) break loop55;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(55, input);
                    	                        throw eee;
                    	                }
                    	                cnt55++;
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
                    	    // InternalPipelineParser.g:2208:4: ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:2208:4: ({...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) ) )
                    	    // InternalPipelineParser.g:2209:5: {...}? => ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2)");
                    	    }
                    	    // InternalPipelineParser.g:2209:102: ( ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) ) )
                    	    // InternalPipelineParser.g:2210:6: ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 2);
                    	    					
                    	    // InternalPipelineParser.g:2213:9: ({...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) ) )
                    	    // InternalPipelineParser.g:2213:10: {...}? => (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:2213:19: (otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) ) )
                    	    // InternalPipelineParser.g:2213:20: otherlv_18= Condition ( (lv_conditionValue_19_0= ruleAnyData ) )
                    	    {
                    	    otherlv_18=(Token)match(input,Condition,FOLLOW_33); 

                    	    									newLeafNode(otherlv_18, grammarAccess.getStageAccess().getConditionKeyword_1_2_0());
                    	    								
                    	    // InternalPipelineParser.g:2217:9: ( (lv_conditionValue_19_0= ruleAnyData ) )
                    	    // InternalPipelineParser.g:2218:10: (lv_conditionValue_19_0= ruleAnyData )
                    	    {
                    	    // InternalPipelineParser.g:2218:10: (lv_conditionValue_19_0= ruleAnyData )
                    	    // InternalPipelineParser.g:2219:11: lv_conditionValue_19_0= ruleAnyData
                    	    {

                    	    											newCompositeNode(grammarAccess.getStageAccess().getConditionValueAnyDataParserRuleCall_1_2_1_0());
                    	    										
                    	    pushFollow(FOLLOW_48);
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
                    	    // InternalPipelineParser.g:2242:4: ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:2242:4: ({...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) ) )
                    	    // InternalPipelineParser.g:2243:5: {...}? => ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 3)");
                    	    }
                    	    // InternalPipelineParser.g:2243:102: ( ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) ) )
                    	    // InternalPipelineParser.g:2244:6: ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 3);
                    	    					
                    	    // InternalPipelineParser.g:2247:9: ({...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) ) )
                    	    // InternalPipelineParser.g:2247:10: {...}? => (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:2247:19: (otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) ) )
                    	    // InternalPipelineParser.g:2247:20: otherlv_20= IsSkippable ( (lv_isSkippable_21_0= RULE_ID ) )
                    	    {
                    	    otherlv_20=(Token)match(input,IsSkippable,FOLLOW_3); 

                    	    									newLeafNode(otherlv_20, grammarAccess.getStageAccess().getIsSkippableKeyword_1_3_0());
                    	    								
                    	    // InternalPipelineParser.g:2251:9: ( (lv_isSkippable_21_0= RULE_ID ) )
                    	    // InternalPipelineParser.g:2252:10: (lv_isSkippable_21_0= RULE_ID )
                    	    {
                    	    // InternalPipelineParser.g:2252:10: (lv_isSkippable_21_0= RULE_ID )
                    	    // InternalPipelineParser.g:2253:11: lv_isSkippable_21_0= RULE_ID
                    	    {
                    	    lv_isSkippable_21_0=(Token)match(input,RULE_ID,FOLLOW_48); 

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
                    	    // InternalPipelineParser.g:2275:4: ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:2275:4: ({...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) ) )
                    	    // InternalPipelineParser.g:2276:5: {...}? => ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 4)");
                    	    }
                    	    // InternalPipelineParser.g:2276:102: ( ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) ) )
                    	    // InternalPipelineParser.g:2277:6: ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 4);
                    	    					
                    	    // InternalPipelineParser.g:2280:9: ({...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* ) )
                    	    // InternalPipelineParser.g:2280:10: {...}? => (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:2280:19: (otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )* )
                    	    // InternalPipelineParser.g:2280:20: otherlv_22= Variables ( (lv_stageVariables_23_0= ruleVariable ) )*
                    	    {
                    	    otherlv_22=(Token)match(input,Variables,FOLLOW_53); 

                    	    									newLeafNode(otherlv_22, grammarAccess.getStageAccess().getVariablesKeyword_1_4_0());
                    	    								
                    	    // InternalPipelineParser.g:2284:9: ( (lv_stageVariables_23_0= ruleVariable ) )*
                    	    loop57:
                    	    do {
                    	        int alt57=2;
                    	        int LA57_0 = input.LA(1);

                    	        if ( (LA57_0==HyphenMinus) ) {
                    	            int LA57_2 = input.LA(2);

                    	            if ( (LA57_2==Group||LA57_2==Name) ) {
                    	                alt57=1;
                    	            }


                    	        }
                    	        else if ( (LA57_0==RULE_BEGIN) ) {
                    	            int LA57_3 = input.LA(2);

                    	            if ( (LA57_3==HyphenMinus) ) {
                    	                int LA57_5 = input.LA(3);

                    	                if ( (LA57_5==RULE_COMPLEX_EXPRESSION||LA57_5==RULE_ID) ) {
                    	                    alt57=1;
                    	                }


                    	            }
                    	            else if ( (LA57_3==RULE_COMPLEX_EXPRESSION||LA57_3==RULE_ID) ) {
                    	                alt57=1;
                    	            }


                    	        }


                    	        switch (alt57) {
                    	    	case 1 :
                    	    	    // InternalPipelineParser.g:2285:10: (lv_stageVariables_23_0= ruleVariable )
                    	    	    {
                    	    	    // InternalPipelineParser.g:2285:10: (lv_stageVariables_23_0= ruleVariable )
                    	    	    // InternalPipelineParser.g:2286:11: lv_stageVariables_23_0= ruleVariable
                    	    	    {

                    	    	    											newCompositeNode(grammarAccess.getStageAccess().getStageVariablesVariableParserRuleCall_1_4_1_0());
                    	    	    										
                    	    	    pushFollow(FOLLOW_53);
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
                    	    	    break loop57;
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
                    	    // InternalPipelineParser.g:2309:4: ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:2309:4: ({...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) ) )
                    	    // InternalPipelineParser.g:2310:5: {...}? => ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 5)");
                    	    }
                    	    // InternalPipelineParser.g:2310:102: ( ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) ) )
                    	    // InternalPipelineParser.g:2311:6: ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 5);
                    	    					
                    	    // InternalPipelineParser.g:2314:9: ({...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* ) )
                    	    // InternalPipelineParser.g:2314:10: {...}? => (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:2314:19: (otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )* )
                    	    // InternalPipelineParser.g:2314:20: otherlv_24= DependsOn ( (otherlv_25= RULE_ID ) )*
                    	    {
                    	    otherlv_24=(Token)match(input,DependsOn,FOLLOW_54); 

                    	    									newLeafNode(otherlv_24, grammarAccess.getStageAccess().getDependsOnKeyword_1_5_0());
                    	    								
                    	    // InternalPipelineParser.g:2318:9: ( (otherlv_25= RULE_ID ) )*
                    	    loop58:
                    	    do {
                    	        int alt58=2;
                    	        int LA58_0 = input.LA(1);

                    	        if ( (LA58_0==RULE_ID) ) {
                    	            alt58=1;
                    	        }


                    	        switch (alt58) {
                    	    	case 1 :
                    	    	    // InternalPipelineParser.g:2319:10: (otherlv_25= RULE_ID )
                    	    	    {
                    	    	    // InternalPipelineParser.g:2319:10: (otherlv_25= RULE_ID )
                    	    	    // InternalPipelineParser.g:2320:11: otherlv_25= RULE_ID
                    	    	    {

                    	    	    											if (current==null) {
                    	    	    												current = createModelElement(grammarAccess.getStageRule());
                    	    	    											}
                    	    	    										
                    	    	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_54); 

                    	    	    											newLeafNode(otherlv_25, grammarAccess.getStageAccess().getDependsOnStageCrossReference_1_5_1_0());
                    	    	    										

                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop58;
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
                    	    // InternalPipelineParser.g:2337:4: ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) )
                    	    {
                    	    // InternalPipelineParser.g:2337:4: ({...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) ) )
                    	    // InternalPipelineParser.g:2338:5: {...}? => ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1(), 6)");
                    	    }
                    	    // InternalPipelineParser.g:2338:102: ( ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) ) )
                    	    // InternalPipelineParser.g:2339:6: ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getStageAccess().getUnorderedGroup_1(), 6);
                    	    					
                    	    // InternalPipelineParser.g:2342:9: ({...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END ) )
                    	    // InternalPipelineParser.g:2342:10: {...}? => ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleStage", "true");
                    	    }
                    	    // InternalPipelineParser.g:2342:19: ( (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END )
                    	    // InternalPipelineParser.g:2342:20: (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* ) this_END_28= RULE_END
                    	    {
                    	    // InternalPipelineParser.g:2342:20: (otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )* )
                    	    // InternalPipelineParser.g:2343:10: otherlv_26= Jobs ( (lv_jobs_27_0= ruleJob ) )*
                    	    {
                    	    otherlv_26=(Token)match(input,Jobs,FOLLOW_27); 

                    	    										newLeafNode(otherlv_26, grammarAccess.getStageAccess().getJobsKeyword_1_6_0_0());
                    	    									
                    	    // InternalPipelineParser.g:2347:10: ( (lv_jobs_27_0= ruleJob ) )*
                    	    loop59:
                    	    do {
                    	        int alt59=2;
                    	        int LA59_0 = input.LA(1);

                    	        if ( (LA59_0==HyphenMinus||LA59_0==RULE_ID||LA59_0==RULE_STRING) ) {
                    	            alt59=1;
                    	        }


                    	        switch (alt59) {
                    	    	case 1 :
                    	    	    // InternalPipelineParser.g:2348:11: (lv_jobs_27_0= ruleJob )
                    	    	    {
                    	    	    // InternalPipelineParser.g:2348:11: (lv_jobs_27_0= ruleJob )
                    	    	    // InternalPipelineParser.g:2349:12: lv_jobs_27_0= ruleJob
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getStageAccess().getJobsJobParserRuleCall_1_6_0_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_27);
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
                    	    	    break loop59;
                    	        }
                    	    } while (true);


                    	    }

                    	    this_END_28=(Token)match(input,RULE_END,FOLLOW_48); 

                    	    									newLeafNode(this_END_28, grammarAccess.getStageAccess().getENDTerminalRuleCall_1_6_1());
                    	    								

                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStageAccess().getUnorderedGroup_1());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
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
    // InternalPipelineParser.g:2389:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalPipelineParser.g:2389:44: (iv_ruleJob= ruleJob EOF )
            // InternalPipelineParser.g:2390:2: iv_ruleJob= ruleJob EOF
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
    // InternalPipelineParser.g:2396:1: ruleJob returns [EObject current=null] : ( ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) ) ) ;
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
            // InternalPipelineParser.g:2402:2: ( ( ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) ) ) )
            // InternalPipelineParser.g:2403:2: ( ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalPipelineParser.g:2403:2: ( ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalPipelineParser.g:2404:3: ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? ) ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalPipelineParser.g:2404:3: ( (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )? )
            // InternalPipelineParser.g:2405:4: (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )? ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= Colon )?
            {
            // InternalPipelineParser.g:2405:4: (otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==HyphenMinus) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalPipelineParser.g:2406:5: otherlv_0= HyphenMinus (otherlv_1= Job | otherlv_2= Deployment )
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_55); 

                    					newLeafNode(otherlv_0, grammarAccess.getJobAccess().getHyphenMinusKeyword_0_0_0());
                    				
                    // InternalPipelineParser.g:2410:5: (otherlv_1= Job | otherlv_2= Deployment )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==Job) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==Deployment) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalPipelineParser.g:2411:6: otherlv_1= Job
                            {
                            otherlv_1=(Token)match(input,Job,FOLLOW_20); 

                            						newLeafNode(otherlv_1, grammarAccess.getJobAccess().getJobKeyword_0_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:2416:6: otherlv_2= Deployment
                            {
                            otherlv_2=(Token)match(input,Deployment,FOLLOW_20); 

                            						newLeafNode(otherlv_2, grammarAccess.getJobAccess().getDeploymentKeyword_0_0_1_1());
                            					

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:2422:4: ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) )
            // InternalPipelineParser.g:2423:5: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            {
            // InternalPipelineParser.g:2423:5: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            // InternalPipelineParser.g:2424:6: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
            {
            // InternalPipelineParser.g:2424:6: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_STRING) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalPipelineParser.g:2425:7: lv_name_3_1= RULE_ID
                    {
                    lv_name_3_1=(Token)match(input,RULE_ID,FOLLOW_56); 

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
                    // InternalPipelineParser.g:2440:7: lv_name_3_2= RULE_STRING
                    {
                    lv_name_3_2=(Token)match(input,RULE_STRING,FOLLOW_56); 

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

            // InternalPipelineParser.g:2457:4: (otherlv_4= Colon )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Colon) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalPipelineParser.g:2458:5: otherlv_4= Colon
                    {
                    otherlv_4=(Token)match(input,Colon,FOLLOW_57); 

                    					newLeafNode(otherlv_4, grammarAccess.getJobAccess().getColonKeyword_0_2());
                    				

                    }
                    break;

            }


            }

            // InternalPipelineParser.g:2464:3: ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalPipelineParser.g:2465:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalPipelineParser.g:2465:4: ( ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?) )
            // InternalPipelineParser.g:2466:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_1());
            				
            // InternalPipelineParser.g:2469:5: ( ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?)
            // InternalPipelineParser.g:2470:6: ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalPipelineParser.g:2470:6: ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+
            int cnt74=0;
            loop74:
            do {
                int alt74=4;
                alt74 = dfa74.predict(input);
                switch (alt74) {
            	case 1 :
            	    // InternalPipelineParser.g:2471:4: ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // InternalPipelineParser.g:2471:4: ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) )
            	    // InternalPipelineParser.g:2472:5: {...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalPipelineParser.g:2472:100: ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) )
            	    // InternalPipelineParser.g:2473:6: ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalPipelineParser.g:2476:9: ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) )
            	    // InternalPipelineParser.g:2476:10: {...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalPipelineParser.g:2476:19: (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? )
            	    // InternalPipelineParser.g:2476:20: this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )?
            	    {
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_58); 

            	    									newLeafNode(this_BEGIN_6, grammarAccess.getJobAccess().getBEGINTerminalRuleCall_1_0_0());
            	    								
            	    // InternalPipelineParser.g:2480:9: ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==Name) ) {
            	        int LA67_1 = input.LA(2);

            	        if ( (LA67_1==RULE_STRING) ) {
            	            alt67=1;
            	        }
            	    }
            	    else if ( (LA67_0==DisplayName) ) {
            	        int LA67_2 = input.LA(2);

            	        if ( (LA67_2==RULE_STRING) ) {
            	            alt67=1;
            	        }
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalPipelineParser.g:2481:10: ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) )
            	            {
            	            // InternalPipelineParser.g:2481:10: ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) )
            	            // InternalPipelineParser.g:2482:11: ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) )
            	            {
            	            // InternalPipelineParser.g:2482:11: ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) )
            	            // InternalPipelineParser.g:2483:12: (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName )
            	            {
            	            // InternalPipelineParser.g:2483:12: (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName )
            	            int alt66=2;
            	            int LA66_0 = input.LA(1);

            	            if ( (LA66_0==Name) ) {
            	                alt66=1;
            	            }
            	            else if ( (LA66_0==DisplayName) ) {
            	                alt66=2;
            	            }
            	            else {
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 66, 0, input);

            	                throw nvae;
            	            }
            	            switch (alt66) {
            	                case 1 :
            	                    // InternalPipelineParser.g:2484:13: lv_nameKW_7_1= Name
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
            	                    // InternalPipelineParser.g:2495:13: lv_nameKW_7_2= DisplayName
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

            	            // InternalPipelineParser.g:2508:10: ( (lv_jobName_8_0= RULE_STRING ) )
            	            // InternalPipelineParser.g:2509:11: (lv_jobName_8_0= RULE_STRING )
            	            {
            	            // InternalPipelineParser.g:2509:11: (lv_jobName_8_0= RULE_STRING )
            	            // InternalPipelineParser.g:2510:12: lv_jobName_8_0= RULE_STRING
            	            {
            	            lv_jobName_8_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

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
            	    // InternalPipelineParser.g:2533:4: ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) )
            	    {
            	    // InternalPipelineParser.g:2533:4: ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) )
            	    // InternalPipelineParser.g:2534:5: {...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalPipelineParser.g:2534:100: ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) )
            	    // InternalPipelineParser.g:2535:6: ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalPipelineParser.g:2538:9: ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) )
            	    // InternalPipelineParser.g:2538:10: {...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalPipelineParser.g:2538:19: ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) )
            	    // InternalPipelineParser.g:2538:20: ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) )
            	    {
            	    // InternalPipelineParser.g:2538:20: ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) )
            	    // InternalPipelineParser.g:2539:10: ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) )
            	    {
            	    // InternalPipelineParser.g:2539:10: ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) )
            	    // InternalPipelineParser.g:2540:11: (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn )
            	    {
            	    // InternalPipelineParser.g:2540:11: (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==Needs) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==DependsOn) ) {
            	        alt68=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalPipelineParser.g:2541:12: lv_dependKW_9_1= Needs
            	            {
            	            lv_dependKW_9_1=(Token)match(input,Needs,FOLLOW_59); 

            	            												newLeafNode(lv_dependKW_9_1, grammarAccess.getJobAccess().getDependKWNeedsKeyword_1_1_0_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getJobRule());
            	            												}
            	            												setWithLastConsumed(current, "dependKW", lv_dependKW_9_1, null);
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:2552:12: lv_dependKW_9_2= DependsOn
            	            {
            	            lv_dependKW_9_2=(Token)match(input,DependsOn,FOLLOW_59); 

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

            	    // InternalPipelineParser.g:2565:9: ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) )
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==RULE_ID) ) {
            	        alt70=1;
            	    }
            	    else if ( (LA70_0==LeftSquareBracket) ) {
            	        alt70=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 70, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalPipelineParser.g:2566:10: ( (otherlv_10= RULE_ID ) )
            	            {
            	            // InternalPipelineParser.g:2566:10: ( (otherlv_10= RULE_ID ) )
            	            // InternalPipelineParser.g:2567:11: (otherlv_10= RULE_ID )
            	            {
            	            // InternalPipelineParser.g:2567:11: (otherlv_10= RULE_ID )
            	            // InternalPipelineParser.g:2568:12: otherlv_10= RULE_ID
            	            {

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getJobRule());
            	            												}
            	            											
            	            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_58); 

            	            												newLeafNode(otherlv_10, grammarAccess.getJobAccess().getReferencesJobCrossReference_1_1_1_0_0());
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPipelineParser.g:2580:10: (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket )
            	            {
            	            // InternalPipelineParser.g:2580:10: (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket )
            	            // InternalPipelineParser.g:2581:11: otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket
            	            {
            	            otherlv_11=(Token)match(input,LeftSquareBracket,FOLLOW_3); 

            	            											newLeafNode(otherlv_11, grammarAccess.getJobAccess().getLeftSquareBracketKeyword_1_1_1_1_0());
            	            										
            	            // InternalPipelineParser.g:2585:11: ( (otherlv_12= RULE_ID ) )
            	            // InternalPipelineParser.g:2586:12: (otherlv_12= RULE_ID )
            	            {
            	            // InternalPipelineParser.g:2586:12: (otherlv_12= RULE_ID )
            	            // InternalPipelineParser.g:2587:13: otherlv_12= RULE_ID
            	            {

            	            													if (current==null) {
            	            														current = createModelElement(grammarAccess.getJobRule());
            	            													}
            	            												
            	            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_60); 

            	            													newLeafNode(otherlv_12, grammarAccess.getJobAccess().getReferencesJobCrossReference_1_1_1_1_1_0());
            	            												

            	            }


            	            }

            	            // InternalPipelineParser.g:2598:11: (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )*
            	            loop69:
            	            do {
            	                int alt69=2;
            	                int LA69_0 = input.LA(1);

            	                if ( (LA69_0==Comma) ) {
            	                    alt69=1;
            	                }


            	                switch (alt69) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:2599:12: otherlv_13= Comma ( (otherlv_14= RULE_ID ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,Comma,FOLLOW_3); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getJobAccess().getCommaKeyword_1_1_1_1_2_0());
            	            	    											
            	            	    // InternalPipelineParser.g:2603:12: ( (otherlv_14= RULE_ID ) )
            	            	    // InternalPipelineParser.g:2604:13: (otherlv_14= RULE_ID )
            	            	    {
            	            	    // InternalPipelineParser.g:2604:13: (otherlv_14= RULE_ID )
            	            	    // InternalPipelineParser.g:2605:14: otherlv_14= RULE_ID
            	            	    {

            	            	    														if (current==null) {
            	            	    															current = createModelElement(grammarAccess.getJobRule());
            	            	    														}
            	            	    													
            	            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_60); 

            	            	    														newLeafNode(otherlv_14, grammarAccess.getJobAccess().getReferencesJobCrossReference_1_1_1_1_2_1_0());
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop69;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,RightSquareBracket,FOLLOW_58); 

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
            	    // InternalPipelineParser.g:2629:4: ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) )
            	    {
            	    // InternalPipelineParser.g:2629:4: ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) )
            	    // InternalPipelineParser.g:2630:5: {...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalPipelineParser.g:2630:100: ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) )
            	    // InternalPipelineParser.g:2631:6: ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalPipelineParser.g:2634:9: ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) )
            	    // InternalPipelineParser.g:2634:10: {...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalPipelineParser.g:2634:19: ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END )
            	    // InternalPipelineParser.g:2634:20: ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END
            	    {
            	    // InternalPipelineParser.g:2634:20: ( (lv_jobParameterValues_16_0= ruleJobParameter ) )*
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);

            	        if ( (LA71_0==Steps) ) {
            	            int LA71_1 = input.LA(2);

            	            if ( (LA71_1==LeftSquareBracket||(LA71_1>=RULE_COMPLEX_EXPRESSION && LA71_1<=RULE_BEGIN)||LA71_1==RULE_ID||LA71_1==RULE_STRING) ) {
            	                alt71=1;
            	            }


            	        }
            	        else if ( (LA71_0==Repository_dispatch||(LA71_0>=ContinueOnError_1 && LA71_0<=Pull_request)||(LA71_0>=Requirements && LA71_0<=Environment)||(LA71_0>=Permissions && LA71_0<=Conditions)||LA71_0==Deployment||LA71_0==Parameters||(LA71_0>=Repository && LA71_0<=Endpoints)||(LA71_0>=FailFast && LA71_0<=RunPolicy)||(LA71_0>=Variables && LA71_0<=Checkout)||LA71_0==Defaults||LA71_0==MaxTime||(LA71_0>=Parallel && LA71_0<=PreBuild)||(LA71_0>=RunName && LA71_0<=Timeouts)||(LA71_0>=Command && LA71_0<=Default)||(LA71_0>=Exclude && LA71_0<=Project)||(LA71_0>=Release && LA71_0<=VmImage)||(LA71_0>=Caches && LA71_0<=Docker)||(LA71_0>=Except && LA71_0<=Agent)||(LA71_0>=Cache && LA71_0<=Final)||(LA71_0>=Image && LA71_0<=Stage)||LA71_0==Tasks||LA71_0==Auth||LA71_0==Cron||(LA71_0>=Name && LA71_0<=Only)||(LA71_0>=Plan && LA71_0<=Push)||(LA71_0>=Step && LA71_0<=With)||(LA71_0>=Env && LA71_0<=Jdk)||(LA71_0>=Run && LA71_0<=On)||LA71_0==RULE_ID) ) {
            	            alt71=1;
            	        }


            	        switch (alt71) {
            	    	case 1 :
            	    	    // InternalPipelineParser.g:2635:10: (lv_jobParameterValues_16_0= ruleJobParameter )
            	    	    {
            	    	    // InternalPipelineParser.g:2635:10: (lv_jobParameterValues_16_0= ruleJobParameter )
            	    	    // InternalPipelineParser.g:2636:11: lv_jobParameterValues_16_0= ruleJobParameter
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getJobAccess().getJobParameterValuesJobParameterParserRuleCall_1_2_0_0());
            	    	    										
            	    	    pushFollow(FOLLOW_61);
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
            	    	    break loop71;
            	        }
            	    } while (true);

            	    // InternalPipelineParser.g:2653:9: (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )?
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==Steps) ) {
            	        alt73=1;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalPipelineParser.g:2654:10: otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )*
            	            {
            	            otherlv_17=(Token)match(input,Steps,FOLLOW_28); 

            	            										newLeafNode(otherlv_17, grammarAccess.getJobAccess().getStepsKeyword_1_2_1_0());
            	            									
            	            // InternalPipelineParser.g:2658:10: ( (lv_steps_18_0= ruleStep ) )*
            	            loop72:
            	            do {
            	                int alt72=2;
            	                int LA72_0 = input.LA(1);

            	                if ( (LA72_0==HyphenMinus) ) {
            	                    alt72=1;
            	                }


            	                switch (alt72) {
            	            	case 1 :
            	            	    // InternalPipelineParser.g:2659:11: (lv_steps_18_0= ruleStep )
            	            	    {
            	            	    // InternalPipelineParser.g:2659:11: (lv_steps_18_0= ruleStep )
            	            	    // InternalPipelineParser.g:2660:12: lv_steps_18_0= ruleStep
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_1_2_1_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_28);
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
            	            	    break loop72;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    this_END_19=(Token)match(input,RULE_END,FOLLOW_58); 

            	    									newLeafNode(this_END_19, grammarAccess.getJobAccess().getENDTerminalRuleCall_1_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
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
    // InternalPipelineParser.g:2700:1: entryRuleJobParameter returns [EObject current=null] : iv_ruleJobParameter= ruleJobParameter EOF ;
    public final EObject entryRuleJobParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJobParameter = null;


        try {
            // InternalPipelineParser.g:2700:53: (iv_ruleJobParameter= ruleJobParameter EOF )
            // InternalPipelineParser.g:2701:2: iv_ruleJobParameter= ruleJobParameter EOF
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
    // InternalPipelineParser.g:2707:1: ruleJobParameter returns [EObject current=null] : ( ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) ) ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) ) ) ;
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
            // InternalPipelineParser.g:2713:2: ( ( ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) ) ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) ) ) )
            // InternalPipelineParser.g:2714:2: ( ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) ) ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) ) )
            {
            // InternalPipelineParser.g:2714:2: ( ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) ) ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) ) )
            // InternalPipelineParser.g:2715:3: ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) ) ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) )
            {
            // InternalPipelineParser.g:2715:3: ( ( (lv_name_0_0= rulePipelineKeyword ) ) | ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==Repository_dispatch||(LA75_0>=ContinueOnError_1 && LA75_0<=Pull_request)||(LA75_0>=Requirements && LA75_0<=Environment)||(LA75_0>=Permissions && LA75_0<=Conditions)||LA75_0==Deployment||LA75_0==Parameters||(LA75_0>=Repository && LA75_0<=Endpoints)||(LA75_0>=FailFast && LA75_0<=RunPolicy)||(LA75_0>=Variables && LA75_0<=Checkout)||LA75_0==Defaults||LA75_0==MaxTime||(LA75_0>=Parallel && LA75_0<=PreBuild)||(LA75_0>=RunName && LA75_0<=Timeouts)||(LA75_0>=Command && LA75_0<=Default)||(LA75_0>=Exclude && LA75_0<=Project)||(LA75_0>=Release && LA75_0<=VmImage)||(LA75_0>=Caches && LA75_0<=Docker)||(LA75_0>=Except && LA75_0<=Agent)||(LA75_0>=Cache && LA75_0<=Final)||(LA75_0>=Image && LA75_0<=Tasks)||LA75_0==Auth||LA75_0==Cron||(LA75_0>=Name && LA75_0<=Only)||(LA75_0>=Plan && LA75_0<=Push)||(LA75_0>=Step && LA75_0<=With)||(LA75_0>=Env && LA75_0<=Jdk)||(LA75_0>=Run && LA75_0<=On)) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalPipelineParser.g:2716:4: ( (lv_name_0_0= rulePipelineKeyword ) )
                    {
                    // InternalPipelineParser.g:2716:4: ( (lv_name_0_0= rulePipelineKeyword ) )
                    // InternalPipelineParser.g:2717:5: (lv_name_0_0= rulePipelineKeyword )
                    {
                    // InternalPipelineParser.g:2717:5: (lv_name_0_0= rulePipelineKeyword )
                    // InternalPipelineParser.g:2718:6: lv_name_0_0= rulePipelineKeyword
                    {

                    						newCompositeNode(grammarAccess.getJobParameterAccess().getNamePipelineKeywordEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_62);
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
                    // InternalPipelineParser.g:2736:4: ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon )
                    {
                    // InternalPipelineParser.g:2736:4: ( ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon )
                    // InternalPipelineParser.g:2737:5: ( (lv_otherName_1_0= RULE_ID ) ) otherlv_2= Colon
                    {
                    // InternalPipelineParser.g:2737:5: ( (lv_otherName_1_0= RULE_ID ) )
                    // InternalPipelineParser.g:2738:6: (lv_otherName_1_0= RULE_ID )
                    {
                    // InternalPipelineParser.g:2738:6: (lv_otherName_1_0= RULE_ID )
                    // InternalPipelineParser.g:2739:7: lv_otherName_1_0= RULE_ID
                    {
                    lv_otherName_1_0=(Token)match(input,RULE_ID,FOLLOW_63); 

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

                    otherlv_2=(Token)match(input,Colon,FOLLOW_62); 

                    					newLeafNode(otherlv_2, grammarAccess.getJobParameterAccess().getColonKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalPipelineParser.g:2761:3: ( ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) ) | (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==LeftSquareBracket||(LA78_0>=RULE_COMPLEX_EXPRESSION && LA78_0<=RULE_VERSION)||LA78_0==RULE_ID||LA78_0==RULE_STRING) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_BEGIN) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalPipelineParser.g:2762:4: ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) )
                    {
                    // InternalPipelineParser.g:2762:4: ( ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) ) )
                    // InternalPipelineParser.g:2763:5: ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) )
                    {
                    // InternalPipelineParser.g:2763:5: ( (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList ) )
                    // InternalPipelineParser.g:2764:6: (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList )
                    {
                    // InternalPipelineParser.g:2764:6: (lv_value_3_1= ruleAnyData | lv_value_3_2= ruleArrayList )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( ((LA76_0>=RULE_COMPLEX_EXPRESSION && LA76_0<=RULE_VERSION)||LA76_0==RULE_ID||LA76_0==RULE_STRING) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==LeftSquareBracket) ) {
                        alt76=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalPipelineParser.g:2765:7: lv_value_3_1= ruleAnyData
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
                            // InternalPipelineParser.g:2781:7: lv_value_3_2= ruleArrayList
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
                    // InternalPipelineParser.g:2800:4: (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:2800:4: (this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END )
                    // InternalPipelineParser.g:2801:5: this_BEGIN_4= RULE_BEGIN ( (lv_subParameters_5_0= ruleJobParameter ) )+ this_END_6= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_64); 

                    					newLeafNode(this_BEGIN_4, grammarAccess.getJobParameterAccess().getBEGINTerminalRuleCall_1_1_0());
                    				
                    // InternalPipelineParser.g:2805:5: ( (lv_subParameters_5_0= ruleJobParameter ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==Repository_dispatch||(LA77_0>=ContinueOnError_1 && LA77_0<=Pull_request)||(LA77_0>=Requirements && LA77_0<=Environment)||(LA77_0>=Permissions && LA77_0<=Conditions)||LA77_0==Deployment||LA77_0==Parameters||(LA77_0>=Repository && LA77_0<=Endpoints)||(LA77_0>=FailFast && LA77_0<=RunPolicy)||(LA77_0>=Variables && LA77_0<=Checkout)||LA77_0==Defaults||LA77_0==MaxTime||(LA77_0>=Parallel && LA77_0<=PreBuild)||(LA77_0>=RunName && LA77_0<=Timeouts)||(LA77_0>=Command && LA77_0<=Default)||(LA77_0>=Exclude && LA77_0<=Project)||(LA77_0>=Release && LA77_0<=VmImage)||(LA77_0>=Caches && LA77_0<=Docker)||(LA77_0>=Except && LA77_0<=Agent)||(LA77_0>=Cache && LA77_0<=Final)||(LA77_0>=Image && LA77_0<=Tasks)||LA77_0==Auth||LA77_0==Cron||(LA77_0>=Name && LA77_0<=Only)||(LA77_0>=Plan && LA77_0<=Push)||(LA77_0>=Step && LA77_0<=With)||(LA77_0>=Env && LA77_0<=Jdk)||(LA77_0>=Run && LA77_0<=On)||LA77_0==RULE_ID) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalPipelineParser.g:2806:6: (lv_subParameters_5_0= ruleJobParameter )
                    	    {
                    	    // InternalPipelineParser.g:2806:6: (lv_subParameters_5_0= ruleJobParameter )
                    	    // InternalPipelineParser.g:2807:7: lv_subParameters_5_0= ruleJobParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobParameterAccess().getSubParametersJobParameterParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_61);
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
                    	    if ( cnt77 >= 1 ) break loop77;
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
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
    // InternalPipelineParser.g:2834:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalPipelineParser.g:2834:45: (iv_ruleStep= ruleStep EOF )
            // InternalPipelineParser.g:2835:2: iv_ruleStep= ruleStep EOF
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
    // InternalPipelineParser.g:2841:1: ruleStep returns [EObject current=null] : (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Action_1 = null;

        EObject this_Script_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:2847:2: ( (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) ) )
            // InternalPipelineParser.g:2848:2: (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) )
            {
            // InternalPipelineParser.g:2848:2: (otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript ) )
            // InternalPipelineParser.g:2849:3: otherlv_0= HyphenMinus (this_Action_1= ruleAction | this_Script_2= ruleScript )
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getStepAccess().getHyphenMinusKeyword_0());
            		
            // InternalPipelineParser.g:2853:3: (this_Action_1= ruleAction | this_Script_2= ruleScript )
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // InternalPipelineParser.g:2854:4: this_Action_1= ruleAction
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
                    // InternalPipelineParser.g:2863:4: this_Script_2= ruleScript
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
    // InternalPipelineParser.g:2876:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalPipelineParser.g:2876:47: (iv_ruleScript= ruleScript EOF )
            // InternalPipelineParser.g:2877:2: iv_ruleScript= ruleScript EOF
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
    // InternalPipelineParser.g:2883:1: ruleScript returns [EObject current=null] : ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? ) ;
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
            // InternalPipelineParser.g:2889:2: ( ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? ) )
            // InternalPipelineParser.g:2890:2: ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? )
            {
            // InternalPipelineParser.g:2890:2: ( ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )? )
            // InternalPipelineParser.g:2891:3: ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) ) (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )?
            {
            // InternalPipelineParser.g:2891:3: ( ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) ) )
            // InternalPipelineParser.g:2892:4: ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) ) ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) )
            {
            // InternalPipelineParser.g:2892:4: ( ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) ) )
            // InternalPipelineParser.g:2893:5: ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) )
            {
            // InternalPipelineParser.g:2893:5: ( (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task ) )
            // InternalPipelineParser.g:2894:6: (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task )
            {
            // InternalPipelineParser.g:2894:6: (lv_name_0_1= Run | lv_name_0_2= Script | lv_name_0_3= Bash | lv_name_0_4= Pwsh | lv_name_0_5= Powershell | lv_name_0_6= Checkout | lv_name_0_7= Download | lv_name_0_8= GetPackage | lv_name_0_9= Publish | lv_name_0_10= Task )
            int alt80=10;
            switch ( input.LA(1) ) {
            case Run:
                {
                alt80=1;
                }
                break;
            case Script:
                {
                alt80=2;
                }
                break;
            case Bash:
                {
                alt80=3;
                }
                break;
            case Pwsh:
                {
                alt80=4;
                }
                break;
            case Powershell:
                {
                alt80=5;
                }
                break;
            case Checkout:
                {
                alt80=6;
                }
                break;
            case Download:
                {
                alt80=7;
                }
                break;
            case GetPackage:
                {
                alt80=8;
                }
                break;
            case Publish:
                {
                alt80=9;
                }
                break;
            case Task:
                {
                alt80=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalPipelineParser.g:2895:7: lv_name_0_1= Run
                    {
                    lv_name_0_1=(Token)match(input,Run,FOLLOW_66); 

                    							newLeafNode(lv_name_0_1, grammarAccess.getScriptAccess().getNameRunKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_1, null);
                    						

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:2906:7: lv_name_0_2= Script
                    {
                    lv_name_0_2=(Token)match(input,Script,FOLLOW_66); 

                    							newLeafNode(lv_name_0_2, grammarAccess.getScriptAccess().getNameScriptKeyword_0_0_0_1());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_2, null);
                    						

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:2917:7: lv_name_0_3= Bash
                    {
                    lv_name_0_3=(Token)match(input,Bash,FOLLOW_66); 

                    							newLeafNode(lv_name_0_3, grammarAccess.getScriptAccess().getNameBashKeyword_0_0_0_2());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_3, null);
                    						

                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:2928:7: lv_name_0_4= Pwsh
                    {
                    lv_name_0_4=(Token)match(input,Pwsh,FOLLOW_66); 

                    							newLeafNode(lv_name_0_4, grammarAccess.getScriptAccess().getNamePwshKeyword_0_0_0_3());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_4, null);
                    						

                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:2939:7: lv_name_0_5= Powershell
                    {
                    lv_name_0_5=(Token)match(input,Powershell,FOLLOW_66); 

                    							newLeafNode(lv_name_0_5, grammarAccess.getScriptAccess().getNamePowershellKeyword_0_0_0_4());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_5, null);
                    						

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:2950:7: lv_name_0_6= Checkout
                    {
                    lv_name_0_6=(Token)match(input,Checkout,FOLLOW_66); 

                    							newLeafNode(lv_name_0_6, grammarAccess.getScriptAccess().getNameCheckoutKeyword_0_0_0_5());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_6, null);
                    						

                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:2961:7: lv_name_0_7= Download
                    {
                    lv_name_0_7=(Token)match(input,Download,FOLLOW_66); 

                    							newLeafNode(lv_name_0_7, grammarAccess.getScriptAccess().getNameDownloadKeyword_0_0_0_6());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_7, null);
                    						

                    }
                    break;
                case 8 :
                    // InternalPipelineParser.g:2972:7: lv_name_0_8= GetPackage
                    {
                    lv_name_0_8=(Token)match(input,GetPackage,FOLLOW_66); 

                    							newLeafNode(lv_name_0_8, grammarAccess.getScriptAccess().getNameGetPackageKeyword_0_0_0_7());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_8, null);
                    						

                    }
                    break;
                case 9 :
                    // InternalPipelineParser.g:2983:7: lv_name_0_9= Publish
                    {
                    lv_name_0_9=(Token)match(input,Publish,FOLLOW_66); 

                    							newLeafNode(lv_name_0_9, grammarAccess.getScriptAccess().getNamePublishKeyword_0_0_0_8());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getScriptRule());
                    							}
                    							setWithLastConsumed(current, "name", lv_name_0_9, null);
                    						

                    }
                    break;
                case 10 :
                    // InternalPipelineParser.g:2994:7: lv_name_0_10= Task
                    {
                    lv_name_0_10=(Token)match(input,Task,FOLLOW_66); 

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

            // InternalPipelineParser.g:3007:4: ( ( (lv_command_1_0= ruleAnyData ) ) | ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_COMPLEX_EXPRESSION && LA82_0<=RULE_VERSION)||LA82_0==RULE_ID||LA82_0==RULE_STRING) ) {
                alt82=1;
            }
            else if ( (LA82_0==GreaterThanSignHyphenMinus||LA82_0==VerticalLine) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalPipelineParser.g:3008:5: ( (lv_command_1_0= ruleAnyData ) )
                    {
                    // InternalPipelineParser.g:3008:5: ( (lv_command_1_0= ruleAnyData ) )
                    // InternalPipelineParser.g:3009:6: (lv_command_1_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:3009:6: (lv_command_1_0= ruleAnyData )
                    // InternalPipelineParser.g:3010:7: lv_command_1_0= ruleAnyData
                    {

                    							newCompositeNode(grammarAccess.getScriptAccess().getCommandAnyDataParserRuleCall_0_1_0_0());
                    						
                    pushFollow(FOLLOW_41);
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
                    // InternalPipelineParser.g:3028:5: ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:3028:5: ( (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END )
                    // InternalPipelineParser.g:3029:6: (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus ) this_BEGIN_4= RULE_BEGIN ( (lv_command_5_0= ruleAnyData ) ) this_END_6= RULE_END
                    {
                    // InternalPipelineParser.g:3029:6: (otherlv_2= VerticalLine | otherlv_3= GreaterThanSignHyphenMinus )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==VerticalLine) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==GreaterThanSignHyphenMinus) ) {
                        alt81=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalPipelineParser.g:3030:7: otherlv_2= VerticalLine
                            {
                            otherlv_2=(Token)match(input,VerticalLine,FOLLOW_5); 

                            							newLeafNode(otherlv_2, grammarAccess.getScriptAccess().getVerticalLineKeyword_0_1_1_0_0());
                            						

                            }
                            break;
                        case 2 :
                            // InternalPipelineParser.g:3035:7: otherlv_3= GreaterThanSignHyphenMinus
                            {
                            otherlv_3=(Token)match(input,GreaterThanSignHyphenMinus,FOLLOW_5); 

                            							newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getGreaterThanSignHyphenMinusKeyword_0_1_1_0_1());
                            						

                            }
                            break;

                    }

                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_33); 

                    						newLeafNode(this_BEGIN_4, grammarAccess.getScriptAccess().getBEGINTerminalRuleCall_0_1_1_1());
                    					
                    // InternalPipelineParser.g:3044:6: ( (lv_command_5_0= ruleAnyData ) )
                    // InternalPipelineParser.g:3045:7: (lv_command_5_0= ruleAnyData )
                    {
                    // InternalPipelineParser.g:3045:7: (lv_command_5_0= ruleAnyData )
                    // InternalPipelineParser.g:3046:8: lv_command_5_0= ruleAnyData
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

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_41); 

                    						newLeafNode(this_END_6, grammarAccess.getScriptAccess().getENDTerminalRuleCall_0_1_1_3());
                    					

                    }


                    }
                    break;

            }


            }

            // InternalPipelineParser.g:3070:3: (this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_BEGIN) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalPipelineParser.g:3071:4: this_BEGIN_7= RULE_BEGIN ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )* this_END_9= RULE_END
                    {
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_67); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getScriptAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:3075:4: ( ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==Repository_dispatch||(LA84_0>=ContinueOnError_1 && LA84_0<=Pull_request)||(LA84_0>=Requirements && LA84_0<=Environment)||(LA84_0>=Permissions && LA84_0<=Conditions)||(LA84_0>=Deployment && LA84_0<=Parameters)||(LA84_0>=Powershell && LA84_0<=Endpoints)||(LA84_0>=FailFast && LA84_0<=RunPolicy)||(LA84_0>=Variables && LA84_0<=Checkout)||(LA84_0>=Defaults && LA84_0<=MaxTime)||(LA84_0>=Parallel && LA84_0<=PreBuild)||(LA84_0>=RunName && LA84_0<=Timeouts)||(LA84_0>=Command && LA84_0<=Default)||(LA84_0>=Exclude && LA84_0<=VmImage)||(LA84_0>=Caches && LA84_0<=Docker)||(LA84_0>=Except && LA84_0<=Agent)||(LA84_0>=Cache && LA84_0<=Final)||(LA84_0>=Image && LA84_0<=Tasks)||(LA84_0>=Auth && LA84_0<=Cron)||(LA84_0>=Name && LA84_0<=Only)||(LA84_0>=Plan && LA84_0<=With)||(LA84_0>=Env && LA84_0<=Jdk)||(LA84_0>=Run && LA84_0<=On)||LA84_0==RULE_ID) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3076:5: ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) )
                    	    {
                    	    // InternalPipelineParser.g:3076:5: ( (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript ) )
                    	    // InternalPipelineParser.g:3077:6: (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript )
                    	    {
                    	    // InternalPipelineParser.g:3077:6: (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript )
                    	    int alt83=2;
                    	    alt83 = dfa83.predict(input);
                    	    switch (alt83) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:3078:7: lv_subSteps_8_1= ruleAction
                    	            {

                    	            							newCompositeNode(grammarAccess.getScriptAccess().getSubStepsActionParserRuleCall_1_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_67);
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
                    	            // InternalPipelineParser.g:3094:7: lv_subSteps_8_2= ruleScript
                    	            {

                    	            							newCompositeNode(grammarAccess.getScriptAccess().getSubStepsScriptParserRuleCall_1_1_0_1());
                    	            						
                    	            pushFollow(FOLLOW_67);
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
                    	    break loop84;
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
    // InternalPipelineParser.g:3121:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalPipelineParser.g:3121:47: (iv_ruleAction= ruleAction EOF )
            // InternalPipelineParser.g:3122:2: iv_ruleAction= ruleAction EOF
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
    // InternalPipelineParser.g:3128:1: ruleAction returns [EObject current=null] : ( ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )? ) ;
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
            // InternalPipelineParser.g:3134:2: ( ( ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )? ) )
            // InternalPipelineParser.g:3135:2: ( ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )? )
            {
            // InternalPipelineParser.g:3135:2: ( ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )? )
            // InternalPipelineParser.g:3136:3: ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) ) (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )?
            {
            // InternalPipelineParser.g:3136:3: ( (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) ) | ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==Name) ) {
                int LA88_1 = input.LA(2);

                if ( (LA88_1==RULE_STRING) ) {
                    alt88=1;
                }
                else if ( (LA88_1==EOF||LA88_1==Repository_dispatch||(LA88_1>=ContinueOnError_1 && LA88_1<=Pull_request)||(LA88_1>=Requirements && LA88_1<=Environment)||(LA88_1>=Permissions && LA88_1<=Conditions)||(LA88_1>=Deployment && LA88_1<=Parameters)||(LA88_1>=Powershell && LA88_1<=Endpoints)||(LA88_1>=FailFast && LA88_1<=RunPolicy)||(LA88_1>=Variables && LA88_1<=Checkout)||(LA88_1>=Defaults && LA88_1<=MaxTime)||(LA88_1>=Parallel && LA88_1<=PreBuild)||(LA88_1>=RunName && LA88_1<=Timeouts)||(LA88_1>=Command && LA88_1<=Default)||(LA88_1>=Exclude && LA88_1<=VmImage)||(LA88_1>=Caches && LA88_1<=Docker)||(LA88_1>=Except && LA88_1<=Agent)||(LA88_1>=Cache && LA88_1<=Final)||(LA88_1>=Image && LA88_1<=Tasks)||(LA88_1>=Auth && LA88_1<=Cron)||(LA88_1>=Name && LA88_1<=Only)||(LA88_1>=Plan && LA88_1<=With)||(LA88_1>=Env && LA88_1<=Jdk)||(LA88_1>=Run && LA88_1<=On)||LA88_1==HyphenMinus||(LA88_1>=RULE_COMPLEX_EXPRESSION && LA88_1<=RULE_ID)) ) {
                    alt88=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA88_0==Repository_dispatch||(LA88_0>=ContinueOnError_1 && LA88_0<=Pull_request)||(LA88_0>=Requirements && LA88_0<=Environment)||(LA88_0>=Permissions && LA88_0<=Conditions)||LA88_0==Deployment||LA88_0==Parameters||(LA88_0>=Repository && LA88_0<=Endpoints)||(LA88_0>=FailFast && LA88_0<=RunPolicy)||(LA88_0>=Variables && LA88_0<=Checkout)||LA88_0==Defaults||LA88_0==MaxTime||(LA88_0>=Parallel && LA88_0<=PreBuild)||(LA88_0>=RunName && LA88_0<=Timeouts)||(LA88_0>=Command && LA88_0<=Default)||(LA88_0>=Exclude && LA88_0<=Project)||(LA88_0>=Release && LA88_0<=VmImage)||(LA88_0>=Caches && LA88_0<=Docker)||(LA88_0>=Except && LA88_0<=Agent)||(LA88_0>=Cache && LA88_0<=Final)||(LA88_0>=Image && LA88_0<=Tasks)||LA88_0==Auth||LA88_0==Cron||LA88_0==Only||(LA88_0>=Plan && LA88_0<=Push)||(LA88_0>=Step && LA88_0<=With)||(LA88_0>=Env && LA88_0<=Jdk)||(LA88_0>=Run && LA88_0<=On)||LA88_0==RULE_ID) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalPipelineParser.g:3137:4: (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) )
                    {
                    // InternalPipelineParser.g:3137:4: (otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) ) )
                    // InternalPipelineParser.g:3138:5: otherlv_0= Name ( (lv_stepName_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,Name,FOLLOW_8); 

                    					newLeafNode(otherlv_0, grammarAccess.getActionAccess().getNameKeyword_0_0_0());
                    				
                    // InternalPipelineParser.g:3142:5: ( (lv_stepName_1_0= RULE_STRING ) )
                    // InternalPipelineParser.g:3143:6: (lv_stepName_1_0= RULE_STRING )
                    {
                    // InternalPipelineParser.g:3143:6: (lv_stepName_1_0= RULE_STRING )
                    // InternalPipelineParser.g:3144:7: lv_stepName_1_0= RULE_STRING
                    {
                    lv_stepName_1_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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
                    // InternalPipelineParser.g:3162:4: ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? )
                    {
                    // InternalPipelineParser.g:3162:4: ( ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )? )
                    // InternalPipelineParser.g:3163:5: ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) ) ( (lv_actionValue_5_0= ruleAnyData ) )?
                    {
                    // InternalPipelineParser.g:3163:5: ( ( (lv_actionKeyword_2_0= rulePipelineKeyword ) ) | ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon ) )
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==Repository_dispatch||(LA86_0>=ContinueOnError_1 && LA86_0<=Pull_request)||(LA86_0>=Requirements && LA86_0<=Environment)||(LA86_0>=Permissions && LA86_0<=Conditions)||LA86_0==Deployment||LA86_0==Parameters||(LA86_0>=Repository && LA86_0<=Endpoints)||(LA86_0>=FailFast && LA86_0<=RunPolicy)||(LA86_0>=Variables && LA86_0<=Checkout)||LA86_0==Defaults||LA86_0==MaxTime||(LA86_0>=Parallel && LA86_0<=PreBuild)||(LA86_0>=RunName && LA86_0<=Timeouts)||(LA86_0>=Command && LA86_0<=Default)||(LA86_0>=Exclude && LA86_0<=Project)||(LA86_0>=Release && LA86_0<=VmImage)||(LA86_0>=Caches && LA86_0<=Docker)||(LA86_0>=Except && LA86_0<=Agent)||(LA86_0>=Cache && LA86_0<=Final)||(LA86_0>=Image && LA86_0<=Tasks)||LA86_0==Auth||LA86_0==Cron||(LA86_0>=Name && LA86_0<=Only)||(LA86_0>=Plan && LA86_0<=Push)||(LA86_0>=Step && LA86_0<=With)||(LA86_0>=Env && LA86_0<=Jdk)||(LA86_0>=Run && LA86_0<=On)) ) {
                        alt86=1;
                    }
                    else if ( (LA86_0==RULE_ID) ) {
                        alt86=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 86, 0, input);

                        throw nvae;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalPipelineParser.g:3164:6: ( (lv_actionKeyword_2_0= rulePipelineKeyword ) )
                            {
                            // InternalPipelineParser.g:3164:6: ( (lv_actionKeyword_2_0= rulePipelineKeyword ) )
                            // InternalPipelineParser.g:3165:7: (lv_actionKeyword_2_0= rulePipelineKeyword )
                            {
                            // InternalPipelineParser.g:3165:7: (lv_actionKeyword_2_0= rulePipelineKeyword )
                            // InternalPipelineParser.g:3166:8: lv_actionKeyword_2_0= rulePipelineKeyword
                            {

                            								newCompositeNode(grammarAccess.getActionAccess().getActionKeywordPipelineKeywordEnumRuleCall_0_1_0_0_0());
                            							
                            pushFollow(FOLLOW_68);
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
                            // InternalPipelineParser.g:3184:6: ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon )
                            {
                            // InternalPipelineParser.g:3184:6: ( ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon )
                            // InternalPipelineParser.g:3185:7: ( (lv_otherKeyword_3_0= RULE_ID ) ) otherlv_4= Colon
                            {
                            // InternalPipelineParser.g:3185:7: ( (lv_otherKeyword_3_0= RULE_ID ) )
                            // InternalPipelineParser.g:3186:8: (lv_otherKeyword_3_0= RULE_ID )
                            {
                            // InternalPipelineParser.g:3186:8: (lv_otherKeyword_3_0= RULE_ID )
                            // InternalPipelineParser.g:3187:9: lv_otherKeyword_3_0= RULE_ID
                            {
                            lv_otherKeyword_3_0=(Token)match(input,RULE_ID,FOLLOW_63); 

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

                            otherlv_4=(Token)match(input,Colon,FOLLOW_68); 

                            							newLeafNode(otherlv_4, grammarAccess.getActionAccess().getColonKeyword_0_1_0_1_1());
                            						

                            }


                            }
                            break;

                    }

                    // InternalPipelineParser.g:3209:5: ( (lv_actionValue_5_0= ruleAnyData ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( ((LA87_0>=RULE_COMPLEX_EXPRESSION && LA87_0<=RULE_VERSION)||LA87_0==RULE_STRING) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==RULE_ID) ) {
                        int LA87_2 = input.LA(2);

                        if ( (LA87_2==EOF||LA87_2==Repository_dispatch||(LA87_2>=ContinueOnError_1 && LA87_2<=Pull_request)||(LA87_2>=Requirements && LA87_2<=Environment)||(LA87_2>=Permissions && LA87_2<=Conditions)||(LA87_2>=Deployment && LA87_2<=Parameters)||(LA87_2>=Powershell && LA87_2<=Endpoints)||(LA87_2>=FailFast && LA87_2<=RunPolicy)||(LA87_2>=Variables && LA87_2<=Checkout)||(LA87_2>=Defaults && LA87_2<=MaxTime)||(LA87_2>=Parallel && LA87_2<=PreBuild)||(LA87_2>=RunName && LA87_2<=Timeouts)||(LA87_2>=Command && LA87_2<=Default)||(LA87_2>=Exclude && LA87_2<=VmImage)||(LA87_2>=Caches && LA87_2<=Docker)||(LA87_2>=Except && LA87_2<=Agent)||(LA87_2>=Cache && LA87_2<=Final)||(LA87_2>=Image && LA87_2<=Tasks)||(LA87_2>=Auth && LA87_2<=Cron)||(LA87_2>=Name && LA87_2<=Only)||(LA87_2>=Plan && LA87_2<=With)||(LA87_2>=Env && LA87_2<=Jdk)||(LA87_2>=Run && LA87_2<=On)||LA87_2==HyphenMinus||(LA87_2>=RULE_BEGIN && LA87_2<=RULE_ID)) ) {
                            alt87=1;
                        }
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalPipelineParser.g:3210:6: (lv_actionValue_5_0= ruleAnyData )
                            {
                            // InternalPipelineParser.g:3210:6: (lv_actionValue_5_0= ruleAnyData )
                            // InternalPipelineParser.g:3211:7: lv_actionValue_5_0= ruleAnyData
                            {

                            							newCompositeNode(grammarAccess.getActionAccess().getActionValueAnyDataParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_41);
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

            // InternalPipelineParser.g:3230:3: (this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_BEGIN) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalPipelineParser.g:3231:4: this_BEGIN_6= RULE_BEGIN ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )* this_END_8= RULE_END
                    {
                    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_67); 

                    				newLeafNode(this_BEGIN_6, grammarAccess.getActionAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:3235:4: ( ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) ) )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==Repository_dispatch||(LA90_0>=ContinueOnError_1 && LA90_0<=Pull_request)||(LA90_0>=Requirements && LA90_0<=Environment)||(LA90_0>=Permissions && LA90_0<=Conditions)||(LA90_0>=Deployment && LA90_0<=Parameters)||(LA90_0>=Powershell && LA90_0<=Endpoints)||(LA90_0>=FailFast && LA90_0<=RunPolicy)||(LA90_0>=Variables && LA90_0<=Checkout)||(LA90_0>=Defaults && LA90_0<=MaxTime)||(LA90_0>=Parallel && LA90_0<=PreBuild)||(LA90_0>=RunName && LA90_0<=Timeouts)||(LA90_0>=Command && LA90_0<=Default)||(LA90_0>=Exclude && LA90_0<=VmImage)||(LA90_0>=Caches && LA90_0<=Docker)||(LA90_0>=Except && LA90_0<=Agent)||(LA90_0>=Cache && LA90_0<=Final)||(LA90_0>=Image && LA90_0<=Tasks)||(LA90_0>=Auth && LA90_0<=Cron)||(LA90_0>=Name && LA90_0<=Only)||(LA90_0>=Plan && LA90_0<=With)||(LA90_0>=Env && LA90_0<=Jdk)||(LA90_0>=Run && LA90_0<=On)||LA90_0==RULE_ID) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3236:5: ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) )
                    	    {
                    	    // InternalPipelineParser.g:3236:5: ( (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript ) )
                    	    // InternalPipelineParser.g:3237:6: (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript )
                    	    {
                    	    // InternalPipelineParser.g:3237:6: (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript )
                    	    int alt89=2;
                    	    alt89 = dfa89.predict(input);
                    	    switch (alt89) {
                    	        case 1 :
                    	            // InternalPipelineParser.g:3238:7: lv_subSteps_7_1= ruleAction
                    	            {

                    	            							newCompositeNode(grammarAccess.getActionAccess().getSubStepsActionParserRuleCall_1_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_67);
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
                    	            // InternalPipelineParser.g:3254:7: lv_subSteps_7_2= ruleScript
                    	            {

                    	            							newCompositeNode(grammarAccess.getActionAccess().getSubStepsScriptParserRuleCall_1_1_0_1());
                    	            						
                    	            pushFollow(FOLLOW_67);
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
                    	    break loop90;
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
    // InternalPipelineParser.g:3281:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalPipelineParser.g:3281:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalPipelineParser.g:3282:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalPipelineParser.g:3288:1: ruleParameterValue returns [EObject current=null] : ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) otherlv_2= Colon (this_WS_3= RULE_WS )* ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) ) ) ;
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
            // InternalPipelineParser.g:3294:2: ( ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) otherlv_2= Colon (this_WS_3= RULE_WS )* ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) ) ) )
            // InternalPipelineParser.g:3295:2: ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) otherlv_2= Colon (this_WS_3= RULE_WS )* ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) ) )
            {
            // InternalPipelineParser.g:3295:2: ( (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) otherlv_2= Colon (this_WS_3= RULE_WS )* ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) ) )
            // InternalPipelineParser.g:3296:3: (otherlv_0= HyphenMinus )? ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) ) otherlv_2= Colon (this_WS_3= RULE_WS )* ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) )
            {
            // InternalPipelineParser.g:3296:3: (otherlv_0= HyphenMinus )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==HyphenMinus) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalPipelineParser.g:3297:4: otherlv_0= HyphenMinus
                    {
                    otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getParameterValueAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalPipelineParser.g:3302:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) ) )
            // InternalPipelineParser.g:3303:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) )
            {
            // InternalPipelineParser.g:3303:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION ) )
            // InternalPipelineParser.g:3304:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION )
            {
            // InternalPipelineParser.g:3304:5: (lv_name_1_1= RULE_ID | lv_name_1_2= RULE_COMPLEX_EXPRESSION )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                alt93=1;
            }
            else if ( (LA93_0==RULE_COMPLEX_EXPRESSION) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalPipelineParser.g:3305:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_63); 

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
                    // InternalPipelineParser.g:3320:6: lv_name_1_2= RULE_COMPLEX_EXPRESSION
                    {
                    lv_name_1_2=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_63); 

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

            otherlv_2=(Token)match(input,Colon,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterValueAccess().getColonKeyword_2());
            		
            // InternalPipelineParser.g:3341:3: (this_WS_3= RULE_WS )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_WS) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalPipelineParser.g:3342:4: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_69); 

            	    				newLeafNode(this_WS_3, grammarAccess.getParameterValueAccess().getWSTerminalRuleCall_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            // InternalPipelineParser.g:3347:3: ( (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END ) | ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==RULE_BEGIN) ) {
                int LA99_1 = input.LA(2);

                if ( (LA99_1==HyphenMinus) ) {
                    switch ( input.LA(3) ) {
                    case RULE_HEX_INT:
                    case RULE_INT:
                    case RULE_FLOAT_LITERAL:
                    case RULE_VERSION:
                    case RULE_STRING:
                        {
                        alt99=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA99_5 = input.LA(4);

                        if ( (LA99_5==Colon) ) {
                            alt99=1;
                        }
                        else if ( (LA99_5==HyphenMinus||LA99_5==RULE_END) ) {
                            alt99=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 99, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_COMPLEX_EXPRESSION:
                        {
                        int LA99_6 = input.LA(4);

                        if ( (LA99_6==HyphenMinus||LA99_6==RULE_END) ) {
                            alt99=2;
                        }
                        else if ( (LA99_6==Colon) ) {
                            alt99=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 99, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA99_1==RULE_COMPLEX_EXPRESSION||(LA99_1>=RULE_END && LA99_1<=RULE_ID)) ) {
                    alt99=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA99_0==HyphenMinus||LA99_0==LeftSquareBracket||(LA99_0>=RULE_COMPLEX_EXPRESSION && LA99_0<=RULE_VERSION)||LA99_0==RULE_ID||LA99_0==RULE_STRING) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalPipelineParser.g:3348:4: (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END )
                    {
                    // InternalPipelineParser.g:3348:4: (this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END )
                    // InternalPipelineParser.g:3349:5: this_BEGIN_4= RULE_BEGIN ( (lv_subParameterValues_5_0= ruleParameterValue ) )* this_END_6= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_31); 

                    					newLeafNode(this_BEGIN_4, grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_0_0());
                    				
                    // InternalPipelineParser.g:3353:5: ( (lv_subParameterValues_5_0= ruleParameterValue ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==HyphenMinus||LA95_0==RULE_COMPLEX_EXPRESSION||LA95_0==RULE_ID) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3354:6: (lv_subParameterValues_5_0= ruleParameterValue )
                    	    {
                    	    // InternalPipelineParser.g:3354:6: (lv_subParameterValues_5_0= ruleParameterValue )
                    	    // InternalPipelineParser.g:3355:7: lv_subParameterValues_5_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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
                    	    break loop95;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

                    					newLeafNode(this_END_6, grammarAccess.getParameterValueAccess().getENDTerminalRuleCall_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3378:4: ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? )
                    {
                    // InternalPipelineParser.g:3378:4: ( ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )? )
                    // InternalPipelineParser.g:3379:5: ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) ) (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )?
                    {
                    // InternalPipelineParser.g:3379:5: ( ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) ) )
                    // InternalPipelineParser.g:3380:6: ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) )
                    {
                    // InternalPipelineParser.g:3380:6: ( (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues ) )
                    // InternalPipelineParser.g:3381:7: (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues )
                    {
                    // InternalPipelineParser.g:3381:7: (lv_value_7_1= ruleAnyData | lv_value_7_2= ruleArrayList | lv_value_7_3= ruleHyphenValues )
                    int alt96=3;
                    switch ( input.LA(1) ) {
                    case RULE_COMPLEX_EXPRESSION:
                    case RULE_HEX_INT:
                    case RULE_INT:
                    case RULE_FLOAT_LITERAL:
                    case RULE_VERSION:
                    case RULE_ID:
                    case RULE_STRING:
                        {
                        alt96=1;
                        }
                        break;
                    case LeftSquareBracket:
                        {
                        alt96=2;
                        }
                        break;
                    case HyphenMinus:
                    case RULE_BEGIN:
                        {
                        alt96=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 0, input);

                        throw nvae;
                    }

                    switch (alt96) {
                        case 1 :
                            // InternalPipelineParser.g:3382:8: lv_value_7_1= ruleAnyData
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueAnyDataParserRuleCall_4_1_0_0_0());
                            							
                            pushFollow(FOLLOW_41);
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
                            // InternalPipelineParser.g:3398:8: lv_value_7_2= ruleArrayList
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueArrayListParserRuleCall_4_1_0_0_1());
                            							
                            pushFollow(FOLLOW_41);
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
                            // InternalPipelineParser.g:3414:8: lv_value_7_3= ruleHyphenValues
                            {

                            								newCompositeNode(grammarAccess.getParameterValueAccess().getValueHyphenValuesParserRuleCall_4_1_0_0_2());
                            							
                            pushFollow(FOLLOW_41);
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

                    // InternalPipelineParser.g:3432:5: (this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==RULE_BEGIN) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalPipelineParser.g:3433:6: this_BEGIN_8= RULE_BEGIN ( (lv_subParameterValues_9_0= ruleParameterValue ) )* this_END_10= RULE_END
                            {
                            this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_31); 

                            						newLeafNode(this_BEGIN_8, grammarAccess.getParameterValueAccess().getBEGINTerminalRuleCall_4_1_1_0());
                            					
                            // InternalPipelineParser.g:3437:6: ( (lv_subParameterValues_9_0= ruleParameterValue ) )*
                            loop97:
                            do {
                                int alt97=2;
                                int LA97_0 = input.LA(1);

                                if ( (LA97_0==HyphenMinus||LA97_0==RULE_COMPLEX_EXPRESSION||LA97_0==RULE_ID) ) {
                                    alt97=1;
                                }


                                switch (alt97) {
                            	case 1 :
                            	    // InternalPipelineParser.g:3438:7: (lv_subParameterValues_9_0= ruleParameterValue )
                            	    {
                            	    // InternalPipelineParser.g:3438:7: (lv_subParameterValues_9_0= ruleParameterValue )
                            	    // InternalPipelineParser.g:3439:8: lv_subParameterValues_9_0= ruleParameterValue
                            	    {

                            	    								newCompositeNode(grammarAccess.getParameterValueAccess().getSubParameterValuesParameterValueParserRuleCall_4_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_31);
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
                            	    break loop97;
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
    // InternalPipelineParser.g:3467:1: entryRuleAnyData returns [String current=null] : iv_ruleAnyData= ruleAnyData EOF ;
    public final String entryRuleAnyData() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyData = null;


        try {
            // InternalPipelineParser.g:3467:47: (iv_ruleAnyData= ruleAnyData EOF )
            // InternalPipelineParser.g:3468:2: iv_ruleAnyData= ruleAnyData EOF
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
    // InternalPipelineParser.g:3474:1: ruleAnyData returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT ) ;
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
            // InternalPipelineParser.g:3480:2: ( (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT ) )
            // InternalPipelineParser.g:3481:2: (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT )
            {
            // InternalPipelineParser.g:3481:2: (this_STRING_0= RULE_STRING | this_Number_1= ruleNumber | this_FloatingPoint_2= ruleFloatingPoint | this_SimpleWord_3= ruleSimpleWord | this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION | this_VERSION_5= RULE_VERSION | this_HEX_INT_6= RULE_HEX_INT )
            int alt100=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt100=1;
                }
                break;
            case RULE_INT:
                {
                alt100=2;
                }
                break;
            case RULE_FLOAT_LITERAL:
                {
                alt100=3;
                }
                break;
            case RULE_ID:
                {
                alt100=4;
                }
                break;
            case RULE_COMPLEX_EXPRESSION:
                {
                alt100=5;
                }
                break;
            case RULE_VERSION:
                {
                alt100=6;
                }
                break;
            case RULE_HEX_INT:
                {
                alt100=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalPipelineParser.g:3482:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getAnyDataAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3490:3: this_Number_1= ruleNumber
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
                    // InternalPipelineParser.g:3501:3: this_FloatingPoint_2= ruleFloatingPoint
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
                    // InternalPipelineParser.g:3512:3: this_SimpleWord_3= ruleSimpleWord
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
                    // InternalPipelineParser.g:3523:3: this_COMPLEX_EXPRESSION_4= RULE_COMPLEX_EXPRESSION
                    {
                    this_COMPLEX_EXPRESSION_4=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_2); 

                    			current.merge(this_COMPLEX_EXPRESSION_4);
                    		

                    			newLeafNode(this_COMPLEX_EXPRESSION_4, grammarAccess.getAnyDataAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:3531:3: this_VERSION_5= RULE_VERSION
                    {
                    this_VERSION_5=(Token)match(input,RULE_VERSION,FOLLOW_2); 

                    			current.merge(this_VERSION_5);
                    		

                    			newLeafNode(this_VERSION_5, grammarAccess.getAnyDataAccess().getVERSIONTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:3539:3: this_HEX_INT_6= RULE_HEX_INT
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
    // InternalPipelineParser.g:3550:1: entryRuleKeyValue returns [String current=null] : iv_ruleKeyValue= ruleKeyValue EOF ;
    public final String entryRuleKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyValue = null;


        try {
            // InternalPipelineParser.g:3550:48: (iv_ruleKeyValue= ruleKeyValue EOF )
            // InternalPipelineParser.g:3551:2: iv_ruleKeyValue= ruleKeyValue EOF
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
    // InternalPipelineParser.g:3557:1: ruleKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData ) ;
    public final AntlrDatatypeRuleToken ruleKeyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_AnyData_2 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3563:2: ( (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData ) )
            // InternalPipelineParser.g:3564:2: (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData )
            {
            // InternalPipelineParser.g:3564:2: (this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData )
            // InternalPipelineParser.g:3565:3: this_ID_0= RULE_ID kw= Colon this_AnyData_2= ruleAnyData
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_63); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getKeyValueAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_33); 

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
    // InternalPipelineParser.g:3591:1: entryRuleIndPermissionValue returns [String current=null] : iv_ruleIndPermissionValue= ruleIndPermissionValue EOF ;
    public final String entryRuleIndPermissionValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIndPermissionValue = null;


        try {
            // InternalPipelineParser.g:3591:58: (iv_ruleIndPermissionValue= ruleIndPermissionValue EOF )
            // InternalPipelineParser.g:3592:2: iv_ruleIndPermissionValue= ruleIndPermissionValue EOF
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
    // InternalPipelineParser.g:3598:1: ruleIndPermissionValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) ) ;
    public final AntlrDatatypeRuleToken ruleIndPermissionValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3604:2: ( (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) ) )
            // InternalPipelineParser.g:3605:2: (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) )
            {
            // InternalPipelineParser.g:3605:2: (this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None ) )
            // InternalPipelineParser.g:3606:3: this_ID_0= RULE_ID kw= Colon (kw= Read | kw= Write | kw= None )
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_63); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getIndPermissionValueAccess().getIDTerminalRuleCall_0());
            		
            kw=(Token)match(input,Colon,FOLLOW_70); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getColonKeyword_1());
            		
            // InternalPipelineParser.g:3618:3: (kw= Read | kw= Write | kw= None )
            int alt101=3;
            switch ( input.LA(1) ) {
            case Read:
                {
                alt101=1;
                }
                break;
            case Write:
                {
                alt101=2;
                }
                break;
            case None:
                {
                alt101=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalPipelineParser.g:3619:4: kw= Read
                    {
                    kw=(Token)match(input,Read,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getReadKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3625:4: kw= Write
                    {
                    kw=(Token)match(input,Write,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIndPermissionValueAccess().getWriteKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:3631:4: kw= None
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
    // InternalPipelineParser.g:3641:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;


        try {
            // InternalPipelineParser.g:3641:54: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // InternalPipelineParser.g:3642:2: iv_ruleUnquotedString= ruleUnquotedString EOF
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
    // InternalPipelineParser.g:3648:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* ) ;
    public final AntlrDatatypeRuleToken ruleUnquotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token this_COMPLEX_EXPRESSION_3=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3654:2: ( (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* ) )
            // InternalPipelineParser.g:3655:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* )
            {
            // InternalPipelineParser.g:3655:2: (this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )* )
            // InternalPipelineParser.g:3656:3: this_ID_0= RULE_ID (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_0());
            		
            // InternalPipelineParser.g:3663:3: (this_ID_1= RULE_ID | this_INT_2= RULE_INT | this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION )*
            loop102:
            do {
                int alt102=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt102=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt102=2;
                    }
                    break;
                case RULE_COMPLEX_EXPRESSION:
                    {
                    alt102=3;
                    }
                    break;

                }

                switch (alt102) {
            	case 1 :
            	    // InternalPipelineParser.g:3664:4: this_ID_1= RULE_ID
            	    {
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_71); 

            	    				current.merge(this_ID_1);
            	    			

            	    				newLeafNode(this_ID_1, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalPipelineParser.g:3672:4: this_INT_2= RULE_INT
            	    {
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_71); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getUnquotedStringAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalPipelineParser.g:3680:4: this_COMPLEX_EXPRESSION_3= RULE_COMPLEX_EXPRESSION
            	    {
            	    this_COMPLEX_EXPRESSION_3=(Token)match(input,RULE_COMPLEX_EXPRESSION,FOLLOW_71); 

            	    				current.merge(this_COMPLEX_EXPRESSION_3);
            	    			

            	    				newLeafNode(this_COMPLEX_EXPRESSION_3, grammarAccess.getUnquotedStringAccess().getCOMPLEX_EXPRESSIONTerminalRuleCall_1_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop102;
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
    // InternalPipelineParser.g:3692:1: entryRuleHyphenValues returns [String current=null] : iv_ruleHyphenValues= ruleHyphenValues EOF ;
    public final String entryRuleHyphenValues() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHyphenValues = null;


        try {
            // InternalPipelineParser.g:3692:52: (iv_ruleHyphenValues= ruleHyphenValues EOF )
            // InternalPipelineParser.g:3693:2: iv_ruleHyphenValues= ruleHyphenValues EOF
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
    // InternalPipelineParser.g:3699:1: ruleHyphenValues returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) ) ;
    public final AntlrDatatypeRuleToken ruleHyphenValues() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BEGIN_2=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken this_AnyData_1 = null;

        AntlrDatatypeRuleToken this_AnyData_4 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3705:2: ( ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) ) )
            // InternalPipelineParser.g:3706:2: ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) )
            {
            // InternalPipelineParser.g:3706:2: ( (kw= HyphenMinus this_AnyData_1= ruleAnyData )+ | (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==HyphenMinus) ) {
                alt105=1;
            }
            else if ( (LA105_0==RULE_BEGIN) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalPipelineParser.g:3707:3: (kw= HyphenMinus this_AnyData_1= ruleAnyData )+
                    {
                    // InternalPipelineParser.g:3707:3: (kw= HyphenMinus this_AnyData_1= ruleAnyData )+
                    int cnt103=0;
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==HyphenMinus) ) {
                            switch ( input.LA(2) ) {
                            case RULE_ID:
                                {
                                int LA103_3 = input.LA(3);

                                if ( (LA103_3==EOF||LA103_3==WorkingDirectory||LA103_3==Repositories||LA103_3==Concurrency||LA103_3==Containers||(LA103_3>=Parameters && LA103_3<=Permission)||LA103_3==Executors||LA103_3==Pipelines||LA103_3==Resources||LA103_3==Variables||(LA103_3>=Commands && LA103_3<=Defaults)||LA103_3==Packages||LA103_3==RunName||LA103_3==Webhooks||LA103_3==Default||LA103_3==Extends||LA103_3==Include||LA103_3==Version||LA103_3==Builds||LA103_3==Stages||(LA103_3>=Jobs && LA103_3<=Name)||LA103_3==Orbs||LA103_3==Pool||LA103_3==Env||LA103_3==HyphenMinus||LA103_3==RULE_COMPLEX_EXPRESSION||(LA103_3>=RULE_BEGIN && LA103_3<=RULE_ID)) ) {
                                    alt103=1;
                                }


                                }
                                break;
                            case RULE_COMPLEX_EXPRESSION:
                                {
                                int LA103_4 = input.LA(3);

                                if ( (LA103_4==EOF||LA103_4==WorkingDirectory||LA103_4==Repositories||LA103_4==Concurrency||LA103_4==Containers||(LA103_4>=Parameters && LA103_4<=Permission)||LA103_4==Executors||LA103_4==Pipelines||LA103_4==Resources||LA103_4==Variables||(LA103_4>=Commands && LA103_4<=Defaults)||LA103_4==Packages||LA103_4==RunName||LA103_4==Webhooks||LA103_4==Default||LA103_4==Extends||LA103_4==Include||LA103_4==Version||LA103_4==Builds||LA103_4==Stages||(LA103_4>=Jobs && LA103_4<=Name)||LA103_4==Orbs||LA103_4==Pool||LA103_4==Env||LA103_4==HyphenMinus||LA103_4==RULE_COMPLEX_EXPRESSION||(LA103_4>=RULE_BEGIN && LA103_4<=RULE_ID)) ) {
                                    alt103=1;
                                }


                                }
                                break;
                            case RULE_HEX_INT:
                            case RULE_INT:
                            case RULE_FLOAT_LITERAL:
                            case RULE_VERSION:
                            case RULE_STRING:
                                {
                                alt103=1;
                                }
                                break;

                            }

                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3708:4: kw= HyphenMinus this_AnyData_1= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,HyphenMinus,FOLLOW_33); 

                    	    				current.merge(kw);
                    	    				newLeafNode(kw, grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_0_0());
                    	    			

                    	    				newCompositeNode(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_0_1());
                    	    			
                    	    pushFollow(FOLLOW_38);
                    	    this_AnyData_1=ruleAnyData();

                    	    state._fsp--;


                    	    				current.merge(this_AnyData_1);
                    	    			

                    	    				afterParserOrEnumRuleCall();
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt103 >= 1 ) break loop103;
                                EarlyExitException eee =
                                    new EarlyExitException(103, input);
                                throw eee;
                        }
                        cnt103++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3725:3: (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END )
                    {
                    // InternalPipelineParser.g:3725:3: (this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END )
                    // InternalPipelineParser.g:3726:4: this_BEGIN_2= RULE_BEGIN (kw= HyphenMinus this_AnyData_4= ruleAnyData )+ this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

                    				current.merge(this_BEGIN_2);
                    			

                    				newLeafNode(this_BEGIN_2, grammarAccess.getHyphenValuesAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    // InternalPipelineParser.g:3733:4: (kw= HyphenMinus this_AnyData_4= ruleAnyData )+
                    int cnt104=0;
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==HyphenMinus) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3734:5: kw= HyphenMinus this_AnyData_4= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,HyphenMinus,FOLLOW_33); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getHyphenValuesAccess().getHyphenMinusKeyword_1_1_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getHyphenValuesAccess().getAnyDataParserRuleCall_1_1_1());
                    	    				
                    	    pushFollow(FOLLOW_28);
                    	    this_AnyData_4=ruleAnyData();

                    	    state._fsp--;


                    	    					current.merge(this_AnyData_4);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt104 >= 1 ) break loop104;
                                EarlyExitException eee =
                                    new EarlyExitException(104, input);
                                throw eee;
                        }
                        cnt104++;
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
    // InternalPipelineParser.g:3762:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalPipelineParser.g:3762:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalPipelineParser.g:3763:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalPipelineParser.g:3769:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3775:2: (this_INT_0= RULE_INT )
            // InternalPipelineParser.g:3776:2: this_INT_0= RULE_INT
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
    // InternalPipelineParser.g:3786:1: entryRuleFloatingPoint returns [String current=null] : iv_ruleFloatingPoint= ruleFloatingPoint EOF ;
    public final String entryRuleFloatingPoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPoint = null;


        try {
            // InternalPipelineParser.g:3786:53: (iv_ruleFloatingPoint= ruleFloatingPoint EOF )
            // InternalPipelineParser.g:3787:2: iv_ruleFloatingPoint= ruleFloatingPoint EOF
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
    // InternalPipelineParser.g:3793:1: ruleFloatingPoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL ;
    public final AntlrDatatypeRuleToken ruleFloatingPoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_LITERAL_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3799:2: (this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL )
            // InternalPipelineParser.g:3800:2: this_FLOAT_LITERAL_0= RULE_FLOAT_LITERAL
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
    // InternalPipelineParser.g:3810:1: entryRuleSimpleWord returns [String current=null] : iv_ruleSimpleWord= ruleSimpleWord EOF ;
    public final String entryRuleSimpleWord() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleWord = null;


        try {
            // InternalPipelineParser.g:3810:50: (iv_ruleSimpleWord= ruleSimpleWord EOF )
            // InternalPipelineParser.g:3811:2: iv_ruleSimpleWord= ruleSimpleWord EOF
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
    // InternalPipelineParser.g:3817:1: ruleSimpleWord returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSimpleWord() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalPipelineParser.g:3823:2: (this_ID_0= RULE_ID )
            // InternalPipelineParser.g:3824:2: this_ID_0= RULE_ID
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
    // InternalPipelineParser.g:3834:1: entryRuleArrayList returns [String current=null] : iv_ruleArrayList= ruleArrayList EOF ;
    public final String entryRuleArrayList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArrayList = null;


        try {
            // InternalPipelineParser.g:3834:49: (iv_ruleArrayList= ruleArrayList EOF )
            // InternalPipelineParser.g:3835:2: iv_ruleArrayList= ruleArrayList EOF
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
    // InternalPipelineParser.g:3841:1: ruleArrayList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket ) ;
    public final AntlrDatatypeRuleToken ruleArrayList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AnyData_1 = null;

        AntlrDatatypeRuleToken this_AnyData_3 = null;



        	enterRule();

        try {
            // InternalPipelineParser.g:3847:2: ( (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket ) )
            // InternalPipelineParser.g:3848:2: (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket )
            {
            // InternalPipelineParser.g:3848:2: (kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket )
            // InternalPipelineParser.g:3849:3: kw= LeftSquareBracket (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )? kw= RightSquareBracket
            {
            kw=(Token)match(input,LeftSquareBracket,FOLLOW_72); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getArrayListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalPipelineParser.g:3854:3: (this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( ((LA107_0>=RULE_COMPLEX_EXPRESSION && LA107_0<=RULE_VERSION)||LA107_0==RULE_ID||LA107_0==RULE_STRING) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalPipelineParser.g:3855:4: this_AnyData_1= ruleAnyData (kw= Comma this_AnyData_3= ruleAnyData )*
                    {

                    				newCompositeNode(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_60);
                    this_AnyData_1=ruleAnyData();

                    state._fsp--;


                    				current.merge(this_AnyData_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalPipelineParser.g:3865:4: (kw= Comma this_AnyData_3= ruleAnyData )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==Comma) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalPipelineParser.g:3866:5: kw= Comma this_AnyData_3= ruleAnyData
                    	    {
                    	    kw=(Token)match(input,Comma,FOLLOW_33); 

                    	    					current.merge(kw);
                    	    					newLeafNode(kw, grammarAccess.getArrayListAccess().getCommaKeyword_1_1_0());
                    	    				

                    	    					newCompositeNode(grammarAccess.getArrayListAccess().getAnyDataParserRuleCall_1_1_1());
                    	    				
                    	    pushFollow(FOLLOW_60);
                    	    this_AnyData_3=ruleAnyData();

                    	    state._fsp--;


                    	    					current.merge(this_AnyData_3);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop106;
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
    // InternalPipelineParser.g:3892:1: rulePipelineKeyword returns [Enumerator current=null] : ( (enumLiteral_0= Name ) | (enumLiteral_1= On ) | (enumLiteral_2= RunName ) | (enumLiteral_3= If ) | (enumLiteral_4= RunsOn ) | (enumLiteral_5= Env ) | (enumLiteral_6= Defaults ) | (enumLiteral_7= Strategy ) | (enumLiteral_8= Matrix ) | (enumLiteral_9= Container ) | (enumLiteral_10= Services ) | (enumLiteral_11= Steps ) | (enumLiteral_12= Uses ) | (enumLiteral_13= Run ) | (enumLiteral_14= Shell ) | (enumLiteral_15= WorkingDirectory ) | (enumLiteral_16= With ) | (enumLiteral_17= TimeoutMinutes ) | (enumLiteral_18= ContinueOnError_1 ) | (enumLiteral_19= Condition ) | (enumLiteral_20= Environment ) | (enumLiteral_21= Id ) | (enumLiteral_22= Needs ) | (enumLiteral_23= Outputs ) | (enumLiteral_24= Secrets ) | (enumLiteral_25= Permissions ) | (enumLiteral_26= Concurrency ) | (enumLiteral_27= Timeouts ) | (enumLiteral_28= DefaultsRun ) | (enumLiteral_29= Workflow_dispatch ) | (enumLiteral_30= Workflow_call ) | (enumLiteral_31= Schedule ) | (enumLiteral_32= Push ) | (enumLiteral_33= Pull_request ) | (enumLiteral_34= Paths ) | (enumLiteral_35= Branches ) | (enumLiteral_36= Tags ) | (enumLiteral_37= BranchesIgnore ) | (enumLiteral_38= PathsIgnore ) | (enumLiteral_39= TagsIgnore ) | (enumLiteral_40= Cron ) | (enumLiteral_41= Repository_dispatch ) | (enumLiteral_42= Workflow_run ) | (enumLiteral_43= Checkout ) | (enumLiteral_44= Filters ) | (enumLiteral_45= Include ) | (enumLiteral_46= Exclude ) | (enumLiteral_47= FailFast ) | (enumLiteral_48= MaxParallel ) | (enumLiteral_49= ContainerImage ) | (enumLiteral_50= Credentials ) | (enumLiteral_51= Ports ) | (enumLiteral_52= Inherit ) | (enumLiteral_53= Trigger ) | (enumLiteral_54= Pool ) | (enumLiteral_55= DisplayName ) | (enumLiteral_56= Task ) | (enumLiteral_57= Template ) | (enumLiteral_58= DependsOn ) | (enumLiteral_59= Workspace ) | (enumLiteral_60= Parameters ) | (enumLiteral_61= VmImage ) | (enumLiteral_62= Resources ) | (enumLiteral_63= Pipeline ) | (enumLiteral_64= Stage ) | (enumLiteral_65= TimeoutInMinutes ) | (enumLiteral_66= ContinueOnError ) | (enumLiteral_67= ResourceType ) | (enumLiteral_68= ResourceName ) | (enumLiteral_69= Stages ) | (enumLiteral_70= Only ) | (enumLiteral_71= Except ) | (enumLiteral_72= Image ) | (enumLiteral_73= Variables ) | (enumLiteral_74= Cache ) | (enumLiteral_75= Artifacts ) | (enumLiteral_76= Retries ) | (enumLiteral_77= Rules ) | (enumLiteral_78= Before_script ) | (enumLiteral_79= After_script ) | (enumLiteral_80= Timeout ) | (enumLiteral_81= When ) | (enumLiteral_82= Allow_failure ) | (enumLiteral_83= Dependencies ) | (enumLiteral_84= Extends ) | (enumLiteral_85= Pipelines ) | (enumLiteral_86= Default ) | (enumLiteral_87= PullRequests ) | (enumLiteral_88= Step ) | (enumLiteral_89= Script ) | (enumLiteral_90= Definitions ) | (enumLiteral_91= Caches ) | (enumLiteral_92= Parallel ) | (enumLiteral_93= Conditions ) | (enumLiteral_94= MaxTime ) | (enumLiteral_95= Project ) | (enumLiteral_96= Plan ) | (enumLiteral_97= Tasks ) | (enumLiteral_98= Requirements ) | (enumLiteral_99= Final ) | (enumLiteral_100= Jdk ) | (enumLiteral_101= Labels ) | (enumLiteral_102= Repository ) | (enumLiteral_103= Deployment ) | (enumLiteral_104= Release ) | (enumLiteral_105= Version ) | (enumLiteral_106= Docker ) | (enumLiteral_107= Agent ) | (enumLiteral_108= Queue ) | (enumLiteral_109= Snapshot ) | (enumLiteral_110= Policy ) | (enumLiteral_111= Approvals ) | (enumLiteral_112= PreBuild ) | (enumLiteral_113= PostBuild ) | (enumLiteral_114= Ssh ) | (enumLiteral_115= Auth ) | (enumLiteral_116= Storage ) | (enumLiteral_117= Endpoints ) | (enumLiteral_118= Command ) | (enumLiteral_119= Provisioner ) | (enumLiteral_120= TriggerRules ) | (enumLiteral_121= RunPolicy ) | (enumLiteral_122= Queued ) | (enumLiteral_123= AutoCancel ) | (enumLiteral_124= Notifications ) | (enumLiteral_125= DeployTrigger ) | (enumLiteral_126= ReleaseTrigger ) | (enumLiteral_127= LockBehavior ) | (enumLiteral_128= ReviewStage ) ) ;
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
            // InternalPipelineParser.g:3898:2: ( ( (enumLiteral_0= Name ) | (enumLiteral_1= On ) | (enumLiteral_2= RunName ) | (enumLiteral_3= If ) | (enumLiteral_4= RunsOn ) | (enumLiteral_5= Env ) | (enumLiteral_6= Defaults ) | (enumLiteral_7= Strategy ) | (enumLiteral_8= Matrix ) | (enumLiteral_9= Container ) | (enumLiteral_10= Services ) | (enumLiteral_11= Steps ) | (enumLiteral_12= Uses ) | (enumLiteral_13= Run ) | (enumLiteral_14= Shell ) | (enumLiteral_15= WorkingDirectory ) | (enumLiteral_16= With ) | (enumLiteral_17= TimeoutMinutes ) | (enumLiteral_18= ContinueOnError_1 ) | (enumLiteral_19= Condition ) | (enumLiteral_20= Environment ) | (enumLiteral_21= Id ) | (enumLiteral_22= Needs ) | (enumLiteral_23= Outputs ) | (enumLiteral_24= Secrets ) | (enumLiteral_25= Permissions ) | (enumLiteral_26= Concurrency ) | (enumLiteral_27= Timeouts ) | (enumLiteral_28= DefaultsRun ) | (enumLiteral_29= Workflow_dispatch ) | (enumLiteral_30= Workflow_call ) | (enumLiteral_31= Schedule ) | (enumLiteral_32= Push ) | (enumLiteral_33= Pull_request ) | (enumLiteral_34= Paths ) | (enumLiteral_35= Branches ) | (enumLiteral_36= Tags ) | (enumLiteral_37= BranchesIgnore ) | (enumLiteral_38= PathsIgnore ) | (enumLiteral_39= TagsIgnore ) | (enumLiteral_40= Cron ) | (enumLiteral_41= Repository_dispatch ) | (enumLiteral_42= Workflow_run ) | (enumLiteral_43= Checkout ) | (enumLiteral_44= Filters ) | (enumLiteral_45= Include ) | (enumLiteral_46= Exclude ) | (enumLiteral_47= FailFast ) | (enumLiteral_48= MaxParallel ) | (enumLiteral_49= ContainerImage ) | (enumLiteral_50= Credentials ) | (enumLiteral_51= Ports ) | (enumLiteral_52= Inherit ) | (enumLiteral_53= Trigger ) | (enumLiteral_54= Pool ) | (enumLiteral_55= DisplayName ) | (enumLiteral_56= Task ) | (enumLiteral_57= Template ) | (enumLiteral_58= DependsOn ) | (enumLiteral_59= Workspace ) | (enumLiteral_60= Parameters ) | (enumLiteral_61= VmImage ) | (enumLiteral_62= Resources ) | (enumLiteral_63= Pipeline ) | (enumLiteral_64= Stage ) | (enumLiteral_65= TimeoutInMinutes ) | (enumLiteral_66= ContinueOnError ) | (enumLiteral_67= ResourceType ) | (enumLiteral_68= ResourceName ) | (enumLiteral_69= Stages ) | (enumLiteral_70= Only ) | (enumLiteral_71= Except ) | (enumLiteral_72= Image ) | (enumLiteral_73= Variables ) | (enumLiteral_74= Cache ) | (enumLiteral_75= Artifacts ) | (enumLiteral_76= Retries ) | (enumLiteral_77= Rules ) | (enumLiteral_78= Before_script ) | (enumLiteral_79= After_script ) | (enumLiteral_80= Timeout ) | (enumLiteral_81= When ) | (enumLiteral_82= Allow_failure ) | (enumLiteral_83= Dependencies ) | (enumLiteral_84= Extends ) | (enumLiteral_85= Pipelines ) | (enumLiteral_86= Default ) | (enumLiteral_87= PullRequests ) | (enumLiteral_88= Step ) | (enumLiteral_89= Script ) | (enumLiteral_90= Definitions ) | (enumLiteral_91= Caches ) | (enumLiteral_92= Parallel ) | (enumLiteral_93= Conditions ) | (enumLiteral_94= MaxTime ) | (enumLiteral_95= Project ) | (enumLiteral_96= Plan ) | (enumLiteral_97= Tasks ) | (enumLiteral_98= Requirements ) | (enumLiteral_99= Final ) | (enumLiteral_100= Jdk ) | (enumLiteral_101= Labels ) | (enumLiteral_102= Repository ) | (enumLiteral_103= Deployment ) | (enumLiteral_104= Release ) | (enumLiteral_105= Version ) | (enumLiteral_106= Docker ) | (enumLiteral_107= Agent ) | (enumLiteral_108= Queue ) | (enumLiteral_109= Snapshot ) | (enumLiteral_110= Policy ) | (enumLiteral_111= Approvals ) | (enumLiteral_112= PreBuild ) | (enumLiteral_113= PostBuild ) | (enumLiteral_114= Ssh ) | (enumLiteral_115= Auth ) | (enumLiteral_116= Storage ) | (enumLiteral_117= Endpoints ) | (enumLiteral_118= Command ) | (enumLiteral_119= Provisioner ) | (enumLiteral_120= TriggerRules ) | (enumLiteral_121= RunPolicy ) | (enumLiteral_122= Queued ) | (enumLiteral_123= AutoCancel ) | (enumLiteral_124= Notifications ) | (enumLiteral_125= DeployTrigger ) | (enumLiteral_126= ReleaseTrigger ) | (enumLiteral_127= LockBehavior ) | (enumLiteral_128= ReviewStage ) ) )
            // InternalPipelineParser.g:3899:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= On ) | (enumLiteral_2= RunName ) | (enumLiteral_3= If ) | (enumLiteral_4= RunsOn ) | (enumLiteral_5= Env ) | (enumLiteral_6= Defaults ) | (enumLiteral_7= Strategy ) | (enumLiteral_8= Matrix ) | (enumLiteral_9= Container ) | (enumLiteral_10= Services ) | (enumLiteral_11= Steps ) | (enumLiteral_12= Uses ) | (enumLiteral_13= Run ) | (enumLiteral_14= Shell ) | (enumLiteral_15= WorkingDirectory ) | (enumLiteral_16= With ) | (enumLiteral_17= TimeoutMinutes ) | (enumLiteral_18= ContinueOnError_1 ) | (enumLiteral_19= Condition ) | (enumLiteral_20= Environment ) | (enumLiteral_21= Id ) | (enumLiteral_22= Needs ) | (enumLiteral_23= Outputs ) | (enumLiteral_24= Secrets ) | (enumLiteral_25= Permissions ) | (enumLiteral_26= Concurrency ) | (enumLiteral_27= Timeouts ) | (enumLiteral_28= DefaultsRun ) | (enumLiteral_29= Workflow_dispatch ) | (enumLiteral_30= Workflow_call ) | (enumLiteral_31= Schedule ) | (enumLiteral_32= Push ) | (enumLiteral_33= Pull_request ) | (enumLiteral_34= Paths ) | (enumLiteral_35= Branches ) | (enumLiteral_36= Tags ) | (enumLiteral_37= BranchesIgnore ) | (enumLiteral_38= PathsIgnore ) | (enumLiteral_39= TagsIgnore ) | (enumLiteral_40= Cron ) | (enumLiteral_41= Repository_dispatch ) | (enumLiteral_42= Workflow_run ) | (enumLiteral_43= Checkout ) | (enumLiteral_44= Filters ) | (enumLiteral_45= Include ) | (enumLiteral_46= Exclude ) | (enumLiteral_47= FailFast ) | (enumLiteral_48= MaxParallel ) | (enumLiteral_49= ContainerImage ) | (enumLiteral_50= Credentials ) | (enumLiteral_51= Ports ) | (enumLiteral_52= Inherit ) | (enumLiteral_53= Trigger ) | (enumLiteral_54= Pool ) | (enumLiteral_55= DisplayName ) | (enumLiteral_56= Task ) | (enumLiteral_57= Template ) | (enumLiteral_58= DependsOn ) | (enumLiteral_59= Workspace ) | (enumLiteral_60= Parameters ) | (enumLiteral_61= VmImage ) | (enumLiteral_62= Resources ) | (enumLiteral_63= Pipeline ) | (enumLiteral_64= Stage ) | (enumLiteral_65= TimeoutInMinutes ) | (enumLiteral_66= ContinueOnError ) | (enumLiteral_67= ResourceType ) | (enumLiteral_68= ResourceName ) | (enumLiteral_69= Stages ) | (enumLiteral_70= Only ) | (enumLiteral_71= Except ) | (enumLiteral_72= Image ) | (enumLiteral_73= Variables ) | (enumLiteral_74= Cache ) | (enumLiteral_75= Artifacts ) | (enumLiteral_76= Retries ) | (enumLiteral_77= Rules ) | (enumLiteral_78= Before_script ) | (enumLiteral_79= After_script ) | (enumLiteral_80= Timeout ) | (enumLiteral_81= When ) | (enumLiteral_82= Allow_failure ) | (enumLiteral_83= Dependencies ) | (enumLiteral_84= Extends ) | (enumLiteral_85= Pipelines ) | (enumLiteral_86= Default ) | (enumLiteral_87= PullRequests ) | (enumLiteral_88= Step ) | (enumLiteral_89= Script ) | (enumLiteral_90= Definitions ) | (enumLiteral_91= Caches ) | (enumLiteral_92= Parallel ) | (enumLiteral_93= Conditions ) | (enumLiteral_94= MaxTime ) | (enumLiteral_95= Project ) | (enumLiteral_96= Plan ) | (enumLiteral_97= Tasks ) | (enumLiteral_98= Requirements ) | (enumLiteral_99= Final ) | (enumLiteral_100= Jdk ) | (enumLiteral_101= Labels ) | (enumLiteral_102= Repository ) | (enumLiteral_103= Deployment ) | (enumLiteral_104= Release ) | (enumLiteral_105= Version ) | (enumLiteral_106= Docker ) | (enumLiteral_107= Agent ) | (enumLiteral_108= Queue ) | (enumLiteral_109= Snapshot ) | (enumLiteral_110= Policy ) | (enumLiteral_111= Approvals ) | (enumLiteral_112= PreBuild ) | (enumLiteral_113= PostBuild ) | (enumLiteral_114= Ssh ) | (enumLiteral_115= Auth ) | (enumLiteral_116= Storage ) | (enumLiteral_117= Endpoints ) | (enumLiteral_118= Command ) | (enumLiteral_119= Provisioner ) | (enumLiteral_120= TriggerRules ) | (enumLiteral_121= RunPolicy ) | (enumLiteral_122= Queued ) | (enumLiteral_123= AutoCancel ) | (enumLiteral_124= Notifications ) | (enumLiteral_125= DeployTrigger ) | (enumLiteral_126= ReleaseTrigger ) | (enumLiteral_127= LockBehavior ) | (enumLiteral_128= ReviewStage ) )
            {
            // InternalPipelineParser.g:3899:2: ( (enumLiteral_0= Name ) | (enumLiteral_1= On ) | (enumLiteral_2= RunName ) | (enumLiteral_3= If ) | (enumLiteral_4= RunsOn ) | (enumLiteral_5= Env ) | (enumLiteral_6= Defaults ) | (enumLiteral_7= Strategy ) | (enumLiteral_8= Matrix ) | (enumLiteral_9= Container ) | (enumLiteral_10= Services ) | (enumLiteral_11= Steps ) | (enumLiteral_12= Uses ) | (enumLiteral_13= Run ) | (enumLiteral_14= Shell ) | (enumLiteral_15= WorkingDirectory ) | (enumLiteral_16= With ) | (enumLiteral_17= TimeoutMinutes ) | (enumLiteral_18= ContinueOnError_1 ) | (enumLiteral_19= Condition ) | (enumLiteral_20= Environment ) | (enumLiteral_21= Id ) | (enumLiteral_22= Needs ) | (enumLiteral_23= Outputs ) | (enumLiteral_24= Secrets ) | (enumLiteral_25= Permissions ) | (enumLiteral_26= Concurrency ) | (enumLiteral_27= Timeouts ) | (enumLiteral_28= DefaultsRun ) | (enumLiteral_29= Workflow_dispatch ) | (enumLiteral_30= Workflow_call ) | (enumLiteral_31= Schedule ) | (enumLiteral_32= Push ) | (enumLiteral_33= Pull_request ) | (enumLiteral_34= Paths ) | (enumLiteral_35= Branches ) | (enumLiteral_36= Tags ) | (enumLiteral_37= BranchesIgnore ) | (enumLiteral_38= PathsIgnore ) | (enumLiteral_39= TagsIgnore ) | (enumLiteral_40= Cron ) | (enumLiteral_41= Repository_dispatch ) | (enumLiteral_42= Workflow_run ) | (enumLiteral_43= Checkout ) | (enumLiteral_44= Filters ) | (enumLiteral_45= Include ) | (enumLiteral_46= Exclude ) | (enumLiteral_47= FailFast ) | (enumLiteral_48= MaxParallel ) | (enumLiteral_49= ContainerImage ) | (enumLiteral_50= Credentials ) | (enumLiteral_51= Ports ) | (enumLiteral_52= Inherit ) | (enumLiteral_53= Trigger ) | (enumLiteral_54= Pool ) | (enumLiteral_55= DisplayName ) | (enumLiteral_56= Task ) | (enumLiteral_57= Template ) | (enumLiteral_58= DependsOn ) | (enumLiteral_59= Workspace ) | (enumLiteral_60= Parameters ) | (enumLiteral_61= VmImage ) | (enumLiteral_62= Resources ) | (enumLiteral_63= Pipeline ) | (enumLiteral_64= Stage ) | (enumLiteral_65= TimeoutInMinutes ) | (enumLiteral_66= ContinueOnError ) | (enumLiteral_67= ResourceType ) | (enumLiteral_68= ResourceName ) | (enumLiteral_69= Stages ) | (enumLiteral_70= Only ) | (enumLiteral_71= Except ) | (enumLiteral_72= Image ) | (enumLiteral_73= Variables ) | (enumLiteral_74= Cache ) | (enumLiteral_75= Artifacts ) | (enumLiteral_76= Retries ) | (enumLiteral_77= Rules ) | (enumLiteral_78= Before_script ) | (enumLiteral_79= After_script ) | (enumLiteral_80= Timeout ) | (enumLiteral_81= When ) | (enumLiteral_82= Allow_failure ) | (enumLiteral_83= Dependencies ) | (enumLiteral_84= Extends ) | (enumLiteral_85= Pipelines ) | (enumLiteral_86= Default ) | (enumLiteral_87= PullRequests ) | (enumLiteral_88= Step ) | (enumLiteral_89= Script ) | (enumLiteral_90= Definitions ) | (enumLiteral_91= Caches ) | (enumLiteral_92= Parallel ) | (enumLiteral_93= Conditions ) | (enumLiteral_94= MaxTime ) | (enumLiteral_95= Project ) | (enumLiteral_96= Plan ) | (enumLiteral_97= Tasks ) | (enumLiteral_98= Requirements ) | (enumLiteral_99= Final ) | (enumLiteral_100= Jdk ) | (enumLiteral_101= Labels ) | (enumLiteral_102= Repository ) | (enumLiteral_103= Deployment ) | (enumLiteral_104= Release ) | (enumLiteral_105= Version ) | (enumLiteral_106= Docker ) | (enumLiteral_107= Agent ) | (enumLiteral_108= Queue ) | (enumLiteral_109= Snapshot ) | (enumLiteral_110= Policy ) | (enumLiteral_111= Approvals ) | (enumLiteral_112= PreBuild ) | (enumLiteral_113= PostBuild ) | (enumLiteral_114= Ssh ) | (enumLiteral_115= Auth ) | (enumLiteral_116= Storage ) | (enumLiteral_117= Endpoints ) | (enumLiteral_118= Command ) | (enumLiteral_119= Provisioner ) | (enumLiteral_120= TriggerRules ) | (enumLiteral_121= RunPolicy ) | (enumLiteral_122= Queued ) | (enumLiteral_123= AutoCancel ) | (enumLiteral_124= Notifications ) | (enumLiteral_125= DeployTrigger ) | (enumLiteral_126= ReleaseTrigger ) | (enumLiteral_127= LockBehavior ) | (enumLiteral_128= ReviewStage ) )
            int alt108=129;
            switch ( input.LA(1) ) {
            case Name:
                {
                alt108=1;
                }
                break;
            case On:
                {
                alt108=2;
                }
                break;
            case RunName:
                {
                alt108=3;
                }
                break;
            case If:
                {
                alt108=4;
                }
                break;
            case RunsOn:
                {
                alt108=5;
                }
                break;
            case Env:
                {
                alt108=6;
                }
                break;
            case Defaults:
                {
                alt108=7;
                }
                break;
            case Strategy:
                {
                alt108=8;
                }
                break;
            case Matrix:
                {
                alt108=9;
                }
                break;
            case Container:
                {
                alt108=10;
                }
                break;
            case Services:
                {
                alt108=11;
                }
                break;
            case Steps:
                {
                alt108=12;
                }
                break;
            case Uses:
                {
                alt108=13;
                }
                break;
            case Run:
                {
                alt108=14;
                }
                break;
            case Shell:
                {
                alt108=15;
                }
                break;
            case WorkingDirectory:
                {
                alt108=16;
                }
                break;
            case With:
                {
                alt108=17;
                }
                break;
            case TimeoutMinutes:
                {
                alt108=18;
                }
                break;
            case ContinueOnError_1:
                {
                alt108=19;
                }
                break;
            case Condition:
                {
                alt108=20;
                }
                break;
            case Environment:
                {
                alt108=21;
                }
                break;
            case Id:
                {
                alt108=22;
                }
                break;
            case Needs:
                {
                alt108=23;
                }
                break;
            case Outputs:
                {
                alt108=24;
                }
                break;
            case Secrets:
                {
                alt108=25;
                }
                break;
            case Permissions:
                {
                alt108=26;
                }
                break;
            case Concurrency:
                {
                alt108=27;
                }
                break;
            case Timeouts:
                {
                alt108=28;
                }
                break;
            case DefaultsRun:
                {
                alt108=29;
                }
                break;
            case Workflow_dispatch:
                {
                alt108=30;
                }
                break;
            case Workflow_call:
                {
                alt108=31;
                }
                break;
            case Schedule:
                {
                alt108=32;
                }
                break;
            case Push:
                {
                alt108=33;
                }
                break;
            case Pull_request:
                {
                alt108=34;
                }
                break;
            case Paths:
                {
                alt108=35;
                }
                break;
            case Branches:
                {
                alt108=36;
                }
                break;
            case Tags:
                {
                alt108=37;
                }
                break;
            case BranchesIgnore:
                {
                alt108=38;
                }
                break;
            case PathsIgnore:
                {
                alt108=39;
                }
                break;
            case TagsIgnore:
                {
                alt108=40;
                }
                break;
            case Cron:
                {
                alt108=41;
                }
                break;
            case Repository_dispatch:
                {
                alt108=42;
                }
                break;
            case Workflow_run:
                {
                alt108=43;
                }
                break;
            case Checkout:
                {
                alt108=44;
                }
                break;
            case Filters:
                {
                alt108=45;
                }
                break;
            case Include:
                {
                alt108=46;
                }
                break;
            case Exclude:
                {
                alt108=47;
                }
                break;
            case FailFast:
                {
                alt108=48;
                }
                break;
            case MaxParallel:
                {
                alt108=49;
                }
                break;
            case ContainerImage:
                {
                alt108=50;
                }
                break;
            case Credentials:
                {
                alt108=51;
                }
                break;
            case Ports:
                {
                alt108=52;
                }
                break;
            case Inherit:
                {
                alt108=53;
                }
                break;
            case Trigger:
                {
                alt108=54;
                }
                break;
            case Pool:
                {
                alt108=55;
                }
                break;
            case DisplayName:
                {
                alt108=56;
                }
                break;
            case Task:
                {
                alt108=57;
                }
                break;
            case Template:
                {
                alt108=58;
                }
                break;
            case DependsOn:
                {
                alt108=59;
                }
                break;
            case Workspace:
                {
                alt108=60;
                }
                break;
            case Parameters:
                {
                alt108=61;
                }
                break;
            case VmImage:
                {
                alt108=62;
                }
                break;
            case Resources:
                {
                alt108=63;
                }
                break;
            case Pipeline:
                {
                alt108=64;
                }
                break;
            case Stage:
                {
                alt108=65;
                }
                break;
            case TimeoutInMinutes:
                {
                alt108=66;
                }
                break;
            case ContinueOnError:
                {
                alt108=67;
                }
                break;
            case ResourceType:
                {
                alt108=68;
                }
                break;
            case ResourceName:
                {
                alt108=69;
                }
                break;
            case Stages:
                {
                alt108=70;
                }
                break;
            case Only:
                {
                alt108=71;
                }
                break;
            case Except:
                {
                alt108=72;
                }
                break;
            case Image:
                {
                alt108=73;
                }
                break;
            case Variables:
                {
                alt108=74;
                }
                break;
            case Cache:
                {
                alt108=75;
                }
                break;
            case Artifacts:
                {
                alt108=76;
                }
                break;
            case Retries:
                {
                alt108=77;
                }
                break;
            case Rules:
                {
                alt108=78;
                }
                break;
            case Before_script:
                {
                alt108=79;
                }
                break;
            case After_script:
                {
                alt108=80;
                }
                break;
            case Timeout:
                {
                alt108=81;
                }
                break;
            case When:
                {
                alt108=82;
                }
                break;
            case Allow_failure:
                {
                alt108=83;
                }
                break;
            case Dependencies:
                {
                alt108=84;
                }
                break;
            case Extends:
                {
                alt108=85;
                }
                break;
            case Pipelines:
                {
                alt108=86;
                }
                break;
            case Default:
                {
                alt108=87;
                }
                break;
            case PullRequests:
                {
                alt108=88;
                }
                break;
            case Step:
                {
                alt108=89;
                }
                break;
            case Script:
                {
                alt108=90;
                }
                break;
            case Definitions:
                {
                alt108=91;
                }
                break;
            case Caches:
                {
                alt108=92;
                }
                break;
            case Parallel:
                {
                alt108=93;
                }
                break;
            case Conditions:
                {
                alt108=94;
                }
                break;
            case MaxTime:
                {
                alt108=95;
                }
                break;
            case Project:
                {
                alt108=96;
                }
                break;
            case Plan:
                {
                alt108=97;
                }
                break;
            case Tasks:
                {
                alt108=98;
                }
                break;
            case Requirements:
                {
                alt108=99;
                }
                break;
            case Final:
                {
                alt108=100;
                }
                break;
            case Jdk:
                {
                alt108=101;
                }
                break;
            case Labels:
                {
                alt108=102;
                }
                break;
            case Repository:
                {
                alt108=103;
                }
                break;
            case Deployment:
                {
                alt108=104;
                }
                break;
            case Release:
                {
                alt108=105;
                }
                break;
            case Version:
                {
                alt108=106;
                }
                break;
            case Docker:
                {
                alt108=107;
                }
                break;
            case Agent:
                {
                alt108=108;
                }
                break;
            case Queue:
                {
                alt108=109;
                }
                break;
            case Snapshot:
                {
                alt108=110;
                }
                break;
            case Policy:
                {
                alt108=111;
                }
                break;
            case Approvals:
                {
                alt108=112;
                }
                break;
            case PreBuild:
                {
                alt108=113;
                }
                break;
            case PostBuild:
                {
                alt108=114;
                }
                break;
            case Ssh:
                {
                alt108=115;
                }
                break;
            case Auth:
                {
                alt108=116;
                }
                break;
            case Storage:
                {
                alt108=117;
                }
                break;
            case Endpoints:
                {
                alt108=118;
                }
                break;
            case Command:
                {
                alt108=119;
                }
                break;
            case Provisioner:
                {
                alt108=120;
                }
                break;
            case TriggerRules:
                {
                alt108=121;
                }
                break;
            case RunPolicy:
                {
                alt108=122;
                }
                break;
            case Queued:
                {
                alt108=123;
                }
                break;
            case AutoCancel:
                {
                alt108=124;
                }
                break;
            case Notifications:
                {
                alt108=125;
                }
                break;
            case DeployTrigger:
                {
                alt108=126;
                }
                break;
            case ReleaseTrigger:
                {
                alt108=127;
                }
                break;
            case LockBehavior:
                {
                alt108=128;
                }
                break;
            case ReviewStage:
                {
                alt108=129;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalPipelineParser.g:3900:3: (enumLiteral_0= Name )
                    {
                    // InternalPipelineParser.g:3900:3: (enumLiteral_0= Name )
                    // InternalPipelineParser.g:3901:4: enumLiteral_0= Name
                    {
                    enumLiteral_0=(Token)match(input,Name,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_NAMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPipelineKeywordAccess().getPPL_KW_NAMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPipelineParser.g:3908:3: (enumLiteral_1= On )
                    {
                    // InternalPipelineParser.g:3908:3: (enumLiteral_1= On )
                    // InternalPipelineParser.g:3909:4: enumLiteral_1= On
                    {
                    enumLiteral_1=(Token)match(input,On,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPipelineParser.g:3916:3: (enumLiteral_2= RunName )
                    {
                    // InternalPipelineParser.g:3916:3: (enumLiteral_2= RunName )
                    // InternalPipelineParser.g:3917:4: enumLiteral_2= RunName
                    {
                    enumLiteral_2=(Token)match(input,RunName,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUN_NAMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUN_NAMEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPipelineParser.g:3924:3: (enumLiteral_3= If )
                    {
                    // InternalPipelineParser.g:3924:3: (enumLiteral_3= If )
                    // InternalPipelineParser.g:3925:4: enumLiteral_3= If
                    {
                    enumLiteral_3=(Token)match(input,If,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_IFEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPipelineKeywordAccess().getPPL_KW_IFEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPipelineParser.g:3932:3: (enumLiteral_4= RunsOn )
                    {
                    // InternalPipelineParser.g:3932:3: (enumLiteral_4= RunsOn )
                    // InternalPipelineParser.g:3933:4: enumLiteral_4= RunsOn
                    {
                    enumLiteral_4=(Token)match(input,RunsOn,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNS_ONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNS_ONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPipelineParser.g:3940:3: (enumLiteral_5= Env )
                    {
                    // InternalPipelineParser.g:3940:3: (enumLiteral_5= Env )
                    // InternalPipelineParser.g:3941:4: enumLiteral_5= Env
                    {
                    enumLiteral_5=(Token)match(input,Env,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalPipelineParser.g:3948:3: (enumLiteral_6= Defaults )
                    {
                    // InternalPipelineParser.g:3948:3: (enumLiteral_6= Defaults )
                    // InternalPipelineParser.g:3949:4: enumLiteral_6= Defaults
                    {
                    enumLiteral_6=(Token)match(input,Defaults,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTSEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTSEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalPipelineParser.g:3956:3: (enumLiteral_7= Strategy )
                    {
                    // InternalPipelineParser.g:3956:3: (enumLiteral_7= Strategy )
                    // InternalPipelineParser.g:3957:4: enumLiteral_7= Strategy
                    {
                    enumLiteral_7=(Token)match(input,Strategy,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STRATEGYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STRATEGYEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalPipelineParser.g:3964:3: (enumLiteral_8= Matrix )
                    {
                    // InternalPipelineParser.g:3964:3: (enumLiteral_8= Matrix )
                    // InternalPipelineParser.g:3965:4: enumLiteral_8= Matrix
                    {
                    enumLiteral_8=(Token)match(input,Matrix,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_MATRIXEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPipelineKeywordAccess().getPPL_KW_MATRIXEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalPipelineParser.g:3972:3: (enumLiteral_9= Container )
                    {
                    // InternalPipelineParser.g:3972:3: (enumLiteral_9= Container )
                    // InternalPipelineParser.g:3973:4: enumLiteral_9= Container
                    {
                    enumLiteral_9=(Token)match(input,Container,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINEREnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINEREnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalPipelineParser.g:3980:3: (enumLiteral_10= Services )
                    {
                    // InternalPipelineParser.g:3980:3: (enumLiteral_10= Services )
                    // InternalPipelineParser.g:3981:4: enumLiteral_10= Services
                    {
                    enumLiteral_10=(Token)match(input,Services,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SERVICESEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SERVICESEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalPipelineParser.g:3988:3: (enumLiteral_11= Steps )
                    {
                    // InternalPipelineParser.g:3988:3: (enumLiteral_11= Steps )
                    // InternalPipelineParser.g:3989:4: enumLiteral_11= Steps
                    {
                    enumLiteral_11=(Token)match(input,Steps,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STEPSEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STEPSEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalPipelineParser.g:3996:3: (enumLiteral_12= Uses )
                    {
                    // InternalPipelineParser.g:3996:3: (enumLiteral_12= Uses )
                    // InternalPipelineParser.g:3997:4: enumLiteral_12= Uses
                    {
                    enumLiteral_12=(Token)match(input,Uses,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_USESEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getPipelineKeywordAccess().getPPL_KW_USESEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalPipelineParser.g:4004:3: (enumLiteral_13= Run )
                    {
                    // InternalPipelineParser.g:4004:3: (enumLiteral_13= Run )
                    // InternalPipelineParser.g:4005:4: enumLiteral_13= Run
                    {
                    enumLiteral_13=(Token)match(input,Run,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUNEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalPipelineParser.g:4012:3: (enumLiteral_14= Shell )
                    {
                    // InternalPipelineParser.g:4012:3: (enumLiteral_14= Shell )
                    // InternalPipelineParser.g:4013:4: enumLiteral_14= Shell
                    {
                    enumLiteral_14=(Token)match(input,Shell,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SHELLEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SHELLEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalPipelineParser.g:4020:3: (enumLiteral_15= WorkingDirectory )
                    {
                    // InternalPipelineParser.g:4020:3: (enumLiteral_15= WorkingDirectory )
                    // InternalPipelineParser.g:4021:4: enumLiteral_15= WorkingDirectory
                    {
                    enumLiteral_15=(Token)match(input,WorkingDirectory,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKING_DIRECTORYEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKING_DIRECTORYEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalPipelineParser.g:4028:3: (enumLiteral_16= With )
                    {
                    // InternalPipelineParser.g:4028:3: (enumLiteral_16= With )
                    // InternalPipelineParser.g:4029:4: enumLiteral_16= With
                    {
                    enumLiteral_16=(Token)match(input,With,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WITHEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WITHEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalPipelineParser.g:4036:3: (enumLiteral_17= TimeoutMinutes )
                    {
                    // InternalPipelineParser.g:4036:3: (enumLiteral_17= TimeoutMinutes )
                    // InternalPipelineParser.g:4037:4: enumLiteral_17= TimeoutMinutes
                    {
                    enumLiteral_17=(Token)match(input,TimeoutMinutes,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUT_MINUTESEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUT_MINUTESEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalPipelineParser.g:4044:3: (enumLiteral_18= ContinueOnError_1 )
                    {
                    // InternalPipelineParser.g:4044:3: (enumLiteral_18= ContinueOnError_1 )
                    // InternalPipelineParser.g:4045:4: enumLiteral_18= ContinueOnError_1
                    {
                    enumLiteral_18=(Token)match(input,ContinueOnError_1,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTINUE_ON_ERROREnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTINUE_ON_ERROREnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalPipelineParser.g:4052:3: (enumLiteral_19= Condition )
                    {
                    // InternalPipelineParser.g:4052:3: (enumLiteral_19= Condition )
                    // InternalPipelineParser.g:4053:4: enumLiteral_19= Condition
                    {
                    enumLiteral_19=(Token)match(input,Condition,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONDITIONEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONDITIONEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalPipelineParser.g:4060:3: (enumLiteral_20= Environment )
                    {
                    // InternalPipelineParser.g:4060:3: (enumLiteral_20= Environment )
                    // InternalPipelineParser.g:4061:4: enumLiteral_20= Environment
                    {
                    enumLiteral_20=(Token)match(input,Environment,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVIRONMENTEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENVIRONMENTEnumLiteralDeclaration_20());
                    			

                    }


                    }
                    break;
                case 22 :
                    // InternalPipelineParser.g:4068:3: (enumLiteral_21= Id )
                    {
                    // InternalPipelineParser.g:4068:3: (enumLiteral_21= Id )
                    // InternalPipelineParser.g:4069:4: enumLiteral_21= Id
                    {
                    enumLiteral_21=(Token)match(input,Id,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_IDEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_21, grammarAccess.getPipelineKeywordAccess().getPPL_KW_IDEnumLiteralDeclaration_21());
                    			

                    }


                    }
                    break;
                case 23 :
                    // InternalPipelineParser.g:4076:3: (enumLiteral_22= Needs )
                    {
                    // InternalPipelineParser.g:4076:3: (enumLiteral_22= Needs )
                    // InternalPipelineParser.g:4077:4: enumLiteral_22= Needs
                    {
                    enumLiteral_22=(Token)match(input,Needs,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_NEEDSEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_22, grammarAccess.getPipelineKeywordAccess().getPPL_KW_NEEDSEnumLiteralDeclaration_22());
                    			

                    }


                    }
                    break;
                case 24 :
                    // InternalPipelineParser.g:4084:3: (enumLiteral_23= Outputs )
                    {
                    // InternalPipelineParser.g:4084:3: (enumLiteral_23= Outputs )
                    // InternalPipelineParser.g:4085:4: enumLiteral_23= Outputs
                    {
                    enumLiteral_23=(Token)match(input,Outputs,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_OUTPUTSEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_23, grammarAccess.getPipelineKeywordAccess().getPPL_KW_OUTPUTSEnumLiteralDeclaration_23());
                    			

                    }


                    }
                    break;
                case 25 :
                    // InternalPipelineParser.g:4092:3: (enumLiteral_24= Secrets )
                    {
                    // InternalPipelineParser.g:4092:3: (enumLiteral_24= Secrets )
                    // InternalPipelineParser.g:4093:4: enumLiteral_24= Secrets
                    {
                    enumLiteral_24=(Token)match(input,Secrets,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SECRETSEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_24, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SECRETSEnumLiteralDeclaration_24());
                    			

                    }


                    }
                    break;
                case 26 :
                    // InternalPipelineParser.g:4100:3: (enumLiteral_25= Permissions )
                    {
                    // InternalPipelineParser.g:4100:3: (enumLiteral_25= Permissions )
                    // InternalPipelineParser.g:4101:4: enumLiteral_25= Permissions
                    {
                    enumLiteral_25=(Token)match(input,Permissions,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PERMISSIONSEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_25, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PERMISSIONSEnumLiteralDeclaration_25());
                    			

                    }


                    }
                    break;
                case 27 :
                    // InternalPipelineParser.g:4108:3: (enumLiteral_26= Concurrency )
                    {
                    // InternalPipelineParser.g:4108:3: (enumLiteral_26= Concurrency )
                    // InternalPipelineParser.g:4109:4: enumLiteral_26= Concurrency
                    {
                    enumLiteral_26=(Token)match(input,Concurrency,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONCURRENCYEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_26, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONCURRENCYEnumLiteralDeclaration_26());
                    			

                    }


                    }
                    break;
                case 28 :
                    // InternalPipelineParser.g:4116:3: (enumLiteral_27= Timeouts )
                    {
                    // InternalPipelineParser.g:4116:3: (enumLiteral_27= Timeouts )
                    // InternalPipelineParser.g:4117:4: enumLiteral_27= Timeouts
                    {
                    enumLiteral_27=(Token)match(input,Timeouts,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUTSEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_27, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUTSEnumLiteralDeclaration_27());
                    			

                    }


                    }
                    break;
                case 29 :
                    // InternalPipelineParser.g:4124:3: (enumLiteral_28= DefaultsRun )
                    {
                    // InternalPipelineParser.g:4124:3: (enumLiteral_28= DefaultsRun )
                    // InternalPipelineParser.g:4125:4: enumLiteral_28= DefaultsRun
                    {
                    enumLiteral_28=(Token)match(input,DefaultsRun,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTS_RUNEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_28, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTS_RUNEnumLiteralDeclaration_28());
                    			

                    }


                    }
                    break;
                case 30 :
                    // InternalPipelineParser.g:4132:3: (enumLiteral_29= Workflow_dispatch )
                    {
                    // InternalPipelineParser.g:4132:3: (enumLiteral_29= Workflow_dispatch )
                    // InternalPipelineParser.g:4133:4: enumLiteral_29= Workflow_dispatch
                    {
                    enumLiteral_29=(Token)match(input,Workflow_dispatch,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_DISPATCHEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_29, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_DISPATCHEnumLiteralDeclaration_29());
                    			

                    }


                    }
                    break;
                case 31 :
                    // InternalPipelineParser.g:4140:3: (enumLiteral_30= Workflow_call )
                    {
                    // InternalPipelineParser.g:4140:3: (enumLiteral_30= Workflow_call )
                    // InternalPipelineParser.g:4141:4: enumLiteral_30= Workflow_call
                    {
                    enumLiteral_30=(Token)match(input,Workflow_call,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_CALLEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_30, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_CALLEnumLiteralDeclaration_30());
                    			

                    }


                    }
                    break;
                case 32 :
                    // InternalPipelineParser.g:4148:3: (enumLiteral_31= Schedule )
                    {
                    // InternalPipelineParser.g:4148:3: (enumLiteral_31= Schedule )
                    // InternalPipelineParser.g:4149:4: enumLiteral_31= Schedule
                    {
                    enumLiteral_31=(Token)match(input,Schedule,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCHEDULEEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_31, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCHEDULEEnumLiteralDeclaration_31());
                    			

                    }


                    }
                    break;
                case 33 :
                    // InternalPipelineParser.g:4156:3: (enumLiteral_32= Push )
                    {
                    // InternalPipelineParser.g:4156:3: (enumLiteral_32= Push )
                    // InternalPipelineParser.g:4157:4: enumLiteral_32= Push
                    {
                    enumLiteral_32=(Token)match(input,Push,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PUSHEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_32, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PUSHEnumLiteralDeclaration_32());
                    			

                    }


                    }
                    break;
                case 34 :
                    // InternalPipelineParser.g:4164:3: (enumLiteral_33= Pull_request )
                    {
                    // InternalPipelineParser.g:4164:3: (enumLiteral_33= Pull_request )
                    // InternalPipelineParser.g:4165:4: enumLiteral_33= Pull_request
                    {
                    enumLiteral_33=(Token)match(input,Pull_request,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PULL_REQUESTEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_33, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PULL_REQUESTEnumLiteralDeclaration_33());
                    			

                    }


                    }
                    break;
                case 35 :
                    // InternalPipelineParser.g:4172:3: (enumLiteral_34= Paths )
                    {
                    // InternalPipelineParser.g:4172:3: (enumLiteral_34= Paths )
                    // InternalPipelineParser.g:4173:4: enumLiteral_34= Paths
                    {
                    enumLiteral_34=(Token)match(input,Paths,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHSEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_34, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHSEnumLiteralDeclaration_34());
                    			

                    }


                    }
                    break;
                case 36 :
                    // InternalPipelineParser.g:4180:3: (enumLiteral_35= Branches )
                    {
                    // InternalPipelineParser.g:4180:3: (enumLiteral_35= Branches )
                    // InternalPipelineParser.g:4181:4: enumLiteral_35= Branches
                    {
                    enumLiteral_35=(Token)match(input,Branches,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHESEnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_35, grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHESEnumLiteralDeclaration_35());
                    			

                    }


                    }
                    break;
                case 37 :
                    // InternalPipelineParser.g:4188:3: (enumLiteral_36= Tags )
                    {
                    // InternalPipelineParser.g:4188:3: (enumLiteral_36= Tags )
                    // InternalPipelineParser.g:4189:4: enumLiteral_36= Tags
                    {
                    enumLiteral_36=(Token)match(input,Tags,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGSEnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_36, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGSEnumLiteralDeclaration_36());
                    			

                    }


                    }
                    break;
                case 38 :
                    // InternalPipelineParser.g:4196:3: (enumLiteral_37= BranchesIgnore )
                    {
                    // InternalPipelineParser.g:4196:3: (enumLiteral_37= BranchesIgnore )
                    // InternalPipelineParser.g:4197:4: enumLiteral_37= BranchesIgnore
                    {
                    enumLiteral_37=(Token)match(input,BranchesIgnore,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHES_IGNOREEnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_37, grammarAccess.getPipelineKeywordAccess().getPPL_KW_BRANCHES_IGNOREEnumLiteralDeclaration_37());
                    			

                    }


                    }
                    break;
                case 39 :
                    // InternalPipelineParser.g:4204:3: (enumLiteral_38= PathsIgnore )
                    {
                    // InternalPipelineParser.g:4204:3: (enumLiteral_38= PathsIgnore )
                    // InternalPipelineParser.g:4205:4: enumLiteral_38= PathsIgnore
                    {
                    enumLiteral_38=(Token)match(input,PathsIgnore,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHS_IGNOREEnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_38, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PATHS_IGNOREEnumLiteralDeclaration_38());
                    			

                    }


                    }
                    break;
                case 40 :
                    // InternalPipelineParser.g:4212:3: (enumLiteral_39= TagsIgnore )
                    {
                    // InternalPipelineParser.g:4212:3: (enumLiteral_39= TagsIgnore )
                    // InternalPipelineParser.g:4213:4: enumLiteral_39= TagsIgnore
                    {
                    enumLiteral_39=(Token)match(input,TagsIgnore,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGS_IGNOREEnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_39, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TAGS_IGNOREEnumLiteralDeclaration_39());
                    			

                    }


                    }
                    break;
                case 41 :
                    // InternalPipelineParser.g:4220:3: (enumLiteral_40= Cron )
                    {
                    // InternalPipelineParser.g:4220:3: (enumLiteral_40= Cron )
                    // InternalPipelineParser.g:4221:4: enumLiteral_40= Cron
                    {
                    enumLiteral_40=(Token)match(input,Cron,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CRONEnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_40, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CRONEnumLiteralDeclaration_40());
                    			

                    }


                    }
                    break;
                case 42 :
                    // InternalPipelineParser.g:4228:3: (enumLiteral_41= Repository_dispatch )
                    {
                    // InternalPipelineParser.g:4228:3: (enumLiteral_41= Repository_dispatch )
                    // InternalPipelineParser.g:4229:4: enumLiteral_41= Repository_dispatch
                    {
                    enumLiteral_41=(Token)match(input,Repository_dispatch,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_REPOSITORY_DISPATCHEnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_41, grammarAccess.getPipelineKeywordAccess().getPPL_KW_REPOSITORY_DISPATCHEnumLiteralDeclaration_41());
                    			

                    }


                    }
                    break;
                case 43 :
                    // InternalPipelineParser.g:4236:3: (enumLiteral_42= Workflow_run )
                    {
                    // InternalPipelineParser.g:4236:3: (enumLiteral_42= Workflow_run )
                    // InternalPipelineParser.g:4237:4: enumLiteral_42= Workflow_run
                    {
                    enumLiteral_42=(Token)match(input,Workflow_run,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_RUNEnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_42, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKFLOW_RUNEnumLiteralDeclaration_42());
                    			

                    }


                    }
                    break;
                case 44 :
                    // InternalPipelineParser.g:4244:3: (enumLiteral_43= Checkout )
                    {
                    // InternalPipelineParser.g:4244:3: (enumLiteral_43= Checkout )
                    // InternalPipelineParser.g:4245:4: enumLiteral_43= Checkout
                    {
                    enumLiteral_43=(Token)match(input,Checkout,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CHECKOUTEnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_43, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CHECKOUTEnumLiteralDeclaration_43());
                    			

                    }


                    }
                    break;
                case 45 :
                    // InternalPipelineParser.g:4252:3: (enumLiteral_44= Filters )
                    {
                    // InternalPipelineParser.g:4252:3: (enumLiteral_44= Filters )
                    // InternalPipelineParser.g:4253:4: enumLiteral_44= Filters
                    {
                    enumLiteral_44=(Token)match(input,Filters,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_FILTERSEnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_44, grammarAccess.getPipelineKeywordAccess().getPPL_KW_FILTERSEnumLiteralDeclaration_44());
                    			

                    }


                    }
                    break;
                case 46 :
                    // InternalPipelineParser.g:4260:3: (enumLiteral_45= Include )
                    {
                    // InternalPipelineParser.g:4260:3: (enumLiteral_45= Include )
                    // InternalPipelineParser.g:4261:4: enumLiteral_45= Include
                    {
                    enumLiteral_45=(Token)match(input,Include,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_INCLUDEEnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_45, grammarAccess.getPipelineKeywordAccess().getPPL_KW_INCLUDEEnumLiteralDeclaration_45());
                    			

                    }


                    }
                    break;
                case 47 :
                    // InternalPipelineParser.g:4268:3: (enumLiteral_46= Exclude )
                    {
                    // InternalPipelineParser.g:4268:3: (enumLiteral_46= Exclude )
                    // InternalPipelineParser.g:4269:4: enumLiteral_46= Exclude
                    {
                    enumLiteral_46=(Token)match(input,Exclude,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXCLUDEEnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_46, grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXCLUDEEnumLiteralDeclaration_46());
                    			

                    }


                    }
                    break;
                case 48 :
                    // InternalPipelineParser.g:4276:3: (enumLiteral_47= FailFast )
                    {
                    // InternalPipelineParser.g:4276:3: (enumLiteral_47= FailFast )
                    // InternalPipelineParser.g:4277:4: enumLiteral_47= FailFast
                    {
                    enumLiteral_47=(Token)match(input,FailFast,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_FAIL_FASTEnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_47, grammarAccess.getPipelineKeywordAccess().getPPL_KW_FAIL_FASTEnumLiteralDeclaration_47());
                    			

                    }


                    }
                    break;
                case 49 :
                    // InternalPipelineParser.g:4284:3: (enumLiteral_48= MaxParallel )
                    {
                    // InternalPipelineParser.g:4284:3: (enumLiteral_48= MaxParallel )
                    // InternalPipelineParser.g:4285:4: enumLiteral_48= MaxParallel
                    {
                    enumLiteral_48=(Token)match(input,MaxParallel,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_MAX_PARALLELEnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_48, grammarAccess.getPipelineKeywordAccess().getPPL_KW_MAX_PARALLELEnumLiteralDeclaration_48());
                    			

                    }


                    }
                    break;
                case 50 :
                    // InternalPipelineParser.g:4292:3: (enumLiteral_49= ContainerImage )
                    {
                    // InternalPipelineParser.g:4292:3: (enumLiteral_49= ContainerImage )
                    // InternalPipelineParser.g:4293:4: enumLiteral_49= ContainerImage
                    {
                    enumLiteral_49=(Token)match(input,ContainerImage,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINER_IMAGEEnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_49, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTAINER_IMAGEEnumLiteralDeclaration_49());
                    			

                    }


                    }
                    break;
                case 51 :
                    // InternalPipelineParser.g:4300:3: (enumLiteral_50= Credentials )
                    {
                    // InternalPipelineParser.g:4300:3: (enumLiteral_50= Credentials )
                    // InternalPipelineParser.g:4301:4: enumLiteral_50= Credentials
                    {
                    enumLiteral_50=(Token)match(input,Credentials,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CREDENTIALSEnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_50, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CREDENTIALSEnumLiteralDeclaration_50());
                    			

                    }


                    }
                    break;
                case 52 :
                    // InternalPipelineParser.g:4308:3: (enumLiteral_51= Ports )
                    {
                    // InternalPipelineParser.g:4308:3: (enumLiteral_51= Ports )
                    // InternalPipelineParser.g:4309:4: enumLiteral_51= Ports
                    {
                    enumLiteral_51=(Token)match(input,Ports,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PORTSEnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_51, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PORTSEnumLiteralDeclaration_51());
                    			

                    }


                    }
                    break;
                case 53 :
                    // InternalPipelineParser.g:4316:3: (enumLiteral_52= Inherit )
                    {
                    // InternalPipelineParser.g:4316:3: (enumLiteral_52= Inherit )
                    // InternalPipelineParser.g:4317:4: enumLiteral_52= Inherit
                    {
                    enumLiteral_52=(Token)match(input,Inherit,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_INHERITEnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_52, grammarAccess.getPipelineKeywordAccess().getPPL_KW_INHERITEnumLiteralDeclaration_52());
                    			

                    }


                    }
                    break;
                case 54 :
                    // InternalPipelineParser.g:4324:3: (enumLiteral_53= Trigger )
                    {
                    // InternalPipelineParser.g:4324:3: (enumLiteral_53= Trigger )
                    // InternalPipelineParser.g:4325:4: enumLiteral_53= Trigger
                    {
                    enumLiteral_53=(Token)match(input,Trigger,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TRIGGEREnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_53, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TRIGGEREnumLiteralDeclaration_53());
                    			

                    }


                    }
                    break;
                case 55 :
                    // InternalPipelineParser.g:4332:3: (enumLiteral_54= Pool )
                    {
                    // InternalPipelineParser.g:4332:3: (enumLiteral_54= Pool )
                    // InternalPipelineParser.g:4333:4: enumLiteral_54= Pool
                    {
                    enumLiteral_54=(Token)match(input,Pool,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_POOLEnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_54, grammarAccess.getPipelineKeywordAccess().getPPL_KW_POOLEnumLiteralDeclaration_54());
                    			

                    }


                    }
                    break;
                case 56 :
                    // InternalPipelineParser.g:4340:3: (enumLiteral_55= DisplayName )
                    {
                    // InternalPipelineParser.g:4340:3: (enumLiteral_55= DisplayName )
                    // InternalPipelineParser.g:4341:4: enumLiteral_55= DisplayName
                    {
                    enumLiteral_55=(Token)match(input,DisplayName,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DISPLAY_NAMEEnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_55, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DISPLAY_NAMEEnumLiteralDeclaration_55());
                    			

                    }


                    }
                    break;
                case 57 :
                    // InternalPipelineParser.g:4348:3: (enumLiteral_56= Task )
                    {
                    // InternalPipelineParser.g:4348:3: (enumLiteral_56= Task )
                    // InternalPipelineParser.g:4349:4: enumLiteral_56= Task
                    {
                    enumLiteral_56=(Token)match(input,Task,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TASKEnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_56, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TASKEnumLiteralDeclaration_56());
                    			

                    }


                    }
                    break;
                case 58 :
                    // InternalPipelineParser.g:4356:3: (enumLiteral_57= Template )
                    {
                    // InternalPipelineParser.g:4356:3: (enumLiteral_57= Template )
                    // InternalPipelineParser.g:4357:4: enumLiteral_57= Template
                    {
                    enumLiteral_57=(Token)match(input,Template,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TEMPLATEEnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_57, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TEMPLATEEnumLiteralDeclaration_57());
                    			

                    }


                    }
                    break;
                case 59 :
                    // InternalPipelineParser.g:4364:3: (enumLiteral_58= DependsOn )
                    {
                    // InternalPipelineParser.g:4364:3: (enumLiteral_58= DependsOn )
                    // InternalPipelineParser.g:4365:4: enumLiteral_58= DependsOn
                    {
                    enumLiteral_58=(Token)match(input,DependsOn,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPENDS_ONEnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_58, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPENDS_ONEnumLiteralDeclaration_58());
                    			

                    }


                    }
                    break;
                case 60 :
                    // InternalPipelineParser.g:4372:3: (enumLiteral_59= Workspace )
                    {
                    // InternalPipelineParser.g:4372:3: (enumLiteral_59= Workspace )
                    // InternalPipelineParser.g:4373:4: enumLiteral_59= Workspace
                    {
                    enumLiteral_59=(Token)match(input,Workspace,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKSPACEEnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_59, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WORKSPACEEnumLiteralDeclaration_59());
                    			

                    }


                    }
                    break;
                case 61 :
                    // InternalPipelineParser.g:4380:3: (enumLiteral_60= Parameters )
                    {
                    // InternalPipelineParser.g:4380:3: (enumLiteral_60= Parameters )
                    // InternalPipelineParser.g:4381:4: enumLiteral_60= Parameters
                    {
                    enumLiteral_60=(Token)match(input,Parameters,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PARAMETERSEnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_60, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PARAMETERSEnumLiteralDeclaration_60());
                    			

                    }


                    }
                    break;
                case 62 :
                    // InternalPipelineParser.g:4388:3: (enumLiteral_61= VmImage )
                    {
                    // InternalPipelineParser.g:4388:3: (enumLiteral_61= VmImage )
                    // InternalPipelineParser.g:4389:4: enumLiteral_61= VmImage
                    {
                    enumLiteral_61=(Token)match(input,VmImage,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_POOL_VM_IMAGEEnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_61, grammarAccess.getPipelineKeywordAccess().getPPL_KW_POOL_VM_IMAGEEnumLiteralDeclaration_61());
                    			

                    }


                    }
                    break;
                case 63 :
                    // InternalPipelineParser.g:4396:3: (enumLiteral_62= Resources )
                    {
                    // InternalPipelineParser.g:4396:3: (enumLiteral_62= Resources )
                    // InternalPipelineParser.g:4397:4: enumLiteral_62= Resources
                    {
                    enumLiteral_62=(Token)match(input,Resources,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCESEnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_62, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCESEnumLiteralDeclaration_62());
                    			

                    }


                    }
                    break;
                case 64 :
                    // InternalPipelineParser.g:4404:3: (enumLiteral_63= Pipeline )
                    {
                    // InternalPipelineParser.g:4404:3: (enumLiteral_63= Pipeline )
                    // InternalPipelineParser.g:4405:4: enumLiteral_63= Pipeline
                    {
                    enumLiteral_63=(Token)match(input,Pipeline,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINEEnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_63, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINEEnumLiteralDeclaration_63());
                    			

                    }


                    }
                    break;
                case 65 :
                    // InternalPipelineParser.g:4412:3: (enumLiteral_64= Stage )
                    {
                    // InternalPipelineParser.g:4412:3: (enumLiteral_64= Stage )
                    // InternalPipelineParser.g:4413:4: enumLiteral_64= Stage
                    {
                    enumLiteral_64=(Token)match(input,Stage,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STAGEEnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_64, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STAGEEnumLiteralDeclaration_64());
                    			

                    }


                    }
                    break;
                case 66 :
                    // InternalPipelineParser.g:4420:3: (enumLiteral_65= TimeoutInMinutes )
                    {
                    // InternalPipelineParser.g:4420:3: (enumLiteral_65= TimeoutInMinutes )
                    // InternalPipelineParser.g:4421:4: enumLiteral_65= TimeoutInMinutes
                    {
                    enumLiteral_65=(Token)match(input,TimeoutInMinutes,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUT_IN_MINUTESEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_65, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUT_IN_MINUTESEnumLiteralDeclaration_65());
                    			

                    }


                    }
                    break;
                case 67 :
                    // InternalPipelineParser.g:4428:3: (enumLiteral_66= ContinueOnError )
                    {
                    // InternalPipelineParser.g:4428:3: (enumLiteral_66= ContinueOnError )
                    // InternalPipelineParser.g:4429:4: enumLiteral_66= ContinueOnError
                    {
                    enumLiteral_66=(Token)match(input,ContinueOnError,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTINUE_ON_ERREnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_66, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONTINUE_ON_ERREnumLiteralDeclaration_66());
                    			

                    }


                    }
                    break;
                case 68 :
                    // InternalPipelineParser.g:4436:3: (enumLiteral_67= ResourceType )
                    {
                    // InternalPipelineParser.g:4436:3: (enumLiteral_67= ResourceType )
                    // InternalPipelineParser.g:4437:4: enumLiteral_67= ResourceType
                    {
                    enumLiteral_67=(Token)match(input,ResourceType,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCE_TYPEEnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_67, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCE_TYPEEnumLiteralDeclaration_67());
                    			

                    }


                    }
                    break;
                case 69 :
                    // InternalPipelineParser.g:4444:3: (enumLiteral_68= ResourceName )
                    {
                    // InternalPipelineParser.g:4444:3: (enumLiteral_68= ResourceName )
                    // InternalPipelineParser.g:4445:4: enumLiteral_68= ResourceName
                    {
                    enumLiteral_68=(Token)match(input,ResourceName,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCE_NAMEEnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_68, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RESOURCE_NAMEEnumLiteralDeclaration_68());
                    			

                    }


                    }
                    break;
                case 70 :
                    // InternalPipelineParser.g:4452:3: (enumLiteral_69= Stages )
                    {
                    // InternalPipelineParser.g:4452:3: (enumLiteral_69= Stages )
                    // InternalPipelineParser.g:4453:4: enumLiteral_69= Stages
                    {
                    enumLiteral_69=(Token)match(input,Stages,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STAGESEnumLiteralDeclaration_69().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_69, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STAGESEnumLiteralDeclaration_69());
                    			

                    }


                    }
                    break;
                case 71 :
                    // InternalPipelineParser.g:4460:3: (enumLiteral_70= Only )
                    {
                    // InternalPipelineParser.g:4460:3: (enumLiteral_70= Only )
                    // InternalPipelineParser.g:4461:4: enumLiteral_70= Only
                    {
                    enumLiteral_70=(Token)match(input,Only,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ONLYEnumLiteralDeclaration_70().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_70, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ONLYEnumLiteralDeclaration_70());
                    			

                    }


                    }
                    break;
                case 72 :
                    // InternalPipelineParser.g:4468:3: (enumLiteral_71= Except )
                    {
                    // InternalPipelineParser.g:4468:3: (enumLiteral_71= Except )
                    // InternalPipelineParser.g:4469:4: enumLiteral_71= Except
                    {
                    enumLiteral_71=(Token)match(input,Except,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXCEPTEnumLiteralDeclaration_71().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_71, grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXCEPTEnumLiteralDeclaration_71());
                    			

                    }


                    }
                    break;
                case 73 :
                    // InternalPipelineParser.g:4476:3: (enumLiteral_72= Image )
                    {
                    // InternalPipelineParser.g:4476:3: (enumLiteral_72= Image )
                    // InternalPipelineParser.g:4477:4: enumLiteral_72= Image
                    {
                    enumLiteral_72=(Token)match(input,Image,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_IMAGEEnumLiteralDeclaration_72().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_72, grammarAccess.getPipelineKeywordAccess().getPPL_KW_IMAGEEnumLiteralDeclaration_72());
                    			

                    }


                    }
                    break;
                case 74 :
                    // InternalPipelineParser.g:4484:3: (enumLiteral_73= Variables )
                    {
                    // InternalPipelineParser.g:4484:3: (enumLiteral_73= Variables )
                    // InternalPipelineParser.g:4485:4: enumLiteral_73= Variables
                    {
                    enumLiteral_73=(Token)match(input,Variables,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_VARIABLESEnumLiteralDeclaration_73().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_73, grammarAccess.getPipelineKeywordAccess().getPPL_KW_VARIABLESEnumLiteralDeclaration_73());
                    			

                    }


                    }
                    break;
                case 75 :
                    // InternalPipelineParser.g:4492:3: (enumLiteral_74= Cache )
                    {
                    // InternalPipelineParser.g:4492:3: (enumLiteral_74= Cache )
                    // InternalPipelineParser.g:4493:4: enumLiteral_74= Cache
                    {
                    enumLiteral_74=(Token)match(input,Cache,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CACHEEnumLiteralDeclaration_74().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_74, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CACHEEnumLiteralDeclaration_74());
                    			

                    }


                    }
                    break;
                case 76 :
                    // InternalPipelineParser.g:4500:3: (enumLiteral_75= Artifacts )
                    {
                    // InternalPipelineParser.g:4500:3: (enumLiteral_75= Artifacts )
                    // InternalPipelineParser.g:4501:4: enumLiteral_75= Artifacts
                    {
                    enumLiteral_75=(Token)match(input,Artifacts,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ARTIFACTSEnumLiteralDeclaration_75().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_75, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ARTIFACTSEnumLiteralDeclaration_75());
                    			

                    }


                    }
                    break;
                case 77 :
                    // InternalPipelineParser.g:4508:3: (enumLiteral_76= Retries )
                    {
                    // InternalPipelineParser.g:4508:3: (enumLiteral_76= Retries )
                    // InternalPipelineParser.g:4509:4: enumLiteral_76= Retries
                    {
                    enumLiteral_76=(Token)match(input,Retries,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RETRIESEnumLiteralDeclaration_76().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_76, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RETRIESEnumLiteralDeclaration_76());
                    			

                    }


                    }
                    break;
                case 78 :
                    // InternalPipelineParser.g:4516:3: (enumLiteral_77= Rules )
                    {
                    // InternalPipelineParser.g:4516:3: (enumLiteral_77= Rules )
                    // InternalPipelineParser.g:4517:4: enumLiteral_77= Rules
                    {
                    enumLiteral_77=(Token)match(input,Rules,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RULESEnumLiteralDeclaration_77().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_77, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RULESEnumLiteralDeclaration_77());
                    			

                    }


                    }
                    break;
                case 79 :
                    // InternalPipelineParser.g:4524:3: (enumLiteral_78= Before_script )
                    {
                    // InternalPipelineParser.g:4524:3: (enumLiteral_78= Before_script )
                    // InternalPipelineParser.g:4525:4: enumLiteral_78= Before_script
                    {
                    enumLiteral_78=(Token)match(input,Before_script,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_BEFORE_SCRIPTEnumLiteralDeclaration_78().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_78, grammarAccess.getPipelineKeywordAccess().getPPL_KW_BEFORE_SCRIPTEnumLiteralDeclaration_78());
                    			

                    }


                    }
                    break;
                case 80 :
                    // InternalPipelineParser.g:4532:3: (enumLiteral_79= After_script )
                    {
                    // InternalPipelineParser.g:4532:3: (enumLiteral_79= After_script )
                    // InternalPipelineParser.g:4533:4: enumLiteral_79= After_script
                    {
                    enumLiteral_79=(Token)match(input,After_script,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_AFTER_SCRIPTEnumLiteralDeclaration_79().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_79, grammarAccess.getPipelineKeywordAccess().getPPL_KW_AFTER_SCRIPTEnumLiteralDeclaration_79());
                    			

                    }


                    }
                    break;
                case 81 :
                    // InternalPipelineParser.g:4540:3: (enumLiteral_80= Timeout )
                    {
                    // InternalPipelineParser.g:4540:3: (enumLiteral_80= Timeout )
                    // InternalPipelineParser.g:4541:4: enumLiteral_80= Timeout
                    {
                    enumLiteral_80=(Token)match(input,Timeout,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUTEnumLiteralDeclaration_80().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_80, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TIMEOUTEnumLiteralDeclaration_80());
                    			

                    }


                    }
                    break;
                case 82 :
                    // InternalPipelineParser.g:4548:3: (enumLiteral_81= When )
                    {
                    // InternalPipelineParser.g:4548:3: (enumLiteral_81= When )
                    // InternalPipelineParser.g:4549:4: enumLiteral_81= When
                    {
                    enumLiteral_81=(Token)match(input,When,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_WHENEnumLiteralDeclaration_81().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_81, grammarAccess.getPipelineKeywordAccess().getPPL_KW_WHENEnumLiteralDeclaration_81());
                    			

                    }


                    }
                    break;
                case 83 :
                    // InternalPipelineParser.g:4556:3: (enumLiteral_82= Allow_failure )
                    {
                    // InternalPipelineParser.g:4556:3: (enumLiteral_82= Allow_failure )
                    // InternalPipelineParser.g:4557:4: enumLiteral_82= Allow_failure
                    {
                    enumLiteral_82=(Token)match(input,Allow_failure,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ALLOW_FAILUREEnumLiteralDeclaration_82().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_82, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ALLOW_FAILUREEnumLiteralDeclaration_82());
                    			

                    }


                    }
                    break;
                case 84 :
                    // InternalPipelineParser.g:4564:3: (enumLiteral_83= Dependencies )
                    {
                    // InternalPipelineParser.g:4564:3: (enumLiteral_83= Dependencies )
                    // InternalPipelineParser.g:4565:4: enumLiteral_83= Dependencies
                    {
                    enumLiteral_83=(Token)match(input,Dependencies,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPENDENCIESEnumLiteralDeclaration_83().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_83, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPENDENCIESEnumLiteralDeclaration_83());
                    			

                    }


                    }
                    break;
                case 85 :
                    // InternalPipelineParser.g:4572:3: (enumLiteral_84= Extends )
                    {
                    // InternalPipelineParser.g:4572:3: (enumLiteral_84= Extends )
                    // InternalPipelineParser.g:4573:4: enumLiteral_84= Extends
                    {
                    enumLiteral_84=(Token)match(input,Extends,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXTENDSEnumLiteralDeclaration_84().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_84, grammarAccess.getPipelineKeywordAccess().getPPL_KW_EXTENDSEnumLiteralDeclaration_84());
                    			

                    }


                    }
                    break;
                case 86 :
                    // InternalPipelineParser.g:4580:3: (enumLiteral_85= Pipelines )
                    {
                    // InternalPipelineParser.g:4580:3: (enumLiteral_85= Pipelines )
                    // InternalPipelineParser.g:4581:4: enumLiteral_85= Pipelines
                    {
                    enumLiteral_85=(Token)match(input,Pipelines,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINESEnumLiteralDeclaration_85().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_85, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PIPELINESEnumLiteralDeclaration_85());
                    			

                    }


                    }
                    break;
                case 87 :
                    // InternalPipelineParser.g:4588:3: (enumLiteral_86= Default )
                    {
                    // InternalPipelineParser.g:4588:3: (enumLiteral_86= Default )
                    // InternalPipelineParser.g:4589:4: enumLiteral_86= Default
                    {
                    enumLiteral_86=(Token)match(input,Default,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTEnumLiteralDeclaration_86().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_86, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFAULTEnumLiteralDeclaration_86());
                    			

                    }


                    }
                    break;
                case 88 :
                    // InternalPipelineParser.g:4596:3: (enumLiteral_87= PullRequests )
                    {
                    // InternalPipelineParser.g:4596:3: (enumLiteral_87= PullRequests )
                    // InternalPipelineParser.g:4597:4: enumLiteral_87= PullRequests
                    {
                    enumLiteral_87=(Token)match(input,PullRequests,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PULL_REQUESTSEnumLiteralDeclaration_87().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_87, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PULL_REQUESTSEnumLiteralDeclaration_87());
                    			

                    }


                    }
                    break;
                case 89 :
                    // InternalPipelineParser.g:4604:3: (enumLiteral_88= Step )
                    {
                    // InternalPipelineParser.g:4604:3: (enumLiteral_88= Step )
                    // InternalPipelineParser.g:4605:4: enumLiteral_88= Step
                    {
                    enumLiteral_88=(Token)match(input,Step,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STEPEnumLiteralDeclaration_88().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_88, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STEPEnumLiteralDeclaration_88());
                    			

                    }


                    }
                    break;
                case 90 :
                    // InternalPipelineParser.g:4612:3: (enumLiteral_89= Script )
                    {
                    // InternalPipelineParser.g:4612:3: (enumLiteral_89= Script )
                    // InternalPipelineParser.g:4613:4: enumLiteral_89= Script
                    {
                    enumLiteral_89=(Token)match(input,Script,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCRIPTEnumLiteralDeclaration_89().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_89, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SCRIPTEnumLiteralDeclaration_89());
                    			

                    }


                    }
                    break;
                case 91 :
                    // InternalPipelineParser.g:4620:3: (enumLiteral_90= Definitions )
                    {
                    // InternalPipelineParser.g:4620:3: (enumLiteral_90= Definitions )
                    // InternalPipelineParser.g:4621:4: enumLiteral_90= Definitions
                    {
                    enumLiteral_90=(Token)match(input,Definitions,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFINITIONSEnumLiteralDeclaration_90().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_90, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEFINITIONSEnumLiteralDeclaration_90());
                    			

                    }


                    }
                    break;
                case 92 :
                    // InternalPipelineParser.g:4628:3: (enumLiteral_91= Caches )
                    {
                    // InternalPipelineParser.g:4628:3: (enumLiteral_91= Caches )
                    // InternalPipelineParser.g:4629:4: enumLiteral_91= Caches
                    {
                    enumLiteral_91=(Token)match(input,Caches,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CACHESEnumLiteralDeclaration_91().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_91, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CACHESEnumLiteralDeclaration_91());
                    			

                    }


                    }
                    break;
                case 93 :
                    // InternalPipelineParser.g:4636:3: (enumLiteral_92= Parallel )
                    {
                    // InternalPipelineParser.g:4636:3: (enumLiteral_92= Parallel )
                    // InternalPipelineParser.g:4637:4: enumLiteral_92= Parallel
                    {
                    enumLiteral_92=(Token)match(input,Parallel,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PARALLELEnumLiteralDeclaration_92().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_92, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PARALLELEnumLiteralDeclaration_92());
                    			

                    }


                    }
                    break;
                case 94 :
                    // InternalPipelineParser.g:4644:3: (enumLiteral_93= Conditions )
                    {
                    // InternalPipelineParser.g:4644:3: (enumLiteral_93= Conditions )
                    // InternalPipelineParser.g:4645:4: enumLiteral_93= Conditions
                    {
                    enumLiteral_93=(Token)match(input,Conditions,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONDITIONSEnumLiteralDeclaration_93().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_93, grammarAccess.getPipelineKeywordAccess().getPPL_KW_CONDITIONSEnumLiteralDeclaration_93());
                    			

                    }


                    }
                    break;
                case 95 :
                    // InternalPipelineParser.g:4652:3: (enumLiteral_94= MaxTime )
                    {
                    // InternalPipelineParser.g:4652:3: (enumLiteral_94= MaxTime )
                    // InternalPipelineParser.g:4653:4: enumLiteral_94= MaxTime
                    {
                    enumLiteral_94=(Token)match(input,MaxTime,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_MAX_TIMEEnumLiteralDeclaration_94().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_94, grammarAccess.getPipelineKeywordAccess().getPPL_KW_MAX_TIMEEnumLiteralDeclaration_94());
                    			

                    }


                    }
                    break;
                case 96 :
                    // InternalPipelineParser.g:4660:3: (enumLiteral_95= Project )
                    {
                    // InternalPipelineParser.g:4660:3: (enumLiteral_95= Project )
                    // InternalPipelineParser.g:4661:4: enumLiteral_95= Project
                    {
                    enumLiteral_95=(Token)match(input,Project,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PROJECTEnumLiteralDeclaration_95().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_95, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PROJECTEnumLiteralDeclaration_95());
                    			

                    }


                    }
                    break;
                case 97 :
                    // InternalPipelineParser.g:4668:3: (enumLiteral_96= Plan )
                    {
                    // InternalPipelineParser.g:4668:3: (enumLiteral_96= Plan )
                    // InternalPipelineParser.g:4669:4: enumLiteral_96= Plan
                    {
                    enumLiteral_96=(Token)match(input,Plan,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PLANEnumLiteralDeclaration_96().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_96, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PLANEnumLiteralDeclaration_96());
                    			

                    }


                    }
                    break;
                case 98 :
                    // InternalPipelineParser.g:4676:3: (enumLiteral_97= Tasks )
                    {
                    // InternalPipelineParser.g:4676:3: (enumLiteral_97= Tasks )
                    // InternalPipelineParser.g:4677:4: enumLiteral_97= Tasks
                    {
                    enumLiteral_97=(Token)match(input,Tasks,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TASKSEnumLiteralDeclaration_97().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_97, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TASKSEnumLiteralDeclaration_97());
                    			

                    }


                    }
                    break;
                case 99 :
                    // InternalPipelineParser.g:4684:3: (enumLiteral_98= Requirements )
                    {
                    // InternalPipelineParser.g:4684:3: (enumLiteral_98= Requirements )
                    // InternalPipelineParser.g:4685:4: enumLiteral_98= Requirements
                    {
                    enumLiteral_98=(Token)match(input,Requirements,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_REQUIREMENTSEnumLiteralDeclaration_98().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_98, grammarAccess.getPipelineKeywordAccess().getPPL_KW_REQUIREMENTSEnumLiteralDeclaration_98());
                    			

                    }


                    }
                    break;
                case 100 :
                    // InternalPipelineParser.g:4692:3: (enumLiteral_99= Final )
                    {
                    // InternalPipelineParser.g:4692:3: (enumLiteral_99= Final )
                    // InternalPipelineParser.g:4693:4: enumLiteral_99= Final
                    {
                    enumLiteral_99=(Token)match(input,Final,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_FINALEnumLiteralDeclaration_99().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_99, grammarAccess.getPipelineKeywordAccess().getPPL_KW_FINALEnumLiteralDeclaration_99());
                    			

                    }


                    }
                    break;
                case 101 :
                    // InternalPipelineParser.g:4700:3: (enumLiteral_100= Jdk )
                    {
                    // InternalPipelineParser.g:4700:3: (enumLiteral_100= Jdk )
                    // InternalPipelineParser.g:4701:4: enumLiteral_100= Jdk
                    {
                    enumLiteral_100=(Token)match(input,Jdk,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_JDKEnumLiteralDeclaration_100().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_100, grammarAccess.getPipelineKeywordAccess().getPPL_KW_JDKEnumLiteralDeclaration_100());
                    			

                    }


                    }
                    break;
                case 102 :
                    // InternalPipelineParser.g:4708:3: (enumLiteral_101= Labels )
                    {
                    // InternalPipelineParser.g:4708:3: (enumLiteral_101= Labels )
                    // InternalPipelineParser.g:4709:4: enumLiteral_101= Labels
                    {
                    enumLiteral_101=(Token)match(input,Labels,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_LABELSEnumLiteralDeclaration_101().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_101, grammarAccess.getPipelineKeywordAccess().getPPL_KW_LABELSEnumLiteralDeclaration_101());
                    			

                    }


                    }
                    break;
                case 103 :
                    // InternalPipelineParser.g:4716:3: (enumLiteral_102= Repository )
                    {
                    // InternalPipelineParser.g:4716:3: (enumLiteral_102= Repository )
                    // InternalPipelineParser.g:4717:4: enumLiteral_102= Repository
                    {
                    enumLiteral_102=(Token)match(input,Repository,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_REPOSITORYEnumLiteralDeclaration_102().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_102, grammarAccess.getPipelineKeywordAccess().getPPL_KW_REPOSITORYEnumLiteralDeclaration_102());
                    			

                    }


                    }
                    break;
                case 104 :
                    // InternalPipelineParser.g:4724:3: (enumLiteral_103= Deployment )
                    {
                    // InternalPipelineParser.g:4724:3: (enumLiteral_103= Deployment )
                    // InternalPipelineParser.g:4725:4: enumLiteral_103= Deployment
                    {
                    enumLiteral_103=(Token)match(input,Deployment,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPLOYMENTEnumLiteralDeclaration_103().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_103, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPLOYMENTEnumLiteralDeclaration_103());
                    			

                    }


                    }
                    break;
                case 105 :
                    // InternalPipelineParser.g:4732:3: (enumLiteral_104= Release )
                    {
                    // InternalPipelineParser.g:4732:3: (enumLiteral_104= Release )
                    // InternalPipelineParser.g:4733:4: enumLiteral_104= Release
                    {
                    enumLiteral_104=(Token)match(input,Release,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RELEASEEnumLiteralDeclaration_104().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_104, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RELEASEEnumLiteralDeclaration_104());
                    			

                    }


                    }
                    break;
                case 106 :
                    // InternalPipelineParser.g:4740:3: (enumLiteral_105= Version )
                    {
                    // InternalPipelineParser.g:4740:3: (enumLiteral_105= Version )
                    // InternalPipelineParser.g:4741:4: enumLiteral_105= Version
                    {
                    enumLiteral_105=(Token)match(input,Version,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_VERSIONEnumLiteralDeclaration_105().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_105, grammarAccess.getPipelineKeywordAccess().getPPL_KW_VERSIONEnumLiteralDeclaration_105());
                    			

                    }


                    }
                    break;
                case 107 :
                    // InternalPipelineParser.g:4748:3: (enumLiteral_106= Docker )
                    {
                    // InternalPipelineParser.g:4748:3: (enumLiteral_106= Docker )
                    // InternalPipelineParser.g:4749:4: enumLiteral_106= Docker
                    {
                    enumLiteral_106=(Token)match(input,Docker,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DOCKEREnumLiteralDeclaration_106().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_106, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DOCKEREnumLiteralDeclaration_106());
                    			

                    }


                    }
                    break;
                case 108 :
                    // InternalPipelineParser.g:4756:3: (enumLiteral_107= Agent )
                    {
                    // InternalPipelineParser.g:4756:3: (enumLiteral_107= Agent )
                    // InternalPipelineParser.g:4757:4: enumLiteral_107= Agent
                    {
                    enumLiteral_107=(Token)match(input,Agent,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_AGENTEnumLiteralDeclaration_107().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_107, grammarAccess.getPipelineKeywordAccess().getPPL_KW_AGENTEnumLiteralDeclaration_107());
                    			

                    }


                    }
                    break;
                case 109 :
                    // InternalPipelineParser.g:4764:3: (enumLiteral_108= Queue )
                    {
                    // InternalPipelineParser.g:4764:3: (enumLiteral_108= Queue )
                    // InternalPipelineParser.g:4765:4: enumLiteral_108= Queue
                    {
                    enumLiteral_108=(Token)match(input,Queue,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_QUEUEEnumLiteralDeclaration_108().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_108, grammarAccess.getPipelineKeywordAccess().getPPL_KW_QUEUEEnumLiteralDeclaration_108());
                    			

                    }


                    }
                    break;
                case 110 :
                    // InternalPipelineParser.g:4772:3: (enumLiteral_109= Snapshot )
                    {
                    // InternalPipelineParser.g:4772:3: (enumLiteral_109= Snapshot )
                    // InternalPipelineParser.g:4773:4: enumLiteral_109= Snapshot
                    {
                    enumLiteral_109=(Token)match(input,Snapshot,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SNAPSHOTEnumLiteralDeclaration_109().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_109, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SNAPSHOTEnumLiteralDeclaration_109());
                    			

                    }


                    }
                    break;
                case 111 :
                    // InternalPipelineParser.g:4780:3: (enumLiteral_110= Policy )
                    {
                    // InternalPipelineParser.g:4780:3: (enumLiteral_110= Policy )
                    // InternalPipelineParser.g:4781:4: enumLiteral_110= Policy
                    {
                    enumLiteral_110=(Token)match(input,Policy,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_POLICYEnumLiteralDeclaration_110().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_110, grammarAccess.getPipelineKeywordAccess().getPPL_KW_POLICYEnumLiteralDeclaration_110());
                    			

                    }


                    }
                    break;
                case 112 :
                    // InternalPipelineParser.g:4788:3: (enumLiteral_111= Approvals )
                    {
                    // InternalPipelineParser.g:4788:3: (enumLiteral_111= Approvals )
                    // InternalPipelineParser.g:4789:4: enumLiteral_111= Approvals
                    {
                    enumLiteral_111=(Token)match(input,Approvals,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_APPROVALSEnumLiteralDeclaration_111().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_111, grammarAccess.getPipelineKeywordAccess().getPPL_KW_APPROVALSEnumLiteralDeclaration_111());
                    			

                    }


                    }
                    break;
                case 113 :
                    // InternalPipelineParser.g:4796:3: (enumLiteral_112= PreBuild )
                    {
                    // InternalPipelineParser.g:4796:3: (enumLiteral_112= PreBuild )
                    // InternalPipelineParser.g:4797:4: enumLiteral_112= PreBuild
                    {
                    enumLiteral_112=(Token)match(input,PreBuild,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PREBUILDEnumLiteralDeclaration_112().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_112, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PREBUILDEnumLiteralDeclaration_112());
                    			

                    }


                    }
                    break;
                case 114 :
                    // InternalPipelineParser.g:4804:3: (enumLiteral_113= PostBuild )
                    {
                    // InternalPipelineParser.g:4804:3: (enumLiteral_113= PostBuild )
                    // InternalPipelineParser.g:4805:4: enumLiteral_113= PostBuild
                    {
                    enumLiteral_113=(Token)match(input,PostBuild,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_POSTBUILDEnumLiteralDeclaration_113().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_113, grammarAccess.getPipelineKeywordAccess().getPPL_KW_POSTBUILDEnumLiteralDeclaration_113());
                    			

                    }


                    }
                    break;
                case 115 :
                    // InternalPipelineParser.g:4812:3: (enumLiteral_114= Ssh )
                    {
                    // InternalPipelineParser.g:4812:3: (enumLiteral_114= Ssh )
                    // InternalPipelineParser.g:4813:4: enumLiteral_114= Ssh
                    {
                    enumLiteral_114=(Token)match(input,Ssh,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_SSHEnumLiteralDeclaration_114().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_114, grammarAccess.getPipelineKeywordAccess().getPPL_KW_SSHEnumLiteralDeclaration_114());
                    			

                    }


                    }
                    break;
                case 116 :
                    // InternalPipelineParser.g:4820:3: (enumLiteral_115= Auth )
                    {
                    // InternalPipelineParser.g:4820:3: (enumLiteral_115= Auth )
                    // InternalPipelineParser.g:4821:4: enumLiteral_115= Auth
                    {
                    enumLiteral_115=(Token)match(input,Auth,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_AUTHEnumLiteralDeclaration_115().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_115, grammarAccess.getPipelineKeywordAccess().getPPL_KW_AUTHEnumLiteralDeclaration_115());
                    			

                    }


                    }
                    break;
                case 117 :
                    // InternalPipelineParser.g:4828:3: (enumLiteral_116= Storage )
                    {
                    // InternalPipelineParser.g:4828:3: (enumLiteral_116= Storage )
                    // InternalPipelineParser.g:4829:4: enumLiteral_116= Storage
                    {
                    enumLiteral_116=(Token)match(input,Storage,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_STORAGEEnumLiteralDeclaration_116().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_116, grammarAccess.getPipelineKeywordAccess().getPPL_KW_STORAGEEnumLiteralDeclaration_116());
                    			

                    }


                    }
                    break;
                case 118 :
                    // InternalPipelineParser.g:4836:3: (enumLiteral_117= Endpoints )
                    {
                    // InternalPipelineParser.g:4836:3: (enumLiteral_117= Endpoints )
                    // InternalPipelineParser.g:4837:4: enumLiteral_117= Endpoints
                    {
                    enumLiteral_117=(Token)match(input,Endpoints,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENDPOINTSEnumLiteralDeclaration_117().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_117, grammarAccess.getPipelineKeywordAccess().getPPL_KW_ENDPOINTSEnumLiteralDeclaration_117());
                    			

                    }


                    }
                    break;
                case 119 :
                    // InternalPipelineParser.g:4844:3: (enumLiteral_118= Command )
                    {
                    // InternalPipelineParser.g:4844:3: (enumLiteral_118= Command )
                    // InternalPipelineParser.g:4845:4: enumLiteral_118= Command
                    {
                    enumLiteral_118=(Token)match(input,Command,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_COMMANDEnumLiteralDeclaration_118().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_118, grammarAccess.getPipelineKeywordAccess().getPPL_KW_COMMANDEnumLiteralDeclaration_118());
                    			

                    }


                    }
                    break;
                case 120 :
                    // InternalPipelineParser.g:4852:3: (enumLiteral_119= Provisioner )
                    {
                    // InternalPipelineParser.g:4852:3: (enumLiteral_119= Provisioner )
                    // InternalPipelineParser.g:4853:4: enumLiteral_119= Provisioner
                    {
                    enumLiteral_119=(Token)match(input,Provisioner,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_PROVISIONEREnumLiteralDeclaration_119().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_119, grammarAccess.getPipelineKeywordAccess().getPPL_KW_PROVISIONEREnumLiteralDeclaration_119());
                    			

                    }


                    }
                    break;
                case 121 :
                    // InternalPipelineParser.g:4860:3: (enumLiteral_120= TriggerRules )
                    {
                    // InternalPipelineParser.g:4860:3: (enumLiteral_120= TriggerRules )
                    // InternalPipelineParser.g:4861:4: enumLiteral_120= TriggerRules
                    {
                    enumLiteral_120=(Token)match(input,TriggerRules,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_TRIGGER_RULESEnumLiteralDeclaration_120().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_120, grammarAccess.getPipelineKeywordAccess().getPPL_KW_TRIGGER_RULESEnumLiteralDeclaration_120());
                    			

                    }


                    }
                    break;
                case 122 :
                    // InternalPipelineParser.g:4868:3: (enumLiteral_121= RunPolicy )
                    {
                    // InternalPipelineParser.g:4868:3: (enumLiteral_121= RunPolicy )
                    // InternalPipelineParser.g:4869:4: enumLiteral_121= RunPolicy
                    {
                    enumLiteral_121=(Token)match(input,RunPolicy,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUN_POLICYEnumLiteralDeclaration_121().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_121, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RUN_POLICYEnumLiteralDeclaration_121());
                    			

                    }


                    }
                    break;
                case 123 :
                    // InternalPipelineParser.g:4876:3: (enumLiteral_122= Queued )
                    {
                    // InternalPipelineParser.g:4876:3: (enumLiteral_122= Queued )
                    // InternalPipelineParser.g:4877:4: enumLiteral_122= Queued
                    {
                    enumLiteral_122=(Token)match(input,Queued,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_QUEUEDEnumLiteralDeclaration_122().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_122, grammarAccess.getPipelineKeywordAccess().getPPL_KW_QUEUEDEnumLiteralDeclaration_122());
                    			

                    }


                    }
                    break;
                case 124 :
                    // InternalPipelineParser.g:4884:3: (enumLiteral_123= AutoCancel )
                    {
                    // InternalPipelineParser.g:4884:3: (enumLiteral_123= AutoCancel )
                    // InternalPipelineParser.g:4885:4: enumLiteral_123= AutoCancel
                    {
                    enumLiteral_123=(Token)match(input,AutoCancel,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_AUTO_CANCELEnumLiteralDeclaration_123().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_123, grammarAccess.getPipelineKeywordAccess().getPPL_KW_AUTO_CANCELEnumLiteralDeclaration_123());
                    			

                    }


                    }
                    break;
                case 125 :
                    // InternalPipelineParser.g:4892:3: (enumLiteral_124= Notifications )
                    {
                    // InternalPipelineParser.g:4892:3: (enumLiteral_124= Notifications )
                    // InternalPipelineParser.g:4893:4: enumLiteral_124= Notifications
                    {
                    enumLiteral_124=(Token)match(input,Notifications,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_NOTIFICATIONSEnumLiteralDeclaration_124().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_124, grammarAccess.getPipelineKeywordAccess().getPPL_KW_NOTIFICATIONSEnumLiteralDeclaration_124());
                    			

                    }


                    }
                    break;
                case 126 :
                    // InternalPipelineParser.g:4900:3: (enumLiteral_125= DeployTrigger )
                    {
                    // InternalPipelineParser.g:4900:3: (enumLiteral_125= DeployTrigger )
                    // InternalPipelineParser.g:4901:4: enumLiteral_125= DeployTrigger
                    {
                    enumLiteral_125=(Token)match(input,DeployTrigger,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPLOY_TRIGGEREnumLiteralDeclaration_125().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_125, grammarAccess.getPipelineKeywordAccess().getPPL_KW_DEPLOY_TRIGGEREnumLiteralDeclaration_125());
                    			

                    }


                    }
                    break;
                case 127 :
                    // InternalPipelineParser.g:4908:3: (enumLiteral_126= ReleaseTrigger )
                    {
                    // InternalPipelineParser.g:4908:3: (enumLiteral_126= ReleaseTrigger )
                    // InternalPipelineParser.g:4909:4: enumLiteral_126= ReleaseTrigger
                    {
                    enumLiteral_126=(Token)match(input,ReleaseTrigger,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_RELEASE_TRIGGEREnumLiteralDeclaration_126().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_126, grammarAccess.getPipelineKeywordAccess().getPPL_KW_RELEASE_TRIGGEREnumLiteralDeclaration_126());
                    			

                    }


                    }
                    break;
                case 128 :
                    // InternalPipelineParser.g:4916:3: (enumLiteral_127= LockBehavior )
                    {
                    // InternalPipelineParser.g:4916:3: (enumLiteral_127= LockBehavior )
                    // InternalPipelineParser.g:4917:4: enumLiteral_127= LockBehavior
                    {
                    enumLiteral_127=(Token)match(input,LockBehavior,FOLLOW_2); 

                    				current = grammarAccess.getPipelineKeywordAccess().getPPL_KW_LOCK_BEHAVIOREnumLiteralDeclaration_127().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_127, grammarAccess.getPipelineKeywordAccess().getPPL_KW_LOCK_BEHAVIOREnumLiteralDeclaration_127());
                    			

                    }


                    }
                    break;
                case 129 :
                    // InternalPipelineParser.g:4924:3: (enumLiteral_128= ReviewStage )
                    {
                    // InternalPipelineParser.g:4924:3: (enumLiteral_128= ReviewStage )
                    // InternalPipelineParser.g:4925:4: enumLiteral_128= ReviewStage
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


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA89 dfa89 = new DFA89(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\1\27\uffff";
    static final String dfa_3s = "\1\10\11\uffff\5\0\11\uffff";
    static final String dfa_4s = "\1\u00b1\11\uffff\5\0\11\uffff";
    static final String dfa_5s = "\1\uffff\1\16\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\5\uffff\1\10\1\11\1\12\1\13\1\14\1\uffff\1\15\1\uffff\1\7";
    static final String dfa_6s = "\1\0\11\uffff\1\1\1\2\1\3\1\4\1\5\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\31\uffff\1\11\16\uffff\1\12\1\10\10\uffff\1\14\3\uffff\1\20\2\uffff\1\22\3\uffff\1\16\1\4\7\uffff\1\3\10\uffff\1\13\2\uffff\1\23\1\uffff\1\23\13\uffff\1\21\14\uffff\1\25\24\uffff\1\25\1\2\1\uffff\1\15\1\uffff\1\17\11\uffff\1\7\26\uffff\1\4",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 78:5: ( ({...}? => ( ({...}? => (otherlv_1= Name ( (lv_name_2_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= RunName ( (lv_runName_4_0= ruleUnquotedString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Defaults this_BEGIN_7= RULE_BEGIN otherlv_8= Run this_BEGIN_9= RULE_BEGIN (otherlv_10= Shell ( (lv_defaultShellValue_11_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_12= WorkingDirectory ( (lv_defaultWDValue_13_0= RULE_STRING ) ) )? this_END_14= RULE_END this_END_15= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= Env this_BEGIN_17= RULE_BEGIN ( (otherlv_18= HyphenMinus )? ( (lv_env_19_0= ruleKeyValue ) ) )* this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Permission ( ( (lv_allPermission_22_0= RULE_ID ) ) | (this_BEGIN_23= RULE_BEGIN ( (lv_indPermissions_24_0= ruleIndPermissionValue ) )* this_END_25= RULE_END ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= Concurrency (this_BEGIN_27= RULE_BEGIN (otherlv_28= Group ( ( (lv_group_29_1= RULE_ID | lv_group_29_2= RULE_COMPLEX_EXPRESSION ) ) ) ) (otherlv_30= CancelInProgress ( ( (lv_cancelConcurrence_31_1= RULE_ID | lv_cancelConcurrence_31_2= RULE_COMPLEX_EXPRESSION ) ) ) ) this_END_32= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pipelineParameters_33_0= rulePipelineParameter ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_34= Pool ( ( ( ( ({...}? => ( ({...}? => (this_BEGIN_36= RULE_BEGIN (otherlv_37= Name ( (lv_vmName_38_0= RULE_ID ) ) ) (otherlv_39= VmImage ( ( (lv_vmImage_40_1= RULE_ID | lv_vmImage_40_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_41= Demands ( ( (lv_vmDemands_42_1= ruleAnyData | lv_vmDemands_42_2= ruleHyphenValues ) ) ) )? this_END_43= RULE_END ) ) ) ) )+ {...}?) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= Resources (this_BEGIN_45= RULE_BEGIN ( (lv_resources_46_0= ruleResource ) )* this_END_47= RULE_END ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= Version ( (lv_version_49_0= RULE_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= Variables ( (lv_pplVariables_51_0= ruleVariable ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_extendedParameter_52_0= ruleExtendedParameter ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_pipelineParameters_53_0= rulePipelineParameter ) )* ( ( ( (lv_jobOrStageVar_54_1= Stages | lv_jobOrStageVar_54_2= Jobs ) ) ) this_BEGIN_55= RULE_BEGIN ( ( (lv_stages_56_0= ruleStage ) )* | ( (lv_jobs_57_0= ruleJob ) )* ) this_END_58= RULE_END ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA23_0==EOF) ) {s = 1;}

                        else if ( LA23_0 == Name && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA23_0 == RunName && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( ( LA23_0 == WorkingDirectory || LA23_0 == Defaults || LA23_0 == RULE_END ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA23_0 == Env && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 3) ) {s = 7;}

                        else if ( LA23_0 == Permission && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 4) ) {s = 8;}

                        else if ( LA23_0 == Concurrency && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 5) ) {s = 9;}

                        else if ( LA23_0 == Parameters && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) ) {s = 10;}

                        else if ( LA23_0 == Default && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) ) {s = 11;}

                        else if ( LA23_0 == Executors && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) ) {s = 12;}

                        else if ( LA23_0 == Orbs && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) ) {s = 13;}

                        else if ( LA23_0 == Commands && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) ) {s = 14;}

                        else if ( LA23_0 == Pool && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 7) ) {s = 15;}

                        else if ( LA23_0 == Resources && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 8) ) {s = 16;}

                        else if ( LA23_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 9) ) {s = 17;}

                        else if ( LA23_0 == Variables && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 10) ) {s = 18;}

                        else if ( ( LA23_0 == Extends || LA23_0 == Include ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 11) ) {s = 19;}

                        else if ( ( LA23_0 == Stages || LA23_0 == Jobs ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_10 = input.LA(1);

                         
                        int index23_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index23_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_11 = input.LA(1);

                         
                        int index23_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index23_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_12 = input.LA(1);

                         
                        int index23_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index23_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_13 = input.LA(1);

                         
                        int index23_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index23_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_14 = input.LA(1);

                         
                        int index23_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 6) ) {s = 23;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getPipelineAccess().getUnorderedGroup(), 12) ) {s = 21;}

                         
                        input.seek(index23_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\2\14\uffff";
    static final String dfa_10s = "\1\47\1\0\2\uffff\1\0\10\uffff";
    static final String dfa_11s = "\1\u00b1\1\0\2\uffff\1\0\10\uffff";
    static final String dfa_12s = "\2\uffff\1\3\10\uffff\1\2\1\1";
    static final String dfa_13s = "\1\0\1\1\2\uffff\1\2\10\uffff}>";
    static final String[] dfa_14s = {
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 2054:13: ( ({...}? => ( ({...}? => (this_BEGIN_10= RULE_BEGIN (otherlv_11= Name ( (lv_vmName_12_0= RULE_ID ) ) ) (otherlv_13= VmImage ( ( (lv_vmImage_14_1= RULE_ID | lv_vmImage_14_2= RULE_STRING ) ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_15= Demands ( ( (lv_vmDemands_16_1= ruleAnyData | lv_vmDemands_16_2= ruleHyphenValues ) ) ) )? this_END_17= RULE_END ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_0 = input.LA(1);

                         
                        int index55_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA55_0==RULE_END) ) {s = 1;}

                        else if ( (LA55_0==EOF||LA55_0==IsSkippable||LA55_0==Condition||LA55_0==DependsOn||LA55_0==Variables||LA55_0==Jobs||LA55_0==Pool||LA55_0==HyphenMinus) ) {s = 2;}

                        else if ( (LA55_0==RULE_BEGIN) ) {s = 4;}

                        else if ( LA55_0 == Demands && getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 1) ) {s = 11;}

                         
                        input.seek(index55_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1()) ) {s = 2;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1(), 0) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getStageAccess().getUnorderedGroup_1_1_1_1()) ) {s = 2;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\u0089\uffff";
    static final String dfa_16s = "\1\2\u0088\uffff";
    static final String dfa_17s = "\1\4\1\0\1\uffff\1\0\3\uffff\2\0\u0080\uffff";
    static final String dfa_18s = "\1\u00b5\1\0\1\uffff\1\0\3\uffff\2\0\u0080\uffff";
    static final String dfa_19s = "\2\uffff\1\4\3\uffff\1\1\2\uffff\1\3\176\uffff\1\2";
    static final String dfa_20s = "\1\0\1\1\1\uffff\1\2\3\uffff\1\3\1\4\u0080\uffff}>";
    static final String[] dfa_21s = {
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

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()+ loopback of 2470:6: ( ({...}? => ( ({...}? => (this_BEGIN_6= RULE_BEGIN ( ( ( (lv_nameKW_7_1= Name | lv_nameKW_7_2= DisplayName ) ) ) ( (lv_jobName_8_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_dependKW_9_1= Needs | lv_dependKW_9_2= DependsOn ) ) ) ( ( (otherlv_10= RULE_ID ) ) | (otherlv_11= LeftSquareBracket ( (otherlv_12= RULE_ID ) ) (otherlv_13= Comma ( (otherlv_14= RULE_ID ) ) )* otherlv_15= RightSquareBracket ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_jobParameterValues_16_0= ruleJobParameter ) )* (otherlv_17= Steps ( (lv_steps_18_0= ruleStep ) )* )? this_END_19= RULE_END ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_0 = input.LA(1);

                         
                        int index74_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_0==RULE_END) ) {s = 1;}

                        else if ( (LA74_0==EOF||LA74_0==HyphenMinus||LA74_0==RULE_STRING) ) {s = 2;}

                        else if ( (LA74_0==RULE_ID) ) {s = 3;}

                        else if ( LA74_0 == RULE_BEGIN && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 0) ) {s = 6;}

                        else if ( LA74_0 == Needs && ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) ) {s = 7;}

                        else if ( LA74_0 == DependsOn && ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) ) {s = 8;}

                        else if ( ( LA74_0 == Repository_dispatch || LA74_0 >= ContinueOnError_1 && LA74_0 <= Pull_request || LA74_0 >= Requirements && LA74_0 <= Environment || LA74_0 >= Permissions && LA74_0 <= Conditions || LA74_0 == Deployment || LA74_0 == Parameters || LA74_0 >= Repository && LA74_0 <= Container || LA74_0 == Endpoints || LA74_0 >= FailFast && LA74_0 <= RunPolicy || LA74_0 >= Variables && LA74_0 <= Checkout || LA74_0 == Defaults || LA74_0 == MaxTime || LA74_0 >= Parallel && LA74_0 <= PreBuild || LA74_0 >= RunName && LA74_0 <= Timeouts || LA74_0 >= Command && LA74_0 <= Default || LA74_0 >= Exclude && LA74_0 <= Project || LA74_0 >= Release && LA74_0 <= VmImage || LA74_0 >= Caches && LA74_0 <= Docker || LA74_0 >= Except && LA74_0 <= Agent || LA74_0 >= Cache && LA74_0 <= Final || LA74_0 == Image || LA74_0 >= Paths && LA74_0 <= Tasks || LA74_0 == Auth || LA74_0 == Cron || LA74_0 >= Name && LA74_0 <= Only || LA74_0 >= Plan && LA74_0 <= Push || LA74_0 >= Step && LA74_0 <= With || LA74_0 >= Env && LA74_0 <= Jdk || LA74_0 >= Run && LA74_0 <= On ) && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 9;}

                         
                        input.seek(index74_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1()) ) {s = 2;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_3 = input.LA(1);

                         
                        int index74_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_1()) ) {s = 2;}

                         
                        input.seek(index74_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_7 = input.LA(1);

                         
                        int index74_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) {s = 136;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 9;}

                         
                        input.seek(index74_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_8 = input.LA(1);

                         
                        int index74_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 1) ) {s = 136;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_1(), 2) ) {s = 9;}

                         
                        input.seek(index74_8);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\16\uffff";
    static final String dfa_23s = "\2\uffff\4\15\10\uffff";
    static final String dfa_24s = "\1\4\1\uffff\4\u00a4\10\uffff";
    static final String dfa_25s = "\1\u00b2\1\uffff\4\u00b5\10\uffff";
    static final String dfa_26s = "\1\uffff\1\1\4\uffff\1\2\7\1";
    static final String dfa_27s = "\16\uffff}>";
    static final String[] dfa_28s = {
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

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "2853:3: (this_Action_1= ruleAction | this_Script_2= ruleScript )";
        }
    }
    static final String dfa_29s = "\1\4\1\uffff\4\4\10\uffff";
    static final String[] dfa_30s = {
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
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_22;
            this.eof = dfa_22;
            this.min = dfa_29;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "3077:6: (lv_subSteps_8_1= ruleAction | lv_subSteps_8_2= ruleScript )";
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = dfa_22;
            this.eof = dfa_22;
            this.min = dfa_29;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "3237:6: (lv_subSteps_7_1= ruleAction | lv_subSteps_7_2= ruleScript )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8806000400000102L,0x00400200290080C4L,0x0002000004015800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8806000400000102L,0x00400200290080C4L,0x0002000004015804L});
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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8806000400000102L,0x004006002B0080C4L,0x0003000004015800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0024000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x8806000400000102L,0x004002002B0080C4L,0x0003000004015800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0025F84000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000400010000000L,0x0000100000400400L,0x0002000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8806000400000102L,0x00400200290080C4L,0x0003004004015800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0802000000000000L,0x0040000001000040L,0x0000000000004800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0026004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0006084000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004084000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0024F80000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004084000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000024000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0026004000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0100080000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0280008000000002L,0x0000000000000004L,0x0001000000010800L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x028000A000000002L,0x0000000000000004L,0x0001000000010800L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0027F80000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0280008000000002L,0x0000040002000004L,0x0003000000010800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0280008000000002L,0x0000000002000004L,0x0003000000010800L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0280008000000002L,0x0000000000000004L,0x0001004000010800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0280008000000002L,0x0000000000000004L,0x0005000000010800L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xF7F2BF7FEFFFFFD0L,0xF6FF67FDFDBFBABDL,0x0007008F8DFBB53FL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xF7F2BF7FEFFFFFD0L,0xF6FF67FDFDBFBABDL,0x0007000F8DFBB53FL});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xF7F2BF7FEFFFFFD2L,0xF6FF67FDFDBFBABDL,0x0007000F8DFBB53FL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004010000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000022000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0xF7F2BF7FEFFFFFD0L,0xF6FF67FDFDBFBABDL,0x0006000F8DFBB53FL});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0025F90000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xF7F2BF7FEFFFFFD0L,0xF6FF67FDFDBFBABDL,0x0004000F8DFBB53FL});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xF7FBBF7FEFFFFFD0L,0xF6FF67FFFDBFBBBDL,0x0004000F8DFFB73FL});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0024FC1000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xF7FBBF7FEFFFFFD0L,0xF6FF67FFFDBFBBBDL,0x0006000F8DFFB73FL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0025F80000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0065F94000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000062000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004280000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0024FA0000000000L});

}
